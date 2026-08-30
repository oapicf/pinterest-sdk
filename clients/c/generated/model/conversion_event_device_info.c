#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_event_device_info.h"



static conversion_event_device_info_t *conversion_event_device_info_create_internal(
    int *battery_level,
    char *brand,
    char *carrier,
    int *cpu_cores,
    int *external_storage_free_space,
    int *external_storage_size,
    form_factor_t *form_factor,
    char *kernel_version,
    list_t *languages,
    char *locale,
    char *model,
    network_type_t *network_type,
    os_family_t *os_family,
    char *os_name,
    char *os_release_name,
    char *os_version,
    int *screen_density,
    int *screen_height,
    int *screen_width,
    int *storage_free_space,
    int *storage_size,
    char *timezone,
    char *timezone_abbr,
    char *type
    ) {
    conversion_event_device_info_t *conversion_event_device_info_local_var = malloc(sizeof(conversion_event_device_info_t));
    if (!conversion_event_device_info_local_var) {
        return NULL;
    }
    memset(conversion_event_device_info_local_var, 0, sizeof(conversion_event_device_info_t));
    conversion_event_device_info_local_var->_library_owned = 1;
    conversion_event_device_info_local_var->battery_level = battery_level;
    conversion_event_device_info_local_var->brand = brand;
    conversion_event_device_info_local_var->carrier = carrier;
    conversion_event_device_info_local_var->cpu_cores = cpu_cores;
    conversion_event_device_info_local_var->external_storage_free_space = external_storage_free_space;
    conversion_event_device_info_local_var->external_storage_size = external_storage_size;
    conversion_event_device_info_local_var->form_factor = form_factor;
    conversion_event_device_info_local_var->kernel_version = kernel_version;
    conversion_event_device_info_local_var->languages = languages;
    conversion_event_device_info_local_var->locale = locale;
    conversion_event_device_info_local_var->model = model;
    conversion_event_device_info_local_var->network_type = network_type;
    conversion_event_device_info_local_var->os_family = os_family;
    conversion_event_device_info_local_var->os_name = os_name;
    conversion_event_device_info_local_var->os_release_name = os_release_name;
    conversion_event_device_info_local_var->os_version = os_version;
    conversion_event_device_info_local_var->screen_density = screen_density;
    conversion_event_device_info_local_var->screen_height = screen_height;
    conversion_event_device_info_local_var->screen_width = screen_width;
    conversion_event_device_info_local_var->storage_free_space = storage_free_space;
    conversion_event_device_info_local_var->storage_size = storage_size;
    conversion_event_device_info_local_var->timezone = timezone;
    conversion_event_device_info_local_var->timezone_abbr = timezone_abbr;
    conversion_event_device_info_local_var->type = type;
    return conversion_event_device_info_local_var;
}

