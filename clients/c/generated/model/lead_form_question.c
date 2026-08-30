#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "lead_form_question.h"



static lead_form_question_t *lead_form_question_create_internal(
    pinterest_rest_api_lead_form_question_field_type__e custom_question_field_type,
    char *custom_question_label,
    list_t *custom_question_options,
    pinterest_rest_api_lead_form_question_type__e question_type
    ) {
    lead_form_question_t *lead_form_question_local_var = malloc(sizeof(lead_form_question_t));
    if (!lead_form_question_local_var) {
        return NULL;
    }
    memset(lead_form_question_local_var, 0, sizeof(lead_form_question_t));
    lead_form_question_local_var->_library_owned = 1;
    lead_form_question_local_var->custom_question_field_type = custom_question_field_type;
    lead_form_question_local_var->custom_question_label = custom_question_label;
    lead_form_question_local_var->custom_question_options = custom_question_options;
    lead_form_question_local_var->question_type = question_type;
    return lead_form_question_local_var;
}

__attribute__((deprecated)) lead_form_question_t *lead_form_question_create(
    pinterest_rest_api_lead_form_question_field_type__e custom_question_field_type,
    char *custom_question_label,
    list_t *custom_question_options,
    pinterest_rest_api_lead_form_question_type__e question_type
    ) {
    lead_form_question_t *result = lead_form_question_create_internal (
        custom_question_field_type,
        custom_question_label,
        custom_question_options,
        question_type
        );
    if (!result) {
    }
    return result;
}

void lead_form_question_free(lead_form_question_t *lead_form_question) {
    if(NULL == lead_form_question){
        return ;
    }
    if(lead_form_question->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "lead_form_question_free");
        return ;
    }
    listEntry_t *listEntry;
    if (lead_form_question->custom_question_label) {
        free(lead_form_question->custom_question_label);
        lead_form_question->custom_question_label = NULL;
    }
    if (lead_form_question->custom_question_options) {
        list_ForEach(listEntry, lead_form_question->custom_question_options) {
            free(listEntry->data);
        }
        list_freeList(lead_form_question->custom_question_options);
        lead_form_question->custom_question_options = NULL;
    }
    free(lead_form_question);
}

cJSON *lead_form_question_convertToJSON(lead_form_question_t *lead_form_question) {
    cJSON *item = cJSON_CreateObject();

    // lead_form_question->custom_question_field_type
    if(lead_form_question->custom_question_field_type != pinterest_rest_api_lead_form_question_field_type__NULL) {
    cJSON *custom_question_field_type_local_JSON = lead_form_question_field_type_convertToJSON(lead_form_question->custom_question_field_type);
    if(custom_question_field_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "custom_question_field_type", custom_question_field_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // lead_form_question->custom_question_label
    if(lead_form_question->custom_question_label) {
    if(cJSON_AddStringToObject(item, "custom_question_label", lead_form_question->custom_question_label) == NULL) {
    goto fail; //String
    }
    }


    // lead_form_question->custom_question_options
    if(lead_form_question->custom_question_options) {
    cJSON *custom_question_options = cJSON_AddArrayToObject(item, "custom_question_options");
    if(custom_question_options == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *custom_question_optionsListEntry;
    list_ForEach(custom_question_optionsListEntry, lead_form_question->custom_question_options) {
    if(cJSON_AddStringToObject(custom_question_options, "", custom_question_optionsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // lead_form_question->question_type
    if(lead_form_question->question_type != pinterest_rest_api_lead_form_question_type__NULL) {
    cJSON *question_type_local_JSON = lead_form_question_type_convertToJSON(lead_form_question->question_type);
    if(question_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "question_type", question_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

lead_form_question_t *lead_form_question_parseFromJSON(cJSON *lead_form_questionJSON){

    lead_form_question_t *lead_form_question_local_var = NULL;

    // define the local variable for lead_form_question->custom_question_field_type
    pinterest_rest_api_lead_form_question_field_type__e custom_question_field_type_local_nonprim = 0;

    char *custom_question_label_local_str = NULL;

    // define the local list for lead_form_question->custom_question_options
    list_t *custom_question_optionsList = NULL;

    // define the local variable for lead_form_question->question_type
    pinterest_rest_api_lead_form_question_type__e question_type_local_nonprim = 0;

    // lead_form_question->custom_question_field_type
    cJSON *custom_question_field_type = cJSON_GetObjectItemCaseSensitive(lead_form_questionJSON, "custom_question_field_type");
    if (cJSON_IsNull(custom_question_field_type)) {
        custom_question_field_type = NULL;
    }
    if (custom_question_field_type) { 
    custom_question_field_type_local_nonprim = lead_form_question_field_type_parseFromJSON(custom_question_field_type); //custom
    }

    // lead_form_question->custom_question_label
    cJSON *custom_question_label = cJSON_GetObjectItemCaseSensitive(lead_form_questionJSON, "custom_question_label");
    if (cJSON_IsNull(custom_question_label)) {
        custom_question_label = NULL;
    }
    if (custom_question_label) { 
    if(!cJSON_IsString(custom_question_label) && !cJSON_IsNull(custom_question_label))
    {
    goto end; //String
    }
    }

    // lead_form_question->custom_question_options
    cJSON *custom_question_options = cJSON_GetObjectItemCaseSensitive(lead_form_questionJSON, "custom_question_options");
    if (cJSON_IsNull(custom_question_options)) {
        custom_question_options = NULL;
    }
    if (custom_question_options) { 
    cJSON *custom_question_options_local = NULL;
    if(!cJSON_IsArray(custom_question_options)) {
        goto end;//primitive container
    }
    custom_question_optionsList = list_createList();

    cJSON_ArrayForEach(custom_question_options_local, custom_question_options)
    {
        if(!cJSON_IsString(custom_question_options_local))
        {
            goto end;
        }
        list_addElement(custom_question_optionsList , strdup(custom_question_options_local->valuestring));
    }
    }

    // lead_form_question->question_type
    cJSON *question_type = cJSON_GetObjectItemCaseSensitive(lead_form_questionJSON, "question_type");
    if (cJSON_IsNull(question_type)) {
        question_type = NULL;
    }
    if (question_type) { 
    question_type_local_nonprim = lead_form_question_type_parseFromJSON(question_type); //custom
    }


    if (custom_question_label && !cJSON_IsNull(custom_question_label)) custom_question_label_local_str = strdup(custom_question_label->valuestring);

    lead_form_question_local_var = lead_form_question_create_internal (
        custom_question_field_type ? custom_question_field_type_local_nonprim : 0,
        custom_question_label_local_str,
        custom_question_options ? custom_question_optionsList : NULL,
        question_type ? question_type_local_nonprim : 0
        );

    if (!lead_form_question_local_var) {
        goto end;
    }

    return lead_form_question_local_var;
end:
    if (custom_question_field_type_local_nonprim) {
        custom_question_field_type_local_nonprim = 0;
    }
    if (custom_question_label_local_str) {
        free(custom_question_label_local_str);
        custom_question_label_local_str = NULL;
    }
    if (custom_question_optionsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, custom_question_optionsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(custom_question_optionsList);
        custom_question_optionsList = NULL;
    }
    if (question_type_local_nonprim) {
        question_type_local_nonprim = 0;
    }
    return NULL;

}
