/*
 * media_upload_parameters.h
 *
 * 
 */

#ifndef _media_upload_parameters_H_
#define _media_upload_parameters_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct media_upload_parameters_t media_upload_parameters_t;




typedef struct media_upload_parameters_t {
    char *content_type; // string
    char *key; // string
    char *policy; // string
    char *x_amz_algorithm; // string
    char *x_amz_credential; // string
    char *x_amz_date; // string
    char *x_amz_security_token; // string
    char *x_amz_signature; // string

    int _library_owned; // Is the library responsible for freeing this object?
} media_upload_parameters_t;

__attribute__((deprecated)) media_upload_parameters_t *media_upload_parameters_create(
    char *content_type,
    char *key,
    char *policy,
    char *x_amz_algorithm,
    char *x_amz_credential,
    char *x_amz_date,
    char *x_amz_security_token,
    char *x_amz_signature
);

void media_upload_parameters_free(media_upload_parameters_t *media_upload_parameters);

media_upload_parameters_t *media_upload_parameters_parseFromJSON(cJSON *media_upload_parametersJSON);

cJSON *media_upload_parameters_convertToJSON(media_upload_parameters_t *media_upload_parameters);

#endif /* _media_upload_parameters_H_ */

