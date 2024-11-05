/*
 * conversion_events_user_data_any_of_1.h
 *
 * 
 */

#ifndef _conversion_events_user_data_any_of_1_H_
#define _conversion_events_user_data_any_of_1_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct conversion_events_user_data_any_of_1_t conversion_events_user_data_any_of_1_t;




typedef struct conversion_events_user_data_any_of_1_t {
    list_t *em; //primitive container
    list_t *hashed_maids; //primitive container
    char *client_ip_address; // string
    char *client_user_agent; // string

} conversion_events_user_data_any_of_1_t;

conversion_events_user_data_any_of_1_t *conversion_events_user_data_any_of_1_create(
    list_t *em,
    list_t *hashed_maids,
    char *client_ip_address,
    char *client_user_agent
);

void conversion_events_user_data_any_of_1_free(conversion_events_user_data_any_of_1_t *conversion_events_user_data_any_of_1);

conversion_events_user_data_any_of_1_t *conversion_events_user_data_any_of_1_parseFromJSON(cJSON *conversion_events_user_data_any_of_1JSON);

cJSON *conversion_events_user_data_any_of_1_convertToJSON(conversion_events_user_data_any_of_1_t *conversion_events_user_data_any_of_1);

#endif /* _conversion_events_user_data_any_of_1_H_ */

