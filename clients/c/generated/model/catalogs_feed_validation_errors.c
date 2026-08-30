#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_feed_validation_errors.h"



static catalogs_feed_validation_errors_t *catalogs_feed_validation_errors_create_internal(
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
    ) {
    catalogs_feed_validation_errors_t *catalogs_feed_validation_errors_local_var = malloc(sizeof(catalogs_feed_validation_errors_t));
    if (!catalogs_feed_validation_errors_local_var) {
        return NULL;
    }
    memset(catalogs_feed_validation_errors_local_var, 0, sizeof(catalogs_feed_validation_errors_t));
    catalogs_feed_validation_errors_local_var->_library_owned = 1;
    catalogs_feed_validation_errors_local_var->adult_invalid = adult_invalid;
    catalogs_feed_validation_errors_local_var->adwords_format_invalid = adwords_format_invalid;
    catalogs_feed_validation_errors_local_var->availability_invalid = availability_invalid;
    catalogs_feed_validation_errors_local_var->blocklisted_image_signature = blocklisted_image_signature;
    catalogs_feed_validation_errors_local_var->delimiter_error = delimiter_error;
    catalogs_feed_validation_errors_local_var->description_missing = description_missing;
    catalogs_feed_validation_errors_local_var->duplicate_products = duplicate_products;
    catalogs_feed_validation_errors_local_var->encoding_error = encoding_error;
    catalogs_feed_validation_errors_local_var->feed_length_too_long = feed_length_too_long;
    catalogs_feed_validation_errors_local_var->feed_too_small = feed_too_small;
    catalogs_feed_validation_errors_local_var->fetch_error = fetch_error;
    catalogs_feed_validation_errors_local_var->fetch_inactive_feed_error = fetch_inactive_feed_error;
    catalogs_feed_validation_errors_local_var->image_link_invalid = image_link_invalid;
    catalogs_feed_validation_errors_local_var->image_link_length_too_long = image_link_length_too_long;
    catalogs_feed_validation_errors_local_var->image_link_missing = image_link_missing;
    catalogs_feed_validation_errors_local_var->internal_service_error = internal_service_error;
    catalogs_feed_validation_errors_local_var->invalid_domain = invalid_domain;
    catalogs_feed_validation_errors_local_var->item_main_image_download_failure = item_main_image_download_failure;
    catalogs_feed_validation_errors_local_var->itemid_missing = itemid_missing;
    catalogs_feed_validation_errors_local_var->link_format_invalid = link_format_invalid;
    catalogs_feed_validation_errors_local_var->link_length_too_long = link_length_too_long;
    catalogs_feed_validation_errors_local_var->list_price_invalid = list_price_invalid;
    catalogs_feed_validation_errors_local_var->malformed_xml = malformed_xml;
    catalogs_feed_validation_errors_local_var->max_items_per_item_group_exceeded = max_items_per_item_group_exceeded;
    catalogs_feed_validation_errors_local_var->no_verified_domain = no_verified_domain;
    catalogs_feed_validation_errors_local_var->parse_line_error = parse_line_error;
    catalogs_feed_validation_errors_local_var->pinjoin_content_unsafe = pinjoin_content_unsafe;
    catalogs_feed_validation_errors_local_var->price_cannot_be_determined = price_cannot_be_determined;
    catalogs_feed_validation_errors_local_var->price_missing = price_missing;
    catalogs_feed_validation_errors_local_var->product_link_missing = product_link_missing;
    catalogs_feed_validation_errors_local_var->product_price_invalid = product_price_invalid;
    catalogs_feed_validation_errors_local_var->required_columns_missing = required_columns_missing;
    catalogs_feed_validation_errors_local_var->title_missing = title_missing;
    return catalogs_feed_validation_errors_local_var;
}

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
    ) {
    int *adult_invalid_copy = NULL;
    if (adult_invalid) {
        adult_invalid_copy = malloc(sizeof(int));
        if (adult_invalid_copy) *adult_invalid_copy = *adult_invalid;
    }
    int *adwords_format_invalid_copy = NULL;
    if (adwords_format_invalid) {
        adwords_format_invalid_copy = malloc(sizeof(int));
        if (adwords_format_invalid_copy) *adwords_format_invalid_copy = *adwords_format_invalid;
    }
    int *availability_invalid_copy = NULL;
    if (availability_invalid) {
        availability_invalid_copy = malloc(sizeof(int));
        if (availability_invalid_copy) *availability_invalid_copy = *availability_invalid;
    }
    int *blocklisted_image_signature_copy = NULL;
    if (blocklisted_image_signature) {
        blocklisted_image_signature_copy = malloc(sizeof(int));
        if (blocklisted_image_signature_copy) *blocklisted_image_signature_copy = *blocklisted_image_signature;
    }
    int *delimiter_error_copy = NULL;
    if (delimiter_error) {
        delimiter_error_copy = malloc(sizeof(int));
        if (delimiter_error_copy) *delimiter_error_copy = *delimiter_error;
    }
    int *description_missing_copy = NULL;
    if (description_missing) {
        description_missing_copy = malloc(sizeof(int));
        if (description_missing_copy) *description_missing_copy = *description_missing;
    }
    int *duplicate_products_copy = NULL;
    if (duplicate_products) {
        duplicate_products_copy = malloc(sizeof(int));
        if (duplicate_products_copy) *duplicate_products_copy = *duplicate_products;
    }
    int *encoding_error_copy = NULL;
    if (encoding_error) {
        encoding_error_copy = malloc(sizeof(int));
        if (encoding_error_copy) *encoding_error_copy = *encoding_error;
    }
    int *feed_length_too_long_copy = NULL;
    if (feed_length_too_long) {
        feed_length_too_long_copy = malloc(sizeof(int));
        if (feed_length_too_long_copy) *feed_length_too_long_copy = *feed_length_too_long;
    }
    int *feed_too_small_copy = NULL;
    if (feed_too_small) {
        feed_too_small_copy = malloc(sizeof(int));
        if (feed_too_small_copy) *feed_too_small_copy = *feed_too_small;
    }
    int *fetch_error_copy = NULL;
    if (fetch_error) {
        fetch_error_copy = malloc(sizeof(int));
        if (fetch_error_copy) *fetch_error_copy = *fetch_error;
    }
    int *fetch_inactive_feed_error_copy = NULL;
    if (fetch_inactive_feed_error) {
        fetch_inactive_feed_error_copy = malloc(sizeof(int));
        if (fetch_inactive_feed_error_copy) *fetch_inactive_feed_error_copy = *fetch_inactive_feed_error;
    }
    int *image_link_invalid_copy = NULL;
    if (image_link_invalid) {
        image_link_invalid_copy = malloc(sizeof(int));
        if (image_link_invalid_copy) *image_link_invalid_copy = *image_link_invalid;
    }
    int *image_link_length_too_long_copy = NULL;
    if (image_link_length_too_long) {
        image_link_length_too_long_copy = malloc(sizeof(int));
        if (image_link_length_too_long_copy) *image_link_length_too_long_copy = *image_link_length_too_long;
    }
    int *image_link_missing_copy = NULL;
    if (image_link_missing) {
        image_link_missing_copy = malloc(sizeof(int));
        if (image_link_missing_copy) *image_link_missing_copy = *image_link_missing;
    }
    int *internal_service_error_copy = NULL;
    if (internal_service_error) {
        internal_service_error_copy = malloc(sizeof(int));
        if (internal_service_error_copy) *internal_service_error_copy = *internal_service_error;
    }
    int *invalid_domain_copy = NULL;
    if (invalid_domain) {
        invalid_domain_copy = malloc(sizeof(int));
        if (invalid_domain_copy) *invalid_domain_copy = *invalid_domain;
    }
    int *item_main_image_download_failure_copy = NULL;
    if (item_main_image_download_failure) {
        item_main_image_download_failure_copy = malloc(sizeof(int));
        if (item_main_image_download_failure_copy) *item_main_image_download_failure_copy = *item_main_image_download_failure;
    }
    int *itemid_missing_copy = NULL;
    if (itemid_missing) {
        itemid_missing_copy = malloc(sizeof(int));
        if (itemid_missing_copy) *itemid_missing_copy = *itemid_missing;
    }
    int *link_format_invalid_copy = NULL;
    if (link_format_invalid) {
        link_format_invalid_copy = malloc(sizeof(int));
        if (link_format_invalid_copy) *link_format_invalid_copy = *link_format_invalid;
    }
    int *link_length_too_long_copy = NULL;
    if (link_length_too_long) {
        link_length_too_long_copy = malloc(sizeof(int));
        if (link_length_too_long_copy) *link_length_too_long_copy = *link_length_too_long;
    }
    int *list_price_invalid_copy = NULL;
    if (list_price_invalid) {
        list_price_invalid_copy = malloc(sizeof(int));
        if (list_price_invalid_copy) *list_price_invalid_copy = *list_price_invalid;
    }
    int *malformed_xml_copy = NULL;
    if (malformed_xml) {
        malformed_xml_copy = malloc(sizeof(int));
        if (malformed_xml_copy) *malformed_xml_copy = *malformed_xml;
    }
    int *max_items_per_item_group_exceeded_copy = NULL;
    if (max_items_per_item_group_exceeded) {
        max_items_per_item_group_exceeded_copy = malloc(sizeof(int));
        if (max_items_per_item_group_exceeded_copy) *max_items_per_item_group_exceeded_copy = *max_items_per_item_group_exceeded;
    }
    int *no_verified_domain_copy = NULL;
    if (no_verified_domain) {
        no_verified_domain_copy = malloc(sizeof(int));
        if (no_verified_domain_copy) *no_verified_domain_copy = *no_verified_domain;
    }
    int *parse_line_error_copy = NULL;
    if (parse_line_error) {
        parse_line_error_copy = malloc(sizeof(int));
        if (parse_line_error_copy) *parse_line_error_copy = *parse_line_error;
    }
    int *pinjoin_content_unsafe_copy = NULL;
    if (pinjoin_content_unsafe) {
        pinjoin_content_unsafe_copy = malloc(sizeof(int));
        if (pinjoin_content_unsafe_copy) *pinjoin_content_unsafe_copy = *pinjoin_content_unsafe;
    }
    int *price_cannot_be_determined_copy = NULL;
    if (price_cannot_be_determined) {
        price_cannot_be_determined_copy = malloc(sizeof(int));
        if (price_cannot_be_determined_copy) *price_cannot_be_determined_copy = *price_cannot_be_determined;
    }
    int *price_missing_copy = NULL;
    if (price_missing) {
        price_missing_copy = malloc(sizeof(int));
        if (price_missing_copy) *price_missing_copy = *price_missing;
    }
    int *product_link_missing_copy = NULL;
    if (product_link_missing) {
        product_link_missing_copy = malloc(sizeof(int));
        if (product_link_missing_copy) *product_link_missing_copy = *product_link_missing;
    }
    int *product_price_invalid_copy = NULL;
    if (product_price_invalid) {
        product_price_invalid_copy = malloc(sizeof(int));
        if (product_price_invalid_copy) *product_price_invalid_copy = *product_price_invalid;
    }
    int *required_columns_missing_copy = NULL;
    if (required_columns_missing) {
        required_columns_missing_copy = malloc(sizeof(int));
        if (required_columns_missing_copy) *required_columns_missing_copy = *required_columns_missing;
    }
    int *title_missing_copy = NULL;
    if (title_missing) {
        title_missing_copy = malloc(sizeof(int));
        if (title_missing_copy) *title_missing_copy = *title_missing;
    }
    catalogs_feed_validation_errors_t *result = catalogs_feed_validation_errors_create_internal (
        adult_invalid_copy,
        adwords_format_invalid_copy,
        availability_invalid_copy,
        blocklisted_image_signature_copy,
        delimiter_error_copy,
        description_missing_copy,
        duplicate_products_copy,
        encoding_error_copy,
        feed_length_too_long_copy,
        feed_too_small_copy,
        fetch_error_copy,
        fetch_inactive_feed_error_copy,
        image_link_invalid_copy,
        image_link_length_too_long_copy,
        image_link_missing_copy,
        internal_service_error_copy,
        invalid_domain_copy,
        item_main_image_download_failure_copy,
        itemid_missing_copy,
        link_format_invalid_copy,
        link_length_too_long_copy,
        list_price_invalid_copy,
        malformed_xml_copy,
        max_items_per_item_group_exceeded_copy,
        no_verified_domain_copy,
        parse_line_error_copy,
        pinjoin_content_unsafe_copy,
        price_cannot_be_determined_copy,
        price_missing_copy,
        product_link_missing_copy,
        product_price_invalid_copy,
        required_columns_missing_copy,
        title_missing_copy
        );
    if (!result) {
        free(adult_invalid_copy);
        free(adwords_format_invalid_copy);
        free(availability_invalid_copy);
        free(blocklisted_image_signature_copy);
        free(delimiter_error_copy);
        free(description_missing_copy);
        free(duplicate_products_copy);
        free(encoding_error_copy);
        free(feed_length_too_long_copy);
        free(feed_too_small_copy);
        free(fetch_error_copy);
        free(fetch_inactive_feed_error_copy);
        free(image_link_invalid_copy);
        free(image_link_length_too_long_copy);
        free(image_link_missing_copy);
        free(internal_service_error_copy);
        free(invalid_domain_copy);
        free(item_main_image_download_failure_copy);
        free(itemid_missing_copy);
        free(link_format_invalid_copy);
        free(link_length_too_long_copy);
        free(list_price_invalid_copy);
        free(malformed_xml_copy);
        free(max_items_per_item_group_exceeded_copy);
        free(no_verified_domain_copy);
        free(parse_line_error_copy);
        free(pinjoin_content_unsafe_copy);
        free(price_cannot_be_determined_copy);
        free(price_missing_copy);
        free(product_link_missing_copy);
        free(product_price_invalid_copy);
        free(required_columns_missing_copy);
        free(title_missing_copy);
    }
    return result;
}

