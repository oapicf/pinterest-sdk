#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "integration_log_client_request.h"



static integration_log_client_request_t *integration_log_client_request_create_internal(
    char *host,
    pinterest_rest_api_http_method__e method,
    char *path,
    list_t* request_headers,
    list_t* response_headers,
    int *response_status_code
    ) {
    integration_log_client_request_t *integration_log_client_request_local_var = malloc(sizeof(integration_log_client_request_t));
    if (!integration_log_client_request_local_var) {
        return NULL;
    }
    memset(integration_log_client_request_local_var, 0, sizeof(integration_log_client_request_t));
    integration_log_client_request_local_var->_library_owned = 1;
    integration_log_client_request_local_var->host = host;
    integration_log_client_request_local_var->method = method;
    integration_log_client_request_local_var->path = path;
    integration_log_client_request_local_var->request_headers = request_headers;
    integration_log_client_request_local_var->response_headers = response_headers;
    integration_log_client_request_local_var->response_status_code = response_status_code;
    return integration_log_client_request_local_var;
}

__attribute__((deprecated)) integration_log_client_request_t *integration_log_client_request_create(
    char *host,
    pinterest_rest_api_http_method__e method,
    char *path,
    list_t* request_headers,
    list_t* response_headers,
    int *response_status_code
    ) {
    int *response_status_code_copy = NULL;
    if (response_status_code) {
        response_status_code_copy = malloc(sizeof(int));
        if (response_status_code_copy) *response_status_code_copy = *response_status_code;
    }
    integration_log_client_request_t *result = integration_log_client_request_create_internal (
        host,
        method,
        path,
        request_headers,
        response_headers,
        response_status_code_copy
        );
    if (!result) {
        free(response_status_code_copy);
    }
    return result;
}

void integration_log_client_request_free(integration_log_client_request_t *integration_log_client_request) {
    if(NULL == integration_log_client_request){
        return ;
    }
    if(integration_log_client_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "integration_log_client_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (integration_log_client_request->host) {
        free(integration_log_client_request->host);
        integration_log_client_request->host = NULL;
    }
    if (integration_log_client_request->path) {
        free(integration_log_client_request->path);
        integration_log_client_request->path = NULL;
    }
    if (integration_log_client_request->request_headers) {
        list_ForEach(listEntry, integration_log_client_request->request_headers) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(integration_log_client_request->request_headers);
        integration_log_client_request->request_headers = NULL;
    }
    if (integration_log_client_request->response_headers) {
        list_ForEach(listEntry, integration_log_client_request->response_headers) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(integration_log_client_request->response_headers);
        integration_log_client_request->response_headers = NULL;
    }
    if (integration_log_client_request->response_status_code) {
        free(integration_log_client_request->response_status_code);
        integration_log_client_request->response_status_code = NULL;
    }
    free(integration_log_client_request);
}

