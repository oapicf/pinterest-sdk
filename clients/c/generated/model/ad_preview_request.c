#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_preview_request.h"



static ad_preview_request_t *ad_preview_request_create_internal(
    char *image_url,
    char *promotion_id,
    char *title,
    ad_shopping_preview_creative_type_t *creative_type,
    char *pin_id,
    char *catalog_product_group_id,
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
    ad_preview_request_t *ad_preview_request_local_var = malloc(sizeof(ad_preview_request_t));
    if (!ad_preview_request_local_var) {
        return NULL;
    }
    memset(ad_preview_request_local_var, 0, sizeof(ad_preview_request_t));
    ad_preview_request_local_var->_library_owned = 1;
    ad_preview_request_local_var->image_url = image_url;
    ad_preview_request_local_var->promotion_id = promotion_id;
    ad_preview_request_local_var->title = title;
    ad_preview_request_local_var->creative_type = creative_type;
    ad_preview_request_local_var->pin_id = pin_id;
    ad_preview_request_local_var->catalog_product_group_id = catalog_product_group_id;
    ad_preview_request_local_var->customizable_cta_type = customizable_cta_type;
    ad_preview_request_local_var->hero_image_title = hero_image_title;
    ad_preview_request_local_var->hero_image_url = hero_image_url;
    ad_preview_request_local_var->hero_pin_id = hero_pin_id;
    ad_preview_request_local_var->image_tag = image_tag;
    ad_preview_request_local_var->item_id = item_id;
    ad_preview_request_local_var->preferred_media_type = preferred_media_type;
    ad_preview_request_local_var->show_promotion = show_promotion;
    ad_preview_request_local_var->video_tag = video_tag;
    return ad_preview_request_local_var;
}

