#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "conversion_event_device_info.h"


char* conversion_event_device_info_form_factor_ToString(pinterest_rest_api_conversion_event_device_info_FORMFACTOR_e form_factor) {
    char* form_factorArray[] =  { "NULL", "desktop", "laptop", "cellphone", "tablet", "smartwatch", "tv", "vr", "console", "other" };
    return form_factorArray[form_factor];
}

pinterest_rest_api_conversion_event_device_info_FORMFACTOR_e conversion_event_device_info_form_factor_FromString(char* form_factor){
    int stringToReturn = 0;
    char *form_factorArray[] =  { "NULL", "desktop", "laptop", "cellphone", "tablet", "smartwatch", "tv", "vr", "console", "other" };
    size_t sizeofArray = sizeof(form_factorArray) / sizeof(form_factorArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(form_factor, form_factorArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* conversion_event_device_info_network_type_ToString(pinterest_rest_api_conversion_event_device_info_NETWORKTYPE_e network_type) {
    char* network_typeArray[] =  { "NULL", "wifi", "cellular_2g", "cellular_3g", "cellular_4g", "cellular_5g", "cellular_6g", "ethernet", "unknown" };
    return network_typeArray[network_type];
}

pinterest_rest_api_conversion_event_device_info_NETWORKTYPE_e conversion_event_device_info_network_type_FromString(char* network_type){
    int stringToReturn = 0;
    char *network_typeArray[] =  { "NULL", "wifi", "cellular_2g", "cellular_3g", "cellular_4g", "cellular_5g", "cellular_6g", "ethernet", "unknown" };
    size_t sizeofArray = sizeof(network_typeArray) / sizeof(network_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(network_type, network_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* conversion_event_device_info_os_family_ToString(pinterest_rest_api_conversion_event_device_info_OSFAMILY_e os_family) {
    char* os_familyArray[] =  { "NULL", "ios", "android", "macos", "windows", "linux", "bsd", "other" };
    return os_familyArray[os_family];
}

pinterest_rest_api_conversion_event_device_info_OSFAMILY_e conversion_event_device_info_os_family_FromString(char* os_family){
    int stringToReturn = 0;
    char *os_familyArray[] =  { "NULL", "ios", "android", "macos", "windows", "linux", "bsd", "other" };
    size_t sizeofArray = sizeof(os_familyArray) / sizeof(os_familyArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(os_family, os_familyArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static conversion_event_device_info_t *conversion_event_device_info_create_internal(
    int battery_level,
    char *brand,
    char *carrier,
    int cpu_cores,
    int external_storage_free_space,
    int external_storage_size,
    pinterest_rest_api_conversion_event_device_info_FORMFACTOR_e form_factor,
    char *kernel_version,
    list_t *languages,
    char *locale,
    char *model,
    pinterest_rest_api_conversion_event_device_info_NETWORKTYPE_e network_type,
    pinterest_rest_api_conversion_event_device_info_OSFAMILY_e os_family,
    char *os_name,
    char *os_release_name,
    char *os_version,
    int screen_density,
    int screen_height,
    int screen_width,
    int storage_free_space,
    int storage_size,
    char *timezone,
    char *timezone_abbr,
    char *type
    ) {
    conversion_event_device_info_t *conversion_event_device_info_local_var = malloc(sizeof(conversion_event_device_info_t));
    if (!conversion_event_device_info_local_var) {
        return NULL;
    }
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

    conversion_event_device_info_local_var->_library_owned = 1;
    return conversion_event_device_info_local_var;
}

__attribute__((deprecated)) conversion_event_device_info_t *conversion_event_device_info_create(
    int battery_level,
    char *brand,
    char *carrier,
    int cpu_cores,
    int external_storage_free_space,
    int external_storage_size,
    pinterest_rest_api_conversion_event_device_info_FORMFACTOR_e form_factor,
    char *kernel_version,
    list_t *languages,
    char *locale,
    char *model,
    pinterest_rest_api_conversion_event_device_info_NETWORKTYPE_e network_type,
    pinterest_rest_api_conversion_event_device_info_OSFAMILY_e os_family,
    char *os_name,
    char *os_release_name,
    char *os_version,
    int screen_density,
    int screen_height,
    int screen_width,
    int storage_free_space,
    int storage_size,
    char *timezone,
    char *timezone_abbr,
    char *type
    ) {
    return conversion_event_device_info_create_internal (
        battery_level,
        brand,
        carrier,
        cpu_cores,
        external_storage_free_space,
        external_storage_size,
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
        screen_density,
        screen_height,
        screen_width,
        storage_free_space,
        storage_size,
        timezone,
        timezone_abbr,
        type
        );
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
    if (conversion_event_device_info->brand) {
        free(conversion_event_device_info->brand);
        conversion_event_device_info->brand = NULL;
    }
    if (conversion_event_device_info->carrier) {
        free(conversion_event_device_info->carrier);
        conversion_event_device_info->carrier = NULL;
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
    if(cJSON_AddNumberToObject(item, "battery_level", conversion_event_device_info->battery_level) == NULL) {
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
    if(cJSON_AddNumberToObject(item, "cpu_cores", conversion_event_device_info->cpu_cores) == NULL) {
    goto fail; //Numeric
    }
    }


    // conversion_event_device_info->external_storage_free_space
    if(conversion_event_device_info->external_storage_free_space) {
    if(cJSON_AddNumberToObject(item, "external_storage_free_space", conversion_event_device_info->external_storage_free_space) == NULL) {
    goto fail; //Numeric
    }
    }


    // conversion_event_device_info->external_storage_size
    if(conversion_event_device_info->external_storage_size) {
    if(cJSON_AddNumberToObject(item, "external_storage_size", conversion_event_device_info->external_storage_size) == NULL) {
    goto fail; //Numeric
    }
    }


    // conversion_event_device_info->form_factor
    if(conversion_event_device_info->form_factor != pinterest_rest_api_conversion_event_device_info_FORMFACTOR_NULL) {
    if(cJSON_AddStringToObject(item, "form_factor", conversion_event_device_info_form_factor_ToString(conversion_event_device_info->form_factor)) == NULL)
    {
    goto fail; //Enum
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
    if(conversion_event_device_info->network_type != pinterest_rest_api_conversion_event_device_info_NETWORKTYPE_NULL) {
    if(cJSON_AddStringToObject(item, "network_type", conversion_event_device_info_network_type_ToString(conversion_event_device_info->network_type)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // conversion_event_device_info->os_family
    if(conversion_event_device_info->os_family != pinterest_rest_api_conversion_event_device_info_OSFAMILY_NULL) {
    if(cJSON_AddStringToObject(item, "os_family", conversion_event_device_info_os_family_ToString(conversion_event_device_info->os_family)) == NULL)
    {
    goto fail; //Enum
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
    if(cJSON_AddNumberToObject(item, "screen_density", conversion_event_device_info->screen_density) == NULL) {
    goto fail; //Numeric
    }
    }


    // conversion_event_device_info->screen_height
    if(conversion_event_device_info->screen_height) {
    if(cJSON_AddNumberToObject(item, "screen_height", conversion_event_device_info->screen_height) == NULL) {
    goto fail; //Numeric
    }
    }


    // conversion_event_device_info->screen_width
    if(conversion_event_device_info->screen_width) {
    if(cJSON_AddNumberToObject(item, "screen_width", conversion_event_device_info->screen_width) == NULL) {
    goto fail; //Numeric
    }
    }


    // conversion_event_device_info->storage_free_space
    if(conversion_event_device_info->storage_free_space) {
    if(cJSON_AddNumberToObject(item, "storage_free_space", conversion_event_device_info->storage_free_space) == NULL) {
    goto fail; //Numeric
    }
    }


    // conversion_event_device_info->storage_size
    if(conversion_event_device_info->storage_size) {
    if(cJSON_AddNumberToObject(item, "storage_size", conversion_event_device_info->storage_size) == NULL) {
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

    // define the local list for conversion_event_device_info->languages
    list_t *languagesList = NULL;

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
    }

    // conversion_event_device_info->form_factor
    cJSON *form_factor = cJSON_GetObjectItemCaseSensitive(conversion_event_device_infoJSON, "form_factor");
    if (cJSON_IsNull(form_factor)) {
        form_factor = NULL;
    }
    pinterest_rest_api_conversion_event_device_info_FORMFACTOR_e form_factorVariable;
    if (form_factor) { 
    if(!cJSON_IsString(form_factor))
    {
    goto end; //Enum
    }
    form_factorVariable = conversion_event_device_info_form_factor_FromString(form_factor->valuestring);
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
    pinterest_rest_api_conversion_event_device_info_NETWORKTYPE_e network_typeVariable;
    if (network_type) { 
    if(!cJSON_IsString(network_type))
    {
    goto end; //Enum
    }
    network_typeVariable = conversion_event_device_info_network_type_FromString(network_type->valuestring);
    }

    // conversion_event_device_info->os_family
    cJSON *os_family = cJSON_GetObjectItemCaseSensitive(conversion_event_device_infoJSON, "os_family");
    if (cJSON_IsNull(os_family)) {
        os_family = NULL;
    }
    pinterest_rest_api_conversion_event_device_info_OSFAMILY_e os_familyVariable;
    if (os_family) { 
    if(!cJSON_IsString(os_family))
    {
    goto end; //Enum
    }
    os_familyVariable = conversion_event_device_info_os_family_FromString(os_family->valuestring);
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


    conversion_event_device_info_local_var = conversion_event_device_info_create_internal (
        battery_level ? battery_level->valuedouble : 0,
        brand && !cJSON_IsNull(brand) ? strdup(brand->valuestring) : NULL,
        carrier && !cJSON_IsNull(carrier) ? strdup(carrier->valuestring) : NULL,
        cpu_cores ? cpu_cores->valuedouble : 0,
        external_storage_free_space ? external_storage_free_space->valuedouble : 0,
        external_storage_size ? external_storage_size->valuedouble : 0,
        form_factor ? form_factorVariable : pinterest_rest_api_conversion_event_device_info_FORMFACTOR_NULL,
        kernel_version && !cJSON_IsNull(kernel_version) ? strdup(kernel_version->valuestring) : NULL,
        languages ? languagesList : NULL,
        locale && !cJSON_IsNull(locale) ? strdup(locale->valuestring) : NULL,
        model && !cJSON_IsNull(model) ? strdup(model->valuestring) : NULL,
        network_type ? network_typeVariable : pinterest_rest_api_conversion_event_device_info_NETWORKTYPE_NULL,
        os_family ? os_familyVariable : pinterest_rest_api_conversion_event_device_info_OSFAMILY_NULL,
        os_name && !cJSON_IsNull(os_name) ? strdup(os_name->valuestring) : NULL,
        os_release_name && !cJSON_IsNull(os_release_name) ? strdup(os_release_name->valuestring) : NULL,
        os_version && !cJSON_IsNull(os_version) ? strdup(os_version->valuestring) : NULL,
        screen_density ? screen_density->valuedouble : 0,
        screen_height ? screen_height->valuedouble : 0,
        screen_width ? screen_width->valuedouble : 0,
        storage_free_space ? storage_free_space->valuedouble : 0,
        storage_size ? storage_size->valuedouble : 0,
        timezone && !cJSON_IsNull(timezone) ? strdup(timezone->valuestring) : NULL,
        timezone_abbr && !cJSON_IsNull(timezone_abbr) ? strdup(timezone_abbr->valuestring) : NULL,
        type && !cJSON_IsNull(type) ? strdup(type->valuestring) : NULL
        );

    return conversion_event_device_info_local_var;
end:
    if (languagesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, languagesList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(languagesList);
        languagesList = NULL;
    }
    return NULL;

}
