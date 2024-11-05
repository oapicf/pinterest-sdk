/*
 * lead_form_question_field_type.h
 *
 * Lead form question field type
 */

#ifndef _lead_form_question_field_type_H_
#define _lead_form_question_field_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct lead_form_question_field_type_t lead_form_question_field_type_t;


// Enum  for lead_form_question_field_type

typedef enum { pinterest_rest_api_lead_form_question_field_type__NULL = 0, pinterest_rest_api_lead_form_question_field_type__TEXT_FIELD, pinterest_rest_api_lead_form_question_field_type__TEXT_AREA, pinterest_rest_api_lead_form_question_field_type__RADIO_LIST, pinterest_rest_api_lead_form_question_field_type__CHECKBOX } pinterest_rest_api_lead_form_question_field_type__e;

char* lead_form_question_field_type_lead_form_question_field_type_ToString(pinterest_rest_api_lead_form_question_field_type__e lead_form_question_field_type);

pinterest_rest_api_lead_form_question_field_type__e lead_form_question_field_type_lead_form_question_field_type_FromString(char* lead_form_question_field_type);

//cJSON *lead_form_question_field_type_lead_form_question_field_type_convertToJSON(pinterest_rest_api_lead_form_question_field_type__e lead_form_question_field_type);

//pinterest_rest_api_lead_form_question_field_type__e lead_form_question_field_type_lead_form_question_field_type_parseFromJSON(cJSON *lead_form_question_field_typeJSON);

#endif /* _lead_form_question_field_type_H_ */

