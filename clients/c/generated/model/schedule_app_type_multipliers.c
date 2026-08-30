#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "schedule_app_type_multipliers.h"



static schedule_app_type_multipliers_t *schedule_app_type_multipliers_create_internal(
    pinterest_rest_api_targeting_spec_app_type__e app_type
    ) {
    schedule_app_type_multipliers_t *schedule_app_type_multipliers_local_var = malloc(sizeof(schedule_app_type_multipliers_t));
    if (!schedule_app_type_multipliers_local_var) {
        return NULL;
    }
    memset(schedule_app_type_multipliers_local_var, 0, sizeof(schedule_app_type_multipliers_t));
    schedule_app_type_multipliers_local_var->_library_owned = 1;
    schedule_app_type_multipliers_local_var->app_type = app_type;
    return schedule_app_type_multipliers_local_var;
}

__attribute__((deprecated)) schedule_app_type_multipliers_t *schedule_app_type_multipliers_create(
    pinterest_rest_api_targeting_spec_app_type__e app_type
    ) {
    schedule_app_type_multipliers_t *result = schedule_app_type_multipliers_create_internal (
        app_type
        );
    if (!result) {
    }
    return result;
}

void schedule_app_type_multipliers_free(schedule_app_type_multipliers_t *schedule_app_type_multipliers) {
    if(NULL == schedule_app_type_multipliers){
        return ;
    }
    if(schedule_app_type_multipliers->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "schedule_app_type_multipliers_free");
        return ;
    }
    listEntry_t *listEntry;
    free(schedule_app_type_multipliers);
}

cJSON *schedule_app_type_multipliers_convertToJSON(schedule_app_type_multipliers_t *schedule_app_type_multipliers) {
    cJSON *item = cJSON_CreateObject();

    // schedule_app_type_multipliers->app_type
    if(schedule_app_type_multipliers->app_type != pinterest_rest_api_targeting_spec_app_type__NULL) {
    cJSON *app_type_local_JSON = targeting_spec_app_type_convertToJSON(schedule_app_type_multipliers->app_type);
    if(app_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "APP_TYPE", app_type_local_JSON);
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

schedule_app_type_multipliers_t *schedule_app_type_multipliers_parseFromJSON(cJSON *schedule_app_type_multipliersJSON){

    schedule_app_type_multipliers_t *schedule_app_type_multipliers_local_var = NULL;

    // define the local variable for schedule_app_type_multipliers->app_type
    pinterest_rest_api_targeting_spec_app_type__e app_type_local_nonprim = 0;

    // schedule_app_type_multipliers->app_type
    cJSON *app_type = cJSON_GetObjectItemCaseSensitive(schedule_app_type_multipliersJSON, "APP_TYPE");
    if (cJSON_IsNull(app_type)) {
        app_type = NULL;
    }
    if (app_type) { 
    app_type_local_nonprim = targeting_spec_app_type_parseFromJSON(app_type); //custom
    }



    schedule_app_type_multipliers_local_var = schedule_app_type_multipliers_create_internal (
        app_type ? app_type_local_nonprim : 0
        );

    if (!schedule_app_type_multipliers_local_var) {
        goto end;
    }

    return schedule_app_type_multipliers_local_var;
end:
    if (app_type_local_nonprim) {
        app_type_local_nonprim = 0;
    }
    return NULL;

}
