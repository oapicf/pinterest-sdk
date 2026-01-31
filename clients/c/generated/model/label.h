/*
 * label.h
 *
 * 
 */

#ifndef _label_H_
#define _label_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct label_t label_t;

#include "label_status.h"
#include "label_type.h"

// Enum PARENTTYPE for label

typedef enum  { pinterest_rest_api_label_PARENTTYPE_NULL = 0, pinterest_rest_api_label_PARENTTYPE_CAMPAIGN } pinterest_rest_api_label_PARENTTYPE_e;

char* label_parent_type_ToString(pinterest_rest_api_label_PARENTTYPE_e parent_type);

pinterest_rest_api_label_PARENTTYPE_e label_parent_type_FromString(char* parent_type);



typedef struct label_t {
    char *id; // string
    pinterest_rest_api_label_type__e label_type; //referenced enum
    char *parent_id; // string
    pinterest_rest_api_label_PARENTTYPE_e parent_type; //enum
    pinterest_rest_api_label_status__e status; //referenced enum
    char *value; // string

    int _library_owned; // Is the library responsible for freeing this object?
} label_t;

__attribute__((deprecated)) label_t *label_create(
    char *id,
    pinterest_rest_api_label_type__e label_type,
    char *parent_id,
    pinterest_rest_api_label_PARENTTYPE_e parent_type,
    pinterest_rest_api_label_status__e status,
    char *value
);

void label_free(label_t *label);

label_t *label_parseFromJSON(cJSON *labelJSON);

cJSON *label_convertToJSON(label_t *label);

#endif /* _label_H_ */

