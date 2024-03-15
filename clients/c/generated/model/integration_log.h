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

// Enum EVENTTYPE for integration_log

typedef enum  { pinterest_rest_api_integration_log_EVENTTYPE_NULL = 0, pinterest_rest_api_integration_log_EVENTTYPE_APP, pinterest_rest_api_integration_log_EVENTTYPE_API } pinterest_rest_api_integration_log_EVENTTYPE_e;

char* integration_log_event_type_ToString(pinterest_rest_api_integration_log_EVENTTYPE_e event_type);

pinterest_rest_api_integration_log_EVENTTYPE_e integration_log_event_type_FromString(char* event_type);

// Enum LOGLEVEL for integration_log

typedef enum  { pinterest_rest_api_integration_log_LOGLEVEL_NULL = 0, pinterest_rest_api_integration_log_LOGLEVEL_INFO, pinterest_rest_api_integration_log_LOGLEVEL_WARN, pinterest_rest_api_integration_log_LOGLEVEL_ERROR } pinterest_rest_api_integration_log_LOGLEVEL_e;

char* integration_log_log_level_ToString(pinterest_rest_api_integration_log_LOGLEVEL_e log_level);

pinterest_rest_api_integration_log_LOGLEVEL_e integration_log_log_level_FromString(char* log_level);



typedef struct integration_log_t {
    int client_timestamp; //numeric
    pinterest_rest_api_integration_log_EVENTTYPE_e event_type; //enum
    pinterest_rest_api_integration_log_LOGLEVEL_e log_level; //enum
    char *external_business_id; // string
    char *advertiser_id; // string
    char *merchant_id; // string
    char *tag_id; // string
    char *feed_profile_id; // string
    char *message; // string
    char *app_version_number; // string
    char *platform_version_number; // string
    struct integration_log_client_error_t *error; //model
    struct integration_log_client_request_t *request; //model

} integration_log_t;

integration_log_t *integration_log_create(
    int client_timestamp,
    pinterest_rest_api_integration_log_EVENTTYPE_e event_type,
    pinterest_rest_api_integration_log_LOGLEVEL_e log_level,
    char *external_business_id,
    char *advertiser_id,
    char *merchant_id,
    char *tag_id,
    char *feed_profile_id,
    char *message,
    char *app_version_number,
    char *platform_version_number,
    integration_log_client_error_t *error,
    integration_log_client_request_t *request
);

void integration_log_free(integration_log_t *integration_log);

integration_log_t *integration_log_parseFromJSON(cJSON *integration_logJSON);

cJSON *integration_log_convertToJSON(integration_log_t *integration_log);

#endif /* _integration_log_H_ */

