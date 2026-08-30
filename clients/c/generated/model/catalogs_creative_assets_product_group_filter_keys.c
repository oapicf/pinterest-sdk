#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_creative_assets_product_group_filter_keys.h"



static catalogs_creative_assets_product_group_filter_keys_t *catalogs_creative_assets_product_group_filter_keys_create_internal(
    catalogs_product_group_multiple_string_criteria_t *creative_assets_id,
    catalogs_product_group_filter_operator_type_criteria_t *custom_label_0,
    catalogs_product_group_filter_operator_type_criteria_t *custom_label_1,
    catalogs_product_group_filter_operator_type_criteria_t *custom_label_2,
    catalogs_product_group_filter_operator_type_criteria_t *custom_label_3,
    catalogs_product_group_filter_operator_type_criteria_t *custom_label_4,
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_6,
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_5,
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_4,
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_3,
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_2,
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_1,
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_0,
    catalogs_product_group_multiple_media_types_criteria_t *media_type,
    catalogs_product_group_multiple_string_criteria_t *title_keywords,
    catalogs_product_group_filter_operator_type_criteria_t *link
    ) {
    catalogs_creative_assets_product_group_filter_keys_t *catalogs_creative_assets_product_group_filter_keys_local_var = malloc(sizeof(catalogs_creative_assets_product_group_filter_keys_t));
    if (!catalogs_creative_assets_product_group_filter_keys_local_var) {
        return NULL;
    }
    memset(catalogs_creative_assets_product_group_filter_keys_local_var, 0, sizeof(catalogs_creative_assets_product_group_filter_keys_t));
    catalogs_creative_assets_product_group_filter_keys_local_var->_library_owned = 1;
    catalogs_creative_assets_product_group_filter_keys_local_var->creative_assets_id = creative_assets_id;
    catalogs_creative_assets_product_group_filter_keys_local_var->custom_label_0 = custom_label_0;
    catalogs_creative_assets_product_group_filter_keys_local_var->custom_label_1 = custom_label_1;
    catalogs_creative_assets_product_group_filter_keys_local_var->custom_label_2 = custom_label_2;
    catalogs_creative_assets_product_group_filter_keys_local_var->custom_label_3 = custom_label_3;
    catalogs_creative_assets_product_group_filter_keys_local_var->custom_label_4 = custom_label_4;
    catalogs_creative_assets_product_group_filter_keys_local_var->google_product_category_6 = google_product_category_6;
    catalogs_creative_assets_product_group_filter_keys_local_var->google_product_category_5 = google_product_category_5;
    catalogs_creative_assets_product_group_filter_keys_local_var->google_product_category_4 = google_product_category_4;
    catalogs_creative_assets_product_group_filter_keys_local_var->google_product_category_3 = google_product_category_3;
    catalogs_creative_assets_product_group_filter_keys_local_var->google_product_category_2 = google_product_category_2;
    catalogs_creative_assets_product_group_filter_keys_local_var->google_product_category_1 = google_product_category_1;
    catalogs_creative_assets_product_group_filter_keys_local_var->google_product_category_0 = google_product_category_0;
    catalogs_creative_assets_product_group_filter_keys_local_var->media_type = media_type;
    catalogs_creative_assets_product_group_filter_keys_local_var->title_keywords = title_keywords;
    catalogs_creative_assets_product_group_filter_keys_local_var->link = link;
    return catalogs_creative_assets_product_group_filter_keys_local_var;
}

