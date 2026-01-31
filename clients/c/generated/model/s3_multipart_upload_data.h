/*
 * s3_multipart_upload_data.h
 *
 * 
 */

#ifndef _s3_multipart_upload_data_H_
#define _s3_multipart_upload_data_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct s3_multipart_upload_data_t s3_multipart_upload_data_t;

#include "s3_file_part.h"



typedef struct s3_multipart_upload_data_t {
    list_t *file_parts; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} s3_multipart_upload_data_t;

__attribute__((deprecated)) s3_multipart_upload_data_t *s3_multipart_upload_data_create(
    list_t *file_parts
);

void s3_multipart_upload_data_free(s3_multipart_upload_data_t *s3_multipart_upload_data);

s3_multipart_upload_data_t *s3_multipart_upload_data_parseFromJSON(cJSON *s3_multipart_upload_dataJSON);

cJSON *s3_multipart_upload_data_convertToJSON(s3_multipart_upload_data_t *s3_multipart_upload_data);

#endif /* _s3_multipart_upload_data_H_ */

