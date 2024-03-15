#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_item_validation_errors.h"



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
    ) {
    catalogs_item_validation_errors_t *catalogs_item_validation_errors_local_var = malloc(sizeof(catalogs_item_validation_errors_t));
    if (!catalogs_item_validation_errors_local_var) {
        return NULL;
    }
    catalogs_item_validation_errors_local_var->adult_invalid = adult_invalid;
    catalogs_item_validation_errors_local_var->adwords_format_invalid = adwords_format_invalid;
    catalogs_item_validation_errors_local_var->availability_invalid = availability_invalid;
    catalogs_item_validation_errors_local_var->blocklisted_image_signature = blocklisted_image_signature;
    catalogs_item_validation_errors_local_var->description_missing = description_missing;
    catalogs_item_validation_errors_local_var->duplicate_products = duplicate_products;
    catalogs_item_validation_errors_local_var->image_link_invalid = image_link_invalid;
    catalogs_item_validation_errors_local_var->image_link_length_too_long = image_link_length_too_long;
    catalogs_item_validation_errors_local_var->image_link_missing = image_link_missing;
    catalogs_item_validation_errors_local_var->invalid_domain = invalid_domain;
    catalogs_item_validation_errors_local_var->itemid_missing = itemid_missing;
    catalogs_item_validation_errors_local_var->item_main_image_download_failure = item_main_image_download_failure;
    catalogs_item_validation_errors_local_var->link_format_invalid = link_format_invalid;
    catalogs_item_validation_errors_local_var->link_length_too_long = link_length_too_long;
    catalogs_item_validation_errors_local_var->list_price_invalid = list_price_invalid;
    catalogs_item_validation_errors_local_var->max_items_per_item_group_exceeded = max_items_per_item_group_exceeded;
    catalogs_item_validation_errors_local_var->parse_line_error = parse_line_error;
    catalogs_item_validation_errors_local_var->pinjoin_content_unsafe = pinjoin_content_unsafe;
    catalogs_item_validation_errors_local_var->price_cannot_be_determined = price_cannot_be_determined;
    catalogs_item_validation_errors_local_var->price_missing = price_missing;
    catalogs_item_validation_errors_local_var->product_link_missing = product_link_missing;
    catalogs_item_validation_errors_local_var->product_price_invalid = product_price_invalid;
    catalogs_item_validation_errors_local_var->title_missing = title_missing;

    return catalogs_item_validation_errors_local_var;
}


