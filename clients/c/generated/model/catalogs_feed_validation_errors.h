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
    int fetch_error; //numeric
    int fetch_inactive_feed_error; //numeric
    int encoding_error; //numeric
    int delimiter_error; //numeric
    int required_columns_missing; //numeric
    int duplicate_products; //numeric
    int image_link_invalid; //numeric
    int itemid_missing; //numeric
    int title_missing; //numeric
    int description_missing; //numeric
    int product_link_missing; //numeric
    int image_link_missing; //numeric
    int availability_invalid; //numeric
    int product_price_invalid; //numeric
    int link_format_invalid; //numeric
    int parse_line_error; //numeric
    int adwords_format_invalid; //numeric
    int internal_service_error; //numeric
    int no_verified_domain; //numeric
    int adult_invalid; //numeric
    int image_link_length_too_long; //numeric
    int invalid_domain; //numeric
    int feed_length_too_long; //numeric
    int link_length_too_long; //numeric
    int malformed_xml; //numeric
    int price_missing; //numeric
    int feed_too_small; //numeric
    int max_items_per_item_group_exceeded; //numeric
    int item_main_image_download_failure; //numeric
    int pinjoin_content_unsafe; //numeric
    int blocklisted_image_signature; //numeric
    int list_price_invalid; //numeric
    int price_cannot_be_determined; //numeric

} catalogs_feed_validation_errors_t;

catalogs_feed_validation_errors_t *catalogs_feed_validation_errors_create(
    int fetch_error,
    int fetch_inactive_feed_error,
    int encoding_error,
    int delimiter_error,
    int required_columns_missing,
    int duplicate_products,
    int image_link_invalid,
    int itemid_missing,
    int title_missing,
    int description_missing,
    int product_link_missing,
    int image_link_missing,
    int availability_invalid,
    int product_price_invalid,
    int link_format_invalid,
    int parse_line_error,
    int adwords_format_invalid,
    int internal_service_error,
    int no_verified_domain,
    int adult_invalid,
    int image_link_length_too_long,
    int invalid_domain,
    int feed_length_too_long,
    int link_length_too_long,
    int malformed_xml,
    int price_missing,
    int feed_too_small,
    int max_items_per_item_group_exceeded,
    int item_main_image_download_failure,
    int pinjoin_content_unsafe,
    int blocklisted_image_signature,
    int list_price_invalid,
    int price_cannot_be_determined
);

void catalogs_feed_validation_errors_free(catalogs_feed_validation_errors_t *catalogs_feed_validation_errors);

catalogs_feed_validation_errors_t *catalogs_feed_validation_errors_parseFromJSON(cJSON *catalogs_feed_validation_errorsJSON);

cJSON *catalogs_feed_validation_errors_convertToJSON(catalogs_feed_validation_errors_t *catalogs_feed_validation_errors);

#endif /* _catalogs_feed_validation_errors_H_ */

