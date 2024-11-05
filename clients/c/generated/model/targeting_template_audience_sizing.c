#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "targeting_template_audience_sizing.h"



targeting_template_audience_sizing_t *targeting_template_audience_sizing_create(
    targeting_template_audience_sizing_reach_estimate_t *reach_estimate
    ) {
    targeting_template_audience_sizing_t *targeting_template_audience_sizing_local_var = malloc(sizeof(targeting_template_audience_sizing_t));
    if (!targeting_template_audience_sizing_local_var) {
        return NULL;
    }
    targeting_template_audience_sizing_local_var->reach_estimate = reach_estimate;

    return targeting_template_audience_sizing_local_var;
}


void targeting_template_audience_sizing_free(targeting_template_audience_sizing_t *targeting_template_audience_sizing) {
    if(NULL == targeting_template_audience_sizing){
        return ;
    }
    listEntry_t *listEntry;
    if (targeting_template_audience_sizing->reach_estimate) {
        targeting_template_audience_sizing_reach_estimate_free(targeting_template_audience_sizing->reach_estimate);
        targeting_template_audience_sizing->reach_estimate = NULL;
    }
    free(targeting_template_audience_sizing);
}

cJSON *targeting_template_audience_sizing_convertToJSON(targeting_template_audience_sizing_t *targeting_template_audience_sizing) {
    cJSON *item = cJSON_CreateObject();

    // targeting_template_audience_sizing->reach_estimate
    if(targeting_template_audience_sizing->reach_estimate) {
    cJSON *reach_estimate_local_JSON = targeting_template_audience_sizing_reach_estimate_convertToJSON(targeting_template_audience_sizing->reach_estimate);
    if(reach_estimate_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "reach_estimate", reach_estimate_local_JSON);
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

targeting_template_audience_sizing_t *targeting_template_audience_sizing_parseFromJSON(cJSON *targeting_template_audience_sizingJSON){

    targeting_template_audience_sizing_t *targeting_template_audience_sizing_local_var = NULL;

    // define the local variable for targeting_template_audience_sizing->reach_estimate
    targeting_template_audience_sizing_reach_estimate_t *reach_estimate_local_nonprim = NULL;

    // targeting_template_audience_sizing->reach_estimate
    cJSON *reach_estimate = cJSON_GetObjectItemCaseSensitive(targeting_template_audience_sizingJSON, "reach_estimate");
    if (reach_estimate) { 
    reach_estimate_local_nonprim = targeting_template_audience_sizing_reach_estimate_parseFromJSON(reach_estimate); //nonprimitive
    }


    targeting_template_audience_sizing_local_var = targeting_template_audience_sizing_create (
        reach_estimate ? reach_estimate_local_nonprim : NULL
        );

    return targeting_template_audience_sizing_local_var;
end:
    if (reach_estimate_local_nonprim) {
        targeting_template_audience_sizing_reach_estimate_free(reach_estimate_local_nonprim);
        reach_estimate_local_nonprim = NULL;
    }
    return NULL;

}
