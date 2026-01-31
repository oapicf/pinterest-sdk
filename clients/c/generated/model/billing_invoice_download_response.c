#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "billing_invoice_download_response.h"



static billing_invoice_download_response_t *billing_invoice_download_response_create_internal(
    char *download_url,
    char *id
    ) {
    billing_invoice_download_response_t *billing_invoice_download_response_local_var = malloc(sizeof(billing_invoice_download_response_t));
    if (!billing_invoice_download_response_local_var) {
        return NULL;
    }
    billing_invoice_download_response_local_var->download_url = download_url;
    billing_invoice_download_response_local_var->id = id;

    billing_invoice_download_response_local_var->_library_owned = 1;
    return billing_invoice_download_response_local_var;
}

__attribute__((deprecated)) billing_invoice_download_response_t *billing_invoice_download_response_create(
    char *download_url,
    char *id
    ) {
    return billing_invoice_download_response_create_internal (
        download_url,
        id
        );
}

void billing_invoice_download_response_free(billing_invoice_download_response_t *billing_invoice_download_response) {
    if(NULL == billing_invoice_download_response){
        return ;
    }
    if(billing_invoice_download_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "billing_invoice_download_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (billing_invoice_download_response->download_url) {
        free(billing_invoice_download_response->download_url);
        billing_invoice_download_response->download_url = NULL;
    }
    if (billing_invoice_download_response->id) {
        free(billing_invoice_download_response->id);
        billing_invoice_download_response->id = NULL;
    }
    free(billing_invoice_download_response);
}

cJSON *billing_invoice_download_response_convertToJSON(billing_invoice_download_response_t *billing_invoice_download_response) {
    cJSON *item = cJSON_CreateObject();

    // billing_invoice_download_response->download_url
    if(billing_invoice_download_response->download_url) {
    if(cJSON_AddStringToObject(item, "download_url", billing_invoice_download_response->download_url) == NULL) {
    goto fail; //String
    }
    }


    // billing_invoice_download_response->id
    if(billing_invoice_download_response->id) {
    if(cJSON_AddStringToObject(item, "id", billing_invoice_download_response->id) == NULL) {
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

billing_invoice_download_response_t *billing_invoice_download_response_parseFromJSON(cJSON *billing_invoice_download_responseJSON){

    billing_invoice_download_response_t *billing_invoice_download_response_local_var = NULL;

    // billing_invoice_download_response->download_url
    cJSON *download_url = cJSON_GetObjectItemCaseSensitive(billing_invoice_download_responseJSON, "download_url");
    if (cJSON_IsNull(download_url)) {
        download_url = NULL;
    }
    if (download_url) { 
    if(!cJSON_IsString(download_url) && !cJSON_IsNull(download_url))
    {
    goto end; //String
    }
    }

    // billing_invoice_download_response->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(billing_invoice_download_responseJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }


    billing_invoice_download_response_local_var = billing_invoice_download_response_create_internal (
        download_url && !cJSON_IsNull(download_url) ? strdup(download_url->valuestring) : NULL,
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL
        );

    return billing_invoice_download_response_local_var;
end:
    return NULL;

}