cJSON *integration_log_client_request_convertToJSON(integration_log_client_request_t *integration_log_client_request) {
    cJSON *item = cJSON_CreateObject();

    // integration_log_client_request->host
    if (!integration_log_client_request->host) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "host", integration_log_client_request->host) == NULL) {
    goto fail; //String
    }


    // integration_log_client_request->method
    if (pinterest_rest_api_http_method__NULL == integration_log_client_request->method) {
        goto fail;
    }
    cJSON *method_local_JSON = http_method_convertToJSON(integration_log_client_request->method);
    if(method_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "method", method_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // integration_log_client_request->path
    if (!integration_log_client_request->path) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "path", integration_log_client_request->path) == NULL) {
    goto fail; //String
    }


    // integration_log_client_request->request_headers
    if(integration_log_client_request->request_headers) {
    cJSON *request_headers = cJSON_AddObjectToObject(item, "request_headers");
    if(request_headers == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = request_headers;
    listEntry_t *request_headersListEntry;
    if (integration_log_client_request->request_headers) {
    list_ForEach(request_headersListEntry, integration_log_client_request->request_headers) {
        keyValuePair_t *localKeyValue = request_headersListEntry->data;
        if(cJSON_AddStringToObject(localMapObject, localKeyValue->key, localKeyValue->value) == NULL)
        {
            goto fail;
        }
    }
    }
    }


    // integration_log_client_request->response_headers
    if(integration_log_client_request->response_headers) {
    cJSON *response_headers = cJSON_AddObjectToObject(item, "response_headers");
    if(response_headers == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = response_headers;
    listEntry_t *response_headersListEntry;
    if (integration_log_client_request->response_headers) {
    list_ForEach(response_headersListEntry, integration_log_client_request->response_headers) {
        keyValuePair_t *localKeyValue = response_headersListEntry->data;
        if(cJSON_AddStringToObject(localMapObject, localKeyValue->key, localKeyValue->value) == NULL)
        {
            goto fail;
        }
    }
    }
    }


    // integration_log_client_request->response_status_code
    if(integration_log_client_request->response_status_code) {
    if(cJSON_AddNumberToObject(item, "response_status_code", *integration_log_client_request->response_status_code) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

integration_log_client_request_t *integration_log_client_request_parseFromJSON(cJSON *integration_log_client_requestJSON){

    integration_log_client_request_t *integration_log_client_request_local_var = NULL;

    char *host_local_str = NULL;

    // define the local variable for integration_log_client_request->method
    pinterest_rest_api_http_method__e method_local_nonprim = 0;

    char *path_local_str = NULL;

    // define the local map for integration_log_client_request->request_headers
    list_t *request_headersList = NULL;

    // define the local map for integration_log_client_request->response_headers
    list_t *response_headersList = NULL;

    // define the local variable for integration_log_client_request->response_status_code
    int *response_status_code_local_var = NULL;

    // integration_log_client_request->host
    cJSON *host = cJSON_GetObjectItemCaseSensitive(integration_log_client_requestJSON, "host");
    if (cJSON_IsNull(host)) {
        host = NULL;
    }
    if (!host) {
        goto end;
    }

    
    if(!cJSON_IsString(host))
    {
    goto end; //String
    }

    // integration_log_client_request->method
    cJSON *method = cJSON_GetObjectItemCaseSensitive(integration_log_client_requestJSON, "method");
    if (cJSON_IsNull(method)) {
        method = NULL;
    }
    if (!method) {
        goto end;
    }

    
    method_local_nonprim = http_method_parseFromJSON(method); //custom

    // integration_log_client_request->path
    cJSON *path = cJSON_GetObjectItemCaseSensitive(integration_log_client_requestJSON, "path");
    if (cJSON_IsNull(path)) {
        path = NULL;
    }
    if (!path) {
        goto end;
    }

    
    if(!cJSON_IsString(path))
    {
    goto end; //String
    }

    // integration_log_client_request->request_headers
    cJSON *request_headers = cJSON_GetObjectItemCaseSensitive(integration_log_client_requestJSON, "request_headers");
    if (cJSON_IsNull(request_headers)) {
        request_headers = NULL;
    }
    if (request_headers) { 
    cJSON *request_headers_local_map = NULL;
    if(!cJSON_IsObject(request_headers) && !cJSON_IsNull(request_headers))
    {
        goto end;//primitive map container
    }
    if(cJSON_IsObject(request_headers))
    {
        request_headersList = list_createList();
        keyValuePair_t *localMapKeyPair;
        cJSON_ArrayForEach(request_headers_local_map, request_headers)
        {
            cJSON *localMapObject = request_headers_local_map;
            if(!cJSON_IsString(localMapObject))
            {
                goto end;
            }
            localMapKeyPair = keyValuePair_create(strdup(localMapObject->string),strdup(localMapObject->valuestring));
            list_addElement(request_headersList , localMapKeyPair);
        }
    }
    }

    // integration_log_client_request->response_headers
    cJSON *response_headers = cJSON_GetObjectItemCaseSensitive(integration_log_client_requestJSON, "response_headers");
    if (cJSON_IsNull(response_headers)) {
        response_headers = NULL;
    }
    if (response_headers) { 
    cJSON *response_headers_local_map = NULL;
    if(!cJSON_IsObject(response_headers) && !cJSON_IsNull(response_headers))
    {
        goto end;//primitive map container
    }
    if(cJSON_IsObject(response_headers))
    {
        response_headersList = list_createList();
        keyValuePair_t *localMapKeyPair;
        cJSON_ArrayForEach(response_headers_local_map, response_headers)
        {
            cJSON *localMapObject = response_headers_local_map;
            if(!cJSON_IsString(localMapObject))
            {
                goto end;
            }
            localMapKeyPair = keyValuePair_create(strdup(localMapObject->string),strdup(localMapObject->valuestring));
            list_addElement(response_headersList , localMapKeyPair);
        }
    }
    }

    // integration_log_client_request->response_status_code
    cJSON *response_status_code = cJSON_GetObjectItemCaseSensitive(integration_log_client_requestJSON, "response_status_code");
    if (cJSON_IsNull(response_status_code)) {
        response_status_code = NULL;
    }
    if (response_status_code) { 
    if(!cJSON_IsNumber(response_status_code))
    {
    goto end; //Numeric
    }
    response_status_code_local_var = malloc(sizeof(int));
    if(!response_status_code_local_var)
    {
        goto end;
    }
    *response_status_code_local_var = response_status_code->valuedouble;
    }


    if (host && !cJSON_IsNull(host)) host_local_str = strdup(host->valuestring);
    if (path && !cJSON_IsNull(path)) path_local_str = strdup(path->valuestring);

    integration_log_client_request_local_var = integration_log_client_request_create_internal (
        host_local_str,
        method_local_nonprim,
        path_local_str,
        request_headers ? request_headersList : NULL,
        response_headers ? response_headersList : NULL,
        response_status_code_local_var
        );

    if (!integration_log_client_request_local_var) {
        goto end;
    }

    return integration_log_client_request_local_var;
end:
    if (host_local_str) {
        free(host_local_str);
        host_local_str = NULL;
    }
    if (method_local_nonprim) {
        method_local_nonprim = 0;
    }
    if (path_local_str) {
        free(path_local_str);
        path_local_str = NULL;
    }
    if (request_headersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, request_headersList) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free(localKeyValue->key);
            localKeyValue->key = NULL;
            free(localKeyValue->value);
            localKeyValue->value = NULL;
            keyValuePair_free(localKeyValue);
            localKeyValue = NULL;
        }
        list_freeList(request_headersList);
        request_headersList = NULL;
    }
    if (response_headersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, response_headersList) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free(localKeyValue->key);
            localKeyValue->key = NULL;
            free(localKeyValue->value);
            localKeyValue->value = NULL;
            keyValuePair_free(localKeyValue);
            localKeyValue = NULL;
        }
        list_freeList(response_headersList);
        response_headersList = NULL;
    }
    if (response_status_code_local_var) {
        free(response_status_code_local_var);
        response_status_code_local_var = NULL;
    }
    return NULL;

}
