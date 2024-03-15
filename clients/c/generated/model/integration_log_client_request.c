#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "integration_log_client_request.h"


char* integration_log_client_request_method_ToString(pinterest_rest_api_integration_log_client_request_METHOD_e method) {
    char* methodArray[] =  { "NULL", "GET", "HEAD", "POST", "PUT", "DELETE", "CONNECT", "OPTIONS", "TRACE", "PATCH" };
    return methodArray[method];
}

pinterest_rest_api_integration_log_client_request_METHOD_e integration_log_client_request_method_FromString(char* method){
    int stringToReturn = 0;
    char *methodArray[] =  { "NULL", "GET", "HEAD", "POST", "PUT", "DELETE", "CONNECT", "OPTIONS", "TRACE", "PATCH" };
    size_t sizeofArray = sizeof(methodArray) / sizeof(methodArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(method, methodArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

integration_log_client_request_t *integration_log_client_request_create(
    pinterest_rest_api_integration_log_client_request_METHOD_e method,
    char *host,
    char *path,
    list_t* request_headers,
    list_t* response_headers,
    int response_status_code
    ) {
    integration_log_client_request_t *integration_log_client_request_local_var = malloc(sizeof(integration_log_client_request_t));
    if (!integration_log_client_request_local_var) {
        return NULL;
    }
    integration_log_client_request_local_var->method = method;
    integration_log_client_request_local_var->host = host;
    integration_log_client_request_local_var->path = path;
    integration_log_client_request_local_var->request_headers = request_headers;
    integration_log_client_request_local_var->response_headers = response_headers;
    integration_log_client_request_local_var->response_status_code = response_status_code;

    return integration_log_client_request_local_var;
}


void integration_log_client_request_free(integration_log_client_request_t *integration_log_client_request) {
    if(NULL == integration_log_client_request){
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
            keyValuePair_t *localKeyValue = (keyValuePair_t*) listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(integration_log_client_request->request_headers);
        integration_log_client_request->request_headers = NULL;
    }
    if (integration_log_client_request->response_headers) {
        list_ForEach(listEntry, integration_log_client_request->response_headers) {
            keyValuePair_t *localKeyValue = (keyValuePair_t*) listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(integration_log_client_request->response_headers);
        integration_log_client_request->response_headers = NULL;
    }
    free(integration_log_client_request);
}

cJSON *integration_log_client_request_convertToJSON(integration_log_client_request_t *integration_log_client_request) {
    cJSON *item = cJSON_CreateObject();

    // integration_log_client_request->method
    if (pinterest_rest_api_integration_log_client_request_METHOD_NULL == integration_log_client_request->method) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "method", methodintegration_log_client_request_ToString(integration_log_client_request->method)) == NULL)
    {
    goto fail; //Enum
    }


    // integration_log_client_request->host
    if (!integration_log_client_request->host) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "host", integration_log_client_request->host) == NULL) {
    goto fail; //String
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
        keyValuePair_t *localKeyValue = (keyValuePair_t*)request_headersListEntry->data;
        if(cJSON_AddStringToObject(localMapObject, localKeyValue->key, (char*)localKeyValue->value) == NULL)
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
        keyValuePair_t *localKeyValue = (keyValuePair_t*)response_headersListEntry->data;
        if(cJSON_AddStringToObject(localMapObject, localKeyValue->key, (char*)localKeyValue->value) == NULL)
        {
            goto fail;
        }
    }
    }
    }


    // integration_log_client_request->response_status_code
    if(integration_log_client_request->response_status_code) {
    if(cJSON_AddNumberToObject(item, "response_status_code", integration_log_client_request->response_status_code) == NULL) {
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

    // define the local map for integration_log_client_request->request_headers
    list_t *request_headersList = NULL;

    // define the local map for integration_log_client_request->response_headers
    list_t *response_headersList = NULL;

    // integration_log_client_request->method
    cJSON *method = cJSON_GetObjectItemCaseSensitive(integration_log_client_requestJSON, "method");
    if (!method) {
        goto end;
    }

    pinterest_rest_api_integration_log_client_request_METHOD_e methodVariable;
    
    if(!cJSON_IsString(method))
    {
    goto end; //Enum
    }
    methodVariable = integration_log_client_request_method_FromString(method->valuestring);

    // integration_log_client_request->host
    cJSON *host = cJSON_GetObjectItemCaseSensitive(integration_log_client_requestJSON, "host");
    if (!host) {
        goto end;
    }

    
    if(!cJSON_IsString(host))
    {
    goto end; //String
    }

    // integration_log_client_request->path
    cJSON *path = cJSON_GetObjectItemCaseSensitive(integration_log_client_requestJSON, "path");
    if (!path) {
        goto end;
    }

    
    if(!cJSON_IsString(path))
    {
    goto end; //String
    }

    // integration_log_client_request->request_headers
    cJSON *request_headers = cJSON_GetObjectItemCaseSensitive(integration_log_client_requestJSON, "request_headers");
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
    if (response_status_code) { 
    if(!cJSON_IsNumber(response_status_code))
    {
    goto end; //Numeric
    }
    }


    integration_log_client_request_local_var = integration_log_client_request_create (
        methodVariable,
        strdup(host->valuestring),
        strdup(path->valuestring),
        request_headers ? request_headersList : NULL,
        response_headers ? response_headersList : NULL,
        response_status_code ? response_status_code->valuedouble : 0
        );

    return integration_log_client_request_local_var;
end:
    if (request_headersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, request_headersList) {
            keyValuePair_t *localKeyValue = (keyValuePair_t*) listEntry->data;
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
            keyValuePair_t *localKeyValue = (keyValuePair_t*) listEntry->data;
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
    return NULL;

}
