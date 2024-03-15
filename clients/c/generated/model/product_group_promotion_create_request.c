#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "product_group_promotion_create_request.h"



product_group_promotion_create_request_t *product_group_promotion_create_request_create(
    char *ad_group_id,
    list_t *product_group_promotion
    ) {
    product_group_promotion_create_request_t *product_group_promotion_create_request_local_var = malloc(sizeof(product_group_promotion_create_request_t));
    if (!product_group_promotion_create_request_local_var) {
        return NULL;
    }
    product_group_promotion_create_request_local_var->ad_group_id = ad_group_id;
    product_group_promotion_create_request_local_var->product_group_promotion = product_group_promotion;

    return product_group_promotion_create_request_local_var;
}


void product_group_promotion_create_request_free(product_group_promotion_create_request_t *product_group_promotion_create_request) {
    if(NULL == product_group_promotion_create_request){
        return ;
    }
    listEntry_t *listEntry;
    if (product_group_promotion_create_request->ad_group_id) {
        free(product_group_promotion_create_request->ad_group_id);
        product_group_promotion_create_request->ad_group_id = NULL;
    }
    if (product_group_promotion_create_request->product_group_promotion) {
        list_ForEach(listEntry, product_group_promotion_create_request->product_group_promotion) {
            product_group_promotion_free(listEntry->data);
        }
        list_freeList(product_group_promotion_create_request->product_group_promotion);
        product_group_promotion_create_request->product_group_promotion = NULL;
    }
    free(product_group_promotion_create_request);
}

cJSON *product_group_promotion_create_request_convertToJSON(product_group_promotion_create_request_t *product_group_promotion_create_request) {
    cJSON *item = cJSON_CreateObject();

    // product_group_promotion_create_request->ad_group_id
    if (!product_group_promotion_create_request->ad_group_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "ad_group_id", product_group_promotion_create_request->ad_group_id) == NULL) {
    goto fail; //String
    }


    // product_group_promotion_create_request->product_group_promotion
    if (!product_group_promotion_create_request->product_group_promotion) {
        goto fail;
    }
    cJSON *product_group_promotion = cJSON_AddArrayToObject(item, "product_group_promotion");
    if(product_group_promotion == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *product_group_promotionListEntry;
    if (product_group_promotion_create_request->product_group_promotion) {
    list_ForEach(product_group_promotionListEntry, product_group_promotion_create_request->product_group_promotion) {
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

product_group_promotion_create_request_t *product_group_promotion_create_request_parseFromJSON(cJSON *product_group_promotion_create_requestJSON){

    product_group_promotion_create_request_t *product_group_promotion_create_request_local_var = NULL;

    // define the local list for product_group_promotion_create_request->product_group_promotion
    list_t *product_group_promotionList = NULL;

    // product_group_promotion_create_request->ad_group_id
    cJSON *ad_group_id = cJSON_GetObjectItemCaseSensitive(product_group_promotion_create_requestJSON, "ad_group_id");
    if (!ad_group_id) {
        goto end;
    }

    
    if(!cJSON_IsString(ad_group_id))
    {
    goto end; //String
    }

    // product_group_promotion_create_request->product_group_promotion
    cJSON *product_group_promotion = cJSON_GetObjectItemCaseSensitive(product_group_promotion_create_requestJSON, "product_group_promotion");
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


    product_group_promotion_create_request_local_var = product_group_promotion_create_request_create (
        strdup(ad_group_id->valuestring),
        product_group_promotionList
        );

    return product_group_promotion_create_request_local_var;
end:
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
