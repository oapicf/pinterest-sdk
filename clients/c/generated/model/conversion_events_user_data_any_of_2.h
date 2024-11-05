/*
 * conversion_events_user_data_any_of_2.h
 *
 * 
 */

#ifndef _conversion_events_user_data_any_of_2_H_
#define _conversion_events_user_data_any_of_2_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct conversion_events_user_data_any_of_2_t conversion_events_user_data_any_of_2_t;




typedef struct conversion_events_user_data_any_of_2_t {
    list_t *em; //primitive container
    list_t *hashed_maids; //primitive container
    char *client_ip_address; // string
    char *client_user_agent; // string

} conversion_events_user_data_any_of_2_t;

conversion_events_user_data_any_of_2_t *conversion_events_user_data_any_of_2_create(
    list_t *em,
    list_t *hashed_maids,
    char *client_ip_address,
    char *client_user_agent
);

void conversion_events_user_data_any_of_2_free(conversion_events_user_data_any_of_2_t *conversion_events_user_data_any_of_2);

conversion_events_user_data_any_of_2_t *conversion_events_user_data_any_of_2_parseFromJSON(cJSON *conversion_events_user_data_any_of_2JSON);

cJSON *conversion_events_user_data_any_of_2_convertToJSON(conversion_events_user_data_any_of_2_t *conversion_events_user_data_any_of_2);

#endif /* _conversion_events_user_data_any_of_2_H_ */

