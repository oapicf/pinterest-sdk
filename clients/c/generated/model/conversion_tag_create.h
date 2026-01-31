/*
 * conversion_tag_create.h
 *
 * Resource create operation model.
 */

#ifndef _conversion_tag_create_H_
#define _conversion_tag_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct conversion_tag_create_t conversion_tag_create_t;




typedef struct conversion_tag_create_t {
    int aem_db_enabled; //boolean
    int aem_enabled; //boolean
    int aem_external_id_enabled; //boolean
    int aem_fnln_enabled; //boolean
    int aem_ge_enabled; //boolean
    int aem_loc_enabled; //boolean
    int aem_ph_enabled; //boolean
    double md_frequency; //numeric
    char *name; // string

    int _library_owned; // Is the library responsible for freeing this object?
} conversion_tag_create_t;

__attribute__((deprecated)) conversion_tag_create_t *conversion_tag_create_create(
    int aem_db_enabled,
    int aem_enabled,
    int aem_external_id_enabled,
    int aem_fnln_enabled,
    int aem_ge_enabled,
    int aem_loc_enabled,
    int aem_ph_enabled,
    double md_frequency,
    char *name
);

void conversion_tag_create_free(conversion_tag_create_t *conversion_tag_create);

conversion_tag_create_t *conversion_tag_create_parseFromJSON(cJSON *conversion_tag_createJSON);

cJSON *conversion_tag_create_convertToJSON(conversion_tag_create_t *conversion_tag_create);

#endif /* _conversion_tag_create_H_ */

