#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad.h"


char* ad_rejected_reasons_ToString(pinterest_rest_api_ad__e rejected_reasons) {
    char *rejected_reasonsArray[] =  { "NULL", "HASHTAGS", "PROMOTIONS_AND_PRICES", "TARGETING", "LANDING_PAGE", "CAPS_AND_SYMBOLS", "SHOCKING", "WEIGHT_LOSS", "PROHIBITED_PRODUCT", "AUTHENTICITY", "NUDITY", "CONFUSING_DESIGN", "URGENCY", "RATINGS", "APP", "ALCOHOL", "CONTESTS", "POLITICAL", "OTHER", "IMAGE", "NAR", "INCONSISTENT", "CLICKBAIT", "NO_DESCRIPTION", "LOW_QUALITY", "EXAGGERATED_CLAIMS", "PINTEREST_BRAND", "ALCOHOL_NO_SALE", "LANDING_PAGE_SPEED", "LANDING_PAGE_HARDWALL", "LANDING_PAGE_BROKEN", "LANDING_PAGE_QUALITY", "OUT_OF_STOCK", "IMAGE_LOW_QUALITY", "IMAGE_BUSY", "IMAGE_POORLY_EDITED", "IMAGE_BEFORE_AFTER", "UGC", "FAKE_BUTTONS", "WEAPONS", "SENSITIVE", "UNACCEPTABLE_BUSINESS", "SUSPICIOUS_CLAIMS", "PHARMA", "SUSPICIOUS_SUPPLEMENTS", "ILLEGAL_RECREATIONAL_DRUG", "LOW_QUALITY_LANDING_PAGE", "RESTRICTED_HEALTHCARE", "INCONSISTENT_LANG_FR" };
    return rejected_reasonsArray[rejected_reasons - 1];
}

