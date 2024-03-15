#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "template_response_date_range_dynamic_date_range.h"


char* template_response_date_range_dynamic_date_range_range_ToString(pinterest_rest_api_template_response_date_range_dynamic_date_range_RANGE_e range) {
    char* rangeArray[] =  { "NULL", "YEAR_TO_DATE", "QUARTER_TO_DATE", "MONTH_TO_DATE", "LAST_MONTH" };
    return rangeArray[range];
}

pinterest_rest_api_template_response_date_range_dynamic_date_range_RANGE_e template_response_date_range_dynamic_date_range_range_FromString(char* range){
    int stringToReturn = 0;
    char *rangeArray[] =  { "NULL", "YEAR_TO_DATE", "QUARTER_TO_DATE", "MONTH_TO_DATE", "LAST_MONTH" };
    size_t sizeofArray = sizeof(rangeArray) / sizeof(rangeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(range, rangeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

template_response_date_range_dynamic_date_range_t *template_response_date_range_dynamic_date_range_create(
    char *type,
    pinterest_rest_api_template_response_date_range_dynamic_date_range_RANGE_e range
    ) {
    template_response_date_range_dynamic_date_range_t *template_response_date_range_dynamic_date_range_local_var = malloc(sizeof(template_response_date_range_dynamic_date_range_t));
    if (!template_response_date_range_dynamic_date_range_local_var) {
        return NULL;
    }
    template_response_date_range_dynamic_date_range_local_var->type = type;
    template_response_date_range_dynamic_date_range_local_var->range = range;

    return template_response_date_range_dynamic_date_range_local_var;
}


void template_response_date_range_dynamic_date_range_free(template_response_date_range_dynamic_date_range_t *template_response_date_range_dynamic_date_range) {
    if(NULL == template_response_date_range_dynamic_date_range){
        return ;
    }
    listEntry_t *listEntry;
    if (template_response_date_range_dynamic_date_range->type) {
        free(template_response_date_range_dynamic_date_range->type);
        template_response_date_range_dynamic_date_range->type = NULL;
    }
    free(template_response_date_range_dynamic_date_range);
}

cJSON *template_response_date_range_dynamic_date_range_convertToJSON(template_response_date_range_dynamic_date_range_t *template_response_date_range_dynamic_date_range) {
    cJSON *item = cJSON_CreateObject();

    // template_response_date_range_dynamic_date_range->type
    if(template_response_date_range_dynamic_date_range->type) {
    if(cJSON_AddStringToObject(item, "type", template_response_date_range_dynamic_date_range->type) == NULL) {
    goto fail; //String
    }
    }


    // template_response_date_range_dynamic_date_range->range
    if(template_response_date_range_dynamic_date_range->range != pinterest_rest_api_template_response_date_range_dynamic_date_range_RANGE_NULL) {
    if(cJSON_AddStringToObject(item, "range", rangetemplate_response_date_range_dynamic_date_range_ToString(template_response_date_range_dynamic_date_range->range)) == NULL)
    {
    goto fail; //Enum
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

template_response_date_range_dynamic_date_range_t *template_response_date_range_dynamic_date_range_parseFromJSON(cJSON *template_response_date_range_dynamic_date_rangeJSON){

    template_response_date_range_dynamic_date_range_t *template_response_date_range_dynamic_date_range_local_var = NULL;

    // template_response_date_range_dynamic_date_range->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(template_response_date_range_dynamic_date_rangeJSON, "type");
    if (type) { 
    if(!cJSON_IsString(type) && !cJSON_IsNull(type))
    {
    goto end; //String
    }
    }

    // template_response_date_range_dynamic_date_range->range
    cJSON *range = cJSON_GetObjectItemCaseSensitive(template_response_date_range_dynamic_date_rangeJSON, "range");
    pinterest_rest_api_template_response_date_range_dynamic_date_range_RANGE_e rangeVariable;
    if (range) { 
    if(!cJSON_IsString(range))
    {
    goto end; //Enum
    }
    rangeVariable = template_response_date_range_dynamic_date_range_range_FromString(range->valuestring);
    }


    template_response_date_range_dynamic_date_range_local_var = template_response_date_range_dynamic_date_range_create (
        type && !cJSON_IsNull(type) ? strdup(type->valuestring) : NULL,
        range ? rangeVariable : pinterest_rest_api_template_response_date_range_dynamic_date_range_RANGE_NULL
        );

    return template_response_date_range_dynamic_date_range_local_var;
end:
    return NULL;

}
