/*
 * user_summary.h
 *
 * 
 */

#ifndef _user_summary_H_
#define _user_summary_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct user_summary_t user_summary_t;




typedef struct user_summary_t {
    char *type; // string
    char *username; // string

    int _library_owned; // Is the library responsible for freeing this object?
} user_summary_t;

__attribute__((deprecated)) user_summary_t *user_summary_create(
    char *type,
    char *username
);

void user_summary_free(user_summary_t *user_summary);

user_summary_t *user_summary_parseFromJSON(cJSON *user_summaryJSON);

cJSON *user_summary_convertToJSON(user_summary_t *user_summary);

#endif /* _user_summary_H_ */

