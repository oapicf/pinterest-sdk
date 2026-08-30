#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "carting_product.h"



static carting_product_t *carting_product_create_internal(
    char *carting_product_id,
    int *display_preferred_retailers_only,
    int *display_product_price,
    list_t *preferred_retailers,
    int *randomize_preferred_retailers
    ) {
    carting_product_t *carting_product_local_var = malloc(sizeof(carting_product_t));
    if (!carting_product_local_var) {
        return NULL;
    }
    memset(carting_product_local_var, 0, sizeof(carting_product_t));
    carting_product_local_var->_library_owned = 1;
    carting_product_local_var->carting_product_id = carting_product_id;
    carting_product_local_var->display_preferred_retailers_only = display_preferred_retailers_only;
    carting_product_local_var->display_product_price = display_product_price;
    carting_product_local_var->preferred_retailers = preferred_retailers;
    carting_product_local_var->randomize_preferred_retailers = randomize_preferred_retailers;
    return carting_product_local_var;
}

__attribute__((deprecated)) carting_product_t *carting_product_create(
    char *carting_product_id,
    int *display_preferred_retailers_only,
    int *display_product_price,
    list_t *preferred_retailers,
    int *randomize_preferred_retailers
    ) {
    int *display_preferred_retailers_only_copy = NULL;
    if (display_preferred_retailers_only) {
        display_preferred_retailers_only_copy = malloc(sizeof(int));
        if (display_preferred_retailers_only_copy) *display_preferred_retailers_only_copy = *display_preferred_retailers_only;
    }
    int *display_product_price_copy = NULL;
    if (display_product_price) {
        display_product_price_copy = malloc(sizeof(int));
        if (display_product_price_copy) *display_product_price_copy = *display_product_price;
    }
    int *randomize_preferred_retailers_copy = NULL;
    if (randomize_preferred_retailers) {
        randomize_preferred_retailers_copy = malloc(sizeof(int));
        if (randomize_preferred_retailers_copy) *randomize_preferred_retailers_copy = *randomize_preferred_retailers;
    }
    carting_product_t *result = carting_product_create_internal (
        carting_product_id,
        display_preferred_retailers_only_copy,
        display_product_price_copy,
        preferred_retailers,
        randomize_preferred_retailers_copy
        );
    if (!result) {
        free(display_preferred_retailers_only_copy);
        free(display_product_price_copy);
        free(randomize_preferred_retailers_copy);
    }
    return result;
}

void carting_product_free(carting_product_t *carting_product) {
    if(NULL == carting_product){
        return ;
    }
    if(carting_product->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "carting_product_free");
        return ;
    }
    listEntry_t *listEntry;
    if (carting_product->carting_product_id) {
        free(carting_product->carting_product_id);
        carting_product->carting_product_id = NULL;
    }
    if (carting_product->display_preferred_retailers_only) {
        free(carting_product->display_preferred_retailers_only);
        carting_product->display_preferred_retailers_only = NULL;
    }
    if (carting_product->display_product_price) {
        free(carting_product->display_product_price);
        carting_product->display_product_price = NULL;
    }
    if (carting_product->preferred_retailers) {
        list_ForEach(listEntry, carting_product->preferred_retailers) {
            carting_retailer_free(listEntry->data);
        }
        list_freeList(carting_product->preferred_retailers);
        carting_product->preferred_retailers = NULL;
    }
    if (carting_product->randomize_preferred_retailers) {
        free(carting_product->randomize_preferred_retailers);
        carting_product->randomize_preferred_retailers = NULL;
    }
    free(carting_product);
}

