#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "app_type_multipliers.h"


char* app_type_multipliers_app_type_ToString(pinterest_rest_api_app_type_multipliers_APPTYPE_e app_type) {
    char* app_typeArray[] =  { "NULL", "android_mobile", "android_tablet", "ipad", "iphone", "web", "web_mobile" };
    return app_typeArray[app_type];
}

pinterest_rest_api_app_type_multipliers_APPTYPE_e app_type_multipliers_app_type_FromString(char* app_type){
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

static app_type_multipliers_t *app_type_multipliers_create_internal(
    pinterest_rest_api_app_type_multipliers_APPTYPE_e app_type
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
    pinterest_rest_api_app_type_multipliers_APPTYPE_e app_type
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
    if(app_type_multipliers->app_type != pinterest_rest_api_app_type_multipliers_APPTYPE_NULL) {
    if(cJSON_AddStringToObject(item, "APP_TYPE", app_type_multipliers_app_type_ToString(app_type_multipliers->app_type)) == NULL)
    {
    goto fail; //Enum
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

    // app_type_multipliers->app_type
    cJSON *app_type = cJSON_GetObjectItemCaseSensitive(app_type_multipliersJSON, "APP_TYPE");
    if (cJSON_IsNull(app_type)) {
        app_type = NULL;
    }
    pinterest_rest_api_app_type_multipliers_APPTYPE_e app_typeVariable;
    if (app_type) { 
    if(!cJSON_IsString(app_type))
    {
    goto end; //Enum
    }
    app_typeVariable = app_type_multipliers_app_type_FromString(app_type->valuestring);
    }


    app_type_multipliers_local_var = app_type_multipliers_create_internal (
        app_type ? app_typeVariable : pinterest_rest_api_app_type_multipliers_APPTYPE_NULL
        );

    return app_type_multipliers_local_var;
end:
    return NULL;

}