__attribute__((deprecated)) conversion_event_device_info_t *conversion_event_device_info_create(
    int *battery_level,
    char *brand,
    char *carrier,
    int *cpu_cores,
    int *external_storage_free_space,
    int *external_storage_size,
    form_factor_t *form_factor,
    char *kernel_version,
    list_t *languages,
    char *locale,
    char *model,
    network_type_t *network_type,
    os_family_t *os_family,
    char *os_name,
    char *os_release_name,
    char *os_version,
    int *screen_density,
    int *screen_height,
    int *screen_width,
    int *storage_free_space,
    int *storage_size,
    char *timezone,
    char *timezone_abbr,
    char *type
    ) {
    int *battery_level_copy = NULL;
    if (battery_level) {
        battery_level_copy = malloc(sizeof(int));
        if (battery_level_copy) *battery_level_copy = *battery_level;
    }
    int *cpu_cores_copy = NULL;
    if (cpu_cores) {
        cpu_cores_copy = malloc(sizeof(int));
        if (cpu_cores_copy) *cpu_cores_copy = *cpu_cores;
    }
    int *external_storage_free_space_copy = NULL;
    if (external_storage_free_space) {
        external_storage_free_space_copy = malloc(sizeof(int));
        if (external_storage_free_space_copy) *external_storage_free_space_copy = *external_storage_free_space;
    }
    int *external_storage_size_copy = NULL;
    if (external_storage_size) {
        external_storage_size_copy = malloc(sizeof(int));
        if (external_storage_size_copy) *external_storage_size_copy = *external_storage_size;
    }
    int *screen_density_copy = NULL;
    if (screen_density) {
        screen_density_copy = malloc(sizeof(int));
        if (screen_density_copy) *screen_density_copy = *screen_density;
    }
    int *screen_height_copy = NULL;
    if (screen_height) {
        screen_height_copy = malloc(sizeof(int));
        if (screen_height_copy) *screen_height_copy = *screen_height;
    }
    int *screen_width_copy = NULL;
    if (screen_width) {
        screen_width_copy = malloc(sizeof(int));
        if (screen_width_copy) *screen_width_copy = *screen_width;
    }
    int *storage_free_space_copy = NULL;
    if (storage_free_space) {
        storage_free_space_copy = malloc(sizeof(int));
        if (storage_free_space_copy) *storage_free_space_copy = *storage_free_space;
    }
    int *storage_size_copy = NULL;
    if (storage_size) {
        storage_size_copy = malloc(sizeof(int));
        if (storage_size_copy) *storage_size_copy = *storage_size;
    }
    conversion_event_device_info_t *result = conversion_event_device_info_create_internal (
        battery_level_copy,
        brand,
        carrier,
        cpu_cores_copy,
        external_storage_free_space_copy,
        external_storage_size_copy,
        form_factor,
        kernel_version,
        languages,
        locale,
        model,
        network_type,
        os_family,
        os_name,
        os_release_name,
        os_version,
        screen_density_copy,
        screen_height_copy,
        screen_width_copy,
        storage_free_space_copy,
        storage_size_copy,
        timezone,
        timezone_abbr,
        type
        );
    if (!result) {
        free(battery_level_copy);
        free(cpu_cores_copy);
        free(external_storage_free_space_copy);
        free(external_storage_size_copy);
        free(screen_density_copy);
        free(screen_height_copy);
        free(screen_width_copy);
        free(storage_free_space_copy);
        free(storage_size_copy);
    }
    return result;
}

void conversion_event_device_info_free(conversion_event_device_info_t *conversion_event_device_info) {
    if(NULL == conversion_event_device_info){
        return ;
    }
    if(conversion_event_device_info->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "conversion_event_device_info_free");
        return ;
    }
    listEntry_t *listEntry;
    if (conversion_event_device_info->battery_level) {
        free(conversion_event_device_info->battery_level);
        conversion_event_device_info->battery_level = NULL;
    }
    if (conversion_event_device_info->brand) {
        free(conversion_event_device_info->brand);
        conversion_event_device_info->brand = NULL;
    }
    if (conversion_event_device_info->carrier) {
        free(conversion_event_device_info->carrier);
        conversion_event_device_info->carrier = NULL;
    }
    if (conversion_event_device_info->cpu_cores) {
        free(conversion_event_device_info->cpu_cores);
        conversion_event_device_info->cpu_cores = NULL;
    }
    if (conversion_event_device_info->external_storage_free_space) {
        free(conversion_event_device_info->external_storage_free_space);
        conversion_event_device_info->external_storage_free_space = NULL;
    }
    if (conversion_event_device_info->external_storage_size) {
        free(conversion_event_device_info->external_storage_size);
        conversion_event_device_info->external_storage_size = NULL;
    }
    if (conversion_event_device_info->form_factor) {
        form_factor_free(conversion_event_device_info->form_factor);
        conversion_event_device_info->form_factor = NULL;
    }
    if (conversion_event_device_info->kernel_version) {
        free(conversion_event_device_info->kernel_version);
        conversion_event_device_info->kernel_version = NULL;
    }
    if (conversion_event_device_info->languages) {
        list_ForEach(listEntry, conversion_event_device_info->languages) {
            free(listEntry->data);
        }
        list_freeList(conversion_event_device_info->languages);
        conversion_event_device_info->languages = NULL;
    }
    if (conversion_event_device_info->locale) {
        free(conversion_event_device_info->locale);
        conversion_event_device_info->locale = NULL;
    }
    if (conversion_event_device_info->model) {
        free(conversion_event_device_info->model);
        conversion_event_device_info->model = NULL;
    }
    if (conversion_event_device_info->network_type) {
        network_type_free(conversion_event_device_info->network_type);
        conversion_event_device_info->network_type = NULL;
    }
    if (conversion_event_device_info->os_family) {
        os_family_free(conversion_event_device_info->os_family);
        conversion_event_device_info->os_family = NULL;
    }
    if (conversion_event_device_info->os_name) {
        free(conversion_event_device_info->os_name);
        conversion_event_device_info->os_name = NULL;
    }
    if (conversion_event_device_info->os_release_name) {
        free(conversion_event_device_info->os_release_name);
        conversion_event_device_info->os_release_name = NULL;
    }
    if (conversion_event_device_info->os_version) {
        free(conversion_event_device_info->os_version);
        conversion_event_device_info->os_version = NULL;
    }
    if (conversion_event_device_info->screen_density) {
        free(conversion_event_device_info->screen_density);
        conversion_event_device_info->screen_density = NULL;
    }
    if (conversion_event_device_info->screen_height) {
        free(conversion_event_device_info->screen_height);
        conversion_event_device_info->screen_height = NULL;
    }
    if (conversion_event_device_info->screen_width) {
        free(conversion_event_device_info->screen_width);
        conversion_event_device_info->screen_width = NULL;
    }
    if (conversion_event_device_info->storage_free_space) {
        free(conversion_event_device_info->storage_free_space);
        conversion_event_device_info->storage_free_space = NULL;
    }
    if (conversion_event_device_info->storage_size) {
        free(conversion_event_device_info->storage_size);
        conversion_event_device_info->storage_size = NULL;
    }
    if (conversion_event_device_info->timezone) {
        free(conversion_event_device_info->timezone);
        conversion_event_device_info->timezone = NULL;
    }
    if (conversion_event_device_info->timezone_abbr) {
        free(conversion_event_device_info->timezone_abbr);
        conversion_event_device_info->timezone_abbr = NULL;
    }
    if (conversion_event_device_info->type) {
        free(conversion_event_device_info->type);
        conversion_event_device_info->type = NULL;
    }
    free(conversion_event_device_info);
}