void catalogs_item_validation_errors_free(catalogs_item_validation_errors_t *catalogs_item_validation_errors) {
    if(NULL == catalogs_item_validation_errors){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_item_validation_errors->adult_invalid) {
        catalogs_item_validation_details_free(catalogs_item_validation_errors->adult_invalid);
        catalogs_item_validation_errors->adult_invalid = NULL;
    }
    if (catalogs_item_validation_errors->adwords_format_invalid) {
        catalogs_item_validation_details_free(catalogs_item_validation_errors->adwords_format_invalid);
        catalogs_item_validation_errors->adwords_format_invalid = NULL;
    }
    if (catalogs_item_validation_errors->availability_invalid) {
        catalogs_item_validation_details_free(catalogs_item_validation_errors->availability_invalid);
        catalogs_item_validation_errors->availability_invalid = NULL;
    }
    if (catalogs_item_validation_errors->blocklisted_image_signature) {
        catalogs_item_validation_details_free(catalogs_item_validation_errors->blocklisted_image_signature);
        catalogs_item_validation_errors->blocklisted_image_signature = NULL;
    }
    if (catalogs_item_validation_errors->description_missing) {
        catalogs_item_validation_details_free(catalogs_item_validation_errors->description_missing);
        catalogs_item_validation_errors->description_missing = NULL;
    }
    if (catalogs_item_validation_errors->duplicate_products) {
        catalogs_item_validation_details_free(catalogs_item_validation_errors->duplicate_products);
        catalogs_item_validation_errors->duplicate_products = NULL;
    }
    if (catalogs_item_validation_errors->image_link_invalid) {
        catalogs_item_validation_details_free(catalogs_item_validation_errors->image_link_invalid);
        catalogs_item_validation_errors->image_link_invalid = NULL;
    }
    if (catalogs_item_validation_errors->image_link_length_too_long) {
        catalogs_item_validation_details_free(catalogs_item_validation_errors->image_link_length_too_long);
        catalogs_item_validation_errors->image_link_length_too_long = NULL;
    }
    if (catalogs_item_validation_errors->image_link_missing) {
        catalogs_item_validation_details_free(catalogs_item_validation_errors->image_link_missing);
        catalogs_item_validation_errors->image_link_missing = NULL;
    }
    if (catalogs_item_validation_errors->invalid_domain) {
        catalogs_item_validation_details_free(catalogs_item_validation_errors->invalid_domain);
        catalogs_item_validation_errors->invalid_domain = NULL;
    }
    if (catalogs_item_validation_errors->itemid_missing) {
        catalogs_item_validation_details_free(catalogs_item_validation_errors->itemid_missing);
        catalogs_item_validation_errors->itemid_missing = NULL;
    }
    if (catalogs_item_validation_errors->item_main_image_download_failure) {
        catalogs_item_validation_details_free(catalogs_item_validation_errors->item_main_image_download_failure);
        catalogs_item_validation_errors->item_main_image_download_failure = NULL;
    }
    if (catalogs_item_validation_errors->link_format_invalid) {
        catalogs_item_validation_details_free(catalogs_item_validation_errors->link_format_invalid);
        catalogs_item_validation_errors->link_format_invalid = NULL;
    }
    if (catalogs_item_validation_errors->link_length_too_long) {
        catalogs_item_validation_details_free(catalogs_item_validation_errors->link_length_too_long);
        catalogs_item_validation_errors->link_length_too_long = NULL;
    }
    if (catalogs_item_validation_errors->list_price_invalid) {
        catalogs_item_validation_details_free(catalogs_item_validation_errors->list_price_invalid);
        catalogs_item_validation_errors->list_price_invalid = NULL;
    }
    if (catalogs_item_validation_errors->max_items_per_item_group_exceeded) {
        catalogs_item_validation_details_free(catalogs_item_validation_errors->max_items_per_item_group_exceeded);
        catalogs_item_validation_errors->max_items_per_item_group_exceeded = NULL;
    }
    if (catalogs_item_validation_errors->parse_line_error) {
        catalogs_item_validation_details_free(catalogs_item_validation_errors->parse_line_error);
        catalogs_item_validation_errors->parse_line_error = NULL;
    }
    if (catalogs_item_validation_errors->pinjoin_content_unsafe) {
        catalogs_item_validation_details_free(catalogs_item_validation_errors->pinjoin_content_unsafe);
        catalogs_item_validation_errors->pinjoin_content_unsafe = NULL;
    }
    if (catalogs_item_validation_errors->price_cannot_be_determined) {
        catalogs_item_validation_details_free(catalogs_item_validation_errors->price_cannot_be_determined);
        catalogs_item_validation_errors->price_cannot_be_determined = NULL;
    }
    if (catalogs_item_validation_errors->price_missing) {
        catalogs_item_validation_details_free(catalogs_item_validation_errors->price_missing);
        catalogs_item_validation_errors->price_missing = NULL;
    }
    if (catalogs_item_validation_errors->product_link_missing) {
        catalogs_item_validation_details_free(catalogs_item_validation_errors->product_link_missing);
        catalogs_item_validation_errors->product_link_missing = NULL;
    }
    if (catalogs_item_validation_errors->product_price_invalid) {
        catalogs_item_validation_details_free(catalogs_item_validation_errors->product_price_invalid);
        catalogs_item_validation_errors->product_price_invalid = NULL;
    }
    if (catalogs_item_validation_errors->title_missing) {
        catalogs_item_validation_details_free(catalogs_item_validation_errors->title_missing);
        catalogs_item_validation_errors->title_missing = NULL;
    }
    free(catalogs_item_validation_errors);
}

