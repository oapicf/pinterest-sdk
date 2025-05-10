/*
 * user_website_summary.h
 *
 * 
 */

#ifndef _user_website_summary_H_
#define _user_website_summary_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct user_website_summary_t user_website_summary_t;




typedef struct user_website_summary_t {
    char *website; // string
    char *status; // string
    char *verified_at; // string

    int _library_owned; // Is the library responsible for freeing this object?
} user_website_summary_t;

__attribute__((deprecated)) user_website_summary_t *user_website_summary_create(
    char *website,
    char *status,
    char *verified_at
);

void user_website_summary_free(user_website_summary_t *user_website_summary);

user_website_summary_t *user_website_summary_parseFromJSON(cJSON *user_website_summaryJSON);

cJSON *user_website_summary_convertToJSON(user_website_summary_t *user_website_summary);

#endif /* _user_website_summary_H_ */

