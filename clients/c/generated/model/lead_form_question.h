/*
 * lead_form_question.h
 *
 * 
 */

#ifndef _lead_form_question_H_
#define _lead_form_question_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct lead_form_question_t lead_form_question_t;

#include "lead_form_question_field_type.h"
#include "lead_form_question_type.h"

// Enum  for lead_form_question

typedef enum  { pinterest_rest_api_lead_form_question__NULL = 0, pinterest_rest_api_lead_form_question__CUSTOM, pinterest_rest_api_lead_form_question__FULL_NAME, pinterest_rest_api_lead_form_question__FIRST_NAME, pinterest_rest_api_lead_form_question__LAST_NAME, pinterest_rest_api_lead_form_question__EMAIL, pinterest_rest_api_lead_form_question__PHONE_NUMBER, pinterest_rest_api_lead_form_question__ZIP_CODE, pinterest_rest_api_lead_form_question__GENDER, pinterest_rest_api_lead_form_question__CITY, pinterest_rest_api_lead_form_question__COUNTRY, pinterest_rest_api_lead_form_question__STATE_PROVINCE, pinterest_rest_api_lead_form_question__ADDRESS, pinterest_rest_api_lead_form_question__DATE_OF_BIRTH, pinterest_rest_api_lead_form_question__AGE } pinterest_rest_api_lead_form_question__e;

char* lead_form_question_question_type_ToString(pinterest_rest_api_lead_form_question__e question_type);

pinterest_rest_api_lead_form_question__e lead_form_question_question_type_FromString(char* question_type);

// Enum  for lead_form_question

typedef enum  { pinterest_rest_api_lead_form_question__NULL = 0, pinterest_rest_api_lead_form_question__TEXT_FIELD, pinterest_rest_api_lead_form_question__TEXT_AREA, pinterest_rest_api_lead_form_question__RADIO_LIST, pinterest_rest_api_lead_form_question__CHECKBOX } pinterest_rest_api_lead_form_question__e;

char* lead_form_question_custom_question_field_type_ToString(pinterest_rest_api_lead_form_question__e custom_question_field_type);

pinterest_rest_api_lead_form_question__e lead_form_question_custom_question_field_type_FromString(char* custom_question_field_type);



typedef struct lead_form_question_t {
    lead_form_question_type_t *question_type; // custom
    lead_form_question_field_type_t *custom_question_field_type; // custom
    char *custom_question_label; // string
    list_t *custom_question_options; //primitive container

} lead_form_question_t;

lead_form_question_t *lead_form_question_create(
    lead_form_question_type_t *question_type,
    lead_form_question_field_type_t *custom_question_field_type,
    char *custom_question_label,
    list_t *custom_question_options
);

void lead_form_question_free(lead_form_question_t *lead_form_question);

lead_form_question_t *lead_form_question_parseFromJSON(cJSON *lead_form_questionJSON);

cJSON *lead_form_question_convertToJSON(lead_form_question_t *lead_form_question);

#endif /* _lead_form_question_H_ */