__attribute__((deprecated)) catalogs_creative_assets_product_group_filter_keys_t *catalogs_creative_assets_product_group_filter_keys_create(
    catalogs_product_group_multiple_string_criteria_t *creative_assets_id,
    catalogs_product_group_filter_operator_type_criteria_t *custom_label_0,
    catalogs_product_group_filter_operator_type_criteria_t *custom_label_1,
    catalogs_product_group_filter_operator_type_criteria_t *custom_label_2,
    catalogs_product_group_filter_operator_type_criteria_t *custom_label_3,
    catalogs_product_group_filter_operator_type_criteria_t *custom_label_4,
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_6,
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_5,
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_4,
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_3,
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_2,
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_1,
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_0,
    catalogs_product_group_multiple_media_types_criteria_t *media_type,
    catalogs_product_group_multiple_string_criteria_t *title_keywords,
    catalogs_product_group_filter_operator_type_criteria_t *link
    ) {
    catalogs_creative_assets_product_group_filter_keys_t *result = catalogs_creative_assets_product_group_filter_keys_create_internal (
        creative_assets_id,
        custom_label_0,
        custom_label_1,
        custom_label_2,
        custom_label_3,
        custom_label_4,
        google_product_category_6,
        google_product_category_5,
        google_product_category_4,
        google_product_category_3,
        google_product_category_2,
        google_product_category_1,
        google_product_category_0,
        media_type,
        title_keywords,
        link
        );
    if (!result) {
    }
    return result;
}

void catalogs_creative_assets_product_group_filter_keys_free(catalogs_creative_assets_product_group_filter_keys_t *catalogs_creative_assets_product_group_filter_keys) {
    if(NULL == catalogs_creative_assets_product_group_filter_keys){
        return ;
    }
    if(catalogs_creative_assets_product_group_filter_keys->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_creative_assets_product_group_filter_keys_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_creative_assets_product_group_filter_keys->creative_assets_id) {
        catalogs_product_group_multiple_string_criteria_free(catalogs_creative_assets_product_group_filter_keys->creative_assets_id);
        catalogs_creative_assets_product_group_filter_keys->creative_assets_id = NULL;
    }
    if (catalogs_creative_assets_product_group_filter_keys->custom_label_0) {
        catalogs_product_group_filter_operator_type_criteria_free(catalogs_creative_assets_product_group_filter_keys->custom_label_0);
        catalogs_creative_assets_product_group_filter_keys->custom_label_0 = NULL;
    }
    if (catalogs_creative_assets_product_group_filter_keys->custom_label_1) {
        catalogs_product_group_filter_operator_type_criteria_free(catalogs_creative_assets_product_group_filter_keys->custom_label_1);
        catalogs_creative_assets_product_group_filter_keys->custom_label_1 = NULL;
    }
    if (catalogs_creative_assets_product_group_filter_keys->custom_label_2) {
        catalogs_product_group_filter_operator_type_criteria_free(catalogs_creative_assets_product_group_filter_keys->custom_label_2);
        catalogs_creative_assets_product_group_filter_keys->custom_label_2 = NULL;
    }
    if (catalogs_creative_assets_product_group_filter_keys->custom_label_3) {
        catalogs_product_group_filter_operator_type_criteria_free(catalogs_creative_assets_product_group_filter_keys->custom_label_3);
        catalogs_creative_assets_product_group_filter_keys->custom_label_3 = NULL;
    }
    if (catalogs_creative_assets_product_group_filter_keys->custom_label_4) {
        catalogs_product_group_filter_operator_type_criteria_free(catalogs_creative_assets_product_group_filter_keys->custom_label_4);
        catalogs_creative_assets_product_group_filter_keys->custom_label_4 = NULL;
    }
    if (catalogs_creative_assets_product_group_filter_keys->google_product_category_6) {
        catalogs_product_group_multiple_string_list_criteria_free(catalogs_creative_assets_product_group_filter_keys->google_product_category_6);
        catalogs_creative_assets_product_group_filter_keys->google_product_category_6 = NULL;
    }
    if (catalogs_creative_assets_product_group_filter_keys->google_product_category_5) {
        catalogs_product_group_multiple_string_list_criteria_free(catalogs_creative_assets_product_group_filter_keys->google_product_category_5);
        catalogs_creative_assets_product_group_filter_keys->google_product_category_5 = NULL;
    }
    if (catalogs_creative_assets_product_group_filter_keys->google_product_category_4) {
        catalogs_product_group_multiple_string_list_criteria_free(catalogs_creative_assets_product_group_filter_keys->google_product_category_4);
        catalogs_creative_assets_product_group_filter_keys->google_product_category_4 = NULL;
    }
    if (catalogs_creative_assets_product_group_filter_keys->google_product_category_3) {
        catalogs_product_group_multiple_string_list_criteria_free(catalogs_creative_assets_product_group_filter_keys->google_product_category_3);
        catalogs_creative_assets_product_group_filter_keys->google_product_category_3 = NULL;
    }
    if (catalogs_creative_assets_product_group_filter_keys->google_product_category_2) {
        catalogs_product_group_multiple_string_list_criteria_free(catalogs_creative_assets_product_group_filter_keys->google_product_category_2);
        catalogs_creative_assets_product_group_filter_keys->google_product_category_2 = NULL;
    }
    if (catalogs_creative_assets_product_group_filter_keys->google_product_category_1) {
        catalogs_product_group_multiple_string_list_criteria_free(catalogs_creative_assets_product_group_filter_keys->google_product_category_1);
        catalogs_creative_assets_product_group_filter_keys->google_product_category_1 = NULL;
    }
    if (catalogs_creative_assets_product_group_filter_keys->google_product_category_0) {
        catalogs_product_group_multiple_string_list_criteria_free(catalogs_creative_assets_product_group_filter_keys->google_product_category_0);
        catalogs_creative_assets_product_group_filter_keys->google_product_category_0 = NULL;
    }
    if (catalogs_creative_assets_product_group_filter_keys->media_type) {
        catalogs_product_group_multiple_media_types_criteria_free(catalogs_creative_assets_product_group_filter_keys->media_type);
        catalogs_creative_assets_product_group_filter_keys->media_type = NULL;
    }
    if (catalogs_creative_assets_product_group_filter_keys->title_keywords) {
        catalogs_product_group_multiple_string_criteria_free(catalogs_creative_assets_product_group_filter_keys->title_keywords);
        catalogs_creative_assets_product_group_filter_keys->title_keywords = NULL;
    }
    if (catalogs_creative_assets_product_group_filter_keys->link) {
        catalogs_product_group_filter_operator_type_criteria_free(catalogs_creative_assets_product_group_filter_keys->link);
        catalogs_creative_assets_product_group_filter_keys->link = NULL;
    }
    free(catalogs_creative_assets_product_group_filter_keys);
}

