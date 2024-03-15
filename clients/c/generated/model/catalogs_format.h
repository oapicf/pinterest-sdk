/*
 * catalogs_format.h
 *
 * The file format of a feed.
 */

#ifndef _catalogs_format_H_
#define _catalogs_format_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_format_t catalogs_format_t;


// Enum  for catalogs_format

typedef enum { pinterest_rest_api_catalogs_format__NULL = 0, pinterest_rest_api_catalogs_format__TSV, pinterest_rest_api_catalogs_format__CSV, pinterest_rest_api_catalogs_format__XML } pinterest_rest_api_catalogs_format__e;

char* catalogs_format_catalogs_format_ToString(pinterest_rest_api_catalogs_format__e catalogs_format);

pinterest_rest_api_catalogs_format__e catalogs_format_catalogs_format_FromString(char* catalogs_format);

//cJSON *catalogs_format_catalogs_format_convertToJSON(pinterest_rest_api_catalogs_format__e catalogs_format);

//pinterest_rest_api_catalogs_format__e catalogs_format_catalogs_format_parseFromJSON(cJSON *catalogs_formatJSON);

#endif /* _catalogs_format_H_ */

