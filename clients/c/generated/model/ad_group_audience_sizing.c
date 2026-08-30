#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_group_audience_sizing.h"



static ad_group_audience_sizing_t *ad_group_audience_sizing_create_internal(
    double *audience_size_lower_bound,
    double *audience_size_upper_bound
    ) {
    ad_group_audience_sizing_t *ad_group_audience_sizing_local_var = malloc(sizeof(ad_group_audience_sizing_t));
    if (!ad_group_audience_sizing_local_var) {
        return NULL;
    }
    memset(ad_group_audience_sizing_local_var, 0, sizeof(ad_group_audience_sizing_t));
    ad_group_audience_sizing_local_var->_library_owned = 1;
    ad_group_audience_sizing_local_var->audience_size_lower_bound = audience_size_lower_bound;
    ad_group_audience_sizing_local_var->audience_size_upper_bound = audience_size_upper_bound;
    return ad_group_audience_sizing_local_var;
}

__attribute__((deprecated)) ad_group_audience_sizing_t *ad_group_audience_sizing_create(
    double *audience_size_lower_bound,
    double *audience_size_upper_bound
    ) {
    double *audience_size_lower_bound_copy = NULL;
    if (audience_size_lower_bound) {
        audience_size_lower_bound_copy = malloc(sizeof(double));
        if (audience_size_lower_bound_copy) *audience_size_lower_bound_copy = *audience_size_lower_bound;
    }
    double *audience_size_upper_bound_copy = NULL;
    if (audience_size_upper_bound) {
        audience_size_upper_bound_copy = malloc(sizeof(double));
        if (audience_size_upper_bound_copy) *audience_size_upper_bound_copy = *audience_size_upper_bound;
    }
    ad_group_audience_sizing_t *result = ad_group_audience_sizing_create_internal (
        audience_size_lower_bound_copy,
        audience_size_upper_bound_copy
        );
    if (!result) {
        free(audience_size_lower_bound_copy);
        free(audience_size_upper_bound_copy);
    }
    return result;
}

void ad_group_audience_sizing_free(ad_group_audience_sizing_t *ad_group_audience_sizing) {
    if(NULL == ad_group_audience_sizing){
        return ;
    }
    if(ad_group_audience_sizing->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ad_group_audience_sizing_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ad_group_audience_sizing->audience_size_lower_bound) {
        free(ad_group_audience_sizing->audience_size_lower_bound);
        ad_group_audience_sizing->audience_size_lower_bound = NULL;
    }
    if (ad_group_audience_sizing->audience_size_upper_bound) {
        free(ad_group_audience_sizing->audience_size_upper_bound);
        ad_group_audience_sizing->audience_size_upper_bound = NULL;
    }
    free(ad_group_audience_sizing);
}

cJSON *ad_group_audience_sizing_convertToJSON(ad_group_audience_sizing_t *ad_group_audience_sizing) {
    cJSON *item = cJSON_CreateObject();

    // ad_group_audience_sizing->audience_size_lower_bound
    if(ad_group_audience_sizing->audience_size_lower_bound) {
    if(cJSON_AddNumberToObject(item, "audience_size_lower_bound", *ad_group_audience_sizing->audience_size_lower_bound) == NULL) {
    goto fail; //Numeric
    }
    }


    // ad_group_audience_sizing->audience_size_upper_bound
    if(ad_group_audience_sizing->audience_size_upper_bound) {
    if(cJSON_AddNumberToObject(item, "audience_size_upper_bound", *ad_group_audience_sizing->audience_size_upper_bound) == NULL) {
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

ad_group_audience_sizing_t *ad_group_audience_sizing_parseFromJSON(cJSON *ad_group_audience_sizingJSON){

    ad_group_audience_sizing_t *ad_group_audience_sizing_local_var = NULL;

    // define the local variable for ad_group_audience_sizing->audience_size_lower_bound
    double *audience_size_lower_bound_local_var = NULL;

    // define the local variable for ad_group_audience_sizing->audience_size_upper_bound
    double *audience_size_upper_bound_local_var = NULL;

    // ad_group_audience_sizing->audience_size_lower_bound
    cJSON *audience_size_lower_bound = cJSON_GetObjectItemCaseSensitive(ad_group_audience_sizingJSON, "audience_size_lower_bound");
    if (cJSON_IsNull(audience_size_lower_bound)) {
        audience_size_lower_bound = NULL;
    }
    if (audience_size_lower_bound) { 
    if(!cJSON_IsNumber(audience_size_lower_bound))
    {
    goto end; //Numeric
    }
    audience_size_lower_bound_local_var = malloc(sizeof(double));
    if(!audience_size_lower_bound_local_var)
    {
        goto end;
    }
    *audience_size_lower_bound_local_var = audience_size_lower_bound->valuedouble;
    }

    // ad_group_audience_sizing->audience_size_upper_bound
    cJSON *audience_size_upper_bound = cJSON_GetObjectItemCaseSensitive(ad_group_audience_sizingJSON, "audience_size_upper_bound");
    if (cJSON_IsNull(audience_size_upper_bound)) {
        audience_size_upper_bound = NULL;
    }
    if (audience_size_upper_bound) { 
    if(!cJSON_IsNumber(audience_size_upper_bound))
    {
    goto end; //Numeric
    }
    audience_size_upper_bound_local_var = malloc(sizeof(double));
    if(!audience_size_upper_bound_local_var)
    {
        goto end;
    }
    *audience_size_upper_bound_local_var = audience_size_upper_bound->valuedouble;
    }



    ad_group_audience_sizing_local_var = ad_group_audience_sizing_create_internal (
        audience_size_lower_bound_local_var,
        audience_size_upper_bound_local_var
        );

    if (!ad_group_audience_sizing_local_var) {
        goto end;
    }

    return ad_group_audience_sizing_local_var;
end:
    if (audience_size_lower_bound_local_var) {
        free(audience_size_lower_bound_local_var);
        audience_size_lower_bound_local_var = NULL;
    }
    if (audience_size_upper_bound_local_var) {
        free(audience_size_upper_bound_local_var);
        audience_size_upper_bound_local_var = NULL;
    }
    return NULL;

}
