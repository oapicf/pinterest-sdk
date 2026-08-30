/*
 * partner_metadata.h
 *
 * 
 */

#ifndef _partner_metadata_H_
#define _partner_metadata_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct partner_metadata_t partner_metadata_t;




typedef struct partner_metadata_t {
    char *subscriber_key; // string

    int _library_owned; // Is the library responsible for freeing this object?
} partner_metadata_t;

__attribute__((deprecated)) partner_metadata_t *partner_metadata_create(
    char *subscriber_key
);

void partner_metadata_free(partner_metadata_t *partner_metadata);

partner_metadata_t *partner_metadata_parseFromJSON(cJSON *partner_metadataJSON);

cJSON *partner_metadata_convertToJSON(partner_metadata_t *partner_metadata);

#endif /* _partner_metadata_H_ */

