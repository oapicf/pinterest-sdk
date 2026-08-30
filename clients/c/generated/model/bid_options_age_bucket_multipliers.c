#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "bid_options_age_bucket_multipliers.h"



static bid_options_age_bucket_multipliers_t *bid_options_age_bucket_multipliers_create_internal(
    double *_18_24,
    double *_25_34,
    double *_35_44,
    double *_45_49,
    double *_50_54,
    double *_55_64,
    double *_65
    ) {
    bid_options_age_bucket_multipliers_t *bid_options_age_bucket_multipliers_local_var = malloc(sizeof(bid_options_age_bucket_multipliers_t));
    if (!bid_options_age_bucket_multipliers_local_var) {
        return NULL;
    }
    memset(bid_options_age_bucket_multipliers_local_var, 0, sizeof(bid_options_age_bucket_multipliers_t));
    bid_options_age_bucket_multipliers_local_var->_library_owned = 1;
    bid_options_age_bucket_multipliers_local_var->_18_24 = _18_24;
    bid_options_age_bucket_multipliers_local_var->_25_34 = _25_34;
    bid_options_age_bucket_multipliers_local_var->_35_44 = _35_44;
    bid_options_age_bucket_multipliers_local_var->_45_49 = _45_49;
    bid_options_age_bucket_multipliers_local_var->_50_54 = _50_54;
    bid_options_age_bucket_multipliers_local_var->_55_64 = _55_64;
    bid_options_age_bucket_multipliers_local_var->_65 = _65;
    return bid_options_age_bucket_multipliers_local_var;
}

__attribute__((deprecated)) bid_options_age_bucket_multipliers_t *bid_options_age_bucket_multipliers_create(
    double *_18_24,
    double *_25_34,
    double *_35_44,
    double *_45_49,
    double *_50_54,
    double *_55_64,
    double *_65
    ) {
    double *_18_24_copy = NULL;
    if (_18_24) {
        _18_24_copy = malloc(sizeof(double));
        if (_18_24_copy) *_18_24_copy = *_18_24;
    }
    double *_25_34_copy = NULL;
    if (_25_34) {
        _25_34_copy = malloc(sizeof(double));
        if (_25_34_copy) *_25_34_copy = *_25_34;
    }
    double *_35_44_copy = NULL;
    if (_35_44) {
        _35_44_copy = malloc(sizeof(double));
        if (_35_44_copy) *_35_44_copy = *_35_44;
    }
    double *_45_49_copy = NULL;
    if (_45_49) {
        _45_49_copy = malloc(sizeof(double));
        if (_45_49_copy) *_45_49_copy = *_45_49;
    }
    double *_50_54_copy = NULL;
    if (_50_54) {
        _50_54_copy = malloc(sizeof(double));
        if (_50_54_copy) *_50_54_copy = *_50_54;
    }
    double *_55_64_copy = NULL;
    if (_55_64) {
        _55_64_copy = malloc(sizeof(double));
        if (_55_64_copy) *_55_64_copy = *_55_64;
    }
    double *_65_copy = NULL;
    if (_65) {
        _65_copy = malloc(sizeof(double));
        if (_65_copy) *_65_copy = *_65;
    }
    bid_options_age_bucket_multipliers_t *result = bid_options_age_bucket_multipliers_create_internal (
        _18_24_copy,
        _25_34_copy,
        _35_44_copy,
        _45_49_copy,
        _50_54_copy,
        _55_64_copy,
        _65_copy
        );
    if (!result) {
        free(_18_24_copy);
        free(_25_34_copy);
        free(_35_44_copy);
        free(_45_49_copy);
        free(_50_54_copy);
        free(_55_64_copy);
        free(_65_copy);
    }
    return result;
}

void bid_options_age_bucket_multipliers_free(bid_options_age_bucket_multipliers_t *bid_options_age_bucket_multipliers) {
    if(NULL == bid_options_age_bucket_multipliers){
        return ;
    }
    if(bid_options_age_bucket_multipliers->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "bid_options_age_bucket_multipliers_free");
        return ;
    }
    listEntry_t *listEntry;
    if (bid_options_age_bucket_multipliers->_18_24) {
        free(bid_options_age_bucket_multipliers->_18_24);
        bid_options_age_bucket_multipliers->_18_24 = NULL;
    }
    if (bid_options_age_bucket_multipliers->_25_34) {
        free(bid_options_age_bucket_multipliers->_25_34);
        bid_options_age_bucket_multipliers->_25_34 = NULL;
    }
    if (bid_options_age_bucket_multipliers->_35_44) {
        free(bid_options_age_bucket_multipliers->_35_44);
        bid_options_age_bucket_multipliers->_35_44 = NULL;
    }
    if (bid_options_age_bucket_multipliers->_45_49) {
        free(bid_options_age_bucket_multipliers->_45_49);
        bid_options_age_bucket_multipliers->_45_49 = NULL;
    }
    if (bid_options_age_bucket_multipliers->_50_54) {
        free(bid_options_age_bucket_multipliers->_50_54);
        bid_options_age_bucket_multipliers->_50_54 = NULL;
    }
    if (bid_options_age_bucket_multipliers->_55_64) {
        free(bid_options_age_bucket_multipliers->_55_64);
        bid_options_age_bucket_multipliers->_55_64 = NULL;
    }
    if (bid_options_age_bucket_multipliers->_65) {
        free(bid_options_age_bucket_multipliers->_65);
        bid_options_age_bucket_multipliers->_65 = NULL;
    }
    free(bid_options_age_bucket_multipliers);
}

