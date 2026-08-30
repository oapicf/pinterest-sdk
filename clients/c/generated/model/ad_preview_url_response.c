#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_preview_url_response.h"



static ad_preview_url_response_t *ad_preview_url_response_create_internal(
    char *url
    ) {
    ad_preview_url_response_t *ad_preview_url_response_local_var = malloc(sizeof(ad_preview_url_response_t));
    if (!ad_preview_url_response_local_var) {
        return NULL;
    }
    memset(ad_preview_url_response_local_var, 0, sizeof(ad_preview_url_response_t));
    ad_preview_url_response_local_var->_library_owned = 1;
    ad_preview_url_response_local_var->url = url;
    return ad_preview_url_response_local_var;
}

__attribute__((deprecated)) ad_preview_url_response_t *ad_preview_url_response_create(
    char *url
    ) {
    ad_preview_url_response_t *result = ad_preview_url_response_create_internal (
        url
        );
    if (!result) {
    }
    return result;
}

void ad_preview_url_response_free(ad_preview_url_response_t *ad_preview_url_response) {
    if(NULL == ad_preview_url_response){
        return ;
    }
    if(ad_preview_url_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ad_preview_url_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ad_preview_url_response->url) {
        free(ad_preview_url_response->url);
        ad_preview_url_response->url = NULL;
    }
    free(ad_preview_url_response);
}

cJSON *ad_preview_url_response_convertToJSON(ad_preview_url_response_t *ad_preview_url_response) {
    cJSON *item = cJSON_CreateObject();

    // ad_preview_url_response->url
    if(ad_preview_url_response->url) {
    if(cJSON_AddStringToObject(item, "url", ad_preview_url_response->url) == NULL) {
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

ad_preview_url_response_t *ad_preview_url_response_parseFromJSON(cJSON *ad_preview_url_responseJSON){

    ad_preview_url_response_t *ad_preview_url_response_local_var = NULL;

    char *url_local_str = NULL;

    // ad_preview_url_response->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(ad_preview_url_responseJSON, "url");
    if (cJSON_IsNull(url)) {
        url = NULL;
    }
    if (url) { 
    if(!cJSON_IsString(url) && !cJSON_IsNull(url))
    {
    goto end; //String
    }
    }


    if (url && !cJSON_IsNull(url)) url_local_str = strdup(url->valuestring);

    ad_preview_url_response_local_var = ad_preview_url_response_create_internal (
        url_local_str
        );

    if (!ad_preview_url_response_local_var) {
        goto end;
    }

    return ad_preview_url_response_local_var;
end:
    if (url_local_str) {
        free(url_local_str);
        url_local_str = NULL;
    }
    return NULL;

}
