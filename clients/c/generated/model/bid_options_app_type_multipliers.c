#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "bid_options_app_type_multipliers.h"



static bid_options_app_type_multipliers_t *bid_options_app_type_multipliers_create_internal(
    double *android_mobile,
    double *android_tablet,
    double *ipad,
    double *iphone,
    double *web,
    double *web_mobile
    ) {
    bid_options_app_type_multipliers_t *bid_options_app_type_multipliers_local_var = malloc(sizeof(bid_options_app_type_multipliers_t));
    if (!bid_options_app_type_multipliers_local_var) {
        return NULL;
    }
    memset(bid_options_app_type_multipliers_local_var, 0, sizeof(bid_options_app_type_multipliers_t));
    bid_options_app_type_multipliers_local_var->_library_owned = 1;
    bid_options_app_type_multipliers_local_var->android_mobile = android_mobile;
    bid_options_app_type_multipliers_local_var->android_tablet = android_tablet;
    bid_options_app_type_multipliers_local_var->ipad = ipad;
    bid_options_app_type_multipliers_local_var->iphone = iphone;
    bid_options_app_type_multipliers_local_var->web = web;
    bid_options_app_type_multipliers_local_var->web_mobile = web_mobile;
    return bid_options_app_type_multipliers_local_var;
}

__attribute__((deprecated)) bid_options_app_type_multipliers_t *bid_options_app_type_multipliers_create(
    double *android_mobile,
    double *android_tablet,
    double *ipad,
    double *iphone,
    double *web,
    double *web_mobile
    ) {
    double *android_mobile_copy = NULL;
    if (android_mobile) {
        android_mobile_copy = malloc(sizeof(double));
        if (android_mobile_copy) *android_mobile_copy = *android_mobile;
    }
    double *android_tablet_copy = NULL;
    if (android_tablet) {
        android_tablet_copy = malloc(sizeof(double));
        if (android_tablet_copy) *android_tablet_copy = *android_tablet;
    }
    double *ipad_copy = NULL;
    if (ipad) {
        ipad_copy = malloc(sizeof(double));
        if (ipad_copy) *ipad_copy = *ipad;
    }
    double *iphone_copy = NULL;
    if (iphone) {
        iphone_copy = malloc(sizeof(double));
        if (iphone_copy) *iphone_copy = *iphone;
    }
    double *web_copy = NULL;
    if (web) {
        web_copy = malloc(sizeof(double));
        if (web_copy) *web_copy = *web;
    }
    double *web_mobile_copy = NULL;
    if (web_mobile) {
        web_mobile_copy = malloc(sizeof(double));
        if (web_mobile_copy) *web_mobile_copy = *web_mobile;
    }
    bid_options_app_type_multipliers_t *result = bid_options_app_type_multipliers_create_internal (
        android_mobile_copy,
        android_tablet_copy,
        ipad_copy,
        iphone_copy,
        web_copy,
        web_mobile_copy
        );
    if (!result) {
        free(android_mobile_copy);
        free(android_tablet_copy);
        free(ipad_copy);
        free(iphone_copy);
        free(web_copy);
        free(web_mobile_copy);
    }
    return result;
}

void bid_options_app_type_multipliers_free(bid_options_app_type_multipliers_t *bid_options_app_type_multipliers) {
    if(NULL == bid_options_app_type_multipliers){
        return ;
    }
    if(bid_options_app_type_multipliers->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "bid_options_app_type_multipliers_free");
        return ;
    }
    listEntry_t *listEntry;
    if (bid_options_app_type_multipliers->android_mobile) {
        free(bid_options_app_type_multipliers->android_mobile);
        bid_options_app_type_multipliers->android_mobile = NULL;
    }
    if (bid_options_app_type_multipliers->android_tablet) {
        free(bid_options_app_type_multipliers->android_tablet);
        bid_options_app_type_multipliers->android_tablet = NULL;
    }
    if (bid_options_app_type_multipliers->ipad) {
        free(bid_options_app_type_multipliers->ipad);
        bid_options_app_type_multipliers->ipad = NULL;
    }
    if (bid_options_app_type_multipliers->iphone) {
        free(bid_options_app_type_multipliers->iphone);
        bid_options_app_type_multipliers->iphone = NULL;
    }
    if (bid_options_app_type_multipliers->web) {
        free(bid_options_app_type_multipliers->web);
        bid_options_app_type_multipliers->web = NULL;
    }
    if (bid_options_app_type_multipliers->web_mobile) {
        free(bid_options_app_type_multipliers->web_mobile);
        bid_options_app_type_multipliers->web_mobile = NULL;
    }
    free(bid_options_app_type_multipliers);
}

