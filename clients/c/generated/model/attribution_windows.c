#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "attribution_windows.h"



static attribution_windows_t *attribution_windows_create_internal(
    int *click_window_days,
    int *engagement_window_days,
    int *view_window_days
    ) {
    attribution_windows_t *attribution_windows_local_var = malloc(sizeof(attribution_windows_t));
    if (!attribution_windows_local_var) {
        return NULL;
    }
    memset(attribution_windows_local_var, 0, sizeof(attribution_windows_t));
    attribution_windows_local_var->_library_owned = 1;
    attribution_windows_local_var->click_window_days = click_window_days;
    attribution_windows_local_var->engagement_window_days = engagement_window_days;
    attribution_windows_local_var->view_window_days = view_window_days;
    return attribution_windows_local_var;
}

__attribute__((deprecated)) attribution_windows_t *attribution_windows_create(
    int *click_window_days,
    int *engagement_window_days,
    int *view_window_days
    ) {
    int *click_window_days_copy = NULL;
    if (click_window_days) {
        click_window_days_copy = malloc(sizeof(int));
        if (click_window_days_copy) *click_window_days_copy = *click_window_days;
    }
    int *engagement_window_days_copy = NULL;
    if (engagement_window_days) {
        engagement_window_days_copy = malloc(sizeof(int));
        if (engagement_window_days_copy) *engagement_window_days_copy = *engagement_window_days;
    }
    int *view_window_days_copy = NULL;
    if (view_window_days) {
        view_window_days_copy = malloc(sizeof(int));
        if (view_window_days_copy) *view_window_days_copy = *view_window_days;
    }
    attribution_windows_t *result = attribution_windows_create_internal (
        click_window_days_copy,
        engagement_window_days_copy,
        view_window_days_copy
        );
    if (!result) {
        free(click_window_days_copy);
        free(engagement_window_days_copy);
        free(view_window_days_copy);
    }
    return result;
}

void attribution_windows_free(attribution_windows_t *attribution_windows) {
    if(NULL == attribution_windows){
        return ;
    }
    if(attribution_windows->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "attribution_windows_free");
        return ;
    }
    listEntry_t *listEntry;
    if (attribution_windows->click_window_days) {
        free(attribution_windows->click_window_days);
        attribution_windows->click_window_days = NULL;
    }
    if (attribution_windows->engagement_window_days) {
        free(attribution_windows->engagement_window_days);
        attribution_windows->engagement_window_days = NULL;
    }
    if (attribution_windows->view_window_days) {
        free(attribution_windows->view_window_days);
        attribution_windows->view_window_days = NULL;
    }
    free(attribution_windows);
}

cJSON *attribution_windows_convertToJSON(attribution_windows_t *attribution_windows) {
    cJSON *item = cJSON_CreateObject();

    // attribution_windows->click_window_days
    if(attribution_windows->click_window_days) {
    if(cJSON_AddNumberToObject(item, "click_window_days", *attribution_windows->click_window_days) == NULL) {
    goto fail; //Numeric
    }
    }


    // attribution_windows->engagement_window_days
    if(attribution_windows->engagement_window_days) {
    if(cJSON_AddNumberToObject(item, "engagement_window_days", *attribution_windows->engagement_window_days) == NULL) {
    goto fail; //Numeric
    }
    }


    // attribution_windows->view_window_days
    if(attribution_windows->view_window_days) {
    if(cJSON_AddNumberToObject(item, "view_window_days", *attribution_windows->view_window_days) == NULL) {
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

attribution_windows_t *attribution_windows_parseFromJSON(cJSON *attribution_windowsJSON){

    attribution_windows_t *attribution_windows_local_var = NULL;

    // define the local variable for attribution_windows->click_window_days
    int *click_window_days_local_var = NULL;

    // define the local variable for attribution_windows->engagement_window_days
    int *engagement_window_days_local_var = NULL;

    // define the local variable for attribution_windows->view_window_days
    int *view_window_days_local_var = NULL;

    // attribution_windows->click_window_days
    cJSON *click_window_days = cJSON_GetObjectItemCaseSensitive(attribution_windowsJSON, "click_window_days");
    if (cJSON_IsNull(click_window_days)) {
        click_window_days = NULL;
    }
    if (click_window_days) { 
    if(!cJSON_IsNumber(click_window_days))
    {
    goto end; //Numeric
    }
    click_window_days_local_var = malloc(sizeof(int));
    if(!click_window_days_local_var)
    {
        goto end;
    }
    *click_window_days_local_var = click_window_days->valuedouble;
    }

    // attribution_windows->engagement_window_days
    cJSON *engagement_window_days = cJSON_GetObjectItemCaseSensitive(attribution_windowsJSON, "engagement_window_days");
    if (cJSON_IsNull(engagement_window_days)) {
        engagement_window_days = NULL;
    }
    if (engagement_window_days) { 
    if(!cJSON_IsNumber(engagement_window_days))
    {
    goto end; //Numeric
    }
    engagement_window_days_local_var = malloc(sizeof(int));
    if(!engagement_window_days_local_var)
    {
        goto end;
    }
    *engagement_window_days_local_var = engagement_window_days->valuedouble;
    }

    // attribution_windows->view_window_days
    cJSON *view_window_days = cJSON_GetObjectItemCaseSensitive(attribution_windowsJSON, "view_window_days");
    if (cJSON_IsNull(view_window_days)) {
        view_window_days = NULL;
    }
    if (view_window_days) { 
    if(!cJSON_IsNumber(view_window_days))
    {
    goto end; //Numeric
    }
    view_window_days_local_var = malloc(sizeof(int));
    if(!view_window_days_local_var)
    {
        goto end;
    }
    *view_window_days_local_var = view_window_days->valuedouble;
    }



    attribution_windows_local_var = attribution_windows_create_internal (
        click_window_days_local_var,
        engagement_window_days_local_var,
        view_window_days_local_var
        );

    if (!attribution_windows_local_var) {
        goto end;
    }

    return attribution_windows_local_var;
end:
    if (click_window_days_local_var) {
        free(click_window_days_local_var);
        click_window_days_local_var = NULL;
    }
    if (engagement_window_days_local_var) {
        free(engagement_window_days_local_var);
        engagement_window_days_local_var = NULL;
    }
    if (view_window_days_local_var) {
        free(view_window_days_local_var);
        view_window_days_local_var = NULL;
    }
    return NULL;

}
