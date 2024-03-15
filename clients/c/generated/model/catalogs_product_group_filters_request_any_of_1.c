#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_product_group_filters_request_any_of_1.h"



catalogs_product_group_filters_request_any_of_1_t *catalogs_product_group_filters_request_any_of_1_create(
    list_t *all_of
    ) {
    catalogs_product_group_filters_request_any_of_1_t *catalogs_product_group_filters_request_any_of_1_local_var = malloc(sizeof(catalogs_product_group_filters_request_any_of_1_t));
    if (!catalogs_product_group_filters_request_any_of_1_local_var) {
        return NULL;
    }
    catalogs_product_group_filters_request_any_of_1_local_var->all_of = all_of;

    return catalogs_product_group_filters_request_any_of_1_local_var;
}


void catalogs_product_group_filters_request_any_of_1_free(catalogs_product_group_filters_request_any_of_1_t *catalogs_product_group_filters_request_any_of_1) {
    if(NULL == catalogs_product_group_filters_request_any_of_1){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_product_group_filters_request_any_of_1->all_of) {
        list_ForEach(listEntry, catalogs_product_group_filters_request_any_of_1->all_of) {
            catalogs_product_group_filter_keys_free(listEntry->data);
        }
        list_freeList(catalogs_product_group_filters_request_any_of_1->all_of);
        catalogs_product_group_filters_request_any_of_1->all_of = NULL;
    }
    free(catalogs_product_group_filters_request_any_of_1);
}

cJSON *catalogs_product_group_filters_request_any_of_1_convertToJSON(catalogs_product_group_filters_request_any_of_1_t *catalogs_product_group_filters_request_any_of_1) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_product_group_filters_request_any_of_1->all_of
    if (!catalogs_product_group_filters_request_any_of_1->all_of) {
        goto fail;
    }
    cJSON *all_of = cJSON_AddArrayToObject(item, "all_of");
    if(all_of == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *all_ofListEntry;
    if (catalogs_product_group_filters_request_any_of_1->all_of) {
    list_ForEach(all_ofListEntry, catalogs_product_group_filters_request_any_of_1->all_of) {
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

catalogs_product_group_filters_request_any_of_1_t *catalogs_product_group_filters_request_any_of_1_parseFromJSON(cJSON *catalogs_product_group_filters_request_any_of_1JSON){

    catalogs_product_group_filters_request_any_of_1_t *catalogs_product_group_filters_request_any_of_1_local_var = NULL;

    // define the local list for catalogs_product_group_filters_request_any_of_1->all_of
    list_t *all_ofList = NULL;

    // catalogs_product_group_filters_request_any_of_1->all_of
    cJSON *all_of = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_filters_request_any_of_1JSON, "all_of");
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


    catalogs_product_group_filters_request_any_of_1_local_var = catalogs_product_group_filters_request_any_of_1_create (
        all_ofList
        );

    return catalogs_product_group_filters_request_any_of_1_local_var;
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
