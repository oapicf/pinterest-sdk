#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "delete_business_partners.h"



static delete_business_partners_t *delete_business_partners_create_internal(
    list_t *deleted_partners
    ) {
    delete_business_partners_t *delete_business_partners_local_var = malloc(sizeof(delete_business_partners_t));
    if (!delete_business_partners_local_var) {
        return NULL;
    }
    memset(delete_business_partners_local_var, 0, sizeof(delete_business_partners_t));
    delete_business_partners_local_var->_library_owned = 1;
    delete_business_partners_local_var->deleted_partners = deleted_partners;
    return delete_business_partners_local_var;
}

__attribute__((deprecated)) delete_business_partners_t *delete_business_partners_create(
    list_t *deleted_partners
    ) {
    delete_business_partners_t *result = delete_business_partners_create_internal (
        deleted_partners
        );
    if (!result) {
    }
    return result;
}

void delete_business_partners_free(delete_business_partners_t *delete_business_partners) {
    if(NULL == delete_business_partners){
        return ;
    }
    if(delete_business_partners->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "delete_business_partners_free");
        return ;
    }
    listEntry_t *listEntry;
    if (delete_business_partners->deleted_partners) {
        list_ForEach(listEntry, delete_business_partners->deleted_partners) {
            free(listEntry->data);
        }
        list_freeList(delete_business_partners->deleted_partners);
        delete_business_partners->deleted_partners = NULL;
    }
    free(delete_business_partners);
}

cJSON *delete_business_partners_convertToJSON(delete_business_partners_t *delete_business_partners) {
    cJSON *item = cJSON_CreateObject();

    // delete_business_partners->deleted_partners
    if(delete_business_partners->deleted_partners) {
    cJSON *deleted_partners = cJSON_AddArrayToObject(item, "deleted_partners");
    if(deleted_partners == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *deleted_partnersListEntry;
    list_ForEach(deleted_partnersListEntry, delete_business_partners->deleted_partners) {
    if(cJSON_AddStringToObject(deleted_partners, "", deleted_partnersListEntry->data) == NULL)
    {
        goto fail;
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

delete_business_partners_t *delete_business_partners_parseFromJSON(cJSON *delete_business_partnersJSON){

    delete_business_partners_t *delete_business_partners_local_var = NULL;

    // define the local list for delete_business_partners->deleted_partners
    list_t *deleted_partnersList = NULL;

    // delete_business_partners->deleted_partners
    cJSON *deleted_partners = cJSON_GetObjectItemCaseSensitive(delete_business_partnersJSON, "deleted_partners");
    if (cJSON_IsNull(deleted_partners)) {
        deleted_partners = NULL;
    }
    if (deleted_partners) { 
    cJSON *deleted_partners_local = NULL;
    if(!cJSON_IsArray(deleted_partners)) {
        goto end;//primitive container
    }
    deleted_partnersList = list_createList();

    cJSON_ArrayForEach(deleted_partners_local, deleted_partners)
    {
        if(!cJSON_IsString(deleted_partners_local))
        {
            goto end;
        }
        list_addElement(deleted_partnersList , strdup(deleted_partners_local->valuestring));
    }
    }



    delete_business_partners_local_var = delete_business_partners_create_internal (
        deleted_partners ? deleted_partnersList : NULL
        );

    if (!delete_business_partners_local_var) {
        goto end;
    }

    return delete_business_partners_local_var;
end:
    if (deleted_partnersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, deleted_partnersList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(deleted_partnersList);
        deleted_partnersList = NULL;
    }
    return NULL;

}
