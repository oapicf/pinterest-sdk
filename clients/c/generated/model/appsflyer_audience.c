#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "appsflyer_audience.h"



static appsflyer_audience_t *appsflyer_audience_create_internal(
    char *container_id,
    char *name,
    appsflyer_platform_t *platform
    ) {
    appsflyer_audience_t *appsflyer_audience_local_var = malloc(sizeof(appsflyer_audience_t));
    if (!appsflyer_audience_local_var) {
        return NULL;
    }
    memset(appsflyer_audience_local_var, 0, sizeof(appsflyer_audience_t));
    appsflyer_audience_local_var->_library_owned = 1;
    appsflyer_audience_local_var->container_id = container_id;
    appsflyer_audience_local_var->name = name;
    appsflyer_audience_local_var->platform = platform;
    return appsflyer_audience_local_var;
}

__attribute__((deprecated)) appsflyer_audience_t *appsflyer_audience_create(
    char *container_id,
    char *name,
    appsflyer_platform_t *platform
    ) {
    appsflyer_audience_t *result = appsflyer_audience_create_internal (
        container_id,
        name,
        platform
        );
    if (!result) {
    }
    return result;
}

void appsflyer_audience_free(appsflyer_audience_t *appsflyer_audience) {
    if(NULL == appsflyer_audience){
        return ;
    }
    if(appsflyer_audience->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "appsflyer_audience_free");
        return ;
    }
    listEntry_t *listEntry;
    if (appsflyer_audience->container_id) {
        free(appsflyer_audience->container_id);
        appsflyer_audience->container_id = NULL;
    }
    if (appsflyer_audience->name) {
        free(appsflyer_audience->name);
        appsflyer_audience->name = NULL;
    }
    if (appsflyer_audience->platform) {
        appsflyer_platform_free(appsflyer_audience->platform);
        appsflyer_audience->platform = NULL;
    }
    free(appsflyer_audience);
}

cJSON *appsflyer_audience_convertToJSON(appsflyer_audience_t *appsflyer_audience) {
    cJSON *item = cJSON_CreateObject();

    // appsflyer_audience->container_id
    if (!appsflyer_audience->container_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "container_id", appsflyer_audience->container_id) == NULL) {
    goto fail; //String
    }


    // appsflyer_audience->name
    if (!appsflyer_audience->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", appsflyer_audience->name) == NULL) {
    goto fail; //String
    }


    // appsflyer_audience->platform
    if (!appsflyer_audience->platform) {
        goto fail;
    }
    cJSON *platform_local_JSON = appsflyer_platform_convertToJSON(appsflyer_audience->platform);
    if(platform_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "platform", platform_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

appsflyer_audience_t *appsflyer_audience_parseFromJSON(cJSON *appsflyer_audienceJSON){

    appsflyer_audience_t *appsflyer_audience_local_var = NULL;

    char *container_id_local_str = NULL;

    char *name_local_str = NULL;

    // define the local variable for appsflyer_audience->platform
    appsflyer_platform_t *platform_local_nonprim = NULL;

    // appsflyer_audience->container_id
    cJSON *container_id = cJSON_GetObjectItemCaseSensitive(appsflyer_audienceJSON, "container_id");
    if (cJSON_IsNull(container_id)) {
        container_id = NULL;
    }
    if (!container_id) {
        goto end;
    }

    
    if(!cJSON_IsString(container_id))
    {
    goto end; //String
    }

    // appsflyer_audience->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(appsflyer_audienceJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // appsflyer_audience->platform
    cJSON *platform = cJSON_GetObjectItemCaseSensitive(appsflyer_audienceJSON, "platform");
    if (cJSON_IsNull(platform)) {
        platform = NULL;
    }
    if (!platform) {
        goto end;
    }

    
    platform_local_nonprim = appsflyer_platform_parseFromJSON(platform); //custom


    if (container_id && !cJSON_IsNull(container_id)) container_id_local_str = strdup(container_id->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    appsflyer_audience_local_var = appsflyer_audience_create_internal (
        container_id_local_str,
        name_local_str,
        platform_local_nonprim
        );

    if (!appsflyer_audience_local_var) {
        goto end;
    }

    return appsflyer_audience_local_var;
end:
    if (container_id_local_str) {
        free(container_id_local_str);
        container_id_local_str = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (platform_local_nonprim) {
        appsflyer_platform_free(platform_local_nonprim);
        platform_local_nonprim = NULL;
    }
    return NULL;

}
