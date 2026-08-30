#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_ai_content_disclosure_label.h"


char* catalogs_ai_content_disclosure_label_catalogs_ai_content_disclosure_label_ToString(pinterest_rest_api_catalogs_ai_content_disclosure_label__e catalogs_ai_content_disclosure_label) {
    char *catalogs_ai_content_disclosure_labelArray[] =  { "NULL", "ai_modified", "synthetic_performer" };
    return catalogs_ai_content_disclosure_labelArray[catalogs_ai_content_disclosure_label];
}

pinterest_rest_api_catalogs_ai_content_disclosure_label__e catalogs_ai_content_disclosure_label_catalogs_ai_content_disclosure_label_FromString(char* catalogs_ai_content_disclosure_label) {
    int stringToReturn = 0;
    char *catalogs_ai_content_disclosure_labelArray[] =  { "NULL", "ai_modified", "synthetic_performer" };
    size_t sizeofArray = sizeof(catalogs_ai_content_disclosure_labelArray) / sizeof(catalogs_ai_content_disclosure_labelArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(catalogs_ai_content_disclosure_label, catalogs_ai_content_disclosure_labelArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *catalogs_ai_content_disclosure_label_convertToJSON(pinterest_rest_api_catalogs_ai_content_disclosure_label__e catalogs_ai_content_disclosure_label) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "catalogs_ai_content_disclosure_label", catalogs_ai_content_disclosure_label_catalogs_ai_content_disclosure_label_ToString(catalogs_ai_content_disclosure_label)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_catalogs_ai_content_disclosure_label__e catalogs_ai_content_disclosure_label_parseFromJSON(cJSON *catalogs_ai_content_disclosure_labelJSON) {
    if(!cJSON_IsString(catalogs_ai_content_disclosure_labelJSON) || (catalogs_ai_content_disclosure_labelJSON->valuestring == NULL)) {
        return 0;
    }
    return catalogs_ai_content_disclosure_label_catalogs_ai_content_disclosure_label_FromString(catalogs_ai_content_disclosure_labelJSON->valuestring);
}
