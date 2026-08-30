#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "promotions_response.h"



static promotions_response_t *promotions_response_create_internal(
    list_t *promotions
    ) {
    promotions_response_t *promotions_response_local_var = malloc(sizeof(promotions_response_t));
    if (!promotions_response_local_var) {
        return NULL;
    }
    memset(promotions_response_local_var, 0, sizeof(promotions_response_t));
    promotions_response_local_var->_library_owned = 1;
    promotions_response_local_var->promotions = promotions;
    return promotions_response_local_var;
}

__attribute__((deprecated)) promotions_response_t *promotions_response_create(
    list_t *promotions
    ) {
    promotions_response_t *result = promotions_response_create_internal (
        promotions
        );
    if (!result) {
    }
    return result;
}

void promotions_response_free(promotions_response_t *promotions_response) {
    if(NULL == promotions_response){
        return ;
    }
    if(promotions_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "promotions_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (promotions_response->promotions) {
        list_ForEach(listEntry, promotions_response->promotions) {
            promotion_array_element_free(listEntry->data);
        }
        list_freeList(promotions_response->promotions);
        promotions_response->promotions = NULL;
    }
    free(promotions_response);
}

cJSON *promotions_response_convertToJSON(promotions_response_t *promotions_response) {
    cJSON *item = cJSON_CreateObject();

    // promotions_response->promotions
    if(promotions_response->promotions) {
    cJSON *promotions = cJSON_AddArrayToObject(item, "promotions");
    if(promotions == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *promotionsListEntry;
    if (promotions_response->promotions) {
    list_ForEach(promotionsListEntry, promotions_response->promotions) {
    cJSON *itemLocal = promotion_array_element_convertToJSON(promotionsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(promotions, itemLocal);
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

promotions_response_t *promotions_response_parseFromJSON(cJSON *promotions_responseJSON){

    promotions_response_t *promotions_response_local_var = NULL;

    // define the local list for promotions_response->promotions
    list_t *promotionsList = NULL;

    // promotions_response->promotions
    cJSON *promotions = cJSON_GetObjectItemCaseSensitive(promotions_responseJSON, "promotions");
    if (cJSON_IsNull(promotions)) {
        promotions = NULL;
    }
    if (promotions) { 
    cJSON *promotions_local_nonprimitive = NULL;
    if(!cJSON_IsArray(promotions)){
        goto end; //nonprimitive container
    }

    promotionsList = list_createList();

    cJSON_ArrayForEach(promotions_local_nonprimitive,promotions )
    {
        if(!cJSON_IsObject(promotions_local_nonprimitive)){
            goto end;
        }
        promotion_array_element_t *promotionsItem = promotion_array_element_parseFromJSON(promotions_local_nonprimitive);

        list_addElement(promotionsList, promotionsItem);
    }
    }



    promotions_response_local_var = promotions_response_create_internal (
        promotions ? promotionsList : NULL
        );

    if (!promotions_response_local_var) {
        goto end;
    }

    return promotions_response_local_var;
end:
    if (promotionsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, promotionsList) {
            promotion_array_element_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(promotionsList);
        promotionsList = NULL;
    }
    return NULL;

}
