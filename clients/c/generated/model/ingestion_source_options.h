/*
 * ingestion_source_options.h
 *
 * List of ingestion sources for a conversion event.
 */

#ifndef _ingestion_source_options_H_
#define _ingestion_source_options_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ingestion_source_options_t ingestion_source_options_t;


// Enum  for ingestion_source_options

typedef enum { pinterest_rest_api_ingestion_source_options__NULL = 0, pinterest_rest_api_ingestion_source_options__TAG, pinterest_rest_api_ingestion_source_options__MMP, pinterest_rest_api_ingestion_source_options__FILE_UPLOAD, pinterest_rest_api_ingestion_source_options__CONVERSIONS_API, pinterest_rest_api_ingestion_source_options__NATIVE } pinterest_rest_api_ingestion_source_options__e;

char* ingestion_source_options_ingestion_source_options_ToString(pinterest_rest_api_ingestion_source_options__e ingestion_source_options);

pinterest_rest_api_ingestion_source_options__e ingestion_source_options_ingestion_source_options_FromString(char* ingestion_source_options);

cJSON *ingestion_source_options_convertToJSON(pinterest_rest_api_ingestion_source_options__e ingestion_source_options);

pinterest_rest_api_ingestion_source_options__e ingestion_source_options_parseFromJSON(cJSON *ingestion_source_optionsJSON);

#endif /* _ingestion_source_options_H_ */

