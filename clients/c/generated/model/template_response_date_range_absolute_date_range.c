#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "template_response_date_range_absolute_date_range.h"



template_response_date_range_absolute_date_range_t *template_response_date_range_absolute_date_range_create(
    char *type,
    double start_date,
    double end_date
    ) {
    template_response_date_range_absolute_date_range_t *template_response_date_range_absolute_date_range_local_var = malloc(sizeof(template_response_date_range_absolute_date_range_t));
    if (!template_response_date_range_absolute_date_range_local_var) {
        return NULL;
    }
    template_response_date_range_absolute_date_range_local_var->type = type;
    template_response_date_range_absolute_date_range_local_var->start_date = start_date;
    template_response_date_range_absolute_date_range_local_var->end_date = end_date;

    return template_response_date_range_absolute_date_range_local_var;
}


void template_response_date_range_absolute_date_range_free(template_response_date_range_absolute_date_range_t *template_response_date_range_absolute_date_range) {
    if(NULL == template_response_date_range_absolute_date_range){
        return ;
    }
    listEntry_t *listEntry;
    if (template_response_date_range_absolute_date_range->type) {
        free(template_response_date_range_absolute_date_range->type);
        template_response_date_range_absolute_date_range->type = NULL;
    }
    free(template_response_date_range_absolute_date_range);
}

cJSON *template_response_date_range_absolute_date_range_convertToJSON(template_response_date_range_absolute_date_range_t *template_response_date_range_absolute_date_range) {
    cJSON *item = cJSON_CreateObject();

    // template_response_date_range_absolute_date_range->type
    if(template_response_date_range_absolute_date_range->type) {
    if(cJSON_AddStringToObject(item, "type", template_response_date_range_absolute_date_range->type) == NULL) {
    goto fail; //String
    }
    }


    // template_response_date_range_absolute_date_range->start_date
    if(template_response_date_range_absolute_date_range->start_date) {
    if(cJSON_AddNumberToObject(item, "start_date", template_response_date_range_absolute_date_range->start_date) == NULL) {
    goto fail; //Numeric
    }
    }


    // template_response_date_range_absolute_date_range->end_date
    if(template_response_date_range_absolute_date_range->end_date) {
    if(cJSON_AddNumberToObject(item, "end_date", template_response_date_range_absolute_date_range->end_date) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

template_response_date_range_absolute_date_range_t *template_response_date_range_absolute_date_range_parseFromJSON(cJSON *template_response_date_range_absolute_date_rangeJSON){

    template_response_date_range_absolute_date_range_t *template_response_date_range_absolute_date_range_local_var = NULL;

    // template_response_date_range_absolute_date_range->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(template_response_date_range_absolute_date_rangeJSON, "type");
    if (type) { 
    if(!cJSON_IsString(type) && !cJSON_IsNull(type))
    {
    goto end; //String
    }
    }

    // template_response_date_range_absolute_date_range->start_date
    cJSON *start_date = cJSON_GetObjectItemCaseSensitive(template_response_date_range_absolute_date_rangeJSON, "start_date");
    if (start_date) { 
    if(!cJSON_IsNumber(start_date))
    {
    goto end; //Numeric
    }
    }

    // template_response_date_range_absolute_date_range->end_date
    cJSON *end_date = cJSON_GetObjectItemCaseSensitive(template_response_date_range_absolute_date_rangeJSON, "end_date");
    if (end_date) { 
    if(!cJSON_IsNumber(end_date))
    {
    goto end; //Numeric
    }
    }


    template_response_date_range_absolute_date_range_local_var = template_response_date_range_absolute_date_range_create (
        type && !cJSON_IsNull(type) ? strdup(type->valuestring) : NULL,
        start_date ? start_date->valuedouble : 0,
        end_date ? end_date->valuedouble : 0
        );

    return template_response_date_range_absolute_date_range_local_var;
end:
    return NULL;

}
