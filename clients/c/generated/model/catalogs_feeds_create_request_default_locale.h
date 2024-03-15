/*
 * catalogs_feeds_create_request_default_locale.h
 *
 * The locale used within a feed for product descriptions.
 */

#ifndef _catalogs_feeds_create_request_default_locale_H_
#define _catalogs_feeds_create_request_default_locale_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_feeds_create_request_default_locale_t catalogs_feeds_create_request_default_locale_t;

#include "catalogs_locale.h"



typedef struct catalogs_feeds_create_request_default_locale_t {

} catalogs_feeds_create_request_default_locale_t;

catalogs_feeds_create_request_default_locale_t *catalogs_feeds_create_request_default_locale_create(
);

void catalogs_feeds_create_request_default_locale_free(catalogs_feeds_create_request_default_locale_t *catalogs_feeds_create_request_default_locale);

catalogs_feeds_create_request_default_locale_t *catalogs_feeds_create_request_default_locale_parseFromJSON(cJSON *catalogs_feeds_create_request_default_localeJSON);

cJSON *catalogs_feeds_create_request_default_locale_convertToJSON(catalogs_feeds_create_request_default_locale_t *catalogs_feeds_create_request_default_locale);

#endif /* _catalogs_feeds_create_request_default_locale_H_ */

