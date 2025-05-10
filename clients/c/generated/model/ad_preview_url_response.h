/*
 * ad_preview_url_response.h
 *
 * 
 */

#ifndef _ad_preview_url_response_H_
#define _ad_preview_url_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_preview_url_response_t ad_preview_url_response_t;




typedef struct ad_preview_url_response_t {
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} ad_preview_url_response_t;

__attribute__((deprecated)) ad_preview_url_response_t *ad_preview_url_response_create(
    char *url
);

void ad_preview_url_response_free(ad_preview_url_response_t *ad_preview_url_response);

ad_preview_url_response_t *ad_preview_url_response_parseFromJSON(cJSON *ad_preview_url_responseJSON);

cJSON *ad_preview_url_response_convertToJSON(ad_preview_url_response_t *ad_preview_url_response);

#endif /* _ad_preview_url_response_H_ */

