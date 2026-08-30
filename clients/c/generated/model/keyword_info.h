/*
 * keyword_info.h
 *
 * Related Keyword information of the editorial article
 */

#ifndef _keyword_info_H_
#define _keyword_info_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct keyword_info_t keyword_info_t;




typedef struct keyword_info_t {
    char *name; // string
    double *pct_growth_mom; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} keyword_info_t;

__attribute__((deprecated)) keyword_info_t *keyword_info_create(
    char *name,
    double *pct_growth_mom
);

void keyword_info_free(keyword_info_t *keyword_info);

keyword_info_t *keyword_info_parseFromJSON(cJSON *keyword_infoJSON);

cJSON *keyword_info_convertToJSON(keyword_info_t *keyword_info);

#endif /* _keyword_info_H_ */

