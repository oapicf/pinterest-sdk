#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "lead_form_question_type.h"


char* lead_form_question_type_lead_form_question_type_ToString(pinterest_rest_api_lead_form_question_type__e lead_form_question_type) {
    char *lead_form_question_typeArray[] =  { "NULL", "CUSTOM", "FULL_NAME", "FIRST_NAME", "LAST_NAME", "EMAIL", "PHONE_NUMBER", "ZIP_CODE", "AGE", "GENDER", "CITY", "COUNTRY", "PREFERRED_CONTACT_METHOD", "STATE_PROVINCE", "ADDRESS", "DATE_OF_BIRTH" };
    return lead_form_question_typeArray[lead_form_question_type];
}

pinterest_rest_api_lead_form_question_type__e lead_form_question_type_lead_form_question_type_FromString(char* lead_form_question_type) {
    int stringToReturn = 0;
    char *lead_form_question_typeArray[] =  { "NULL", "CUSTOM", "FULL_NAME", "FIRST_NAME", "LAST_NAME", "EMAIL", "PHONE_NUMBER", "ZIP_CODE", "AGE", "GENDER", "CITY", "COUNTRY", "PREFERRED_CONTACT_METHOD", "STATE_PROVINCE", "ADDRESS", "DATE_OF_BIRTH" };
    size_t sizeofArray = sizeof(lead_form_question_typeArray) / sizeof(lead_form_question_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(lead_form_question_type, lead_form_question_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *lead_form_question_type_lead_form_question_type_convertToJSON(pinterest_rest_api_lead_form_question_type__e lead_form_question_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "lead_form_question_type", lead_form_question_type_lead_form_question_type_ToString(lead_form_question_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_lead_form_question_type__e lead_form_question_type_lead_form_question_type_parseFromJSON(cJSON *lead_form_question_typeJSON) {
    pinterest_rest_api_lead_form_question_type__e *lead_form_question_type = NULL;
    pinterest_rest_api_lead_form_question_type__e lead_form_question_typeVariable;
    cJSON *lead_form_question_typeVar = cJSON_GetObjectItemCaseSensitive(lead_form_question_typeJSON, "lead_form_question_type");
    if(!cJSON_IsString(lead_form_question_typeVar) || (lead_form_question_typeVar->valuestring == NULL)){
        goto end;
    }
    lead_form_question_typeVariable = lead_form_question_type_lead_form_question_type_FromString(lead_form_question_typeVar->valuestring);
    return lead_form_question_typeVariable;
end:
    return 0;
}