pinterest_rest_api_ad__e ad_rejected_reasons_FromString(char* rejected_reasons) {
    int stringToReturn = 0;
    char *rejected_reasonsArray[] =  { "NULL", "HASHTAGS", "PROMOTIONS_AND_PRICES", "TARGETING", "LANDING_PAGE", "CAPS_AND_SYMBOLS", "SHOCKING", "WEIGHT_LOSS", "PROHIBITED_PRODUCT", "AUTHENTICITY", "NUDITY", "CONFUSING_DESIGN", "URGENCY", "RATINGS", "APP", "ALCOHOL", "CONTESTS", "POLITICAL", "OTHER", "IMAGE", "NAR", "INCONSISTENT", "CLICKBAIT", "NO_DESCRIPTION", "LOW_QUALITY", "EXAGGERATED_CLAIMS", "PINTEREST_BRAND", "ALCOHOL_NO_SALE", "LANDING_PAGE_SPEED", "LANDING_PAGE_HARDWALL", "LANDING_PAGE_BROKEN", "LANDING_PAGE_QUALITY", "OUT_OF_STOCK", "IMAGE_LOW_QUALITY", "IMAGE_BUSY", "IMAGE_POORLY_EDITED", "IMAGE_BEFORE_AFTER", "UGC", "FAKE_BUTTONS", "WEAPONS", "SENSITIVE", "UNACCEPTABLE_BUSINESS", "SUSPICIOUS_CLAIMS", "PHARMA", "SUSPICIOUS_SUPPLEMENTS", "ILLEGAL_RECREATIONAL_DRUG", "LOW_QUALITY_LANDING_PAGE", "RESTRICTED_HEALTHCARE", "INCONSISTENT_LANG_FR" };
    size_t sizeofArray = sizeof(rejected_reasonsArray) / sizeof(rejected_reasonsArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(rejected_reasons, rejected_reasonsArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

static ad_t *ad_create_internal(
    char *ad_account_id,
    char *ad_group_id,
    char *android_deep_link,
    char *campaign_id,
    list_t *carousel_android_deep_links,
    list_t *carousel_destination_urls,
    list_t *carousel_ios_deep_links,
    int *carting_platform_type,
    list_t *carting_products,
    char *click_tracking_url,
    char *collection_items_destination_url_template,
    ad_collections_header_type_t *collections_header_type,
    int *created_time,
    pinterest_rest_api_creative_type__e creative_type,
    pinterest_rest_api_customizable_cta_type__e customizable_cta_type,
    char *destination_url,
    pinterest_rest_api_disclosure_type__e disclosure_type,
    char *disclosure_url,
    pinterest_rest_api_grid_click_type__e grid_click_type,
    char *id,
    char *ios_deep_link,
    int *is_carting,
    int *is_collage_accepted_terms,
    int *is_collage_single_destination,
    int *is_pin_deleted,
    int *is_removable,
    char *lead_form_id,
    char *name,
    char *pin_id,
    quiz_pin_data_t *quiz_pin_data,
    list_t *rejected_reasons,
    list_t *rejection_labels,
    ad_review_status_t *review_status,
    pinterest_rest_api_entity_status__e status,
    pin_promotion_summary_status_t *summary_status,
    tracking_urls_t *tracking_urls,
    char *type,
    int *updated_time,
    char *view_tracking_url
    ) {
    ad_t *ad_local_var = malloc(sizeof(ad_t));
    if (!ad_local_var) {
        return NULL;
    }
    memset(ad_local_var, 0, sizeof(ad_t));
    ad_local_var->_library_owned = 1;
    ad_local_var->ad_account_id = ad_account_id;
    ad_local_var->ad_group_id = ad_group_id;
    ad_local_var->android_deep_link = android_deep_link;
    ad_local_var->campaign_id = campaign_id;
    ad_local_var->carousel_android_deep_links = carousel_android_deep_links;
    ad_local_var->carousel_destination_urls = carousel_destination_urls;
    ad_local_var->carousel_ios_deep_links = carousel_ios_deep_links;
    ad_local_var->carting_platform_type = carting_platform_type;
    ad_local_var->carting_products = carting_products;
    ad_local_var->click_tracking_url = click_tracking_url;
    ad_local_var->collection_items_destination_url_template = collection_items_destination_url_template;
    ad_local_var->collections_header_type = collections_header_type;
    ad_local_var->created_time = created_time;
    ad_local_var->creative_type = creative_type;
    ad_local_var->customizable_cta_type = customizable_cta_type;
    ad_local_var->destination_url = destination_url;
    ad_local_var->disclosure_type = disclosure_type;
    ad_local_var->disclosure_url = disclosure_url;
    ad_local_var->grid_click_type = grid_click_type;
    ad_local_var->id = id;
    ad_local_var->ios_deep_link = ios_deep_link;
    ad_local_var->is_carting = is_carting;
    ad_local_var->is_collage_accepted_terms = is_collage_accepted_terms;
    ad_local_var->is_collage_single_destination = is_collage_single_destination;
    ad_local_var->is_pin_deleted = is_pin_deleted;
    ad_local_var->is_removable = is_removable;
    ad_local_var->lead_form_id = lead_form_id;
    ad_local_var->name = name;
    ad_local_var->pin_id = pin_id;
    ad_local_var->quiz_pin_data = quiz_pin_data;
    ad_local_var->rejected_reasons = rejected_reasons;
    ad_local_var->rejection_labels = rejection_labels;
    ad_local_var->review_status = review_status;
    ad_local_var->status = status;
    ad_local_var->summary_status = summary_status;
    ad_local_var->tracking_urls = tracking_urls;
    ad_local_var->type = type;
    ad_local_var->updated_time = updated_time;
    ad_local_var->view_tracking_url = view_tracking_url;
    return ad_local_var;
}

__attribute__((deprecated)) ad_t *ad_create(
    char *ad_account_id,
    char *ad_group_id,
    char *android_deep_link,
    char *campaign_id,
    list_t *carousel_android_deep_links,
    list_t *carousel_destination_urls,
    list_t *carousel_ios_deep_links,
    int *carting_platform_type,
    list_t *carting_products,
    char *click_tracking_url,
    char *collection_items_destination_url_template,
    ad_collections_header_type_t *collections_header_type,
    int *created_time,
    pinterest_rest_api_creative_type__e creative_type,
    pinterest_rest_api_customizable_cta_type__e customizable_cta_type,
    char *destination_url,
    pinterest_rest_api_disclosure_type__e disclosure_type,
    char *disclosure_url,
    pinterest_rest_api_grid_click_type__e grid_click_type,
    char *id,
    char *ios_deep_link,
    int *is_carting,
    int *is_collage_accepted_terms,
    int *is_collage_single_destination,
    int *is_pin_deleted,
    int *is_removable,
    char *lead_form_id,
    char *name,
    char *pin_id,
    quiz_pin_data_t *quiz_pin_data,
    list_t *rejected_reasons,
    list_t *rejection_labels,
    ad_review_status_t *review_status,
    pinterest_rest_api_entity_status__e status,
    pin_promotion_summary_status_t *summary_status,
    tracking_urls_t *tracking_urls,
    char *type,
    int *updated_time,
    char *view_tracking_url
    ) {
    int *carting_platform_type_copy = NULL;
    if (carting_platform_type) {
        carting_platform_type_copy = malloc(sizeof(int));
        if (carting_platform_type_copy) *carting_platform_type_copy = *carting_platform_type;
    }
    int *created_time_copy = NULL;
    if (created_time) {
        created_time_copy = malloc(sizeof(int));
        if (created_time_copy) *created_time_copy = *created_time;
    }
    int *is_carting_copy = NULL;
    if (is_carting) {
        is_carting_copy = malloc(sizeof(int));
        if (is_carting_copy) *is_carting_copy = *is_carting;
    }
    int *is_collage_accepted_terms_copy = NULL;
    if (is_collage_accepted_terms) {
        is_collage_accepted_terms_copy = malloc(sizeof(int));
        if (is_collage_accepted_terms_copy) *is_collage_accepted_terms_copy = *is_collage_accepted_terms;
    }
    int *is_collage_single_destination_copy = NULL;
    if (is_collage_single_destination) {
        is_collage_single_destination_copy = malloc(sizeof(int));
        if (is_collage_single_destination_copy) *is_collage_single_destination_copy = *is_collage_single_destination;
    }
    int *is_pin_deleted_copy = NULL;
    if (is_pin_deleted) {
        is_pin_deleted_copy = malloc(sizeof(int));
        if (is_pin_deleted_copy) *is_pin_deleted_copy = *is_pin_deleted;
    }
    int *is_removable_copy = NULL;
    if (is_removable) {
        is_removable_copy = malloc(sizeof(int));
        if (is_removable_copy) *is_removable_copy = *is_removable;
    }
    int *updated_time_copy = NULL;
    if (updated_time) {
        updated_time_copy = malloc(sizeof(int));
        if (updated_time_copy) *updated_time_copy = *updated_time;
    }
    ad_t *result = ad_create_internal (
        ad_account_id,
        ad_group_id,
        android_deep_link,
        campaign_id,
        carousel_android_deep_links,
        carousel_destination_urls,
        carousel_ios_deep_links,
        carting_platform_type_copy,
        carting_products,
        click_tracking_url,
        collection_items_destination_url_template,
        collections_header_type,
        created_time_copy,
        creative_type,
        customizable_cta_type,
        destination_url,
        disclosure_type,
        disclosure_url,
        grid_click_type,
        id,
        ios_deep_link,
        is_carting_copy,
        is_collage_accepted_terms_copy,
        is_collage_single_destination_copy,
        is_pin_deleted_copy,
        is_removable_copy,
        lead_form_id,
        name,
        pin_id,
        quiz_pin_data,
        rejected_reasons,
        rejection_labels,
        review_status,
        status,
        summary_status,
        tracking_urls,
        type,
        updated_time_copy,
        view_tracking_url
        );
    if (!result) {
        free(carting_platform_type_copy);
        free(created_time_copy);
        free(is_carting_copy);
        free(is_collage_accepted_terms_copy);
        free(is_collage_single_destination_copy);
        free(is_pin_deleted_copy);
        free(is_removable_copy);
        free(updated_time_copy);
    }
    return result;
}

void ad_free(ad_t *ad) {
    if(NULL == ad){
        return ;
    }
    if(ad->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ad_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ad->ad_account_id) {
        free(ad->ad_account_id);
        ad->ad_account_id = NULL;
    }
    if (ad->ad_group_id) {
        free(ad->ad_group_id);
        ad->ad_group_id = NULL;
    }
    if (ad->android_deep_link) {
        free(ad->android_deep_link);
        ad->android_deep_link = NULL;
    }
    if (ad->campaign_id) {
        free(ad->campaign_id);
        ad->campaign_id = NULL;
    }
    if (ad->carousel_android_deep_links) {
        list_ForEach(listEntry, ad->carousel_android_deep_links) {
            free(listEntry->data);
        }
        list_freeList(ad->carousel_android_deep_links);
        ad->carousel_android_deep_links = NULL;
    }
    if (ad->carousel_destination_urls) {
        list_ForEach(listEntry, ad->carousel_destination_urls) {
            free(listEntry->data);
        }
        list_freeList(ad->carousel_destination_urls);
        ad->carousel_destination_urls = NULL;
    }
    if (ad->carousel_ios_deep_links) {
        list_ForEach(listEntry, ad->carousel_ios_deep_links) {
            free(listEntry->data);
        }
        list_freeList(ad->carousel_ios_deep_links);
        ad->carousel_ios_deep_links = NULL;
    }
    if (ad->carting_platform_type) {
        free(ad->carting_platform_type);
        ad->carting_platform_type = NULL;
    }
    if (ad->carting_products) {
        list_ForEach(listEntry, ad->carting_products) {
            carting_product_free(listEntry->data);
        }
        list_freeList(ad->carting_products);
        ad->carting_products = NULL;
    }
    if (ad->click_tracking_url) {
        free(ad->click_tracking_url);
        ad->click_tracking_url = NULL;
    }
    if (ad->collection_items_destination_url_template) {
        free(ad->collection_items_destination_url_template);
        ad->collection_items_destination_url_template = NULL;
    }
    if (ad->collections_header_type) {
        ad_collections_header_type_free(ad->collections_header_type);
        ad->collections_header_type = NULL;
    }
    if (ad->created_time) {
        free(ad->created_time);
        ad->created_time = NULL;
    }
    if (ad->destination_url) {
        free(ad->destination_url);
        ad->destination_url = NULL;
    }
    if (ad->disclosure_url) {
        free(ad->disclosure_url);
        ad->disclosure_url = NULL;
    }
    if (ad->id) {
        free(ad->id);
        ad->id = NULL;
    }
    if (ad->ios_deep_link) {
        free(ad->ios_deep_link);
        ad->ios_deep_link = NULL;
    }
    if (ad->is_carting) {
        free(ad->is_carting);
        ad->is_carting = NULL;
    }
    if (ad->is_collage_accepted_terms) {
        free(ad->is_collage_accepted_terms);
        ad->is_collage_accepted_terms = NULL;
    }
    if (ad->is_collage_single_destination) {
        free(ad->is_collage_single_destination);
        ad->is_collage_single_destination = NULL;
    }
    if (ad->is_pin_deleted) {
        free(ad->is_pin_deleted);
        ad->is_pin_deleted = NULL;
    }
    if (ad->is_removable) {
        free(ad->is_removable);
        ad->is_removable = NULL;
    }
    if (ad->lead_form_id) {
        free(ad->lead_form_id);
        ad->lead_form_id = NULL;
    }
    if (ad->name) {
        free(ad->name);
        ad->name = NULL;
    }
    if (ad->pin_id) {
        free(ad->pin_id);
        ad->pin_id = NULL;
    }
    if (ad->quiz_pin_data) {
        quiz_pin_data_free(ad->quiz_pin_data);
        ad->quiz_pin_data = NULL;
    }
    if (ad->rejected_reasons) {
        list_ForEach(listEntry, ad->rejected_reasons) {
            ad_disapproval_reasons_free(listEntry->data);
        }
        list_freeList(ad->rejected_reasons);
        ad->rejected_reasons = NULL;
    }
    if (ad->rejection_labels) {
        list_ForEach(listEntry, ad->rejection_labels) {
            free(listEntry->data);
        }
        list_freeList(ad->rejection_labels);
        ad->rejection_labels = NULL;
    }
    if (ad->review_status) {
        ad_review_status_free(ad->review_status);
        ad->review_status = NULL;
    }
    if (ad->summary_status) {
        pin_promotion_summary_status_free(ad->summary_status);
        ad->summary_status = NULL;
    }
    if (ad->tracking_urls) {
        tracking_urls_free(ad->tracking_urls);
        ad->tracking_urls = NULL;
    }
    if (ad->type) {
        free(ad->type);
        ad->type = NULL;
    }
    if (ad->updated_time) {
        free(ad->updated_time);
        ad->updated_time = NULL;
    }
    if (ad->view_tracking_url) {
        free(ad->view_tracking_url);
        ad->view_tracking_url = NULL;
    }
    free(ad);
}

cJSON *ad_convertToJSON(ad_t *ad) {
    cJSON *item = cJSON_CreateObject();

    // ad->ad_account_id
    if (!ad->ad_account_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "ad_account_id", ad->ad_account_id) == NULL) {
    goto fail; //String
    }


    // ad->ad_group_id
    if (!ad->ad_group_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "ad_group_id", ad->ad_group_id) == NULL) {
    goto fail; //String
    }


    // ad->android_deep_link
    if(ad->android_deep_link) {
    if(cJSON_AddStringToObject(item, "android_deep_link", ad->android_deep_link) == NULL) {
    goto fail; //String
    }
    }


    // ad->campaign_id
    if (!ad->campaign_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "campaign_id", ad->campaign_id) == NULL) {
    goto fail; //String
    }


    // ad->carousel_android_deep_links
    if(ad->carousel_android_deep_links) {
    cJSON *carousel_android_deep_links = cJSON_AddArrayToObject(item, "carousel_android_deep_links");
    if(carousel_android_deep_links == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *carousel_android_deep_linksListEntry;
    list_ForEach(carousel_android_deep_linksListEntry, ad->carousel_android_deep_links) {
    if(cJSON_AddStringToObject(carousel_android_deep_links, "", carousel_android_deep_linksListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // ad->carousel_destination_urls
    if(ad->carousel_destination_urls) {
    cJSON *carousel_destination_urls = cJSON_AddArrayToObject(item, "carousel_destination_urls");
    if(carousel_destination_urls == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *carousel_destination_urlsListEntry;
    list_ForEach(carousel_destination_urlsListEntry, ad->carousel_destination_urls) {
    if(cJSON_AddStringToObject(carousel_destination_urls, "", carousel_destination_urlsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // ad->carousel_ios_deep_links
    if(ad->carousel_ios_deep_links) {
    cJSON *carousel_ios_deep_links = cJSON_AddArrayToObject(item, "carousel_ios_deep_links");
    if(carousel_ios_deep_links == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *carousel_ios_deep_linksListEntry;
    list_ForEach(carousel_ios_deep_linksListEntry, ad->carousel_ios_deep_links) {
    if(cJSON_AddStringToObject(carousel_ios_deep_links, "", carousel_ios_deep_linksListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // ad->carting_platform_type
    if(ad->carting_platform_type) {
    if(cJSON_AddNumberToObject(item, "carting_platform_type", *ad->carting_platform_type) == NULL) {
    goto fail; //Numeric
    }
    }


    // ad->carting_products
    if(ad->carting_products) {
    cJSON *carting_products = cJSON_AddArrayToObject(item, "carting_products");
    if(carting_products == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *carting_productsListEntry;
    if (ad->carting_products) {
    list_ForEach(carting_productsListEntry, ad->carting_products) {
    cJSON *itemLocal = carting_product_convertToJSON(carting_productsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(carting_products, itemLocal);
    }
    }
    }


    // ad->click_tracking_url
    if(ad->click_tracking_url) {
    if(cJSON_AddStringToObject(item, "click_tracking_url", ad->click_tracking_url) == NULL) {
    goto fail; //String
    }
    }


    // ad->collection_items_destination_url_template
    if(ad->collection_items_destination_url_template) {
    if(cJSON_AddStringToObject(item, "collection_items_destination_url_template", ad->collection_items_destination_url_template) == NULL) {
    goto fail; //String
    }
    }


    // ad->collections_header_type
    if(ad->collections_header_type) {
    cJSON *collections_header_type_local_JSON = ad_collections_header_type_convertToJSON(ad->collections_header_type);
    if(collections_header_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "collections_header_type", collections_header_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad->created_time
    if(ad->created_time) {
    if(cJSON_AddNumberToObject(item, "created_time", *ad->created_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // ad->creative_type
    if (pinterest_rest_api_creative_type__NULL == ad->creative_type) {
        goto fail;
    }
    cJSON *creative_type_local_JSON = creative_type_convertToJSON(ad->creative_type);
    if(creative_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "creative_type", creative_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // ad->customizable_cta_type
    if(ad->customizable_cta_type != pinterest_rest_api_customizable_cta_type__NULL) {
    cJSON *customizable_cta_type_local_JSON = customizable_cta_type_convertToJSON(ad->customizable_cta_type);
    if(customizable_cta_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "customizable_cta_type", customizable_cta_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad->destination_url
    if(ad->destination_url) {
    if(cJSON_AddStringToObject(item, "destination_url", ad->destination_url) == NULL) {
    goto fail; //String
    }
    }


    // ad->disclosure_type
    if(ad->disclosure_type != pinterest_rest_api_disclosure_type__NULL) {
    cJSON *disclosure_type_local_JSON = disclosure_type_convertToJSON(ad->disclosure_type);
    if(disclosure_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "disclosure_type", disclosure_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad->disclosure_url
    if(ad->disclosure_url) {
    if(cJSON_AddStringToObject(item, "disclosure_url", ad->disclosure_url) == NULL) {
    goto fail; //String
    }
    }


    // ad->grid_click_type
    if(ad->grid_click_type != pinterest_rest_api_grid_click_type__NULL) {
    cJSON *grid_click_type_local_JSON = grid_click_type_convertToJSON(ad->grid_click_type);
    if(grid_click_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "grid_click_type", grid_click_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad->id
    if (!ad->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", ad->id) == NULL) {
    goto fail; //String
    }


    // ad->ios_deep_link
    if(ad->ios_deep_link) {
    if(cJSON_AddStringToObject(item, "ios_deep_link", ad->ios_deep_link) == NULL) {
    goto fail; //String
    }
    }


    // ad->is_carting
    if(ad->is_carting) {
    if(cJSON_AddBoolToObject(item, "is_carting", *ad->is_carting) == NULL) {
    goto fail; //Bool
    }
    }


    // ad->is_collage_accepted_terms
    if(ad->is_collage_accepted_terms) {
    if(cJSON_AddBoolToObject(item, "is_collage_accepted_terms", *ad->is_collage_accepted_terms) == NULL) {
    goto fail; //Bool
    }
    }


    // ad->is_collage_single_destination
    if(ad->is_collage_single_destination) {
    if(cJSON_AddBoolToObject(item, "is_collage_single_destination", *ad->is_collage_single_destination) == NULL) {
    goto fail; //Bool
    }
    }


    // ad->is_pin_deleted
    if(ad->is_pin_deleted) {
    if(cJSON_AddBoolToObject(item, "is_pin_deleted", *ad->is_pin_deleted) == NULL) {
    goto fail; //Bool
    }
    }


    // ad->is_removable
    if(ad->is_removable) {
    if(cJSON_AddBoolToObject(item, "is_removable", *ad->is_removable) == NULL) {
    goto fail; //Bool
    }
    }


    // ad->lead_form_id
    if(ad->lead_form_id) {
    if(cJSON_AddStringToObject(item, "lead_form_id", ad->lead_form_id) == NULL) {
    goto fail; //String
    }
    }


    // ad->name
    if(ad->name) {
    if(cJSON_AddStringToObject(item, "name", ad->name) == NULL) {
    goto fail; //String
    }
    }


    // ad->pin_id
    if (!ad->pin_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "pin_id", ad->pin_id) == NULL) {
    goto fail; //String
    }


    // ad->quiz_pin_data
    if(ad->quiz_pin_data) {
    cJSON *quiz_pin_data_local_JSON = quiz_pin_data_convertToJSON(ad->quiz_pin_data);
    if(quiz_pin_data_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "quiz_pin_data", quiz_pin_data_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // ad->rejected_reasons
    if (pinterest_rest_api_list_REJECTEDREASONS_NULL == ad->rejected_reasons) {
        goto fail;
    }
    cJSON *rejected_reasons = cJSON_AddArrayToObject(item, "rejected_reasons");
    if(rejected_reasons == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *rejected_reasonsListEntry;
    if (ad->rejected_reasons) {
    list_ForEach(rejected_reasonsListEntry, ad->rejected_reasons) {
    cJSON *itemLocal = ad_disapproval_reasons_convertToJSON((pinterest_rest_api_ad__e)rejected_reasonsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(rejected_reasons, itemLocal);
    }
    }


    // ad->rejection_labels
    if (!ad->rejection_labels) {
        goto fail;
    }
    cJSON *rejection_labels = cJSON_AddArrayToObject(item, "rejection_labels");
    if(rejection_labels == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *rejection_labelsListEntry;
    list_ForEach(rejection_labelsListEntry, ad->rejection_labels) {
    if(cJSON_AddStringToObject(rejection_labels, "", rejection_labelsListEntry->data) == NULL)
    {
        goto fail;
    }
    }


    // ad->review_status
    if (!ad->review_status) {
        goto fail;
    }
    cJSON *review_status_local_JSON = ad_review_status_convertToJSON(ad->review_status);
    if(review_status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "review_status", review_status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // ad->status
    if(ad->status != pinterest_rest_api_entity_status__NULL) {
    cJSON *status_local_JSON = entity_status_convertToJSON(ad->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad->summary_status
    if (!ad->summary_status) {
        goto fail;
    }
    cJSON *summary_status_local_JSON = pin_promotion_summary_status_convertToJSON(ad->summary_status);
    if(summary_status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "summary_status", summary_status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // ad->tracking_urls
    if(ad->tracking_urls) {
    cJSON *tracking_urls_local_JSON = tracking_urls_convertToJSON(ad->tracking_urls);
    if(tracking_urls_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "tracking_urls", tracking_urls_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // ad->type
    if (!ad->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", ad->type) == NULL) {
    goto fail; //String
    }


    // ad->updated_time
    if(ad->updated_time) {
    if(cJSON_AddNumberToObject(item, "updated_time", *ad->updated_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // ad->view_tracking_url
    if(ad->view_tracking_url) {
    if(cJSON_AddStringToObject(item, "view_tracking_url", ad->view_tracking_url) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

ad_t *ad_parseFromJSON(cJSON *adJSON){

    ad_t *ad_local_var = NULL;

    char *ad_account_id_local_str = NULL;

    char *ad_group_id_local_str = NULL;

    char *android_deep_link_local_str = NULL;

    char *campaign_id_local_str = NULL;

    // define the local list for ad->carousel_android_deep_links
    list_t *carousel_android_deep_linksList = NULL;

    // define the local list for ad->carousel_destination_urls
    list_t *carousel_destination_urlsList = NULL;

    // define the local list for ad->carousel_ios_deep_links
    list_t *carousel_ios_deep_linksList = NULL;

    // define the local variable for ad->carting_platform_type
    int *carting_platform_type_local_var = NULL;

    // define the local list for ad->carting_products
    list_t *carting_productsList = NULL;

    char *click_tracking_url_local_str = NULL;

    char *collection_items_destination_url_template_local_str = NULL;

    // define the local variable for ad->collections_header_type
    ad_collections_header_type_t *collections_header_type_local_nonprim = NULL;

    // define the local variable for ad->created_time
    int *created_time_local_var = NULL;

    // define the local variable for ad->creative_type
    pinterest_rest_api_creative_type__e creative_type_local_nonprim = 0;

    // define the local variable for ad->customizable_cta_type
    pinterest_rest_api_customizable_cta_type__e customizable_cta_type_local_nonprim = 0;

    char *destination_url_local_str = NULL;

    // define the local variable for ad->disclosure_type
    pinterest_rest_api_disclosure_type__e disclosure_type_local_nonprim = 0;

    char *disclosure_url_local_str = NULL;

    // define the local variable for ad->grid_click_type
    pinterest_rest_api_grid_click_type__e grid_click_type_local_nonprim = 0;

    char *id_local_str = NULL;

    char *ios_deep_link_local_str = NULL;

    // define the local variable for ad->is_carting
    int *is_carting_local_var = NULL;

    // define the local variable for ad->is_collage_accepted_terms
    int *is_collage_accepted_terms_local_var = NULL;

    // define the local variable for ad->is_collage_single_destination
    int *is_collage_single_destination_local_var = NULL;

    // define the local variable for ad->is_pin_deleted
    int *is_pin_deleted_local_var = NULL;

    // define the local variable for ad->is_removable
    int *is_removable_local_var = NULL;

    char *lead_form_id_local_str = NULL;

    char *name_local_str = NULL;

    char *pin_id_local_str = NULL;

    // define the local variable for ad->quiz_pin_data
    quiz_pin_data_t *quiz_pin_data_local_nonprim = NULL;

    // define the local list for ad->rejected_reasons
    list_t *rejected_reasonsList = NULL;

    // define the local list for ad->rejection_labels
    list_t *rejection_labelsList = NULL;

    // define the local variable for ad->review_status
    ad_review_status_t *review_status_local_nonprim = NULL;

    // define the local variable for ad->status
    pinterest_rest_api_entity_status__e status_local_nonprim = 0;

    // define the local variable for ad->summary_status
    pin_promotion_summary_status_t *summary_status_local_nonprim = NULL;

    // define the local variable for ad->tracking_urls
    tracking_urls_t *tracking_urls_local_nonprim = NULL;

    char *type_local_str = NULL;

    // define the local variable for ad->updated_time
    int *updated_time_local_var = NULL;

    char *view_tracking_url_local_str = NULL;

    // ad->ad_account_id
    cJSON *ad_account_id = cJSON_GetObjectItemCaseSensitive(adJSON, "ad_account_id");
    if (cJSON_IsNull(ad_account_id)) {
        ad_account_id = NULL;
    }
    if (!ad_account_id) {
        goto end;
    }

    
    if(!cJSON_IsString(ad_account_id))
    {
    goto end; //String
    }

    // ad->ad_group_id
    cJSON *ad_group_id = cJSON_GetObjectItemCaseSensitive(adJSON, "ad_group_id");
    if (cJSON_IsNull(ad_group_id)) {
        ad_group_id = NULL;
    }
    if (!ad_group_id) {
        goto end;
    }

    
    if(!cJSON_IsString(ad_group_id))
    {
    goto end; //String
    }

    // ad->android_deep_link
    cJSON *android_deep_link = cJSON_GetObjectItemCaseSensitive(adJSON, "android_deep_link");
    if (cJSON_IsNull(android_deep_link)) {
        android_deep_link = NULL;
    }
    if (android_deep_link) { 
    if(!cJSON_IsString(android_deep_link) && !cJSON_IsNull(android_deep_link))
    {
    goto end; //String
    }
    }

    // ad->campaign_id
    cJSON *campaign_id = cJSON_GetObjectItemCaseSensitive(adJSON, "campaign_id");
    if (cJSON_IsNull(campaign_id)) {
        campaign_id = NULL;
    }
    if (!campaign_id) {
        goto end;
    }

    
    if(!cJSON_IsString(campaign_id))
    {
    goto end; //String
    }

    // ad->carousel_android_deep_links
    cJSON *carousel_android_deep_links = cJSON_GetObjectItemCaseSensitive(adJSON, "carousel_android_deep_links");
    if (cJSON_IsNull(carousel_android_deep_links)) {
        carousel_android_deep_links = NULL;
    }
    if (carousel_android_deep_links) { 
    cJSON *carousel_android_deep_links_local = NULL;
    if(!cJSON_IsArray(carousel_android_deep_links)) {
        goto end;//primitive container
    }
    carousel_android_deep_linksList = list_createList();

    cJSON_ArrayForEach(carousel_android_deep_links_local, carousel_android_deep_links)
    {
        if(!cJSON_IsString(carousel_android_deep_links_local))
        {
            goto end;
        }
        list_addElement(carousel_android_deep_linksList , strdup(carousel_android_deep_links_local->valuestring));
    }
    }

    // ad->carousel_destination_urls
    cJSON *carousel_destination_urls = cJSON_GetObjectItemCaseSensitive(adJSON, "carousel_destination_urls");
    if (cJSON_IsNull(carousel_destination_urls)) {
        carousel_destination_urls = NULL;
    }
    if (carousel_destination_urls) { 
    cJSON *carousel_destination_urls_local = NULL;
    if(!cJSON_IsArray(carousel_destination_urls)) {
        goto end;//primitive container
    }
    carousel_destination_urlsList = list_createList();

    cJSON_ArrayForEach(carousel_destination_urls_local, carousel_destination_urls)
    {
        if(!cJSON_IsString(carousel_destination_urls_local))
        {
            goto end;
        }
        list_addElement(carousel_destination_urlsList , strdup(carousel_destination_urls_local->valuestring));
    }
    }

    // ad->carousel_ios_deep_links
    cJSON *carousel_ios_deep_links = cJSON_GetObjectItemCaseSensitive(adJSON, "carousel_ios_deep_links");
    if (cJSON_IsNull(carousel_ios_deep_links)) {
        carousel_ios_deep_links = NULL;
    }
    if (carousel_ios_deep_links) { 
    cJSON *carousel_ios_deep_links_local = NULL;
    if(!cJSON_IsArray(carousel_ios_deep_links)) {
        goto end;//primitive container
    }
    carousel_ios_deep_linksList = list_createList();

    cJSON_ArrayForEach(carousel_ios_deep_links_local, carousel_ios_deep_links)
    {
        if(!cJSON_IsString(carousel_ios_deep_links_local))
        {
            goto end;
        }
        list_addElement(carousel_ios_deep_linksList , strdup(carousel_ios_deep_links_local->valuestring));
    }
    }

    // ad->carting_platform_type
    cJSON *carting_platform_type = cJSON_GetObjectItemCaseSensitive(adJSON, "carting_platform_type");
    if (cJSON_IsNull(carting_platform_type)) {
        carting_platform_type = NULL;
    }
    if (carting_platform_type) { 
    if(!cJSON_IsNumber(carting_platform_type))
    {
    goto end; //Numeric
    }
    carting_platform_type_local_var = malloc(sizeof(int));
    if(!carting_platform_type_local_var)
    {
        goto end;
    }
    *carting_platform_type_local_var = carting_platform_type->valuedouble;
    }

    // ad->carting_products
    cJSON *carting_products = cJSON_GetObjectItemCaseSensitive(adJSON, "carting_products");
    if (cJSON_IsNull(carting_products)) {
        carting_products = NULL;
    }
    if (carting_products) { 
    cJSON *carting_products_local_nonprimitive = NULL;
    if(!cJSON_IsArray(carting_products)){
        goto end; //nonprimitive container
    }

    carting_productsList = list_createList();

    cJSON_ArrayForEach(carting_products_local_nonprimitive,carting_products )
    {
        if(!cJSON_IsObject(carting_products_local_nonprimitive)){
            goto end;
        }
        carting_product_t *carting_productsItem = carting_product_parseFromJSON(carting_products_local_nonprimitive);

        list_addElement(carting_productsList, carting_productsItem);
    }
    }

    // ad->click_tracking_url
    cJSON *click_tracking_url = cJSON_GetObjectItemCaseSensitive(adJSON, "click_tracking_url");
    if (cJSON_IsNull(click_tracking_url)) {
        click_tracking_url = NULL;
    }
    if (click_tracking_url) { 
    if(!cJSON_IsString(click_tracking_url) && !cJSON_IsNull(click_tracking_url))
    {
    goto end; //String
    }
    }

    // ad->collection_items_destination_url_template
    cJSON *collection_items_destination_url_template = cJSON_GetObjectItemCaseSensitive(adJSON, "collection_items_destination_url_template");
    if (cJSON_IsNull(collection_items_destination_url_template)) {
        collection_items_destination_url_template = NULL;
    }
    if (collection_items_destination_url_template) { 
    if(!cJSON_IsString(collection_items_destination_url_template) && !cJSON_IsNull(collection_items_destination_url_template))
    {
    goto end; //String
    }
    }

    // ad->collections_header_type
    cJSON *collections_header_type = cJSON_GetObjectItemCaseSensitive(adJSON, "collections_header_type");
    if (cJSON_IsNull(collections_header_type)) {
        collections_header_type = NULL;
    }
    if (collections_header_type) { 
    collections_header_type_local_nonprim = ad_collections_header_type_parseFromJSON(collections_header_type); //custom
    }

    // ad->created_time
    cJSON *created_time = cJSON_GetObjectItemCaseSensitive(adJSON, "created_time");
    if (cJSON_IsNull(created_time)) {
        created_time = NULL;
    }
    if (created_time) { 
    if(!cJSON_IsNumber(created_time))
    {
    goto end; //Numeric
    }
    created_time_local_var = malloc(sizeof(int));
    if(!created_time_local_var)
    {
        goto end;
    }
    *created_time_local_var = created_time->valuedouble;
    }

    // ad->creative_type
    cJSON *creative_type = cJSON_GetObjectItemCaseSensitive(adJSON, "creative_type");
    if (cJSON_IsNull(creative_type)) {
        creative_type = NULL;
    }
    if (!creative_type) {
        goto end;
    }

    
    creative_type_local_nonprim = creative_type_parseFromJSON(creative_type); //custom

    // ad->customizable_cta_type
    cJSON *customizable_cta_type = cJSON_GetObjectItemCaseSensitive(adJSON, "customizable_cta_type");
    if (cJSON_IsNull(customizable_cta_type)) {
        customizable_cta_type = NULL;
    }
    if (customizable_cta_type) { 
    customizable_cta_type_local_nonprim = customizable_cta_type_parseFromJSON(customizable_cta_type); //custom
    }

    // ad->destination_url
    cJSON *destination_url = cJSON_GetObjectItemCaseSensitive(adJSON, "destination_url");
    if (cJSON_IsNull(destination_url)) {
        destination_url = NULL;
    }
    if (destination_url) { 
    if(!cJSON_IsString(destination_url) && !cJSON_IsNull(destination_url))
    {
    goto end; //String
    }
    }

    // ad->disclosure_type
    cJSON *disclosure_type = cJSON_GetObjectItemCaseSensitive(adJSON, "disclosure_type");
    if (cJSON_IsNull(disclosure_type)) {
        disclosure_type = NULL;
    }
    if (disclosure_type) { 
    disclosure_type_local_nonprim = disclosure_type_parseFromJSON(disclosure_type); //custom
    }

    // ad->disclosure_url
    cJSON *disclosure_url = cJSON_GetObjectItemCaseSensitive(adJSON, "disclosure_url");
    if (cJSON_IsNull(disclosure_url)) {
        disclosure_url = NULL;
    }
    if (disclosure_url) { 
    if(!cJSON_IsString(disclosure_url) && !cJSON_IsNull(disclosure_url))
    {
    goto end; //String
    }
    }

    // ad->grid_click_type
    cJSON *grid_click_type = cJSON_GetObjectItemCaseSensitive(adJSON, "grid_click_type");
    if (cJSON_IsNull(grid_click_type)) {
        grid_click_type = NULL;
    }
    if (grid_click_type) { 
    grid_click_type_local_nonprim = grid_click_type_parseFromJSON(grid_click_type); //custom
    }

    // ad->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(adJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // ad->ios_deep_link
    cJSON *ios_deep_link = cJSON_GetObjectItemCaseSensitive(adJSON, "ios_deep_link");
    if (cJSON_IsNull(ios_deep_link)) {
        ios_deep_link = NULL;
    }
    if (ios_deep_link) { 
    if(!cJSON_IsString(ios_deep_link) && !cJSON_IsNull(ios_deep_link))
    {
    goto end; //String
    }
    }

    // ad->is_carting
    cJSON *is_carting = cJSON_GetObjectItemCaseSensitive(adJSON, "is_carting");
    if (cJSON_IsNull(is_carting)) {
        is_carting = NULL;
    }
    if (is_carting) { 
    if(!cJSON_IsBool(is_carting))
    {
    goto end; //Bool
    }
    is_carting_local_var = malloc(sizeof(int));
    if(!is_carting_local_var)
    {
        goto end;
    }
    *is_carting_local_var = is_carting->valueint;
    }

    // ad->is_collage_accepted_terms
    cJSON *is_collage_accepted_terms = cJSON_GetObjectItemCaseSensitive(adJSON, "is_collage_accepted_terms");
    if (cJSON_IsNull(is_collage_accepted_terms)) {
        is_collage_accepted_terms = NULL;
    }
    if (is_collage_accepted_terms) { 
    if(!cJSON_IsBool(is_collage_accepted_terms))
    {
    goto end; //Bool
    }
    is_collage_accepted_terms_local_var = malloc(sizeof(int));
    if(!is_collage_accepted_terms_local_var)
    {
        goto end;
    }
    *is_collage_accepted_terms_local_var = is_collage_accepted_terms->valueint;
    }

    // ad->is_collage_single_destination
    cJSON *is_collage_single_destination = cJSON_GetObjectItemCaseSensitive(adJSON, "is_collage_single_destination");
    if (cJSON_IsNull(is_collage_single_destination)) {
        is_collage_single_destination = NULL;
    }
    if (is_collage_single_destination) { 
    if(!cJSON_IsBool(is_collage_single_destination))
    {
    goto end; //Bool
    }
    is_collage_single_destination_local_var = malloc(sizeof(int));
    if(!is_collage_single_destination_local_var)
    {
        goto end;
    }
    *is_collage_single_destination_local_var = is_collage_single_destination->valueint;
    }

    // ad->is_pin_deleted
    cJSON *is_pin_deleted = cJSON_GetObjectItemCaseSensitive(adJSON, "is_pin_deleted");
    if (cJSON_IsNull(is_pin_deleted)) {
        is_pin_deleted = NULL;
    }
    if (is_pin_deleted) { 
    if(!cJSON_IsBool(is_pin_deleted))
    {
    goto end; //Bool
    }
    is_pin_deleted_local_var = malloc(sizeof(int));
    if(!is_pin_deleted_local_var)
    {
        goto end;
    }
    *is_pin_deleted_local_var = is_pin_deleted->valueint;
    }

    // ad->is_removable
    cJSON *is_removable = cJSON_GetObjectItemCaseSensitive(adJSON, "is_removable");
    if (cJSON_IsNull(is_removable)) {
        is_removable = NULL;
    }
    if (is_removable) { 
    if(!cJSON_IsBool(is_removable))
    {
    goto end; //Bool
    }
    is_removable_local_var = malloc(sizeof(int));
    if(!is_removable_local_var)
    {
        goto end;
    }
    *is_removable_local_var = is_removable->valueint;
    }

    // ad->lead_form_id
    cJSON *lead_form_id = cJSON_GetObjectItemCaseSensitive(adJSON, "lead_form_id");
    if (cJSON_IsNull(lead_form_id)) {
        lead_form_id = NULL;
    }
    if (lead_form_id) { 
    if(!cJSON_IsString(lead_form_id) && !cJSON_IsNull(lead_form_id))
    {
    goto end; //String
    }
    }

    // ad->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(adJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // ad->pin_id
    cJSON *pin_id = cJSON_GetObjectItemCaseSensitive(adJSON, "pin_id");
    if (cJSON_IsNull(pin_id)) {
        pin_id = NULL;
    }
    if (!pin_id) {
        goto end;
    }

    
    if(!cJSON_IsString(pin_id))
    {
    goto end; //String
    }

    // ad->quiz_pin_data
    cJSON *quiz_pin_data = cJSON_GetObjectItemCaseSensitive(adJSON, "quiz_pin_data");
    if (cJSON_IsNull(quiz_pin_data)) {
        quiz_pin_data = NULL;
    }
    if (quiz_pin_data) { 
    quiz_pin_data_local_nonprim = quiz_pin_data_parseFromJSON(quiz_pin_data); //nonprimitive
    }

    // ad->rejected_reasons
    cJSON *rejected_reasons = cJSON_GetObjectItemCaseSensitive(adJSON, "rejected_reasons");
    if (cJSON_IsNull(rejected_reasons)) {
        rejected_reasons = NULL;
    }
    if (!rejected_reasons) {
        goto end;
    }

    
    cJSON *rejected_reasons_local_nonprimitive = NULL;
    if(!cJSON_IsArray(rejected_reasons)){
        goto end; //nonprimitive container
    }

    rejected_reasonsList = list_createList();

    cJSON_ArrayForEach(rejected_reasons_local_nonprimitive,rejected_reasons )
    {
        if(!cJSON_IsObject(rejected_reasons_local_nonprimitive)){
            goto end;
        }
        ad_ad_disapproval_reasons_e rejected_reasonsItem = ad_disapproval_reasons_parseFromJSON(rejected_reasons_local_nonprimitive);

        list_addElement(rejected_reasonsList, (void *)rejected_reasonsItem);
    }

    // ad->rejection_labels
    cJSON *rejection_labels = cJSON_GetObjectItemCaseSensitive(adJSON, "rejection_labels");
    if (cJSON_IsNull(rejection_labels)) {
        rejection_labels = NULL;
    }
    if (!rejection_labels) {
        goto end;
    }

    
    cJSON *rejection_labels_local = NULL;
    if(!cJSON_IsArray(rejection_labels)) {
        goto end;//primitive container
    }
    rejection_labelsList = list_createList();

    cJSON_ArrayForEach(rejection_labels_local, rejection_labels)
    {
        if(!cJSON_IsString(rejection_labels_local))
        {
            goto end;
        }
        list_addElement(rejection_labelsList , strdup(rejection_labels_local->valuestring));
    }

    // ad->review_status
    cJSON *review_status = cJSON_GetObjectItemCaseSensitive(adJSON, "review_status");
    if (cJSON_IsNull(review_status)) {
        review_status = NULL;
    }
    if (!review_status) {
        goto end;
    }

    
    review_status_local_nonprim = ad_review_status_parseFromJSON(review_status); //custom

    // ad->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(adJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    status_local_nonprim = entity_status_parseFromJSON(status); //custom
    }

    // ad->summary_status
    cJSON *summary_status = cJSON_GetObjectItemCaseSensitive(adJSON, "summary_status");
    if (cJSON_IsNull(summary_status)) {
        summary_status = NULL;
    }
    if (!summary_status) {
        goto end;
    }

    
    summary_status_local_nonprim = pin_promotion_summary_status_parseFromJSON(summary_status); //custom

    // ad->tracking_urls
    cJSON *tracking_urls = cJSON_GetObjectItemCaseSensitive(adJSON, "tracking_urls");
    if (cJSON_IsNull(tracking_urls)) {
        tracking_urls = NULL;
    }
    if (tracking_urls) { 
    tracking_urls_local_nonprim = tracking_urls_parseFromJSON(tracking_urls); //nonprimitive
    }

    // ad->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(adJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    
    if(!cJSON_IsString(type))
    {
    goto end; //String
    }

    // ad->updated_time
    cJSON *updated_time = cJSON_GetObjectItemCaseSensitive(adJSON, "updated_time");
    if (cJSON_IsNull(updated_time)) {
        updated_time = NULL;
    }
    if (updated_time) { 
    if(!cJSON_IsNumber(updated_time))
    {
    goto end; //Numeric
    }
    updated_time_local_var = malloc(sizeof(int));
    if(!updated_time_local_var)
    {
        goto end;
    }
    *updated_time_local_var = updated_time->valuedouble;
    }

    // ad->view_tracking_url
    cJSON *view_tracking_url = cJSON_GetObjectItemCaseSensitive(adJSON, "view_tracking_url");
    if (cJSON_IsNull(view_tracking_url)) {
        view_tracking_url = NULL;
    }
    if (view_tracking_url) { 
    if(!cJSON_IsString(view_tracking_url) && !cJSON_IsNull(view_tracking_url))
    {
    goto end; //String
    }
    }


    if (ad_account_id && !cJSON_IsNull(ad_account_id)) ad_account_id_local_str = strdup(ad_account_id->valuestring);
    if (ad_group_id && !cJSON_IsNull(ad_group_id)) ad_group_id_local_str = strdup(ad_group_id->valuestring);
    if (android_deep_link && !cJSON_IsNull(android_deep_link)) android_deep_link_local_str = strdup(android_deep_link->valuestring);
    if (campaign_id && !cJSON_IsNull(campaign_id)) campaign_id_local_str = strdup(campaign_id->valuestring);
    if (click_tracking_url && !cJSON_IsNull(click_tracking_url)) click_tracking_url_local_str = strdup(click_tracking_url->valuestring);
    if (collection_items_destination_url_template && !cJSON_IsNull(collection_items_destination_url_template)) collection_items_destination_url_template_local_str = strdup(collection_items_destination_url_template->valuestring);
    if (destination_url && !cJSON_IsNull(destination_url)) destination_url_local_str = strdup(destination_url->valuestring);
    if (disclosure_url && !cJSON_IsNull(disclosure_url)) disclosure_url_local_str = strdup(disclosure_url->valuestring);
    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (ios_deep_link && !cJSON_IsNull(ios_deep_link)) ios_deep_link_local_str = strdup(ios_deep_link->valuestring);
    if (lead_form_id && !cJSON_IsNull(lead_form_id)) lead_form_id_local_str = strdup(lead_form_id->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);
    if (pin_id && !cJSON_IsNull(pin_id)) pin_id_local_str = strdup(pin_id->valuestring);
    if (type && !cJSON_IsNull(type)) type_local_str = strdup(type->valuestring);
    if (view_tracking_url && !cJSON_IsNull(view_tracking_url)) view_tracking_url_local_str = strdup(view_tracking_url->valuestring);

    ad_local_var = ad_create_internal (
        ad_account_id_local_str,
        ad_group_id_local_str,
        android_deep_link_local_str,
        campaign_id_local_str,
        carousel_android_deep_links ? carousel_android_deep_linksList : NULL,
        carousel_destination_urls ? carousel_destination_urlsList : NULL,
        carousel_ios_deep_links ? carousel_ios_deep_linksList : NULL,
        carting_platform_type_local_var,
        carting_products ? carting_productsList : NULL,
        click_tracking_url_local_str,
        collection_items_destination_url_template_local_str,
        collections_header_type ? collections_header_type_local_nonprim : NULL,
        created_time_local_var,
        creative_type_local_nonprim,
        customizable_cta_type ? customizable_cta_type_local_nonprim : 0,
        destination_url_local_str,
        disclosure_type ? disclosure_type_local_nonprim : 0,
        disclosure_url_local_str,
        grid_click_type ? grid_click_type_local_nonprim : 0,
        id_local_str,
        ios_deep_link_local_str,
        is_carting_local_var,
        is_collage_accepted_terms_local_var,
        is_collage_single_destination_local_var,
        is_pin_deleted_local_var,
        is_removable_local_var,
        lead_form_id_local_str,
        name_local_str,
        pin_id_local_str,
        quiz_pin_data ? quiz_pin_data_local_nonprim : NULL,
        rejected_reasonsList,
        rejection_labelsList,
        review_status_local_nonprim,
        status ? status_local_nonprim : 0,
        summary_status_local_nonprim,
        tracking_urls ? tracking_urls_local_nonprim : NULL,
        type_local_str,
        updated_time_local_var,
        view_tracking_url_local_str
        );

    if (!ad_local_var) {
        goto end;
    }

    return ad_local_var;
end:
    if (ad_account_id_local_str) {
        free(ad_account_id_local_str);
        ad_account_id_local_str = NULL;
    }
    if (ad_group_id_local_str) {
        free(ad_group_id_local_str);
        ad_group_id_local_str = NULL;
    }
    if (android_deep_link_local_str) {
        free(android_deep_link_local_str);
        android_deep_link_local_str = NULL;
    }
    if (campaign_id_local_str) {
        free(campaign_id_local_str);
        campaign_id_local_str = NULL;
    }
    if (carousel_android_deep_linksList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, carousel_android_deep_linksList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(carousel_android_deep_linksList);
        carousel_android_deep_linksList = NULL;
    }
    if (carousel_destination_urlsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, carousel_destination_urlsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(carousel_destination_urlsList);
        carousel_destination_urlsList = NULL;
    }
    if (carousel_ios_deep_linksList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, carousel_ios_deep_linksList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(carousel_ios_deep_linksList);
        carousel_ios_deep_linksList = NULL;
    }
    if (carting_platform_type_local_var) {
        free(carting_platform_type_local_var);
        carting_platform_type_local_var = NULL;
    }
    if (carting_productsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, carting_productsList) {
            carting_product_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(carting_productsList);
        carting_productsList = NULL;
    }
    if (click_tracking_url_local_str) {
        free(click_tracking_url_local_str);
        click_tracking_url_local_str = NULL;
    }
    if (collection_items_destination_url_template_local_str) {
        free(collection_items_destination_url_template_local_str);
        collection_items_destination_url_template_local_str = NULL;
    }
    if (collections_header_type_local_nonprim) {
        ad_collections_header_type_free(collections_header_type_local_nonprim);
        collections_header_type_local_nonprim = NULL;
    }
    if (created_time_local_var) {
        free(created_time_local_var);
        created_time_local_var = NULL;
    }
    if (creative_type_local_nonprim) {
        creative_type_local_nonprim = 0;
    }
    if (customizable_cta_type_local_nonprim) {
        customizable_cta_type_local_nonprim = 0;
    }
    if (destination_url_local_str) {
        free(destination_url_local_str);
        destination_url_local_str = NULL;
    }
    if (disclosure_type_local_nonprim) {
        disclosure_type_local_nonprim = 0;
    }
    if (disclosure_url_local_str) {
        free(disclosure_url_local_str);
        disclosure_url_local_str = NULL;
    }
    if (grid_click_type_local_nonprim) {
        grid_click_type_local_nonprim = 0;
    }
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (ios_deep_link_local_str) {
        free(ios_deep_link_local_str);
        ios_deep_link_local_str = NULL;
    }
    if (is_carting_local_var) {
        free(is_carting_local_var);
        is_carting_local_var = NULL;
    }
    if (is_collage_accepted_terms_local_var) {
        free(is_collage_accepted_terms_local_var);
        is_collage_accepted_terms_local_var = NULL;
    }
    if (is_collage_single_destination_local_var) {
        free(is_collage_single_destination_local_var);
        is_collage_single_destination_local_var = NULL;
    }
    if (is_pin_deleted_local_var) {
        free(is_pin_deleted_local_var);
        is_pin_deleted_local_var = NULL;
    }
    if (is_removable_local_var) {
        free(is_removable_local_var);
        is_removable_local_var = NULL;
    }
    if (lead_form_id_local_str) {
        free(lead_form_id_local_str);
        lead_form_id_local_str = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (pin_id_local_str) {
        free(pin_id_local_str);
        pin_id_local_str = NULL;
    }
    if (quiz_pin_data_local_nonprim) {
        quiz_pin_data_free(quiz_pin_data_local_nonprim);
        quiz_pin_data_local_nonprim = NULL;
    }
    if (rejected_reasonsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, rejected_reasonsList) {
            ad_disapproval_reasons_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(rejected_reasonsList);
        rejected_reasonsList = NULL;
    }
    if (rejection_labelsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, rejection_labelsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(rejection_labelsList);
        rejection_labelsList = NULL;
    }
    if (review_status_local_nonprim) {
        ad_review_status_free(review_status_local_nonprim);
        review_status_local_nonprim = NULL;
    }
    if (status_local_nonprim) {
        status_local_nonprim = 0;
    }
    if (summary_status_local_nonprim) {
        pin_promotion_summary_status_free(summary_status_local_nonprim);
        summary_status_local_nonprim = NULL;
    }
    if (tracking_urls_local_nonprim) {
        tracking_urls_free(tracking_urls_local_nonprim);
        tracking_urls_local_nonprim = NULL;
    }
    if (type_local_str) {
        free(type_local_str);
        type_local_str = NULL;
    }
    if (updated_time_local_var) {
        free(updated_time_local_var);
        updated_time_local_var = NULL;
    }
    if (view_tracking_url_local_str) {
        free(view_tracking_url_local_str);
        view_tracking_url_local_str = NULL;
    }
    return NULL;

}
