/*
 * conversion_event_device_info.h
 *
 * Object containing information about the device where event occurred.
 */

#ifndef _conversion_event_device_info_H_
#define _conversion_event_device_info_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct conversion_event_device_info_t conversion_event_device_info_t;


// Enum FORMFACTOR for conversion_event_device_info

typedef enum  { pinterest_rest_api_conversion_event_device_info_FORMFACTOR_NULL = 0, pinterest_rest_api_conversion_event_device_info_FORMFACTOR_desktop, pinterest_rest_api_conversion_event_device_info_FORMFACTOR_laptop, pinterest_rest_api_conversion_event_device_info_FORMFACTOR_cellphone, pinterest_rest_api_conversion_event_device_info_FORMFACTOR_tablet, pinterest_rest_api_conversion_event_device_info_FORMFACTOR_smartwatch, pinterest_rest_api_conversion_event_device_info_FORMFACTOR_tv, pinterest_rest_api_conversion_event_device_info_FORMFACTOR_vr, pinterest_rest_api_conversion_event_device_info_FORMFACTOR_console, pinterest_rest_api_conversion_event_device_info_FORMFACTOR_other } pinterest_rest_api_conversion_event_device_info_FORMFACTOR_e;

char* conversion_event_device_info_form_factor_ToString(pinterest_rest_api_conversion_event_device_info_FORMFACTOR_e form_factor);

pinterest_rest_api_conversion_event_device_info_FORMFACTOR_e conversion_event_device_info_form_factor_FromString(char* form_factor);

// Enum NETWORKTYPE for conversion_event_device_info

typedef enum  { pinterest_rest_api_conversion_event_device_info_NETWORKTYPE_NULL = 0, pinterest_rest_api_conversion_event_device_info_NETWORKTYPE_wifi, pinterest_rest_api_conversion_event_device_info_NETWORKTYPE_cellular_2g, pinterest_rest_api_conversion_event_device_info_NETWORKTYPE_cellular_3g, pinterest_rest_api_conversion_event_device_info_NETWORKTYPE_cellular_4g, pinterest_rest_api_conversion_event_device_info_NETWORKTYPE_cellular_5g, pinterest_rest_api_conversion_event_device_info_NETWORKTYPE_cellular_6g, pinterest_rest_api_conversion_event_device_info_NETWORKTYPE_ethernet, pinterest_rest_api_conversion_event_device_info_NETWORKTYPE_unknown } pinterest_rest_api_conversion_event_device_info_NETWORKTYPE_e;

char* conversion_event_device_info_network_type_ToString(pinterest_rest_api_conversion_event_device_info_NETWORKTYPE_e network_type);

pinterest_rest_api_conversion_event_device_info_NETWORKTYPE_e conversion_event_device_info_network_type_FromString(char* network_type);

// Enum OSFAMILY for conversion_event_device_info

typedef enum  { pinterest_rest_api_conversion_event_device_info_OSFAMILY_NULL = 0, pinterest_rest_api_conversion_event_device_info_OSFAMILY_ios, pinterest_rest_api_conversion_event_device_info_OSFAMILY_android, pinterest_rest_api_conversion_event_device_info_OSFAMILY_macos, pinterest_rest_api_conversion_event_device_info_OSFAMILY_windows, pinterest_rest_api_conversion_event_device_info_OSFAMILY__linux, pinterest_rest_api_conversion_event_device_info_OSFAMILY_bsd, pinterest_rest_api_conversion_event_device_info_OSFAMILY_other } pinterest_rest_api_conversion_event_device_info_OSFAMILY_e;

char* conversion_event_device_info_os_family_ToString(pinterest_rest_api_conversion_event_device_info_OSFAMILY_e os_family);

pinterest_rest_api_conversion_event_device_info_OSFAMILY_e conversion_event_device_info_os_family_FromString(char* os_family);



typedef struct conversion_event_device_info_t {
    int battery_level; //numeric
    char *brand; // string
    char *carrier; // string
    int cpu_cores; //numeric
    int external_storage_free_space; //numeric
    int external_storage_size; //numeric
    pinterest_rest_api_conversion_event_device_info_FORMFACTOR_e form_factor; //enum
    char *kernel_version; // string
    list_t *languages; //primitive container
    char *locale; // string
    char *model; // string
    pinterest_rest_api_conversion_event_device_info_NETWORKTYPE_e network_type; //enum
    pinterest_rest_api_conversion_event_device_info_OSFAMILY_e os_family; //enum
    char *os_name; // string
    char *os_release_name; // string
    char *os_version; // string
    int screen_density; //numeric
    int screen_height; //numeric
    int screen_width; //numeric
    int storage_free_space; //numeric
    int storage_size; //numeric
    char *timezone; // string
    char *timezone_abbr; // string
    char *type; // string

    int _library_owned; // Is the library responsible for freeing this object?
} conversion_event_device_info_t;

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
);

void conversion_event_device_info_free(conversion_event_device_info_t *conversion_event_device_info);

conversion_event_device_info_t *conversion_event_device_info_parseFromJSON(cJSON *conversion_event_device_infoJSON);

cJSON *conversion_event_device_info_convertToJSON(conversion_event_device_info_t *conversion_event_device_info);

#endif /* _conversion_event_device_info_H_ */

