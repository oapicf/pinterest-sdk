/*
 * catalogs_feed_validation_errors.h
 *
 * 
 */

#ifndef _catalogs_feed_validation_errors_H_
#define _catalogs_feed_validation_errors_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_feed_validation_errors_t catalogs_feed_validation_errors_t;




typedef struct catalogs_feed_validation_errors_t {
    int *adult_invalid; //numeric
    int *adwords_format_invalid; //numeric
    int *availability_invalid; //numeric
    int *blocklisted_image_signature; //numeric
    int *delimiter_error; //numeric
    int *description_missing; //numeric
    int *duplicate_products; //numeric
    int *encoding_error; //numeric
    int *feed_length_too_long; //numeric
    int *feed_too_small; //numeric
    int *fetch_error; //numeric
    int *fetch_inactive_feed_error; //numeric
    int *image_link_invalid; //numeric
    int *image_link_length_too_long; //numeric
    int *image_link_missing; //numeric
    int *internal_service_error; //numeric
    int *invalid_domain; //numeric
    int *item_main_image_download_failure; //numeric
    int *itemid_missing; //numeric
    int *link_format_invalid; //numeric
    int *link_length_too_long; //numeric
    int *list_price_invalid; //numeric
    int *malformed_xml; //numeric
    int *max_items_per_item_group_exceeded; //numeric
    int *no_verified_domain; //numeric
    int *parse_line_error; //numeric
    int *pinjoin_content_unsafe; //numeric
    int *price_cannot_be_determined; //numeric
    int *price_missing; //numeric
    int *product_link_missing; //numeric
    int *product_price_invalid; //numeric
    int *required_columns_missing; //numeric
    int *title_missing; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_feed_validation_errors_t;

__attribute__((deprecated)) catalogs_feed_validation_errors_t *catalogs_feed_validation_errors_create(
    int *adult_invalid,
    int *adwords_format_invalid,
    int *availability_invalid,
    int *blocklisted_image_signature,
    int *delimiter_error,
    int *description_missing,
    int *duplicate_products,
    int *encoding_error,
    int *feed_length_too_long,
    int *feed_too_small,
    int *fetch_error,
    int *fetch_inactive_feed_error,
    int *image_link_invalid,
    int *image_link_length_too_long,
    int *image_link_missing,
    int *internal_service_error,
    int *invalid_domain,
    int *item_main_image_download_failure,
    int *itemid_missing,
    int *link_format_invalid,
    int *link_length_too_long,
    int *list_price_invalid,
    int *malformed_xml,
    int *max_items_per_item_group_exceeded,
    int *no_verified_domain,
    int *parse_line_error,
    int *pinjoin_content_unsafe,
    int *price_cannot_be_determined,
    int *price_missing,
    int *product_link_missing,
    int *product_price_invalid,
    int *required_columns_missing,
    int *title_missing
);

void catalogs_feed_validation_errors_free(catalogs_feed_validation_errors_t *catalogs_feed_validation_errors);

catalogs_feed_validation_errors_t *catalogs_feed_validation_errors_parseFromJSON(cJSON *catalogs_feed_validation_errorsJSON);

cJSON *catalogs_feed_validation_errors_convertToJSON(catalogs_feed_validation_errors_t *catalogs_feed_validation_errors);

#endif /* _catalogs_feed_validation_errors_H_ */

