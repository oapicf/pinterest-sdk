#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_locale.h"


char* catalogs_locale_catalogs_locale_ToString(pinterest_rest_api_catalogs_locale__e catalogs_locale) {
    char *catalogs_localeArray[] =  { "NULL", "af-ZA", "ar-SA", "bg-BG", "bn-IN", "cs-CZ", "da-DK", "de", "el-GR", "en-AU", "en-CA", "en-GB", "en-IN", "en-US", "es-419", "es-AR", "es-ES", "es-MX", "fi-FI", "fr", "fr-CA", "he-IL", "hi-IN", "hr-HR", "hu-HU", "id-ID", "it", "ja", "ko-KR", "ms-MY", "nb-NO", "nl", "pl-PL", "pt-BR", "pt-PT", "ro-RO", "ru-RU", "sk-SK", "sv-SE", "te-IN", "th-TH", "tl-PH", "tr", "uk-UA", "vi-VN", "zh-CN", "zh-TW" };
    return catalogs_localeArray[catalogs_locale];
}

pinterest_rest_api_catalogs_locale__e catalogs_locale_catalogs_locale_FromString(char* catalogs_locale) {
    int stringToReturn = 0;
    char *catalogs_localeArray[] =  { "NULL", "af-ZA", "ar-SA", "bg-BG", "bn-IN", "cs-CZ", "da-DK", "de", "el-GR", "en-AU", "en-CA", "en-GB", "en-IN", "en-US", "es-419", "es-AR", "es-ES", "es-MX", "fi-FI", "fr", "fr-CA", "he-IL", "hi-IN", "hr-HR", "hu-HU", "id-ID", "it", "ja", "ko-KR", "ms-MY", "nb-NO", "nl", "pl-PL", "pt-BR", "pt-PT", "ro-RO", "ru-RU", "sk-SK", "sv-SE", "te-IN", "th-TH", "tl-PH", "tr", "uk-UA", "vi-VN", "zh-CN", "zh-TW" };
    size_t sizeofArray = sizeof(catalogs_localeArray) / sizeof(catalogs_localeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(catalogs_locale, catalogs_localeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *catalogs_locale_catalogs_locale_convertToJSON(pinterest_rest_api_catalogs_locale__e catalogs_locale) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "catalogs_locale", catalogs_locale_catalogs_locale_ToString(catalogs_locale)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_catalogs_locale__e catalogs_locale_catalogs_locale_parseFromJSON(cJSON *catalogs_localeJSON) {
    pinterest_rest_api_catalogs_locale__e *catalogs_locale = NULL;
    pinterest_rest_api_catalogs_locale__e catalogs_localeVariable;
    cJSON *catalogs_localeVar = cJSON_GetObjectItemCaseSensitive(catalogs_localeJSON, "catalogs_locale");
    if(!cJSON_IsString(catalogs_localeVar) || (catalogs_localeVar->valuestring == NULL)){
        goto end;
    }
    catalogs_localeVariable = catalogs_locale_catalogs_locale_FromString(catalogs_localeVar->valuestring);
    return catalogs_localeVariable;
end:
    return 0;
}
