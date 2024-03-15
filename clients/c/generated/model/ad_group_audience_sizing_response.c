#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_group_audience_sizing_response.h"



ad_group_audience_sizing_response_t *ad_group_audience_sizing_response_create(
    double audience_size_lower_bound,
    double audience_size_upper_bound
    ) {
    ad_group_audience_sizing_response_t *ad_group_audience_sizing_response_local_var = malloc(sizeof(ad_group_audience_sizing_response_t));
    if (!ad_group_audience_sizing_response_local_var) {
        return NULL;
    }
    ad_group_audience_sizing_response_local_var->audience_size_lower_bound = audience_size_lower_bound;
    ad_group_audience_sizing_response_local_var->audience_size_upper_bound = audience_size_upper_bound;

    return ad_group_audience_sizing_response_local_var;
}


void ad_group_audience_sizing_response_free(ad_group_audience_sizing_response_t *ad_group_audience_sizing_response) {
    if(NULL == ad_group_audience_sizing_response){
        return ;
    }
    listEntry_t *listEntry;
    free(ad_group_audience_sizing_response);
}

cJSON *ad_group_audience_sizing_response_convertToJSON(ad_group_audience_sizing_response_t *ad_group_audience_sizing_response) {
    cJSON *item = cJSON_CreateObject();

    // ad_group_audience_sizing_response->audience_size_lower_bound
    if(ad_group_audience_sizing_response->audience_size_lower_bound) {
    if(cJSON_AddNumberToObject(item, "audience_size_lower_bound", ad_group_audience_sizing_response->audience_size_lower_bound) == NULL) {
    goto fail; //Numeric
    }
    }


    // ad_group_audience_sizing_response->audience_size_upper_bound
    if(ad_group_audience_sizing_response->audience_size_upper_bound) {
    if(cJSON_AddNumberToObject(item, "audience_size_upper_bound", ad_group_audience_sizing_response->audience_size_upper_bound) == NULL) {
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

ad_group_audience_sizing_response_t *ad_group_audience_sizing_response_parseFromJSON(cJSON *ad_group_audience_sizing_responseJSON){

    ad_group_audience_sizing_response_t *ad_group_audience_sizing_response_local_var = NULL;

    // ad_group_audience_sizing_response->audience_size_lower_bound
    cJSON *audience_size_lower_bound = cJSON_GetObjectItemCaseSensitive(ad_group_audience_sizing_responseJSON, "audience_size_lower_bound");
    if (audience_size_lower_bound) { 
    if(!cJSON_IsNumber(audience_size_lower_bound))
    {
    goto end; //Numeric
    }
    }

    // ad_group_audience_sizing_response->audience_size_upper_bound
    cJSON *audience_size_upper_bound = cJSON_GetObjectItemCaseSensitive(ad_group_audience_sizing_responseJSON, "audience_size_upper_bound");
    if (audience_size_upper_bound) { 
    if(!cJSON_IsNumber(audience_size_upper_bound))
    {
    goto end; //Numeric
    }
    }


    ad_group_audience_sizing_response_local_var = ad_group_audience_sizing_response_create (
        audience_size_lower_bound ? audience_size_lower_bound->valuedouble : 0,
        audience_size_upper_bound ? audience_size_upper_bound->valuedouble : 0
        );

    return ad_group_audience_sizing_response_local_var;
end:
    return NULL;

}
