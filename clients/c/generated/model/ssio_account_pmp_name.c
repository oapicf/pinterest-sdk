#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ssio_account_pmp_name.h"



ssio_account_pmp_name_t *ssio_account_pmp_name_create(
    char *name,
    char *id
    ) {
    ssio_account_pmp_name_t *ssio_account_pmp_name_local_var = malloc(sizeof(ssio_account_pmp_name_t));
    if (!ssio_account_pmp_name_local_var) {
        return NULL;
    }
    ssio_account_pmp_name_local_var->name = name;
    ssio_account_pmp_name_local_var->id = id;

    return ssio_account_pmp_name_local_var;
}


void ssio_account_pmp_name_free(ssio_account_pmp_name_t *ssio_account_pmp_name) {
    if(NULL == ssio_account_pmp_name){
        return ;
    }
    listEntry_t *listEntry;
    if (ssio_account_pmp_name->name) {
        free(ssio_account_pmp_name->name);
        ssio_account_pmp_name->name = NULL;
    }
    if (ssio_account_pmp_name->id) {
        free(ssio_account_pmp_name->id);
        ssio_account_pmp_name->id = NULL;
    }
    free(ssio_account_pmp_name);
}

cJSON *ssio_account_pmp_name_convertToJSON(ssio_account_pmp_name_t *ssio_account_pmp_name) {
    cJSON *item = cJSON_CreateObject();

    // ssio_account_pmp_name->name
    if(ssio_account_pmp_name->name) {
    if(cJSON_AddStringToObject(item, "name", ssio_account_pmp_name->name) == NULL) {
    goto fail; //String
    }
    }


    // ssio_account_pmp_name->id
    if(ssio_account_pmp_name->id) {
    if(cJSON_AddStringToObject(item, "id", ssio_account_pmp_name->id) == NULL) {
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

    // ssio_account_pmp_name->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(ssio_account_pmp_nameJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // ssio_account_pmp_name->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(ssio_account_pmp_nameJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }


    ssio_account_pmp_name_local_var = ssio_account_pmp_name_create (
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL
        );

    return ssio_account_pmp_name_local_var;
end:
    return NULL;

}
