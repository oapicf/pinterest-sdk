#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "template_response_date_range_relative_date_range.h"



static template_response_date_range_relative_date_range_t *template_response_date_range_relative_date_range_create_internal(
    double end_days_in_past,
    double start_days_in_past,
    char *type
    ) {
    template_response_date_range_relative_date_range_t *template_response_date_range_relative_date_range_local_var = malloc(sizeof(template_response_date_range_relative_date_range_t));
    if (!template_response_date_range_relative_date_range_local_var) {
        return NULL;
    }
    template_response_date_range_relative_date_range_local_var->end_days_in_past = end_days_in_past;
    template_response_date_range_relative_date_range_local_var->start_days_in_past = start_days_in_past;
    template_response_date_range_relative_date_range_local_var->type = type;

    template_response_date_range_relative_date_range_local_var->_library_owned = 1;
    return template_response_date_range_relative_date_range_local_var;
}

__attribute__((deprecated)) template_response_date_range_relative_date_range_t *template_response_date_range_relative_date_range_create(
    double end_days_in_past,
    double start_days_in_past,
    char *type
    ) {
    return template_response_date_range_relative_date_range_create_internal (
        end_days_in_past,
        start_days_in_past,
        type
        );
}

void template_response_date_range_relative_date_range_free(template_response_date_range_relative_date_range_t *template_response_date_range_relative_date_range) {
    if(NULL == template_response_date_range_relative_date_range){
        return ;
    }
    if(template_response_date_range_relative_date_range->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "template_response_date_range_relative_date_range_free");
        return ;
    }
    listEntry_t *listEntry;
    if (template_response_date_range_relative_date_range->type) {
        free(template_response_date_range_relative_date_range->type);
        template_response_date_range_relative_date_range->type = NULL;
    }
    free(template_response_date_range_relative_date_range);
}

cJSON *template_response_date_range_relative_date_range_convertToJSON(template_response_date_range_relative_date_range_t *template_response_date_range_relative_date_range) {
    cJSON *item = cJSON_CreateObject();

    // template_response_date_range_relative_date_range->end_days_in_past
    if(template_response_date_range_relative_date_range->end_days_in_past) {
    if(cJSON_AddNumberToObject(item, "end_days_in_past", template_response_date_range_relative_date_range->end_days_in_past) == NULL) {
    goto fail; //Numeric
    }
    }


    // template_response_date_range_relative_date_range->start_days_in_past
    if(template_response_date_range_relative_date_range->start_days_in_past) {
    if(cJSON_AddNumberToObject(item, "start_days_in_past", template_response_date_range_relative_date_range->start_days_in_past) == NULL) {
    goto fail; //Numeric
    }
    }


    // template_response_date_range_relative_date_range->type
    if(template_response_date_range_relative_date_range->type) {
    if(cJSON_AddStringToObject(item, "type", template_response_date_range_relative_date_range->type) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

template_response_date_range_relative_date_range_t *template_response_date_range_relative_date_range_parseFromJSON(cJSON *template_response_date_range_relative_date_rangeJSON){

    template_response_date_range_relative_date_range_t *template_response_date_range_relative_date_range_local_var = NULL;

    // template_response_date_range_relative_date_range->end_days_in_past
    cJSON *end_days_in_past = cJSON_GetObjectItemCaseSensitive(template_response_date_range_relative_date_rangeJSON, "end_days_in_past");
    if (cJSON_IsNull(end_days_in_past)) {
        end_days_in_past = NULL;
    }
    if (end_days_in_past) { 
    if(!cJSON_IsNumber(end_days_in_past))
    {
    goto end; //Numeric
    }
    }

    // template_response_date_range_relative_date_range->start_days_in_past
    cJSON *start_days_in_past = cJSON_GetObjectItemCaseSensitive(template_response_date_range_relative_date_rangeJSON, "start_days_in_past");
    if (cJSON_IsNull(start_days_in_past)) {
        start_days_in_past = NULL;
    }
    if (start_days_in_past) { 
    if(!cJSON_IsNumber(start_days_in_past))
    {
    goto end; //Numeric
    }
    }

    // template_response_date_range_relative_date_range->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(template_response_date_range_relative_date_rangeJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (type) { 
    if(!cJSON_IsString(type) && !cJSON_IsNull(type))
    {
    goto end; //String
    }
    }


    template_response_date_range_relative_date_range_local_var = template_response_date_range_relative_date_range_create_internal (
        end_days_in_past ? end_days_in_past->valuedouble : 0,
        start_days_in_past ? start_days_in_past->valuedouble : 0,
        type && !cJSON_IsNull(type) ? strdup(type->valuestring) : NULL
        );

    return template_response_date_range_relative_date_range_local_var;
end:
    return NULL;

}
