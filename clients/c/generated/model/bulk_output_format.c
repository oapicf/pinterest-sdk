#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "bulk_output_format.h"


char* bulk_output_format_bulk_output_format_ToString(pinterest_rest_api_bulk_output_format__e bulk_output_format) {
    char *bulk_output_formatArray[] =  { "NULL", "CSV", "JSON" };
    return bulk_output_formatArray[bulk_output_format];
}

pinterest_rest_api_bulk_output_format__e bulk_output_format_bulk_output_format_FromString(char* bulk_output_format) {
    int stringToReturn = 0;
    char *bulk_output_formatArray[] =  { "NULL", "CSV", "JSON" };
    size_t sizeofArray = sizeof(bulk_output_formatArray) / sizeof(bulk_output_formatArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(bulk_output_format, bulk_output_formatArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *bulk_output_format_bulk_output_format_convertToJSON(pinterest_rest_api_bulk_output_format__e bulk_output_format) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "bulk_output_format", bulk_output_format_bulk_output_format_ToString(bulk_output_format)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_bulk_output_format__e bulk_output_format_bulk_output_format_parseFromJSON(cJSON *bulk_output_formatJSON) {
    pinterest_rest_api_bulk_output_format__e *bulk_output_format = NULL;
    pinterest_rest_api_bulk_output_format__e bulk_output_formatVariable;
    cJSON *bulk_output_formatVar = cJSON_GetObjectItemCaseSensitive(bulk_output_formatJSON, "bulk_output_format");
    if(!cJSON_IsString(bulk_output_formatVar) || (bulk_output_formatVar->valuestring == NULL)){
        goto end;
    }
    bulk_output_formatVariable = bulk_output_format_bulk_output_format_FromString(bulk_output_formatVar->valuestring);
    return bulk_output_formatVariable;
end:
    return 0;
}
