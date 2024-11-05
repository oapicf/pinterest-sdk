#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_creative_assets_product_group_filter_keys.h"



catalogs_creative_assets_product_group_filter_keys_t *catalogs_creative_assets_product_group_filter_keys_create(
    catalogs_product_group_multiple_string_criteria_t *creative_assets_id,
    catalogs_product_group_multiple_string_criteria_t *custom_label_0,
    catalogs_product_group_multiple_string_criteria_t *custom_label_1,
    catalogs_product_group_multiple_string_criteria_t *custom_label_2,
    catalogs_product_group_multiple_string_criteria_t *custom_label_3,
    catalogs_product_group_multiple_string_criteria_t *custom_label_4,
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_6,
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_5,
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_4,
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_3,
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_2,
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_1,
    catalogs_product_group_multiple_string_list_criteria_t *google_product_category_0,
    catalogs_product_group_multiple_media_types_criteria_t *media_type
    ) {
    catalogs_creative_assets_product_group_filter_keys_t *catalogs_creative_assets_product_group_filter_keys_local_var = malloc(sizeof(catalogs_creative_assets_product_group_filter_keys_t));
    if (!catalogs_creative_assets_product_group_filter_keys_local_var) {
        return NULL;
    }
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

    return catalogs_creative_assets_product_group_filter_keys_local_var;
}


void catalogs_creative_assets_product_group_filter_keys_free(catalogs_creative_assets_product_group_filter_keys_t *catalogs_creative_assets_product_group_filter_keys) {
    if(NULL == catalogs_creative_assets_product_group_filter_keys){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_creative_assets_product_group_filter_keys->creative_assets_id) {
        object_free(catalogs_creative_assets_product_group_filter_keys->creative_assets_id);
        catalogs_creative_assets_product_group_filter_keys->creative_assets_id = NULL;
    }
    if (catalogs_creative_assets_product_group_filter_keys->custom_label_0) {
        object_free(catalogs_creative_assets_product_group_filter_keys->custom_label_0);
        catalogs_creative_assets_product_group_filter_keys->custom_label_0 = NULL;
    }
    if (catalogs_creative_assets_product_group_filter_keys->custom_label_1) {
        object_free(catalogs_creative_assets_product_group_filter_keys->custom_label_1);
        catalogs_creative_assets_product_group_filter_keys->custom_label_1 = NULL;
    }
    if (catalogs_creative_assets_product_group_filter_keys->custom_label_2) {
        object_free(catalogs_creative_assets_product_group_filter_keys->custom_label_2);
        catalogs_creative_assets_product_group_filter_keys->custom_label_2 = NULL;
    }
    if (catalogs_creative_assets_product_group_filter_keys->custom_label_3) {
        object_free(catalogs_creative_assets_product_group_filter_keys->custom_label_3);
        catalogs_creative_assets_product_group_filter_keys->custom_label_3 = NULL;
    }
    if (catalogs_creative_assets_product_group_filter_keys->custom_label_4) {
        object_free(catalogs_creative_assets_product_group_filter_keys->custom_label_4);
        catalogs_creative_assets_product_group_filter_keys->custom_label_4 = NULL;
    }
    if (catalogs_creative_assets_product_group_filter_keys->google_product_category_6) {
        object_free(catalogs_creative_assets_product_group_filter_keys->google_product_category_6);
        catalogs_creative_assets_product_group_filter_keys->google_product_category_6 = NULL;
    }
    if (catalogs_creative_assets_product_group_filter_keys->google_product_category_5) {
        object_free(catalogs_creative_assets_product_group_filter_keys->google_product_category_5);
        catalogs_creative_assets_product_group_filter_keys->google_product_category_5 = NULL;
    }
    if (catalogs_creative_assets_product_group_filter_keys->google_product_category_4) {
        object_free(catalogs_creative_assets_product_group_filter_keys->google_product_category_4);
        catalogs_creative_assets_product_group_filter_keys->google_product_category_4 = NULL;
    }
    if (catalogs_creative_assets_product_group_filter_keys->google_product_category_3) {
        object_free(catalogs_creative_assets_product_group_filter_keys->google_product_category_3);
        catalogs_creative_assets_product_group_filter_keys->google_product_category_3 = NULL;
    }
    if (catalogs_creative_assets_product_group_filter_keys->google_product_category_2) {
        object_free(catalogs_creative_assets_product_group_filter_keys->google_product_category_2);
        catalogs_creative_assets_product_group_filter_keys->google_product_category_2 = NULL;
    }
    if (catalogs_creative_assets_product_group_filter_keys->google_product_category_1) {
        object_free(catalogs_creative_assets_product_group_filter_keys->google_product_category_1);
        catalogs_creative_assets_product_group_filter_keys->google_product_category_1 = NULL;
    }
    if (catalogs_creative_assets_product_group_filter_keys->google_product_category_0) {
        object_free(catalogs_creative_assets_product_group_filter_keys->google_product_category_0);
        catalogs_creative_assets_product_group_filter_keys->google_product_category_0 = NULL;
    }
    if (catalogs_creative_assets_product_group_filter_keys->media_type) {
        object_free(catalogs_creative_assets_product_group_filter_keys->media_type);
        catalogs_creative_assets_product_group_filter_keys->media_type = NULL;
    }
    free(catalogs_creative_assets_product_group_filter_keys);
}

