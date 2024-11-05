#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "app_type_multipliers.h"


char* app_type_multipliers_app_type_ToString(pinterest_rest_api_app_type_multipliers__e app_type) {
    char* app_typeArray[] =  { "NULL", "android_mobile", "android_tablet", "ipad", "iphone", "web", "web_mobile" };
    return app_typeArray[app_type];
}

pinterest_rest_api_app_type_multipliers__e app_type_multipliers_app_type_FromString(char* app_type){
    int stringToReturn = 0;
    char *app_typeArray[] =  { "NULL", "android_mobile", "android_tablet", "ipad", "iphone", "web", "web_mobile" };
    size_t sizeofArray = sizeof(app_typeArray) / sizeof(app_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(app_type, app_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

app_type_multipliers_t *app_type_multipliers_create(
    targeting_spec_app_type_t *app_type
    ) {
    app_type_multipliers_t *app_type_multipliers_local_var = malloc(sizeof(app_type_multipliers_t));
    if (!app_type_multipliers_local_var) {
        return NULL;
    }
    app_type_multipliers_local_var->app_type = app_type;

    return app_type_multipliers_local_var;
}


void app_type_multipliers_free(app_type_multipliers_t *app_type_multipliers) {
    if(NULL == app_type_multipliers){
        return ;
    }
    listEntry_t *listEntry;
    if (app_type_multipliers->app_type) {
        targeting_spec_app_type_free(app_type_multipliers->app_type);
        app_type_multipliers->app_type = NULL;
    }
    free(app_type_multipliers);
}

cJSON *app_type_multipliers_convertToJSON(app_type_multipliers_t *app_type_multipliers) {
    cJSON *item = cJSON_CreateObject();

    // app_type_multipliers->app_type
    if(app_type_multipliers->app_type != pinterest_rest_api_app_type_multipliers__NULL) {
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
    targeting_spec_app_type_t *app_type_local_nonprim = NULL;

    // app_type_multipliers->app_type
    cJSON *app_type = cJSON_GetObjectItemCaseSensitive(app_type_multipliersJSON, "APP_TYPE");
    if (app_type) { 
    app_type_local_nonprim = targeting_spec_app_type_parseFromJSON(app_type); //custom
    }


    app_type_multipliers_local_var = app_type_multipliers_create (
        app_type ? app_type_local_nonprim : NULL
        );

    return app_type_multipliers_local_var;
end:
    if (app_type_local_nonprim) {
        targeting_spec_app_type_free(app_type_local_nonprim);
        app_type_local_nonprim = NULL;
    }
    return NULL;

}
