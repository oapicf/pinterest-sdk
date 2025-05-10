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



typedef struct lead_form_question_t {
    pinterest_rest_api_lead_form_question_type__e question_type; //referenced enum
    pinterest_rest_api_lead_form_question_field_type__e custom_question_field_type; //referenced enum
    char *custom_question_label; // string
    list_t *custom_question_options; //primitive container

    int _library_owned; // Is the library responsible for freeing this object?
} lead_form_question_t;

__attribute__((deprecated)) lead_form_question_t *lead_form_question_create(
    pinterest_rest_api_lead_form_question_type__e question_type,
    pinterest_rest_api_lead_form_question_field_type__e custom_question_field_type,
    char *custom_question_label,
    list_t *custom_question_options
);

void lead_form_question_free(lead_form_question_t *lead_form_question);

lead_form_question_t *lead_form_question_parseFromJSON(cJSON *lead_form_questionJSON);

cJSON *lead_form_question_convertToJSON(lead_form_question_t *lead_form_question);

#endif /* _lead_form_question_H_ */

