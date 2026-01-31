#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ssio_account_response.h"



static ssio_account_response_t *ssio_account_response_create_internal(
    list_t *billto_infos,
    int can_edit,
    char *currency,
    int eligible,
    char *error,
    list_t *pmp_names
    ) {
    ssio_account_response_t *ssio_account_response_local_var = malloc(sizeof(ssio_account_response_t));
    if (!ssio_account_response_local_var) {
        return NULL;
    }
    ssio_account_response_local_var->billto_infos = billto_infos;
    ssio_account_response_local_var->can_edit = can_edit;
    ssio_account_response_local_var->currency = currency;
    ssio_account_response_local_var->eligible = eligible;
    ssio_account_response_local_var->error = error;
    ssio_account_response_local_var->pmp_names = pmp_names;

    ssio_account_response_local_var->_library_owned = 1;
    return ssio_account_response_local_var;
}

__attribute__((deprecated)) ssio_account_response_t *ssio_account_response_create(
    list_t *billto_infos,
    int can_edit,
    char *currency,
    int eligible,
    char *error,
    list_t *pmp_names
    ) {
    return ssio_account_response_create_internal (
        billto_infos,
        can_edit,
        currency,
        eligible,
        error,
        pmp_names
        );
}

void ssio_account_response_free(ssio_account_response_t *ssio_account_response) {
    if(NULL == ssio_account_response){
        return ;
    }
    if(ssio_account_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ssio_account_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ssio_account_response->billto_infos) {
        list_ForEach(listEntry, ssio_account_response->billto_infos) {
            ssio_account_item_free(listEntry->data);
        }
        list_freeList(ssio_account_response->billto_infos);
        ssio_account_response->billto_infos = NULL;
    }
    if (ssio_account_response->currency) {
        free(ssio_account_response->currency);
        ssio_account_response->currency = NULL;
    }
    if (ssio_account_response->error) {
        free(ssio_account_response->error);
        ssio_account_response->error = NULL;
    }
    if (ssio_account_response->pmp_names) {
        list_ForEach(listEntry, ssio_account_response->pmp_names) {
            ssio_account_pmp_name_free(listEntry->data);
        }
        list_freeList(ssio_account_response->pmp_names);
        ssio_account_response->pmp_names = NULL;
    }
    free(ssio_account_response);
}

