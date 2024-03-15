#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pins_analytics_metric_types_parameter_inner.h"



pins_analytics_metric_types_parameter_inner_t *pins_analytics_metric_types_parameter_inner_create(
    ) {
    pins_analytics_metric_types_parameter_inner_t *pins_analytics_metric_types_parameter_inner_local_var = malloc(sizeof(pins_analytics_metric_types_parameter_inner_t));
    if (!pins_analytics_metric_types_parameter_inner_local_var) {
        return NULL;
    }

    return pins_analytics_metric_types_parameter_inner_local_var;
}


void pins_analytics_metric_types_parameter_inner_free(pins_analytics_metric_types_parameter_inner_t *pins_analytics_metric_types_parameter_inner) {
    if(NULL == pins_analytics_metric_types_parameter_inner){
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


    pins_analytics_metric_types_parameter_inner_local_var = pins_analytics_metric_types_parameter_inner_create (
        );

    return pins_analytics_metric_types_parameter_inner_local_var;
end:
    return NULL;

}
