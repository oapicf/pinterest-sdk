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

#include "form_factor.h"
#include "network_type.h"
#include "os_family.h"



typedef struct conversion_event_device_info_t {
    int *battery_level; //numeric
    char *brand; // string
    char *carrier; // string
    int *cpu_cores; //numeric
    int *external_storage_free_space; //numeric
    int *external_storage_size; //numeric
    form_factor_t *form_factor; // custom
    char *kernel_version; // string
    list_t *languages; //primitive container
    char *locale; // string
    char *model; // string
    network_type_t *network_type; // custom
    os_family_t *os_family; // custom
    char *os_name; // string
    char *os_release_name; // string
    char *os_version; // string
    int *screen_density; //numeric
    int *screen_height; //numeric
    int *screen_width; //numeric
    int *storage_free_space; //numeric
    int *storage_size; //numeric
    char *timezone; // string
    char *timezone_abbr; // string
    char *type; // string

    int _library_owned; // Is the library responsible for freeing this object?
} conversion_event_device_info_t;

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
);

void conversion_event_device_info_free(conversion_event_device_info_t *conversion_event_device_info);

conversion_event_device_info_t *conversion_event_device_info_parseFromJSON(cJSON *conversion_event_device_infoJSON);

cJSON *conversion_event_device_info_convertToJSON(conversion_event_device_info_t *conversion_event_device_info);

#endif /* _conversion_event_device_info_H_ */

