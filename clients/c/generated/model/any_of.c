#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "any_of.h"



static any_of_t *any_of_create_internal(
    list_t *any_of
    ) {
    any_of_t *any_of_local_var = malloc(sizeof(any_of_t));
    if (!any_of_local_var) {
        return NULL;
    }
    any_of_local_var->any_of = any_of;

    any_of_local_var->_library_owned = 1;
    return any_of_local_var;
}

__attribute__((deprecated)) any_of_t *any_of_create(
    list_t *any_of
    ) {
    return any_of_create_internal (
        any_of
        );
}

void any_of_free(any_of_t *any_of) {
    if(NULL == any_of){
        return ;
    }
    if(any_of->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "any_of_free");
        return ;
    }
    listEntry_t *listEntry;
    if (any_of->any_of) {
        list_ForEach(listEntry, any_of->any_of) {
            catalogs_product_group_filter_keys_free(listEntry->data);
        }
        list_freeList(any_of->any_of);
        any_of->any_of = NULL;
    }
    free(any_of);
}

cJSON *any_of_convertToJSON(any_of_t *any_of) {
    cJSON *item = cJSON_CreateObject();

    // any_of->any_of
    if (!any_of->any_of) {
        goto fail;
    }
    cJSON *any_of = cJSON_AddArrayToObject(item, "any_of");
    if(any_of == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *any_ofListEntry;
    if (any_of->any_of) {
    list_ForEach(any_ofListEntry, any_of->any_of) {
    cJSON *itemLocal = catalogs_product_group_filter_keys_convertToJSON(any_ofListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(any_of, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

any_of_t *any_of_parseFromJSON(cJSON *any_ofJSON){

    any_of_t *any_of_local_var = NULL;

    // define the local list for any_of->any_of
    list_t *any_ofList = NULL;

    // any_of->any_of
    cJSON *any_of = cJSON_GetObjectItemCaseSensitive(any_ofJSON, "any_of");
    if (cJSON_IsNull(any_of)) {
        any_of = NULL;
    }
    if (!any_of) {
        goto end;
    }

    
    cJSON *any_of_local_nonprimitive = NULL;
    if(!cJSON_IsArray(any_of)){
        goto end; //nonprimitive container
    }

    any_ofList = list_createList();

    cJSON_ArrayForEach(any_of_local_nonprimitive,any_of )
    {
        if(!cJSON_IsObject(any_of_local_nonprimitive)){
            goto end;
        }
        catalogs_product_group_filter_keys_t *any_ofItem = catalogs_product_group_filter_keys_parseFromJSON(any_of_local_nonprimitive);

        list_addElement(any_ofList, any_ofItem);
    }


    any_of_local_var = any_of_create_internal (
        any_ofList
        );

    return any_of_local_var;
end:
    if (any_ofList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, any_ofList) {
            catalogs_product_group_filter_keys_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(any_ofList);
        any_ofList = NULL;
    }
    return NULL;

}
