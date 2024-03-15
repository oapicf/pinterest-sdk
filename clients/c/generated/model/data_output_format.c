#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "data_output_format.h"


char* data_output_format_data_output_format_ToString(pinterest_rest_api_data_output_format__e data_output_format) {
    char *data_output_formatArray[] =  { "NULL", "JSON", "CSV" };
    return data_output_formatArray[data_output_format];
}

pinterest_rest_api_data_output_format__e data_output_format_data_output_format_FromString(char* data_output_format) {
    int stringToReturn = 0;
    char *data_output_formatArray[] =  { "NULL", "JSON", "CSV" };
    size_t sizeofArray = sizeof(data_output_formatArray) / sizeof(data_output_formatArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(data_output_format, data_output_formatArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *data_output_format_data_output_format_convertToJSON(pinterest_rest_api_data_output_format__e data_output_format) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "data_output_format", data_output_format_data_output_format_ToString(data_output_format)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_data_output_format__e data_output_format_data_output_format_parseFromJSON(cJSON *data_output_formatJSON) {
    pinterest_rest_api_data_output_format__e *data_output_format = NULL;
    pinterest_rest_api_data_output_format__e data_output_formatVariable;
    cJSON *data_output_formatVar = cJSON_GetObjectItemCaseSensitive(data_output_formatJSON, "data_output_format");
    if(!cJSON_IsString(data_output_formatVar) || (data_output_formatVar->valuestring == NULL)){
        goto end;
    }
    data_output_formatVariable = data_output_format_data_output_format_FromString(data_output_formatVar->valuestring);
    return data_output_formatVariable;
end:
    return 0;
}
