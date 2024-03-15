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
    char *username; // string
    char *type; // string

} user_summary_t;

user_summary_t *user_summary_create(
    char *username,
    char *type
);

void user_summary_free(user_summary_t *user_summary);

user_summary_t *user_summary_parseFromJSON(cJSON *user_summaryJSON);

cJSON *user_summary_convertToJSON(user_summary_t *user_summary);

#endif /* _user_summary_H_ */

