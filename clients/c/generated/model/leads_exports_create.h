/*
 * leads_exports_create.h
 *
 * Resource create operation model.
 */

#ifndef _leads_exports_create_H_
#define _leads_exports_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct leads_exports_create_t leads_exports_create_t;




typedef struct leads_exports_create_t {
    char *ad_id; // string
    char *end_date; // string
    char *start_date; // string

    int _library_owned; // Is the library responsible for freeing this object?
} leads_exports_create_t;

__attribute__((deprecated)) leads_exports_create_t *leads_exports_create_create(
    char *ad_id,
    char *end_date,
    char *start_date
);

void leads_exports_create_free(leads_exports_create_t *leads_exports_create);

leads_exports_create_t *leads_exports_create_parseFromJSON(cJSON *leads_exports_createJSON);

cJSON *leads_exports_create_convertToJSON(leads_exports_create_t *leads_exports_create);

#endif /* _leads_exports_create_H_ */

