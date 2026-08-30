#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_group_update_request_all_of1.h"



static ad_group_update_request_all_of1_t *ad_group_update_request_all_of1_create_internal(
    double *bid_multiplier,
    char *id,
    list_t *targeting_spec_operations
    ) {
    ad_group_update_request_all_of1_t *ad_group_update_request_all_of1_local_var = malloc(sizeof(ad_group_update_request_all_of1_t));
    if (!ad_group_update_request_all_of1_local_var) {
        return NULL;
    }
    memset(ad_group_update_request_all_of1_local_var, 0, sizeof(ad_group_update_request_all_of1_t));
    ad_group_update_request_all_of1_local_var->_library_owned = 1;
    ad_group_update_request_all_of1_local_var->bid_multiplier = bid_multiplier;
    ad_group_update_request_all_of1_local_var->id = id;
    ad_group_update_request_all_of1_local_var->targeting_spec_operations = targeting_spec_operations;
    return ad_group_update_request_all_of1_local_var;
}

__attribute__((deprecated)) ad_group_update_request_all_of1_t *ad_group_update_request_all_of1_create(
    double *bid_multiplier,
    char *id,
    list_t *targeting_spec_operations
    ) {
    double *bid_multiplier_copy = NULL;
    if (bid_multiplier) {
        bid_multiplier_copy = malloc(sizeof(double));
        if (bid_multiplier_copy) *bid_multiplier_copy = *bid_multiplier;
    }
    ad_group_update_request_all_of1_t *result = ad_group_update_request_all_of1_create_internal (
        bid_multiplier_copy,
        id,
        targeting_spec_operations
        );
    if (!result) {
        free(bid_multiplier_copy);
    }
    return result;
}

void ad_group_update_request_all_of1_free(ad_group_update_request_all_of1_t *ad_group_update_request_all_of1) {
    if(NULL == ad_group_update_request_all_of1){
        return ;
    }
    if(ad_group_update_request_all_of1->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ad_group_update_request_all_of1_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ad_group_update_request_all_of1->bid_multiplier) {
        free(ad_group_update_request_all_of1->bid_multiplier);
        ad_group_update_request_all_of1->bid_multiplier = NULL;
    }
    if (ad_group_update_request_all_of1->id) {
        free(ad_group_update_request_all_of1->id);
        ad_group_update_request_all_of1->id = NULL;
    }
    if (ad_group_update_request_all_of1->targeting_spec_operations) {
        list_ForEach(listEntry, ad_group_update_request_all_of1->targeting_spec_operations) {
            targeting_spec_operations_free(listEntry->data);
        }
        list_freeList(ad_group_update_request_all_of1->targeting_spec_operations);
        ad_group_update_request_all_of1->targeting_spec_operations = NULL;
    }
    free(ad_group_update_request_all_of1);
}

cJSON *ad_group_update_request_all_of1_convertToJSON(ad_group_update_request_all_of1_t *ad_group_update_request_all_of1) {
    cJSON *item = cJSON_CreateObject();

    // ad_group_update_request_all_of1->bid_multiplier
    if(ad_group_update_request_all_of1->bid_multiplier) {
    if(cJSON_AddNumberToObject(item, "bid_multiplier", *ad_group_update_request_all_of1->bid_multiplier) == NULL) {
    goto fail; //Numeric
    }
    }


    // ad_group_update_request_all_of1->id
    if (!ad_group_update_request_all_of1->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", ad_group_update_request_all_of1->id) == NULL) {
    goto fail; //String
    }


    // ad_group_update_request_all_of1->targeting_spec_operations
    if(ad_group_update_request_all_of1->targeting_spec_operations) {
    cJSON *targeting_spec_operations = cJSON_AddArrayToObject(item, "targeting_spec_operations");
    if(targeting_spec_operations == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *targeting_spec_operationsListEntry;
    if (ad_group_update_request_all_of1->targeting_spec_operations) {
    list_ForEach(targeting_spec_operationsListEntry, ad_group_update_request_all_of1->targeting_spec_operations) {
    cJSON *itemLocal = targeting_spec_operations_convertToJSON(targeting_spec_operationsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(targeting_spec_operations, itemLocal);
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

ad_group_update_request_all_of1_t *ad_group_update_request_all_of1_parseFromJSON(cJSON *ad_group_update_request_all_of1JSON){

    ad_group_update_request_all_of1_t *ad_group_update_request_all_of1_local_var = NULL;

    // define the local variable for ad_group_update_request_all_of1->bid_multiplier
    double *bid_multiplier_local_var = NULL;

    char *id_local_str = NULL;

    // define the local list for ad_group_update_request_all_of1->targeting_spec_operations
    list_t *targeting_spec_operationsList = NULL;

    // ad_group_update_request_all_of1->bid_multiplier
    cJSON *bid_multiplier = cJSON_GetObjectItemCaseSensitive(ad_group_update_request_all_of1JSON, "bid_multiplier");
    if (cJSON_IsNull(bid_multiplier)) {
        bid_multiplier = NULL;
    }
    if (bid_multiplier) { 
    if(!cJSON_IsNumber(bid_multiplier))
    {
    goto end; //Numeric
    }
    bid_multiplier_local_var = malloc(sizeof(double));
    if(!bid_multiplier_local_var)
    {
        goto end;
    }
    *bid_multiplier_local_var = bid_multiplier->valuedouble;
    }

    // ad_group_update_request_all_of1->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(ad_group_update_request_all_of1JSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // ad_group_update_request_all_of1->targeting_spec_operations
    cJSON *targeting_spec_operations = cJSON_GetObjectItemCaseSensitive(ad_group_update_request_all_of1JSON, "targeting_spec_operations");
    if (cJSON_IsNull(targeting_spec_operations)) {
        targeting_spec_operations = NULL;
    }
    if (targeting_spec_operations) { 
    cJSON *targeting_spec_operations_local_nonprimitive = NULL;
    if(!cJSON_IsArray(targeting_spec_operations)){
        goto end; //nonprimitive container
    }

    targeting_spec_operationsList = list_createList();

    cJSON_ArrayForEach(targeting_spec_operations_local_nonprimitive,targeting_spec_operations )
    {
        if(!cJSON_IsObject(targeting_spec_operations_local_nonprimitive)){
            goto end;
        }
        targeting_spec_operations_t *targeting_spec_operationsItem = targeting_spec_operations_parseFromJSON(targeting_spec_operations_local_nonprimitive);

        list_addElement(targeting_spec_operationsList, targeting_spec_operationsItem);
    }
    }


    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);

    ad_group_update_request_all_of1_local_var = ad_group_update_request_all_of1_create_internal (
        bid_multiplier_local_var,
        id_local_str,
        targeting_spec_operations ? targeting_spec_operationsList : NULL
        );

    if (!ad_group_update_request_all_of1_local_var) {
        goto end;
    }

    return ad_group_update_request_all_of1_local_var;
end:
    if (bid_multiplier_local_var) {
        free(bid_multiplier_local_var);
        bid_multiplier_local_var = NULL;
    }
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (targeting_spec_operationsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, targeting_spec_operationsList) {
            targeting_spec_operations_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(targeting_spec_operationsList);
        targeting_spec_operationsList = NULL;
    }
    return NULL;

}
