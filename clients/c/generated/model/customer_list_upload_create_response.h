/*
 * customer_list_upload_create_response.h
 *
 * 
 */

#ifndef _customer_list_upload_create_response_H_
#define _customer_list_upload_create_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct customer_list_upload_create_response_t customer_list_upload_create_response_t;

#include "customer_list_upload.h"
#include "s3_multipart_upload_data.h"



typedef struct customer_list_upload_create_response_t {
    struct customer_list_upload_t *customer_list_upload; //model
    struct s3_multipart_upload_data_t *s3_multipart_upload_data; //model

    int _library_owned; // Is the library responsible for freeing this object?
} customer_list_upload_create_response_t;

__attribute__((deprecated)) customer_list_upload_create_response_t *customer_list_upload_create_response_create(
    customer_list_upload_t *customer_list_upload,
    s3_multipart_upload_data_t *s3_multipart_upload_data
);

void customer_list_upload_create_response_free(customer_list_upload_create_response_t *customer_list_upload_create_response);

customer_list_upload_create_response_t *customer_list_upload_create_response_parseFromJSON(cJSON *customer_list_upload_create_responseJSON);

cJSON *customer_list_upload_create_response_convertToJSON(customer_list_upload_create_response_t *customer_list_upload_create_response);

#endif /* _customer_list_upload_create_response_H_ */

