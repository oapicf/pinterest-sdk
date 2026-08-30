/*
 * leads_exports.h
 *
 * 
 */

#ifndef _leads_exports_H_
#define _leads_exports_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct leads_exports_t leads_exports_t;




typedef struct leads_exports_t {
    char *leads_export_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} leads_exports_t;

__attribute__((deprecated)) leads_exports_t *leads_exports_create(
    char *leads_export_id
);

void leads_exports_free(leads_exports_t *leads_exports);

leads_exports_t *leads_exports_parseFromJSON(cJSON *leads_exportsJSON);

cJSON *leads_exports_convertToJSON(leads_exports_t *leads_exports);

#endif /* _leads_exports_H_ */

