#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "bid_floor_create.h"



static bid_floor_create_t *bid_floor_create_create_internal(
    list_t *bid_floor_specs,
    targeting_spec_optimal_t *targeting_spec
    ) {
    bid_floor_create_t *bid_floor_create_local_var = malloc(sizeof(bid_floor_create_t));
    if (!bid_floor_create_local_var) {
        return NULL;
    }
    memset(bid_floor_create_local_var, 0, sizeof(bid_floor_create_t));
    bid_floor_create_local_var->_library_owned = 1;
    bid_floor_create_local_var->bid_floor_specs = bid_floor_specs;
    bid_floor_create_local_var->targeting_spec = targeting_spec;
    return bid_floor_create_local_var;
}

__attribute__((deprecated)) bid_floor_create_t *bid_floor_create_create(
    list_t *bid_floor_specs,
    targeting_spec_optimal_t *targeting_spec
    ) {
    bid_floor_create_t *result = bid_floor_create_create_internal (
        bid_floor_specs,
        targeting_spec
        );
    if (!result) {
    }
    return result;
}

void bid_floor_create_free(bid_floor_create_t *bid_floor_create) {
    if(NULL == bid_floor_create){
        return ;
    }
    if(bid_floor_create->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "bid_floor_create_free");
        return ;
    }
    listEntry_t *listEntry;
    if (bid_floor_create->bid_floor_specs) {
        list_ForEach(listEntry, bid_floor_create->bid_floor_specs) {
            bid_floor_spec_free(listEntry->data);
        }
        list_freeList(bid_floor_create->bid_floor_specs);
        bid_floor_create->bid_floor_specs = NULL;
    }
    if (bid_floor_create->targeting_spec) {
        targeting_spec_optimal_free(bid_floor_create->targeting_spec);
        bid_floor_create->targeting_spec = NULL;
    }
    free(bid_floor_create);
}

cJSON *bid_floor_create_convertToJSON(bid_floor_create_t *bid_floor_create) {
    cJSON *item = cJSON_CreateObject();

    // bid_floor_create->bid_floor_specs
    if (!bid_floor_create->bid_floor_specs) {
        goto fail;
    }
    cJSON *bid_floor_specs = cJSON_AddArrayToObject(item, "bid_floor_specs");
    if(bid_floor_specs == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *bid_floor_specsListEntry;
    if (bid_floor_create->bid_floor_specs) {
    list_ForEach(bid_floor_specsListEntry, bid_floor_create->bid_floor_specs) {
    cJSON *itemLocal = bid_floor_spec_convertToJSON(bid_floor_specsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(bid_floor_specs, itemLocal);
    }
    }


    // bid_floor_create->targeting_spec
    if(bid_floor_create->targeting_spec) {
    cJSON *targeting_spec_local_JSON = targeting_spec_optimal_convertToJSON(bid_floor_create->targeting_spec);
    if(targeting_spec_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "targeting_spec", targeting_spec_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

bid_floor_create_t *bid_floor_create_parseFromJSON(cJSON *bid_floor_createJSON){

    bid_floor_create_t *bid_floor_create_local_var = NULL;

    // define the local list for bid_floor_create->bid_floor_specs
    list_t *bid_floor_specsList = NULL;

    // define the local variable for bid_floor_create->targeting_spec
    targeting_spec_optimal_t *targeting_spec_local_nonprim = NULL;

    // bid_floor_create->bid_floor_specs
    cJSON *bid_floor_specs = cJSON_GetObjectItemCaseSensitive(bid_floor_createJSON, "bid_floor_specs");
    if (cJSON_IsNull(bid_floor_specs)) {
        bid_floor_specs = NULL;
    }
    if (!bid_floor_specs) {
        goto end;
    }

    
    cJSON *bid_floor_specs_local_nonprimitive = NULL;
    if(!cJSON_IsArray(bid_floor_specs)){
        goto end; //nonprimitive container
    }

    bid_floor_specsList = list_createList();

    cJSON_ArrayForEach(bid_floor_specs_local_nonprimitive,bid_floor_specs )
    {
        if(!cJSON_IsObject(bid_floor_specs_local_nonprimitive)){
            goto end;
        }
        bid_floor_spec_t *bid_floor_specsItem = bid_floor_spec_parseFromJSON(bid_floor_specs_local_nonprimitive);

        list_addElement(bid_floor_specsList, bid_floor_specsItem);
    }

    // bid_floor_create->targeting_spec
    cJSON *targeting_spec = cJSON_GetObjectItemCaseSensitive(bid_floor_createJSON, "targeting_spec");
    if (cJSON_IsNull(targeting_spec)) {
        targeting_spec = NULL;
    }
    if (targeting_spec) { 
    targeting_spec_local_nonprim = targeting_spec_optimal_parseFromJSON(targeting_spec); //nonprimitive
    }



    bid_floor_create_local_var = bid_floor_create_create_internal (
        bid_floor_specsList,
        targeting_spec ? targeting_spec_local_nonprim : NULL
        );

    if (!bid_floor_create_local_var) {
        goto end;
    }

    return bid_floor_create_local_var;
end:
    if (bid_floor_specsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, bid_floor_specsList) {
            bid_floor_spec_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(bid_floor_specsList);
        bid_floor_specsList = NULL;
    }
    if (targeting_spec_local_nonprim) {
        targeting_spec_optimal_free(targeting_spec_local_nonprim);
        targeting_spec_local_nonprim = NULL;
    }
    return NULL;

}
