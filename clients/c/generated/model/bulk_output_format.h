/*
 * bulk_output_format.h
 *
 * Bulk file output format
 */

#ifndef _bulk_output_format_H_
#define _bulk_output_format_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct bulk_output_format_t bulk_output_format_t;


// Enum  for bulk_output_format

typedef enum { pinterest_rest_api_bulk_output_format__NULL = 0, pinterest_rest_api_bulk_output_format__CSV, pinterest_rest_api_bulk_output_format__JSON } pinterest_rest_api_bulk_output_format__e;

char* bulk_output_format_bulk_output_format_ToString(pinterest_rest_api_bulk_output_format__e bulk_output_format);

pinterest_rest_api_bulk_output_format__e bulk_output_format_bulk_output_format_FromString(char* bulk_output_format);

//cJSON *bulk_output_format_bulk_output_format_convertToJSON(pinterest_rest_api_bulk_output_format__e bulk_output_format);

//pinterest_rest_api_bulk_output_format__e bulk_output_format_bulk_output_format_parseFromJSON(cJSON *bulk_output_formatJSON);

#endif /* _bulk_output_format_H_ */

