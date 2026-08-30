/*
 * catalogs_ai_content_disclosure_label.h
 *
 * Disclosure label for AI-generated or AI-modified content in a catalog item asset.
 */

#ifndef _catalogs_ai_content_disclosure_label_H_
#define _catalogs_ai_content_disclosure_label_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_ai_content_disclosure_label_t catalogs_ai_content_disclosure_label_t;


// Enum  for catalogs_ai_content_disclosure_label

typedef enum { pinterest_rest_api_catalogs_ai_content_disclosure_label__NULL = 0, pinterest_rest_api_catalogs_ai_content_disclosure_label__ai_modified, pinterest_rest_api_catalogs_ai_content_disclosure_label__synthetic_performer } pinterest_rest_api_catalogs_ai_content_disclosure_label__e;

char* catalogs_ai_content_disclosure_label_catalogs_ai_content_disclosure_label_ToString(pinterest_rest_api_catalogs_ai_content_disclosure_label__e catalogs_ai_content_disclosure_label);

pinterest_rest_api_catalogs_ai_content_disclosure_label__e catalogs_ai_content_disclosure_label_catalogs_ai_content_disclosure_label_FromString(char* catalogs_ai_content_disclosure_label);

cJSON *catalogs_ai_content_disclosure_label_convertToJSON(pinterest_rest_api_catalogs_ai_content_disclosure_label__e catalogs_ai_content_disclosure_label);

pinterest_rest_api_catalogs_ai_content_disclosure_label__e catalogs_ai_content_disclosure_label_parseFromJSON(cJSON *catalogs_ai_content_disclosure_labelJSON);

#endif /* _catalogs_ai_content_disclosure_label_H_ */

