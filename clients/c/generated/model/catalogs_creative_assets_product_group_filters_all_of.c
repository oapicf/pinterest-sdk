#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_creative_assets_product_group_filters_all_of.h"



catalogs_creative_assets_product_group_filters_all_of_t *catalogs_creative_assets_product_group_filters_all_of_create(
    list_t *all_of
    ) {
    catalogs_creative_assets_product_group_filters_all_of_t *catalogs_creative_assets_product_group_filters_all_of_local_var = malloc(sizeof(catalogs_creative_assets_product_group_filters_all_of_t));
    if (!catalogs_creative_assets_product_group_filters_all_of_local_var) {
        return NULL;
    }
    catalogs_creative_assets_product_group_filters_all_of_local_var->all_of = all_of;

    return catalogs_creative_assets_product_group_filters_all_of_local_var;
}


void catalogs_creative_assets_product_group_filters_all_of_free(catalogs_creative_assets_product_group_filters_all_of_t *catalogs_creative_assets_product_group_filters_all_of) {
    if(NULL == catalogs_creative_assets_product_group_filters_all_of){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_creative_assets_product_group_filters_all_of->all_of) {
        list_ForEach(listEntry, catalogs_creative_assets_product_group_filters_all_of->all_of) {
            catalogs_creative_assets_product_group_filter_keys_free(listEntry->data);
        }
        list_freeList(catalogs_creative_assets_product_group_filters_all_of->all_of);
        catalogs_creative_assets_product_group_filters_all_of->all_of = NULL;
    }
    free(catalogs_creative_assets_product_group_filters_all_of);
}

cJSON *catalogs_creative_assets_product_group_filters_all_of_convertToJSON(catalogs_creative_assets_product_group_filters_all_of_t *catalogs_creative_assets_product_group_filters_all_of) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_creative_assets_product_group_filters_all_of->all_of
    if (!catalogs_creative_assets_product_group_filters_all_of->all_of) {
        goto fail;
    }
    cJSON *all_of = cJSON_AddArrayToObject(item, "all_of");
    if(all_of == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *all_ofListEntry;
    if (catalogs_creative_assets_product_group_filters_all_of->all_of) {
    list_ForEach(all_ofListEntry, catalogs_creative_assets_product_group_filters_all_of->all_of) {
    cJSON *itemLocal = catalogs_creative_assets_product_group_filter_keys_convertToJSON(all_ofListEntry->data);
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

catalogs_creative_assets_product_group_filters_all_of_t *catalogs_creative_assets_product_group_filters_all_of_parseFromJSON(cJSON *catalogs_creative_assets_product_group_filters_all_ofJSON){

    catalogs_creative_assets_product_group_filters_all_of_t *catalogs_creative_assets_product_group_filters_all_of_local_var = NULL;

    // define the local list for catalogs_creative_assets_product_group_filters_all_of->all_of
    list_t *all_ofList = NULL;

    // catalogs_creative_assets_product_group_filters_all_of->all_of
    cJSON *all_of = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_group_filters_all_ofJSON, "all_of");
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
        catalogs_creative_assets_product_group_filter_keys_t *all_ofItem = catalogs_creative_assets_product_group_filter_keys_parseFromJSON(all_of_local_nonprimitive);

        list_addElement(all_ofList, all_ofItem);
    }


    catalogs_creative_assets_product_group_filters_all_of_local_var = catalogs_creative_assets_product_group_filters_all_of_create (
        all_ofList
        );

    return catalogs_creative_assets_product_group_filters_all_of_local_var;
end:
    if (all_ofList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, all_ofList) {
            catalogs_creative_assets_product_group_filter_keys_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(all_ofList);
        all_ofList = NULL;
    }
    return NULL;

}