cJSON *bid_options_age_bucket_multipliers_convertToJSON(bid_options_age_bucket_multipliers_t *bid_options_age_bucket_multipliers) {
    cJSON *item = cJSON_CreateObject();

    // bid_options_age_bucket_multipliers->_18_24
    if(bid_options_age_bucket_multipliers->_18_24) {
    if(cJSON_AddNumberToObject(item, "18-24", *bid_options_age_bucket_multipliers->_18_24) == NULL) {
    goto fail; //Numeric
    }
    }


    // bid_options_age_bucket_multipliers->_25_34
    if(bid_options_age_bucket_multipliers->_25_34) {
    if(cJSON_AddNumberToObject(item, "25-34", *bid_options_age_bucket_multipliers->_25_34) == NULL) {
    goto fail; //Numeric
    }
    }


    // bid_options_age_bucket_multipliers->_35_44
    if(bid_options_age_bucket_multipliers->_35_44) {
    if(cJSON_AddNumberToObject(item, "35-44", *bid_options_age_bucket_multipliers->_35_44) == NULL) {
    goto fail; //Numeric
    }
    }


    // bid_options_age_bucket_multipliers->_45_49
    if(bid_options_age_bucket_multipliers->_45_49) {
    if(cJSON_AddNumberToObject(item, "45-49", *bid_options_age_bucket_multipliers->_45_49) == NULL) {
    goto fail; //Numeric
    }
    }


    // bid_options_age_bucket_multipliers->_50_54
    if(bid_options_age_bucket_multipliers->_50_54) {
    if(cJSON_AddNumberToObject(item, "50-54", *bid_options_age_bucket_multipliers->_50_54) == NULL) {
    goto fail; //Numeric
    }
    }


    // bid_options_age_bucket_multipliers->_55_64
    if(bid_options_age_bucket_multipliers->_55_64) {
    if(cJSON_AddNumberToObject(item, "55-64", *bid_options_age_bucket_multipliers->_55_64) == NULL) {
    goto fail; //Numeric
    }
    }


    // bid_options_age_bucket_multipliers->_65
    if(bid_options_age_bucket_multipliers->_65) {
    if(cJSON_AddNumberToObject(item, "65+", *bid_options_age_bucket_multipliers->_65) == NULL) {
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

bid_options_age_bucket_multipliers_t *bid_options_age_bucket_multipliers_parseFromJSON(cJSON *bid_options_age_bucket_multipliersJSON){

    bid_options_age_bucket_multipliers_t *bid_options_age_bucket_multipliers_local_var = NULL;

    // define the local variable for bid_options_age_bucket_multipliers->_18_24
    double *_18_24_local_var = NULL;

    // define the local variable for bid_options_age_bucket_multipliers->_25_34
    double *_25_34_local_var = NULL;

    // define the local variable for bid_options_age_bucket_multipliers->_35_44
    double *_35_44_local_var = NULL;

    // define the local variable for bid_options_age_bucket_multipliers->_45_49
    double *_45_49_local_var = NULL;

    // define the local variable for bid_options_age_bucket_multipliers->_50_54
    double *_50_54_local_var = NULL;

    // define the local variable for bid_options_age_bucket_multipliers->_55_64
    double *_55_64_local_var = NULL;

    // define the local variable for bid_options_age_bucket_multipliers->_65
    double *_65_local_var = NULL;

    // bid_options_age_bucket_multipliers->_18_24
    cJSON *_18_24 = cJSON_GetObjectItemCaseSensitive(bid_options_age_bucket_multipliersJSON, "18-24");
    if (cJSON_IsNull(_18_24)) {
        _18_24 = NULL;
    }
    if (_18_24) { 
    if(!cJSON_IsNumber(_18_24))
    {
    goto end; //Numeric
    }
    _18_24_local_var = malloc(sizeof(double));
    if(!_18_24_local_var)
    {
        goto end;
    }
    *_18_24_local_var = _18_24->valuedouble;
    }

    // bid_options_age_bucket_multipliers->_25_34
    cJSON *_25_34 = cJSON_GetObjectItemCaseSensitive(bid_options_age_bucket_multipliersJSON, "25-34");
    if (cJSON_IsNull(_25_34)) {
        _25_34 = NULL;
    }
    if (_25_34) { 
    if(!cJSON_IsNumber(_25_34))
    {
    goto end; //Numeric
    }
    _25_34_local_var = malloc(sizeof(double));
    if(!_25_34_local_var)
    {
        goto end;
    }
    *_25_34_local_var = _25_34->valuedouble;
    }

    // bid_options_age_bucket_multipliers->_35_44
    cJSON *_35_44 = cJSON_GetObjectItemCaseSensitive(bid_options_age_bucket_multipliersJSON, "35-44");
    if (cJSON_IsNull(_35_44)) {
        _35_44 = NULL;
    }
    if (_35_44) { 
    if(!cJSON_IsNumber(_35_44))
    {
    goto end; //Numeric
    }
    _35_44_local_var = malloc(sizeof(double));
    if(!_35_44_local_var)
    {
        goto end;
    }
    *_35_44_local_var = _35_44->valuedouble;
    }

    // bid_options_age_bucket_multipliers->_45_49
    cJSON *_45_49 = cJSON_GetObjectItemCaseSensitive(bid_options_age_bucket_multipliersJSON, "45-49");
    if (cJSON_IsNull(_45_49)) {
        _45_49 = NULL;
    }
    if (_45_49) { 
    if(!cJSON_IsNumber(_45_49))
    {
    goto end; //Numeric
    }
    _45_49_local_var = malloc(sizeof(double));
    if(!_45_49_local_var)
    {
        goto end;
    }
    *_45_49_local_var = _45_49->valuedouble;
    }

    // bid_options_age_bucket_multipliers->_50_54
    cJSON *_50_54 = cJSON_GetObjectItemCaseSensitive(bid_options_age_bucket_multipliersJSON, "50-54");
    if (cJSON_IsNull(_50_54)) {
        _50_54 = NULL;
    }
    if (_50_54) { 
    if(!cJSON_IsNumber(_50_54))
    {
    goto end; //Numeric
    }
    _50_54_local_var = malloc(sizeof(double));
    if(!_50_54_local_var)
    {
        goto end;
    }
    *_50_54_local_var = _50_54->valuedouble;
    }

    // bid_options_age_bucket_multipliers->_55_64
    cJSON *_55_64 = cJSON_GetObjectItemCaseSensitive(bid_options_age_bucket_multipliersJSON, "55-64");
    if (cJSON_IsNull(_55_64)) {
        _55_64 = NULL;
    }
    if (_55_64) { 
    if(!cJSON_IsNumber(_55_64))
    {
    goto end; //Numeric
    }
    _55_64_local_var = malloc(sizeof(double));
    if(!_55_64_local_var)
    {
        goto end;
    }
    *_55_64_local_var = _55_64->valuedouble;
    }

    // bid_options_age_bucket_multipliers->_65
    cJSON *_65 = cJSON_GetObjectItemCaseSensitive(bid_options_age_bucket_multipliersJSON, "65+");
    if (cJSON_IsNull(_65)) {
        _65 = NULL;
    }
    if (_65) { 
    if(!cJSON_IsNumber(_65))
    {
    goto end; //Numeric
    }
    _65_local_var = malloc(sizeof(double));
    if(!_65_local_var)
    {
        goto end;
    }
    *_65_local_var = _65->valuedouble;
    }



    bid_options_age_bucket_multipliers_local_var = bid_options_age_bucket_multipliers_create_internal (
        _18_24_local_var,
        _25_34_local_var,
        _35_44_local_var,
        _45_49_local_var,
        _50_54_local_var,
        _55_64_local_var,
        _65_local_var
        );

    if (!bid_options_age_bucket_multipliers_local_var) {
        goto end;
    }

    return bid_options_age_bucket_multipliers_local_var;
end:
    if (_18_24_local_var) {
        free(_18_24_local_var);
        _18_24_local_var = NULL;
    }
    if (_25_34_local_var) {
        free(_25_34_local_var);
        _25_34_local_var = NULL;
    }
    if (_35_44_local_var) {
        free(_35_44_local_var);
        _35_44_local_var = NULL;
    }
    if (_45_49_local_var) {
        free(_45_49_local_var);
        _45_49_local_var = NULL;
    }
    if (_50_54_local_var) {
        free(_50_54_local_var);
        _50_54_local_var = NULL;
    }
    if (_55_64_local_var) {
        free(_55_64_local_var);
        _55_64_local_var = NULL;
    }
    if (_65_local_var) {
        free(_65_local_var);
        _65_local_var = NULL;
    }
    return NULL;

}
