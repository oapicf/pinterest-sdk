#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "product_group_promotions_update_with_required_body.h"



static product_group_promotions_update_with_required_body_t *product_group_promotions_update_with_required_body_create_internal(
    char *ad_group_id,
    list_t *product_group_promotion
    ) {
    product_group_promotions_update_with_required_body_t *product_group_promotions_update_with_required_body_local_var = malloc(sizeof(product_group_promotions_update_with_required_body_t));
    if (!product_group_promotions_update_with_required_body_local_var) {
        return NULL;
    }
    memset(product_group_promotions_update_with_required_body_local_var, 0, sizeof(product_group_promotions_update_with_required_body_t));
    product_group_promotions_update_with_required_body_local_var->_library_owned = 1;
    product_group_promotions_update_with_required_body_local_var->ad_group_id = ad_group_id;
    product_group_promotions_update_with_required_body_local_var->product_group_promotion = product_group_promotion;
    return product_group_promotions_update_with_required_body_local_var;
}

__attribute__((deprecated)) product_group_promotions_update_with_required_body_t *product_group_promotions_update_with_required_body_create(
    char *ad_group_id,
    list_t *product_group_promotion
    ) {
    product_group_promotions_update_with_required_body_t *result = product_group_promotions_update_with_required_body_create_internal (
        ad_group_id,
        product_group_promotion
        );
    if (!result) {
    }
    return result;
}

void product_group_promotions_update_with_required_body_free(product_group_promotions_update_with_required_body_t *product_group_promotions_update_with_required_body) {
    if(NULL == product_group_promotions_update_with_required_body){
        return ;
    }
    if(product_group_promotions_update_with_required_body->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "product_group_promotions_update_with_required_body_free");
        return ;
    }
    listEntry_t *listEntry;
    if (product_group_promotions_update_with_required_body->ad_group_id) {
        free(product_group_promotions_update_with_required_body->ad_group_id);
        product_group_promotions_update_with_required_body->ad_group_id = NULL;
    }
    if (product_group_promotions_update_with_required_body->product_group_promotion) {
        list_ForEach(listEntry, product_group_promotions_update_with_required_body->product_group_promotion) {
            product_group_promotion_free(listEntry->data);
        }
        list_freeList(product_group_promotions_update_with_required_body->product_group_promotion);
        product_group_promotions_update_with_required_body->product_group_promotion = NULL;
    }
    free(product_group_promotions_update_with_required_body);
}

cJSON *product_group_promotions_update_with_required_body_convertToJSON(product_group_promotions_update_with_required_body_t *product_group_promotions_update_with_required_body) {
    cJSON *item = cJSON_CreateObject();

    // product_group_promotions_update_with_required_body->ad_group_id
    if (!product_group_promotions_update_with_required_body->ad_group_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "ad_group_id", product_group_promotions_update_with_required_body->ad_group_id) == NULL) {
    goto fail; //String
    }


    // product_group_promotions_update_with_required_body->product_group_promotion
    if (!product_group_promotions_update_with_required_body->product_group_promotion) {
        goto fail;
    }
    cJSON *product_group_promotion = cJSON_AddArrayToObject(item, "product_group_promotion");
    if(product_group_promotion == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *product_group_promotionListEntry;
    if (product_group_promotions_update_with_required_body->product_group_promotion) {
    list_ForEach(product_group_promotionListEntry, product_group_promotions_update_with_required_body->product_group_promotion) {
    cJSON *itemLocal = product_group_promotion_convertToJSON(product_group_promotionListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(product_group_promotion, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

product_group_promotions_update_with_required_body_t *product_group_promotions_update_with_required_body_parseFromJSON(cJSON *product_group_promotions_update_with_required_bodyJSON){

    product_group_promotions_update_with_required_body_t *product_group_promotions_update_with_required_body_local_var = NULL;

    char *ad_group_id_local_str = NULL;

    // define the local list for product_group_promotions_update_with_required_body->product_group_promotion
    list_t *product_group_promotionList = NULL;

    // product_group_promotions_update_with_required_body->ad_group_id
    cJSON *ad_group_id = cJSON_GetObjectItemCaseSensitive(product_group_promotions_update_with_required_bodyJSON, "ad_group_id");
    if (cJSON_IsNull(ad_group_id)) {
        ad_group_id = NULL;
    }
    if (!ad_group_id) {
        goto end;
    }

    
    if(!cJSON_IsString(ad_group_id))
    {
    goto end; //String
    }

    // product_group_promotions_update_with_required_body->product_group_promotion
    cJSON *product_group_promotion = cJSON_GetObjectItemCaseSensitive(product_group_promotions_update_with_required_bodyJSON, "product_group_promotion");
    if (cJSON_IsNull(product_group_promotion)) {
        product_group_promotion = NULL;
    }
    if (!product_group_promotion) {
        goto end;
    }

    
    cJSON *product_group_promotion_local_nonprimitive = NULL;
    if(!cJSON_IsArray(product_group_promotion)){
        goto end; //nonprimitive container
    }

    product_group_promotionList = list_createList();

    cJSON_ArrayForEach(product_group_promotion_local_nonprimitive,product_group_promotion )
    {
        if(!cJSON_IsObject(product_group_promotion_local_nonprimitive)){
            goto end;
        }
        product_group_promotion_t *product_group_promotionItem = product_group_promotion_parseFromJSON(product_group_promotion_local_nonprimitive);

        list_addElement(product_group_promotionList, product_group_promotionItem);
    }


    if (ad_group_id && !cJSON_IsNull(ad_group_id)) ad_group_id_local_str = strdup(ad_group_id->valuestring);

    product_group_promotions_update_with_required_body_local_var = product_group_promotions_update_with_required_body_create_internal (
        ad_group_id_local_str,
        product_group_promotionList
        );

    if (!product_group_promotions_update_with_required_body_local_var) {
        goto end;
    }

    return product_group_promotions_update_with_required_body_local_var;
end:
    if (ad_group_id_local_str) {
        free(ad_group_id_local_str);
        ad_group_id_local_str = NULL;
    }
    if (product_group_promotionList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, product_group_promotionList) {
            product_group_promotion_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(product_group_promotionList);
        product_group_promotionList = NULL;
    }
    return NULL;

}