cJSON *catalogs_creative_assets_product_group_filter_keys_convertToJSON(catalogs_creative_assets_product_group_filter_keys_t *catalogs_creative_assets_product_group_filter_keys) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_creative_assets_product_group_filter_keys->creative_assets_id
    if (!catalogs_creative_assets_product_group_filter_keys->creative_assets_id) {
        goto fail;
    }
    cJSON *creative_assets_id_object = object_convertToJSON(catalogs_creative_assets_product_group_filter_keys->creative_assets_id);
    if(creative_assets_id_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "CREATIVE_ASSETS_ID", creative_assets_id_object);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_creative_assets_product_group_filter_keys->custom_label_0
    if (!catalogs_creative_assets_product_group_filter_keys->custom_label_0) {
        goto fail;
    }
    cJSON *custom_label_0_object = object_convertToJSON(catalogs_creative_assets_product_group_filter_keys->custom_label_0);
    if(custom_label_0_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "CUSTOM_LABEL_0", custom_label_0_object);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_creative_assets_product_group_filter_keys->custom_label_1
    if (!catalogs_creative_assets_product_group_filter_keys->custom_label_1) {
        goto fail;
    }
    cJSON *custom_label_1_object = object_convertToJSON(catalogs_creative_assets_product_group_filter_keys->custom_label_1);
    if(custom_label_1_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "CUSTOM_LABEL_1", custom_label_1_object);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_creative_assets_product_group_filter_keys->custom_label_2
    if (!catalogs_creative_assets_product_group_filter_keys->custom_label_2) {
        goto fail;
    }
    cJSON *custom_label_2_object = object_convertToJSON(catalogs_creative_assets_product_group_filter_keys->custom_label_2);
    if(custom_label_2_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "CUSTOM_LABEL_2", custom_label_2_object);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_creative_assets_product_group_filter_keys->custom_label_3
    if (!catalogs_creative_assets_product_group_filter_keys->custom_label_3) {
        goto fail;
    }
    cJSON *custom_label_3_object = object_convertToJSON(catalogs_creative_assets_product_group_filter_keys->custom_label_3);
    if(custom_label_3_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "CUSTOM_LABEL_3", custom_label_3_object);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_creative_assets_product_group_filter_keys->custom_label_4
    if (!catalogs_creative_assets_product_group_filter_keys->custom_label_4) {
        goto fail;
    }
    cJSON *custom_label_4_object = object_convertToJSON(catalogs_creative_assets_product_group_filter_keys->custom_label_4);
    if(custom_label_4_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "CUSTOM_LABEL_4", custom_label_4_object);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_creative_assets_product_group_filter_keys->google_product_category_6
    if (!catalogs_creative_assets_product_group_filter_keys->google_product_category_6) {
        goto fail;
    }
    cJSON *google_product_category_6_object = object_convertToJSON(catalogs_creative_assets_product_group_filter_keys->google_product_category_6);
    if(google_product_category_6_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "GOOGLE_PRODUCT_CATEGORY_6", google_product_category_6_object);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_creative_assets_product_group_filter_keys->google_product_category_5
    if (!catalogs_creative_assets_product_group_filter_keys->google_product_category_5) {
        goto fail;
    }
    cJSON *google_product_category_5_object = object_convertToJSON(catalogs_creative_assets_product_group_filter_keys->google_product_category_5);
    if(google_product_category_5_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "GOOGLE_PRODUCT_CATEGORY_5", google_product_category_5_object);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_creative_assets_product_group_filter_keys->google_product_category_4
    if (!catalogs_creative_assets_product_group_filter_keys->google_product_category_4) {
        goto fail;
    }
    cJSON *google_product_category_4_object = object_convertToJSON(catalogs_creative_assets_product_group_filter_keys->google_product_category_4);
    if(google_product_category_4_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "GOOGLE_PRODUCT_CATEGORY_4", google_product_category_4_object);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_creative_assets_product_group_filter_keys->google_product_category_3
    if (!catalogs_creative_assets_product_group_filter_keys->google_product_category_3) {
        goto fail;
    }
    cJSON *google_product_category_3_object = object_convertToJSON(catalogs_creative_assets_product_group_filter_keys->google_product_category_3);
    if(google_product_category_3_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "GOOGLE_PRODUCT_CATEGORY_3", google_product_category_3_object);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_creative_assets_product_group_filter_keys->google_product_category_2
    if (!catalogs_creative_assets_product_group_filter_keys->google_product_category_2) {
        goto fail;
    }
    cJSON *google_product_category_2_object = object_convertToJSON(catalogs_creative_assets_product_group_filter_keys->google_product_category_2);
    if(google_product_category_2_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "GOOGLE_PRODUCT_CATEGORY_2", google_product_category_2_object);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_creative_assets_product_group_filter_keys->google_product_category_1
    if (!catalogs_creative_assets_product_group_filter_keys->google_product_category_1) {
        goto fail;
    }
    cJSON *google_product_category_1_object = object_convertToJSON(catalogs_creative_assets_product_group_filter_keys->google_product_category_1);
    if(google_product_category_1_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "GOOGLE_PRODUCT_CATEGORY_1", google_product_category_1_object);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_creative_assets_product_group_filter_keys->google_product_category_0
    if (!catalogs_creative_assets_product_group_filter_keys->google_product_category_0) {
        goto fail;
    }
    cJSON *google_product_category_0_object = object_convertToJSON(catalogs_creative_assets_product_group_filter_keys->google_product_category_0);
    if(google_product_category_0_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "GOOGLE_PRODUCT_CATEGORY_0", google_product_category_0_object);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_creative_assets_product_group_filter_keys->media_type
    if (!catalogs_creative_assets_product_group_filter_keys->media_type) {
        goto fail;
    }
    cJSON *media_type_object = object_convertToJSON(catalogs_creative_assets_product_group_filter_keys->media_type);
    if(media_type_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "MEDIA_TYPE", media_type_object);
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

    // catalogs_creative_assets_product_group_filter_keys->creative_assets_id
    cJSON *creative_assets_id = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_group_filter_keysJSON, "CREATIVE_ASSETS_ID");
    if (!creative_assets_id) {
        goto end;
    }

    object_t *creative_assets_id_local_object = NULL;
    
    creative_assets_id_local_object = object_parseFromJSON(creative_assets_id); //object

    // catalogs_creative_assets_product_group_filter_keys->custom_label_0
    cJSON *custom_label_0 = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_group_filter_keysJSON, "CUSTOM_LABEL_0");
    if (!custom_label_0) {
        goto end;
    }

    object_t *custom_label_0_local_object = NULL;
    
    custom_label_0_local_object = object_parseFromJSON(custom_label_0); //object

    // catalogs_creative_assets_product_group_filter_keys->custom_label_1
    cJSON *custom_label_1 = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_group_filter_keysJSON, "CUSTOM_LABEL_1");
    if (!custom_label_1) {
        goto end;
    }

    object_t *custom_label_1_local_object = NULL;
    
    custom_label_1_local_object = object_parseFromJSON(custom_label_1); //object

    // catalogs_creative_assets_product_group_filter_keys->custom_label_2
    cJSON *custom_label_2 = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_group_filter_keysJSON, "CUSTOM_LABEL_2");
    if (!custom_label_2) {
        goto end;
    }

    object_t *custom_label_2_local_object = NULL;
    
    custom_label_2_local_object = object_parseFromJSON(custom_label_2); //object

    // catalogs_creative_assets_product_group_filter_keys->custom_label_3
    cJSON *custom_label_3 = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_group_filter_keysJSON, "CUSTOM_LABEL_3");
    if (!custom_label_3) {
        goto end;
    }

    object_t *custom_label_3_local_object = NULL;
    
    custom_label_3_local_object = object_parseFromJSON(custom_label_3); //object

    // catalogs_creative_assets_product_group_filter_keys->custom_label_4
    cJSON *custom_label_4 = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_group_filter_keysJSON, "CUSTOM_LABEL_4");
    if (!custom_label_4) {
        goto end;
    }

    object_t *custom_label_4_local_object = NULL;
    
    custom_label_4_local_object = object_parseFromJSON(custom_label_4); //object

    // catalogs_creative_assets_product_group_filter_keys->google_product_category_6
    cJSON *google_product_category_6 = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_group_filter_keysJSON, "GOOGLE_PRODUCT_CATEGORY_6");
    if (!google_product_category_6) {
        goto end;
    }

    object_t *google_product_category_6_local_object = NULL;
    
    google_product_category_6_local_object = object_parseFromJSON(google_product_category_6); //object

    // catalogs_creative_assets_product_group_filter_keys->google_product_category_5
    cJSON *google_product_category_5 = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_group_filter_keysJSON, "GOOGLE_PRODUCT_CATEGORY_5");
    if (!google_product_category_5) {
        goto end;
    }

    object_t *google_product_category_5_local_object = NULL;
    
    google_product_category_5_local_object = object_parseFromJSON(google_product_category_5); //object

    // catalogs_creative_assets_product_group_filter_keys->google_product_category_4
    cJSON *google_product_category_4 = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_group_filter_keysJSON, "GOOGLE_PRODUCT_CATEGORY_4");
    if (!google_product_category_4) {
        goto end;
    }

    object_t *google_product_category_4_local_object = NULL;
    
    google_product_category_4_local_object = object_parseFromJSON(google_product_category_4); //object

    // catalogs_creative_assets_product_group_filter_keys->google_product_category_3
    cJSON *google_product_category_3 = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_group_filter_keysJSON, "GOOGLE_PRODUCT_CATEGORY_3");
    if (!google_product_category_3) {
        goto end;
    }

    object_t *google_product_category_3_local_object = NULL;
    
    google_product_category_3_local_object = object_parseFromJSON(google_product_category_3); //object

    // catalogs_creative_assets_product_group_filter_keys->google_product_category_2
    cJSON *google_product_category_2 = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_group_filter_keysJSON, "GOOGLE_PRODUCT_CATEGORY_2");
    if (!google_product_category_2) {
        goto end;
    }

    object_t *google_product_category_2_local_object = NULL;
    
    google_product_category_2_local_object = object_parseFromJSON(google_product_category_2); //object

    // catalogs_creative_assets_product_group_filter_keys->google_product_category_1
    cJSON *google_product_category_1 = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_group_filter_keysJSON, "GOOGLE_PRODUCT_CATEGORY_1");
    if (!google_product_category_1) {
        goto end;
    }

    object_t *google_product_category_1_local_object = NULL;
    
    google_product_category_1_local_object = object_parseFromJSON(google_product_category_1); //object

    // catalogs_creative_assets_product_group_filter_keys->google_product_category_0
    cJSON *google_product_category_0 = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_group_filter_keysJSON, "GOOGLE_PRODUCT_CATEGORY_0");
    if (!google_product_category_0) {
        goto end;
    }

    object_t *google_product_category_0_local_object = NULL;
    
    google_product_category_0_local_object = object_parseFromJSON(google_product_category_0); //object

    // catalogs_creative_assets_product_group_filter_keys->media_type
    cJSON *media_type = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_product_group_filter_keysJSON, "MEDIA_TYPE");
    if (!media_type) {
        goto end;
    }

    object_t *media_type_local_object = NULL;
    
    media_type_local_object = object_parseFromJSON(media_type); //object


    catalogs_creative_assets_product_group_filter_keys_local_var = catalogs_creative_assets_product_group_filter_keys_create (
        creative_assets_id_local_object,
        custom_label_0_local_object,
        custom_label_1_local_object,
        custom_label_2_local_object,
        custom_label_3_local_object,
        custom_label_4_local_object,
        google_product_category_6_local_object,
        google_product_category_5_local_object,
        google_product_category_4_local_object,
        google_product_category_3_local_object,
        google_product_category_2_local_object,
        google_product_category_1_local_object,
        google_product_category_0_local_object,
        media_type_local_object
        );

    return catalogs_creative_assets_product_group_filter_keys_local_var;
end:
    return NULL;

}
