/*
 * catalogs_creative_assets_feeds_create_request_default_locale.h
 *
 * The locale used within a feed for product descriptions.
 */

#ifndef _catalogs_creative_assets_feeds_create_request_default_locale_H_
#define _catalogs_creative_assets_feeds_create_request_default_locale_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_creative_assets_feeds_create_request_default_locale_t catalogs_creative_assets_feeds_create_request_default_locale_t;

#include "catalogs_locale.h"



typedef struct catalogs_creative_assets_feeds_create_request_default_locale_t {

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_creative_assets_feeds_create_request_default_locale_t;

__attribute__((deprecated)) catalogs_creative_assets_feeds_create_request_default_locale_t *catalogs_creative_assets_feeds_create_request_default_locale_create(
);

void catalogs_creative_assets_feeds_create_request_default_locale_free(catalogs_creative_assets_feeds_create_request_default_locale_t *catalogs_creative_assets_feeds_create_request_default_locale);

catalogs_creative_assets_feeds_create_request_default_locale_t *catalogs_creative_assets_feeds_create_request_default_locale_parseFromJSON(cJSON *catalogs_creative_assets_feeds_create_request_default_localeJSON);

cJSON *catalogs_creative_assets_feeds_create_request_default_locale_convertToJSON(catalogs_creative_assets_feeds_create_request_default_locale_t *catalogs_creative_assets_feeds_create_request_default_locale);

#endif /* _catalogs_creative_assets_feeds_create_request_default_locale_H_ */

