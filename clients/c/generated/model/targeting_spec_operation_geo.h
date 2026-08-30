/*
 * targeting_spec_operation_geo.h
 *
 * 
 */

#ifndef _targeting_spec_operation_geo_H_
#define _targeting_spec_operation_geo_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct targeting_spec_operation_geo_t targeting_spec_operation_geo_t;

#include "targeting_spec_list_operation.h"

// Enum FIELD for targeting_spec_operation_geo

typedef enum  { pinterest_rest_api_targeting_spec_operation_geo_FIELD_NULL = 0, pinterest_rest_api_targeting_spec_operation_geo_FIELD_GEO } pinterest_rest_api_targeting_spec_operation_geo_FIELD_e;

char* targeting_spec_operation_geo_field_ToString(pinterest_rest_api_targeting_spec_operation_geo_FIELD_e field);

pinterest_rest_api_targeting_spec_operation_geo_FIELD_e targeting_spec_operation_geo_field_FromString(char* field);



typedef struct targeting_spec_operation_geo_t {
    pinterest_rest_api_targeting_spec_operation_geo_FIELD_e field; //enum
    pinterest_rest_api_targeting_spec_list_operation__e operation; //referenced enum
    list_t *values; //primitive container

    int _library_owned; // Is the library responsible for freeing this object?
} targeting_spec_operation_geo_t;

__attribute__((deprecated)) targeting_spec_operation_geo_t *targeting_spec_operation_geo_create(
    pinterest_rest_api_targeting_spec_operation_geo_FIELD_e field,
    pinterest_rest_api_targeting_spec_list_operation__e operation,
    list_t *values
);

void targeting_spec_operation_geo_free(targeting_spec_operation_geo_t *targeting_spec_operation_geo);

targeting_spec_operation_geo_t *targeting_spec_operation_geo_parseFromJSON(cJSON *targeting_spec_operation_geoJSON);

cJSON *targeting_spec_operation_geo_convertToJSON(targeting_spec_operation_geo_t *targeting_spec_operation_geo);

#endif /* _targeting_spec_operation_geo_H_ */

