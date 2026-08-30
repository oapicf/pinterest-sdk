#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "appsflyer_audience_create.h"



static appsflyer_audience_create_t *appsflyer_audience_create_create_internal(
    char *name,
    appsflyer_platform_t *platform
    ) {
    appsflyer_audience_create_t *appsflyer_audience_create_local_var = malloc(sizeof(appsflyer_audience_create_t));
    if (!appsflyer_audience_create_local_var) {
        return NULL;
    }
    memset(appsflyer_audience_create_local_var, 0, sizeof(appsflyer_audience_create_t));
    appsflyer_audience_create_local_var->_library_owned = 1;
    appsflyer_audience_create_local_var->name = name;
    appsflyer_audience_create_local_var->platform = platform;
    return appsflyer_audience_create_local_var;
}

__attribute__((deprecated)) appsflyer_audience_create_t *appsflyer_audience_create_create(
    char *name,
    appsflyer_platform_t *platform
    ) {
    appsflyer_audience_create_t *result = appsflyer_audience_create_create_internal (
        name,
        platform
        );
    if (!result) {
    }
    return result;
}

void appsflyer_audience_create_free(appsflyer_audience_create_t *appsflyer_audience_create) {
    if(NULL == appsflyer_audience_create){
        return ;
    }
    if(appsflyer_audience_create->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "appsflyer_audience_create_free");
        return ;
    }
    listEntry_t *listEntry;
    if (appsflyer_audience_create->name) {
        free(appsflyer_audience_create->name);
        appsflyer_audience_create->name = NULL;
    }
    if (appsflyer_audience_create->platform) {
        appsflyer_platform_free(appsflyer_audience_create->platform);
        appsflyer_audience_create->platform = NULL;
    }
    free(appsflyer_audience_create);
}

cJSON *appsflyer_audience_create_convertToJSON(appsflyer_audience_create_t *appsflyer_audience_create) {
    cJSON *item = cJSON_CreateObject();

    // appsflyer_audience_create->name
    if (!appsflyer_audience_create->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", appsflyer_audience_create->name) == NULL) {
    goto fail; //String
    }


    // appsflyer_audience_create->platform
    if (!appsflyer_audience_create->platform) {
        goto fail;
    }
    cJSON *platform_local_JSON = appsflyer_platform_convertToJSON(appsflyer_audience_create->platform);
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

appsflyer_audience_create_t *appsflyer_audience_create_parseFromJSON(cJSON *appsflyer_audience_createJSON){

    appsflyer_audience_create_t *appsflyer_audience_create_local_var = NULL;

    char *name_local_str = NULL;

    // define the local variable for appsflyer_audience_create->platform
    appsflyer_platform_t *platform_local_nonprim = NULL;

    // appsflyer_audience_create->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(appsflyer_audience_createJSON, "name");
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

    // appsflyer_audience_create->platform
    cJSON *platform = cJSON_GetObjectItemCaseSensitive(appsflyer_audience_createJSON, "platform");
    if (cJSON_IsNull(platform)) {
        platform = NULL;
    }
    if (!platform) {
        goto end;
    }

    
    platform_local_nonprim = appsflyer_platform_parseFromJSON(platform); //custom


    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    appsflyer_audience_create_local_var = appsflyer_audience_create_create_internal (
        name_local_str,
        platform_local_nonprim
        );

    if (!appsflyer_audience_create_local_var) {
        goto end;
    }

    return appsflyer_audience_create_local_var;
end:
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
