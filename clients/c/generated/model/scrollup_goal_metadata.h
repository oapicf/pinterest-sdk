/*
 * scrollup_goal_metadata.h
 *
 * 
 */

#ifndef _scrollup_goal_metadata_H_
#define _scrollup_goal_metadata_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct scrollup_goal_metadata_t scrollup_goal_metadata_t;




typedef struct scrollup_goal_metadata_t {
    char *scrollup_goal_value_in_micro_currency; // string

    int _library_owned; // Is the library responsible for freeing this object?
} scrollup_goal_metadata_t;

__attribute__((deprecated)) scrollup_goal_metadata_t *scrollup_goal_metadata_create(
    char *scrollup_goal_value_in_micro_currency
);

void scrollup_goal_metadata_free(scrollup_goal_metadata_t *scrollup_goal_metadata);

scrollup_goal_metadata_t *scrollup_goal_metadata_parseFromJSON(cJSON *scrollup_goal_metadataJSON);

cJSON *scrollup_goal_metadata_convertToJSON(scrollup_goal_metadata_t *scrollup_goal_metadata);

#endif /* _scrollup_goal_metadata_H_ */