void catalogs_feed_validation_errors_free(catalogs_feed_validation_errors_t *catalogs_feed_validation_errors) {
    if(NULL == catalogs_feed_validation_errors){
        return ;
    }
    if(catalogs_feed_validation_errors->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_feed_validation_errors_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_feed_validation_errors->adult_invalid) {
        free(catalogs_feed_validation_errors->adult_invalid);
        catalogs_feed_validation_errors->adult_invalid = NULL;
    }
    if (catalogs_feed_validation_errors->adwords_format_invalid) {
        free(catalogs_feed_validation_errors->adwords_format_invalid);
        catalogs_feed_validation_errors->adwords_format_invalid = NULL;
    }
    if (catalogs_feed_validation_errors->availability_invalid) {
        free(catalogs_feed_validation_errors->availability_invalid);
        catalogs_feed_validation_errors->availability_invalid = NULL;
    }
    if (catalogs_feed_validation_errors->blocklisted_image_signature) {
        free(catalogs_feed_validation_errors->blocklisted_image_signature);
        catalogs_feed_validation_errors->blocklisted_image_signature = NULL;
    }
    if (catalogs_feed_validation_errors->delimiter_error) {
        free(catalogs_feed_validation_errors->delimiter_error);
        catalogs_feed_validation_errors->delimiter_error = NULL;
    }
    if (catalogs_feed_validation_errors->description_missing) {
        free(catalogs_feed_validation_errors->description_missing);
        catalogs_feed_validation_errors->description_missing = NULL;
    }
    if (catalogs_feed_validation_errors->duplicate_products) {
        free(catalogs_feed_validation_errors->duplicate_products);
        catalogs_feed_validation_errors->duplicate_products = NULL;
    }
    if (catalogs_feed_validation_errors->encoding_error) {
        free(catalogs_feed_validation_errors->encoding_error);
        catalogs_feed_validation_errors->encoding_error = NULL;
    }
    if (catalogs_feed_validation_errors->feed_length_too_long) {
        free(catalogs_feed_validation_errors->feed_length_too_long);
        catalogs_feed_validation_errors->feed_length_too_long = NULL;
    }
    if (catalogs_feed_validation_errors->feed_too_small) {
        free(catalogs_feed_validation_errors->feed_too_small);
        catalogs_feed_validation_errors->feed_too_small = NULL;
    }
    if (catalogs_feed_validation_errors->fetch_error) {
        free(catalogs_feed_validation_errors->fetch_error);
        catalogs_feed_validation_errors->fetch_error = NULL;
    }
    if (catalogs_feed_validation_errors->fetch_inactive_feed_error) {
        free(catalogs_feed_validation_errors->fetch_inactive_feed_error);
        catalogs_feed_validation_errors->fetch_inactive_feed_error = NULL;
    }
    if (catalogs_feed_validation_errors->image_link_invalid) {
        free(catalogs_feed_validation_errors->image_link_invalid);
        catalogs_feed_validation_errors->image_link_invalid = NULL;
    }
    if (catalogs_feed_validation_errors->image_link_length_too_long) {
        free(catalogs_feed_validation_errors->image_link_length_too_long);
        catalogs_feed_validation_errors->image_link_length_too_long = NULL;
    }
    if (catalogs_feed_validation_errors->image_link_missing) {
        free(catalogs_feed_validation_errors->image_link_missing);
        catalogs_feed_validation_errors->image_link_missing = NULL;
    }
    if (catalogs_feed_validation_errors->internal_service_error) {
        free(catalogs_feed_validation_errors->internal_service_error);
        catalogs_feed_validation_errors->internal_service_error = NULL;
    }
    if (catalogs_feed_validation_errors->invalid_domain) {
        free(catalogs_feed_validation_errors->invalid_domain);
        catalogs_feed_validation_errors->invalid_domain = NULL;
    }
    if (catalogs_feed_validation_errors->item_main_image_download_failure) {
        free(catalogs_feed_validation_errors->item_main_image_download_failure);
        catalogs_feed_validation_errors->item_main_image_download_failure = NULL;
    }
    if (catalogs_feed_validation_errors->itemid_missing) {
        free(catalogs_feed_validation_errors->itemid_missing);
        catalogs_feed_validation_errors->itemid_missing = NULL;
    }
    if (catalogs_feed_validation_errors->link_format_invalid) {
        free(catalogs_feed_validation_errors->link_format_invalid);
        catalogs_feed_validation_errors->link_format_invalid = NULL;
    }
    if (catalogs_feed_validation_errors->link_length_too_long) {
        free(catalogs_feed_validation_errors->link_length_too_long);
        catalogs_feed_validation_errors->link_length_too_long = NULL;
    }
    if (catalogs_feed_validation_errors->list_price_invalid) {
        free(catalogs_feed_validation_errors->list_price_invalid);
        catalogs_feed_validation_errors->list_price_invalid = NULL;
    }
    if (catalogs_feed_validation_errors->malformed_xml) {
        free(catalogs_feed_validation_errors->malformed_xml);
        catalogs_feed_validation_errors->malformed_xml = NULL;
    }
    if (catalogs_feed_validation_errors->max_items_per_item_group_exceeded) {
        free(catalogs_feed_validation_errors->max_items_per_item_group_exceeded);
        catalogs_feed_validation_errors->max_items_per_item_group_exceeded = NULL;
    }
    if (catalogs_feed_validation_errors->no_verified_domain) {
        free(catalogs_feed_validation_errors->no_verified_domain);
        catalogs_feed_validation_errors->no_verified_domain = NULL;
    }
    if (catalogs_feed_validation_errors->parse_line_error) {
        free(catalogs_feed_validation_errors->parse_line_error);
        catalogs_feed_validation_errors->parse_line_error = NULL;
    }
    if (catalogs_feed_validation_errors->pinjoin_content_unsafe) {
        free(catalogs_feed_validation_errors->pinjoin_content_unsafe);
        catalogs_feed_validation_errors->pinjoin_content_unsafe = NULL;
    }
    if (catalogs_feed_validation_errors->price_cannot_be_determined) {
        free(catalogs_feed_validation_errors->price_cannot_be_determined);
        catalogs_feed_validation_errors->price_cannot_be_determined = NULL;
    }
    if (catalogs_feed_validation_errors->price_missing) {
        free(catalogs_feed_validation_errors->price_missing);
        catalogs_feed_validation_errors->price_missing = NULL;
    }
    if (catalogs_feed_validation_errors->product_link_missing) {
        free(catalogs_feed_validation_errors->product_link_missing);
        catalogs_feed_validation_errors->product_link_missing = NULL;
    }
    if (catalogs_feed_validation_errors->product_price_invalid) {
        free(catalogs_feed_validation_errors->product_price_invalid);
        catalogs_feed_validation_errors->product_price_invalid = NULL;
    }
    if (catalogs_feed_validation_errors->required_columns_missing) {
        free(catalogs_feed_validation_errors->required_columns_missing);
        catalogs_feed_validation_errors->required_columns_missing = NULL;
    }
    if (catalogs_feed_validation_errors->title_missing) {
        free(catalogs_feed_validation_errors->title_missing);
        catalogs_feed_validation_errors->title_missing = NULL;
    }
    free(catalogs_feed_validation_errors);
}

