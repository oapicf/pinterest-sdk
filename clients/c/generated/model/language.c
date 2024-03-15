#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "language.h"


char* language_language_ToString(pinterest_rest_api_language__e language) {
    char *languageArray[] =  { "NULL", "AM", "AR", "AZ", "BG", "BN", "BS", "CA", "CS", "DA", "DV", "DZ", "DE", "EL", "EN", "ES", "ET", "FA", "FI", "FR", "HE", "HI", "HR", "HU", "HY", "ID", "IN", "IS", "IT", "IW", "JA", "KA", "KM", "KO", "LO", "LT", "LV", "MK", "MN", "MS", "MY", "NB", "NE", "NL", "NO", "PL", "PT", "RO", "RU", "SK", "SL", "SQ", "SR", "SV", "TL", "UK", "VI", "TE", "TH", "TR", "XX", "ZH" };
    return languageArray[language];
}

pinterest_rest_api_language__e language_language_FromString(char* language) {
    int stringToReturn = 0;
    char *languageArray[] =  { "NULL", "AM", "AR", "AZ", "BG", "BN", "BS", "CA", "CS", "DA", "DV", "DZ", "DE", "EL", "EN", "ES", "ET", "FA", "FI", "FR", "HE", "HI", "HR", "HU", "HY", "ID", "IN", "IS", "IT", "IW", "JA", "KA", "KM", "KO", "LO", "LT", "LV", "MK", "MN", "MS", "MY", "NB", "NE", "NL", "NO", "PL", "PT", "RO", "RU", "SK", "SL", "SQ", "SR", "SV", "TL", "UK", "VI", "TE", "TH", "TR", "XX", "ZH" };
    size_t sizeofArray = sizeof(languageArray) / sizeof(languageArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(language, languageArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *language_language_convertToJSON(pinterest_rest_api_language__e language) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "language", language_language_ToString(language)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_language__e language_language_parseFromJSON(cJSON *languageJSON) {
    pinterest_rest_api_language__e *language = NULL;
    pinterest_rest_api_language__e languageVariable;
    cJSON *languageVar = cJSON_GetObjectItemCaseSensitive(languageJSON, "language");
    if(!cJSON_IsString(languageVar) || (languageVar->valuestring == NULL)){
        goto end;
    }
    languageVariable = language_language_FromString(languageVar->valuestring);
    return languageVariable;
end:
    return 0;
}
