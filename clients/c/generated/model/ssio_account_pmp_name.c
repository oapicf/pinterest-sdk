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
    memset(ssio_account_pmp_name_local_var, 0, sizeof(ssio_account_pmp_name_t));
    ssio_account_pmp_name_local_var->_library_owned = 1;
    ssio_account_pmp_name_local_var->id = id;
    ssio_account_pmp_name_local_var->name = name;
    return ssio_account_pmp_name_local_var;
}

__attribute__((deprecated)) ssio_account_pmp_name_t *ssio_account_pmp_name_create(
    char *id,
    char *name
    ) {
    ssio_account_pmp_name_t *result = ssio_account_pmp_name_create_internal (
        id,
        name
        );
    if (!result) {
    }
    return result;
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

    char *id_local_str = NULL;

    char *name_local_str = NULL;

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


    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    ssio_account_pmp_name_local_var = ssio_account_pmp_name_create_internal (
        id_local_str,
        name_local_str
        );

    if (!ssio_account_pmp_name_local_var) {
        goto end;
    }

    return ssio_account_pmp_name_local_var;
end:
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    return NULL;

}
