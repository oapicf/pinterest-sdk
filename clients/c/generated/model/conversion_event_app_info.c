#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_event_app_info.h"



static conversion_event_app_info_t *conversion_event_app_info_create_internal(
    char *app_id,
    char *app_name,
    char *app_package_name,
    char *app_store,
    char *app_version,
    int *install_time,
    char *user_agent,
    int *window_height,
    int *window_width
    ) {
    conversion_event_app_info_t *conversion_event_app_info_local_var = malloc(sizeof(conversion_event_app_info_t));
    if (!conversion_event_app_info_local_var) {
        return NULL;
    }
    memset(conversion_event_app_info_local_var, 0, sizeof(conversion_event_app_info_t));
    conversion_event_app_info_local_var->_library_owned = 1;
    conversion_event_app_info_local_var->app_id = app_id;
    conversion_event_app_info_local_var->app_name = app_name;
    conversion_event_app_info_local_var->app_package_name = app_package_name;
    conversion_event_app_info_local_var->app_store = app_store;
    conversion_event_app_info_local_var->app_version = app_version;
    conversion_event_app_info_local_var->install_time = install_time;
    conversion_event_app_info_local_var->user_agent = user_agent;
    conversion_event_app_info_local_var->window_height = window_height;
    conversion_event_app_info_local_var->window_width = window_width;
    return conversion_event_app_info_local_var;
}

__attribute__((deprecated)) conversion_event_app_info_t *conversion_event_app_info_create(
    char *app_id,
    char *app_name,
    char *app_package_name,
    char *app_store,
    char *app_version,
    int *install_time,
    char *user_agent,
    int *window_height,
    int *window_width
    ) {
    int *install_time_copy = NULL;
    if (install_time) {
        install_time_copy = malloc(sizeof(int));
        if (install_time_copy) *install_time_copy = *install_time;
    }
    int *window_height_copy = NULL;
    if (window_height) {
        window_height_copy = malloc(sizeof(int));
        if (window_height_copy) *window_height_copy = *window_height;
    }
    int *window_width_copy = NULL;
    if (window_width) {
        window_width_copy = malloc(sizeof(int));
        if (window_width_copy) *window_width_copy = *window_width;
    }
    conversion_event_app_info_t *result = conversion_event_app_info_create_internal (
        app_id,
        app_name,
        app_package_name,
        app_store,
        app_version,
        install_time_copy,
        user_agent,
        window_height_copy,
        window_width_copy
        );
    if (!result) {
        free(install_time_copy);
        free(window_height_copy);
        free(window_width_copy);
    }
    return result;
}

void conversion_event_app_info_free(conversion_event_app_info_t *conversion_event_app_info) {
    if(NULL == conversion_event_app_info){
        return ;
    }
    if(conversion_event_app_info->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "conversion_event_app_info_free");
        return ;
    }
    listEntry_t *listEntry;
    if (conversion_event_app_info->app_id) {
        free(conversion_event_app_info->app_id);
        conversion_event_app_info->app_id = NULL;
    }
    if (conversion_event_app_info->app_name) {
        free(conversion_event_app_info->app_name);
        conversion_event_app_info->app_name = NULL;
    }
    if (conversion_event_app_info->app_package_name) {
        free(conversion_event_app_info->app_package_name);
        conversion_event_app_info->app_package_name = NULL;
    }
    if (conversion_event_app_info->app_store) {
        free(conversion_event_app_info->app_store);
        conversion_event_app_info->app_store = NULL;
    }
    if (conversion_event_app_info->app_version) {
        free(conversion_event_app_info->app_version);
        conversion_event_app_info->app_version = NULL;
    }
    if (conversion_event_app_info->install_time) {
        free(conversion_event_app_info->install_time);
        conversion_event_app_info->install_time = NULL;
    }
    if (conversion_event_app_info->user_agent) {
        free(conversion_event_app_info->user_agent);
        conversion_event_app_info->user_agent = NULL;
    }
    if (conversion_event_app_info->window_height) {
        free(conversion_event_app_info->window_height);
        conversion_event_app_info->window_height = NULL;
    }
    if (conversion_event_app_info->window_width) {
        free(conversion_event_app_info->window_width);
        conversion_event_app_info->window_width = NULL;
    }
    free(conversion_event_app_info);
}