cJSON *catalogs_feed_validation_errors_convertToJSON(catalogs_feed_validation_errors_t *catalogs_feed_validation_errors) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_feed_validation_errors->adult_invalid
    if(catalogs_feed_validation_errors->adult_invalid) {
    if(cJSON_AddNumberToObject(item, "ADULT_INVALID", *catalogs_feed_validation_errors->adult_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_errors->adwords_format_invalid
    if(catalogs_feed_validation_errors->adwords_format_invalid) {
    if(cJSON_AddNumberToObject(item, "ADWORDS_FORMAT_INVALID", *catalogs_feed_validation_errors->adwords_format_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_errors->availability_invalid
    if(catalogs_feed_validation_errors->availability_invalid) {
    if(cJSON_AddNumberToObject(item, "AVAILABILITY_INVALID", *catalogs_feed_validation_errors->availability_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_errors->blocklisted_image_signature
    if(catalogs_feed_validation_errors->blocklisted_image_signature) {
    if(cJSON_AddNumberToObject(item, "BLOCKLISTED_IMAGE_SIGNATURE", *catalogs_feed_validation_errors->blocklisted_image_signature) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_errors->delimiter_error
    if(catalogs_feed_validation_errors->delimiter_error) {
    if(cJSON_AddNumberToObject(item, "DELIMITER_ERROR", *catalogs_feed_validation_errors->delimiter_error) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_errors->description_missing
    if(catalogs_feed_validation_errors->description_missing) {
    if(cJSON_AddNumberToObject(item, "DESCRIPTION_MISSING", *catalogs_feed_validation_errors->description_missing) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_errors->duplicate_products
    if(catalogs_feed_validation_errors->duplicate_products) {
    if(cJSON_AddNumberToObject(item, "DUPLICATE_PRODUCTS", *catalogs_feed_validation_errors->duplicate_products) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_errors->encoding_error
    if(catalogs_feed_validation_errors->encoding_error) {
    if(cJSON_AddNumberToObject(item, "ENCODING_ERROR", *catalogs_feed_validation_errors->encoding_error) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_errors->feed_length_too_long
    if(catalogs_feed_validation_errors->feed_length_too_long) {
    if(cJSON_AddNumberToObject(item, "FEED_LENGTH_TOO_LONG", *catalogs_feed_validation_errors->feed_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_errors->feed_too_small
    if(catalogs_feed_validation_errors->feed_too_small) {
    if(cJSON_AddNumberToObject(item, "FEED_TOO_SMALL", *catalogs_feed_validation_errors->feed_too_small) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_errors->fetch_error
    if(catalogs_feed_validation_errors->fetch_error) {
    if(cJSON_AddNumberToObject(item, "FETCH_ERROR", *catalogs_feed_validation_errors->fetch_error) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_errors->fetch_inactive_feed_error
    if(catalogs_feed_validation_errors->fetch_inactive_feed_error) {
    if(cJSON_AddNumberToObject(item, "FETCH_INACTIVE_FEED_ERROR", *catalogs_feed_validation_errors->fetch_inactive_feed_error) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_errors->image_link_invalid
    if(catalogs_feed_validation_errors->image_link_invalid) {
    if(cJSON_AddNumberToObject(item, "IMAGE_LINK_INVALID", *catalogs_feed_validation_errors->image_link_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_errors->image_link_length_too_long
    if(catalogs_feed_validation_errors->image_link_length_too_long) {
    if(cJSON_AddNumberToObject(item, "IMAGE_LINK_LENGTH_TOO_LONG", *catalogs_feed_validation_errors->image_link_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_errors->image_link_missing
    if(catalogs_feed_validation_errors->image_link_missing) {
    if(cJSON_AddNumberToObject(item, "IMAGE_LINK_MISSING", *catalogs_feed_validation_errors->image_link_missing) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_errors->internal_service_error
    if(catalogs_feed_validation_errors->internal_service_error) {
    if(cJSON_AddNumberToObject(item, "INTERNAL_SERVICE_ERROR", *catalogs_feed_validation_errors->internal_service_error) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_errors->invalid_domain
    if(catalogs_feed_validation_errors->invalid_domain) {
    if(cJSON_AddNumberToObject(item, "INVALID_DOMAIN", *catalogs_feed_validation_errors->invalid_domain) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_errors->item_main_image_download_failure
    if(catalogs_feed_validation_errors->item_main_image_download_failure) {
    if(cJSON_AddNumberToObject(item, "ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE", *catalogs_feed_validation_errors->item_main_image_download_failure) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_errors->itemid_missing
    if(catalogs_feed_validation_errors->itemid_missing) {
    if(cJSON_AddNumberToObject(item, "ITEMID_MISSING", *catalogs_feed_validation_errors->itemid_missing) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_errors->link_format_invalid
    if(catalogs_feed_validation_errors->link_format_invalid) {
    if(cJSON_AddNumberToObject(item, "LINK_FORMAT_INVALID", *catalogs_feed_validation_errors->link_format_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_errors->link_length_too_long
    if(catalogs_feed_validation_errors->link_length_too_long) {
    if(cJSON_AddNumberToObject(item, "LINK_LENGTH_TOO_LONG", *catalogs_feed_validation_errors->link_length_too_long) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_errors->list_price_invalid
    if(catalogs_feed_validation_errors->list_price_invalid) {
    if(cJSON_AddNumberToObject(item, "LIST_PRICE_INVALID", *catalogs_feed_validation_errors->list_price_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_errors->malformed_xml
    if(catalogs_feed_validation_errors->malformed_xml) {
    if(cJSON_AddNumberToObject(item, "MALFORMED_XML", *catalogs_feed_validation_errors->malformed_xml) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_errors->max_items_per_item_group_exceeded
    if(catalogs_feed_validation_errors->max_items_per_item_group_exceeded) {
    if(cJSON_AddNumberToObject(item, "MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED", *catalogs_feed_validation_errors->max_items_per_item_group_exceeded) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_errors->no_verified_domain
    if(catalogs_feed_validation_errors->no_verified_domain) {
    if(cJSON_AddNumberToObject(item, "NO_VERIFIED_DOMAIN", *catalogs_feed_validation_errors->no_verified_domain) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_errors->parse_line_error
    if(catalogs_feed_validation_errors->parse_line_error) {
    if(cJSON_AddNumberToObject(item, "PARSE_LINE_ERROR", *catalogs_feed_validation_errors->parse_line_error) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_errors->pinjoin_content_unsafe
    if(catalogs_feed_validation_errors->pinjoin_content_unsafe) {
    if(cJSON_AddNumberToObject(item, "PINJOIN_CONTENT_UNSAFE", *catalogs_feed_validation_errors->pinjoin_content_unsafe) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_errors->price_cannot_be_determined
    if(catalogs_feed_validation_errors->price_cannot_be_determined) {
    if(cJSON_AddNumberToObject(item, "PRICE_CANNOT_BE_DETERMINED", *catalogs_feed_validation_errors->price_cannot_be_determined) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_errors->price_missing
    if(catalogs_feed_validation_errors->price_missing) {
    if(cJSON_AddNumberToObject(item, "PRICE_MISSING", *catalogs_feed_validation_errors->price_missing) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_errors->product_link_missing
    if(catalogs_feed_validation_errors->product_link_missing) {
    if(cJSON_AddNumberToObject(item, "PRODUCT_LINK_MISSING", *catalogs_feed_validation_errors->product_link_missing) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_errors->product_price_invalid
    if(catalogs_feed_validation_errors->product_price_invalid) {
    if(cJSON_AddNumberToObject(item, "PRODUCT_PRICE_INVALID", *catalogs_feed_validation_errors->product_price_invalid) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_errors->required_columns_missing
    if(catalogs_feed_validation_errors->required_columns_missing) {
    if(cJSON_AddNumberToObject(item, "REQUIRED_COLUMNS_MISSING", *catalogs_feed_validation_errors->required_columns_missing) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_feed_validation_errors->title_missing
    if(catalogs_feed_validation_errors->title_missing) {
    if(cJSON_AddNumberToObject(item, "TITLE_MISSING", *catalogs_feed_validation_errors->title_missing) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_feed_validation_errors_t *catalogs_feed_validation_errors_parseFromJSON(cJSON *catalogs_feed_validation_errorsJSON){

    catalogs_feed_validation_errors_t *catalogs_feed_validation_errors_local_var = NULL;

    // define the local variable for catalogs_feed_validation_errors->adult_invalid
    int *adult_invalid_local_var = NULL;

    // define the local variable for catalogs_feed_validation_errors->adwords_format_invalid
    int *adwords_format_invalid_local_var = NULL;

    // define the local variable for catalogs_feed_validation_errors->availability_invalid
    int *availability_invalid_local_var = NULL;

    // define the local variable for catalogs_feed_validation_errors->blocklisted_image_signature
    int *blocklisted_image_signature_local_var = NULL;

    // define the local variable for catalogs_feed_validation_errors->delimiter_error
    int *delimiter_error_local_var = NULL;

    // define the local variable for catalogs_feed_validation_errors->description_missing
    int *description_missing_local_var = NULL;

    // define the local variable for catalogs_feed_validation_errors->duplicate_products
    int *duplicate_products_local_var = NULL;

    // define the local variable for catalogs_feed_validation_errors->encoding_error
    int *encoding_error_local_var = NULL;

    // define the local variable for catalogs_feed_validation_errors->feed_length_too_long
    int *feed_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_errors->feed_too_small
    int *feed_too_small_local_var = NULL;

    // define the local variable for catalogs_feed_validation_errors->fetch_error
    int *fetch_error_local_var = NULL;

    // define the local variable for catalogs_feed_validation_errors->fetch_inactive_feed_error
    int *fetch_inactive_feed_error_local_var = NULL;

    // define the local variable for catalogs_feed_validation_errors->image_link_invalid
    int *image_link_invalid_local_var = NULL;

    // define the local variable for catalogs_feed_validation_errors->image_link_length_too_long
    int *image_link_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_errors->image_link_missing
    int *image_link_missing_local_var = NULL;

    // define the local variable for catalogs_feed_validation_errors->internal_service_error
    int *internal_service_error_local_var = NULL;

    // define the local variable for catalogs_feed_validation_errors->invalid_domain
    int *invalid_domain_local_var = NULL;

    // define the local variable for catalogs_feed_validation_errors->item_main_image_download_failure
    int *item_main_image_download_failure_local_var = NULL;

    // define the local variable for catalogs_feed_validation_errors->itemid_missing
    int *itemid_missing_local_var = NULL;

    // define the local variable for catalogs_feed_validation_errors->link_format_invalid
    int *link_format_invalid_local_var = NULL;

    // define the local variable for catalogs_feed_validation_errors->link_length_too_long
    int *link_length_too_long_local_var = NULL;

    // define the local variable for catalogs_feed_validation_errors->list_price_invalid
    int *list_price_invalid_local_var = NULL;

    // define the local variable for catalogs_feed_validation_errors->malformed_xml
    int *malformed_xml_local_var = NULL;

    // define the local variable for catalogs_feed_validation_errors->max_items_per_item_group_exceeded
    int *max_items_per_item_group_exceeded_local_var = NULL;

    // define the local variable for catalogs_feed_validation_errors->no_verified_domain
    int *no_verified_domain_local_var = NULL;

    // define the local variable for catalogs_feed_validation_errors->parse_line_error
    int *parse_line_error_local_var = NULL;

    // define the local variable for catalogs_feed_validation_errors->pinjoin_content_unsafe
    int *pinjoin_content_unsafe_local_var = NULL;

    // define the local variable for catalogs_feed_validation_errors->price_cannot_be_determined
    int *price_cannot_be_determined_local_var = NULL;

    // define the local variable for catalogs_feed_validation_errors->price_missing
    int *price_missing_local_var = NULL;

    // define the local variable for catalogs_feed_validation_errors->product_link_missing
    int *product_link_missing_local_var = NULL;

    // define the local variable for catalogs_feed_validation_errors->product_price_invalid
    int *product_price_invalid_local_var = NULL;

    // define the local variable for catalogs_feed_validation_errors->required_columns_missing
    int *required_columns_missing_local_var = NULL;

    // define the local variable for catalogs_feed_validation_errors->title_missing
    int *title_missing_local_var = NULL;

    // catalogs_feed_validation_errors->adult_invalid
    cJSON *adult_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_errorsJSON, "ADULT_INVALID");
    if (cJSON_IsNull(adult_invalid)) {
        adult_invalid = NULL;
    }
    if (adult_invalid) { 
    if(!cJSON_IsNumber(adult_invalid))
    {
    goto end; //Numeric
    }
    adult_invalid_local_var = malloc(sizeof(int));
    if(!adult_invalid_local_var)
    {
        goto end;
    }
    *adult_invalid_local_var = adult_invalid->valuedouble;
    }

    // catalogs_feed_validation_errors->adwords_format_invalid
    cJSON *adwords_format_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_errorsJSON, "ADWORDS_FORMAT_INVALID");
    if (cJSON_IsNull(adwords_format_invalid)) {
        adwords_format_invalid = NULL;
    }
    if (adwords_format_invalid) { 
    if(!cJSON_IsNumber(adwords_format_invalid))
    {
    goto end; //Numeric
    }
    adwords_format_invalid_local_var = malloc(sizeof(int));
    if(!adwords_format_invalid_local_var)
    {
        goto end;
    }
    *adwords_format_invalid_local_var = adwords_format_invalid->valuedouble;
    }

    // catalogs_feed_validation_errors->availability_invalid
    cJSON *availability_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_errorsJSON, "AVAILABILITY_INVALID");
    if (cJSON_IsNull(availability_invalid)) {
        availability_invalid = NULL;
    }
    if (availability_invalid) { 
    if(!cJSON_IsNumber(availability_invalid))
    {
    goto end; //Numeric
    }
    availability_invalid_local_var = malloc(sizeof(int));
    if(!availability_invalid_local_var)
    {
        goto end;
    }
    *availability_invalid_local_var = availability_invalid->valuedouble;
    }

    // catalogs_feed_validation_errors->blocklisted_image_signature
    cJSON *blocklisted_image_signature = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_errorsJSON, "BLOCKLISTED_IMAGE_SIGNATURE");
    if (cJSON_IsNull(blocklisted_image_signature)) {
        blocklisted_image_signature = NULL;
    }
    if (blocklisted_image_signature) { 
    if(!cJSON_IsNumber(blocklisted_image_signature))
    {
    goto end; //Numeric
    }
    blocklisted_image_signature_local_var = malloc(sizeof(int));
    if(!blocklisted_image_signature_local_var)
    {
        goto end;
    }
    *blocklisted_image_signature_local_var = blocklisted_image_signature->valuedouble;
    }

    // catalogs_feed_validation_errors->delimiter_error
    cJSON *delimiter_error = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_errorsJSON, "DELIMITER_ERROR");
    if (cJSON_IsNull(delimiter_error)) {
        delimiter_error = NULL;
    }
    if (delimiter_error) { 
    if(!cJSON_IsNumber(delimiter_error))
    {
    goto end; //Numeric
    }
    delimiter_error_local_var = malloc(sizeof(int));
    if(!delimiter_error_local_var)
    {
        goto end;
    }
    *delimiter_error_local_var = delimiter_error->valuedouble;
    }

    // catalogs_feed_validation_errors->description_missing
    cJSON *description_missing = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_errorsJSON, "DESCRIPTION_MISSING");
    if (cJSON_IsNull(description_missing)) {
        description_missing = NULL;
    }
    if (description_missing) { 
    if(!cJSON_IsNumber(description_missing))
    {
    goto end; //Numeric
    }
    description_missing_local_var = malloc(sizeof(int));
    if(!description_missing_local_var)
    {
        goto end;
    }
    *description_missing_local_var = description_missing->valuedouble;
    }

    // catalogs_feed_validation_errors->duplicate_products
    cJSON *duplicate_products = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_errorsJSON, "DUPLICATE_PRODUCTS");
    if (cJSON_IsNull(duplicate_products)) {
        duplicate_products = NULL;
    }
    if (duplicate_products) { 
    if(!cJSON_IsNumber(duplicate_products))
    {
    goto end; //Numeric
    }
    duplicate_products_local_var = malloc(sizeof(int));
    if(!duplicate_products_local_var)
    {
        goto end;
    }
    *duplicate_products_local_var = duplicate_products->valuedouble;
    }

    // catalogs_feed_validation_errors->encoding_error
    cJSON *encoding_error = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_errorsJSON, "ENCODING_ERROR");
    if (cJSON_IsNull(encoding_error)) {
        encoding_error = NULL;
    }
    if (encoding_error) { 
    if(!cJSON_IsNumber(encoding_error))
    {
    goto end; //Numeric
    }
    encoding_error_local_var = malloc(sizeof(int));
    if(!encoding_error_local_var)
    {
        goto end;
    }
    *encoding_error_local_var = encoding_error->valuedouble;
    }

    // catalogs_feed_validation_errors->feed_length_too_long
    cJSON *feed_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_errorsJSON, "FEED_LENGTH_TOO_LONG");
    if (cJSON_IsNull(feed_length_too_long)) {
        feed_length_too_long = NULL;
    }
    if (feed_length_too_long) { 
    if(!cJSON_IsNumber(feed_length_too_long))
    {
    goto end; //Numeric
    }
    feed_length_too_long_local_var = malloc(sizeof(int));
    if(!feed_length_too_long_local_var)
    {
        goto end;
    }
    *feed_length_too_long_local_var = feed_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_errors->feed_too_small
    cJSON *feed_too_small = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_errorsJSON, "FEED_TOO_SMALL");
    if (cJSON_IsNull(feed_too_small)) {
        feed_too_small = NULL;
    }
    if (feed_too_small) { 
    if(!cJSON_IsNumber(feed_too_small))
    {
    goto end; //Numeric
    }
    feed_too_small_local_var = malloc(sizeof(int));
    if(!feed_too_small_local_var)
    {
        goto end;
    }
    *feed_too_small_local_var = feed_too_small->valuedouble;
    }

    // catalogs_feed_validation_errors->fetch_error
    cJSON *fetch_error = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_errorsJSON, "FETCH_ERROR");
    if (cJSON_IsNull(fetch_error)) {
        fetch_error = NULL;
    }
    if (fetch_error) { 
    if(!cJSON_IsNumber(fetch_error))
    {
    goto end; //Numeric
    }
    fetch_error_local_var = malloc(sizeof(int));
    if(!fetch_error_local_var)
    {
        goto end;
    }
    *fetch_error_local_var = fetch_error->valuedouble;
    }

    // catalogs_feed_validation_errors->fetch_inactive_feed_error
    cJSON *fetch_inactive_feed_error = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_errorsJSON, "FETCH_INACTIVE_FEED_ERROR");
    if (cJSON_IsNull(fetch_inactive_feed_error)) {
        fetch_inactive_feed_error = NULL;
    }
    if (fetch_inactive_feed_error) { 
    if(!cJSON_IsNumber(fetch_inactive_feed_error))
    {
    goto end; //Numeric
    }
    fetch_inactive_feed_error_local_var = malloc(sizeof(int));
    if(!fetch_inactive_feed_error_local_var)
    {
        goto end;
    }
    *fetch_inactive_feed_error_local_var = fetch_inactive_feed_error->valuedouble;
    }

    // catalogs_feed_validation_errors->image_link_invalid
    cJSON *image_link_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_errorsJSON, "IMAGE_LINK_INVALID");
    if (cJSON_IsNull(image_link_invalid)) {
        image_link_invalid = NULL;
    }
    if (image_link_invalid) { 
    if(!cJSON_IsNumber(image_link_invalid))
    {
    goto end; //Numeric
    }
    image_link_invalid_local_var = malloc(sizeof(int));
    if(!image_link_invalid_local_var)
    {
        goto end;
    }
    *image_link_invalid_local_var = image_link_invalid->valuedouble;
    }

    // catalogs_feed_validation_errors->image_link_length_too_long
    cJSON *image_link_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_errorsJSON, "IMAGE_LINK_LENGTH_TOO_LONG");
    if (cJSON_IsNull(image_link_length_too_long)) {
        image_link_length_too_long = NULL;
    }
    if (image_link_length_too_long) { 
    if(!cJSON_IsNumber(image_link_length_too_long))
    {
    goto end; //Numeric
    }
    image_link_length_too_long_local_var = malloc(sizeof(int));
    if(!image_link_length_too_long_local_var)
    {
        goto end;
    }
    *image_link_length_too_long_local_var = image_link_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_errors->image_link_missing
    cJSON *image_link_missing = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_errorsJSON, "IMAGE_LINK_MISSING");
    if (cJSON_IsNull(image_link_missing)) {
        image_link_missing = NULL;
    }
    if (image_link_missing) { 
    if(!cJSON_IsNumber(image_link_missing))
    {
    goto end; //Numeric
    }
    image_link_missing_local_var = malloc(sizeof(int));
    if(!image_link_missing_local_var)
    {
        goto end;
    }
    *image_link_missing_local_var = image_link_missing->valuedouble;
    }

    // catalogs_feed_validation_errors->internal_service_error
    cJSON *internal_service_error = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_errorsJSON, "INTERNAL_SERVICE_ERROR");
    if (cJSON_IsNull(internal_service_error)) {
        internal_service_error = NULL;
    }
    if (internal_service_error) { 
    if(!cJSON_IsNumber(internal_service_error))
    {
    goto end; //Numeric
    }
    internal_service_error_local_var = malloc(sizeof(int));
    if(!internal_service_error_local_var)
    {
        goto end;
    }
    *internal_service_error_local_var = internal_service_error->valuedouble;
    }

    // catalogs_feed_validation_errors->invalid_domain
    cJSON *invalid_domain = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_errorsJSON, "INVALID_DOMAIN");
    if (cJSON_IsNull(invalid_domain)) {
        invalid_domain = NULL;
    }
    if (invalid_domain) { 
    if(!cJSON_IsNumber(invalid_domain))
    {
    goto end; //Numeric
    }
    invalid_domain_local_var = malloc(sizeof(int));
    if(!invalid_domain_local_var)
    {
        goto end;
    }
    *invalid_domain_local_var = invalid_domain->valuedouble;
    }

    // catalogs_feed_validation_errors->item_main_image_download_failure
    cJSON *item_main_image_download_failure = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_errorsJSON, "ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE");
    if (cJSON_IsNull(item_main_image_download_failure)) {
        item_main_image_download_failure = NULL;
    }
    if (item_main_image_download_failure) { 
    if(!cJSON_IsNumber(item_main_image_download_failure))
    {
    goto end; //Numeric
    }
    item_main_image_download_failure_local_var = malloc(sizeof(int));
    if(!item_main_image_download_failure_local_var)
    {
        goto end;
    }
    *item_main_image_download_failure_local_var = item_main_image_download_failure->valuedouble;
    }

    // catalogs_feed_validation_errors->itemid_missing
    cJSON *itemid_missing = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_errorsJSON, "ITEMID_MISSING");
    if (cJSON_IsNull(itemid_missing)) {
        itemid_missing = NULL;
    }
    if (itemid_missing) { 
    if(!cJSON_IsNumber(itemid_missing))
    {
    goto end; //Numeric
    }
    itemid_missing_local_var = malloc(sizeof(int));
    if(!itemid_missing_local_var)
    {
        goto end;
    }
    *itemid_missing_local_var = itemid_missing->valuedouble;
    }

    // catalogs_feed_validation_errors->link_format_invalid
    cJSON *link_format_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_errorsJSON, "LINK_FORMAT_INVALID");
    if (cJSON_IsNull(link_format_invalid)) {
        link_format_invalid = NULL;
    }
    if (link_format_invalid) { 
    if(!cJSON_IsNumber(link_format_invalid))
    {
    goto end; //Numeric
    }
    link_format_invalid_local_var = malloc(sizeof(int));
    if(!link_format_invalid_local_var)
    {
        goto end;
    }
    *link_format_invalid_local_var = link_format_invalid->valuedouble;
    }

    // catalogs_feed_validation_errors->link_length_too_long
    cJSON *link_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_errorsJSON, "LINK_LENGTH_TOO_LONG");
    if (cJSON_IsNull(link_length_too_long)) {
        link_length_too_long = NULL;
    }
    if (link_length_too_long) { 
    if(!cJSON_IsNumber(link_length_too_long))
    {
    goto end; //Numeric
    }
    link_length_too_long_local_var = malloc(sizeof(int));
    if(!link_length_too_long_local_var)
    {
        goto end;
    }
    *link_length_too_long_local_var = link_length_too_long->valuedouble;
    }

    // catalogs_feed_validation_errors->list_price_invalid
    cJSON *list_price_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_errorsJSON, "LIST_PRICE_INVALID");
    if (cJSON_IsNull(list_price_invalid)) {
        list_price_invalid = NULL;
    }
    if (list_price_invalid) { 
    if(!cJSON_IsNumber(list_price_invalid))
    {
    goto end; //Numeric
    }
    list_price_invalid_local_var = malloc(sizeof(int));
    if(!list_price_invalid_local_var)
    {
        goto end;
    }
    *list_price_invalid_local_var = list_price_invalid->valuedouble;
    }

    // catalogs_feed_validation_errors->malformed_xml
    cJSON *malformed_xml = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_errorsJSON, "MALFORMED_XML");
    if (cJSON_IsNull(malformed_xml)) {
        malformed_xml = NULL;
    }
    if (malformed_xml) { 
    if(!cJSON_IsNumber(malformed_xml))
    {
    goto end; //Numeric
    }
    malformed_xml_local_var = malloc(sizeof(int));
    if(!malformed_xml_local_var)
    {
        goto end;
    }
    *malformed_xml_local_var = malformed_xml->valuedouble;
    }

    // catalogs_feed_validation_errors->max_items_per_item_group_exceeded
    cJSON *max_items_per_item_group_exceeded = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_errorsJSON, "MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED");
    if (cJSON_IsNull(max_items_per_item_group_exceeded)) {
        max_items_per_item_group_exceeded = NULL;
    }
    if (max_items_per_item_group_exceeded) { 
    if(!cJSON_IsNumber(max_items_per_item_group_exceeded))
    {
    goto end; //Numeric
    }
    max_items_per_item_group_exceeded_local_var = malloc(sizeof(int));
    if(!max_items_per_item_group_exceeded_local_var)
    {
        goto end;
    }
    *max_items_per_item_group_exceeded_local_var = max_items_per_item_group_exceeded->valuedouble;
    }

    // catalogs_feed_validation_errors->no_verified_domain
    cJSON *no_verified_domain = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_errorsJSON, "NO_VERIFIED_DOMAIN");
    if (cJSON_IsNull(no_verified_domain)) {
        no_verified_domain = NULL;
    }
    if (no_verified_domain) { 
    if(!cJSON_IsNumber(no_verified_domain))
    {
    goto end; //Numeric
    }
    no_verified_domain_local_var = malloc(sizeof(int));
    if(!no_verified_domain_local_var)
    {
        goto end;
    }
    *no_verified_domain_local_var = no_verified_domain->valuedouble;
    }

    // catalogs_feed_validation_errors->parse_line_error
    cJSON *parse_line_error = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_errorsJSON, "PARSE_LINE_ERROR");
    if (cJSON_IsNull(parse_line_error)) {
        parse_line_error = NULL;
    }
    if (parse_line_error) { 
    if(!cJSON_IsNumber(parse_line_error))
    {
    goto end; //Numeric
    }
    parse_line_error_local_var = malloc(sizeof(int));
    if(!parse_line_error_local_var)
    {
        goto end;
    }
    *parse_line_error_local_var = parse_line_error->valuedouble;
    }

    // catalogs_feed_validation_errors->pinjoin_content_unsafe
    cJSON *pinjoin_content_unsafe = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_errorsJSON, "PINJOIN_CONTENT_UNSAFE");
    if (cJSON_IsNull(pinjoin_content_unsafe)) {
        pinjoin_content_unsafe = NULL;
    }
    if (pinjoin_content_unsafe) { 
    if(!cJSON_IsNumber(pinjoin_content_unsafe))
    {
    goto end; //Numeric
    }
    pinjoin_content_unsafe_local_var = malloc(sizeof(int));
    if(!pinjoin_content_unsafe_local_var)
    {
        goto end;
    }
    *pinjoin_content_unsafe_local_var = pinjoin_content_unsafe->valuedouble;
    }

    // catalogs_feed_validation_errors->price_cannot_be_determined
    cJSON *price_cannot_be_determined = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_errorsJSON, "PRICE_CANNOT_BE_DETERMINED");
    if (cJSON_IsNull(price_cannot_be_determined)) {
        price_cannot_be_determined = NULL;
    }
    if (price_cannot_be_determined) { 
    if(!cJSON_IsNumber(price_cannot_be_determined))
    {
    goto end; //Numeric
    }
    price_cannot_be_determined_local_var = malloc(sizeof(int));
    if(!price_cannot_be_determined_local_var)
    {
        goto end;
    }
    *price_cannot_be_determined_local_var = price_cannot_be_determined->valuedouble;
    }

    // catalogs_feed_validation_errors->price_missing
    cJSON *price_missing = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_errorsJSON, "PRICE_MISSING");
    if (cJSON_IsNull(price_missing)) {
        price_missing = NULL;
    }
    if (price_missing) { 
    if(!cJSON_IsNumber(price_missing))
    {
    goto end; //Numeric
    }
    price_missing_local_var = malloc(sizeof(int));
    if(!price_missing_local_var)
    {
        goto end;
    }
    *price_missing_local_var = price_missing->valuedouble;
    }

    // catalogs_feed_validation_errors->product_link_missing
    cJSON *product_link_missing = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_errorsJSON, "PRODUCT_LINK_MISSING");
    if (cJSON_IsNull(product_link_missing)) {
        product_link_missing = NULL;
    }
    if (product_link_missing) { 
    if(!cJSON_IsNumber(product_link_missing))
    {
    goto end; //Numeric
    }
    product_link_missing_local_var = malloc(sizeof(int));
    if(!product_link_missing_local_var)
    {
        goto end;
    }
    *product_link_missing_local_var = product_link_missing->valuedouble;
    }

    // catalogs_feed_validation_errors->product_price_invalid
    cJSON *product_price_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_errorsJSON, "PRODUCT_PRICE_INVALID");
    if (cJSON_IsNull(product_price_invalid)) {
        product_price_invalid = NULL;
    }
    if (product_price_invalid) { 
    if(!cJSON_IsNumber(product_price_invalid))
    {
    goto end; //Numeric
    }
    product_price_invalid_local_var = malloc(sizeof(int));
    if(!product_price_invalid_local_var)
    {
        goto end;
    }
    *product_price_invalid_local_var = product_price_invalid->valuedouble;
    }

    // catalogs_feed_validation_errors->required_columns_missing
    cJSON *required_columns_missing = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_errorsJSON, "REQUIRED_COLUMNS_MISSING");
    if (cJSON_IsNull(required_columns_missing)) {
        required_columns_missing = NULL;
    }
    if (required_columns_missing) { 
    if(!cJSON_IsNumber(required_columns_missing))
    {
    goto end; //Numeric
    }
    required_columns_missing_local_var = malloc(sizeof(int));
    if(!required_columns_missing_local_var)
    {
        goto end;
    }
    *required_columns_missing_local_var = required_columns_missing->valuedouble;
    }

    // catalogs_feed_validation_errors->title_missing
    cJSON *title_missing = cJSON_GetObjectItemCaseSensitive(catalogs_feed_validation_errorsJSON, "TITLE_MISSING");
    if (cJSON_IsNull(title_missing)) {
        title_missing = NULL;
    }
    if (title_missing) { 
    if(!cJSON_IsNumber(title_missing))
    {
    goto end; //Numeric
    }
    title_missing_local_var = malloc(sizeof(int));
    if(!title_missing_local_var)
    {
        goto end;
    }
    *title_missing_local_var = title_missing->valuedouble;
    }



    catalogs_feed_validation_errors_local_var = catalogs_feed_validation_errors_create_internal (
        adult_invalid_local_var,
        adwords_format_invalid_local_var,
        availability_invalid_local_var,
        blocklisted_image_signature_local_var,
        delimiter_error_local_var,
        description_missing_local_var,
        duplicate_products_local_var,
        encoding_error_local_var,
        feed_length_too_long_local_var,
        feed_too_small_local_var,
        fetch_error_local_var,
        fetch_inactive_feed_error_local_var,
        image_link_invalid_local_var,
        image_link_length_too_long_local_var,
        image_link_missing_local_var,
        internal_service_error_local_var,
        invalid_domain_local_var,
        item_main_image_download_failure_local_var,
        itemid_missing_local_var,
        link_format_invalid_local_var,
        link_length_too_long_local_var,
        list_price_invalid_local_var,
        malformed_xml_local_var,
        max_items_per_item_group_exceeded_local_var,
        no_verified_domain_local_var,
        parse_line_error_local_var,
        pinjoin_content_unsafe_local_var,
        price_cannot_be_determined_local_var,
        price_missing_local_var,
        product_link_missing_local_var,
        product_price_invalid_local_var,
        required_columns_missing_local_var,
        title_missing_local_var
        );

    if (!catalogs_feed_validation_errors_local_var) {
        goto end;
    }

    return catalogs_feed_validation_errors_local_var;
end:
    if (adult_invalid_local_var) {
        free(adult_invalid_local_var);
        adult_invalid_local_var = NULL;
    }
    if (adwords_format_invalid_local_var) {
        free(adwords_format_invalid_local_var);
        adwords_format_invalid_local_var = NULL;
    }
    if (availability_invalid_local_var) {
        free(availability_invalid_local_var);
        availability_invalid_local_var = NULL;
    }
    if (blocklisted_image_signature_local_var) {
        free(blocklisted_image_signature_local_var);
        blocklisted_image_signature_local_var = NULL;
    }
    if (delimiter_error_local_var) {
        free(delimiter_error_local_var);
        delimiter_error_local_var = NULL;
    }
    if (description_missing_local_var) {
        free(description_missing_local_var);
        description_missing_local_var = NULL;
    }
    if (duplicate_products_local_var) {
        free(duplicate_products_local_var);
        duplicate_products_local_var = NULL;
    }
    if (encoding_error_local_var) {
        free(encoding_error_local_var);
        encoding_error_local_var = NULL;
    }
    if (feed_length_too_long_local_var) {
        free(feed_length_too_long_local_var);
        feed_length_too_long_local_var = NULL;
    }
    if (feed_too_small_local_var) {
        free(feed_too_small_local_var);
        feed_too_small_local_var = NULL;
    }
    if (fetch_error_local_var) {
        free(fetch_error_local_var);
        fetch_error_local_var = NULL;
    }
    if (fetch_inactive_feed_error_local_var) {
        free(fetch_inactive_feed_error_local_var);
        fetch_inactive_feed_error_local_var = NULL;
    }
    if (image_link_invalid_local_var) {
        free(image_link_invalid_local_var);
        image_link_invalid_local_var = NULL;
    }
    if (image_link_length_too_long_local_var) {
        free(image_link_length_too_long_local_var);
        image_link_length_too_long_local_var = NULL;
    }
    if (image_link_missing_local_var) {
        free(image_link_missing_local_var);
        image_link_missing_local_var = NULL;
    }
    if (internal_service_error_local_var) {
        free(internal_service_error_local_var);
        internal_service_error_local_var = NULL;
    }
    if (invalid_domain_local_var) {
        free(invalid_domain_local_var);
        invalid_domain_local_var = NULL;
    }
    if (item_main_image_download_failure_local_var) {
        free(item_main_image_download_failure_local_var);
        item_main_image_download_failure_local_var = NULL;
    }
    if (itemid_missing_local_var) {
        free(itemid_missing_local_var);
        itemid_missing_local_var = NULL;
    }
    if (link_format_invalid_local_var) {
        free(link_format_invalid_local_var);
        link_format_invalid_local_var = NULL;
    }
    if (link_length_too_long_local_var) {
        free(link_length_too_long_local_var);
        link_length_too_long_local_var = NULL;
    }
    if (list_price_invalid_local_var) {
        free(list_price_invalid_local_var);
        list_price_invalid_local_var = NULL;
    }
    if (malformed_xml_local_var) {
        free(malformed_xml_local_var);
        malformed_xml_local_var = NULL;
    }
    if (max_items_per_item_group_exceeded_local_var) {
        free(max_items_per_item_group_exceeded_local_var);
        max_items_per_item_group_exceeded_local_var = NULL;
    }
    if (no_verified_domain_local_var) {
        free(no_verified_domain_local_var);
        no_verified_domain_local_var = NULL;
    }
    if (parse_line_error_local_var) {
        free(parse_line_error_local_var);
        parse_line_error_local_var = NULL;
    }
    if (pinjoin_content_unsafe_local_var) {
        free(pinjoin_content_unsafe_local_var);
        pinjoin_content_unsafe_local_var = NULL;
    }
    if (price_cannot_be_determined_local_var) {
        free(price_cannot_be_determined_local_var);
        price_cannot_be_determined_local_var = NULL;
    }
    if (price_missing_local_var) {
        free(price_missing_local_var);
        price_missing_local_var = NULL;
    }
    if (product_link_missing_local_var) {
        free(product_link_missing_local_var);
        product_link_missing_local_var = NULL;
    }
    if (product_price_invalid_local_var) {
        free(product_price_invalid_local_var);
        product_price_invalid_local_var = NULL;
    }
    if (required_columns_missing_local_var) {
        free(required_columns_missing_local_var);
        required_columns_missing_local_var = NULL;
    }
    if (title_missing_local_var) {
        free(title_missing_local_var);
        title_missing_local_var = NULL;
    }
    return NULL;

}
