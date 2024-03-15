/*
 * data_output_format.h
 *
 * Format of generated report
 */

#ifndef _data_output_format_H_
#define _data_output_format_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct data_output_format_t data_output_format_t;


// Enum  for data_output_format

typedef enum { pinterest_rest_api_data_output_format__NULL = 0, pinterest_rest_api_data_output_format__JSON, pinterest_rest_api_data_output_format__CSV } pinterest_rest_api_data_output_format__e;

char* data_output_format_data_output_format_ToString(pinterest_rest_api_data_output_format__e data_output_format);

pinterest_rest_api_data_output_format__e data_output_format_data_output_format_FromString(char* data_output_format);

//cJSON *data_output_format_data_output_format_convertToJSON(pinterest_rest_api_data_output_format__e data_output_format);

//pinterest_rest_api_data_output_format__e data_output_format_data_output_format_parseFromJSON(cJSON *data_output_formatJSON);

#endif /* _data_output_format_H_ */