cJSON *ssio_account_response_convertToJSON(ssio_account_response_t *ssio_account_response) {
    cJSON *item = cJSON_CreateObject();

    // ssio_account_response->billto_infos
    if(ssio_account_response->billto_infos) {
    cJSON *billto_infos = cJSON_AddArrayToObject(item, "billto_infos");
    if(billto_infos == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *billto_infosListEntry;
    if (ssio_account_response->billto_infos) {
    list_ForEach(billto_infosListEntry, ssio_account_response->billto_infos) {
    cJSON *itemLocal = ssio_account_item_convertToJSON(billto_infosListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(billto_infos, itemLocal);
    }
    }
    }


    // ssio_account_response->can_edit
    if(ssio_account_response->can_edit) {
    if(cJSON_AddBoolToObject(item, "can_edit", ssio_account_response->can_edit) == NULL) {
    goto fail; //Bool
    }
    }


    // ssio_account_response->currency
    if(ssio_account_response->currency) {
    if(cJSON_AddStringToObject(item, "currency", ssio_account_response->currency) == NULL) {
    goto fail; //String
    }
    }


    // ssio_account_response->eligible
    if(ssio_account_response->eligible) {
    if(cJSON_AddBoolToObject(item, "eligible", ssio_account_response->eligible) == NULL) {
    goto fail; //Bool
    }
    }


    // ssio_account_response->error
    if(ssio_account_response->error) {
    if(cJSON_AddStringToObject(item, "error", ssio_account_response->error) == NULL) {
    goto fail; //String
    }
    }


    // ssio_account_response->pmp_names
    if(ssio_account_response->pmp_names) {
    cJSON *pmp_names = cJSON_AddArrayToObject(item, "pmp_names");
    if(pmp_names == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *pmp_namesListEntry;
    if (ssio_account_response->pmp_names) {
    list_ForEach(pmp_namesListEntry, ssio_account_response->pmp_names) {
    cJSON *itemLocal = ssio_account_pmp_name_convertToJSON(pmp_namesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(pmp_names, itemLocal);
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

ssio_account_response_t *ssio_account_response_parseFromJSON(cJSON *ssio_account_responseJSON){

    ssio_account_response_t *ssio_account_response_local_var = NULL;

    // define the local list for ssio_account_response->billto_infos
    list_t *billto_infosList = NULL;

    // define the local list for ssio_account_response->pmp_names
    list_t *pmp_namesList = NULL;

    // ssio_account_response->billto_infos
    cJSON *billto_infos = cJSON_GetObjectItemCaseSensitive(ssio_account_responseJSON, "billto_infos");
    if (cJSON_IsNull(billto_infos)) {
        billto_infos = NULL;
    }
    if (billto_infos) { 
    cJSON *billto_infos_local_nonprimitive = NULL;
    if(!cJSON_IsArray(billto_infos)){
        goto end; //nonprimitive container
    }

    billto_infosList = list_createList();

    cJSON_ArrayForEach(billto_infos_local_nonprimitive,billto_infos )
    {
        if(!cJSON_IsObject(billto_infos_local_nonprimitive)){
            goto end;
        }
        ssio_account_item_t *billto_infosItem = ssio_account_item_parseFromJSON(billto_infos_local_nonprimitive);

        list_addElement(billto_infosList, billto_infosItem);
    }
    }

    // ssio_account_response->can_edit
    cJSON *can_edit = cJSON_GetObjectItemCaseSensitive(ssio_account_responseJSON, "can_edit");
    if (cJSON_IsNull(can_edit)) {
        can_edit = NULL;
    }
    if (can_edit) { 
    if(!cJSON_IsBool(can_edit))
    {
    goto end; //Bool
    }
    }

    // ssio_account_response->currency
    cJSON *currency = cJSON_GetObjectItemCaseSensitive(ssio_account_responseJSON, "currency");
    if (cJSON_IsNull(currency)) {
        currency = NULL;
    }
    if (currency) { 
    if(!cJSON_IsString(currency) && !cJSON_IsNull(currency))
    {
    goto end; //String
    }
    }

    // ssio_account_response->eligible
    cJSON *eligible = cJSON_GetObjectItemCaseSensitive(ssio_account_responseJSON, "eligible");
    if (cJSON_IsNull(eligible)) {
        eligible = NULL;
    }
    if (eligible) { 
    if(!cJSON_IsBool(eligible))
    {
    goto end; //Bool
    }
    }

    // ssio_account_response->error
    cJSON *error = cJSON_GetObjectItemCaseSensitive(ssio_account_responseJSON, "error");
    if (cJSON_IsNull(error)) {
        error = NULL;
    }
    if (error) { 
    if(!cJSON_IsString(error) && !cJSON_IsNull(error))
    {
    goto end; //String
    }
    }

    // ssio_account_response->pmp_names
    cJSON *pmp_names = cJSON_GetObjectItemCaseSensitive(ssio_account_responseJSON, "pmp_names");
    if (cJSON_IsNull(pmp_names)) {
        pmp_names = NULL;
    }
    if (pmp_names) { 
    cJSON *pmp_names_local_nonprimitive = NULL;
    if(!cJSON_IsArray(pmp_names)){
        goto end; //nonprimitive container
    }

    pmp_namesList = list_createList();

    cJSON_ArrayForEach(pmp_names_local_nonprimitive,pmp_names )
    {
        if(!cJSON_IsObject(pmp_names_local_nonprimitive)){
            goto end;
        }
        ssio_account_pmp_name_t *pmp_namesItem = ssio_account_pmp_name_parseFromJSON(pmp_names_local_nonprimitive);

        list_addElement(pmp_namesList, pmp_namesItem);
    }
    }


    ssio_account_response_local_var = ssio_account_response_create_internal (
        billto_infos ? billto_infosList : NULL,
        can_edit ? can_edit->valueint : 0,
        currency && !cJSON_IsNull(currency) ? strdup(currency->valuestring) : NULL,
        eligible ? eligible->valueint : 0,
        error && !cJSON_IsNull(error) ? strdup(error->valuestring) : NULL,
        pmp_names ? pmp_namesList : NULL
        );

    return ssio_account_response_local_var;
end:
    if (billto_infosList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, billto_infosList) {
            ssio_account_item_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(billto_infosList);
        billto_infosList = NULL;
    }
    if (pmp_namesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, pmp_namesList) {
            ssio_account_pmp_name_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(pmp_namesList);
        pmp_namesList = NULL;
    }
    return NULL;

}