cJSON *conversion_event_device_info_convertToJSON(conversion_event_device_info_t *conversion_event_device_info) {
    cJSON *item = cJSON_CreateObject();

    // conversion_event_device_info->battery_level
    if(conversion_event_device_info->battery_level) {
    if(cJSON_AddNumberToObject(item, "battery_level", *conversion_event_device_info->battery_level) == NULL) {
    goto fail; //Numeric
    }
    }


    // conversion_event_device_info->brand
    if(conversion_event_device_info->brand) {
    if(cJSON_AddStringToObject(item, "brand", conversion_event_device_info->brand) == NULL) {
    goto fail; //String
    }
    }


    // conversion_event_device_info->carrier
    if(conversion_event_device_info->carrier) {
    if(cJSON_AddStringToObject(item, "carrier", conversion_event_device_info->carrier) == NULL) {
    goto fail; //String
    }
    }


    // conversion_event_device_info->cpu_cores
    if(conversion_event_device_info->cpu_cores) {
    if(cJSON_AddNumberToObject(item, "cpu_cores", *conversion_event_device_info->cpu_cores) == NULL) {
    goto fail; //Numeric
    }
    }


    // conversion_event_device_info->external_storage_free_space
    if(conversion_event_device_info->external_storage_free_space) {
    if(cJSON_AddNumberToObject(item, "external_storage_free_space", *conversion_event_device_info->external_storage_free_space) == NULL) {
    goto fail; //Numeric
    }
    }


    // conversion_event_device_info->external_storage_size
    if(conversion_event_device_info->external_storage_size) {
    if(cJSON_AddNumberToObject(item, "external_storage_size", *conversion_event_device_info->external_storage_size) == NULL) {
    goto fail; //Numeric
    }
    }


    // conversion_event_device_info->form_factor
    if(conversion_event_device_info->form_factor) {
    cJSON *form_factor_local_JSON = form_factor_convertToJSON(conversion_event_device_info->form_factor);
    if(form_factor_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "form_factor", form_factor_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // conversion_event_device_info->kernel_version
    if(conversion_event_device_info->kernel_version) {
    if(cJSON_AddStringToObject(item, "kernel_version", conversion_event_device_info->kernel_version) == NULL) {
    goto fail; //String
    }
    }


    // conversion_event_device_info->languages
    if(conversion_event_device_info->languages) {
    cJSON *languages = cJSON_AddArrayToObject(item, "languages");
    if(languages == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *languagesListEntry;
    list_ForEach(languagesListEntry, conversion_event_device_info->languages) {
    if(cJSON_AddStringToObject(languages, "", languagesListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // conversion_event_device_info->locale
    if(conversion_event_device_info->locale) {
    if(cJSON_AddStringToObject(item, "locale", conversion_event_device_info->locale) == NULL) {
    goto fail; //String
    }
    }


    // conversion_event_device_info->model
    if(conversion_event_device_info->model) {
    if(cJSON_AddStringToObject(item, "model", conversion_event_device_info->model) == NULL) {
    goto fail; //String
    }
    }


    // conversion_event_device_info->network_type
    if(conversion_event_device_info->network_type) {
    cJSON *network_type_local_JSON = network_type_convertToJSON(conversion_event_device_info->network_type);
    if(network_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "network_type", network_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // conversion_event_device_info->os_family
    if(conversion_event_device_info->os_family) {
    cJSON *os_family_local_JSON = os_family_convertToJSON(conversion_event_device_info->os_family);
    if(os_family_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "os_family", os_family_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // conversion_event_device_info->os_name
    if(conversion_event_device_info->os_name) {
    if(cJSON_AddStringToObject(item, "os_name", conversion_event_device_info->os_name) == NULL) {
    goto fail; //String
    }
    }


    // conversion_event_device_info->os_release_name
    if(conversion_event_device_info->os_release_name) {
    if(cJSON_AddStringToObject(item, "os_release_name", conversion_event_device_info->os_release_name) == NULL) {
    goto fail; //String
    }
    }


    // conversion_event_device_info->os_version
    if(conversion_event_device_info->os_version) {
    if(cJSON_AddStringToObject(item, "os_version", conversion_event_device_info->os_version) == NULL) {
    goto fail; //String
    }
    }


    // conversion_event_device_info->screen_density
    if(conversion_event_device_info->screen_density) {
    if(cJSON_AddNumberToObject(item, "screen_density", *conversion_event_device_info->screen_density) == NULL) {
    goto fail; //Numeric
    }
    }


    // conversion_event_device_info->screen_height
    if(conversion_event_device_info->screen_height) {
    if(cJSON_AddNumberToObject(item, "screen_height", *conversion_event_device_info->screen_height) == NULL) {
    goto fail; //Numeric
    }
    }


    // conversion_event_device_info->screen_width
    if(conversion_event_device_info->screen_width) {
    if(cJSON_AddNumberToObject(item, "screen_width", *conversion_event_device_info->screen_width) == NULL) {
    goto fail; //Numeric
    }
    }


    // conversion_event_device_info->storage_free_space
    if(conversion_event_device_info->storage_free_space) {
    if(cJSON_AddNumberToObject(item, "storage_free_space", *conversion_event_device_info->storage_free_space) == NULL) {
    goto fail; //Numeric
    }
    }


    // conversion_event_device_info->storage_size
    if(conversion_event_device_info->storage_size) {
    if(cJSON_AddNumberToObject(item, "storage_size", *conversion_event_device_info->storage_size) == NULL) {
    goto fail; //Numeric
    }
    }


    // conversion_event_device_info->timezone
    if(conversion_event_device_info->timezone) {
    if(cJSON_AddStringToObject(item, "timezone", conversion_event_device_info->timezone) == NULL) {
    goto fail; //String
    }
    }


    // conversion_event_device_info->timezone_abbr
    if(conversion_event_device_info->timezone_abbr) {
    if(cJSON_AddStringToObject(item, "timezone_abbr", conversion_event_device_info->timezone_abbr) == NULL) {
    goto fail; //String
    }
    }


    // conversion_event_device_info->type
    if(conversion_event_device_info->type) {
    if(cJSON_AddStringToObject(item, "type", conversion_event_device_info->type) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

conversion_event_device_info_t *conversion_event_device_info_parseFromJSON(cJSON *conversion_event_device_infoJSON){

    conversion_event_device_info_t *conversion_event_device_info_local_var = NULL;

    // define the local variable for conversion_event_device_info->battery_level
    int *battery_level_local_var = NULL;

    char *brand_local_str = NULL;

    char *carrier_local_str = NULL;

    // define the local variable for conversion_event_device_info->cpu_cores
    int *cpu_cores_local_var = NULL;

    // define the local variable for conversion_event_device_info->external_storage_free_space
    int *external_storage_free_space_local_var = NULL;

    // define the local variable for conversion_event_device_info->external_storage_size
    int *external_storage_size_local_var = NULL;

    // define the local variable for conversion_event_device_info->form_factor
    form_factor_t *form_factor_local_nonprim = NULL;

    char *kernel_version_local_str = NULL;

    // define the local list for conversion_event_device_info->languages
    list_t *languagesList = NULL;

    char *locale_local_str = NULL;

    char *model_local_str = NULL;

    // define the local variable for conversion_event_device_info->network_type
    network_type_t *network_type_local_nonprim = NULL;

    // define the local variable for conversion_event_device_info->os_family
    os_family_t *os_family_local_nonprim = NULL;

    char *os_name_local_str = NULL;

    char *os_release_name_local_str = NULL;

    char *os_version_local_str = NULL;

    // define the local variable for conversion_event_device_info->screen_density
    int *screen_density_local_var = NULL;

    // define the local variable for conversion_event_device_info->screen_height
    int *screen_height_local_var = NULL;

    // define the local variable for conversion_event_device_info->screen_width
    int *screen_width_local_var = NULL;

    // define the local variable for conversion_event_device_info->storage_free_space
    int *storage_free_space_local_var = NULL;

    // define the local variable for conversion_event_device_info->storage_size
    int *storage_size_local_var = NULL;

    char *timezone_local_str = NULL;

    char *timezone_abbr_local_str = NULL;

    char *type_local_str = NULL;

    // conversion_event_device_info->battery_level
    cJSON *battery_level = cJSON_GetObjectItemCaseSensitive(conversion_event_device_infoJSON, "battery_level");
    if (cJSON_IsNull(battery_level)) {
        battery_level = NULL;
    }
    if (battery_level) { 
    if(!cJSON_IsNumber(battery_level))
    {
    goto end; //Numeric
    }
    battery_level_local_var = malloc(sizeof(int));
    if(!battery_level_local_var)
    {
        goto end;
    }
    *battery_level_local_var = battery_level->valuedouble;
    }

    // conversion_event_device_info->brand
    cJSON *brand = cJSON_GetObjectItemCaseSensitive(conversion_event_device_infoJSON, "brand");
    if (cJSON_IsNull(brand)) {
        brand = NULL;
    }
    if (brand) { 
    if(!cJSON_IsString(brand) && !cJSON_IsNull(brand))
    {
    goto end; //String
    }
    }

    // conversion_event_device_info->carrier
    cJSON *carrier = cJSON_GetObjectItemCaseSensitive(conversion_event_device_infoJSON, "carrier");
    if (cJSON_IsNull(carrier)) {
        carrier = NULL;
    }
    if (carrier) { 
    if(!cJSON_IsString(carrier) && !cJSON_IsNull(carrier))
    {
    goto end; //String
    }
    }

    // conversion_event_device_info->cpu_cores
    cJSON *cpu_cores = cJSON_GetObjectItemCaseSensitive(conversion_event_device_infoJSON, "cpu_cores");
    if (cJSON_IsNull(cpu_cores)) {
        cpu_cores = NULL;
    }
    if (cpu_cores) { 
    if(!cJSON_IsNumber(cpu_cores))
    {
    goto end; //Numeric
    }
    cpu_cores_local_var = malloc(sizeof(int));
    if(!cpu_cores_local_var)
    {
        goto end;
    }
    *cpu_cores_local_var = cpu_cores->valuedouble;
    }

    // conversion_event_device_info->external_storage_free_space
    cJSON *external_storage_free_space = cJSON_GetObjectItemCaseSensitive(conversion_event_device_infoJSON, "external_storage_free_space");
    if (cJSON_IsNull(external_storage_free_space)) {
        external_storage_free_space = NULL;
    }
    if (external_storage_free_space) { 
    if(!cJSON_IsNumber(external_storage_free_space))
    {
    goto end; //Numeric
    }
    external_storage_free_space_local_var = malloc(sizeof(int));
    if(!external_storage_free_space_local_var)
    {
        goto end;
    }
    *external_storage_free_space_local_var = external_storage_free_space->valuedouble;
    }

    // conversion_event_device_info->external_storage_size
    cJSON *external_storage_size = cJSON_GetObjectItemCaseSensitive(conversion_event_device_infoJSON, "external_storage_size");
    if (cJSON_IsNull(external_storage_size)) {
        external_storage_size = NULL;
    }
    if (external_storage_size) { 
    if(!cJSON_IsNumber(external_storage_size))
    {
    goto end; //Numeric
    }
    external_storage_size_local_var = malloc(sizeof(int));
    if(!external_storage_size_local_var)
    {
        goto end;
    }
    *external_storage_size_local_var = external_storage_size->valuedouble;
    }

    // conversion_event_device_info->form_factor
    cJSON *form_factor = cJSON_GetObjectItemCaseSensitive(conversion_event_device_infoJSON, "form_factor");
    if (cJSON_IsNull(form_factor)) {
        form_factor = NULL;
    }
    if (form_factor) { 
    form_factor_local_nonprim = form_factor_parseFromJSON(form_factor); //custom
    }

    // conversion_event_device_info->kernel_version
    cJSON *kernel_version = cJSON_GetObjectItemCaseSensitive(conversion_event_device_infoJSON, "kernel_version");
    if (cJSON_IsNull(kernel_version)) {
        kernel_version = NULL;
    }
    if (kernel_version) { 
    if(!cJSON_IsString(kernel_version) && !cJSON_IsNull(kernel_version))
    {
    goto end; //String
    }
    }

    // conversion_event_device_info->languages
    cJSON *languages = cJSON_GetObjectItemCaseSensitive(conversion_event_device_infoJSON, "languages");
    if (cJSON_IsNull(languages)) {
        languages = NULL;
    }
    if (languages) { 
    cJSON *languages_local = NULL;
    if(!cJSON_IsArray(languages)) {
        goto end;//primitive container
    }
    languagesList = list_createList();

    cJSON_ArrayForEach(languages_local, languages)
    {
        if(!cJSON_IsString(languages_local))
        {
            goto end;
        }
        list_addElement(languagesList , strdup(languages_local->valuestring));
    }
    }

    // conversion_event_device_info->locale
    cJSON *locale = cJSON_GetObjectItemCaseSensitive(conversion_event_device_infoJSON, "locale");
    if (cJSON_IsNull(locale)) {
        locale = NULL;
    }
    if (locale) { 
    if(!cJSON_IsString(locale) && !cJSON_IsNull(locale))
    {
    goto end; //String
    }
    }

    // conversion_event_device_info->model
    cJSON *model = cJSON_GetObjectItemCaseSensitive(conversion_event_device_infoJSON, "model");
    if (cJSON_IsNull(model)) {
        model = NULL;
    }
    if (model) { 
    if(!cJSON_IsString(model) && !cJSON_IsNull(model))
    {
    goto end; //String
    }
    }

    // conversion_event_device_info->network_type
    cJSON *network_type = cJSON_GetObjectItemCaseSensitive(conversion_event_device_infoJSON, "network_type");
    if (cJSON_IsNull(network_type)) {
        network_type = NULL;
    }
    if (network_type) { 
    network_type_local_nonprim = network_type_parseFromJSON(network_type); //custom
    }

    // conversion_event_device_info->os_family
    cJSON *os_family = cJSON_GetObjectItemCaseSensitive(conversion_event_device_infoJSON, "os_family");
    if (cJSON_IsNull(os_family)) {
        os_family = NULL;
    }
    if (os_family) { 
    os_family_local_nonprim = os_family_parseFromJSON(os_family); //custom
    }

    // conversion_event_device_info->os_name
    cJSON *os_name = cJSON_GetObjectItemCaseSensitive(conversion_event_device_infoJSON, "os_name");
    if (cJSON_IsNull(os_name)) {
        os_name = NULL;
    }
    if (os_name) { 
    if(!cJSON_IsString(os_name) && !cJSON_IsNull(os_name))
    {
    goto end; //String
    }
    }

    // conversion_event_device_info->os_release_name
    cJSON *os_release_name = cJSON_GetObjectItemCaseSensitive(conversion_event_device_infoJSON, "os_release_name");
    if (cJSON_IsNull(os_release_name)) {
        os_release_name = NULL;
    }
    if (os_release_name) { 
    if(!cJSON_IsString(os_release_name) && !cJSON_IsNull(os_release_name))
    {
    goto end; //String
    }
    }

    // conversion_event_device_info->os_version
    cJSON *os_version = cJSON_GetObjectItemCaseSensitive(conversion_event_device_infoJSON, "os_version");
    if (cJSON_IsNull(os_version)) {
        os_version = NULL;
    }
    if (os_version) { 
    if(!cJSON_IsString(os_version) && !cJSON_IsNull(os_version))
    {
    goto end; //String
    }
    }

    // conversion_event_device_info->screen_density
    cJSON *screen_density = cJSON_GetObjectItemCaseSensitive(conversion_event_device_infoJSON, "screen_density");
    if (cJSON_IsNull(screen_density)) {
        screen_density = NULL;
    }
    if (screen_density) { 
    if(!cJSON_IsNumber(screen_density))
    {
    goto end; //Numeric
    }
    screen_density_local_var = malloc(sizeof(int));
    if(!screen_density_local_var)
    {
        goto end;
    }
    *screen_density_local_var = screen_density->valuedouble;
    }

    // conversion_event_device_info->screen_height
    cJSON *screen_height = cJSON_GetObjectItemCaseSensitive(conversion_event_device_infoJSON, "screen_height");
    if (cJSON_IsNull(screen_height)) {
        screen_height = NULL;
    }
    if (screen_height) { 
    if(!cJSON_IsNumber(screen_height))
    {
    goto end; //Numeric
    }
    screen_height_local_var = malloc(sizeof(int));
    if(!screen_height_local_var)
    {
        goto end;
    }
    *screen_height_local_var = screen_height->valuedouble;
    }

    // conversion_event_device_info->screen_width
    cJSON *screen_width = cJSON_GetObjectItemCaseSensitive(conversion_event_device_infoJSON, "screen_width");
    if (cJSON_IsNull(screen_width)) {
        screen_width = NULL;
    }
    if (screen_width) { 
    if(!cJSON_IsNumber(screen_width))
    {
    goto end; //Numeric
    }
    screen_width_local_var = malloc(sizeof(int));
    if(!screen_width_local_var)
    {
        goto end;
    }
    *screen_width_local_var = screen_width->valuedouble;
    }

    // conversion_event_device_info->storage_free_space
    cJSON *storage_free_space = cJSON_GetObjectItemCaseSensitive(conversion_event_device_infoJSON, "storage_free_space");
    if (cJSON_IsNull(storage_free_space)) {
        storage_free_space = NULL;
    }
    if (storage_free_space) { 
    if(!cJSON_IsNumber(storage_free_space))
    {
    goto end; //Numeric
    }
    storage_free_space_local_var = malloc(sizeof(int));
    if(!storage_free_space_local_var)
    {
        goto end;
    }
    *storage_free_space_local_var = storage_free_space->valuedouble;
    }

    // conversion_event_device_info->storage_size
    cJSON *storage_size = cJSON_GetObjectItemCaseSensitive(conversion_event_device_infoJSON, "storage_size");
    if (cJSON_IsNull(storage_size)) {
        storage_size = NULL;
    }
    if (storage_size) { 
    if(!cJSON_IsNumber(storage_size))
    {
    goto end; //Numeric
    }
    storage_size_local_var = malloc(sizeof(int));
    if(!storage_size_local_var)
    {
        goto end;
    }
    *storage_size_local_var = storage_size->valuedouble;
    }

    // conversion_event_device_info->timezone
    cJSON *timezone = cJSON_GetObjectItemCaseSensitive(conversion_event_device_infoJSON, "timezone");
    if (cJSON_IsNull(timezone)) {
        timezone = NULL;
    }
    if (timezone) { 
    if(!cJSON_IsString(timezone) && !cJSON_IsNull(timezone))
    {
    goto end; //String
    }
    }

    // conversion_event_device_info->timezone_abbr
    cJSON *timezone_abbr = cJSON_GetObjectItemCaseSensitive(conversion_event_device_infoJSON, "timezone_abbr");
    if (cJSON_IsNull(timezone_abbr)) {
        timezone_abbr = NULL;
    }
    if (timezone_abbr) { 
    if(!cJSON_IsString(timezone_abbr) && !cJSON_IsNull(timezone_abbr))
    {
    goto end; //String
    }
    }

    // conversion_event_device_info->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(conversion_event_device_infoJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (type) { 
    if(!cJSON_IsString(type) && !cJSON_IsNull(type))
    {
    goto end; //String
    }
    }


    if (brand && !cJSON_IsNull(brand)) brand_local_str = strdup(brand->valuestring);
    if (carrier && !cJSON_IsNull(carrier)) carrier_local_str = strdup(carrier->valuestring);
    if (kernel_version && !cJSON_IsNull(kernel_version)) kernel_version_local_str = strdup(kernel_version->valuestring);
    if (locale && !cJSON_IsNull(locale)) locale_local_str = strdup(locale->valuestring);
    if (model && !cJSON_IsNull(model)) model_local_str = strdup(model->valuestring);
    if (os_name && !cJSON_IsNull(os_name)) os_name_local_str = strdup(os_name->valuestring);
    if (os_release_name && !cJSON_IsNull(os_release_name)) os_release_name_local_str = strdup(os_release_name->valuestring);
    if (os_version && !cJSON_IsNull(os_version)) os_version_local_str = strdup(os_version->valuestring);
    if (timezone && !cJSON_IsNull(timezone)) timezone_local_str = strdup(timezone->valuestring);
    if (timezone_abbr && !cJSON_IsNull(timezone_abbr)) timezone_abbr_local_str = strdup(timezone_abbr->valuestring);
    if (type && !cJSON_IsNull(type)) type_local_str = strdup(type->valuestring);

    conversion_event_device_info_local_var = conversion_event_device_info_create_internal (
        battery_level_local_var,
        brand_local_str,
        carrier_local_str,
        cpu_cores_local_var,
        external_storage_free_space_local_var,
        external_storage_size_local_var,
        form_factor ? form_factor_local_nonprim : NULL,
        kernel_version_local_str,
        languages ? languagesList : NULL,
        locale_local_str,
        model_local_str,
        network_type ? network_type_local_nonprim : NULL,
        os_family ? os_family_local_nonprim : NULL,
        os_name_local_str,
        os_release_name_local_str,
        os_version_local_str,
        screen_density_local_var,
        screen_height_local_var,
        screen_width_local_var,
        storage_free_space_local_var,
        storage_size_local_var,
        timezone_local_str,
        timezone_abbr_local_str,
        type_local_str
        );

    if (!conversion_event_device_info_local_var) {
        goto end;
    }

    return conversion_event_device_info_local_var;
end:
    if (battery_level_local_var) {
        free(battery_level_local_var);
        battery_level_local_var = NULL;
    }
    if (brand_local_str) {
        free(brand_local_str);
        brand_local_str = NULL;
    }
    if (carrier_local_str) {
        free(carrier_local_str);
        carrier_local_str = NULL;
    }
    if (cpu_cores_local_var) {
        free(cpu_cores_local_var);
        cpu_cores_local_var = NULL;
    }
    if (external_storage_free_space_local_var) {
        free(external_storage_free_space_local_var);
        external_storage_free_space_local_var = NULL;
    }
    if (external_storage_size_local_var) {
        free(external_storage_size_local_var);
        external_storage_size_local_var = NULL;
    }
    if (form_factor_local_nonprim) {
        form_factor_free(form_factor_local_nonprim);
        form_factor_local_nonprim = NULL;
    }
    if (kernel_version_local_str) {
        free(kernel_version_local_str);
        kernel_version_local_str = NULL;
    }
    if (languagesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, languagesList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(languagesList);
        languagesList = NULL;
    }
    if (locale_local_str) {
        free(locale_local_str);
        locale_local_str = NULL;
    }
    if (model_local_str) {
        free(model_local_str);
        model_local_str = NULL;
    }
    if (network_type_local_nonprim) {
        network_type_free(network_type_local_nonprim);
        network_type_local_nonprim = NULL;
    }
    if (os_family_local_nonprim) {
        os_family_free(os_family_local_nonprim);
        os_family_local_nonprim = NULL;
    }
    if (os_name_local_str) {
        free(os_name_local_str);
        os_name_local_str = NULL;
    }
    if (os_release_name_local_str) {
        free(os_release_name_local_str);
        os_release_name_local_str = NULL;
    }
    if (os_version_local_str) {
        free(os_version_local_str);
        os_version_local_str = NULL;
    }
    if (screen_density_local_var) {
        free(screen_density_local_var);
        screen_density_local_var = NULL;
    }
    if (screen_height_local_var) {
        free(screen_height_local_var);
        screen_height_local_var = NULL;
    }
    if (screen_width_local_var) {
        free(screen_width_local_var);
        screen_width_local_var = NULL;
    }
    if (storage_free_space_local_var) {
        free(storage_free_space_local_var);
        storage_free_space_local_var = NULL;
    }
    if (storage_size_local_var) {
        free(storage_size_local_var);
        storage_size_local_var = NULL;
    }
    if (timezone_local_str) {
        free(timezone_local_str);
        timezone_local_str = NULL;
    }
    if (timezone_abbr_local_str) {
        free(timezone_abbr_local_str);
        timezone_abbr_local_str = NULL;
    }
    if (type_local_str) {
        free(type_local_str);
        type_local_str = NULL;
    }
    return NULL;

}
