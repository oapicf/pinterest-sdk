/*
 * s3_file_part.h
 *
 * 
 */

#ifndef _s3_file_part_H_
#define _s3_file_part_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct s3_file_part_t s3_file_part_t;




typedef struct s3_file_part_t {
    int *part_number; //numeric
    char *presigned_url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} s3_file_part_t;

__attribute__((deprecated)) s3_file_part_t *s3_file_part_create(
    int *part_number,
    char *presigned_url
);

void s3_file_part_free(s3_file_part_t *s3_file_part);

s3_file_part_t *s3_file_part_parseFromJSON(cJSON *s3_file_partJSON);

cJSON *s3_file_part_convertToJSON(s3_file_part_t *s3_file_part);

#endif /* _s3_file_part_H_ */

