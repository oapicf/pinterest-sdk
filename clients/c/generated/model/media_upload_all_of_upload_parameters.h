/*
 * media_upload_all_of_upload_parameters.h
 *
 * The list of parameter key/value pairs you will need to send with your POST request to upload your media file.
 */

#ifndef _media_upload_all_of_upload_parameters_H_
#define _media_upload_all_of_upload_parameters_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct media_upload_all_of_upload_parameters_t media_upload_all_of_upload_parameters_t;




typedef struct media_upload_all_of_upload_parameters_t {
    char *x_amz_date; // string
    char *x_amz_signature; // string
    char *x_amz_security_token; // string
    char *x_amz_algorithm; // string
    char *key; // string
    char *policy; // string
    char *x_amz_credential; // string
    char *content_type; // string

} media_upload_all_of_upload_parameters_t;

media_upload_all_of_upload_parameters_t *media_upload_all_of_upload_parameters_create(
    char *x_amz_date,
    char *x_amz_signature,
    char *x_amz_security_token,
    char *x_amz_algorithm,
    char *key,
    char *policy,
    char *x_amz_credential,
    char *content_type
);

void media_upload_all_of_upload_parameters_free(media_upload_all_of_upload_parameters_t *media_upload_all_of_upload_parameters);

media_upload_all_of_upload_parameters_t *media_upload_all_of_upload_parameters_parseFromJSON(cJSON *media_upload_all_of_upload_parametersJSON);

cJSON *media_upload_all_of_upload_parameters_convertToJSON(media_upload_all_of_upload_parameters_t *media_upload_all_of_upload_parameters);

#endif /* _media_upload_all_of_upload_parameters_H_ */

