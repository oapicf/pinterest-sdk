#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "bid_options_audience_multipliers.h"



static bid_options_audience_multipliers_t *bid_options_audience_multipliers_create_internal(
    char *audience_id,
    double *multiplier
    ) {
    bid_options_audience_multipliers_t *bid_options_audience_multipliers_local_var = malloc(sizeof(bid_options_audience_multipliers_t));
    if (!bid_options_audience_multipliers_local_var) {
        return NULL;
    }
    memset(bid_options_audience_multipliers_local_var, 0, sizeof(bid_options_audience_multipliers_t));
    bid_options_audience_multipliers_local_var->_library_owned = 1;
    bid_options_audience_multipliers_local_var->audience_id = audience_id;
    bid_options_audience_multipliers_local_var->multiplier = multiplier;
    return bid_options_audience_multipliers_local_var;
}

__attribute__((deprecated)) bid_options_audience_multipliers_t *bid_options_audience_multipliers_create(
    char *audience_id,
    double *multiplier
    ) {
    double *multiplier_copy = NULL;
    if (multiplier) {
        multiplier_copy = malloc(sizeof(double));
        if (multiplier_copy) *multiplier_copy = *multiplier;
    }
    bid_options_audience_multipliers_t *result = bid_options_audience_multipliers_create_internal (
        audience_id,
        multiplier_copy
        );
    if (!result) {
        free(multiplier_copy);
    }
    return result;
}

void bid_options_audience_multipliers_free(bid_options_audience_multipliers_t *bid_options_audience_multipliers) {
    if(NULL == bid_options_audience_multipliers){
        return ;
    }
    if(bid_options_audience_multipliers->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "bid_options_audience_multipliers_free");
        return ;
    }
    listEntry_t *listEntry;
    if (bid_options_audience_multipliers->audience_id) {
        free(bid_options_audience_multipliers->audience_id);
        bid_options_audience_multipliers->audience_id = NULL;
    }
    if (bid_options_audience_multipliers->multiplier) {
        free(bid_options_audience_multipliers->multiplier);
        bid_options_audience_multipliers->multiplier = NULL;
    }
    free(bid_options_audience_multipliers);
}

cJSON *bid_options_audience_multipliers_convertToJSON(bid_options_audience_multipliers_t *bid_options_audience_multipliers) {
    cJSON *item = cJSON_CreateObject();

    // bid_options_audience_multipliers->audience_id
    if (!bid_options_audience_multipliers->audience_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "audience_id", bid_options_audience_multipliers->audience_id) == NULL) {
    goto fail; //String
    }


    // bid_options_audience_multipliers->multiplier
    if (!bid_options_audience_multipliers->multiplier) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "multiplier", *bid_options_audience_multipliers->multiplier) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

bid_options_audience_multipliers_t *bid_options_audience_multipliers_parseFromJSON(cJSON *bid_options_audience_multipliersJSON){

    bid_options_audience_multipliers_t *bid_options_audience_multipliers_local_var = NULL;

    char *audience_id_local_str = NULL;

    // define the local variable for bid_options_audience_multipliers->multiplier
    double *multiplier_local_var = NULL;

    // bid_options_audience_multipliers->audience_id
    cJSON *audience_id = cJSON_GetObjectItemCaseSensitive(bid_options_audience_multipliersJSON, "audience_id");
    if (cJSON_IsNull(audience_id)) {
        audience_id = NULL;
    }
    if (!audience_id) {
        goto end;
    }

    
    if(!cJSON_IsString(audience_id))
    {
    goto end; //String
    }

    // bid_options_audience_multipliers->multiplier
    cJSON *multiplier = cJSON_GetObjectItemCaseSensitive(bid_options_audience_multipliersJSON, "multiplier");
    if (cJSON_IsNull(multiplier)) {
        multiplier = NULL;
    }
    if (!multiplier) {
        goto end;
    }

    
    if(!cJSON_IsNumber(multiplier))
    {
    goto end; //Numeric
    }
    multiplier_local_var = malloc(sizeof(double));
    if(!multiplier_local_var)
    {
        goto end;
    }
    *multiplier_local_var = multiplier->valuedouble;


    if (audience_id && !cJSON_IsNull(audience_id)) audience_id_local_str = strdup(audience_id->valuestring);

    bid_options_audience_multipliers_local_var = bid_options_audience_multipliers_create_internal (
        audience_id_local_str,
        multiplier_local_var
        );

    if (!bid_options_audience_multipliers_local_var) {
        goto end;
    }

    return bid_options_audience_multipliers_local_var;
end:
    if (audience_id_local_str) {
        free(audience_id_local_str);
        audience_id_local_str = NULL;
    }
    if (multiplier_local_var) {
        free(multiplier_local_var);
        multiplier_local_var = NULL;
    }
    return NULL;

}