cJSON *bid_options_app_type_multipliers_convertToJSON(bid_options_app_type_multipliers_t *bid_options_app_type_multipliers) {
    cJSON *item = cJSON_CreateObject();

    // bid_options_app_type_multipliers->android_mobile
    if(bid_options_app_type_multipliers->android_mobile) {
    if(cJSON_AddNumberToObject(item, "android_mobile", *bid_options_app_type_multipliers->android_mobile) == NULL) {
    goto fail; //Numeric
    }
    }


    // bid_options_app_type_multipliers->android_tablet
    if(bid_options_app_type_multipliers->android_tablet) {
    if(cJSON_AddNumberToObject(item, "android_tablet", *bid_options_app_type_multipliers->android_tablet) == NULL) {
    goto fail; //Numeric
    }
    }


    // bid_options_app_type_multipliers->ipad
    if(bid_options_app_type_multipliers->ipad) {
    if(cJSON_AddNumberToObject(item, "ipad", *bid_options_app_type_multipliers->ipad) == NULL) {
    goto fail; //Numeric
    }
    }


    // bid_options_app_type_multipliers->iphone
    if(bid_options_app_type_multipliers->iphone) {
    if(cJSON_AddNumberToObject(item, "iphone", *bid_options_app_type_multipliers->iphone) == NULL) {
    goto fail; //Numeric
    }
    }


    // bid_options_app_type_multipliers->web
    if(bid_options_app_type_multipliers->web) {
    if(cJSON_AddNumberToObject(item, "web", *bid_options_app_type_multipliers->web) == NULL) {
    goto fail; //Numeric
    }
    }


    // bid_options_app_type_multipliers->web_mobile
    if(bid_options_app_type_multipliers->web_mobile) {
    if(cJSON_AddNumberToObject(item, "web_mobile", *bid_options_app_type_multipliers->web_mobile) == NULL) {
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

bid_options_app_type_multipliers_t *bid_options_app_type_multipliers_parseFromJSON(cJSON *bid_options_app_type_multipliersJSON){

    bid_options_app_type_multipliers_t *bid_options_app_type_multipliers_local_var = NULL;

    // define the local variable for bid_options_app_type_multipliers->android_mobile
    double *android_mobile_local_var = NULL;

    // define the local variable for bid_options_app_type_multipliers->android_tablet
    double *android_tablet_local_var = NULL;

    // define the local variable for bid_options_app_type_multipliers->ipad
    double *ipad_local_var = NULL;

    // define the local variable for bid_options_app_type_multipliers->iphone
    double *iphone_local_var = NULL;

    // define the local variable for bid_options_app_type_multipliers->web
    double *web_local_var = NULL;

    // define the local variable for bid_options_app_type_multipliers->web_mobile
    double *web_mobile_local_var = NULL;

    // bid_options_app_type_multipliers->android_mobile
    cJSON *android_mobile = cJSON_GetObjectItemCaseSensitive(bid_options_app_type_multipliersJSON, "android_mobile");
    if (cJSON_IsNull(android_mobile)) {
        android_mobile = NULL;
    }
    if (android_mobile) { 
    if(!cJSON_IsNumber(android_mobile))
    {
    goto end; //Numeric
    }
    android_mobile_local_var = malloc(sizeof(double));
    if(!android_mobile_local_var)
    {
        goto end;
    }
    *android_mobile_local_var = android_mobile->valuedouble;
    }

    // bid_options_app_type_multipliers->android_tablet
    cJSON *android_tablet = cJSON_GetObjectItemCaseSensitive(bid_options_app_type_multipliersJSON, "android_tablet");
    if (cJSON_IsNull(android_tablet)) {
        android_tablet = NULL;
    }
    if (android_tablet) { 
    if(!cJSON_IsNumber(android_tablet))
    {
    goto end; //Numeric
    }
    android_tablet_local_var = malloc(sizeof(double));
    if(!android_tablet_local_var)
    {
        goto end;
    }
    *android_tablet_local_var = android_tablet->valuedouble;
    }

    // bid_options_app_type_multipliers->ipad
    cJSON *ipad = cJSON_GetObjectItemCaseSensitive(bid_options_app_type_multipliersJSON, "ipad");
    if (cJSON_IsNull(ipad)) {
        ipad = NULL;
    }
    if (ipad) { 
    if(!cJSON_IsNumber(ipad))
    {
    goto end; //Numeric
    }
    ipad_local_var = malloc(sizeof(double));
    if(!ipad_local_var)
    {
        goto end;
    }
    *ipad_local_var = ipad->valuedouble;
    }

    // bid_options_app_type_multipliers->iphone
    cJSON *iphone = cJSON_GetObjectItemCaseSensitive(bid_options_app_type_multipliersJSON, "iphone");
    if (cJSON_IsNull(iphone)) {
        iphone = NULL;
    }
    if (iphone) { 
    if(!cJSON_IsNumber(iphone))
    {
    goto end; //Numeric
    }
    iphone_local_var = malloc(sizeof(double));
    if(!iphone_local_var)
    {
        goto end;
    }
    *iphone_local_var = iphone->valuedouble;
    }

    // bid_options_app_type_multipliers->web
    cJSON *web = cJSON_GetObjectItemCaseSensitive(bid_options_app_type_multipliersJSON, "web");
    if (cJSON_IsNull(web)) {
        web = NULL;
    }
    if (web) { 
    if(!cJSON_IsNumber(web))
    {
    goto end; //Numeric
    }
    web_local_var = malloc(sizeof(double));
    if(!web_local_var)
    {
        goto end;
    }
    *web_local_var = web->valuedouble;
    }

    // bid_options_app_type_multipliers->web_mobile
    cJSON *web_mobile = cJSON_GetObjectItemCaseSensitive(bid_options_app_type_multipliersJSON, "web_mobile");
    if (cJSON_IsNull(web_mobile)) {
        web_mobile = NULL;
    }
    if (web_mobile) { 
    if(!cJSON_IsNumber(web_mobile))
    {
    goto end; //Numeric
    }
    web_mobile_local_var = malloc(sizeof(double));
    if(!web_mobile_local_var)
    {
        goto end;
    }
    *web_mobile_local_var = web_mobile->valuedouble;
    }



    bid_options_app_type_multipliers_local_var = bid_options_app_type_multipliers_create_internal (
        android_mobile_local_var,
        android_tablet_local_var,
        ipad_local_var,
        iphone_local_var,
        web_local_var,
        web_mobile_local_var
        );

    if (!bid_options_app_type_multipliers_local_var) {
        goto end;
    }

    return bid_options_app_type_multipliers_local_var;
end:
    if (android_mobile_local_var) {
        free(android_mobile_local_var);
        android_mobile_local_var = NULL;
    }
    if (android_tablet_local_var) {
        free(android_tablet_local_var);
        android_tablet_local_var = NULL;
    }
    if (ipad_local_var) {
        free(ipad_local_var);
        ipad_local_var = NULL;
    }
    if (iphone_local_var) {
        free(iphone_local_var);
        iphone_local_var = NULL;
    }
    if (web_local_var) {
        free(web_local_var);
        web_local_var = NULL;
    }
    if (web_mobile_local_var) {
        free(web_mobile_local_var);
        web_mobile_local_var = NULL;
    }
    return NULL;

}
