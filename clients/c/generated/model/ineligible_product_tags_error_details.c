#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ineligible_product_tags_error_details.h"



static ineligible_product_tags_error_details_t *ineligible_product_tags_error_details_create_internal(
    list_t *product_tags
    ) {
    ineligible_product_tags_error_details_t *ineligible_product_tags_error_details_local_var = malloc(sizeof(ineligible_product_tags_error_details_t));
    if (!ineligible_product_tags_error_details_local_var) {
        return NULL;
    }
    memset(ineligible_product_tags_error_details_local_var, 0, sizeof(ineligible_product_tags_error_details_t));
    ineligible_product_tags_error_details_local_var->_library_owned = 1;
    ineligible_product_tags_error_details_local_var->product_tags = product_tags;
    return ineligible_product_tags_error_details_local_var;
}

__attribute__((deprecated)) ineligible_product_tags_error_details_t *ineligible_product_tags_error_details_create(
    list_t *product_tags
    ) {
    ineligible_product_tags_error_details_t *result = ineligible_product_tags_error_details_create_internal (
        product_tags
        );
    if (!result) {
    }
    return result;
}

void ineligible_product_tags_error_details_free(ineligible_product_tags_error_details_t *ineligible_product_tags_error_details) {
    if(NULL == ineligible_product_tags_error_details){
        return ;
    }
    if(ineligible_product_tags_error_details->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ineligible_product_tags_error_details_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ineligible_product_tags_error_details->product_tags) {
        list_ForEach(listEntry, ineligible_product_tags_error_details->product_tags) {
            ineligible_product_tag_error_item_free(listEntry->data);
        }
        list_freeList(ineligible_product_tags_error_details->product_tags);
        ineligible_product_tags_error_details->product_tags = NULL;
    }
    free(ineligible_product_tags_error_details);
}

cJSON *ineligible_product_tags_error_details_convertToJSON(ineligible_product_tags_error_details_t *ineligible_product_tags_error_details) {
    cJSON *item = cJSON_CreateObject();

    // ineligible_product_tags_error_details->product_tags
    if (!ineligible_product_tags_error_details->product_tags) {
        goto fail;
    }
    cJSON *product_tags = cJSON_AddArrayToObject(item, "product_tags");
    if(product_tags == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *product_tagsListEntry;
    if (ineligible_product_tags_error_details->product_tags) {
    list_ForEach(product_tagsListEntry, ineligible_product_tags_error_details->product_tags) {
    cJSON *itemLocal = ineligible_product_tag_error_item_convertToJSON(product_tagsListEntry->data);
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

ineligible_product_tags_error_details_t *ineligible_product_tags_error_details_parseFromJSON(cJSON *ineligible_product_tags_error_detailsJSON){

    ineligible_product_tags_error_details_t *ineligible_product_tags_error_details_local_var = NULL;

    // define the local list for ineligible_product_tags_error_details->product_tags
    list_t *product_tagsList = NULL;

    // ineligible_product_tags_error_details->product_tags
    cJSON *product_tags = cJSON_GetObjectItemCaseSensitive(ineligible_product_tags_error_detailsJSON, "product_tags");
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
        ineligible_product_tag_error_item_t *product_tagsItem = ineligible_product_tag_error_item_parseFromJSON(product_tags_local_nonprimitive);

        list_addElement(product_tagsList, product_tagsItem);
    }



    ineligible_product_tags_error_details_local_var = ineligible_product_tags_error_details_create_internal (
        product_tagsList
        );

    if (!ineligible_product_tags_error_details_local_var) {
        goto end;
    }

    return ineligible_product_tags_error_details_local_var;
end:
    if (product_tagsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, product_tagsList) {
            ineligible_product_tag_error_item_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(product_tagsList);
        product_tagsList = NULL;
    }
    return NULL;

}
