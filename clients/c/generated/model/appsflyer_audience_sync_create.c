#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "appsflyer_audience_sync_create.h"



static appsflyer_audience_sync_create_t *appsflyer_audience_sync_create_create_internal(
    char *container_id,
    char *url_adid_sha256,
    char *url_email_sha256
    ) {
    appsflyer_audience_sync_create_t *appsflyer_audience_sync_create_local_var = malloc(sizeof(appsflyer_audience_sync_create_t));
    if (!appsflyer_audience_sync_create_local_var) {
        return NULL;
    }
    memset(appsflyer_audience_sync_create_local_var, 0, sizeof(appsflyer_audience_sync_create_t));
    appsflyer_audience_sync_create_local_var->_library_owned = 1;
    appsflyer_audience_sync_create_local_var->container_id = container_id;
    appsflyer_audience_sync_create_local_var->url_adid_sha256 = url_adid_sha256;
    appsflyer_audience_sync_create_local_var->url_email_sha256 = url_email_sha256;
    return appsflyer_audience_sync_create_local_var;
}

__attribute__((deprecated)) appsflyer_audience_sync_create_t *appsflyer_audience_sync_create_create(
    char *container_id,
    char *url_adid_sha256,
    char *url_email_sha256
    ) {
    appsflyer_audience_sync_create_t *result = appsflyer_audience_sync_create_create_internal (
        container_id,
        url_adid_sha256,
        url_email_sha256
        );
    if (!result) {
    }
    return result;
}

void appsflyer_audience_sync_create_free(appsflyer_audience_sync_create_t *appsflyer_audience_sync_create) {
    if(NULL == appsflyer_audience_sync_create){
        return ;
    }
    if(appsflyer_audience_sync_create->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "appsflyer_audience_sync_create_free");
        return ;
    }
    listEntry_t *listEntry;
    if (appsflyer_audience_sync_create->container_id) {
        free(appsflyer_audience_sync_create->container_id);
        appsflyer_audience_sync_create->container_id = NULL;
    }
    if (appsflyer_audience_sync_create->url_adid_sha256) {
        free(appsflyer_audience_sync_create->url_adid_sha256);
        appsflyer_audience_sync_create->url_adid_sha256 = NULL;
    }
    if (appsflyer_audience_sync_create->url_email_sha256) {
        free(appsflyer_audience_sync_create->url_email_sha256);
        appsflyer_audience_sync_create->url_email_sha256 = NULL;
    }
    free(appsflyer_audience_sync_create);
}

cJSON *appsflyer_audience_sync_create_convertToJSON(appsflyer_audience_sync_create_t *appsflyer_audience_sync_create) {
    cJSON *item = cJSON_CreateObject();

    // appsflyer_audience_sync_create->container_id
    if (!appsflyer_audience_sync_create->container_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "container_id", appsflyer_audience_sync_create->container_id) == NULL) {
    goto fail; //String
    }


    // appsflyer_audience_sync_create->url_adid_sha256
    if(appsflyer_audience_sync_create->url_adid_sha256) {
    if(cJSON_AddStringToObject(item, "url_adid_sha256", appsflyer_audience_sync_create->url_adid_sha256) == NULL) {
    goto fail; //String
    }
    }


    // appsflyer_audience_sync_create->url_email_sha256
    if(appsflyer_audience_sync_create->url_email_sha256) {
    if(cJSON_AddStringToObject(item, "url_email_sha256", appsflyer_audience_sync_create->url_email_sha256) == NULL) {
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

appsflyer_audience_sync_create_t *appsflyer_audience_sync_create_parseFromJSON(cJSON *appsflyer_audience_sync_createJSON){

    appsflyer_audience_sync_create_t *appsflyer_audience_sync_create_local_var = NULL;

    char *container_id_local_str = NULL;

    char *url_adid_sha256_local_str = NULL;

    char *url_email_sha256_local_str = NULL;

    // appsflyer_audience_sync_create->container_id
    cJSON *container_id = cJSON_GetObjectItemCaseSensitive(appsflyer_audience_sync_createJSON, "container_id");
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

    // appsflyer_audience_sync_create->url_adid_sha256
    cJSON *url_adid_sha256 = cJSON_GetObjectItemCaseSensitive(appsflyer_audience_sync_createJSON, "url_adid_sha256");
    if (cJSON_IsNull(url_adid_sha256)) {
        url_adid_sha256 = NULL;
    }
    if (url_adid_sha256) { 
    if(!cJSON_IsString(url_adid_sha256) && !cJSON_IsNull(url_adid_sha256))
    {
    goto end; //String
    }
    }

    // appsflyer_audience_sync_create->url_email_sha256
    cJSON *url_email_sha256 = cJSON_GetObjectItemCaseSensitive(appsflyer_audience_sync_createJSON, "url_email_sha256");
    if (cJSON_IsNull(url_email_sha256)) {
        url_email_sha256 = NULL;
    }
    if (url_email_sha256) { 
    if(!cJSON_IsString(url_email_sha256) && !cJSON_IsNull(url_email_sha256))
    {
    goto end; //String
    }
    }


    if (container_id && !cJSON_IsNull(container_id)) container_id_local_str = strdup(container_id->valuestring);
    if (url_adid_sha256 && !cJSON_IsNull(url_adid_sha256)) url_adid_sha256_local_str = strdup(url_adid_sha256->valuestring);
    if (url_email_sha256 && !cJSON_IsNull(url_email_sha256)) url_email_sha256_local_str = strdup(url_email_sha256->valuestring);

    appsflyer_audience_sync_create_local_var = appsflyer_audience_sync_create_create_internal (
        container_id_local_str,
        url_adid_sha256_local_str,
        url_email_sha256_local_str
        );

    if (!appsflyer_audience_sync_create_local_var) {
        goto end;
    }

    return appsflyer_audience_sync_create_local_var;
end:
    if (container_id_local_str) {
        free(container_id_local_str);
        container_id_local_str = NULL;
    }
    if (url_adid_sha256_local_str) {
        free(url_adid_sha256_local_str);
        url_adid_sha256_local_str = NULL;
    }
    if (url_email_sha256_local_str) {
        free(url_email_sha256_local_str);
        url_email_sha256_local_str = NULL;
    }
    return NULL;

}
