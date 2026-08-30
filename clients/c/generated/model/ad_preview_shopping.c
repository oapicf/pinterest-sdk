#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_preview_shopping.h"



static ad_preview_shopping_t *ad_preview_shopping_create_internal(
    char *catalog_product_group_id,
    ad_shopping_preview_creative_type_t *creative_type,
    customizable_cta_type_t *customizable_cta_type,
    char *hero_image_title,
    char *hero_image_url,
    char *hero_pin_id,
    char *image_tag,
    char *item_id,
    base_preferred_media_type_t *preferred_media_type,
    int *show_promotion,
    char *video_tag
    ) {
    ad_preview_shopping_t *ad_preview_shopping_local_var = malloc(sizeof(ad_preview_shopping_t));
    if (!ad_preview_shopping_local_var) {
        return NULL;
    }
    memset(ad_preview_shopping_local_var, 0, sizeof(ad_preview_shopping_t));
    ad_preview_shopping_local_var->_library_owned = 1;
    ad_preview_shopping_local_var->catalog_product_group_id = catalog_product_group_id;
    ad_preview_shopping_local_var->creative_type = creative_type;
    ad_preview_shopping_local_var->customizable_cta_type = customizable_cta_type;
    ad_preview_shopping_local_var->hero_image_title = hero_image_title;
    ad_preview_shopping_local_var->hero_image_url = hero_image_url;
    ad_preview_shopping_local_var->hero_pin_id = hero_pin_id;
    ad_preview_shopping_local_var->image_tag = image_tag;
    ad_preview_shopping_local_var->item_id = item_id;
    ad_preview_shopping_local_var->preferred_media_type = preferred_media_type;
    ad_preview_shopping_local_var->show_promotion = show_promotion;
    ad_preview_shopping_local_var->video_tag = video_tag;
    return ad_preview_shopping_local_var;
}

__attribute__((deprecated)) ad_preview_shopping_t *ad_preview_shopping_create(
    char *catalog_product_group_id,
    ad_shopping_preview_creative_type_t *creative_type,
    customizable_cta_type_t *customizable_cta_type,
    char *hero_image_title,
    char *hero_image_url,
    char *hero_pin_id,
    char *image_tag,
    char *item_id,
    base_preferred_media_type_t *preferred_media_type,
    int *show_promotion,
    char *video_tag
    ) {
    int *show_promotion_copy = NULL;
    if (show_promotion) {
        show_promotion_copy = malloc(sizeof(int));
        if (show_promotion_copy) *show_promotion_copy = *show_promotion;
    }
    ad_preview_shopping_t *result = ad_preview_shopping_create_internal (
        catalog_product_group_id,
        creative_type,
        customizable_cta_type,
        hero_image_title,
        hero_image_url,
        hero_pin_id,
        image_tag,
        item_id,
        preferred_media_type,
        show_promotion_copy,
        video_tag
        );
    if (!result) {
        free(show_promotion_copy);
    }
    return result;
}

void ad_preview_shopping_free(ad_preview_shopping_t *ad_preview_shopping) {
    if(NULL == ad_preview_shopping){
        return ;
    }
    if(ad_preview_shopping->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ad_preview_shopping_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ad_preview_shopping->catalog_product_group_id) {
        free(ad_preview_shopping->catalog_product_group_id);
        ad_preview_shopping->catalog_product_group_id = NULL;
    }
    if (ad_preview_shopping->creative_type) {
        ad_shopping_preview_creative_type_free(ad_preview_shopping->creative_type);
        ad_preview_shopping->creative_type = NULL;
    }
    if (ad_preview_shopping->customizable_cta_type) {
        customizable_cta_type_free(ad_preview_shopping->customizable_cta_type);
        ad_preview_shopping->customizable_cta_type = NULL;
    }
    if (ad_preview_shopping->hero_image_title) {
        free(ad_preview_shopping->hero_image_title);
        ad_preview_shopping->hero_image_title = NULL;
    }
    if (ad_preview_shopping->hero_image_url) {
        free(ad_preview_shopping->hero_image_url);
        ad_preview_shopping->hero_image_url = NULL;
    }
    if (ad_preview_shopping->hero_pin_id) {
        free(ad_preview_shopping->hero_pin_id);
        ad_preview_shopping->hero_pin_id = NULL;
    }
    if (ad_preview_shopping->image_tag) {
        free(ad_preview_shopping->image_tag);
        ad_preview_shopping->image_tag = NULL;
    }
    if (ad_preview_shopping->item_id) {
        free(ad_preview_shopping->item_id);
        ad_preview_shopping->item_id = NULL;
    }
    if (ad_preview_shopping->preferred_media_type) {
        base_preferred_media_type_free(ad_preview_shopping->preferred_media_type);
        ad_preview_shopping->preferred_media_type = NULL;
    }
    if (ad_preview_shopping->show_promotion) {
        free(ad_preview_shopping->show_promotion);
        ad_preview_shopping->show_promotion = NULL;
    }
    if (ad_preview_shopping->video_tag) {
        free(ad_preview_shopping->video_tag);
        ad_preview_shopping->video_tag = NULL;
    }
    free(ad_preview_shopping);
}

