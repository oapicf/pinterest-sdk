#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ssio_account_pmp_name.h"



static ssio_account_pmp_name_t *ssio_account_pmp_name_create_internal(
    char *id,
    char *name
    ) {
    ssio_account_pmp_name_t *ssio_account_pmp_name_local_var = malloc(sizeof(ssio_account_pmp_name_t));
    if (!ssio_account_pmp_name_local_var) {
        return NULL;
    }
    ssio_account_pmp_name_local_var->id = id;
    ssio_account_pmp_name_local_var->name = name;

    ssio_account_pmp_name_local_var->_library_owned = 1;
    return ssio_account_pmp_name_local_var;
}

__attribute__((deprecated)) ssio_account_pmp_name_t *ssio_account_pmp_name_create(
    char *id,
    char *name
    ) {
    return ssio_account_pmp_name_create_internal (
        id,
        name
        );
}

void ssio_account_pmp_name_free(ssio_account_pmp_name_t *ssio_account_pmp_name) {
    if(NULL == ssio_account_pmp_name){
        return ;
    }
    if(ssio_account_pmp_name->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ssio_account_pmp_name_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ssio_account_pmp_name->id) {
        free(ssio_account_pmp_name->id);
        ssio_account_pmp_name->id = NULL;
    }
    if (ssio_account_pmp_name->name) {
        free(ssio_account_pmp_name->name);
        ssio_account_pmp_name->name = NULL;
    }
    free(ssio_account_pmp_name);
}

cJSON *ssio_account_pmp_name_convertToJSON(ssio_account_pmp_name_t *ssio_account_pmp_name) {
    cJSON *item = cJSON_CreateObject();

    // ssio_account_pmp_name->id
    if(ssio_account_pmp_name->id) {
    if(cJSON_AddStringToObject(item, "id", ssio_account_pmp_name->id) == NULL) {
    goto fail; //String
    }
    }


    // ssio_account_pmp_name->name
    if(ssio_account_pmp_name->name) {
    if(cJSON_AddStringToObject(item, "name", ssio_account_pmp_name->name) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

ssio_account_pmp_name_t *ssio_account_pmp_name_parseFromJSON(cJSON *ssio_account_pmp_nameJSON){

    ssio_account_pmp_name_t *ssio_account_pmp_name_local_var = NULL;

    // ssio_account_pmp_name->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(ssio_account_pmp_nameJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // ssio_account_pmp_name->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(ssio_account_pmp_nameJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }


    ssio_account_pmp_name_local_var = ssio_account_pmp_name_create_internal (
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL
        );

    return ssio_account_pmp_name_local_var;
end:
    return NULL;

}
