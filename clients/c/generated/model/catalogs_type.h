/*
 * catalogs_type.h
 *
 * Type of the catalog entity.
 */

#ifndef _catalogs_type_H_
#define _catalogs_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_type_t catalogs_type_t;


// Enum  for catalogs_type

typedef enum { pinterest_rest_api_catalogs_type__NULL = 0, pinterest_rest_api_catalogs_type__RETAIL, pinterest_rest_api_catalogs_type__HOTEL } pinterest_rest_api_catalogs_type__e;

char* catalogs_type_catalogs_type_ToString(pinterest_rest_api_catalogs_type__e catalogs_type);

pinterest_rest_api_catalogs_type__e catalogs_type_catalogs_type_FromString(char* catalogs_type);

//cJSON *catalogs_type_catalogs_type_convertToJSON(pinterest_rest_api_catalogs_type__e catalogs_type);

//pinterest_rest_api_catalogs_type__e catalogs_type_catalogs_type_parseFromJSON(cJSON *catalogs_typeJSON);

#endif /* _catalogs_type_H_ */