cJSON *catalogs_creative_assets_product_group_filter_keys_convertToJSON(catalogs_creative_assets_product_group_filter_keys_t *catalogs_creative_assets_product_group_filter_keys) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_creative_assets_product_group_filter_keys->creative_assets_id
    if (!catalogs_creative_assets_product_group_filter_keys->creative_assets_id) {
        goto fail;
    }
    cJSON *creative_assets_id_local_JSON = catalogs_product_group_multiple_string_criteria_convertToJSON(catalogs_creative_assets_product_group_filter_keys->creative_assets_id);
    if(creative_assets_id_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "CREATIVE_ASSETS_ID", creative_assets_id_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_creative_assets_product_group_filter_keys->custom_label_0
    if (!catalogs_creative_assets_product_group_filter_keys->custom_label_0) {
        goto fail;
    }
    cJSON *custom_label_0_local_JSON = catalogs_product_group_filter_operator_type_criteria_convertToJSON(catalogs_creative_assets_product_group_filter_keys->custom_label_0);
    if(custom_label_0_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "CUSTOM_LABEL_0", custom_label_0_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_creative_assets_product_group_filter_keys->custom_label_1
    if (!catalogs_creative_assets_product_group_filter_keys->custom_label_1) {
        goto fail;
    }
    cJSON *custom_label_1_local_JSON = catalogs_product_group_filter_operator_type_criteria_convertToJSON(catalogs_creative_assets_product_group_filter_keys->custom_label_1);
    if(custom_label_1_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "CUSTOM_LABEL_1", custom_label_1_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_creative_assets_product_group_filter_keys->custom_label_2
    if (!catalogs_creative_assets_product_group_filter_keys->custom_label_2) {
        goto fail;
    }
    cJSON *custom_label_2_local_JSON = catalogs_product_group_filter_operator_type_criteria_convertToJSON(catalogs_creative_assets_product_group_filter_keys->custom_label_2);
    if(custom_label_2_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "CUSTOM_LABEL_2", custom_label_2_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_creative_assets_product_group_filter_keys->custom_label_3
    if (!catalogs_creative_assets_product_group_filter_keys->custom_label_3) {
        goto fail;
    }
    cJSON *custom_label_3_local_JSON = catalogs_product_group_filter_operator_type_criteria_convertToJSON(catalogs_creative_assets_product_group_filter_keys->custom_label_3);
    if(custom_label_3_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "CUSTOM_LABEL_3", custom_label_3_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_creative_assets_product_group_filter_keys->custom_label_4
    if (!catalogs_creative_assets_product_group_filter_keys->custom_label_4) {
        goto fail;
    }
    cJSON *custom_label_4_local_JSON = catalogs_product_group_filter_operator_type_criteria_convertToJSON(catalogs_creative_assets_product_group_filter_keys->custom_label_4);
    if(custom_label_4_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "CUSTOM_LABEL_4", custom_label_4_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_creative_assets_product_group_filter_keys->google_product_category_6
    if (!catalogs_creative_assets_product_group_filter_keys->google_product_category_6) {
        goto fail;
    }
    cJSON *google_product_category_6_local_JSON = catalogs_product_group_multiple_string_list_criteria_convertToJSON(catalogs_creative_assets_product_group_filter_keys->google_product_category_6);
    if(google_product_category_6_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "GOOGLE_PRODUCT_CATEGORY_6", google_product_category_6_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_creative_assets_product_group_filter_keys->google_product_category_5
    if (!catalogs_creative_assets_product_group_filter_keys->google_product_category_5) {
        goto fail;
    }
    cJSON *google_product_category_5_local_JSON = catalogs_product_group_multiple_string_list_criteria_convertToJSON(catalogs_creative_assets_product_group_filter_keys->google_product_category_5);
    if(google_product_category_5_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "GOOGLE_PRODUCT_CATEGORY_5", google_product_category_5_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_creative_assets_product_group_filter_keys->google_product_category_4
    if (!catalogs_creative_assets_product_group_filter_keys->google_product_category_4) {
        goto fail;
    }
    cJSON *google_product_category_4_local_JSON = catalogs_product_group_multiple_string_list_criteria_convertToJSON(catalogs_creative_assets_product_group_filter_keys->google_product_category_4);
    if(google_product_category_4_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "GOOGLE_PRODUCT_CATEGORY_4", google_product_category_4_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_creative_assets_product_group_filter_keys->google_product_category_3
    if (!catalogs_creative_assets_product_group_filter_keys->google_product_category_3) {
        goto fail;
    }
    cJSON *google_product_category_3_local_JSON = catalogs_product_group_multiple_string_list_criteria_convertToJSON(catalogs_creative_assets_product_group_filter_keys->google_product_category_3);
    if(google_product_category_3_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "GOOGLE_PRODUCT_CATEGORY_3", google_product_category_3_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_creative_assets_product_group_filter_keys->google_product_category_2
    if (!catalogs_creative_assets_product_group_filter_keys->google_product_category_2) {
        goto fail;
    }
    cJSON *google_product_category_2_local_JSON = catalogs_product_group_multiple_string_list_criteria_convertToJSON(catalogs_creative_assets_product_group_filter_keys->google_product_category_2);
    if(google_product_category_2_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "GOOGLE_PRODUCT_CATEGORY_2", google_product_category_2_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_creative_assets_product_group_filter_keys->google_product_category_1
    if (!catalogs_creative_assets_product_group_filter_keys->google_product_category_1) {
        goto fail;
    }
    cJSON *google_product_category_1_local_JSON = catalogs_product_group_multiple_string_list_criteria_convertToJSON(catalogs_creative_assets_product_group_filter_keys->google_product_category_1);
    if(google_product_category_1_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "GOOGLE_PRODUCT_CATEGORY_1", google_product_category_1_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_creative_assets_product_group_filter_keys->google_product_category_0
    if (!catalogs_creative_assets_product_group_filter_keys->google_product_category_0) {
        goto fail;
    }
    cJSON *google_product_category_0_local_JSON = catalogs_product_group_multiple_string_list_criteria_convertToJSON(catalogs_creative_assets_product_group_filter_keys->google_product_category_0);
    if(google_product_category_0_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "GOOGLE_PRODUCT_CATEGORY_0", google_product_category_0_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_creative_assets_product_group_filter_keys->media_type
    if (!catalogs_creative_assets_product_group_filter_keys->media_type) {
        goto fail;
    }
    cJSON *media_type_local_JSON = catalogs_product_group_multiple_media_types_criteria_convertToJSON(catalogs_creative_assets_product_group_filter_keys->media_type);
    if(media_type_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "MEDIA_TYPE", media_type_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_creative_assets_product_group_filter_keys->title_keywords
    if (!catalogs_creative_assets_product_group_filter_keys->title_keywords) {
        goto fail;
    }
    cJSON *title_keywords_local_JSON = catalogs_product_group_multiple_string_criteria_convertToJSON(catalogs_creative_assets_product_group_filter_keys->title_keywords);
    if(title_keywords_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "TITLE_KEYWORDS", title_keywords_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_creative_assets_product_group_filter_keys->link
    if (!catalogs_creative_assets_product_group_filter_keys->link) {
        goto fail;
    }
    cJSON *link_local_JSON = catalogs_product_group_filter_operator_type_criteria_convertToJSON(catalogs_creative_assets_product_group_filter_keys->link);
    if(link_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "LINK", link_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_creative_assets_product_group_filter_keys_t *catalogs_creative_assets_product_group_filter_keys_parseFromJSON(cJSON *catalogs_creative_assets_product_group_filter_keysJSON){

    catalogs_creative_assets_product_group_filter_keys_t *catalogs_creative_assets_product_group_filter_keys_local_var = NULL;

    // define the local variable for catalogs_creative_assets_product_group_filter_keys->creative_assets_id
    catalogs_product_group_multiple_string_criteria_t *creative_assets_id_local_nonprim = NULL;

    // define the local variable for catalogs_creative_assets_product_group_filter_keys->custom_label_0
    catalogs_product_group_filter_operator_type_criteria_t *custom_label_0_local_nonprim = NULL;

    // define the local variable for catalogs_creative_assets_product_group_filter_keys->custom_label_1
    catalogs_product_group_filter_operator_type_criteria_t *custom_label_1_local_nonprim = NULL;

    // define the local variable for catalogs_creative_assets_product_group_filter_keys->custom_label_2
    catalogs_product_group_filter_operator_type_criteria_t *custom_label_2_local_nonprim = NULL;

    // define the local variable for catalogs_creative_assets_product_group_filter_keys->custom_label_3
    catalogs_product_group_filter_operator_type_criteria_t *custom_label_3_local_nonprim = NULL;

    // define the local variable for catalogs_creative_assets_product_group_filter_keys->custom_label_4
    catalogs_product_group_filter_operator_type_criteria_t *custom_label_4_local_nonprim = NULL;

    // define the local variable for catalogs_creative_assets_product_group_filter_keys->google_product_category_6
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_6_local_nonprim = NULL;

    // define the local variable for catalogs_creative_assets_product_group_filter_keys->google_product_category_5
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_5_local_nonprim = NULL;

    // define the local variable for catalogs_creative_assets_product_group_filter_keys->google_product_category_4
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_4_local_nonprim = NULL;

    // define the local variable for catalogs_creative_assets_product_group_filter_keys->google_product_category_3
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_3_local_nonprim = NULL;

    // define the local variable for catalogs_creative_assets_product_group_filter_keys->google_product_category_2
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_2_local_nonprim = NULL;

    // define the local variable for catalogs_creative_assets_product_group_filter_keys->google_product_category_1
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_1_local_nonprim = NULL;

    // define the local variable for catalogs_creative_assets_product_group_filter_keys->google_product_category_0
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_0_local_nonprim = NULL;

    // define the local variable for catalogs_creative_assets_product_group_filter_keys->media_type
    catalogs_product_group_multiple_media_types_criteria_t *media_type_local_nonprim = NULL;

    // define the local variable for catalogs_creative_assets_product_group_filter_keys->title_keywords
    catalogs_product_group_multiple_string_criteria_t *title_keywords_local_nonprim = NULL;

    // define the local variable for catalogs_creative_assets_product_group_filter_keys->link
    catalogs_product_group_filter_operator_type_criteria_t *link_local_nonprim = NULL;

    // catalogs_creative_assets_product_group_filter_keys->creative_assets_id
    cJSON *creative_assets_id = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_group_filter_keysJSON, "CREATIVE_ASSETS_ID");
    if (cJSON_IsNull(creative_assets_id)) {
        creative_assets_id = NULL;
    }
    if (!creative_assets_id) {
        goto end;
    }

    
    creative_assets_id_local_nonprim = catalogs_product_group_multiple_string_criteria_parseFromJSON(creative_assets_id); //nonprimitive

    // catalogs_creative_assets_product_group_filter_keys->custom_label_0
    cJSON *custom_label_0 = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_group_filter_keysJSON, "CUSTOM_LABEL_0");
    if (cJSON_IsNull(custom_label_0)) {
        custom_label_0 = NULL;
    }
    if (!custom_label_0) {
        goto end;
    }

    
    custom_label_0_local_nonprim = catalogs_product_group_filter_operator_type_criteria_parseFromJSON(custom_label_0); //nonprimitive

    // catalogs_creative_assets_product_group_filter_keys->custom_label_1
    cJSON *custom_label_1 = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_group_filter_keysJSON, "CUSTOM_LABEL_1");
    if (cJSON_IsNull(custom_label_1)) {
        custom_label_1 = NULL;
    }
    if (!custom_label_1) {
        goto end;
    }

    
    custom_label_1_local_nonprim = catalogs_product_group_filter_operator_type_criteria_parseFromJSON(custom_label_1); //nonprimitive

    // catalogs_creative_assets_product_group_filter_keys->custom_label_2
    cJSON *custom_label_2 = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_group_filter_keysJSON, "CUSTOM_LABEL_2");
    if (cJSON_IsNull(custom_label_2)) {
        custom_label_2 = NULL;
    }
    if (!custom_label_2) {
        goto end;
    }

    
    custom_label_2_local_nonprim = catalogs_product_group_filter_operator_type_criteria_parseFromJSON(custom_label_2); //nonprimitive

    // catalogs_creative_assets_product_group_filter_keys->custom_label_3
    cJSON *custom_label_3 = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_group_filter_keysJSON, "CUSTOM_LABEL_3");
    if (cJSON_IsNull(custom_label_3)) {
        custom_label_3 = NULL;
    }
    if (!custom_label_3) {
        goto end;
    }

    
    custom_label_3_local_nonprim = catalogs_product_group_filter_operator_type_criteria_parseFromJSON(custom_label_3); //nonprimitive

    // catalogs_creative_assets_product_group_filter_keys->custom_label_4
    cJSON *custom_label_4 = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_group_filter_keysJSON, "CUSTOM_LABEL_4");
    if (cJSON_IsNull(custom_label_4)) {
        custom_label_4 = NULL;
    }
    if (!custom_label_4) {
        goto end;
    }

    
    custom_label_4_local_nonprim = catalogs_product_group_filter_operator_type_criteria_parseFromJSON(custom_label_4); //nonprimitive

    // catalogs_creative_assets_product_group_filter_keys->google_product_category_6
    cJSON *google_product_category_6 = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_group_filter_keysJSON, "GOOGLE_PRODUCT_CATEGORY_6");
    if (cJSON_IsNull(google_product_category_6)) {
        google_product_category_6 = NULL;
    }
    if (!google_product_category_6) {
        goto end;
    }

    
    google_product_category_6_local_nonprim = catalogs_product_group_multiple_string_list_criteria_parseFromJSON(google_product_category_6); //nonprimitive

    // catalogs_creative_assets_product_group_filter_keys->google_product_category_5
    cJSON *google_product_category_5 = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_group_filter_keysJSON, "GOOGLE_PRODUCT_CATEGORY_5");
    if (cJSON_IsNull(google_product_category_5)) {
        google_product_category_5 = NULL;
    }
    if (!google_product_category_5) {
        goto end;
    }

    
    google_product_category_5_local_nonprim = catalogs_product_group_multiple_string_list_criteria_parseFromJSON(google_product_category_5); //nonprimitive

    // catalogs_creative_assets_product_group_filter_keys->google_product_category_4
    cJSON *google_product_category_4 = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_group_filter_keysJSON, "GOOGLE_PRODUCT_CATEGORY_4");
    if (cJSON_IsNull(google_product_category_4)) {
        google_product_category_4 = NULL;
    }
    if (!google_product_category_4) {
        goto end;
    }

    
    google_product_category_4_local_nonprim = catalogs_product_group_multiple_string_list_criteria_parseFromJSON(google_product_category_4); //nonprimitive

    // catalogs_creative_assets_product_group_filter_keys->google_product_category_3
    cJSON *google_product_category_3 = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_group_filter_keysJSON, "GOOGLE_PRODUCT_CATEGORY_3");
    if (cJSON_IsNull(google_product_category_3)) {
        google_product_category_3 = NULL;
    }
    if (!google_product_category_3) {
        goto end;
    }

    
    google_product_category_3_local_nonprim = catalogs_product_group_multiple_string_list_criteria_parseFromJSON(google_product_category_3); //nonprimitive

    // catalogs_creative_assets_product_group_filter_keys->google_product_category_2
    cJSON *google_product_category_2 = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_group_filter_keysJSON, "GOOGLE_PRODUCT_CATEGORY_2");
    if (cJSON_IsNull(google_product_category_2)) {
        google_product_category_2 = NULL;
    }
    if (!google_product_category_2) {
        goto end;
    }

    
    google_product_category_2_local_nonprim = catalogs_product_group_multiple_string_list_criteria_parseFromJSON(google_product_category_2); //nonprimitive

    // catalogs_creative_assets_product_group_filter_keys->google_product_category_1
    cJSON *google_product_category_1 = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_group_filter_keysJSON, "GOOGLE_PRODUCT_CATEGORY_1");
    if (cJSON_IsNull(google_product_category_1)) {
        google_product_category_1 = NULL;
    }
    if (!google_product_category_1) {
        goto end;
    }

    
    google_product_category_1_local_nonprim = catalogs_product_group_multiple_string_list_criteria_parseFromJSON(google_product_category_1); //nonprimitive

    // catalogs_creative_assets_product_group_filter_keys->google_product_category_0
    cJSON *google_product_category_0 = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_group_filter_keysJSON, "GOOGLE_PRODUCT_CATEGORY_0");
    if (cJSON_IsNull(google_product_category_0)) {
        google_product_category_0 = NULL;
    }
    if (!google_product_category_0) {
        goto end;
    }

    
    google_product_category_0_local_nonprim = catalogs_product_group_multiple_string_list_criteria_parseFromJSON(google_product_category_0); //nonprimitive

    // catalogs_creative_assets_product_group_filter_keys->media_type
    cJSON *media_type = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_group_filter_keysJSON, "MEDIA_TYPE");
    if (cJSON_IsNull(media_type)) {
        media_type = NULL;
    }
    if (!media_type) {
        goto end;
    }

    
    media_type_local_nonprim = catalogs_product_group_multiple_media_types_criteria_parseFromJSON(media_type); //nonprimitive

    // catalogs_creative_assets_product_group_filter_keys->title_keywords
    cJSON *title_keywords = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_group_filter_keysJSON, "TITLE_KEYWORDS");
    if (cJSON_IsNull(title_keywords)) {
        title_keywords = NULL;
    }
    if (!title_keywords) {
        goto end;
    }

    
    title_keywords_local_nonprim = catalogs_product_group_multiple_string_criteria_parseFromJSON(title_keywords); //nonprimitive

    // catalogs_creative_assets_product_group_filter_keys->link
    cJSON *link = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_group_filter_keysJSON, "LINK");
    if (cJSON_IsNull(link)) {
        link = NULL;
    }
    if (!link) {
        goto end;
    }

    
    link_local_nonprim = catalogs_product_group_filter_operator_type_criteria_parseFromJSON(link); //nonprimitive



    catalogs_creative_assets_product_group_filter_keys_local_var = catalogs_creative_assets_product_group_filter_keys_create_internal (
        creative_assets_id_local_nonprim,
        custom_label_0_local_nonprim,
        custom_label_1_local_nonprim,
        custom_label_2_local_nonprim,
        custom_label_3_local_nonprim,
        custom_label_4_local_nonprim,
        google_product_category_6_local_nonprim,
        google_product_category_5_local_nonprim,
        google_product_category_4_local_nonprim,
        google_product_category_3_local_nonprim,
        google_product_category_2_local_nonprim,
        google_product_category_1_local_nonprim,
        google_product_category_0_local_nonprim,
        media_type_local_nonprim,
        title_keywords_local_nonprim,
        link_local_nonprim
        );

    if (!catalogs_creative_assets_product_group_filter_keys_local_var) {
        goto end;
    }

    return catalogs_creative_assets_product_group_filter_keys_local_var;
end:
    if (creative_assets_id_local_nonprim) {
        catalogs_product_group_multiple_string_criteria_free(creative_assets_id_local_nonprim);
        creative_assets_id_local_nonprim = NULL;
    }
    if (custom_label_0_local_nonprim) {
        catalogs_product_group_filter_operator_type_criteria_free(custom_label_0_local_nonprim);
        custom_label_0_local_nonprim = NULL;
    }
    if (custom_label_1_local_nonprim) {
        catalogs_product_group_filter_operator_type_criteria_free(custom_label_1_local_nonprim);
        custom_label_1_local_nonprim = NULL;
    }
    if (custom_label_2_local_nonprim) {
        catalogs_product_group_filter_operator_type_criteria_free(custom_label_2_local_nonprim);
        custom_label_2_local_nonprim = NULL;
    }
    if (custom_label_3_local_nonprim) {
        catalogs_product_group_filter_operator_type_criteria_free(custom_label_3_local_nonprim);
        custom_label_3_local_nonprim = NULL;
    }
    if (custom_label_4_local_nonprim) {
        catalogs_product_group_filter_operator_type_criteria_free(custom_label_4_local_nonprim);
        custom_label_4_local_nonprim = NULL;
    }
    if (google_product_category_6_local_nonprim) {
        catalogs_product_group_multiple_string_list_criteria_free(google_product_category_6_local_nonprim);
        google_product_category_6_local_nonprim = NULL;
    }
    if (google_product_category_5_local_nonprim) {
        catalogs_product_group_multiple_string_list_criteria_free(google_product_category_5_local_nonprim);
        google_product_category_5_local_nonprim = NULL;
    }
    if (google_product_category_4_local_nonprim) {
        catalogs_product_group_multiple_string_list_criteria_free(google_product_category_4_local_nonprim);
        google_product_category_4_local_nonprim = NULL;
    }
    if (google_product_category_3_local_nonprim) {
        catalogs_product_group_multiple_string_list_criteria_free(google_product_category_3_local_nonprim);
        google_product_category_3_local_nonprim = NULL;
    }
    if (google_product_category_2_local_nonprim) {
        catalogs_product_group_multiple_string_list_criteria_free(google_product_category_2_local_nonprim);
        google_product_category_2_local_nonprim = NULL;
    }
    if (google_product_category_1_local_nonprim) {
        catalogs_product_group_multiple_string_list_criteria_free(google_product_category_1_local_nonprim);
        google_product_category_1_local_nonprim = NULL;
    }
    if (google_product_category_0_local_nonprim) {
        catalogs_product_group_multiple_string_list_criteria_free(google_product_category_0_local_nonprim);
        google_product_category_0_local_nonprim = NULL;
    }
    if (media_type_local_nonprim) {
        catalogs_product_group_multiple_media_types_criteria_free(media_type_local_nonprim);
        media_type_local_nonprim = NULL;
    }
    if (title_keywords_local_nonprim) {
        catalogs_product_group_multiple_string_criteria_free(title_keywords_local_nonprim);
        title_keywords_local_nonprim = NULL;
    }
    if (link_local_nonprim) {
        catalogs_product_group_filter_operator_type_criteria_free(link_local_nonprim);
        link_local_nonprim = NULL;
    }
    return NULL;

}
