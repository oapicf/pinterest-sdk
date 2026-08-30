/*
 * conversion_event_app_info.h
 *
 * Object containing information about the application where event occurred.
 */

#ifndef _conversion_event_app_info_H_
#define _conversion_event_app_info_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct conversion_event_app_info_t conversion_event_app_info_t;




typedef struct conversion_event_app_info_t {
    char *app_id; // string
    char *app_name; // string
    char *app_package_name; // string
    char *app_store; // string
    char *app_version; // string
    int *install_time; //numeric
    char *user_agent; // string
    int *window_height; //numeric
    int *window_width; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} conversion_event_app_info_t;

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
);

void conversion_event_app_info_free(conversion_event_app_info_t *conversion_event_app_info);

conversion_event_app_info_t *conversion_event_app_info_parseFromJSON(cJSON *conversion_event_app_infoJSON);

cJSON *conversion_event_app_info_convertToJSON(conversion_event_app_info_t *conversion_event_app_info);

#endif /* _conversion_event_app_info_H_ */

