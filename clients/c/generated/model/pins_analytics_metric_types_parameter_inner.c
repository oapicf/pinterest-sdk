#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pins_analytics_metric_types_parameter_inner.h"



static pins_analytics_metric_types_parameter_inner_t *pins_analytics_metric_types_parameter_inner_create_internal(
    ) {
    pins_analytics_metric_types_parameter_inner_t *pins_analytics_metric_types_parameter_inner_local_var = malloc(sizeof(pins_analytics_metric_types_parameter_inner_t));
    if (!pins_analytics_metric_types_parameter_inner_local_var) {
        return NULL;
    }

    pins_analytics_metric_types_parameter_inner_local_var->_library_owned = 1;
    return pins_analytics_metric_types_parameter_inner_local_var;
}

__attribute__((deprecated)) pins_analytics_metric_types_parameter_inner_t *pins_analytics_metric_types_parameter_inner_create(
    ) {
    return pins_analytics_metric_types_parameter_inner_create_internal (
        );
}

void pins_analytics_metric_types_parameter_inner_free(pins_analytics_metric_types_parameter_inner_t *pins_analytics_metric_types_parameter_inner) {
    if(NULL == pins_analytics_metric_types_parameter_inner){
        return ;
    }
    if(pins_analytics_metric_types_parameter_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pins_analytics_metric_types_parameter_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    free(pins_analytics_metric_types_parameter_inner);
}

cJSON *pins_analytics_metric_types_parameter_inner_convertToJSON(pins_analytics_metric_types_parameter_inner_t *pins_analytics_metric_types_parameter_inner) {
    cJSON *item = cJSON_CreateObject();
    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pins_analytics_metric_types_parameter_inner_t *pins_analytics_metric_types_parameter_inner_parseFromJSON(cJSON *pins_analytics_metric_types_parameter_innerJSON){

    pins_analytics_metric_types_parameter_inner_t *pins_analytics_metric_types_parameter_inner_local_var = NULL;


    pins_analytics_metric_types_parameter_inner_local_var = pins_analytics_metric_types_parameter_inner_create_internal (
        );

    return pins_analytics_metric_types_parameter_inner_local_var;
end:
    return NULL;

}