cJSON *conversion_event_app_info_convertToJSON(conversion_event_app_info_t *conversion_event_app_info) {
    cJSON *item = cJSON_CreateObject();

    // conversion_event_app_info->app_id
    if(conversion_event_app_info->app_id) {
    if(cJSON_AddStringToObject(item, "app_id", conversion_event_app_info->app_id) == NULL) {
    goto fail; //String
    }
    }


    // conversion_event_app_info->app_name
    if(conversion_event_app_info->app_name) {
    if(cJSON_AddStringToObject(item, "app_name", conversion_event_app_info->app_name) == NULL) {
    goto fail; //String
    }
    }


    // conversion_event_app_info->app_package_name
    if(conversion_event_app_info->app_package_name) {
    if(cJSON_AddStringToObject(item, "app_package_name", conversion_event_app_info->app_package_name) == NULL) {
    goto fail; //String
    }
    }


    // conversion_event_app_info->app_store
    if(conversion_event_app_info->app_store) {
    if(cJSON_AddStringToObject(item, "app_store", conversion_event_app_info->app_store) == NULL) {
    goto fail; //String
    }
    }


    // conversion_event_app_info->app_version
    if(conversion_event_app_info->app_version) {
    if(cJSON_AddStringToObject(item, "app_version", conversion_event_app_info->app_version) == NULL) {
    goto fail; //String
    }
    }


    // conversion_event_app_info->install_time
    if(conversion_event_app_info->install_time) {
    if(cJSON_AddNumberToObject(item, "install_time", *conversion_event_app_info->install_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // conversion_event_app_info->user_agent
    if(conversion_event_app_info->user_agent) {
    if(cJSON_AddStringToObject(item, "user_agent", conversion_event_app_info->user_agent) == NULL) {
    goto fail; //String
    }
    }


    // conversion_event_app_info->window_height
    if(conversion_event_app_info->window_height) {
    if(cJSON_AddNumberToObject(item, "window_height", *conversion_event_app_info->window_height) == NULL) {
    goto fail; //Numeric
    }
    }


    // conversion_event_app_info->window_width
    if(conversion_event_app_info->window_width) {
    if(cJSON_AddNumberToObject(item, "window_width", *conversion_event_app_info->window_width) == NULL) {
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

conversion_event_app_info_t *conversion_event_app_info_parseFromJSON(cJSON *conversion_event_app_infoJSON){

    conversion_event_app_info_t *conversion_event_app_info_local_var = NULL;

    char *app_id_local_str = NULL;

    char *app_name_local_str = NULL;

    char *app_package_name_local_str = NULL;

    char *app_store_local_str = NULL;

    char *app_version_local_str = NULL;

    // define the local variable for conversion_event_app_info->install_time
    int *install_time_local_var = NULL;

    char *user_agent_local_str = NULL;

    // define the local variable for conversion_event_app_info->window_height
    int *window_height_local_var = NULL;

    // define the local variable for conversion_event_app_info->window_width
    int *window_width_local_var = NULL;

    // conversion_event_app_info->app_id
    cJSON *app_id = cJSON_GetObjectItemCaseSensitive(conversion_event_app_infoJSON, "app_id");
    if (cJSON_IsNull(app_id)) {
        app_id = NULL;
    }
    if (app_id) { 
    if(!cJSON_IsString(app_id) && !cJSON_IsNull(app_id))
    {
    goto end; //String
    }
    }

    // conversion_event_app_info->app_name
    cJSON *app_name = cJSON_GetObjectItemCaseSensitive(conversion_event_app_infoJSON, "app_name");
    if (cJSON_IsNull(app_name)) {
        app_name = NULL;
    }
    if (app_name) { 
    if(!cJSON_IsString(app_name) && !cJSON_IsNull(app_name))
    {
    goto end; //String
    }
    }

    // conversion_event_app_info->app_package_name
    cJSON *app_package_name = cJSON_GetObjectItemCaseSensitive(conversion_event_app_infoJSON, "app_package_name");
    if (cJSON_IsNull(app_package_name)) {
        app_package_name = NULL;
    }
    if (app_package_name) { 
    if(!cJSON_IsString(app_package_name) && !cJSON_IsNull(app_package_name))
    {
    goto end; //String
    }
    }

    // conversion_event_app_info->app_store
    cJSON *app_store = cJSON_GetObjectItemCaseSensitive(conversion_event_app_infoJSON, "app_store");
    if (cJSON_IsNull(app_store)) {
        app_store = NULL;
    }
    if (app_store) { 
    if(!cJSON_IsString(app_store) && !cJSON_IsNull(app_store))
    {
    goto end; //String
    }
    }

    // conversion_event_app_info->app_version
    cJSON *app_version = cJSON_GetObjectItemCaseSensitive(conversion_event_app_infoJSON, "app_version");
    if (cJSON_IsNull(app_version)) {
        app_version = NULL;
    }
    if (app_version) { 
    if(!cJSON_IsString(app_version) && !cJSON_IsNull(app_version))
    {
    goto end; //String
    }
    }

    // conversion_event_app_info->install_time
    cJSON *install_time = cJSON_GetObjectItemCaseSensitive(conversion_event_app_infoJSON, "install_time");
    if (cJSON_IsNull(install_time)) {
        install_time = NULL;
    }
    if (install_time) { 
    if(!cJSON_IsNumber(install_time))
    {
    goto end; //Numeric
    }
    install_time_local_var = malloc(sizeof(int));
    if(!install_time_local_var)
    {
        goto end;
    }
    *install_time_local_var = install_time->valuedouble;
    }

    // conversion_event_app_info->user_agent
    cJSON *user_agent = cJSON_GetObjectItemCaseSensitive(conversion_event_app_infoJSON, "user_agent");
    if (cJSON_IsNull(user_agent)) {
        user_agent = NULL;
    }
    if (user_agent) { 
    if(!cJSON_IsString(user_agent) && !cJSON_IsNull(user_agent))
    {
    goto end; //String
    }
    }

    // conversion_event_app_info->window_height
    cJSON *window_height = cJSON_GetObjectItemCaseSensitive(conversion_event_app_infoJSON, "window_height");
    if (cJSON_IsNull(window_height)) {
        window_height = NULL;
    }
    if (window_height) { 
    if(!cJSON_IsNumber(window_height))
    {
    goto end; //Numeric
    }
    window_height_local_var = malloc(sizeof(int));
    if(!window_height_local_var)
    {
        goto end;
    }
    *window_height_local_var = window_height->valuedouble;
    }

    // conversion_event_app_info->window_width
    cJSON *window_width = cJSON_GetObjectItemCaseSensitive(conversion_event_app_infoJSON, "window_width");
    if (cJSON_IsNull(window_width)) {
        window_width = NULL;
    }
    if (window_width) { 
    if(!cJSON_IsNumber(window_width))
    {
    goto end; //Numeric
    }
    window_width_local_var = malloc(sizeof(int));
    if(!window_width_local_var)
    {
        goto end;
    }
    *window_width_local_var = window_width->valuedouble;
    }


    if (app_id && !cJSON_IsNull(app_id)) app_id_local_str = strdup(app_id->valuestring);
    if (app_name && !cJSON_IsNull(app_name)) app_name_local_str = strdup(app_name->valuestring);
    if (app_package_name && !cJSON_IsNull(app_package_name)) app_package_name_local_str = strdup(app_package_name->valuestring);
    if (app_store && !cJSON_IsNull(app_store)) app_store_local_str = strdup(app_store->valuestring);
    if (app_version && !cJSON_IsNull(app_version)) app_version_local_str = strdup(app_version->valuestring);
    if (user_agent && !cJSON_IsNull(user_agent)) user_agent_local_str = strdup(user_agent->valuestring);

    conversion_event_app_info_local_var = conversion_event_app_info_create_internal (
        app_id_local_str,
        app_name_local_str,
        app_package_name_local_str,
        app_store_local_str,
        app_version_local_str,
        install_time_local_var,
        user_agent_local_str,
        window_height_local_var,
        window_width_local_var
        );

    if (!conversion_event_app_info_local_var) {
        goto end;
    }

    return conversion_event_app_info_local_var;
end:
    if (app_id_local_str) {
        free(app_id_local_str);
        app_id_local_str = NULL;
    }
    if (app_name_local_str) {
        free(app_name_local_str);
        app_name_local_str = NULL;
    }
    if (app_package_name_local_str) {
        free(app_package_name_local_str);
        app_package_name_local_str = NULL;
    }
    if (app_store_local_str) {
        free(app_store_local_str);
        app_store_local_str = NULL;
    }
    if (app_version_local_str) {
        free(app_version_local_str);
        app_version_local_str = NULL;
    }
    if (install_time_local_var) {
        free(install_time_local_var);
        install_time_local_var = NULL;
    }
    if (user_agent_local_str) {
        free(user_agent_local_str);
        user_agent_local_str = NULL;
    }
    if (window_height_local_var) {
        free(window_height_local_var);
        window_height_local_var = NULL;
    }
    if (window_width_local_var) {
        free(window_width_local_var);
        window_width_local_var = NULL;
    }
    return NULL;

}
