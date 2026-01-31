#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "all_of.h"



static all_of_t *all_of_create_internal(
    list_t *all_of
    ) {
    all_of_t *all_of_local_var = malloc(sizeof(all_of_t));
    if (!all_of_local_var) {
        return NULL;
    }
    all_of_local_var->all_of = all_of;

    all_of_local_var->_library_owned = 1;
    return all_of_local_var;
}

__attribute__((deprecated)) all_of_t *all_of_create(
    list_t *all_of
    ) {
    return all_of_create_internal (
        all_of
        );
}

void all_of_free(all_of_t *all_of) {
    if(NULL == all_of){
        return ;
    }
    if(all_of->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "all_of_free");
        return ;
    }
    listEntry_t *listEntry;
    if (all_of->all_of) {
        list_ForEach(listEntry, all_of->all_of) {
            catalogs_product_group_filter_keys_free(listEntry->data);
        }
        list_freeList(all_of->all_of);
        all_of->all_of = NULL;
    }
    free(all_of);
}

cJSON *all_of_convertToJSON(all_of_t *all_of) {
    cJSON *item = cJSON_CreateObject();

    // all_of->all_of
    if (!all_of->all_of) {
        goto fail;
    }
    cJSON *all_of = cJSON_AddArrayToObject(item, "all_of");
    if(all_of == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *all_ofListEntry;
    if (all_of->all_of) {
    list_ForEach(all_ofListEntry, all_of->all_of) {
    cJSON *itemLocal = catalogs_product_group_filter_keys_convertToJSON(all_ofListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(all_of, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

all_of_t *all_of_parseFromJSON(cJSON *all_ofJSON){

    all_of_t *all_of_local_var = NULL;

    // define the local list for all_of->all_of
    list_t *all_ofList = NULL;

    // all_of->all_of
    cJSON *all_of = cJSON_GetObjectItemCaseSensitive(all_ofJSON, "all_of");
    if (cJSON_IsNull(all_of)) {
        all_of = NULL;
    }
    if (!all_of) {
        goto end;
    }

    
    cJSON *all_of_local_nonprimitive = NULL;
    if(!cJSON_IsArray(all_of)){
        goto end; //nonprimitive container
    }

    all_ofList = list_createList();

    cJSON_ArrayForEach(all_of_local_nonprimitive,all_of )
    {
        if(!cJSON_IsObject(all_of_local_nonprimitive)){
            goto end;
        }
        catalogs_product_group_filter_keys_t *all_ofItem = catalogs_product_group_filter_keys_parseFromJSON(all_of_local_nonprimitive);

        list_addElement(all_ofList, all_ofItem);
    }


    all_of_local_var = all_of_create_internal (
        all_ofList
        );

    return all_of_local_var;
end:
    if (all_ofList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, all_ofList) {
            catalogs_product_group_filter_keys_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(all_ofList);
        all_ofList = NULL;
    }
    return NULL;

}