cJSON *catalogs_item_validation_errors_convertToJSON(catalogs_item_validation_errors_t *catalogs_item_validation_errors) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_item_validation_errors->adult_invalid
    if(catalogs_item_validation_errors->adult_invalid) {
    cJSON *adult_invalid_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_errors->adult_invalid);
    if(adult_invalid_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ADULT_INVALID", adult_invalid_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_errors->adwords_format_invalid
    if(catalogs_item_validation_errors->adwords_format_invalid) {
    cJSON *adwords_format_invalid_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_errors->adwords_format_invalid);
    if(adwords_format_invalid_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ADWORDS_FORMAT_INVALID", adwords_format_invalid_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_errors->availability_invalid
    if(catalogs_item_validation_errors->availability_invalid) {
    cJSON *availability_invalid_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_errors->availability_invalid);
    if(availability_invalid_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "AVAILABILITY_INVALID", availability_invalid_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_errors->blocklisted_image_signature
    if(catalogs_item_validation_errors->blocklisted_image_signature) {
    cJSON *blocklisted_image_signature_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_errors->blocklisted_image_signature);
    if(blocklisted_image_signature_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "BLOCKLISTED_IMAGE_SIGNATURE", blocklisted_image_signature_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_errors->description_missing
    if(catalogs_item_validation_errors->description_missing) {
    cJSON *description_missing_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_errors->description_missing);
    if(description_missing_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "DESCRIPTION_MISSING", description_missing_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_errors->duplicate_products
    if(catalogs_item_validation_errors->duplicate_products) {
    cJSON *duplicate_products_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_errors->duplicate_products);
    if(duplicate_products_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "DUPLICATE_PRODUCTS", duplicate_products_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_errors->image_link_invalid
    if(catalogs_item_validation_errors->image_link_invalid) {
    cJSON *image_link_invalid_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_errors->image_link_invalid);
    if(image_link_invalid_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "IMAGE_LINK_INVALID", image_link_invalid_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_errors->image_link_length_too_long
    if(catalogs_item_validation_errors->image_link_length_too_long) {
    cJSON *image_link_length_too_long_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_errors->image_link_length_too_long);
    if(image_link_length_too_long_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "IMAGE_LINK_LENGTH_TOO_LONG", image_link_length_too_long_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_errors->image_link_missing
    if(catalogs_item_validation_errors->image_link_missing) {
    cJSON *image_link_missing_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_errors->image_link_missing);
    if(image_link_missing_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "IMAGE_LINK_MISSING", image_link_missing_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_errors->invalid_domain
    if(catalogs_item_validation_errors->invalid_domain) {
    cJSON *invalid_domain_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_errors->invalid_domain);
    if(invalid_domain_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "INVALID_DOMAIN", invalid_domain_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_errors->itemid_missing
    if(catalogs_item_validation_errors->itemid_missing) {
    cJSON *itemid_missing_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_errors->itemid_missing);
    if(itemid_missing_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ITEMID_MISSING", itemid_missing_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_errors->item_main_image_download_failure
    if(catalogs_item_validation_errors->item_main_image_download_failure) {
    cJSON *item_main_image_download_failure_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_errors->item_main_image_download_failure);
    if(item_main_image_download_failure_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE", item_main_image_download_failure_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_errors->link_format_invalid
    if(catalogs_item_validation_errors->link_format_invalid) {
    cJSON *link_format_invalid_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_errors->link_format_invalid);
    if(link_format_invalid_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "LINK_FORMAT_INVALID", link_format_invalid_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_errors->link_length_too_long
    if(catalogs_item_validation_errors->link_length_too_long) {
    cJSON *link_length_too_long_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_errors->link_length_too_long);
    if(link_length_too_long_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "LINK_LENGTH_TOO_LONG", link_length_too_long_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_errors->list_price_invalid
    if(catalogs_item_validation_errors->list_price_invalid) {
    cJSON *list_price_invalid_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_errors->list_price_invalid);
    if(list_price_invalid_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "LIST_PRICE_INVALID", list_price_invalid_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_errors->max_items_per_item_group_exceeded
    if(catalogs_item_validation_errors->max_items_per_item_group_exceeded) {
    cJSON *max_items_per_item_group_exceeded_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_errors->max_items_per_item_group_exceeded);
    if(max_items_per_item_group_exceeded_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED", max_items_per_item_group_exceeded_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_errors->parse_line_error
    if(catalogs_item_validation_errors->parse_line_error) {
    cJSON *parse_line_error_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_errors->parse_line_error);
    if(parse_line_error_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "PARSE_LINE_ERROR", parse_line_error_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_errors->pinjoin_content_unsafe
    if(catalogs_item_validation_errors->pinjoin_content_unsafe) {
    cJSON *pinjoin_content_unsafe_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_errors->pinjoin_content_unsafe);
    if(pinjoin_content_unsafe_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "PINJOIN_CONTENT_UNSAFE", pinjoin_content_unsafe_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_errors->price_cannot_be_determined
    if(catalogs_item_validation_errors->price_cannot_be_determined) {
    cJSON *price_cannot_be_determined_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_errors->price_cannot_be_determined);
    if(price_cannot_be_determined_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "PRICE_CANNOT_BE_DETERMINED", price_cannot_be_determined_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_errors->price_missing
    if(catalogs_item_validation_errors->price_missing) {
    cJSON *price_missing_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_errors->price_missing);
    if(price_missing_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "PRICE_MISSING", price_missing_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_errors->product_link_missing
    if(catalogs_item_validation_errors->product_link_missing) {
    cJSON *product_link_missing_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_errors->product_link_missing);
    if(product_link_missing_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "PRODUCT_LINK_MISSING", product_link_missing_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_errors->product_price_invalid
    if(catalogs_item_validation_errors->product_price_invalid) {
    cJSON *product_price_invalid_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_errors->product_price_invalid);
    if(product_price_invalid_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "PRODUCT_PRICE_INVALID", product_price_invalid_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // catalogs_item_validation_errors->title_missing
    if(catalogs_item_validation_errors->title_missing) {
    cJSON *title_missing_local_JSON = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_errors->title_missing);
    if(title_missing_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "TITLE_MISSING", title_missing_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_item_validation_errors_t *catalogs_item_validation_errors_parseFromJSON(cJSON *catalogs_item_validation_errorsJSON){

    catalogs_item_validation_errors_t *catalogs_item_validation_errors_local_var = NULL;

    // define the local variable for catalogs_item_validation_errors->adult_invalid
    catalogs_item_validation_details_t *adult_invalid_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_errors->adwords_format_invalid
    catalogs_item_validation_details_t *adwords_format_invalid_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_errors->availability_invalid
    catalogs_item_validation_details_t *availability_invalid_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_errors->blocklisted_image_signature
    catalogs_item_validation_details_t *blocklisted_image_signature_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_errors->description_missing
    catalogs_item_validation_details_t *description_missing_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_errors->duplicate_products
    catalogs_item_validation_details_t *duplicate_products_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_errors->image_link_invalid
    catalogs_item_validation_details_t *image_link_invalid_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_errors->image_link_length_too_long
    catalogs_item_validation_details_t *image_link_length_too_long_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_errors->image_link_missing
    catalogs_item_validation_details_t *image_link_missing_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_errors->invalid_domain
    catalogs_item_validation_details_t *invalid_domain_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_errors->itemid_missing
    catalogs_item_validation_details_t *itemid_missing_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_errors->item_main_image_download_failure
    catalogs_item_validation_details_t *item_main_image_download_failure_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_errors->link_format_invalid
    catalogs_item_validation_details_t *link_format_invalid_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_errors->link_length_too_long
    catalogs_item_validation_details_t *link_length_too_long_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_errors->list_price_invalid
    catalogs_item_validation_details_t *list_price_invalid_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_errors->max_items_per_item_group_exceeded
    catalogs_item_validation_details_t *max_items_per_item_group_exceeded_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_errors->parse_line_error
    catalogs_item_validation_details_t *parse_line_error_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_errors->pinjoin_content_unsafe
    catalogs_item_validation_details_t *pinjoin_content_unsafe_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_errors->price_cannot_be_determined
    catalogs_item_validation_details_t *price_cannot_be_determined_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_errors->price_missing
    catalogs_item_validation_details_t *price_missing_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_errors->product_link_missing
    catalogs_item_validation_details_t *product_link_missing_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_errors->product_price_invalid
    catalogs_item_validation_details_t *product_price_invalid_local_nonprim = NULL;

    // define the local variable for catalogs_item_validation_errors->title_missing
    catalogs_item_validation_details_t *title_missing_local_nonprim = NULL;

    // catalogs_item_validation_errors->adult_invalid
    cJSON *adult_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_errorsJSON, "ADULT_INVALID");
    if (adult_invalid) { 
    adult_invalid_local_nonprim = catalogs_item_validation_details_parseFromJSON(adult_invalid); //nonprimitive
    }

    // catalogs_item_validation_errors->adwords_format_invalid
    cJSON *adwords_format_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_errorsJSON, "ADWORDS_FORMAT_INVALID");
    if (adwords_format_invalid) { 
    adwords_format_invalid_local_nonprim = catalogs_item_validation_details_parseFromJSON(adwords_format_invalid); //nonprimitive
    }

    // catalogs_item_validation_errors->availability_invalid
    cJSON *availability_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_errorsJSON, "AVAILABILITY_INVALID");
    if (availability_invalid) { 
    availability_invalid_local_nonprim = catalogs_item_validation_details_parseFromJSON(availability_invalid); //nonprimitive
    }

    // catalogs_item_validation_errors->blocklisted_image_signature
    cJSON *blocklisted_image_signature = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_errorsJSON, "BLOCKLISTED_IMAGE_SIGNATURE");
    if (blocklisted_image_signature) { 
    blocklisted_image_signature_local_nonprim = catalogs_item_validation_details_parseFromJSON(blocklisted_image_signature); //nonprimitive
    }

    // catalogs_item_validation_errors->description_missing
    cJSON *description_missing = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_errorsJSON, "DESCRIPTION_MISSING");
    if (description_missing) { 
    description_missing_local_nonprim = catalogs_item_validation_details_parseFromJSON(description_missing); //nonprimitive
    }

    // catalogs_item_validation_errors->duplicate_products
    cJSON *duplicate_products = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_errorsJSON, "DUPLICATE_PRODUCTS");
    if (duplicate_products) { 
    duplicate_products_local_nonprim = catalogs_item_validation_details_parseFromJSON(duplicate_products); //nonprimitive
    }

    // catalogs_item_validation_errors->image_link_invalid
    cJSON *image_link_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_errorsJSON, "IMAGE_LINK_INVALID");
    if (image_link_invalid) { 
    image_link_invalid_local_nonprim = catalogs_item_validation_details_parseFromJSON(image_link_invalid); //nonprimitive
    }

    // catalogs_item_validation_errors->image_link_length_too_long
    cJSON *image_link_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_errorsJSON, "IMAGE_LINK_LENGTH_TOO_LONG");
    if (image_link_length_too_long) { 
    image_link_length_too_long_local_nonprim = catalogs_item_validation_details_parseFromJSON(image_link_length_too_long); //nonprimitive
    }

    // catalogs_item_validation_errors->image_link_missing
    cJSON *image_link_missing = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_errorsJSON, "IMAGE_LINK_MISSING");
    if (image_link_missing) { 
    image_link_missing_local_nonprim = catalogs_item_validation_details_parseFromJSON(image_link_missing); //nonprimitive
    }

    // catalogs_item_validation_errors->invalid_domain
    cJSON *invalid_domain = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_errorsJSON, "INVALID_DOMAIN");
    if (invalid_domain) { 
    invalid_domain_local_nonprim = catalogs_item_validation_details_parseFromJSON(invalid_domain); //nonprimitive
    }

    // catalogs_item_validation_errors->itemid_missing
    cJSON *itemid_missing = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_errorsJSON, "ITEMID_MISSING");
    if (itemid_missing) { 
    itemid_missing_local_nonprim = catalogs_item_validation_details_parseFromJSON(itemid_missing); //nonprimitive
    }

    // catalogs_item_validation_errors->item_main_image_download_failure
    cJSON *item_main_image_download_failure = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_errorsJSON, "ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE");
    if (item_main_image_download_failure) { 
    item_main_image_download_failure_local_nonprim = catalogs_item_validation_details_parseFromJSON(item_main_image_download_failure); //nonprimitive
    }

    // catalogs_item_validation_errors->link_format_invalid
    cJSON *link_format_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_errorsJSON, "LINK_FORMAT_INVALID");
    if (link_format_invalid) { 
    link_format_invalid_local_nonprim = catalogs_item_validation_details_parseFromJSON(link_format_invalid); //nonprimitive
    }

    // catalogs_item_validation_errors->link_length_too_long
    cJSON *link_length_too_long = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_errorsJSON, "LINK_LENGTH_TOO_LONG");
    if (link_length_too_long) { 
    link_length_too_long_local_nonprim = catalogs_item_validation_details_parseFromJSON(link_length_too_long); //nonprimitive
    }

    // catalogs_item_validation_errors->list_price_invalid
    cJSON *list_price_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_errorsJSON, "LIST_PRICE_INVALID");
    if (list_price_invalid) { 
    list_price_invalid_local_nonprim = catalogs_item_validation_details_parseFromJSON(list_price_invalid); //nonprimitive
    }

    // catalogs_item_validation_errors->max_items_per_item_group_exceeded
    cJSON *max_items_per_item_group_exceeded = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_errorsJSON, "MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED");
    if (max_items_per_item_group_exceeded) { 
    max_items_per_item_group_exceeded_local_nonprim = catalogs_item_validation_details_parseFromJSON(max_items_per_item_group_exceeded); //nonprimitive
    }

    // catalogs_item_validation_errors->parse_line_error
    cJSON *parse_line_error = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_errorsJSON, "PARSE_LINE_ERROR");
    if (parse_line_error) { 
    parse_line_error_local_nonprim = catalogs_item_validation_details_parseFromJSON(parse_line_error); //nonprimitive
    }

    // catalogs_item_validation_errors->pinjoin_content_unsafe
    cJSON *pinjoin_content_unsafe = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_errorsJSON, "PINJOIN_CONTENT_UNSAFE");
    if (pinjoin_content_unsafe) { 
    pinjoin_content_unsafe_local_nonprim = catalogs_item_validation_details_parseFromJSON(pinjoin_content_unsafe); //nonprimitive
    }

    // catalogs_item_validation_errors->price_cannot_be_determined
    cJSON *price_cannot_be_determined = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_errorsJSON, "PRICE_CANNOT_BE_DETERMINED");
    if (price_cannot_be_determined) { 
    price_cannot_be_determined_local_nonprim = catalogs_item_validation_details_parseFromJSON(price_cannot_be_determined); //nonprimitive
    }

    // catalogs_item_validation_errors->price_missing
    cJSON *price_missing = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_errorsJSON, "PRICE_MISSING");
    if (price_missing) { 
    price_missing_local_nonprim = catalogs_item_validation_details_parseFromJSON(price_missing); //nonprimitive
    }

    // catalogs_item_validation_errors->product_link_missing
    cJSON *product_link_missing = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_errorsJSON, "PRODUCT_LINK_MISSING");
    if (product_link_missing) { 
    product_link_missing_local_nonprim = catalogs_item_validation_details_parseFromJSON(product_link_missing); //nonprimitive
    }

    // catalogs_item_validation_errors->product_price_invalid
    cJSON *product_price_invalid = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_errorsJSON, "PRODUCT_PRICE_INVALID");
    if (product_price_invalid) { 
    product_price_invalid_local_nonprim = catalogs_item_validation_details_parseFromJSON(product_price_invalid); //nonprimitive
    }

    // catalogs_item_validation_errors->title_missing
    cJSON *title_missing = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_errorsJSON, "TITLE_MISSING");
    if (title_missing) { 
    title_missing_local_nonprim = catalogs_item_validation_details_parseFromJSON(title_missing); //nonprimitive
    }


    catalogs_item_validation_errors_local_var = catalogs_item_validation_errors_create (
        adult_invalid ? adult_invalid_local_nonprim : NULL,
        adwords_format_invalid ? adwords_format_invalid_local_nonprim : NULL,
        availability_invalid ? availability_invalid_local_nonprim : NULL,
        blocklisted_image_signature ? blocklisted_image_signature_local_nonprim : NULL,
        description_missing ? description_missing_local_nonprim : NULL,
        duplicate_products ? duplicate_products_local_nonprim : NULL,
        image_link_invalid ? image_link_invalid_local_nonprim : NULL,
        image_link_length_too_long ? image_link_length_too_long_local_nonprim : NULL,
        image_link_missing ? image_link_missing_local_nonprim : NULL,
        invalid_domain ? invalid_domain_local_nonprim : NULL,
        itemid_missing ? itemid_missing_local_nonprim : NULL,
        item_main_image_download_failure ? item_main_image_download_failure_local_nonprim : NULL,
        link_format_invalid ? link_format_invalid_local_nonprim : NULL,
        link_length_too_long ? link_length_too_long_local_nonprim : NULL,
        list_price_invalid ? list_price_invalid_local_nonprim : NULL,
        max_items_per_item_group_exceeded ? max_items_per_item_group_exceeded_local_nonprim : NULL,
        parse_line_error ? parse_line_error_local_nonprim : NULL,
        pinjoin_content_unsafe ? pinjoin_content_unsafe_local_nonprim : NULL,
        price_cannot_be_determined ? price_cannot_be_determined_local_nonprim : NULL,
        price_missing ? price_missing_local_nonprim : NULL,
        product_link_missing ? product_link_missing_local_nonprim : NULL,
        product_price_invalid ? product_price_invalid_local_nonprim : NULL,
        title_missing ? title_missing_local_nonprim : NULL
        );

    return catalogs_item_validation_errors_local_var;
end:
    if (adult_invalid_local_nonprim) {
        catalogs_item_validation_details_free(adult_invalid_local_nonprim);
        adult_invalid_local_nonprim = NULL;
    }
    if (adwords_format_invalid_local_nonprim) {
        catalogs_item_validation_details_free(adwords_format_invalid_local_nonprim);
        adwords_format_invalid_local_nonprim = NULL;
    }
    if (availability_invalid_local_nonprim) {
        catalogs_item_validation_details_free(availability_invalid_local_nonprim);
        availability_invalid_local_nonprim = NULL;
    }
    if (blocklisted_image_signature_local_nonprim) {
        catalogs_item_validation_details_free(blocklisted_image_signature_local_nonprim);
        blocklisted_image_signature_local_nonprim = NULL;
    }
    if (description_missing_local_nonprim) {
        catalogs_item_validation_details_free(description_missing_local_nonprim);
        description_missing_local_nonprim = NULL;
    }
    if (duplicate_products_local_nonprim) {
        catalogs_item_validation_details_free(duplicate_products_local_nonprim);
        duplicate_products_local_nonprim = NULL;
    }
    if (image_link_invalid_local_nonprim) {
        catalogs_item_validation_details_free(image_link_invalid_local_nonprim);
        image_link_invalid_local_nonprim = NULL;
    }
    if (image_link_length_too_long_local_nonprim) {
        catalogs_item_validation_details_free(image_link_length_too_long_local_nonprim);
        image_link_length_too_long_local_nonprim = NULL;
    }
    if (image_link_missing_local_nonprim) {
        catalogs_item_validation_details_free(image_link_missing_local_nonprim);
        image_link_missing_local_nonprim = NULL;
    }
    if (invalid_domain_local_nonprim) {
        catalogs_item_validation_details_free(invalid_domain_local_nonprim);
        invalid_domain_local_nonprim = NULL;
    }
    if (itemid_missing_local_nonprim) {
        catalogs_item_validation_details_free(itemid_missing_local_nonprim);
        itemid_missing_local_nonprim = NULL;
    }
    if (item_main_image_download_failure_local_nonprim) {
        catalogs_item_validation_details_free(item_main_image_download_failure_local_nonprim);
        item_main_image_download_failure_local_nonprim = NULL;
    }
    if (link_format_invalid_local_nonprim) {
        catalogs_item_validation_details_free(link_format_invalid_local_nonprim);
        link_format_invalid_local_nonprim = NULL;
    }
    if (link_length_too_long_local_nonprim) {
        catalogs_item_validation_details_free(link_length_too_long_local_nonprim);
        link_length_too_long_local_nonprim = NULL;
    }
    if (list_price_invalid_local_nonprim) {
        catalogs_item_validation_details_free(list_price_invalid_local_nonprim);
        list_price_invalid_local_nonprim = NULL;
    }
    if (max_items_per_item_group_exceeded_local_nonprim) {
        catalogs_item_validation_details_free(max_items_per_item_group_exceeded_local_nonprim);
        max_items_per_item_group_exceeded_local_nonprim = NULL;
    }
    if (parse_line_error_local_nonprim) {
        catalogs_item_validation_details_free(parse_line_error_local_nonprim);
        parse_line_error_local_nonprim = NULL;
    }
    if (pinjoin_content_unsafe_local_nonprim) {
        catalogs_item_validation_details_free(pinjoin_content_unsafe_local_nonprim);
        pinjoin_content_unsafe_local_nonprim = NULL;
    }
    if (price_cannot_be_determined_local_nonprim) {
        catalogs_item_validation_details_free(price_cannot_be_determined_local_nonprim);
        price_cannot_be_determined_local_nonprim = NULL;
    }
    if (price_missing_local_nonprim) {
        catalogs_item_validation_details_free(price_missing_local_nonprim);
        price_missing_local_nonprim = NULL;
    }
    if (product_link_missing_local_nonprim) {
        catalogs_item_validation_details_free(product_link_missing_local_nonprim);
        product_link_missing_local_nonprim = NULL;
    }
    if (product_price_invalid_local_nonprim) {
        catalogs_item_validation_details_free(product_price_invalid_local_nonprim);
        product_price_invalid_local_nonprim = NULL;
    }
    if (title_missing_local_nonprim) {
        catalogs_item_validation_details_free(title_missing_local_nonprim);
        title_missing_local_nonprim = NULL;
    }
    return NULL;

}
