/*
 * dynamic_titles_upload_url.h
 *
 * 
 */

#ifndef _dynamic_titles_upload_url_H_
#define _dynamic_titles_upload_url_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct dynamic_titles_upload_url_t dynamic_titles_upload_url_t;




typedef struct dynamic_titles_upload_url_t {
    char *existing_filename; // string
    char *request_id; // string
    char *upload_url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} dynamic_titles_upload_url_t;

__attribute__((deprecated)) dynamic_titles_upload_url_t *dynamic_titles_upload_url_create(
    char *existing_filename,
    char *request_id,
    char *upload_url
);

void dynamic_titles_upload_url_free(dynamic_titles_upload_url_t *dynamic_titles_upload_url);

dynamic_titles_upload_url_t *dynamic_titles_upload_url_parseFromJSON(cJSON *dynamic_titles_upload_urlJSON);

cJSON *dynamic_titles_upload_url_convertToJSON(dynamic_titles_upload_url_t *dynamic_titles_upload_url);

#endif /* _dynamic_titles_upload_url_H_ */

