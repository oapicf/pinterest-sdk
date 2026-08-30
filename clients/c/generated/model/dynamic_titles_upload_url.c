#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "dynamic_titles_upload_url.h"



static dynamic_titles_upload_url_t *dynamic_titles_upload_url_create_internal(
    char *existing_filename,
    char *request_id,
    char *upload_url
    ) {
    dynamic_titles_upload_url_t *dynamic_titles_upload_url_local_var = malloc(sizeof(dynamic_titles_upload_url_t));
    if (!dynamic_titles_upload_url_local_var) {
        return NULL;
    }
    memset(dynamic_titles_upload_url_local_var, 0, sizeof(dynamic_titles_upload_url_t));
    dynamic_titles_upload_url_local_var->_library_owned = 1;
    dynamic_titles_upload_url_local_var->existing_filename = existing_filename;
    dynamic_titles_upload_url_local_var->request_id = request_id;
    dynamic_titles_upload_url_local_var->upload_url = upload_url;
    return dynamic_titles_upload_url_local_var;
}

__attribute__((deprecated)) dynamic_titles_upload_url_t *dynamic_titles_upload_url_create(
    char *existing_filename,
    char *request_id,
    char *upload_url
    ) {
    dynamic_titles_upload_url_t *result = dynamic_titles_upload_url_create_internal (
        existing_filename,
        request_id,
        upload_url
        );
    if (!result) {
    }
    return result;
}

void dynamic_titles_upload_url_free(dynamic_titles_upload_url_t *dynamic_titles_upload_url) {
    if(NULL == dynamic_titles_upload_url){
        return ;
    }
    if(dynamic_titles_upload_url->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "dynamic_titles_upload_url_free");
        return ;
    }
    listEntry_t *listEntry;
    if (dynamic_titles_upload_url->existing_filename) {
        free(dynamic_titles_upload_url->existing_filename);
        dynamic_titles_upload_url->existing_filename = NULL;
    }
    if (dynamic_titles_upload_url->request_id) {
        free(dynamic_titles_upload_url->request_id);
        dynamic_titles_upload_url->request_id = NULL;
    }
    if (dynamic_titles_upload_url->upload_url) {
        free(dynamic_titles_upload_url->upload_url);
        dynamic_titles_upload_url->upload_url = NULL;
    }
    free(dynamic_titles_upload_url);
}

cJSON *dynamic_titles_upload_url_convertToJSON(dynamic_titles_upload_url_t *dynamic_titles_upload_url) {
    cJSON *item = cJSON_CreateObject();

    // dynamic_titles_upload_url->existing_filename
    if(dynamic_titles_upload_url->existing_filename) {
    if(cJSON_AddStringToObject(item, "existing_filename", dynamic_titles_upload_url->existing_filename) == NULL) {
    goto fail; //String
    }
    }


    // dynamic_titles_upload_url->request_id
    if (!dynamic_titles_upload_url->request_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "request_id", dynamic_titles_upload_url->request_id) == NULL) {
    goto fail; //String
    }


    // dynamic_titles_upload_url->upload_url
    if (!dynamic_titles_upload_url->upload_url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "upload_url", dynamic_titles_upload_url->upload_url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

dynamic_titles_upload_url_t *dynamic_titles_upload_url_parseFromJSON(cJSON *dynamic_titles_upload_urlJSON){

    dynamic_titles_upload_url_t *dynamic_titles_upload_url_local_var = NULL;

    char *existing_filename_local_str = NULL;

    char *request_id_local_str = NULL;

    char *upload_url_local_str = NULL;

    // dynamic_titles_upload_url->existing_filename
    cJSON *existing_filename = cJSON_GetObjectItemCaseSensitive(dynamic_titles_upload_urlJSON, "existing_filename");
    if (cJSON_IsNull(existing_filename)) {
        existing_filename = NULL;
    }
    if (existing_filename) { 
    if(!cJSON_IsString(existing_filename) && !cJSON_IsNull(existing_filename))
    {
    goto end; //String
    }
    }

    // dynamic_titles_upload_url->request_id
    cJSON *request_id = cJSON_GetObjectItemCaseSensitive(dynamic_titles_upload_urlJSON, "request_id");
    if (cJSON_IsNull(request_id)) {
        request_id = NULL;
    }
    if (!request_id) {
        goto end;
    }

    
    if(!cJSON_IsString(request_id))
    {
    goto end; //String
    }

    // dynamic_titles_upload_url->upload_url
    cJSON *upload_url = cJSON_GetObjectItemCaseSensitive(dynamic_titles_upload_urlJSON, "upload_url");
    if (cJSON_IsNull(upload_url)) {
        upload_url = NULL;
    }
    if (!upload_url) {
        goto end;
    }

    
    if(!cJSON_IsString(upload_url))
    {
    goto end; //String
    }


    if (existing_filename && !cJSON_IsNull(existing_filename)) existing_filename_local_str = strdup(existing_filename->valuestring);
    if (request_id && !cJSON_IsNull(request_id)) request_id_local_str = strdup(request_id->valuestring);
    if (upload_url && !cJSON_IsNull(upload_url)) upload_url_local_str = strdup(upload_url->valuestring);

    dynamic_titles_upload_url_local_var = dynamic_titles_upload_url_create_internal (
        existing_filename_local_str,
        request_id_local_str,
        upload_url_local_str
        );

    if (!dynamic_titles_upload_url_local_var) {
        goto end;
    }

    return dynamic_titles_upload_url_local_var;
end:
    if (existing_filename_local_str) {
        free(existing_filename_local_str);
        existing_filename_local_str = NULL;
    }
    if (request_id_local_str) {
        free(request_id_local_str);
        request_id_local_str = NULL;
    }
    if (upload_url_local_str) {
        free(upload_url_local_str);
        upload_url_local_str = NULL;
    }
    return NULL;

}
