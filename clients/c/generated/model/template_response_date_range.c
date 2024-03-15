#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "template_response_date_range.h"



template_response_date_range_t *template_response_date_range_create(
    template_response_date_range_dynamic_date_range_t *dynamic_date_range,
    template_response_date_range_relative_date_range_t *relative_date_range,
    template_response_date_range_absolute_date_range_t *absolute_date_range
    ) {
    template_response_date_range_t *template_response_date_range_local_var = malloc(sizeof(template_response_date_range_t));
    if (!template_response_date_range_local_var) {
        return NULL;
    }
    template_response_date_range_local_var->dynamic_date_range = dynamic_date_range;
    template_response_date_range_local_var->relative_date_range = relative_date_range;
    template_response_date_range_local_var->absolute_date_range = absolute_date_range;

    return template_response_date_range_local_var;
}


void template_response_date_range_free(template_response_date_range_t *template_response_date_range) {
    if(NULL == template_response_date_range){
        return ;
    }
    listEntry_t *listEntry;
    if (template_response_date_range->dynamic_date_range) {
        template_response_date_range_dynamic_date_range_free(template_response_date_range->dynamic_date_range);
        template_response_date_range->dynamic_date_range = NULL;
    }
    if (template_response_date_range->relative_date_range) {
        template_response_date_range_relative_date_range_free(template_response_date_range->relative_date_range);
        template_response_date_range->relative_date_range = NULL;
    }
    if (template_response_date_range->absolute_date_range) {
        template_response_date_range_absolute_date_range_free(template_response_date_range->absolute_date_range);
        template_response_date_range->absolute_date_range = NULL;
    }
    free(template_response_date_range);
}

cJSON *template_response_date_range_convertToJSON(template_response_date_range_t *template_response_date_range) {
    cJSON *item = cJSON_CreateObject();

    // template_response_date_range->dynamic_date_range
    if(template_response_date_range->dynamic_date_range) {
    cJSON *dynamic_date_range_local_JSON = template_response_date_range_dynamic_date_range_convertToJSON(template_response_date_range->dynamic_date_range);
    if(dynamic_date_range_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "dynamic_date_range", dynamic_date_range_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // template_response_date_range->relative_date_range
    if(template_response_date_range->relative_date_range) {
    cJSON *relative_date_range_local_JSON = template_response_date_range_relative_date_range_convertToJSON(template_response_date_range->relative_date_range);
    if(relative_date_range_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "relative_date_range", relative_date_range_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // template_response_date_range->absolute_date_range
    if(template_response_date_range->absolute_date_range) {
    cJSON *absolute_date_range_local_JSON = template_response_date_range_absolute_date_range_convertToJSON(template_response_date_range->absolute_date_range);
    if(absolute_date_range_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "absolute_date_range", absolute_date_range_local_JSON);
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

template_response_date_range_t *template_response_date_range_parseFromJSON(cJSON *template_response_date_rangeJSON){

    template_response_date_range_t *template_response_date_range_local_var = NULL;

    // define the local variable for template_response_date_range->dynamic_date_range
    template_response_date_range_dynamic_date_range_t *dynamic_date_range_local_nonprim = NULL;

    // define the local variable for template_response_date_range->relative_date_range
    template_response_date_range_relative_date_range_t *relative_date_range_local_nonprim = NULL;

    // define the local variable for template_response_date_range->absolute_date_range
    template_response_date_range_absolute_date_range_t *absolute_date_range_local_nonprim = NULL;

    // template_response_date_range->dynamic_date_range
    cJSON *dynamic_date_range = cJSON_GetObjectItemCaseSensitive(template_response_date_rangeJSON, "dynamic_date_range");
    if (dynamic_date_range) { 
    dynamic_date_range_local_nonprim = template_response_date_range_dynamic_date_range_parseFromJSON(dynamic_date_range); //nonprimitive
    }

    // template_response_date_range->relative_date_range
    cJSON *relative_date_range = cJSON_GetObjectItemCaseSensitive(template_response_date_rangeJSON, "relative_date_range");
    if (relative_date_range) { 
    relative_date_range_local_nonprim = template_response_date_range_relative_date_range_parseFromJSON(relative_date_range); //nonprimitive
    }

    // template_response_date_range->absolute_date_range
    cJSON *absolute_date_range = cJSON_GetObjectItemCaseSensitive(template_response_date_rangeJSON, "absolute_date_range");
    if (absolute_date_range) { 
    absolute_date_range_local_nonprim = template_response_date_range_absolute_date_range_parseFromJSON(absolute_date_range); //nonprimitive
    }


    template_response_date_range_local_var = template_response_date_range_create (
        dynamic_date_range ? dynamic_date_range_local_nonprim : NULL,
        relative_date_range ? relative_date_range_local_nonprim : NULL,
        absolute_date_range ? absolute_date_range_local_nonprim : NULL
        );

    return template_response_date_range_local_var;
end:
    if (dynamic_date_range_local_nonprim) {
        template_response_date_range_dynamic_date_range_free(dynamic_date_range_local_nonprim);
        dynamic_date_range_local_nonprim = NULL;
    }
    if (relative_date_range_local_nonprim) {
        template_response_date_range_relative_date_range_free(relative_date_range_local_nonprim);
        relative_date_range_local_nonprim = NULL;
    }
    if (absolute_date_range_local_nonprim) {
        template_response_date_range_absolute_date_range_free(absolute_date_range_local_nonprim);
        absolute_date_range_local_nonprim = NULL;
    }
    return NULL;

}
