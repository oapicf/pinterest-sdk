/*
 * catalogs_creative_assets_attributes.h
 *
 * 
 */

#ifndef _catalogs_creative_assets_attributes_H_
#define _catalogs_creative_assets_attributes_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_creative_assets_attributes_t catalogs_creative_assets_attributes_t;




typedef struct catalogs_creative_assets_attributes_t {
    char *title; // string
    char *description; // string
    char *link; // string
    char *ios_deep_link; // string
    char *android_deep_link; // string
    char *google_product_category; // string
    char *custom_label_0; // string
    char *custom_label_1; // string
    char *custom_label_2; // string
    char *custom_label_3; // string
    char *custom_label_4; // string
    char *visibility; // string
    char *image_link; // string
    char *video_link; // string

} catalogs_creative_assets_attributes_t;

catalogs_creative_assets_attributes_t *catalogs_creative_assets_attributes_create(
    char *title,
    char *description,
    char *link,
    char *ios_deep_link,
    char *android_deep_link,
    char *google_product_category,
    char *custom_label_0,
    char *custom_label_1,
    char *custom_label_2,
    char *custom_label_3,
    char *custom_label_4,
    char *visibility,
    char *image_link,
    char *video_link
);

void catalogs_creative_assets_attributes_free(catalogs_creative_assets_attributes_t *catalogs_creative_assets_attributes);

catalogs_creative_assets_attributes_t *catalogs_creative_assets_attributes_parseFromJSON(cJSON *catalogs_creative_assets_attributesJSON);

cJSON *catalogs_creative_assets_attributes_convertToJSON(catalogs_creative_assets_attributes_t *catalogs_creative_assets_attributes);

#endif /* _catalogs_creative_assets_attributes_H_ */

