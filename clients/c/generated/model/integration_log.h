/*
 * integration_log.h
 *
 * Schema for log sent from an integration application.
 */

#ifndef _integration_log_H_
#define _integration_log_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct integration_log_t integration_log_t;

#include "integration_log_client_error.h"
#include "integration_log_client_request.h"
#include "integration_log_event_type.h"
#include "integration_log_level.h"



typedef struct integration_log_t {
    char *advertiser_id; // string
    char *app_version_number; // string
    int *client_timestamp; //numeric
    struct integration_log_client_error_t *error; //model
    integration_log_event_type_t *event_type; // custom
    char *external_business_id; // string
    char *feed_profile_id; // string
    integration_log_level_t *log_level; // custom
    char *merchant_id; // string
    char *message; // string
    char *platform_version_number; // string
    struct integration_log_client_request_t *request; //model
    char *tag_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} integration_log_t;

__attribute__((deprecated)) integration_log_t *integration_log_create(
    char *advertiser_id,
    char *app_version_number,
    int *client_timestamp,
    integration_log_client_error_t *error,
    integration_log_event_type_t *event_type,
    char *external_business_id,
    char *feed_profile_id,
    integration_log_level_t *log_level,
    char *merchant_id,
    char *message,
    char *platform_version_number,
    integration_log_client_request_t *request,
    char *tag_id
);

void integration_log_free(integration_log_t *integration_log);

integration_log_t *integration_log_parseFromJSON(cJSON *integration_logJSON);

cJSON *integration_log_convertToJSON(integration_log_t *integration_log);

#endif /* _integration_log_H_ */

