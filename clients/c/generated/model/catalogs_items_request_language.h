/*
 * catalogs_items_request_language.h
 *
 * We recommend using the CatalogsLocale values.
 */

#ifndef _catalogs_items_request_language_H_
#define _catalogs_items_request_language_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_items_request_language_t catalogs_items_request_language_t;

#include "catalogs_locale.h"
#include "language.h"



typedef struct catalogs_items_request_language_t {

} catalogs_items_request_language_t;

catalogs_items_request_language_t *catalogs_items_request_language_create(
);

void catalogs_items_request_language_free(catalogs_items_request_language_t *catalogs_items_request_language);

catalogs_items_request_language_t *catalogs_items_request_language_parseFromJSON(cJSON *catalogs_items_request_languageJSON);

cJSON *catalogs_items_request_language_convertToJSON(catalogs_items_request_language_t *catalogs_items_request_language);

#endif /* _catalogs_items_request_language_H_ */