cJSON *ad_preview_shopping_convertToJSON(ad_preview_shopping_t *ad_preview_shopping) {
    cJSON *item = cJSON_CreateObject();

    // ad_preview_shopping->catalog_product_group_id
    if (!ad_preview_shopping->catalog_product_group_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_product_group_id", ad_preview_shopping->catalog_product_group_id) == NULL) {
    goto fail; //String
    }


    // ad_preview_shopping->creative_type
    if (!ad_preview_shopping->creative_type) {
        goto fail;
    }
    cJSON *creative_type_local_JSON = ad_shopping_preview_creative_type_convertToJSON(ad_preview_shopping->creative_type);
    if(creative_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "creative_type", creative_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // ad_preview_shopping->customizable_cta_type
    if(ad_preview_shopping->customizable_cta_type) {
    cJSON *customizable_cta_type_local_JSON = customizable_cta_type_convertToJSON(ad_preview_shopping->customizable_cta_type);
    if(customizable_cta_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "customizable_cta_type", customizable_cta_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_preview_shopping->hero_image_title
    if(ad_preview_shopping->hero_image_title) {
    if(cJSON_AddStringToObject(item, "hero_image_title", ad_preview_shopping->hero_image_title) == NULL) {
    goto fail; //String
    }
    }


    // ad_preview_shopping->hero_image_url
    if(ad_preview_shopping->hero_image_url) {
    if(cJSON_AddStringToObject(item, "hero_image_url", ad_preview_shopping->hero_image_url) == NULL) {
    goto fail; //String
    }
    }


    // ad_preview_shopping->hero_pin_id
    if(ad_preview_shopping->hero_pin_id) {
    if(cJSON_AddStringToObject(item, "hero_pin_id", ad_preview_shopping->hero_pin_id) == NULL) {
    goto fail; //String
    }
    }


    // ad_preview_shopping->image_tag
    if(ad_preview_shopping->image_tag) {
    if(cJSON_AddStringToObject(item, "image_tag", ad_preview_shopping->image_tag) == NULL) {
    goto fail; //String
    }
    }


    // ad_preview_shopping->item_id
    if(ad_preview_shopping->item_id) {
    if(cJSON_AddStringToObject(item, "item_id", ad_preview_shopping->item_id) == NULL) {
    goto fail; //String
    }
    }


    // ad_preview_shopping->preferred_media_type
    if(ad_preview_shopping->preferred_media_type) {
    cJSON *preferred_media_type_local_JSON = base_preferred_media_type_convertToJSON(ad_preview_shopping->preferred_media_type);
    if(preferred_media_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "preferred_media_type", preferred_media_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_preview_shopping->show_promotion
    if(ad_preview_shopping->show_promotion) {
    if(cJSON_AddBoolToObject(item, "show_promotion", *ad_preview_shopping->show_promotion) == NULL) {
    goto fail; //Bool
    }
    }


    // ad_preview_shopping->video_tag
    if(ad_preview_shopping->video_tag) {
    if(cJSON_AddStringToObject(item, "video_tag", ad_preview_shopping->video_tag) == NULL) {
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

ad_preview_shopping_t *ad_preview_shopping_parseFromJSON(cJSON *ad_preview_shoppingJSON){

    ad_preview_shopping_t *ad_preview_shopping_local_var = NULL;

    char *catalog_product_group_id_local_str = NULL;

    // define the local variable for ad_preview_shopping->creative_type
    ad_shopping_preview_creative_type_t *creative_type_local_nonprim = NULL;

    // define the local variable for ad_preview_shopping->customizable_cta_type
    customizable_cta_type_t *customizable_cta_type_local_nonprim = NULL;

    char *hero_image_title_local_str = NULL;

    char *hero_image_url_local_str = NULL;

    char *hero_pin_id_local_str = NULL;

    char *image_tag_local_str = NULL;

    char *item_id_local_str = NULL;

    // define the local variable for ad_preview_shopping->preferred_media_type
    base_preferred_media_type_t *preferred_media_type_local_nonprim = NULL;

    // define the local variable for ad_preview_shopping->show_promotion
    int *show_promotion_local_var = NULL;

    char *video_tag_local_str = NULL;

    // ad_preview_shopping->catalog_product_group_id
    cJSON *catalog_product_group_id = cJSON_GetObjectItemCaseSensitive(ad_preview_shoppingJSON, "catalog_product_group_id");
    if (cJSON_IsNull(catalog_product_group_id)) {
        catalog_product_group_id = NULL;
    }
    if (!catalog_product_group_id) {
        goto end;
    }

    
    if(!cJSON_IsString(catalog_product_group_id))
    {
    goto end; //String
    }

    // ad_preview_shopping->creative_type
    cJSON *creative_type = cJSON_GetObjectItemCaseSensitive(ad_preview_shoppingJSON, "creative_type");
    if (cJSON_IsNull(creative_type)) {
        creative_type = NULL;
    }
    if (!creative_type) {
        goto end;
    }

    
    creative_type_local_nonprim = ad_shopping_preview_creative_type_parseFromJSON(creative_type); //custom

    // ad_preview_shopping->customizable_cta_type
    cJSON *customizable_cta_type = cJSON_GetObjectItemCaseSensitive(ad_preview_shoppingJSON, "customizable_cta_type");
    if (cJSON_IsNull(customizable_cta_type)) {
        customizable_cta_type = NULL;
    }
    if (customizable_cta_type) { 
    customizable_cta_type_local_nonprim = customizable_cta_type_parseFromJSON(customizable_cta_type); //custom
    }

    // ad_preview_shopping->hero_image_title
    cJSON *hero_image_title = cJSON_GetObjectItemCaseSensitive(ad_preview_shoppingJSON, "hero_image_title");
    if (cJSON_IsNull(hero_image_title)) {
        hero_image_title = NULL;
    }
    if (hero_image_title) { 
    if(!cJSON_IsString(hero_image_title) && !cJSON_IsNull(hero_image_title))
    {
    goto end; //String
    }
    }

    // ad_preview_shopping->hero_image_url
    cJSON *hero_image_url = cJSON_GetObjectItemCaseSensitive(ad_preview_shoppingJSON, "hero_image_url");
    if (cJSON_IsNull(hero_image_url)) {
        hero_image_url = NULL;
    }
    if (hero_image_url) { 
    if(!cJSON_IsString(hero_image_url) && !cJSON_IsNull(hero_image_url))
    {
    goto end; //String
    }
    }

    // ad_preview_shopping->hero_pin_id
    cJSON *hero_pin_id = cJSON_GetObjectItemCaseSensitive(ad_preview_shoppingJSON, "hero_pin_id");
    if (cJSON_IsNull(hero_pin_id)) {
        hero_pin_id = NULL;
    }
    if (hero_pin_id) { 
    if(!cJSON_IsString(hero_pin_id) && !cJSON_IsNull(hero_pin_id))
    {
    goto end; //String
    }
    }

    // ad_preview_shopping->image_tag
    cJSON *image_tag = cJSON_GetObjectItemCaseSensitive(ad_preview_shoppingJSON, "image_tag");
    if (cJSON_IsNull(image_tag)) {
        image_tag = NULL;
    }
    if (image_tag) { 
    if(!cJSON_IsString(image_tag) && !cJSON_IsNull(image_tag))
    {
    goto end; //String
    }
    }

    // ad_preview_shopping->item_id
    cJSON *item_id = cJSON_GetObjectItemCaseSensitive(ad_preview_shoppingJSON, "item_id");
    if (cJSON_IsNull(item_id)) {
        item_id = NULL;
    }
    if (item_id) { 
    if(!cJSON_IsString(item_id) && !cJSON_IsNull(item_id))
    {
    goto end; //String
    }
    }

    // ad_preview_shopping->preferred_media_type
    cJSON *preferred_media_type = cJSON_GetObjectItemCaseSensitive(ad_preview_shoppingJSON, "preferred_media_type");
    if (cJSON_IsNull(preferred_media_type)) {
        preferred_media_type = NULL;
    }
    if (preferred_media_type) { 
    preferred_media_type_local_nonprim = base_preferred_media_type_parseFromJSON(preferred_media_type); //custom
    }

    // ad_preview_shopping->show_promotion
    cJSON *show_promotion = cJSON_GetObjectItemCaseSensitive(ad_preview_shoppingJSON, "show_promotion");
    if (cJSON_IsNull(show_promotion)) {
        show_promotion = NULL;
    }
    if (show_promotion) { 
    if(!cJSON_IsBool(show_promotion))
    {
    goto end; //Bool
    }
    show_promotion_local_var = malloc(sizeof(int));
    if(!show_promotion_local_var)
    {
        goto end;
    }
    *show_promotion_local_var = show_promotion->valueint;
    }

    // ad_preview_shopping->video_tag
    cJSON *video_tag = cJSON_GetObjectItemCaseSensitive(ad_preview_shoppingJSON, "video_tag");
    if (cJSON_IsNull(video_tag)) {
        video_tag = NULL;
    }
    if (video_tag) { 
    if(!cJSON_IsString(video_tag) && !cJSON_IsNull(video_tag))
    {
    goto end; //String
    }
    }


    if (catalog_product_group_id && !cJSON_IsNull(catalog_product_group_id)) catalog_product_group_id_local_str = strdup(catalog_product_group_id->valuestring);
    if (hero_image_title && !cJSON_IsNull(hero_image_title)) hero_image_title_local_str = strdup(hero_image_title->valuestring);
    if (hero_image_url && !cJSON_IsNull(hero_image_url)) hero_image_url_local_str = strdup(hero_image_url->valuestring);
    if (hero_pin_id && !cJSON_IsNull(hero_pin_id)) hero_pin_id_local_str = strdup(hero_pin_id->valuestring);
    if (image_tag && !cJSON_IsNull(image_tag)) image_tag_local_str = strdup(image_tag->valuestring);
    if (item_id && !cJSON_IsNull(item_id)) item_id_local_str = strdup(item_id->valuestring);
    if (video_tag && !cJSON_IsNull(video_tag)) video_tag_local_str = strdup(video_tag->valuestring);

    ad_preview_shopping_local_var = ad_preview_shopping_create_internal (
        catalog_product_group_id_local_str,
        creative_type_local_nonprim,
        customizable_cta_type ? customizable_cta_type_local_nonprim : NULL,
        hero_image_title_local_str,
        hero_image_url_local_str,
        hero_pin_id_local_str,
        image_tag_local_str,
        item_id_local_str,
        preferred_media_type ? preferred_media_type_local_nonprim : NULL,
        show_promotion_local_var,
        video_tag_local_str
        );

    if (!ad_preview_shopping_local_var) {
        goto end;
    }

    return ad_preview_shopping_local_var;
end:
    if (catalog_product_group_id_local_str) {
        free(catalog_product_group_id_local_str);
        catalog_product_group_id_local_str = NULL;
    }
    if (creative_type_local_nonprim) {
        ad_shopping_preview_creative_type_free(creative_type_local_nonprim);
        creative_type_local_nonprim = NULL;
    }
    if (customizable_cta_type_local_nonprim) {
        customizable_cta_type_free(customizable_cta_type_local_nonprim);
        customizable_cta_type_local_nonprim = NULL;
    }
    if (hero_image_title_local_str) {
        free(hero_image_title_local_str);
        hero_image_title_local_str = NULL;
    }
    if (hero_image_url_local_str) {
        free(hero_image_url_local_str);
        hero_image_url_local_str = NULL;
    }
    if (hero_pin_id_local_str) {
        free(hero_pin_id_local_str);
        hero_pin_id_local_str = NULL;
    }
    if (image_tag_local_str) {
        free(image_tag_local_str);
        image_tag_local_str = NULL;
    }
    if (item_id_local_str) {
        free(item_id_local_str);
        item_id_local_str = NULL;
    }
    if (preferred_media_type_local_nonprim) {
        base_preferred_media_type_free(preferred_media_type_local_nonprim);
        preferred_media_type_local_nonprim = NULL;
    }
    if (show_promotion_local_var) {
        free(show_promotion_local_var);
        show_promotion_local_var = NULL;
    }
    if (video_tag_local_str) {
        free(video_tag_local_str);
        video_tag_local_str = NULL;
    }
    return NULL;

}
