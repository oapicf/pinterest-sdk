/*
 * conversion_events_user_data.h
 *
 * Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.
 */

#ifndef _conversion_events_user_data_H_
#define _conversion_events_user_data_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct conversion_events_user_data_t conversion_events_user_data_t;

#include "conversion_events_user_data_properties.h"



typedef struct conversion_events_user_data_t {
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
} conversion_events_user_data_t;

__attribute__((deprecated)) conversion_events_user_data_t *conversion_events_user_data_create(
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

void conversion_events_user_data_free(conversion_events_user_data_t *conversion_events_user_data);

conversion_events_user_data_t *conversion_events_user_data_parseFromJSON(cJSON *conversion_events_user_dataJSON);

cJSON *conversion_events_user_data_convertToJSON(conversion_events_user_data_t *conversion_events_user_data);

#endif /* _conversion_events_user_data_H_ */

