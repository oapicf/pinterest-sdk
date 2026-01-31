#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_response.h"


char* ad_response_rejected_reasons_ToString(pinterest_rest_api_ad_response_REJECTEDREASONS_e rejected_reasons) {
    char *rejected_reasonsArray[] =  { "NULL", "HASHTAGS", "PROMOTIONS_AND_PRICES", "TARGETING", "LANDING_PAGE", "CAPS_AND_SYMBOLS", "SHOCKING", "WEIGHT_LOSS", "PROHIBITED_PRODUCT", "AUTHENTICITY", "NUDITY", "CONFUSING_DESIGN", "URGENCY", "RATINGS", "APP", "ALCOHOL", "CONTESTS", "POLITICAL", "OTHER", "IMAGE", "NAR", "INCONSISTENT", "CLICKBAIT", "NO_DESCRIPTION", "LOW_QUALITY", "EXAGGERATED_CLAIMS", "PINTEREST_BRAND", "ALCOHOL_NO_SALE", "LANDING_PAGE_SPEED", "LANDING_PAGE_HARDWALL", "LANDING_PAGE_BROKEN", "LANDING_PAGE_QUALITY", "OUT_OF_STOCK", "IMAGE_LOW_QUALITY", "IMAGE_BUSY", "IMAGE_POORLY_EDITED", "IMAGE_BEFORE_AFTER", "UGC", "FAKE_BUTTONS", "WEAPONS", "SENSITIVE", "UNACCEPTABLE_BUSINESS", "SUSPICIOUS_CLAIMS", "PHARMA", "SUSPICIOUS_SUPPLEMENTS", "ILLEGAL_RECREATIONAL_DRUG", "LOW_QUALITY_LANDING_PAGE", "RESTRICTED_HEALTHCARE", "INCONSISTENT_LANG_FR" };
    return rejected_reasonsArray[rejected_reasons - 1];
}

