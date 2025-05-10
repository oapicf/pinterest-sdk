/*
 * catalogs_item_validation_details.h
 *
 * 
 */

#ifndef _catalogs_item_validation_details_H_
#define _catalogs_item_validation_details_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_item_validation_details_t catalogs_item_validation_details_t;

#include "nullable_catalogs_item_field_type.h"



typedef struct catalogs_item_validation_details_t {
    pinterest_rest_api_nullable_catalogs_item_field_type__e attribute_name; //referenced enum
    char *provided_value; // string

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_item_validation_details_t;

__attribute__((deprecated)) catalogs_item_validation_details_t *catalogs_item_validation_details_create(
    pinterest_rest_api_nullable_catalogs_item_field_type__e attribute_name,
    char *provided_value
);

void catalogs_item_validation_details_free(catalogs_item_validation_details_t *catalogs_item_validation_details);

catalogs_item_validation_details_t *catalogs_item_validation_details_parseFromJSON(cJSON *catalogs_item_validation_detailsJSON);

cJSON *catalogs_item_validation_details_convertToJSON(catalogs_item_validation_details_t *catalogs_item_validation_details);

#endif /* _catalogs_item_validation_details_H_ */

