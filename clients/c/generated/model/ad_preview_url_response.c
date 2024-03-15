#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_preview_url_response.h"



ad_preview_url_response_t *ad_preview_url_response_create(
    char *url
    ) {
    ad_preview_url_response_t *ad_preview_url_response_local_var = malloc(sizeof(ad_preview_url_response_t));
    if (!ad_preview_url_response_local_var) {
        return NULL;
    }
    ad_preview_url_response_local_var->url = url;

    return ad_preview_url_response_local_var;
}


void ad_preview_url_response_free(ad_preview_url_response_t *ad_preview_url_response) {
    if(NULL == ad_preview_url_response){
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
    if (url) { 
    if(!cJSON_IsString(url) && !cJSON_IsNull(url))
    {
    goto end; //String
    }
    }


    ad_preview_url_response_local_var = ad_preview_url_response_create (
        url && !cJSON_IsNull(url) ? strdup(url->valuestring) : NULL
        );

    return ad_preview_url_response_local_var;
end:
    return NULL;

}
