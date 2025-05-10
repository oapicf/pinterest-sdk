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
    ad_preview_url_response_local_var->url = url;

    ad_preview_url_response_local_var->_library_owned = 1;
    return ad_preview_url_response_local_var;
}

__attribute__((deprecated)) ad_preview_url_response_t *ad_preview_url_response_create(
    char *url
    ) {
    return ad_preview_url_response_create_internal (
        url
        );
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


    ad_preview_url_response_local_var = ad_preview_url_response_create_internal (
        url && !cJSON_IsNull(url) ? strdup(url->valuestring) : NULL
        );

    return ad_preview_url_response_local_var;
end:
    return NULL;

}
