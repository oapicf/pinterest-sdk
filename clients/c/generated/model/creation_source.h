/*
 * creation_source.h
 *
 * The source of conversion events ingestion
 */

#ifndef _creation_source_H_
#define _creation_source_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct creation_source_t creation_source_t;


// Enum  for creation_source

typedef enum { pinterest_rest_api_creation_source__NULL = 0, pinterest_rest_api_creation_source__ADS_API, pinterest_rest_api_creation_source__ADS_MANAGER_REPORTING_PAGE, pinterest_rest_api_creation_source__ADS_MANAGER_REPORT_BUILDER } pinterest_rest_api_creation_source__e;

char* creation_source_creation_source_ToString(pinterest_rest_api_creation_source__e creation_source);

pinterest_rest_api_creation_source__e creation_source_creation_source_FromString(char* creation_source);

cJSON *creation_source_convertToJSON(pinterest_rest_api_creation_source__e creation_source);

pinterest_rest_api_creation_source__e creation_source_parseFromJSON(cJSON *creation_sourceJSON);

#endif /* _creation_source_H_ */

