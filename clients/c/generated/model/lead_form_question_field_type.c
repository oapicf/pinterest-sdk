#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "lead_form_question_field_type.h"


char* lead_form_question_field_type_lead_form_question_field_type_ToString(pinterest_rest_api_lead_form_question_field_type__e lead_form_question_field_type) {
    char *lead_form_question_field_typeArray[] =  { "NULL", "TEXT_FIELD", "TEXT_AREA", "RADIO_LIST", "CHECKBOX", "" };
    return lead_form_question_field_typeArray[lead_form_question_field_type];
}

pinterest_rest_api_lead_form_question_field_type__e lead_form_question_field_type_lead_form_question_field_type_FromString(char* lead_form_question_field_type) {
    int stringToReturn = 0;
    char *lead_form_question_field_typeArray[] =  { "NULL", "TEXT_FIELD", "TEXT_AREA", "RADIO_LIST", "CHECKBOX", "" };
    size_t sizeofArray = sizeof(lead_form_question_field_typeArray) / sizeof(lead_form_question_field_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(lead_form_question_field_type, lead_form_question_field_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *lead_form_question_field_type_lead_form_question_field_type_convertToJSON(pinterest_rest_api_lead_form_question_field_type__e lead_form_question_field_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "lead_form_question_field_type", lead_form_question_field_type_lead_form_question_field_type_ToString(lead_form_question_field_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_lead_form_question_field_type__e lead_form_question_field_type_lead_form_question_field_type_parseFromJSON(cJSON *lead_form_question_field_typeJSON) {
    pinterest_rest_api_lead_form_question_field_type__e *lead_form_question_field_type = NULL;
    pinterest_rest_api_lead_form_question_field_type__e lead_form_question_field_typeVariable;
    cJSON *lead_form_question_field_typeVar = cJSON_GetObjectItemCaseSensitive(lead_form_question_field_typeJSON, "lead_form_question_field_type");
    if(!cJSON_IsString(lead_form_question_field_typeVar) || (lead_form_question_field_typeVar->valuestring == NULL)){
        goto end;
    }
    lead_form_question_field_typeVariable = lead_form_question_field_type_lead_form_question_field_type_FromString(lead_form_question_field_typeVar->valuestring);
    return lead_form_question_field_typeVariable;
end:
    return 0;
}
