#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "product_tags_response.h"



static product_tags_response_t *product_tags_response_create_internal(
    list_t *product_tags
    ) {
    product_tags_response_t *product_tags_response_local_var = malloc(sizeof(product_tags_response_t));
    if (!product_tags_response_local_var) {
        return NULL;
    }
    memset(product_tags_response_local_var, 0, sizeof(product_tags_response_t));
    product_tags_response_local_var->_library_owned = 1;
    product_tags_response_local_var->product_tags = product_tags;
    return product_tags_response_local_var;
}

__attribute__((deprecated)) product_tags_response_t *product_tags_response_create(
    list_t *product_tags
    ) {
    product_tags_response_t *result = product_tags_response_create_internal (
        product_tags
        );
    if (!result) {
    }
    return result;
}

void product_tags_response_free(product_tags_response_t *product_tags_response) {
    if(NULL == product_tags_response){
        return ;
    }
    if(product_tags_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "product_tags_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (product_tags_response->product_tags) {
        list_ForEach(listEntry, product_tags_response->product_tags) {
            product_tag_item_free(listEntry->data);
        }
        list_freeList(product_tags_response->product_tags);
        product_tags_response->product_tags = NULL;
    }
    free(product_tags_response);
}

cJSON *product_tags_response_convertToJSON(product_tags_response_t *product_tags_response) {
    cJSON *item = cJSON_CreateObject();

    // product_tags_response->product_tags
    if (!product_tags_response->product_tags) {
        goto fail;
    }
    cJSON *product_tags = cJSON_AddArrayToObject(item, "product_tags");
    if(product_tags == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *product_tagsListEntry;
    if (product_tags_response->product_tags) {
    list_ForEach(product_tagsListEntry, product_tags_response->product_tags) {
    cJSON *itemLocal = product_tag_item_convertToJSON(product_tagsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(product_tags, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

product_tags_response_t *product_tags_response_parseFromJSON(cJSON *product_tags_responseJSON){

    product_tags_response_t *product_tags_response_local_var = NULL;

    // define the local list for product_tags_response->product_tags
    list_t *product_tagsList = NULL;

    // product_tags_response->product_tags
    cJSON *product_tags = cJSON_GetObjectItemCaseSensitive(product_tags_responseJSON, "product_tags");
    if (cJSON_IsNull(product_tags)) {
        product_tags = NULL;
    }
    if (!product_tags) {
        goto end;
    }

    
    cJSON *product_tags_local_nonprimitive = NULL;
    if(!cJSON_IsArray(product_tags)){
        goto end; //nonprimitive container
    }

    product_tagsList = list_createList();

    cJSON_ArrayForEach(product_tags_local_nonprimitive,product_tags )
    {
        if(!cJSON_IsObject(product_tags_local_nonprimitive)){
            goto end;
        }
        product_tag_item_t *product_tagsItem = product_tag_item_parseFromJSON(product_tags_local_nonprimitive);

        list_addElement(product_tagsList, product_tagsItem);
    }



    product_tags_response_local_var = product_tags_response_create_internal (
        product_tagsList
        );

    if (!product_tags_response_local_var) {
        goto end;
    }

    return product_tags_response_local_var;
end:
    if (product_tagsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, product_tagsList) {
            product_tag_item_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(product_tagsList);
        product_tagsList = NULL;
    }
    return NULL;

}