cJSON *carting_product_convertToJSON(carting_product_t *carting_product) {
    cJSON *item = cJSON_CreateObject();

    // carting_product->carting_product_id
    if (!carting_product->carting_product_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "carting_product_id", carting_product->carting_product_id) == NULL) {
    goto fail; //String
    }


    // carting_product->display_preferred_retailers_only
    if(carting_product->display_preferred_retailers_only) {
    if(cJSON_AddBoolToObject(item, "display_preferred_retailers_only", *carting_product->display_preferred_retailers_only) == NULL) {
    goto fail; //Bool
    }
    }


    // carting_product->display_product_price
    if(carting_product->display_product_price) {
    if(cJSON_AddBoolToObject(item, "display_product_price", *carting_product->display_product_price) == NULL) {
    goto fail; //Bool
    }
    }


    // carting_product->preferred_retailers
    if(carting_product->preferred_retailers) {
    cJSON *preferred_retailers = cJSON_AddArrayToObject(item, "preferred_retailers");
    if(preferred_retailers == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *preferred_retailersListEntry;
    if (carting_product->preferred_retailers) {
    list_ForEach(preferred_retailersListEntry, carting_product->preferred_retailers) {
    cJSON *itemLocal = carting_retailer_convertToJSON(preferred_retailersListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(preferred_retailers, itemLocal);
    }
    }
    }


    // carting_product->randomize_preferred_retailers
    if(carting_product->randomize_preferred_retailers) {
    if(cJSON_AddBoolToObject(item, "randomize_preferred_retailers", *carting_product->randomize_preferred_retailers) == NULL) {
    goto fail; //Bool
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

carting_product_t *carting_product_parseFromJSON(cJSON *carting_productJSON){

    carting_product_t *carting_product_local_var = NULL;

    char *carting_product_id_local_str = NULL;

    // define the local variable for carting_product->display_preferred_retailers_only
    int *display_preferred_retailers_only_local_var = NULL;

    // define the local variable for carting_product->display_product_price
    int *display_product_price_local_var = NULL;

    // define the local list for carting_product->preferred_retailers
    list_t *preferred_retailersList = NULL;

    // define the local variable for carting_product->randomize_preferred_retailers
    int *randomize_preferred_retailers_local_var = NULL;

    // carting_product->carting_product_id
    cJSON *carting_product_id = cJSON_GetObjectItemCaseSensitive(carting_productJSON, "carting_product_id");
    if (cJSON_IsNull(carting_product_id)) {
        carting_product_id = NULL;
    }
    if (!carting_product_id) {
        goto end;
    }

    
    if(!cJSON_IsString(carting_product_id))
    {
    goto end; //String
    }

    // carting_product->display_preferred_retailers_only
    cJSON *display_preferred_retailers_only = cJSON_GetObjectItemCaseSensitive(carting_productJSON, "display_preferred_retailers_only");
    if (cJSON_IsNull(display_preferred_retailers_only)) {
        display_preferred_retailers_only = NULL;
    }
    if (display_preferred_retailers_only) { 
    if(!cJSON_IsBool(display_preferred_retailers_only))
    {
    goto end; //Bool
    }
    display_preferred_retailers_only_local_var = malloc(sizeof(int));
    if(!display_preferred_retailers_only_local_var)
    {
        goto end;
    }
    *display_preferred_retailers_only_local_var = display_preferred_retailers_only->valueint;
    }

    // carting_product->display_product_price
    cJSON *display_product_price = cJSON_GetObjectItemCaseSensitive(carting_productJSON, "display_product_price");
    if (cJSON_IsNull(display_product_price)) {
        display_product_price = NULL;
    }
    if (display_product_price) { 
    if(!cJSON_IsBool(display_product_price))
    {
    goto end; //Bool
    }
    display_product_price_local_var = malloc(sizeof(int));
    if(!display_product_price_local_var)
    {
        goto end;
    }
    *display_product_price_local_var = display_product_price->valueint;
    }

    // carting_product->preferred_retailers
    cJSON *preferred_retailers = cJSON_GetObjectItemCaseSensitive(carting_productJSON, "preferred_retailers");
    if (cJSON_IsNull(preferred_retailers)) {
        preferred_retailers = NULL;
    }
    if (preferred_retailers) { 
    cJSON *preferred_retailers_local_nonprimitive = NULL;
    if(!cJSON_IsArray(preferred_retailers)){
        goto end; //nonprimitive container
    }

    preferred_retailersList = list_createList();

    cJSON_ArrayForEach(preferred_retailers_local_nonprimitive,preferred_retailers )
    {
        if(!cJSON_IsObject(preferred_retailers_local_nonprimitive)){
            goto end;
        }
        carting_retailer_t *preferred_retailersItem = carting_retailer_parseFromJSON(preferred_retailers_local_nonprimitive);

        list_addElement(preferred_retailersList, preferred_retailersItem);
    }
    }

    // carting_product->randomize_preferred_retailers
    cJSON *randomize_preferred_retailers = cJSON_GetObjectItemCaseSensitive(carting_productJSON, "randomize_preferred_retailers");
    if (cJSON_IsNull(randomize_preferred_retailers)) {
        randomize_preferred_retailers = NULL;
    }
    if (randomize_preferred_retailers) { 
    if(!cJSON_IsBool(randomize_preferred_retailers))
    {
    goto end; //Bool
    }
    randomize_preferred_retailers_local_var = malloc(sizeof(int));
    if(!randomize_preferred_retailers_local_var)
    {
        goto end;
    }
    *randomize_preferred_retailers_local_var = randomize_preferred_retailers->valueint;
    }


    if (carting_product_id && !cJSON_IsNull(carting_product_id)) carting_product_id_local_str = strdup(carting_product_id->valuestring);

    carting_product_local_var = carting_product_create_internal (
        carting_product_id_local_str,
        display_preferred_retailers_only_local_var,
        display_product_price_local_var,
        preferred_retailers ? preferred_retailersList : NULL,
        randomize_preferred_retailers_local_var
        );

    if (!carting_product_local_var) {
        goto end;
    }

    return carting_product_local_var;
end:
    if (carting_product_id_local_str) {
        free(carting_product_id_local_str);
        carting_product_id_local_str = NULL;
    }
    if (display_preferred_retailers_only_local_var) {
        free(display_preferred_retailers_only_local_var);
        display_preferred_retailers_only_local_var = NULL;
    }
    if (display_product_price_local_var) {
        free(display_product_price_local_var);
        display_product_price_local_var = NULL;
    }
    if (preferred_retailersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, preferred_retailersList) {
            carting_retailer_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(preferred_retailersList);
        preferred_retailersList = NULL;
    }
    if (randomize_preferred_retailers_local_var) {
        free(randomize_preferred_retailers_local_var);
        randomize_preferred_retailers_local_var = NULL;
    }
    return NULL;

}
