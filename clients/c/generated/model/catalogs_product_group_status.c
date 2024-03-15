#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_product_group_status.h"


char* catalogs_product_group_status_catalogs_product_group_status_ToString(pinterest_rest_api_catalogs_product_group_status__e catalogs_product_group_status) {
    char *catalogs_product_group_statusArray[] =  { "NULL", "ACTIVE", "INACTIVE" };
    return catalogs_product_group_statusArray[catalogs_product_group_status];
}

pinterest_rest_api_catalogs_product_group_status__e catalogs_product_group_status_catalogs_product_group_status_FromString(char* catalogs_product_group_status) {
    int stringToReturn = 0;
    char *catalogs_product_group_statusArray[] =  { "NULL", "ACTIVE", "INACTIVE" };
    size_t sizeofArray = sizeof(catalogs_product_group_statusArray) / sizeof(catalogs_product_group_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(catalogs_product_group_status, catalogs_product_group_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *catalogs_product_group_status_catalogs_product_group_status_convertToJSON(pinterest_rest_api_catalogs_product_group_status__e catalogs_product_group_status) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "catalogs_product_group_status", catalogs_product_group_status_catalogs_product_group_status_ToString(catalogs_product_group_status)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_catalogs_product_group_status__e catalogs_product_group_status_catalogs_product_group_status_parseFromJSON(cJSON *catalogs_product_group_statusJSON) {
    pinterest_rest_api_catalogs_product_group_status__e *catalogs_product_group_status = NULL;
    pinterest_rest_api_catalogs_product_group_status__e catalogs_product_group_statusVariable;
    cJSON *catalogs_product_group_statusVar = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_statusJSON, "catalogs_product_group_status");
    if(!cJSON_IsString(catalogs_product_group_statusVar) || (catalogs_product_group_statusVar->valuestring == NULL)){
        goto end;
    }
    catalogs_product_group_statusVariable = catalogs_product_group_status_catalogs_product_group_status_FromString(catalogs_product_group_statusVar->valuestring);
    return catalogs_product_group_statusVariable;
end:
    return 0;
}
