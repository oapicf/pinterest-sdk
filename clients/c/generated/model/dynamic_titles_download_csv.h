/*
 * dynamic_titles_download_csv.h
 *
 * 
 */

#ifndef _dynamic_titles_download_csv_H_
#define _dynamic_titles_download_csv_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct dynamic_titles_download_csv_t dynamic_titles_download_csv_t;




typedef struct dynamic_titles_download_csv_t {
    char *download_url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} dynamic_titles_download_csv_t;

__attribute__((deprecated)) dynamic_titles_download_csv_t *dynamic_titles_download_csv_create(
    char *download_url
);

void dynamic_titles_download_csv_free(dynamic_titles_download_csv_t *dynamic_titles_download_csv);

dynamic_titles_download_csv_t *dynamic_titles_download_csv_parseFromJSON(cJSON *dynamic_titles_download_csvJSON);

cJSON *dynamic_titles_download_csv_convertToJSON(dynamic_titles_download_csv_t *dynamic_titles_download_csv);

#endif /* _dynamic_titles_download_csv_H_ */

