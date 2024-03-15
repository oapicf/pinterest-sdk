#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "product_group_summary_status.h"


char* product_group_summary_status_product_group_summary_status_ToString(pinterest_rest_api_product_group_summary_status__e product_group_summary_status) {
    char *product_group_summary_statusArray[] =  { "NULL", "RUNNING", "PAUSED", "EXCLUDED", "ARCHIVED" };
    return product_group_summary_statusArray[product_group_summary_status];
}

pinterest_rest_api_product_group_summary_status__e product_group_summary_status_product_group_summary_status_FromString(char* product_group_summary_status) {
    int stringToReturn = 0;
    char *product_group_summary_statusArray[] =  { "NULL", "RUNNING", "PAUSED", "EXCLUDED", "ARCHIVED" };
    size_t sizeofArray = sizeof(product_group_summary_statusArray) / sizeof(product_group_summary_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(product_group_summary_status, product_group_summary_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *product_group_summary_status_product_group_summary_status_convertToJSON(pinterest_rest_api_product_group_summary_status__e product_group_summary_status) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "product_group_summary_status", product_group_summary_status_product_group_summary_status_ToString(product_group_summary_status)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_product_group_summary_status__e product_group_summary_status_product_group_summary_status_parseFromJSON(cJSON *product_group_summary_statusJSON) {
    pinterest_rest_api_product_group_summary_status__e *product_group_summary_status = NULL;
    pinterest_rest_api_product_group_summary_status__e product_group_summary_statusVariable;
    cJSON *product_group_summary_statusVar = cJSON_GetObjectItemCaseSensitive(product_group_summary_statusJSON, "product_group_summary_status");
    if(!cJSON_IsString(product_group_summary_statusVar) || (product_group_summary_statusVar->valuestring == NULL)){
        goto end;
    }
    product_group_summary_statusVariable = product_group_summary_status_product_group_summary_status_FromString(product_group_summary_statusVar->valuestring);
    return product_group_summary_statusVariable;
end:
    return 0;
}
