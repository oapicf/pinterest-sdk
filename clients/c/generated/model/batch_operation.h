/*
 * batch_operation.h
 *
 * The operation performed by the batch. The DELETE_DISCONTINUED operation only updates availablity to \&quot;Out of Stock\&quot;.
 */

#ifndef _batch_operation_H_
#define _batch_operation_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct batch_operation_t batch_operation_t;


// Enum  for batch_operation

typedef enum { pinterest_rest_api_batch_operation__NULL = 0, pinterest_rest_api_batch_operation__UPDATE, pinterest_rest_api_batch_operation__UPSERT, pinterest_rest_api_batch_operation__CREATE, pinterest_rest_api_batch_operation__DELETE_DISCONTINUED, pinterest_rest_api_batch_operation___DELETE } pinterest_rest_api_batch_operation__e;

char* batch_operation_batch_operation_ToString(pinterest_rest_api_batch_operation__e batch_operation);

pinterest_rest_api_batch_operation__e batch_operation_batch_operation_FromString(char* batch_operation);

//cJSON *batch_operation_batch_operation_convertToJSON(pinterest_rest_api_batch_operation__e batch_operation);

//pinterest_rest_api_batch_operation__e batch_operation_batch_operation_parseFromJSON(cJSON *batch_operationJSON);

#endif /* _batch_operation_H_ */

