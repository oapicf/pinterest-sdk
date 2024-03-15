/*
 * keyword_update_body.h
 *
 * 
 */

#ifndef _keyword_update_body_H_
#define _keyword_update_body_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct keyword_update_body_t keyword_update_body_t;

#include "keyword_update.h"



typedef struct keyword_update_body_t {
    list_t *keywords; //nonprimitive container

} keyword_update_body_t;

keyword_update_body_t *keyword_update_body_create(
    list_t *keywords
);

void keyword_update_body_free(keyword_update_body_t *keyword_update_body);

keyword_update_body_t *keyword_update_body_parseFromJSON(cJSON *keyword_update_bodyJSON);

cJSON *keyword_update_body_convertToJSON(keyword_update_body_t *keyword_update_body);

#endif /* _keyword_update_body_H_ */

