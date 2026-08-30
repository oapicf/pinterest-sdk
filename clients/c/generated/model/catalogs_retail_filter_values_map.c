#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_retail_filter_values_map.h"


char* catalogs_retail_filter_values_map_availability_ToString(pinterest_rest_api_catalogs_retail_filter_values_map__e availability) {
    char *availabilityArray[] =  { "NULL", "IN_STOCK", "OUT_OF_STOCK", "PREORDER" };
    return availabilityArray[availability - 1];
}

pinterest_rest_api_catalogs_retail_filter_values_map__e catalogs_retail_filter_values_map_availability_FromString(char* availability) {
    int stringToReturn = 0;
    char *availabilityArray[] =  { "NULL", "IN_STOCK", "OUT_OF_STOCK", "PREORDER" };
    size_t sizeofArray = sizeof(availabilityArray) / sizeof(availabilityArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(availability, availabilityArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}
char* catalogs_retail_filter_values_map_condition_ToString(pinterest_rest_api_catalogs_retail_filter_values_map__e condition) {
    char *conditionArray[] =  { "NULL", "NEW", "USED", "REFURBISHED" };
    return conditionArray[condition - 1];
}

pinterest_rest_api_catalogs_retail_filter_values_map__e catalogs_retail_filter_values_map_condition_FromString(char* condition) {
    int stringToReturn = 0;
    char *conditionArray[] =  { "NULL", "NEW", "USED", "REFURBISHED" };
    size_t sizeofArray = sizeof(conditionArray) / sizeof(conditionArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(condition, conditionArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}
char* catalogs_retail_filter_values_map_gender_ToString(pinterest_rest_api_catalogs_retail_filter_values_map__e gender) {
    char *genderArray[] =  { "NULL", "FEMALE", "MALE", "UNISEX" };
    return genderArray[gender - 1];
}

pinterest_rest_api_catalogs_retail_filter_values_map__e catalogs_retail_filter_values_map_gender_FromString(char* gender) {
    int stringToReturn = 0;
    char *genderArray[] =  { "NULL", "FEMALE", "MALE", "UNISEX" };
    size_t sizeofArray = sizeof(genderArray) / sizeof(genderArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(gender, genderArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}
char* catalogs_retail_filter_values_map_media_type_ToString(pinterest_rest_api_catalogs_retail_filter_values_map__e media_type) {
    char *media_typeArray[] =  { "NULL", "IMAGE", "VIDEO" };
    return media_typeArray[media_type - 1];
}

pinterest_rest_api_catalogs_retail_filter_values_map__e catalogs_retail_filter_values_map_media_type_FromString(char* media_type) {
    int stringToReturn = 0;
    char *media_typeArray[] =  { "NULL", "IMAGE", "VIDEO" };
    size_t sizeofArray = sizeof(media_typeArray) / sizeof(media_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(media_type, media_typeArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

static catalogs_retail_filter_values_map_t *catalogs_retail_filter_values_map_create_internal(
    list_t *ad_image_tags,
    list_t *ad_video_tags,
    list_t *availability,
    list_t *brand,
    list_t *condition,
    list_t *custom_label_0,
    list_t *custom_label_1,
    list_t *custom_label_2,
    list_t *custom_label_3,
    list_t *custom_label_4,
    list_t *gender,
    list_t *google_product_category_0,
    list_t *google_product_category_1,
    list_t *google_product_category_2,
    list_t *google_product_category_3,
    list_t *google_product_category_4,
    list_t *google_product_category_5,
    list_t *google_product_category_6,
    list_t *media_type,
    list_t *product_type_0,
    list_t *product_type_1,
    list_t *product_type_2,
    list_t *product_type_3,
    list_t *product_type_4
    ) {
    catalogs_retail_filter_values_map_t *catalogs_retail_filter_values_map_local_var = malloc(sizeof(catalogs_retail_filter_values_map_t));
    if (!catalogs_retail_filter_values_map_local_var) {
        return NULL;
    }
    memset(catalogs_retail_filter_values_map_local_var, 0, sizeof(catalogs_retail_filter_values_map_t));
    catalogs_retail_filter_values_map_local_var->_library_owned = 1;
    catalogs_retail_filter_values_map_local_var->ad_image_tags = ad_image_tags;
    catalogs_retail_filter_values_map_local_var->ad_video_tags = ad_video_tags;
    catalogs_retail_filter_values_map_local_var->availability = availability;
    catalogs_retail_filter_values_map_local_var->brand = brand;
    catalogs_retail_filter_values_map_local_var->condition = condition;
    catalogs_retail_filter_values_map_local_var->custom_label_0 = custom_label_0;
    catalogs_retail_filter_values_map_local_var->custom_label_1 = custom_label_1;
    catalogs_retail_filter_values_map_local_var->custom_label_2 = custom_label_2;
    catalogs_retail_filter_values_map_local_var->custom_label_3 = custom_label_3;
    catalogs_retail_filter_values_map_local_var->custom_label_4 = custom_label_4;
    catalogs_retail_filter_values_map_local_var->gender = gender;
    catalogs_retail_filter_values_map_local_var->google_product_category_0 = google_product_category_0;
    catalogs_retail_filter_values_map_local_var->google_product_category_1 = google_product_category_1;
    catalogs_retail_filter_values_map_local_var->google_product_category_2 = google_product_category_2;
    catalogs_retail_filter_values_map_local_var->google_product_category_3 = google_product_category_3;
    catalogs_retail_filter_values_map_local_var->google_product_category_4 = google_product_category_4;
    catalogs_retail_filter_values_map_local_var->google_product_category_5 = google_product_category_5;
    catalogs_retail_filter_values_map_local_var->google_product_category_6 = google_product_category_6;
    catalogs_retail_filter_values_map_local_var->media_type = media_type;
    catalogs_retail_filter_values_map_local_var->product_type_0 = product_type_0;
    catalogs_retail_filter_values_map_local_var->product_type_1 = product_type_1;
    catalogs_retail_filter_values_map_local_var->product_type_2 = product_type_2;
    catalogs_retail_filter_values_map_local_var->product_type_3 = product_type_3;
    catalogs_retail_filter_values_map_local_var->product_type_4 = product_type_4;
    return catalogs_retail_filter_values_map_local_var;
}

__attribute__((deprecated)) catalogs_retail_filter_values_map_t *catalogs_retail_filter_values_map_create(
    list_t *ad_image_tags,
    list_t *ad_video_tags,
    list_t *availability,
    list_t *brand,
    list_t *condition,
    list_t *custom_label_0,
    list_t *custom_label_1,
    list_t *custom_label_2,
    list_t *custom_label_3,
    list_t *custom_label_4,
    list_t *gender,
    list_t *google_product_category_0,
    list_t *google_product_category_1,
    list_t *google_product_category_2,
    list_t *google_product_category_3,
    list_t *google_product_category_4,
    list_t *google_product_category_5,
    list_t *google_product_category_6,
    list_t *media_type,
    list_t *product_type_0,
    list_t *product_type_1,
    list_t *product_type_2,
    list_t *product_type_3,
    list_t *product_type_4
    ) {
    catalogs_retail_filter_values_map_t *result = catalogs_retail_filter_values_map_create_internal (
        ad_image_tags,
        ad_video_tags,
        availability,
        brand,
        condition,
        custom_label_0,
        custom_label_1,
        custom_label_2,
        custom_label_3,
        custom_label_4,
        gender,
        google_product_category_0,
        google_product_category_1,
        google_product_category_2,
        google_product_category_3,
        google_product_category_4,
        google_product_category_5,
        google_product_category_6,
        media_type,
        product_type_0,
        product_type_1,
        product_type_2,
        product_type_3,
        product_type_4
        );
    if (!result) {
    }
    return result;
}

void catalogs_retail_filter_values_map_free(catalogs_retail_filter_values_map_t *catalogs_retail_filter_values_map) {
    if(NULL == catalogs_retail_filter_values_map){
        return ;
    }
    if(catalogs_retail_filter_values_map->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_retail_filter_values_map_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_retail_filter_values_map->ad_image_tags) {
        list_ForEach(listEntry, catalogs_retail_filter_values_map->ad_image_tags) {
            free(listEntry->data);
        }
        list_freeList(catalogs_retail_filter_values_map->ad_image_tags);
        catalogs_retail_filter_values_map->ad_image_tags = NULL;
    }
    if (catalogs_retail_filter_values_map->ad_video_tags) {
        list_ForEach(listEntry, catalogs_retail_filter_values_map->ad_video_tags) {
            free(listEntry->data);
        }
        list_freeList(catalogs_retail_filter_values_map->ad_video_tags);
        catalogs_retail_filter_values_map->ad_video_tags = NULL;
    }
    if (catalogs_retail_filter_values_map->availability) {
        list_ForEach(listEntry, catalogs_retail_filter_values_map->availability) {
            product_availability_free(listEntry->data);
        }
        list_freeList(catalogs_retail_filter_values_map->availability);
        catalogs_retail_filter_values_map->availability = NULL;
    }
    if (catalogs_retail_filter_values_map->brand) {
        list_ForEach(listEntry, catalogs_retail_filter_values_map->brand) {
            free(listEntry->data);
        }
        list_freeList(catalogs_retail_filter_values_map->brand);
        catalogs_retail_filter_values_map->brand = NULL;
    }
    if (catalogs_retail_filter_values_map->condition) {
        list_ForEach(listEntry, catalogs_retail_filter_values_map->condition) {
            product_condition_free(listEntry->data);
        }
        list_freeList(catalogs_retail_filter_values_map->condition);
        catalogs_retail_filter_values_map->condition = NULL;
    }
    if (catalogs_retail_filter_values_map->custom_label_0) {
        list_ForEach(listEntry, catalogs_retail_filter_values_map->custom_label_0) {
            free(listEntry->data);
        }
        list_freeList(catalogs_retail_filter_values_map->custom_label_0);
        catalogs_retail_filter_values_map->custom_label_0 = NULL;
    }
    if (catalogs_retail_filter_values_map->custom_label_1) {
        list_ForEach(listEntry, catalogs_retail_filter_values_map->custom_label_1) {
            free(listEntry->data);
        }
        list_freeList(catalogs_retail_filter_values_map->custom_label_1);
        catalogs_retail_filter_values_map->custom_label_1 = NULL;
    }
    if (catalogs_retail_filter_values_map->custom_label_2) {
        list_ForEach(listEntry, catalogs_retail_filter_values_map->custom_label_2) {
            free(listEntry->data);
        }
        list_freeList(catalogs_retail_filter_values_map->custom_label_2);
        catalogs_retail_filter_values_map->custom_label_2 = NULL;
    }
    if (catalogs_retail_filter_values_map->custom_label_3) {
        list_ForEach(listEntry, catalogs_retail_filter_values_map->custom_label_3) {
            free(listEntry->data);
        }
        list_freeList(catalogs_retail_filter_values_map->custom_label_3);
        catalogs_retail_filter_values_map->custom_label_3 = NULL;
    }
    if (catalogs_retail_filter_values_map->custom_label_4) {
        list_ForEach(listEntry, catalogs_retail_filter_values_map->custom_label_4) {
            free(listEntry->data);
        }
        list_freeList(catalogs_retail_filter_values_map->custom_label_4);
        catalogs_retail_filter_values_map->custom_label_4 = NULL;
    }
    if (catalogs_retail_filter_values_map->gender) {
        list_ForEach(listEntry, catalogs_retail_filter_values_map->gender) {
            gender_free(listEntry->data);
        }
        list_freeList(catalogs_retail_filter_values_map->gender);
        catalogs_retail_filter_values_map->gender = NULL;
    }
    if (catalogs_retail_filter_values_map->google_product_category_0) {
        list_ForEach(listEntry, catalogs_retail_filter_values_map->google_product_category_0) {
            free(listEntry->data);
        }
        list_freeList(catalogs_retail_filter_values_map->google_product_category_0);
        catalogs_retail_filter_values_map->google_product_category_0 = NULL;
    }
    if (catalogs_retail_filter_values_map->google_product_category_1) {
        list_ForEach(listEntry, catalogs_retail_filter_values_map->google_product_category_1) {
            free(listEntry->data);
        }
        list_freeList(catalogs_retail_filter_values_map->google_product_category_1);
        catalogs_retail_filter_values_map->google_product_category_1 = NULL;
    }
    if (catalogs_retail_filter_values_map->google_product_category_2) {
        list_ForEach(listEntry, catalogs_retail_filter_values_map->google_product_category_2) {
            free(listEntry->data);
        }
        list_freeList(catalogs_retail_filter_values_map->google_product_category_2);
        catalogs_retail_filter_values_map->google_product_category_2 = NULL;
    }
    if (catalogs_retail_filter_values_map->google_product_category_3) {
        list_ForEach(listEntry, catalogs_retail_filter_values_map->google_product_category_3) {
            free(listEntry->data);
        }
        list_freeList(catalogs_retail_filter_values_map->google_product_category_3);
        catalogs_retail_filter_values_map->google_product_category_3 = NULL;
    }
    if (catalogs_retail_filter_values_map->google_product_category_4) {
        list_ForEach(listEntry, catalogs_retail_filter_values_map->google_product_category_4) {
            free(listEntry->data);
        }
        list_freeList(catalogs_retail_filter_values_map->google_product_category_4);
        catalogs_retail_filter_values_map->google_product_category_4 = NULL;
    }
    if (catalogs_retail_filter_values_map->google_product_category_5) {
        list_ForEach(listEntry, catalogs_retail_filter_values_map->google_product_category_5) {
            free(listEntry->data);
        }
        list_freeList(catalogs_retail_filter_values_map->google_product_category_5);
        catalogs_retail_filter_values_map->google_product_category_5 = NULL;
    }
    if (catalogs_retail_filter_values_map->google_product_category_6) {
        list_ForEach(listEntry, catalogs_retail_filter_values_map->google_product_category_6) {
            free(listEntry->data);
        }
        list_freeList(catalogs_retail_filter_values_map->google_product_category_6);
        catalogs_retail_filter_values_map->google_product_category_6 = NULL;
    }
    if (catalogs_retail_filter_values_map->media_type) {
        list_ForEach(listEntry, catalogs_retail_filter_values_map->media_type) {
            media_type_free(listEntry->data);
        }
        list_freeList(catalogs_retail_filter_values_map->media_type);
        catalogs_retail_filter_values_map->media_type = NULL;
    }
    if (catalogs_retail_filter_values_map->product_type_0) {
        list_ForEach(listEntry, catalogs_retail_filter_values_map->product_type_0) {
            free(listEntry->data);
        }
        list_freeList(catalogs_retail_filter_values_map->product_type_0);
        catalogs_retail_filter_values_map->product_type_0 = NULL;
    }
    if (catalogs_retail_filter_values_map->product_type_1) {
        list_ForEach(listEntry, catalogs_retail_filter_values_map->product_type_1) {
            free(listEntry->data);
        }
        list_freeList(catalogs_retail_filter_values_map->product_type_1);
        catalogs_retail_filter_values_map->product_type_1 = NULL;
    }
    if (catalogs_retail_filter_values_map->product_type_2) {
        list_ForEach(listEntry, catalogs_retail_filter_values_map->product_type_2) {
            free(listEntry->data);
        }
        list_freeList(catalogs_retail_filter_values_map->product_type_2);
        catalogs_retail_filter_values_map->product_type_2 = NULL;
    }
    if (catalogs_retail_filter_values_map->product_type_3) {
        list_ForEach(listEntry, catalogs_retail_filter_values_map->product_type_3) {
            free(listEntry->data);
        }
        list_freeList(catalogs_retail_filter_values_map->product_type_3);
        catalogs_retail_filter_values_map->product_type_3 = NULL;
    }
    if (catalogs_retail_filter_values_map->product_type_4) {
        list_ForEach(listEntry, catalogs_retail_filter_values_map->product_type_4) {
            free(listEntry->data);
        }
        list_freeList(catalogs_retail_filter_values_map->product_type_4);
        catalogs_retail_filter_values_map->product_type_4 = NULL;
    }
    free(catalogs_retail_filter_values_map);
}

cJSON *catalogs_retail_filter_values_map_convertToJSON(catalogs_retail_filter_values_map_t *catalogs_retail_filter_values_map) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_retail_filter_values_map->ad_image_tags
    if(catalogs_retail_filter_values_map->ad_image_tags) {
    cJSON *ad_image_tags = cJSON_AddArrayToObject(item, "ad_image_tags");
    if(ad_image_tags == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *ad_image_tagsListEntry;
    list_ForEach(ad_image_tagsListEntry, catalogs_retail_filter_values_map->ad_image_tags) {
    if(cJSON_AddStringToObject(ad_image_tags, "", ad_image_tagsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // catalogs_retail_filter_values_map->ad_video_tags
    if(catalogs_retail_filter_values_map->ad_video_tags) {
    cJSON *ad_video_tags = cJSON_AddArrayToObject(item, "ad_video_tags");
    if(ad_video_tags == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *ad_video_tagsListEntry;
    list_ForEach(ad_video_tagsListEntry, catalogs_retail_filter_values_map->ad_video_tags) {
    if(cJSON_AddStringToObject(ad_video_tags, "", ad_video_tagsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // catalogs_retail_filter_values_map->availability
    if(catalogs_retail_filter_values_map->availability != pinterest_rest_api_list_AVAILABILITY_NULL) {
    cJSON *availability = cJSON_AddArrayToObject(item, "availability");
    if(availability == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *availabilityListEntry;
    if (catalogs_retail_filter_values_map->availability) {
    list_ForEach(availabilityListEntry, catalogs_retail_filter_values_map->availability) {
    cJSON *itemLocal = product_availability_convertToJSON((pinterest_rest_api_catalogs_retail_filter_values_map__e)availabilityListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(availability, itemLocal);
    }
    }
    }


    // catalogs_retail_filter_values_map->brand
    if(catalogs_retail_filter_values_map->brand) {
    cJSON *brand = cJSON_AddArrayToObject(item, "brand");
    if(brand == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *brandListEntry;
    list_ForEach(brandListEntry, catalogs_retail_filter_values_map->brand) {
    if(cJSON_AddStringToObject(brand, "", brandListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // catalogs_retail_filter_values_map->condition
    if(catalogs_retail_filter_values_map->condition != pinterest_rest_api_list_CONDITION_NULL) {
    cJSON *condition = cJSON_AddArrayToObject(item, "condition");
    if(condition == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *conditionListEntry;
    if (catalogs_retail_filter_values_map->condition) {
    list_ForEach(conditionListEntry, catalogs_retail_filter_values_map->condition) {
    cJSON *itemLocal = product_condition_convertToJSON((pinterest_rest_api_catalogs_retail_filter_values_map__e)conditionListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(condition, itemLocal);
    }
    }
    }


    // catalogs_retail_filter_values_map->custom_label_0
    if(catalogs_retail_filter_values_map->custom_label_0) {
    cJSON *custom_label_0 = cJSON_AddArrayToObject(item, "custom_label_0");
    if(custom_label_0 == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *custom_label_0ListEntry;
    list_ForEach(custom_label_0ListEntry, catalogs_retail_filter_values_map->custom_label_0) {
    if(cJSON_AddStringToObject(custom_label_0, "", custom_label_0ListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // catalogs_retail_filter_values_map->custom_label_1
    if(catalogs_retail_filter_values_map->custom_label_1) {
    cJSON *custom_label_1 = cJSON_AddArrayToObject(item, "custom_label_1");
    if(custom_label_1 == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *custom_label_1ListEntry;
    list_ForEach(custom_label_1ListEntry, catalogs_retail_filter_values_map->custom_label_1) {
    if(cJSON_AddStringToObject(custom_label_1, "", custom_label_1ListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // catalogs_retail_filter_values_map->custom_label_2
    if(catalogs_retail_filter_values_map->custom_label_2) {
    cJSON *custom_label_2 = cJSON_AddArrayToObject(item, "custom_label_2");
    if(custom_label_2 == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *custom_label_2ListEntry;
    list_ForEach(custom_label_2ListEntry, catalogs_retail_filter_values_map->custom_label_2) {
    if(cJSON_AddStringToObject(custom_label_2, "", custom_label_2ListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // catalogs_retail_filter_values_map->custom_label_3
    if(catalogs_retail_filter_values_map->custom_label_3) {
    cJSON *custom_label_3 = cJSON_AddArrayToObject(item, "custom_label_3");
    if(custom_label_3 == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *custom_label_3ListEntry;
    list_ForEach(custom_label_3ListEntry, catalogs_retail_filter_values_map->custom_label_3) {
    if(cJSON_AddStringToObject(custom_label_3, "", custom_label_3ListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // catalogs_retail_filter_values_map->custom_label_4
    if(catalogs_retail_filter_values_map->custom_label_4) {
    cJSON *custom_label_4 = cJSON_AddArrayToObject(item, "custom_label_4");
    if(custom_label_4 == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *custom_label_4ListEntry;
    list_ForEach(custom_label_4ListEntry, catalogs_retail_filter_values_map->custom_label_4) {
    if(cJSON_AddStringToObject(custom_label_4, "", custom_label_4ListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // catalogs_retail_filter_values_map->gender
    if(catalogs_retail_filter_values_map->gender != pinterest_rest_api_list_GENDER_NULL) {
    cJSON *gender = cJSON_AddArrayToObject(item, "gender");
    if(gender == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *genderListEntry;
    if (catalogs_retail_filter_values_map->gender) {
    list_ForEach(genderListEntry, catalogs_retail_filter_values_map->gender) {
    cJSON *itemLocal = gender_convertToJSON((pinterest_rest_api_catalogs_retail_filter_values_map__e)genderListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(gender, itemLocal);
    }
    }
    }


    // catalogs_retail_filter_values_map->google_product_category_0
    if(catalogs_retail_filter_values_map->google_product_category_0) {
    cJSON *google_product_category_0 = cJSON_AddArrayToObject(item, "google_product_category_0");
    if(google_product_category_0 == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *google_product_category_0ListEntry;
    list_ForEach(google_product_category_0ListEntry, catalogs_retail_filter_values_map->google_product_category_0) {
    if(cJSON_AddStringToObject(google_product_category_0, "", google_product_category_0ListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // catalogs_retail_filter_values_map->google_product_category_1
    if(catalogs_retail_filter_values_map->google_product_category_1) {
    cJSON *google_product_category_1 = cJSON_AddArrayToObject(item, "google_product_category_1");
    if(google_product_category_1 == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *google_product_category_1ListEntry;
    list_ForEach(google_product_category_1ListEntry, catalogs_retail_filter_values_map->google_product_category_1) {
    if(cJSON_AddStringToObject(google_product_category_1, "", google_product_category_1ListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // catalogs_retail_filter_values_map->google_product_category_2
    if(catalogs_retail_filter_values_map->google_product_category_2) {
    cJSON *google_product_category_2 = cJSON_AddArrayToObject(item, "google_product_category_2");
    if(google_product_category_2 == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *google_product_category_2ListEntry;
    list_ForEach(google_product_category_2ListEntry, catalogs_retail_filter_values_map->google_product_category_2) {
    if(cJSON_AddStringToObject(google_product_category_2, "", google_product_category_2ListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // catalogs_retail_filter_values_map->google_product_category_3
    if(catalogs_retail_filter_values_map->google_product_category_3) {
    cJSON *google_product_category_3 = cJSON_AddArrayToObject(item, "google_product_category_3");
    if(google_product_category_3 == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *google_product_category_3ListEntry;
    list_ForEach(google_product_category_3ListEntry, catalogs_retail_filter_values_map->google_product_category_3) {
    if(cJSON_AddStringToObject(google_product_category_3, "", google_product_category_3ListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // catalogs_retail_filter_values_map->google_product_category_4
    if(catalogs_retail_filter_values_map->google_product_category_4) {
    cJSON *google_product_category_4 = cJSON_AddArrayToObject(item, "google_product_category_4");
    if(google_product_category_4 == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *google_product_category_4ListEntry;
    list_ForEach(google_product_category_4ListEntry, catalogs_retail_filter_values_map->google_product_category_4) {
    if(cJSON_AddStringToObject(google_product_category_4, "", google_product_category_4ListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // catalogs_retail_filter_values_map->google_product_category_5
    if(catalogs_retail_filter_values_map->google_product_category_5) {
    cJSON *google_product_category_5 = cJSON_AddArrayToObject(item, "google_product_category_5");
    if(google_product_category_5 == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *google_product_category_5ListEntry;
    list_ForEach(google_product_category_5ListEntry, catalogs_retail_filter_values_map->google_product_category_5) {
    if(cJSON_AddStringToObject(google_product_category_5, "", google_product_category_5ListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // catalogs_retail_filter_values_map->google_product_category_6
    if(catalogs_retail_filter_values_map->google_product_category_6) {
    cJSON *google_product_category_6 = cJSON_AddArrayToObject(item, "google_product_category_6");
    if(google_product_category_6 == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *google_product_category_6ListEntry;
    list_ForEach(google_product_category_6ListEntry, catalogs_retail_filter_values_map->google_product_category_6) {
    if(cJSON_AddStringToObject(google_product_category_6, "", google_product_category_6ListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // catalogs_retail_filter_values_map->media_type
    if(catalogs_retail_filter_values_map->media_type != pinterest_rest_api_list_MEDIATYPE_NULL) {
    cJSON *media_type = cJSON_AddArrayToObject(item, "media_type");
    if(media_type == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *media_typeListEntry;
    if (catalogs_retail_filter_values_map->media_type) {
    list_ForEach(media_typeListEntry, catalogs_retail_filter_values_map->media_type) {
    cJSON *itemLocal = media_type_convertToJSON((pinterest_rest_api_catalogs_retail_filter_values_map__e)media_typeListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(media_type, itemLocal);
    }
    }
    }


    // catalogs_retail_filter_values_map->product_type_0
    if(catalogs_retail_filter_values_map->product_type_0) {
    cJSON *product_type_0 = cJSON_AddArrayToObject(item, "product_type_0");
    if(product_type_0 == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *product_type_0ListEntry;
    list_ForEach(product_type_0ListEntry, catalogs_retail_filter_values_map->product_type_0) {
    if(cJSON_AddStringToObject(product_type_0, "", product_type_0ListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // catalogs_retail_filter_values_map->product_type_1
    if(catalogs_retail_filter_values_map->product_type_1) {
    cJSON *product_type_1 = cJSON_AddArrayToObject(item, "product_type_1");
    if(product_type_1 == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *product_type_1ListEntry;
    list_ForEach(product_type_1ListEntry, catalogs_retail_filter_values_map->product_type_1) {
    if(cJSON_AddStringToObject(product_type_1, "", product_type_1ListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // catalogs_retail_filter_values_map->product_type_2
    if(catalogs_retail_filter_values_map->product_type_2) {
    cJSON *product_type_2 = cJSON_AddArrayToObject(item, "product_type_2");
    if(product_type_2 == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *product_type_2ListEntry;
    list_ForEach(product_type_2ListEntry, catalogs_retail_filter_values_map->product_type_2) {
    if(cJSON_AddStringToObject(product_type_2, "", product_type_2ListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // catalogs_retail_filter_values_map->product_type_3
    if(catalogs_retail_filter_values_map->product_type_3) {
    cJSON *product_type_3 = cJSON_AddArrayToObject(item, "product_type_3");
    if(product_type_3 == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *product_type_3ListEntry;
    list_ForEach(product_type_3ListEntry, catalogs_retail_filter_values_map->product_type_3) {
    if(cJSON_AddStringToObject(product_type_3, "", product_type_3ListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // catalogs_retail_filter_values_map->product_type_4
    if(catalogs_retail_filter_values_map->product_type_4) {
    cJSON *product_type_4 = cJSON_AddArrayToObject(item, "product_type_4");
    if(product_type_4 == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *product_type_4ListEntry;
    list_ForEach(product_type_4ListEntry, catalogs_retail_filter_values_map->product_type_4) {
    if(cJSON_AddStringToObject(product_type_4, "", product_type_4ListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_retail_filter_values_map_t *catalogs_retail_filter_values_map_parseFromJSON(cJSON *catalogs_retail_filter_values_mapJSON){

    catalogs_retail_filter_values_map_t *catalogs_retail_filter_values_map_local_var = NULL;

    // define the local list for catalogs_retail_filter_values_map->ad_image_tags
    list_t *ad_image_tagsList = NULL;

    // define the local list for catalogs_retail_filter_values_map->ad_video_tags
    list_t *ad_video_tagsList = NULL;

    // define the local list for catalogs_retail_filter_values_map->availability
    list_t *availabilityList = NULL;

    // define the local list for catalogs_retail_filter_values_map->brand
    list_t *brandList = NULL;

    // define the local list for catalogs_retail_filter_values_map->condition
    list_t *conditionList = NULL;

    // define the local list for catalogs_retail_filter_values_map->custom_label_0
    list_t *custom_label_0List = NULL;

    // define the local list for catalogs_retail_filter_values_map->custom_label_1
    list_t *custom_label_1List = NULL;

    // define the local list for catalogs_retail_filter_values_map->custom_label_2
    list_t *custom_label_2List = NULL;

    // define the local list for catalogs_retail_filter_values_map->custom_label_3
    list_t *custom_label_3List = NULL;

    // define the local list for catalogs_retail_filter_values_map->custom_label_4
    list_t *custom_label_4List = NULL;

    // define the local list for catalogs_retail_filter_values_map->gender
    list_t *genderList = NULL;

    // define the local list for catalogs_retail_filter_values_map->google_product_category_0
    list_t *google_product_category_0List = NULL;

    // define the local list for catalogs_retail_filter_values_map->google_product_category_1
    list_t *google_product_category_1List = NULL;

    // define the local list for catalogs_retail_filter_values_map->google_product_category_2
    list_t *google_product_category_2List = NULL;

    // define the local list for catalogs_retail_filter_values_map->google_product_category_3
    list_t *google_product_category_3List = NULL;

    // define the local list for catalogs_retail_filter_values_map->google_product_category_4
    list_t *google_product_category_4List = NULL;

    // define the local list for catalogs_retail_filter_values_map->google_product_category_5
    list_t *google_product_category_5List = NULL;

    // define the local list for catalogs_retail_filter_values_map->google_product_category_6
    list_t *google_product_category_6List = NULL;

    // define the local list for catalogs_retail_filter_values_map->media_type
    list_t *media_typeList = NULL;

    // define the local list for catalogs_retail_filter_values_map->product_type_0
    list_t *product_type_0List = NULL;

    // define the local list for catalogs_retail_filter_values_map->product_type_1
    list_t *product_type_1List = NULL;

    // define the local list for catalogs_retail_filter_values_map->product_type_2
    list_t *product_type_2List = NULL;

    // define the local list for catalogs_retail_filter_values_map->product_type_3
    list_t *product_type_3List = NULL;

    // define the local list for catalogs_retail_filter_values_map->product_type_4
    list_t *product_type_4List = NULL;

    // catalogs_retail_filter_values_map->ad_image_tags
    cJSON *ad_image_tags = cJSON_GetObjectItemCaseSensitive(catalogs_retail_filter_values_mapJSON, "ad_image_tags");
    if (cJSON_IsNull(ad_image_tags)) {
        ad_image_tags = NULL;
    }
    if (ad_image_tags) { 
    cJSON *ad_image_tags_local = NULL;
    if(!cJSON_IsArray(ad_image_tags)) {
        goto end;//primitive container
    }
    ad_image_tagsList = list_createList();

    cJSON_ArrayForEach(ad_image_tags_local, ad_image_tags)
    {
        if(!cJSON_IsString(ad_image_tags_local))
        {
            goto end;
        }
        list_addElement(ad_image_tagsList , strdup(ad_image_tags_local->valuestring));
    }
    }

    // catalogs_retail_filter_values_map->ad_video_tags
    cJSON *ad_video_tags = cJSON_GetObjectItemCaseSensitive(catalogs_retail_filter_values_mapJSON, "ad_video_tags");
    if (cJSON_IsNull(ad_video_tags)) {
        ad_video_tags = NULL;
    }
    if (ad_video_tags) { 
    cJSON *ad_video_tags_local = NULL;
    if(!cJSON_IsArray(ad_video_tags)) {
        goto end;//primitive container
    }
    ad_video_tagsList = list_createList();

    cJSON_ArrayForEach(ad_video_tags_local, ad_video_tags)
    {
        if(!cJSON_IsString(ad_video_tags_local))
        {
            goto end;
        }
        list_addElement(ad_video_tagsList , strdup(ad_video_tags_local->valuestring));
    }
    }

    // catalogs_retail_filter_values_map->availability
    cJSON *availability = cJSON_GetObjectItemCaseSensitive(catalogs_retail_filter_values_mapJSON, "availability");
    if (cJSON_IsNull(availability)) {
        availability = NULL;
    }
    if (availability) { 
    cJSON *availability_local_nonprimitive = NULL;
    if(!cJSON_IsArray(availability)){
        goto end; //nonprimitive container
    }

    availabilityList = list_createList();

    cJSON_ArrayForEach(availability_local_nonprimitive,availability )
    {
        if(!cJSON_IsObject(availability_local_nonprimitive)){
            goto end;
        }
        catalogs_retail_filter_values_map_product_availability_e availabilityItem = product_availability_parseFromJSON(availability_local_nonprimitive);

        list_addElement(availabilityList, (void *)availabilityItem);
    }
    }

    // catalogs_retail_filter_values_map->brand
    cJSON *brand = cJSON_GetObjectItemCaseSensitive(catalogs_retail_filter_values_mapJSON, "brand");
    if (cJSON_IsNull(brand)) {
        brand = NULL;
    }
    if (brand) { 
    cJSON *brand_local = NULL;
    if(!cJSON_IsArray(brand)) {
        goto end;//primitive container
    }
    brandList = list_createList();

    cJSON_ArrayForEach(brand_local, brand)
    {
        if(!cJSON_IsString(brand_local))
        {
            goto end;
        }
        list_addElement(brandList , strdup(brand_local->valuestring));
    }
    }

    // catalogs_retail_filter_values_map->condition
    cJSON *condition = cJSON_GetObjectItemCaseSensitive(catalogs_retail_filter_values_mapJSON, "condition");
    if (cJSON_IsNull(condition)) {
        condition = NULL;
    }
    if (condition) { 
    cJSON *condition_local_nonprimitive = NULL;
    if(!cJSON_IsArray(condition)){
        goto end; //nonprimitive container
    }

    conditionList = list_createList();

    cJSON_ArrayForEach(condition_local_nonprimitive,condition )
    {
        if(!cJSON_IsObject(condition_local_nonprimitive)){
            goto end;
        }
        catalogs_retail_filter_values_map_product_condition_e conditionItem = product_condition_parseFromJSON(condition_local_nonprimitive);

        list_addElement(conditionList, (void *)conditionItem);
    }
    }

    // catalogs_retail_filter_values_map->custom_label_0
    cJSON *custom_label_0 = cJSON_GetObjectItemCaseSensitive(catalogs_retail_filter_values_mapJSON, "custom_label_0");
    if (cJSON_IsNull(custom_label_0)) {
        custom_label_0 = NULL;
    }
    if (custom_label_0) { 
    cJSON *custom_label_0_local = NULL;
    if(!cJSON_IsArray(custom_label_0)) {
        goto end;//primitive container
    }
    custom_label_0List = list_createList();

    cJSON_ArrayForEach(custom_label_0_local, custom_label_0)
    {
        if(!cJSON_IsString(custom_label_0_local))
        {
            goto end;
        }
        list_addElement(custom_label_0List , strdup(custom_label_0_local->valuestring));
    }
    }

    // catalogs_retail_filter_values_map->custom_label_1
    cJSON *custom_label_1 = cJSON_GetObjectItemCaseSensitive(catalogs_retail_filter_values_mapJSON, "custom_label_1");
    if (cJSON_IsNull(custom_label_1)) {
        custom_label_1 = NULL;
    }
    if (custom_label_1) { 
    cJSON *custom_label_1_local = NULL;
    if(!cJSON_IsArray(custom_label_1)) {
        goto end;//primitive container
    }
    custom_label_1List = list_createList();

    cJSON_ArrayForEach(custom_label_1_local, custom_label_1)
    {
        if(!cJSON_IsString(custom_label_1_local))
        {
            goto end;
        }
        list_addElement(custom_label_1List , strdup(custom_label_1_local->valuestring));
    }
    }

    // catalogs_retail_filter_values_map->custom_label_2
    cJSON *custom_label_2 = cJSON_GetObjectItemCaseSensitive(catalogs_retail_filter_values_mapJSON, "custom_label_2");
    if (cJSON_IsNull(custom_label_2)) {
        custom_label_2 = NULL;
    }
    if (custom_label_2) { 
    cJSON *custom_label_2_local = NULL;
    if(!cJSON_IsArray(custom_label_2)) {
        goto end;//primitive container
    }
    custom_label_2List = list_createList();

    cJSON_ArrayForEach(custom_label_2_local, custom_label_2)
    {
        if(!cJSON_IsString(custom_label_2_local))
        {
            goto end;
        }
        list_addElement(custom_label_2List , strdup(custom_label_2_local->valuestring));
    }
    }

    // catalogs_retail_filter_values_map->custom_label_3
    cJSON *custom_label_3 = cJSON_GetObjectItemCaseSensitive(catalogs_retail_filter_values_mapJSON, "custom_label_3");
    if (cJSON_IsNull(custom_label_3)) {
        custom_label_3 = NULL;
    }
    if (custom_label_3) { 
    cJSON *custom_label_3_local = NULL;
    if(!cJSON_IsArray(custom_label_3)) {
        goto end;//primitive container
    }
    custom_label_3List = list_createList();

    cJSON_ArrayForEach(custom_label_3_local, custom_label_3)
    {
        if(!cJSON_IsString(custom_label_3_local))
        {
            goto end;
        }
        list_addElement(custom_label_3List , strdup(custom_label_3_local->valuestring));
    }
    }

    // catalogs_retail_filter_values_map->custom_label_4
    cJSON *custom_label_4 = cJSON_GetObjectItemCaseSensitive(catalogs_retail_filter_values_mapJSON, "custom_label_4");
    if (cJSON_IsNull(custom_label_4)) {
        custom_label_4 = NULL;
    }
    if (custom_label_4) { 
    cJSON *custom_label_4_local = NULL;
    if(!cJSON_IsArray(custom_label_4)) {
        goto end;//primitive container
    }
    custom_label_4List = list_createList();

    cJSON_ArrayForEach(custom_label_4_local, custom_label_4)
    {
        if(!cJSON_IsString(custom_label_4_local))
        {
            goto end;
        }
        list_addElement(custom_label_4List , strdup(custom_label_4_local->valuestring));
    }
    }

    // catalogs_retail_filter_values_map->gender
    cJSON *gender = cJSON_GetObjectItemCaseSensitive(catalogs_retail_filter_values_mapJSON, "gender");
    if (cJSON_IsNull(gender)) {
        gender = NULL;
    }
    if (gender) { 
    cJSON *gender_local_nonprimitive = NULL;
    if(!cJSON_IsArray(gender)){
        goto end; //nonprimitive container
    }

    genderList = list_createList();

    cJSON_ArrayForEach(gender_local_nonprimitive,gender )
    {
        if(!cJSON_IsObject(gender_local_nonprimitive)){
            goto end;
        }
        catalogs_retail_filter_values_map_gender_e genderItem = gender_parseFromJSON(gender_local_nonprimitive);

        list_addElement(genderList, (void *)genderItem);
    }
    }

    // catalogs_retail_filter_values_map->google_product_category_0
    cJSON *google_product_category_0 = cJSON_GetObjectItemCaseSensitive(catalogs_retail_filter_values_mapJSON, "google_product_category_0");
    if (cJSON_IsNull(google_product_category_0)) {
        google_product_category_0 = NULL;
    }
    if (google_product_category_0) { 
    cJSON *google_product_category_0_local = NULL;
    if(!cJSON_IsArray(google_product_category_0)) {
        goto end;//primitive container
    }
    google_product_category_0List = list_createList();

    cJSON_ArrayForEach(google_product_category_0_local, google_product_category_0)
    {
        if(!cJSON_IsString(google_product_category_0_local))
        {
            goto end;
        }
        list_addElement(google_product_category_0List , strdup(google_product_category_0_local->valuestring));
    }
    }

    // catalogs_retail_filter_values_map->google_product_category_1
    cJSON *google_product_category_1 = cJSON_GetObjectItemCaseSensitive(catalogs_retail_filter_values_mapJSON, "google_product_category_1");
    if (cJSON_IsNull(google_product_category_1)) {
        google_product_category_1 = NULL;
    }
    if (google_product_category_1) { 
    cJSON *google_product_category_1_local = NULL;
    if(!cJSON_IsArray(google_product_category_1)) {
        goto end;//primitive container
    }
    google_product_category_1List = list_createList();

    cJSON_ArrayForEach(google_product_category_1_local, google_product_category_1)
    {
        if(!cJSON_IsString(google_product_category_1_local))
        {
            goto end;
        }
        list_addElement(google_product_category_1List , strdup(google_product_category_1_local->valuestring));
    }
    }

    // catalogs_retail_filter_values_map->google_product_category_2
    cJSON *google_product_category_2 = cJSON_GetObjectItemCaseSensitive(catalogs_retail_filter_values_mapJSON, "google_product_category_2");
    if (cJSON_IsNull(google_product_category_2)) {
        google_product_category_2 = NULL;
    }
    if (google_product_category_2) { 
    cJSON *google_product_category_2_local = NULL;
    if(!cJSON_IsArray(google_product_category_2)) {
        goto end;//primitive container
    }
    google_product_category_2List = list_createList();

    cJSON_ArrayForEach(google_product_category_2_local, google_product_category_2)
    {
        if(!cJSON_IsString(google_product_category_2_local))
        {
            goto end;
        }
        list_addElement(google_product_category_2List , strdup(google_product_category_2_local->valuestring));
    }
    }

    // catalogs_retail_filter_values_map->google_product_category_3
    cJSON *google_product_category_3 = cJSON_GetObjectItemCaseSensitive(catalogs_retail_filter_values_mapJSON, "google_product_category_3");
    if (cJSON_IsNull(google_product_category_3)) {
        google_product_category_3 = NULL;
    }
    if (google_product_category_3) { 
    cJSON *google_product_category_3_local = NULL;
    if(!cJSON_IsArray(google_product_category_3)) {
        goto end;//primitive container
    }
    google_product_category_3List = list_createList();

    cJSON_ArrayForEach(google_product_category_3_local, google_product_category_3)
    {
        if(!cJSON_IsString(google_product_category_3_local))
        {
            goto end;
        }
        list_addElement(google_product_category_3List , strdup(google_product_category_3_local->valuestring));
    }
    }

    // catalogs_retail_filter_values_map->google_product_category_4
    cJSON *google_product_category_4 = cJSON_GetObjectItemCaseSensitive(catalogs_retail_filter_values_mapJSON, "google_product_category_4");
    if (cJSON_IsNull(google_product_category_4)) {
        google_product_category_4 = NULL;
    }
    if (google_product_category_4) { 
    cJSON *google_product_category_4_local = NULL;
    if(!cJSON_IsArray(google_product_category_4)) {
        goto end;//primitive container
    }
    google_product_category_4List = list_createList();

    cJSON_ArrayForEach(google_product_category_4_local, google_product_category_4)
    {
        if(!cJSON_IsString(google_product_category_4_local))
        {
            goto end;
        }
        list_addElement(google_product_category_4List , strdup(google_product_category_4_local->valuestring));
    }
    }

    // catalogs_retail_filter_values_map->google_product_category_5
    cJSON *google_product_category_5 = cJSON_GetObjectItemCaseSensitive(catalogs_retail_filter_values_mapJSON, "google_product_category_5");
    if (cJSON_IsNull(google_product_category_5)) {
        google_product_category_5 = NULL;
    }
    if (google_product_category_5) { 
    cJSON *google_product_category_5_local = NULL;
    if(!cJSON_IsArray(google_product_category_5)) {
        goto end;//primitive container
    }
    google_product_category_5List = list_createList();

    cJSON_ArrayForEach(google_product_category_5_local, google_product_category_5)
    {
        if(!cJSON_IsString(google_product_category_5_local))
        {
            goto end;
        }
        list_addElement(google_product_category_5List , strdup(google_product_category_5_local->valuestring));
    }
    }

    // catalogs_retail_filter_values_map->google_product_category_6
    cJSON *google_product_category_6 = cJSON_GetObjectItemCaseSensitive(catalogs_retail_filter_values_mapJSON, "google_product_category_6");
    if (cJSON_IsNull(google_product_category_6)) {
        google_product_category_6 = NULL;
    }
    if (google_product_category_6) { 
    cJSON *google_product_category_6_local = NULL;
    if(!cJSON_IsArray(google_product_category_6)) {
        goto end;//primitive container
    }
    google_product_category_6List = list_createList();

    cJSON_ArrayForEach(google_product_category_6_local, google_product_category_6)
    {
        if(!cJSON_IsString(google_product_category_6_local))
        {
            goto end;
        }
        list_addElement(google_product_category_6List , strdup(google_product_category_6_local->valuestring));
    }
    }

    // catalogs_retail_filter_values_map->media_type
    cJSON *media_type = cJSON_GetObjectItemCaseSensitive(catalogs_retail_filter_values_mapJSON, "media_type");
    if (cJSON_IsNull(media_type)) {
        media_type = NULL;
    }
    if (media_type) { 
    cJSON *media_type_local_nonprimitive = NULL;
    if(!cJSON_IsArray(media_type)){
        goto end; //nonprimitive container
    }

    media_typeList = list_createList();

    cJSON_ArrayForEach(media_type_local_nonprimitive,media_type )
    {
        if(!cJSON_IsObject(media_type_local_nonprimitive)){
            goto end;
        }
        catalogs_retail_filter_values_map_media_type_e media_typeItem = media_type_parseFromJSON(media_type_local_nonprimitive);

        list_addElement(media_typeList, (void *)media_typeItem);
    }
    }

    // catalogs_retail_filter_values_map->product_type_0
    cJSON *product_type_0 = cJSON_GetObjectItemCaseSensitive(catalogs_retail_filter_values_mapJSON, "product_type_0");
    if (cJSON_IsNull(product_type_0)) {
        product_type_0 = NULL;
    }
    if (product_type_0) { 
    cJSON *product_type_0_local = NULL;
    if(!cJSON_IsArray(product_type_0)) {
        goto end;//primitive container
    }
    product_type_0List = list_createList();

    cJSON_ArrayForEach(product_type_0_local, product_type_0)
    {
        if(!cJSON_IsString(product_type_0_local))
        {
            goto end;
        }
        list_addElement(product_type_0List , strdup(product_type_0_local->valuestring));
    }
    }

    // catalogs_retail_filter_values_map->product_type_1
    cJSON *product_type_1 = cJSON_GetObjectItemCaseSensitive(catalogs_retail_filter_values_mapJSON, "product_type_1");
    if (cJSON_IsNull(product_type_1)) {
        product_type_1 = NULL;
    }
    if (product_type_1) { 
    cJSON *product_type_1_local = NULL;
    if(!cJSON_IsArray(product_type_1)) {
        goto end;//primitive container
    }
    product_type_1List = list_createList();

    cJSON_ArrayForEach(product_type_1_local, product_type_1)
    {
        if(!cJSON_IsString(product_type_1_local))
        {
            goto end;
        }
        list_addElement(product_type_1List , strdup(product_type_1_local->valuestring));
    }
    }

    // catalogs_retail_filter_values_map->product_type_2
    cJSON *product_type_2 = cJSON_GetObjectItemCaseSensitive(catalogs_retail_filter_values_mapJSON, "product_type_2");
    if (cJSON_IsNull(product_type_2)) {
        product_type_2 = NULL;
    }
    if (product_type_2) { 
    cJSON *product_type_2_local = NULL;
    if(!cJSON_IsArray(product_type_2)) {
        goto end;//primitive container
    }
    product_type_2List = list_createList();

    cJSON_ArrayForEach(product_type_2_local, product_type_2)
    {
        if(!cJSON_IsString(product_type_2_local))
        {
            goto end;
        }
        list_addElement(product_type_2List , strdup(product_type_2_local->valuestring));
    }
    }

    // catalogs_retail_filter_values_map->product_type_3
    cJSON *product_type_3 = cJSON_GetObjectItemCaseSensitive(catalogs_retail_filter_values_mapJSON, "product_type_3");
    if (cJSON_IsNull(product_type_3)) {
        product_type_3 = NULL;
    }
    if (product_type_3) { 
    cJSON *product_type_3_local = NULL;
    if(!cJSON_IsArray(product_type_3)) {
        goto end;//primitive container
    }
    product_type_3List = list_createList();

    cJSON_ArrayForEach(product_type_3_local, product_type_3)
    {
        if(!cJSON_IsString(product_type_3_local))
        {
            goto end;
        }
        list_addElement(product_type_3List , strdup(product_type_3_local->valuestring));
    }
    }

    // catalogs_retail_filter_values_map->product_type_4
    cJSON *product_type_4 = cJSON_GetObjectItemCaseSensitive(catalogs_retail_filter_values_mapJSON, "product_type_4");
    if (cJSON_IsNull(product_type_4)) {
        product_type_4 = NULL;
    }
    if (product_type_4) { 
    cJSON *product_type_4_local = NULL;
    if(!cJSON_IsArray(product_type_4)) {
        goto end;//primitive container
    }
    product_type_4List = list_createList();

    cJSON_ArrayForEach(product_type_4_local, product_type_4)
    {
        if(!cJSON_IsString(product_type_4_local))
        {
            goto end;
        }
        list_addElement(product_type_4List , strdup(product_type_4_local->valuestring));
    }
    }



    catalogs_retail_filter_values_map_local_var = catalogs_retail_filter_values_map_create_internal (
        ad_image_tags ? ad_image_tagsList : NULL,
        ad_video_tags ? ad_video_tagsList : NULL,
        availability ? availabilityList : NULL,
        brand ? brandList : NULL,
        condition ? conditionList : NULL,
        custom_label_0 ? custom_label_0List : NULL,
        custom_label_1 ? custom_label_1List : NULL,
        custom_label_2 ? custom_label_2List : NULL,
        custom_label_3 ? custom_label_3List : NULL,
        custom_label_4 ? custom_label_4List : NULL,
        gender ? genderList : NULL,
        google_product_category_0 ? google_product_category_0List : NULL,
        google_product_category_1 ? google_product_category_1List : NULL,
        google_product_category_2 ? google_product_category_2List : NULL,
        google_product_category_3 ? google_product_category_3List : NULL,
        google_product_category_4 ? google_product_category_4List : NULL,
        google_product_category_5 ? google_product_category_5List : NULL,
        google_product_category_6 ? google_product_category_6List : NULL,
        media_type ? media_typeList : NULL,
        product_type_0 ? product_type_0List : NULL,
        product_type_1 ? product_type_1List : NULL,
        product_type_2 ? product_type_2List : NULL,
        product_type_3 ? product_type_3List : NULL,
        product_type_4 ? product_type_4List : NULL
        );

    if (!catalogs_retail_filter_values_map_local_var) {
        goto end;
    }

    return catalogs_retail_filter_values_map_local_var;
end:
    if (ad_image_tagsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, ad_image_tagsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(ad_image_tagsList);
        ad_image_tagsList = NULL;
    }
    if (ad_video_tagsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, ad_video_tagsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(ad_video_tagsList);
        ad_video_tagsList = NULL;
    }
    if (availabilityList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, availabilityList) {
            product_availability_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(availabilityList);
        availabilityList = NULL;
    }
    if (brandList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, brandList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(brandList);
        brandList = NULL;
    }
    if (conditionList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, conditionList) {
            product_condition_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(conditionList);
        conditionList = NULL;
    }
    if (custom_label_0List) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, custom_label_0List) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(custom_label_0List);
        custom_label_0List = NULL;
    }
    if (custom_label_1List) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, custom_label_1List) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(custom_label_1List);
        custom_label_1List = NULL;
    }
    if (custom_label_2List) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, custom_label_2List) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(custom_label_2List);
        custom_label_2List = NULL;
    }
    if (custom_label_3List) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, custom_label_3List) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(custom_label_3List);
        custom_label_3List = NULL;
    }
    if (custom_label_4List) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, custom_label_4List) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(custom_label_4List);
        custom_label_4List = NULL;
    }
    if (genderList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, genderList) {
            gender_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(genderList);
        genderList = NULL;
    }
    if (google_product_category_0List) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, google_product_category_0List) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(google_product_category_0List);
        google_product_category_0List = NULL;
    }
    if (google_product_category_1List) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, google_product_category_1List) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(google_product_category_1List);
        google_product_category_1List = NULL;
    }
    if (google_product_category_2List) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, google_product_category_2List) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(google_product_category_2List);
        google_product_category_2List = NULL;
    }
    if (google_product_category_3List) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, google_product_category_3List) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(google_product_category_3List);
        google_product_category_3List = NULL;
    }
    if (google_product_category_4List) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, google_product_category_4List) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(google_product_category_4List);
        google_product_category_4List = NULL;
    }
    if (google_product_category_5List) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, google_product_category_5List) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(google_product_category_5List);
        google_product_category_5List = NULL;
    }
    if (google_product_category_6List) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, google_product_category_6List) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(google_product_category_6List);
        google_product_category_6List = NULL;
    }
    if (media_typeList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, media_typeList) {
            media_type_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(media_typeList);
        media_typeList = NULL;
    }
    if (product_type_0List) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, product_type_0List) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(product_type_0List);
        product_type_0List = NULL;
    }
    if (product_type_1List) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, product_type_1List) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(product_type_1List);
        product_type_1List = NULL;
    }
    if (product_type_2List) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, product_type_2List) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(product_type_2List);
        product_type_2List = NULL;
    }
    if (product_type_3List) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, product_type_3List) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(product_type_3List);
        product_type_3List = NULL;
    }
    if (product_type_4List) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, product_type_4List) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(product_type_4List);
        product_type_4List = NULL;
    }
    return NULL;

}