__attribute__((deprecated)) ad_preview_request_t *ad_preview_request_create(
    char *image_url,
    char *promotion_id,
    char *title,
    ad_shopping_preview_creative_type_t *creative_type,
    char *pin_id,
    char *catalog_product_group_id,
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
    ad_preview_request_t *result = ad_preview_request_create_internal (
        image_url,
        promotion_id,
        title,
        creative_type,
        pin_id,
        catalog_product_group_id,
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

void ad_preview_request_free(ad_preview_request_t *ad_preview_request) {
    if(NULL == ad_preview_request){
        return ;
    }
    if(ad_preview_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ad_preview_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ad_preview_request->image_url) {
        free(ad_preview_request->image_url);
        ad_preview_request->image_url = NULL;
    }
    if (ad_preview_request->promotion_id) {
        free(ad_preview_request->promotion_id);
        ad_preview_request->promotion_id = NULL;
    }
    if (ad_preview_request->title) {
        free(ad_preview_request->title);
        ad_preview_request->title = NULL;
    }
    if (ad_preview_request->creative_type) {
        ad_shopping_preview_creative_type_free(ad_preview_request->creative_type);
        ad_preview_request->creative_type = NULL;
    }
    if (ad_preview_request->pin_id) {
        free(ad_preview_request->pin_id);
        ad_preview_request->pin_id = NULL;
    }
    if (ad_preview_request->catalog_product_group_id) {
        free(ad_preview_request->catalog_product_group_id);
        ad_preview_request->catalog_product_group_id = NULL;
    }
    if (ad_preview_request->customizable_cta_type) {
        customizable_cta_type_free(ad_preview_request->customizable_cta_type);
        ad_preview_request->customizable_cta_type = NULL;
    }
    if (ad_preview_request->hero_image_title) {
        free(ad_preview_request->hero_image_title);
        ad_preview_request->hero_image_title = NULL;
    }
    if (ad_preview_request->hero_image_url) {
        free(ad_preview_request->hero_image_url);
        ad_preview_request->hero_image_url = NULL;
    }
    if (ad_preview_request->hero_pin_id) {
        free(ad_preview_request->hero_pin_id);
        ad_preview_request->hero_pin_id = NULL;
    }
    if (ad_preview_request->image_tag) {
        free(ad_preview_request->image_tag);
        ad_preview_request->image_tag = NULL;
    }
    if (ad_preview_request->item_id) {
        free(ad_preview_request->item_id);
        ad_preview_request->item_id = NULL;
    }
    if (ad_preview_request->preferred_media_type) {
        base_preferred_media_type_free(ad_preview_request->preferred_media_type);
        ad_preview_request->preferred_media_type = NULL;
    }
    if (ad_preview_request->show_promotion) {
        free(ad_preview_request->show_promotion);
        ad_preview_request->show_promotion = NULL;
    }
    if (ad_preview_request->video_tag) {
        free(ad_preview_request->video_tag);
        ad_preview_request->video_tag = NULL;
    }
    free(ad_preview_request);
}

cJSON *ad_preview_request_convertToJSON(ad_preview_request_t *ad_preview_request) {
    cJSON *item = cJSON_CreateObject();

    // ad_preview_request->image_url
    if (!ad_preview_request->image_url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "image_url", ad_preview_request->image_url) == NULL) {
    goto fail; //String
    }


    // ad_preview_request->promotion_id
    if(ad_preview_request->promotion_id) {
    if(cJSON_AddStringToObject(item, "promotion_id", ad_preview_request->promotion_id) == NULL) {
    goto fail; //String
    }
    }


    // ad_preview_request->title
    if (!ad_preview_request->title) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "title", ad_preview_request->title) == NULL) {
    goto fail; //String
    }


    // ad_preview_request->creative_type
    if (!ad_preview_request->creative_type) {
        goto fail;
    }
    cJSON *creative_type_local_JSON = ad_shopping_preview_creative_type_convertToJSON(ad_preview_request->creative_type);
    if(creative_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "creative_type", creative_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // ad_preview_request->pin_id
    if (!ad_preview_request->pin_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "pin_id", ad_preview_request->pin_id) == NULL) {
    goto fail; //String
    }


    // ad_preview_request->catalog_product_group_id
    if (!ad_preview_request->catalog_product_group_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_product_group_id", ad_preview_request->catalog_product_group_id) == NULL) {
    goto fail; //String
    }


    // ad_preview_request->customizable_cta_type
    if(ad_preview_request->customizable_cta_type) {
    cJSON *customizable_cta_type_local_JSON = customizable_cta_type_convertToJSON(ad_preview_request->customizable_cta_type);
    if(customizable_cta_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "customizable_cta_type", customizable_cta_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_preview_request->hero_image_title
    if(ad_preview_request->hero_image_title) {
    if(cJSON_AddStringToObject(item, "hero_image_title", ad_preview_request->hero_image_title) == NULL) {
    goto fail; //String
    }
    }


    // ad_preview_request->hero_image_url
    if(ad_preview_request->hero_image_url) {
    if(cJSON_AddStringToObject(item, "hero_image_url", ad_preview_request->hero_image_url) == NULL) {
    goto fail; //String
    }
    }


    // ad_preview_request->hero_pin_id
    if(ad_preview_request->hero_pin_id) {
    if(cJSON_AddStringToObject(item, "hero_pin_id", ad_preview_request->hero_pin_id) == NULL) {
    goto fail; //String
    }
    }


    // ad_preview_request->image_tag
    if(ad_preview_request->image_tag) {
    if(cJSON_AddStringToObject(item, "image_tag", ad_preview_request->image_tag) == NULL) {
    goto fail; //String
    }
    }


    // ad_preview_request->item_id
    if(ad_preview_request->item_id) {
    if(cJSON_AddStringToObject(item, "item_id", ad_preview_request->item_id) == NULL) {
    goto fail; //String
    }
    }


    // ad_preview_request->preferred_media_type
    if(ad_preview_request->preferred_media_type) {
    cJSON *preferred_media_type_local_JSON = base_preferred_media_type_convertToJSON(ad_preview_request->preferred_media_type);
    if(preferred_media_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "preferred_media_type", preferred_media_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_preview_request->show_promotion
    if(ad_preview_request->show_promotion) {
    if(cJSON_AddBoolToObject(item, "show_promotion", *ad_preview_request->show_promotion) == NULL) {
    goto fail; //Bool
    }
    }


    // ad_preview_request->video_tag
    if(ad_preview_request->video_tag) {
    if(cJSON_AddStringToObject(item, "video_tag", ad_preview_request->video_tag) == NULL) {
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

ad_preview_request_t *ad_preview_request_parseFromJSON(cJSON *ad_preview_requestJSON){

    ad_preview_request_t *ad_preview_request_local_var = NULL;

    char *image_url_local_str = NULL;

    char *promotion_id_local_str = NULL;

    char *title_local_str = NULL;

    // define the local variable for ad_preview_request->creative_type
    ad_shopping_preview_creative_type_t *creative_type_local_nonprim = NULL;

    char *pin_id_local_str = NULL;

    char *catalog_product_group_id_local_str = NULL;

    // define the local variable for ad_preview_request->customizable_cta_type
    customizable_cta_type_t *customizable_cta_type_local_nonprim = NULL;

    char *hero_image_title_local_str = NULL;

    char *hero_image_url_local_str = NULL;

    char *hero_pin_id_local_str = NULL;

    char *image_tag_local_str = NULL;

    char *item_id_local_str = NULL;

    // define the local variable for ad_preview_request->preferred_media_type
    base_preferred_media_type_t *preferred_media_type_local_nonprim = NULL;

    // define the local variable for ad_preview_request->show_promotion
    int *show_promotion_local_var = NULL;

    char *video_tag_local_str = NULL;

    // ad_preview_request->image_url
    cJSON *image_url = cJSON_GetObjectItemCaseSensitive(ad_preview_requestJSON, "image_url");
    if (cJSON_IsNull(image_url)) {
        image_url = NULL;
    }
    if (!image_url) {
        goto end;
    }

    
    if(!cJSON_IsString(image_url))
    {
    goto end; //String
    }

    // ad_preview_request->promotion_id
    cJSON *promotion_id = cJSON_GetObjectItemCaseSensitive(ad_preview_requestJSON, "promotion_id");
    if (cJSON_IsNull(promotion_id)) {
        promotion_id = NULL;
    }
    if (promotion_id) { 
    if(!cJSON_IsString(promotion_id) && !cJSON_IsNull(promotion_id))
    {
    goto end; //String
    }
    }

    // ad_preview_request->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(ad_preview_requestJSON, "title");
    if (cJSON_IsNull(title)) {
        title = NULL;
    }
    if (!title) {
        goto end;
    }

    
    if(!cJSON_IsString(title))
    {
    goto end; //String
    }

    // ad_preview_request->creative_type
    cJSON *creative_type = cJSON_GetObjectItemCaseSensitive(ad_preview_requestJSON, "creative_type");
    if (cJSON_IsNull(creative_type)) {
        creative_type = NULL;
    }
    if (!creative_type) {
        goto end;
    }

    
    creative_type_local_nonprim = ad_shopping_preview_creative_type_parseFromJSON(creative_type); //custom

    // ad_preview_request->pin_id
    cJSON *pin_id = cJSON_GetObjectItemCaseSensitive(ad_preview_requestJSON, "pin_id");
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

    // ad_preview_request->catalog_product_group_id
    cJSON *catalog_product_group_id = cJSON_GetObjectItemCaseSensitive(ad_preview_requestJSON, "catalog_product_group_id");
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

    // ad_preview_request->customizable_cta_type
    cJSON *customizable_cta_type = cJSON_GetObjectItemCaseSensitive(ad_preview_requestJSON, "customizable_cta_type");
    if (cJSON_IsNull(customizable_cta_type)) {
        customizable_cta_type = NULL;
    }
    if (customizable_cta_type) { 
    customizable_cta_type_local_nonprim = customizable_cta_type_parseFromJSON(customizable_cta_type); //custom
    }

    // ad_preview_request->hero_image_title
    cJSON *hero_image_title = cJSON_GetObjectItemCaseSensitive(ad_preview_requestJSON, "hero_image_title");
    if (cJSON_IsNull(hero_image_title)) {
        hero_image_title = NULL;
    }
    if (hero_image_title) { 
    if(!cJSON_IsString(hero_image_title) && !cJSON_IsNull(hero_image_title))
    {
    goto end; //String
    }
    }

    // ad_preview_request->hero_image_url
    cJSON *hero_image_url = cJSON_GetObjectItemCaseSensitive(ad_preview_requestJSON, "hero_image_url");
    if (cJSON_IsNull(hero_image_url)) {
        hero_image_url = NULL;
    }
    if (hero_image_url) { 
    if(!cJSON_IsString(hero_image_url) && !cJSON_IsNull(hero_image_url))
    {
    goto end; //String
    }
    }

    // ad_preview_request->hero_pin_id
    cJSON *hero_pin_id = cJSON_GetObjectItemCaseSensitive(ad_preview_requestJSON, "hero_pin_id");
    if (cJSON_IsNull(hero_pin_id)) {
        hero_pin_id = NULL;
    }
    if (hero_pin_id) { 
    if(!cJSON_IsString(hero_pin_id) && !cJSON_IsNull(hero_pin_id))
    {
    goto end; //String
    }
    }

    // ad_preview_request->image_tag
    cJSON *image_tag = cJSON_GetObjectItemCaseSensitive(ad_preview_requestJSON, "image_tag");
    if (cJSON_IsNull(image_tag)) {
        image_tag = NULL;
    }
    if (image_tag) { 
    if(!cJSON_IsString(image_tag) && !cJSON_IsNull(image_tag))
    {
    goto end; //String
    }
    }

    // ad_preview_request->item_id
    cJSON *item_id = cJSON_GetObjectItemCaseSensitive(ad_preview_requestJSON, "item_id");
    if (cJSON_IsNull(item_id)) {
        item_id = NULL;
    }
    if (item_id) { 
    if(!cJSON_IsString(item_id) && !cJSON_IsNull(item_id))
    {
    goto end; //String
    }
    }

    // ad_preview_request->preferred_media_type
    cJSON *preferred_media_type = cJSON_GetObjectItemCaseSensitive(ad_preview_requestJSON, "preferred_media_type");
    if (cJSON_IsNull(preferred_media_type)) {
        preferred_media_type = NULL;
    }
    if (preferred_media_type) { 
    preferred_media_type_local_nonprim = base_preferred_media_type_parseFromJSON(preferred_media_type); //custom
    }

    // ad_preview_request->show_promotion
    cJSON *show_promotion = cJSON_GetObjectItemCaseSensitive(ad_preview_requestJSON, "show_promotion");
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

    // ad_preview_request->video_tag
    cJSON *video_tag = cJSON_GetObjectItemCaseSensitive(ad_preview_requestJSON, "video_tag");
    if (cJSON_IsNull(video_tag)) {
        video_tag = NULL;
    }
    if (video_tag) { 
    if(!cJSON_IsString(video_tag) && !cJSON_IsNull(video_tag))
    {
    goto end; //String
    }
    }


    if (image_url && !cJSON_IsNull(image_url)) image_url_local_str = strdup(image_url->valuestring);
    if (promotion_id && !cJSON_IsNull(promotion_id)) promotion_id_local_str = strdup(promotion_id->valuestring);
    if (title && !cJSON_IsNull(title)) title_local_str = strdup(title->valuestring);
    if (pin_id && !cJSON_IsNull(pin_id)) pin_id_local_str = strdup(pin_id->valuestring);
    if (catalog_product_group_id && !cJSON_IsNull(catalog_product_group_id)) catalog_product_group_id_local_str = strdup(catalog_product_group_id->valuestring);
    if (hero_image_title && !cJSON_IsNull(hero_image_title)) hero_image_title_local_str = strdup(hero_image_title->valuestring);
    if (hero_image_url && !cJSON_IsNull(hero_image_url)) hero_image_url_local_str = strdup(hero_image_url->valuestring);
    if (hero_pin_id && !cJSON_IsNull(hero_pin_id)) hero_pin_id_local_str = strdup(hero_pin_id->valuestring);
    if (image_tag && !cJSON_IsNull(image_tag)) image_tag_local_str = strdup(image_tag->valuestring);
    if (item_id && !cJSON_IsNull(item_id)) item_id_local_str = strdup(item_id->valuestring);
    if (video_tag && !cJSON_IsNull(video_tag)) video_tag_local_str = strdup(video_tag->valuestring);

    ad_preview_request_local_var = ad_preview_request_create_internal (
        image_url_local_str,
        promotion_id_local_str,
        title_local_str,
        creative_type_local_nonprim,
        pin_id_local_str,
        catalog_product_group_id_local_str,
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

    if (!ad_preview_request_local_var) {
        goto end;
    }

    return ad_preview_request_local_var;
end:
    if (image_url_local_str) {
        free(image_url_local_str);
        image_url_local_str = NULL;
    }
    if (promotion_id_local_str) {
        free(promotion_id_local_str);
        promotion_id_local_str = NULL;
    }
    if (title_local_str) {
        free(title_local_str);
        title_local_str = NULL;
    }
    if (creative_type_local_nonprim) {
        ad_shopping_preview_creative_type_free(creative_type_local_nonprim);
        creative_type_local_nonprim = NULL;
    }
    if (pin_id_local_str) {
        free(pin_id_local_str);
        pin_id_local_str = NULL;
    }
    if (catalog_product_group_id_local_str) {
        free(catalog_product_group_id_local_str);
        catalog_product_group_id_local_str = NULL;
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
