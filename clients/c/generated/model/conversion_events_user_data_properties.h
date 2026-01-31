/*
 * conversion_events_user_data_properties.h
 *
 * 
 */

#ifndef _conversion_events_user_data_properties_H_
#define _conversion_events_user_data_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct conversion_events_user_data_properties_t conversion_events_user_data_properties_t;




typedef struct conversion_events_user_data_properties_t {
    char *click_id; // string
    char *client_ip_address; // string
    char *client_user_agent; // string
    list_t *country; //primitive container
    list_t *ct; //primitive container
    list_t *db; //primitive container
    list_t *em; //primitive container
    list_t *external_id; //primitive container
    list_t *fn; //primitive container
    list_t *ge; //primitive container
    list_t *hashed_maids; //primitive container
    list_t *ln; //primitive container
    char *partner_id; // string
    list_t *ph; //primitive container
    list_t *st; //primitive container
    list_t *zp; //primitive container

    int _library_owned; // Is the library responsible for freeing this object?
} conversion_events_user_data_properties_t;

__attribute__((deprecated)) conversion_events_user_data_properties_t *conversion_events_user_data_properties_create(
    char *click_id,
    char *client_ip_address,
    char *client_user_agent,
    list_t *country,
    list_t *ct,
    list_t *db,
    list_t *em,
    list_t *external_id,
    list_t *fn,
    list_t *ge,
    list_t *hashed_maids,
    list_t *ln,
    char *partner_id,
    list_t *ph,
    list_t *st,
    list_t *zp
);

void conversion_events_user_data_properties_free(conversion_events_user_data_properties_t *conversion_events_user_data_properties);

conversion_events_user_data_properties_t *conversion_events_user_data_properties_parseFromJSON(cJSON *conversion_events_user_data_propertiesJSON);

cJSON *conversion_events_user_data_properties_convertToJSON(conversion_events_user_data_properties_t *conversion_events_user_data_properties);

#endif /* _conversion_events_user_data_properties_H_ */