pinterest_rest_api_ad_response_REJECTEDREASONS_e ad_response_rejected_reasons_FromString(char* rejected_reasons) {
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
char* ad_response_review_status_ToString(pinterest_rest_api_ad_response_REVIEWSTATUS_e review_status) {
    char* review_statusArray[] =  { "NULL", "OTHER", "PENDING", "REJECTED", "APPROVED" };
    return review_statusArray[review_status];
}

pinterest_rest_api_ad_response_REVIEWSTATUS_e ad_response_review_status_FromString(char* review_status){
    int stringToReturn = 0;
    char *review_statusArray[] =  { "NULL", "OTHER", "PENDING", "REJECTED", "APPROVED" };
    size_t sizeofArray = sizeof(review_statusArray) / sizeof(review_statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(review_status, review_statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static ad_response_t *ad_response_create_internal(
    char *ad_group_id,
    char *android_deep_link,
    list_t *carousel_android_deep_links,
    list_t *carousel_destination_urls,
    list_t *carousel_ios_deep_links,
    char *click_tracking_url,
    pinterest_rest_api_creative_type__e creative_type,
    pinterest_rest_api_customizable_cta_type__e customizable_cta_type,
    char *destination_url,
    pinterest_rest_api_disclosure_type__e disclosure_type,
    char *disclosure_url,
    pinterest_rest_api_grid_click_type__e grid_click_type,
    char *ios_deep_link,
    int is_pin_deleted,
    int is_removable,
    char *lead_form_id,
    char *name,
    quiz_pin_data_t *quiz_pin_data,
    pinterest_rest_api_entity_status__e status,
    tracking_urls_t *tracking_urls,
    char *view_tracking_url,
    char *pin_id,
    char *ad_account_id,
    char *campaign_id,
    char *collection_items_destination_url_template,
    int created_time,
    char *id,
    list_t *rejected_reasons,
    list_t *rejection_labels,
    pinterest_rest_api_ad_response_REVIEWSTATUS_e review_status,
    pin_promotion_summary_status_t *summary_status,
    char *type,
    int updated_time
    ) {
    ad_response_t *ad_response_local_var = malloc(sizeof(ad_response_t));
    if (!ad_response_local_var) {
        return NULL;
    }
    ad_response_local_var->ad_group_id = ad_group_id;
    ad_response_local_var->android_deep_link = android_deep_link;
    ad_response_local_var->carousel_android_deep_links = carousel_android_deep_links;
    ad_response_local_var->carousel_destination_urls = carousel_destination_urls;
    ad_response_local_var->carousel_ios_deep_links = carousel_ios_deep_links;
    ad_response_local_var->click_tracking_url = click_tracking_url;
    ad_response_local_var->creative_type = creative_type;
    ad_response_local_var->customizable_cta_type = customizable_cta_type;
    ad_response_local_var->destination_url = destination_url;
    ad_response_local_var->disclosure_type = disclosure_type;
    ad_response_local_var->disclosure_url = disclosure_url;
    ad_response_local_var->grid_click_type = grid_click_type;
    ad_response_local_var->ios_deep_link = ios_deep_link;
    ad_response_local_var->is_pin_deleted = is_pin_deleted;
    ad_response_local_var->is_removable = is_removable;
    ad_response_local_var->lead_form_id = lead_form_id;
    ad_response_local_var->name = name;
    ad_response_local_var->quiz_pin_data = quiz_pin_data;
    ad_response_local_var->status = status;
    ad_response_local_var->tracking_urls = tracking_urls;
    ad_response_local_var->view_tracking_url = view_tracking_url;
    ad_response_local_var->pin_id = pin_id;
    ad_response_local_var->ad_account_id = ad_account_id;
    ad_response_local_var->campaign_id = campaign_id;
    ad_response_local_var->collection_items_destination_url_template = collection_items_destination_url_template;
    ad_response_local_var->created_time = created_time;
    ad_response_local_var->id = id;
    ad_response_local_var->rejected_reasons = rejected_reasons;
    ad_response_local_var->rejection_labels = rejection_labels;
    ad_response_local_var->review_status = review_status;
    ad_response_local_var->summary_status = summary_status;
    ad_response_local_var->type = type;
    ad_response_local_var->updated_time = updated_time;

    ad_response_local_var->_library_owned = 1;
    return ad_response_local_var;
}

__attribute__((deprecated)) ad_response_t *ad_response_create(
    char *ad_group_id,
    char *android_deep_link,
    list_t *carousel_android_deep_links,
    list_t *carousel_destination_urls,
    list_t *carousel_ios_deep_links,
    char *click_tracking_url,
    pinterest_rest_api_creative_type__e creative_type,
    pinterest_rest_api_customizable_cta_type__e customizable_cta_type,
    char *destination_url,
    pinterest_rest_api_disclosure_type__e disclosure_type,
    char *disclosure_url,
    pinterest_rest_api_grid_click_type__e grid_click_type,
    char *ios_deep_link,
    int is_pin_deleted,
    int is_removable,
    char *lead_form_id,
    char *name,
    quiz_pin_data_t *quiz_pin_data,
    pinterest_rest_api_entity_status__e status,
    tracking_urls_t *tracking_urls,
    char *view_tracking_url,
    char *pin_id,
    char *ad_account_id,
    char *campaign_id,
    char *collection_items_destination_url_template,
    int created_time,
    char *id,
    list_t *rejected_reasons,
    list_t *rejection_labels,
    pinterest_rest_api_ad_response_REVIEWSTATUS_e review_status,
    pin_promotion_summary_status_t *summary_status,
    char *type,
    int updated_time
    ) {
    return ad_response_create_internal (
        ad_group_id,
        android_deep_link,
        carousel_android_deep_links,
        carousel_destination_urls,
        carousel_ios_deep_links,
        click_tracking_url,
        creative_type,
        customizable_cta_type,
        destination_url,
        disclosure_type,
        disclosure_url,
        grid_click_type,
        ios_deep_link,
        is_pin_deleted,
        is_removable,
        lead_form_id,
        name,
        quiz_pin_data,
        status,
        tracking_urls,
        view_tracking_url,
        pin_id,
        ad_account_id,
        campaign_id,
        collection_items_destination_url_template,
        created_time,
        id,
        rejected_reasons,
        rejection_labels,
        review_status,
        summary_status,
        type,
        updated_time
        );
}

void ad_response_free(ad_response_t *ad_response) {
    if(NULL == ad_response){
        return ;
    }
    if(ad_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ad_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ad_response->ad_group_id) {
        free(ad_response->ad_group_id);
        ad_response->ad_group_id = NULL;
    }
    if (ad_response->android_deep_link) {
        free(ad_response->android_deep_link);
        ad_response->android_deep_link = NULL;
    }
    if (ad_response->carousel_android_deep_links) {
        list_ForEach(listEntry, ad_response->carousel_android_deep_links) {
            free(listEntry->data);
        }
        list_freeList(ad_response->carousel_android_deep_links);
        ad_response->carousel_android_deep_links = NULL;
    }
    if (ad_response->carousel_destination_urls) {
        list_ForEach(listEntry, ad_response->carousel_destination_urls) {
            free(listEntry->data);
        }
        list_freeList(ad_response->carousel_destination_urls);
        ad_response->carousel_destination_urls = NULL;
    }
    if (ad_response->carousel_ios_deep_links) {
        list_ForEach(listEntry, ad_response->carousel_ios_deep_links) {
            free(listEntry->data);
        }
        list_freeList(ad_response->carousel_ios_deep_links);
        ad_response->carousel_ios_deep_links = NULL;
    }
    if (ad_response->click_tracking_url) {
        free(ad_response->click_tracking_url);
        ad_response->click_tracking_url = NULL;
    }
    if (ad_response->destination_url) {
        free(ad_response->destination_url);
        ad_response->destination_url = NULL;
    }
    if (ad_response->disclosure_url) {
        free(ad_response->disclosure_url);
        ad_response->disclosure_url = NULL;
    }
    if (ad_response->ios_deep_link) {
        free(ad_response->ios_deep_link);
        ad_response->ios_deep_link = NULL;
    }
    if (ad_response->lead_form_id) {
        free(ad_response->lead_form_id);
        ad_response->lead_form_id = NULL;
    }
    if (ad_response->name) {
        free(ad_response->name);
        ad_response->name = NULL;
    }
    if (ad_response->quiz_pin_data) {
        quiz_pin_data_free(ad_response->quiz_pin_data);
        ad_response->quiz_pin_data = NULL;
    }
    if (ad_response->tracking_urls) {
        tracking_urls_free(ad_response->tracking_urls);
        ad_response->tracking_urls = NULL;
    }
    if (ad_response->view_tracking_url) {
        free(ad_response->view_tracking_url);
        ad_response->view_tracking_url = NULL;
    }
    if (ad_response->pin_id) {
        free(ad_response->pin_id);
        ad_response->pin_id = NULL;
    }
    if (ad_response->ad_account_id) {
        free(ad_response->ad_account_id);
        ad_response->ad_account_id = NULL;
    }
    if (ad_response->campaign_id) {
        free(ad_response->campaign_id);
        ad_response->campaign_id = NULL;
    }
    if (ad_response->collection_items_destination_url_template) {
        free(ad_response->collection_items_destination_url_template);
        ad_response->collection_items_destination_url_template = NULL;
    }
    if (ad_response->id) {
        free(ad_response->id);
        ad_response->id = NULL;
    }
    if (ad_response->rejected_reasons) {
        list_ForEach(listEntry, ad_response->rejected_reasons) {
            free(listEntry->data);
        }
        list_freeList(ad_response->rejected_reasons);
        ad_response->rejected_reasons = NULL;
    }
    if (ad_response->rejection_labels) {
        list_ForEach(listEntry, ad_response->rejection_labels) {
            free(listEntry->data);
        }
        list_freeList(ad_response->rejection_labels);
        ad_response->rejection_labels = NULL;
    }
    if (ad_response->summary_status) {
        pin_promotion_summary_status_free(ad_response->summary_status);
        ad_response->summary_status = NULL;
    }
    if (ad_response->type) {
        free(ad_response->type);
        ad_response->type = NULL;
    }
    free(ad_response);
}

cJSON *ad_response_convertToJSON(ad_response_t *ad_response) {
    cJSON *item = cJSON_CreateObject();

    // ad_response->ad_group_id
    if(ad_response->ad_group_id) {
    if(cJSON_AddStringToObject(item, "ad_group_id", ad_response->ad_group_id) == NULL) {
    goto fail; //String
    }
    }


    // ad_response->android_deep_link
    if(ad_response->android_deep_link) {
    if(cJSON_AddStringToObject(item, "android_deep_link", ad_response->android_deep_link) == NULL) {
    goto fail; //String
    }
    }


    // ad_response->carousel_android_deep_links
    if(ad_response->carousel_android_deep_links) {
    cJSON *carousel_android_deep_links = cJSON_AddArrayToObject(item, "carousel_android_deep_links");
    if(carousel_android_deep_links == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *carousel_android_deep_linksListEntry;
    list_ForEach(carousel_android_deep_linksListEntry, ad_response->carousel_android_deep_links) {
    if(cJSON_AddStringToObject(carousel_android_deep_links, "", carousel_android_deep_linksListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // ad_response->carousel_destination_urls
    if(ad_response->carousel_destination_urls) {
    cJSON *carousel_destination_urls = cJSON_AddArrayToObject(item, "carousel_destination_urls");
    if(carousel_destination_urls == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *carousel_destination_urlsListEntry;
    list_ForEach(carousel_destination_urlsListEntry, ad_response->carousel_destination_urls) {
    if(cJSON_AddStringToObject(carousel_destination_urls, "", carousel_destination_urlsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // ad_response->carousel_ios_deep_links
    if(ad_response->carousel_ios_deep_links) {
    cJSON *carousel_ios_deep_links = cJSON_AddArrayToObject(item, "carousel_ios_deep_links");
    if(carousel_ios_deep_links == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *carousel_ios_deep_linksListEntry;
    list_ForEach(carousel_ios_deep_linksListEntry, ad_response->carousel_ios_deep_links) {
    if(cJSON_AddStringToObject(carousel_ios_deep_links, "", carousel_ios_deep_linksListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // ad_response->click_tracking_url
    if(ad_response->click_tracking_url) {
    if(cJSON_AddStringToObject(item, "click_tracking_url", ad_response->click_tracking_url) == NULL) {
    goto fail; //String
    }
    }


    // ad_response->creative_type
    if(ad_response->creative_type != pinterest_rest_api_creative_type__NULL) {
    cJSON *creative_type_local_JSON = creative_type_convertToJSON(ad_response->creative_type);
    if(creative_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "creative_type", creative_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_response->customizable_cta_type
    if(ad_response->customizable_cta_type != pinterest_rest_api_customizable_cta_type__NULL) {
    cJSON *customizable_cta_type_local_JSON = customizable_cta_type_convertToJSON(ad_response->customizable_cta_type);
    if(customizable_cta_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "customizable_cta_type", customizable_cta_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_response->destination_url
    if(ad_response->destination_url) {
    if(cJSON_AddStringToObject(item, "destination_url", ad_response->destination_url) == NULL) {
    goto fail; //String
    }
    }


    // ad_response->disclosure_type
    if(ad_response->disclosure_type != pinterest_rest_api_disclosure_type__NULL) {
    cJSON *disclosure_type_local_JSON = disclosure_type_convertToJSON(ad_response->disclosure_type);
    if(disclosure_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "disclosure_type", disclosure_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_response->disclosure_url
    if(ad_response->disclosure_url) {
    if(cJSON_AddStringToObject(item, "disclosure_url", ad_response->disclosure_url) == NULL) {
    goto fail; //String
    }
    }


    // ad_response->grid_click_type
    if(ad_response->grid_click_type != pinterest_rest_api_grid_click_type__NULL) {
    cJSON *grid_click_type_local_JSON = grid_click_type_convertToJSON(ad_response->grid_click_type);
    if(grid_click_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "grid_click_type", grid_click_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_response->ios_deep_link
    if(ad_response->ios_deep_link) {
    if(cJSON_AddStringToObject(item, "ios_deep_link", ad_response->ios_deep_link) == NULL) {
    goto fail; //String
    }
    }


    // ad_response->is_pin_deleted
    if(ad_response->is_pin_deleted) {
    if(cJSON_AddBoolToObject(item, "is_pin_deleted", ad_response->is_pin_deleted) == NULL) {
    goto fail; //Bool
    }
    }


    // ad_response->is_removable
    if(ad_response->is_removable) {
    if(cJSON_AddBoolToObject(item, "is_removable", ad_response->is_removable) == NULL) {
    goto fail; //Bool
    }
    }


    // ad_response->lead_form_id
    if(ad_response->lead_form_id) {
    if(cJSON_AddStringToObject(item, "lead_form_id", ad_response->lead_form_id) == NULL) {
    goto fail; //String
    }
    }


    // ad_response->name
    if(ad_response->name) {
    if(cJSON_AddStringToObject(item, "name", ad_response->name) == NULL) {
    goto fail; //String
    }
    }


    // ad_response->quiz_pin_data
    if(ad_response->quiz_pin_data) {
    cJSON *quiz_pin_data_local_JSON = quiz_pin_data_convertToJSON(ad_response->quiz_pin_data);
    if(quiz_pin_data_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "quiz_pin_data", quiz_pin_data_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // ad_response->status
    if(ad_response->status != pinterest_rest_api_entity_status__NULL) {
    cJSON *status_local_JSON = entity_status_convertToJSON(ad_response->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_response->tracking_urls
    if(ad_response->tracking_urls) {
    cJSON *tracking_urls_local_JSON = tracking_urls_convertToJSON(ad_response->tracking_urls);
    if(tracking_urls_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "tracking_urls", tracking_urls_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // ad_response->view_tracking_url
    if(ad_response->view_tracking_url) {
    if(cJSON_AddStringToObject(item, "view_tracking_url", ad_response->view_tracking_url) == NULL) {
    goto fail; //String
    }
    }


    // ad_response->pin_id
    if(ad_response->pin_id) {
    if(cJSON_AddStringToObject(item, "pin_id", ad_response->pin_id) == NULL) {
    goto fail; //String
    }
    }


    // ad_response->ad_account_id
    if(ad_response->ad_account_id) {
    if(cJSON_AddStringToObject(item, "ad_account_id", ad_response->ad_account_id) == NULL) {
    goto fail; //String
    }
    }


    // ad_response->campaign_id
    if(ad_response->campaign_id) {
    if(cJSON_AddStringToObject(item, "campaign_id", ad_response->campaign_id) == NULL) {
    goto fail; //String
    }
    }


    // ad_response->collection_items_destination_url_template
    if(ad_response->collection_items_destination_url_template) {
    if(cJSON_AddStringToObject(item, "collection_items_destination_url_template", ad_response->collection_items_destination_url_template) == NULL) {
    goto fail; //String
    }
    }


    // ad_response->created_time
    if(ad_response->created_time) {
    if(cJSON_AddNumberToObject(item, "created_time", ad_response->created_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // ad_response->id
    if(ad_response->id) {
    if(cJSON_AddStringToObject(item, "id", ad_response->id) == NULL) {
    goto fail; //String
    }
    }


    // ad_response->rejected_reasons
    if(ad_response->rejected_reasons != pinterest_rest_api_ad_response_REJECTEDREASONS_NULL) {
    cJSON *rejected_reasons = cJSON_AddArrayToObject(item, "rejected_reasons");
    if(rejected_reasons == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *rejected_reasonsListEntry;
    list_ForEach(rejected_reasonsListEntry, ad_response->rejected_reasons) {
    if(cJSON_AddStringToObject(rejected_reasons, "", rejected_reasonsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // ad_response->rejection_labels
    if(ad_response->rejection_labels) {
    cJSON *rejection_labels = cJSON_AddArrayToObject(item, "rejection_labels");
    if(rejection_labels == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *rejection_labelsListEntry;
    list_ForEach(rejection_labelsListEntry, ad_response->rejection_labels) {
    if(cJSON_AddStringToObject(rejection_labels, "", rejection_labelsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // ad_response->review_status
    if(ad_response->review_status != pinterest_rest_api_ad_response_REVIEWSTATUS_NULL) {
    if(cJSON_AddStringToObject(item, "review_status", ad_response_review_status_ToString(ad_response->review_status)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // ad_response->summary_status
    if(ad_response->summary_status) {
    cJSON *summary_status_local_JSON = pin_promotion_summary_status_convertToJSON(ad_response->summary_status);
    if(summary_status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "summary_status", summary_status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_response->type
    if(ad_response->type) {
    if(cJSON_AddStringToObject(item, "type", ad_response->type) == NULL) {
    goto fail; //String
    }
    }


    // ad_response->updated_time
    if(ad_response->updated_time) {
    if(cJSON_AddNumberToObject(item, "updated_time", ad_response->updated_time) == NULL) {
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

ad_response_t *ad_response_parseFromJSON(cJSON *ad_responseJSON){

    ad_response_t *ad_response_local_var = NULL;

    // define the local list for ad_response->carousel_android_deep_links
    list_t *carousel_android_deep_linksList = NULL;

    // define the local list for ad_response->carousel_destination_urls
    list_t *carousel_destination_urlsList = NULL;

    // define the local list for ad_response->carousel_ios_deep_links
    list_t *carousel_ios_deep_linksList = NULL;

    // define the local variable for ad_response->creative_type
    pinterest_rest_api_creative_type__e creative_type_local_nonprim = 0;

    // define the local variable for ad_response->customizable_cta_type
    pinterest_rest_api_customizable_cta_type__e customizable_cta_type_local_nonprim = 0;

    // define the local variable for ad_response->disclosure_type
    pinterest_rest_api_disclosure_type__e disclosure_type_local_nonprim = 0;

    // define the local variable for ad_response->grid_click_type
    pinterest_rest_api_grid_click_type__e grid_click_type_local_nonprim = 0;

    // define the local variable for ad_response->quiz_pin_data
    quiz_pin_data_t *quiz_pin_data_local_nonprim = NULL;

    // define the local variable for ad_response->status
    pinterest_rest_api_entity_status__e status_local_nonprim = 0;

    // define the local variable for ad_response->tracking_urls
    tracking_urls_t *tracking_urls_local_nonprim = NULL;

    // define the local list for ad_response->rejected_reasons
    list_t *rejected_reasonsList = NULL;

    // define the local list for ad_response->rejection_labels
    list_t *rejection_labelsList = NULL;

    // define the local variable for ad_response->summary_status
    pin_promotion_summary_status_t *summary_status_local_nonprim = NULL;

    // ad_response->ad_group_id
    cJSON *ad_group_id = cJSON_GetObjectItemCaseSensitive(ad_responseJSON, "ad_group_id");
    if (cJSON_IsNull(ad_group_id)) {
        ad_group_id = NULL;
    }
    if (ad_group_id) { 
    if(!cJSON_IsString(ad_group_id) && !cJSON_IsNull(ad_group_id))
    {
    goto end; //String
    }
    }

    // ad_response->android_deep_link
    cJSON *android_deep_link = cJSON_GetObjectItemCaseSensitive(ad_responseJSON, "android_deep_link");
    if (cJSON_IsNull(android_deep_link)) {
        android_deep_link = NULL;
    }
    if (android_deep_link) { 
    if(!cJSON_IsString(android_deep_link) && !cJSON_IsNull(android_deep_link))
    {
    goto end; //String
    }
    }

    // ad_response->carousel_android_deep_links
    cJSON *carousel_android_deep_links = cJSON_GetObjectItemCaseSensitive(ad_responseJSON, "carousel_android_deep_links");
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

    // ad_response->carousel_destination_urls
    cJSON *carousel_destination_urls = cJSON_GetObjectItemCaseSensitive(ad_responseJSON, "carousel_destination_urls");
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

    // ad_response->carousel_ios_deep_links
    cJSON *carousel_ios_deep_links = cJSON_GetObjectItemCaseSensitive(ad_responseJSON, "carousel_ios_deep_links");
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

    // ad_response->click_tracking_url
    cJSON *click_tracking_url = cJSON_GetObjectItemCaseSensitive(ad_responseJSON, "click_tracking_url");
    if (cJSON_IsNull(click_tracking_url)) {
        click_tracking_url = NULL;
    }
    if (click_tracking_url) { 
    if(!cJSON_IsString(click_tracking_url) && !cJSON_IsNull(click_tracking_url))
    {
    goto end; //String
    }
    }

    // ad_response->creative_type
    cJSON *creative_type = cJSON_GetObjectItemCaseSensitive(ad_responseJSON, "creative_type");
    if (cJSON_IsNull(creative_type)) {
        creative_type = NULL;
    }
    if (creative_type) { 
    creative_type_local_nonprim = creative_type_parseFromJSON(creative_type); //custom
    }

    // ad_response->customizable_cta_type
    cJSON *customizable_cta_type = cJSON_GetObjectItemCaseSensitive(ad_responseJSON, "customizable_cta_type");
    if (cJSON_IsNull(customizable_cta_type)) {
        customizable_cta_type = NULL;
    }
    if (customizable_cta_type) { 
    customizable_cta_type_local_nonprim = customizable_cta_type_parseFromJSON(customizable_cta_type); //custom
    }

    // ad_response->destination_url
    cJSON *destination_url = cJSON_GetObjectItemCaseSensitive(ad_responseJSON, "destination_url");
    if (cJSON_IsNull(destination_url)) {
        destination_url = NULL;
    }
    if (destination_url) { 
    if(!cJSON_IsString(destination_url) && !cJSON_IsNull(destination_url))
    {
    goto end; //String
    }
    }

    // ad_response->disclosure_type
    cJSON *disclosure_type = cJSON_GetObjectItemCaseSensitive(ad_responseJSON, "disclosure_type");
    if (cJSON_IsNull(disclosure_type)) {
        disclosure_type = NULL;
    }
    if (disclosure_type) { 
    disclosure_type_local_nonprim = disclosure_type_parseFromJSON(disclosure_type); //custom
    }

    // ad_response->disclosure_url
    cJSON *disclosure_url = cJSON_GetObjectItemCaseSensitive(ad_responseJSON, "disclosure_url");
    if (cJSON_IsNull(disclosure_url)) {
        disclosure_url = NULL;
    }
    if (disclosure_url) { 
    if(!cJSON_IsString(disclosure_url) && !cJSON_IsNull(disclosure_url))
    {
    goto end; //String
    }
    }

    // ad_response->grid_click_type
    cJSON *grid_click_type = cJSON_GetObjectItemCaseSensitive(ad_responseJSON, "grid_click_type");
    if (cJSON_IsNull(grid_click_type)) {
        grid_click_type = NULL;
    }
    if (grid_click_type) { 
    grid_click_type_local_nonprim = grid_click_type_parseFromJSON(grid_click_type); //custom
    }

    // ad_response->ios_deep_link
    cJSON *ios_deep_link = cJSON_GetObjectItemCaseSensitive(ad_responseJSON, "ios_deep_link");
    if (cJSON_IsNull(ios_deep_link)) {
        ios_deep_link = NULL;
    }
    if (ios_deep_link) { 
    if(!cJSON_IsString(ios_deep_link) && !cJSON_IsNull(ios_deep_link))
    {
    goto end; //String
    }
    }

    // ad_response->is_pin_deleted
    cJSON *is_pin_deleted = cJSON_GetObjectItemCaseSensitive(ad_responseJSON, "is_pin_deleted");
    if (cJSON_IsNull(is_pin_deleted)) {
        is_pin_deleted = NULL;
    }
    if (is_pin_deleted) { 
    if(!cJSON_IsBool(is_pin_deleted))
    {
    goto end; //Bool
    }
    }

    // ad_response->is_removable
    cJSON *is_removable = cJSON_GetObjectItemCaseSensitive(ad_responseJSON, "is_removable");
    if (cJSON_IsNull(is_removable)) {
        is_removable = NULL;
    }
    if (is_removable) { 
    if(!cJSON_IsBool(is_removable))
    {
    goto end; //Bool
    }
    }

    // ad_response->lead_form_id
    cJSON *lead_form_id = cJSON_GetObjectItemCaseSensitive(ad_responseJSON, "lead_form_id");
    if (cJSON_IsNull(lead_form_id)) {
        lead_form_id = NULL;
    }
    if (lead_form_id) { 
    if(!cJSON_IsString(lead_form_id) && !cJSON_IsNull(lead_form_id))
    {
    goto end; //String
    }
    }

    // ad_response->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(ad_responseJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // ad_response->quiz_pin_data
    cJSON *quiz_pin_data = cJSON_GetObjectItemCaseSensitive(ad_responseJSON, "quiz_pin_data");
    if (cJSON_IsNull(quiz_pin_data)) {
        quiz_pin_data = NULL;
    }
    if (quiz_pin_data) { 
    quiz_pin_data_local_nonprim = quiz_pin_data_parseFromJSON(quiz_pin_data); //nonprimitive
    }

    // ad_response->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(ad_responseJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    status_local_nonprim = entity_status_parseFromJSON(status); //custom
    }

    // ad_response->tracking_urls
    cJSON *tracking_urls = cJSON_GetObjectItemCaseSensitive(ad_responseJSON, "tracking_urls");
    if (cJSON_IsNull(tracking_urls)) {
        tracking_urls = NULL;
    }
    if (tracking_urls) { 
    tracking_urls_local_nonprim = tracking_urls_parseFromJSON(tracking_urls); //nonprimitive
    }

    // ad_response->view_tracking_url
    cJSON *view_tracking_url = cJSON_GetObjectItemCaseSensitive(ad_responseJSON, "view_tracking_url");
    if (cJSON_IsNull(view_tracking_url)) {
        view_tracking_url = NULL;
    }
    if (view_tracking_url) { 
    if(!cJSON_IsString(view_tracking_url) && !cJSON_IsNull(view_tracking_url))
    {
    goto end; //String
    }
    }

    // ad_response->pin_id
    cJSON *pin_id = cJSON_GetObjectItemCaseSensitive(ad_responseJSON, "pin_id");
    if (cJSON_IsNull(pin_id)) {
        pin_id = NULL;
    }
    if (pin_id) { 
    if(!cJSON_IsString(pin_id) && !cJSON_IsNull(pin_id))
    {
    goto end; //String
    }
    }

    // ad_response->ad_account_id
    cJSON *ad_account_id = cJSON_GetObjectItemCaseSensitive(ad_responseJSON, "ad_account_id");
    if (cJSON_IsNull(ad_account_id)) {
        ad_account_id = NULL;
    }
    if (ad_account_id) { 
    if(!cJSON_IsString(ad_account_id) && !cJSON_IsNull(ad_account_id))
    {
    goto end; //String
    }
    }

    // ad_response->campaign_id
    cJSON *campaign_id = cJSON_GetObjectItemCaseSensitive(ad_responseJSON, "campaign_id");
    if (cJSON_IsNull(campaign_id)) {
        campaign_id = NULL;
    }
    if (campaign_id) { 
    if(!cJSON_IsString(campaign_id) && !cJSON_IsNull(campaign_id))
    {
    goto end; //String
    }
    }

    // ad_response->collection_items_destination_url_template
    cJSON *collection_items_destination_url_template = cJSON_GetObjectItemCaseSensitive(ad_responseJSON, "collection_items_destination_url_template");
    if (cJSON_IsNull(collection_items_destination_url_template)) {
        collection_items_destination_url_template = NULL;
    }
    if (collection_items_destination_url_template) { 
    if(!cJSON_IsString(collection_items_destination_url_template) && !cJSON_IsNull(collection_items_destination_url_template))
    {
    goto end; //String
    }
    }

    // ad_response->created_time
    cJSON *created_time = cJSON_GetObjectItemCaseSensitive(ad_responseJSON, "created_time");
    if (cJSON_IsNull(created_time)) {
        created_time = NULL;
    }
    if (created_time) { 
    if(!cJSON_IsNumber(created_time))
    {
    goto end; //Numeric
    }
    }

    // ad_response->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(ad_responseJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // ad_response->rejected_reasons
    cJSON *rejected_reasons = cJSON_GetObjectItemCaseSensitive(ad_responseJSON, "rejected_reasons");
    if (cJSON_IsNull(rejected_reasons)) {
        rejected_reasons = NULL;
    }
    if (rejected_reasons) { 
    cJSON *rejected_reasons_local = NULL;
    if(!cJSON_IsArray(rejected_reasons)) {
        goto end;//primitive container
    }
    rejected_reasonsList = list_createList();

    cJSON_ArrayForEach(rejected_reasons_local, rejected_reasons)
    {
        if(!cJSON_IsString(rejected_reasons_local))
        {
            goto end;
        }
        list_addElement(rejected_reasonsList , strdup(rejected_reasons_local->valuestring));
    }
    }

    // ad_response->rejection_labels
    cJSON *rejection_labels = cJSON_GetObjectItemCaseSensitive(ad_responseJSON, "rejection_labels");
    if (cJSON_IsNull(rejection_labels)) {
        rejection_labels = NULL;
    }
    if (rejection_labels) { 
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
    }

    // ad_response->review_status
    cJSON *review_status = cJSON_GetObjectItemCaseSensitive(ad_responseJSON, "review_status");
    if (cJSON_IsNull(review_status)) {
        review_status = NULL;
    }
    pinterest_rest_api_ad_response_REVIEWSTATUS_e review_statusVariable;
    if (review_status) { 
    if(!cJSON_IsString(review_status))
    {
    goto end; //Enum
    }
    review_statusVariable = ad_response_review_status_FromString(review_status->valuestring);
    }

    // ad_response->summary_status
    cJSON *summary_status = cJSON_GetObjectItemCaseSensitive(ad_responseJSON, "summary_status");
    if (cJSON_IsNull(summary_status)) {
        summary_status = NULL;
    }
    if (summary_status) { 
    summary_status_local_nonprim = pin_promotion_summary_status_parseFromJSON(summary_status); //custom
    }

    // ad_response->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(ad_responseJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (type) { 
    if(!cJSON_IsString(type) && !cJSON_IsNull(type))
    {
    goto end; //String
    }
    }

    // ad_response->updated_time
    cJSON *updated_time = cJSON_GetObjectItemCaseSensitive(ad_responseJSON, "updated_time");
    if (cJSON_IsNull(updated_time)) {
        updated_time = NULL;
    }
    if (updated_time) { 
    if(!cJSON_IsNumber(updated_time))
    {
    goto end; //Numeric
    }
    }


    ad_response_local_var = ad_response_create_internal (
        ad_group_id && !cJSON_IsNull(ad_group_id) ? strdup(ad_group_id->valuestring) : NULL,
        android_deep_link && !cJSON_IsNull(android_deep_link) ? strdup(android_deep_link->valuestring) : NULL,
        carousel_android_deep_links ? carousel_android_deep_linksList : NULL,
        carousel_destination_urls ? carousel_destination_urlsList : NULL,
        carousel_ios_deep_links ? carousel_ios_deep_linksList : NULL,
        click_tracking_url && !cJSON_IsNull(click_tracking_url) ? strdup(click_tracking_url->valuestring) : NULL,
        creative_type ? creative_type_local_nonprim : 0,
        customizable_cta_type ? customizable_cta_type_local_nonprim : 0,
        destination_url && !cJSON_IsNull(destination_url) ? strdup(destination_url->valuestring) : NULL,
        disclosure_type ? disclosure_type_local_nonprim : 0,
        disclosure_url && !cJSON_IsNull(disclosure_url) ? strdup(disclosure_url->valuestring) : NULL,
        grid_click_type ? grid_click_type_local_nonprim : 0,
        ios_deep_link && !cJSON_IsNull(ios_deep_link) ? strdup(ios_deep_link->valuestring) : NULL,
        is_pin_deleted ? is_pin_deleted->valueint : 0,
        is_removable ? is_removable->valueint : 0,
        lead_form_id && !cJSON_IsNull(lead_form_id) ? strdup(lead_form_id->valuestring) : NULL,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        quiz_pin_data ? quiz_pin_data_local_nonprim : NULL,
        status ? status_local_nonprim : 0,
        tracking_urls ? tracking_urls_local_nonprim : NULL,
        view_tracking_url && !cJSON_IsNull(view_tracking_url) ? strdup(view_tracking_url->valuestring) : NULL,
        pin_id && !cJSON_IsNull(pin_id) ? strdup(pin_id->valuestring) : NULL,
        ad_account_id && !cJSON_IsNull(ad_account_id) ? strdup(ad_account_id->valuestring) : NULL,
        campaign_id && !cJSON_IsNull(campaign_id) ? strdup(campaign_id->valuestring) : NULL,
        collection_items_destination_url_template && !cJSON_IsNull(collection_items_destination_url_template) ? strdup(collection_items_destination_url_template->valuestring) : NULL,
        created_time ? created_time->valuedouble : 0,
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        rejected_reasons ? rejected_reasonsList : NULL,
        rejection_labels ? rejection_labelsList : NULL,
        review_status ? review_statusVariable : pinterest_rest_api_ad_response_REVIEWSTATUS_NULL,
        summary_status ? summary_status_local_nonprim : NULL,
        type && !cJSON_IsNull(type) ? strdup(type->valuestring) : NULL,
        updated_time ? updated_time->valuedouble : 0
        );

    return ad_response_local_var;
end:
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
    if (creative_type_local_nonprim) {
        creative_type_local_nonprim = 0;
    }
    if (customizable_cta_type_local_nonprim) {
        customizable_cta_type_local_nonprim = 0;
    }
    if (disclosure_type_local_nonprim) {
        disclosure_type_local_nonprim = 0;
    }
    if (grid_click_type_local_nonprim) {
        grid_click_type_local_nonprim = 0;
    }
    if (quiz_pin_data_local_nonprim) {
        quiz_pin_data_free(quiz_pin_data_local_nonprim);
        quiz_pin_data_local_nonprim = NULL;
    }
    if (status_local_nonprim) {
        status_local_nonprim = 0;
    }
    if (tracking_urls_local_nonprim) {
        tracking_urls_free(tracking_urls_local_nonprim);
        tracking_urls_local_nonprim = NULL;
    }
    if (rejected_reasonsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, rejected_reasonsList) {
            free(listEntry->data);
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
    if (summary_status_local_nonprim) {
        pin_promotion_summary_status_free(summary_status_local_nonprim);
        summary_status_local_nonprim = NULL;
    }
    return NULL;

}
