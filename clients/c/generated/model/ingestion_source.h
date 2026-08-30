/*
 * ingestion_source.h
 *
 * 
 */

#ifndef _ingestion_source_H_
#define _ingestion_source_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ingestion_source_t ingestion_source_t;


// Enum  for ingestion_source

typedef enum { pinterest_rest_api_ingestion_source__NULL = 0, pinterest_rest_api_ingestion_source__TAG, pinterest_rest_api_ingestion_source__MMP, pinterest_rest_api_ingestion_source__FILE_UPLOAD, pinterest_rest_api_ingestion_source__CONVERSIONS_API, pinterest_rest_api_ingestion_source__NATIVE } pinterest_rest_api_ingestion_source__e;

char* ingestion_source_ingestion_source_ToString(pinterest_rest_api_ingestion_source__e ingestion_source);

pinterest_rest_api_ingestion_source__e ingestion_source_ingestion_source_FromString(char* ingestion_source);

cJSON *ingestion_source_convertToJSON(pinterest_rest_api_ingestion_source__e ingestion_source);

pinterest_rest_api_ingestion_source__e ingestion_source_parseFromJSON(cJSON *ingestion_sourceJSON);

#endif /* _ingestion_source_H_ */

