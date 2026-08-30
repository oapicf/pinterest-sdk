/*
 * catalogs_ai_content_disclosure.h
 *
 * AI content disclosure for a single asset of a catalog item.
 */

#ifndef _catalogs_ai_content_disclosure_H_
#define _catalogs_ai_content_disclosure_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_ai_content_disclosure_t catalogs_ai_content_disclosure_t;

#include "catalogs_ai_content_disclosure_label.h"

// Enum  for catalogs_ai_content_disclosure

typedef enum  { pinterest_rest_api_catalogs_ai_content_disclosure__NULL = 0, pinterest_rest_api_catalogs_ai_content_disclosure__ai_modified, pinterest_rest_api_catalogs_ai_content_disclosure__synthetic_performer } pinterest_rest_api_catalogs_ai_content_disclosure__e;

char* catalogs_ai_content_disclosure_disclosure_ToString(pinterest_rest_api_catalogs_ai_content_disclosure__e disclosure);

pinterest_rest_api_catalogs_ai_content_disclosure__e catalogs_ai_content_disclosure_disclosure_FromString(char* disclosure);



typedef struct catalogs_ai_content_disclosure_t {
    list_t *disclosure; //nonprimitive container
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_ai_content_disclosure_t;

__attribute__((deprecated)) catalogs_ai_content_disclosure_t *catalogs_ai_content_disclosure_create(
    list_t *disclosure,
    char *url
);

void catalogs_ai_content_disclosure_free(catalogs_ai_content_disclosure_t *catalogs_ai_content_disclosure);

catalogs_ai_content_disclosure_t *catalogs_ai_content_disclosure_parseFromJSON(cJSON *catalogs_ai_content_disclosureJSON);

cJSON *catalogs_ai_content_disclosure_convertToJSON(catalogs_ai_content_disclosure_t *catalogs_ai_content_disclosure);

#endif /* _catalogs_ai_content_disclosure_H_ */

