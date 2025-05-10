#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "app_type_multipliers.h"



static app_type_multipliers_t *app_type_multipliers_create_internal(
    pinterest_rest_api_targeting_spec_app_type__e app_type
    ) {
    app_type_multipliers_t *app_type_multipliers_local_var = malloc(sizeof(app_type_multipliers_t));
    if (!app_type_multipliers_local_var) {
        return NULL;
    }
    app_type_multipliers_local_var->app_type = app_type;

    app_type_multipliers_local_var->_library_owned = 1;
    return app_type_multipliers_local_var;
}

__attribute__((deprecated)) app_type_multipliers_t *app_type_multipliers_create(
    pinterest_rest_api_targeting_spec_app_type__e app_type
    ) {
    return app_type_multipliers_create_internal (
        app_type
        );
}

void app_type_multipliers_free(app_type_multipliers_t *app_type_multipliers) {
    if(NULL == app_type_multipliers){
        return ;
    }
    if(app_type_multipliers->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "app_type_multipliers_free");
        return ;
    }
    listEntry_t *listEntry;
    free(app_type_multipliers);
}

cJSON *app_type_multipliers_convertToJSON(app_type_multipliers_t *app_type_multipliers) {
    cJSON *item = cJSON_CreateObject();

    // app_type_multipliers->app_type
    if(app_type_multipliers->app_type != pinterest_rest_api_targeting_spec_app_type__NULL) {
    cJSON *app_type_local_JSON = targeting_spec_app_type_convertToJSON(app_type_multipliers->app_type);
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

app_type_multipliers_t *app_type_multipliers_parseFromJSON(cJSON *app_type_multipliersJSON){

    app_type_multipliers_t *app_type_multipliers_local_var = NULL;

    // define the local variable for app_type_multipliers->app_type
    pinterest_rest_api_targeting_spec_app_type__e app_type_local_nonprim = 0;

    // app_type_multipliers->app_type
    cJSON *app_type = cJSON_GetObjectItemCaseSensitive(app_type_multipliersJSON, "APP_TYPE");
    if (cJSON_IsNull(app_type)) {
        app_type = NULL;
    }
    if (app_type) { 
    app_type_local_nonprim = targeting_spec_app_type_parseFromJSON(app_type); //custom
    }


    app_type_multipliers_local_var = app_type_multipliers_create_internal (
        app_type ? app_type_local_nonprim : 0
        );

    return app_type_multipliers_local_var;
end:
    if (app_type_local_nonprim) {
        app_type_local_nonprim = 0;
    }
    return NULL;

}
