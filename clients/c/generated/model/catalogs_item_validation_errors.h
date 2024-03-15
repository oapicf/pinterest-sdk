/*
 * catalogs_item_validation_errors.h
 *
 * 
 */

#ifndef _catalogs_item_validation_errors_H_
#define _catalogs_item_validation_errors_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_item_validation_errors_t catalogs_item_validation_errors_t;

#include "catalogs_item_validation_details.h"



typedef struct catalogs_item_validation_errors_t {
    struct catalogs_item_validation_details_t *adult_invalid; //model
    struct catalogs_item_validation_details_t *adwords_format_invalid; //model
    struct catalogs_item_validation_details_t *availability_invalid; //model
    struct catalogs_item_validation_details_t *blocklisted_image_signature; //model
    struct catalogs_item_validation_details_t *description_missing; //model
    struct catalogs_item_validation_details_t *duplicate_products; //model
    struct catalogs_item_validation_details_t *image_link_invalid; //model
    struct catalogs_item_validation_details_t *image_link_length_too_long; //model
    struct catalogs_item_validation_details_t *image_link_missing; //model
    struct catalogs_item_validation_details_t *invalid_domain; //model
    struct catalogs_item_validation_details_t *itemid_missing; //model
    struct catalogs_item_validation_details_t *item_main_image_download_failure; //model
    struct catalogs_item_validation_details_t *link_format_invalid; //model
    struct catalogs_item_validation_details_t *link_length_too_long; //model
    struct catalogs_item_validation_details_t *list_price_invalid; //model
    struct catalogs_item_validation_details_t *max_items_per_item_group_exceeded; //model
    struct catalogs_item_validation_details_t *parse_line_error; //model
    struct catalogs_item_validation_details_t *pinjoin_content_unsafe; //model
    struct catalogs_item_validation_details_t *price_cannot_be_determined; //model
    struct catalogs_item_validation_details_t *price_missing; //model
    struct catalogs_item_validation_details_t *product_link_missing; //model
    struct catalogs_item_validation_details_t *product_price_invalid; //model
    struct catalogs_item_validation_details_t *title_missing; //model

} catalogs_item_validation_errors_t;

catalogs_item_validation_errors_t *catalogs_item_validation_errors_create(
    catalogs_item_validation_details_t *adult_invalid,
    catalogs_item_validation_details_t *adwords_format_invalid,
    catalogs_item_validation_details_t *availability_invalid,
    catalogs_item_validation_details_t *blocklisted_image_signature,
    catalogs_item_validation_details_t *description_missing,
    catalogs_item_validation_details_t *duplicate_products,
    catalogs_item_validation_details_t *image_link_invalid,
    catalogs_item_validation_details_t *image_link_length_too_long,
    catalogs_item_validation_details_t *image_link_missing,
    catalogs_item_validation_details_t *invalid_domain,
    catalogs_item_validation_details_t *itemid_missing,
    catalogs_item_validation_details_t *item_main_image_download_failure,
    catalogs_item_validation_details_t *link_format_invalid,
    catalogs_item_validation_details_t *link_length_too_long,
    catalogs_item_validation_details_t *list_price_invalid,
    catalogs_item_validation_details_t *max_items_per_item_group_exceeded,
    catalogs_item_validation_details_t *parse_line_error,
    catalogs_item_validation_details_t *pinjoin_content_unsafe,
    catalogs_item_validation_details_t *price_cannot_be_determined,
    catalogs_item_validation_details_t *price_missing,
    catalogs_item_validation_details_t *product_link_missing,
    catalogs_item_validation_details_t *product_price_invalid,
    catalogs_item_validation_details_t *title_missing
);

void catalogs_item_validation_errors_free(catalogs_item_validation_errors_t *catalogs_item_validation_errors);

catalogs_item_validation_errors_t *catalogs_item_validation_errors_parseFromJSON(cJSON *catalogs_item_validation_errorsJSON);

cJSON *catalogs_item_validation_errors_convertToJSON(catalogs_item_validation_errors_t *catalogs_item_validation_errors);

#endif /* _catalogs_item_validation_errors_H_ */

