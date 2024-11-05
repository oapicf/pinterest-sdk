/*
 * batch_operation_status.h
 *
 * The status of the operation performed by the batch
 */

#ifndef _batch_operation_status_H_
#define _batch_operation_status_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct batch_operation_status_t batch_operation_status_t;


// Enum  for batch_operation_status

typedef enum { pinterest_rest_api_batch_operation_status__NULL = 0, pinterest_rest_api_batch_operation_status__PROCESSING, pinterest_rest_api_batch_operation_status__COMPLETED, pinterest_rest_api_batch_operation_status__FAILED } pinterest_rest_api_batch_operation_status__e;

char* batch_operation_status_batch_operation_status_ToString(pinterest_rest_api_batch_operation_status__e batch_operation_status);

pinterest_rest_api_batch_operation_status__e batch_operation_status_batch_operation_status_FromString(char* batch_operation_status);

//cJSON *batch_operation_status_batch_operation_status_convertToJSON(pinterest_rest_api_batch_operation_status__e batch_operation_status);

//pinterest_rest_api_batch_operation_status__e batch_operation_status_batch_operation_status_parseFromJSON(cJSON *batch_operation_statusJSON);

#endif /* _batch_operation_status_H_ */

