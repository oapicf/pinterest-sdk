#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "aggregated_pin_comment.h"



static aggregated_pin_comment_t *aggregated_pin_comment_create_internal(
    ai_disclosures_t *ai_disclosures,
    char *alt_text,
    char *board_id,
    board_owner_t *board_owner,
    char *board_section_id,
    char *created_at,
    creative_type_t *creative_type,
    char *description,
    char *dominant_color,
    int *has_been_promoted,
    char *id,
    int *is_owner,
    int *is_product,
    int *is_standard,
    char *link,
    pin_media_t *media,
    char *parent_pin_id,
    object_t *pin_metrics,
    char *title
    ) {
    aggregated_pin_comment_t *aggregated_pin_comment_local_var = malloc(sizeof(aggregated_pin_comment_t));
    if (!aggregated_pin_comment_local_var) {
        return NULL;
    }
    memset(aggregated_pin_comment_local_var, 0, sizeof(aggregated_pin_comment_t));
    aggregated_pin_comment_local_var->_library_owned = 1;
    aggregated_pin_comment_local_var->ai_disclosures = ai_disclosures;
    aggregated_pin_comment_local_var->alt_text = alt_text;
    aggregated_pin_comment_local_var->board_id = board_id;
    aggregated_pin_comment_local_var->board_owner = board_owner;
    aggregated_pin_comment_local_var->board_section_id = board_section_id;
    aggregated_pin_comment_local_var->created_at = created_at;
    aggregated_pin_comment_local_var->creative_type = creative_type;
    aggregated_pin_comment_local_var->description = description;
    aggregated_pin_comment_local_var->dominant_color = dominant_color;
    aggregated_pin_comment_local_var->has_been_promoted = has_been_promoted;
    aggregated_pin_comment_local_var->id = id;
    aggregated_pin_comment_local_var->is_owner = is_owner;
    aggregated_pin_comment_local_var->is_product = is_product;
    aggregated_pin_comment_local_var->is_standard = is_standard;
    aggregated_pin_comment_local_var->link = link;
    aggregated_pin_comment_local_var->media = media;
    aggregated_pin_comment_local_var->parent_pin_id = parent_pin_id;
    aggregated_pin_comment_local_var->pin_metrics = pin_metrics;
    aggregated_pin_comment_local_var->title = title;
    return aggregated_pin_comment_local_var;
}

__attribute__((deprecated)) aggregated_pin_comment_t *aggregated_pin_comment_create(
    ai_disclosures_t *ai_disclosures,
    char *alt_text,
    char *board_id,
    board_owner_t *board_owner,
    char *board_section_id,
    char *created_at,
    creative_type_t *creative_type,
    char *description,
    char *dominant_color,
    int *has_been_promoted,
    char *id,
    int *is_owner,
    int *is_product,
    int *is_standard,
    char *link,
    pin_media_t *media,
    char *parent_pin_id,
    object_t *pin_metrics,
    char *title
    ) {
    int *has_been_promoted_copy = NULL;
    if (has_been_promoted) {
        has_been_promoted_copy = malloc(sizeof(int));
        if (has_been_promoted_copy) *has_been_promoted_copy = *has_been_promoted;
    }
    int *is_owner_copy = NULL;
    if (is_owner) {
        is_owner_copy = malloc(sizeof(int));
        if (is_owner_copy) *is_owner_copy = *is_owner;
    }
    int *is_product_copy = NULL;
    if (is_product) {
        is_product_copy = malloc(sizeof(int));
        if (is_product_copy) *is_product_copy = *is_product;
    }
    int *is_standard_copy = NULL;
    if (is_standard) {
        is_standard_copy = malloc(sizeof(int));
        if (is_standard_copy) *is_standard_copy = *is_standard;
    }
    aggregated_pin_comment_t *result = aggregated_pin_comment_create_internal (
        ai_disclosures,
        alt_text,
        board_id,
        board_owner,
        board_section_id,
        created_at,
        creative_type,
        description,
        dominant_color,
        has_been_promoted_copy,
        id,
        is_owner_copy,
        is_product_copy,
        is_standard_copy,
        link,
        media,
        parent_pin_id,
        pin_metrics,
        title
        );
    if (!result) {
        free(has_been_promoted_copy);
        free(is_owner_copy);
        free(is_product_copy);
        free(is_standard_copy);
    }
    return result;
}

void aggregated_pin_comment_free(aggregated_pin_comment_t *aggregated_pin_comment) {
    if(NULL == aggregated_pin_comment){
        return ;
    }
    if(aggregated_pin_comment->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "aggregated_pin_comment_free");
        return ;
    }
    listEntry_t *listEntry;
    if (aggregated_pin_comment->ai_disclosures) {
        ai_disclosures_free(aggregated_pin_comment->ai_disclosures);
        aggregated_pin_comment->ai_disclosures = NULL;
    }
    if (aggregated_pin_comment->alt_text) {
        free(aggregated_pin_comment->alt_text);
        aggregated_pin_comment->alt_text = NULL;
    }
    if (aggregated_pin_comment->board_id) {
        free(aggregated_pin_comment->board_id);
        aggregated_pin_comment->board_id = NULL;
    }
    if (aggregated_pin_comment->board_owner) {
        board_owner_free(aggregated_pin_comment->board_owner);
        aggregated_pin_comment->board_owner = NULL;
    }
    if (aggregated_pin_comment->board_section_id) {
        free(aggregated_pin_comment->board_section_id);
        aggregated_pin_comment->board_section_id = NULL;
    }
    if (aggregated_pin_comment->created_at) {
        free(aggregated_pin_comment->created_at);
        aggregated_pin_comment->created_at = NULL;
    }
    if (aggregated_pin_comment->creative_type) {
        creative_type_free(aggregated_pin_comment->creative_type);
        aggregated_pin_comment->creative_type = NULL;
    }
    if (aggregated_pin_comment->description) {
        free(aggregated_pin_comment->description);
        aggregated_pin_comment->description = NULL;
    }
    if (aggregated_pin_comment->dominant_color) {
        free(aggregated_pin_comment->dominant_color);
        aggregated_pin_comment->dominant_color = NULL;
    }
    if (aggregated_pin_comment->has_been_promoted) {
        free(aggregated_pin_comment->has_been_promoted);
        aggregated_pin_comment->has_been_promoted = NULL;
    }
    if (aggregated_pin_comment->id) {
        free(aggregated_pin_comment->id);
        aggregated_pin_comment->id = NULL;
    }
    if (aggregated_pin_comment->is_owner) {
        free(aggregated_pin_comment->is_owner);
        aggregated_pin_comment->is_owner = NULL;
    }
    if (aggregated_pin_comment->is_product) {
        free(aggregated_pin_comment->is_product);
        aggregated_pin_comment->is_product = NULL;
    }
    if (aggregated_pin_comment->is_standard) {
        free(aggregated_pin_comment->is_standard);
        aggregated_pin_comment->is_standard = NULL;
    }
    if (aggregated_pin_comment->link) {
        free(aggregated_pin_comment->link);
        aggregated_pin_comment->link = NULL;
    }
    if (aggregated_pin_comment->media) {
        pin_media_free(aggregated_pin_comment->media);
        aggregated_pin_comment->media = NULL;
    }
    if (aggregated_pin_comment->parent_pin_id) {
        free(aggregated_pin_comment->parent_pin_id);
        aggregated_pin_comment->parent_pin_id = NULL;
    }
    if (aggregated_pin_comment->pin_metrics) {
        object_free(aggregated_pin_comment->pin_metrics);
        aggregated_pin_comment->pin_metrics = NULL;
    }
    if (aggregated_pin_comment->title) {
        free(aggregated_pin_comment->title);
        aggregated_pin_comment->title = NULL;
    }
    free(aggregated_pin_comment);
}

cJSON *aggregated_pin_comment_convertToJSON(aggregated_pin_comment_t *aggregated_pin_comment) {
    cJSON *item = cJSON_CreateObject();

    // aggregated_pin_comment->ai_disclosures
    if(aggregated_pin_comment->ai_disclosures) {
    cJSON *ai_disclosures_local_JSON = ai_disclosures_convertToJSON(aggregated_pin_comment->ai_disclosures);
    if(ai_disclosures_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ai_disclosures", ai_disclosures_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // aggregated_pin_comment->alt_text
    if(aggregated_pin_comment->alt_text) {
    if(cJSON_AddStringToObject(item, "alt_text", aggregated_pin_comment->alt_text) == NULL) {
    goto fail; //String
    }
    }


    // aggregated_pin_comment->board_id
    if(aggregated_pin_comment->board_id) {
    if(cJSON_AddStringToObject(item, "board_id", aggregated_pin_comment->board_id) == NULL) {
    goto fail; //String
    }
    }


    // aggregated_pin_comment->board_owner
    if(aggregated_pin_comment->board_owner) {
    cJSON *board_owner_local_JSON = board_owner_convertToJSON(aggregated_pin_comment->board_owner);
    if(board_owner_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "board_owner", board_owner_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // aggregated_pin_comment->board_section_id
    if(aggregated_pin_comment->board_section_id) {
    if(cJSON_AddStringToObject(item, "board_section_id", aggregated_pin_comment->board_section_id) == NULL) {
    goto fail; //String
    }
    }


    // aggregated_pin_comment->created_at
    if(aggregated_pin_comment->created_at) {
    if(cJSON_AddStringToObject(item, "created_at", aggregated_pin_comment->created_at) == NULL) {
    goto fail; //Date-Time
    }
    }


    // aggregated_pin_comment->creative_type
    if(aggregated_pin_comment->creative_type) {
    cJSON *creative_type_local_JSON = creative_type_convertToJSON(aggregated_pin_comment->creative_type);
    if(creative_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "creative_type", creative_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // aggregated_pin_comment->description
    if(aggregated_pin_comment->description) {
    if(cJSON_AddStringToObject(item, "description", aggregated_pin_comment->description) == NULL) {
    goto fail; //String
    }
    }


    // aggregated_pin_comment->dominant_color
    if(aggregated_pin_comment->dominant_color) {
    if(cJSON_AddStringToObject(item, "dominant_color", aggregated_pin_comment->dominant_color) == NULL) {
    goto fail; //String
    }
    }


    // aggregated_pin_comment->has_been_promoted
    if(aggregated_pin_comment->has_been_promoted) {
    if(cJSON_AddBoolToObject(item, "has_been_promoted", *aggregated_pin_comment->has_been_promoted) == NULL) {
    goto fail; //Bool
    }
    }


    // aggregated_pin_comment->id
    if (!aggregated_pin_comment->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", aggregated_pin_comment->id) == NULL) {
    goto fail; //String
    }


    // aggregated_pin_comment->is_owner
    if(aggregated_pin_comment->is_owner) {
    if(cJSON_AddBoolToObject(item, "is_owner", *aggregated_pin_comment->is_owner) == NULL) {
    goto fail; //Bool
    }
    }


    // aggregated_pin_comment->is_product
    if(aggregated_pin_comment->is_product) {
    if(cJSON_AddBoolToObject(item, "is_product", *aggregated_pin_comment->is_product) == NULL) {
    goto fail; //Bool
    }
    }


    // aggregated_pin_comment->is_standard
    if(aggregated_pin_comment->is_standard) {
    if(cJSON_AddBoolToObject(item, "is_standard", *aggregated_pin_comment->is_standard) == NULL) {
    goto fail; //Bool
    }
    }


    // aggregated_pin_comment->link
    if(aggregated_pin_comment->link) {
    if(cJSON_AddStringToObject(item, "link", aggregated_pin_comment->link) == NULL) {
    goto fail; //String
    }
    }


    // aggregated_pin_comment->media
    if(aggregated_pin_comment->media) {
    cJSON *media_local_JSON = pin_media_convertToJSON(aggregated_pin_comment->media);
    if(media_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "media", media_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // aggregated_pin_comment->parent_pin_id
    if(aggregated_pin_comment->parent_pin_id) {
    if(cJSON_AddStringToObject(item, "parent_pin_id", aggregated_pin_comment->parent_pin_id) == NULL) {
    goto fail; //String
    }
    }


    // aggregated_pin_comment->pin_metrics
    if(aggregated_pin_comment->pin_metrics) {
    cJSON *pin_metrics_object = object_convertToJSON(aggregated_pin_comment->pin_metrics);
    if(pin_metrics_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pin_metrics", pin_metrics_object);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // aggregated_pin_comment->title
    if(aggregated_pin_comment->title) {
    if(cJSON_AddStringToObject(item, "title", aggregated_pin_comment->title) == NULL) {
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

aggregated_pin_comment_t *aggregated_pin_comment_parseFromJSON(cJSON *aggregated_pin_commentJSON){

    aggregated_pin_comment_t *aggregated_pin_comment_local_var = NULL;

    // define the local variable for aggregated_pin_comment->ai_disclosures
    ai_disclosures_t *ai_disclosures_local_nonprim = NULL;

    char *alt_text_local_str = NULL;

    char *board_id_local_str = NULL;

    // define the local variable for aggregated_pin_comment->board_owner
    board_owner_t *board_owner_local_nonprim = NULL;

    char *board_section_id_local_str = NULL;

    char *created_at_local_str = NULL;

    // define the local variable for aggregated_pin_comment->creative_type
    creative_type_t *creative_type_local_nonprim = NULL;

    char *description_local_str = NULL;

    char *dominant_color_local_str = NULL;

    // define the local variable for aggregated_pin_comment->has_been_promoted
    int *has_been_promoted_local_var = NULL;

    char *id_local_str = NULL;

    // define the local variable for aggregated_pin_comment->is_owner
    int *is_owner_local_var = NULL;

    // define the local variable for aggregated_pin_comment->is_product
    int *is_product_local_var = NULL;

    // define the local variable for aggregated_pin_comment->is_standard
    int *is_standard_local_var = NULL;

    char *link_local_str = NULL;

    // define the local variable for aggregated_pin_comment->media
    pin_media_t *media_local_nonprim = NULL;

    char *parent_pin_id_local_str = NULL;

    char *title_local_str = NULL;

    // aggregated_pin_comment->ai_disclosures
    cJSON *ai_disclosures = cJSON_GetObjectItemCaseSensitive(aggregated_pin_commentJSON, "ai_disclosures");
    if (cJSON_IsNull(ai_disclosures)) {
        ai_disclosures = NULL;
    }
    if (ai_disclosures) { 
    ai_disclosures_local_nonprim = ai_disclosures_parseFromJSON(ai_disclosures); //nonprimitive
    }

    // aggregated_pin_comment->alt_text
    cJSON *alt_text = cJSON_GetObjectItemCaseSensitive(aggregated_pin_commentJSON, "alt_text");
    if (cJSON_IsNull(alt_text)) {
        alt_text = NULL;
    }
    if (alt_text) { 
    if(!cJSON_IsString(alt_text) && !cJSON_IsNull(alt_text))
    {
    goto end; //String
    }
    }

    // aggregated_pin_comment->board_id
    cJSON *board_id = cJSON_GetObjectItemCaseSensitive(aggregated_pin_commentJSON, "board_id");
    if (cJSON_IsNull(board_id)) {
        board_id = NULL;
    }
    if (board_id) { 
    if(!cJSON_IsString(board_id) && !cJSON_IsNull(board_id))
    {
    goto end; //String
    }
    }

    // aggregated_pin_comment->board_owner
    cJSON *board_owner = cJSON_GetObjectItemCaseSensitive(aggregated_pin_commentJSON, "board_owner");
    if (cJSON_IsNull(board_owner)) {
        board_owner = NULL;
    }
    if (board_owner) { 
    board_owner_local_nonprim = board_owner_parseFromJSON(board_owner); //nonprimitive
    }

    // aggregated_pin_comment->board_section_id
    cJSON *board_section_id = cJSON_GetObjectItemCaseSensitive(aggregated_pin_commentJSON, "board_section_id");
    if (cJSON_IsNull(board_section_id)) {
        board_section_id = NULL;
    }
    if (board_section_id) { 
    if(!cJSON_IsString(board_section_id) && !cJSON_IsNull(board_section_id))
    {
    goto end; //String
    }
    }

    // aggregated_pin_comment->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(aggregated_pin_commentJSON, "created_at");
    if (cJSON_IsNull(created_at)) {
        created_at = NULL;
    }
    if (created_at) { 
    if(!cJSON_IsString(created_at) && !cJSON_IsNull(created_at))
    {
    goto end; //DateTime
    }
    }

    // aggregated_pin_comment->creative_type
    cJSON *creative_type = cJSON_GetObjectItemCaseSensitive(aggregated_pin_commentJSON, "creative_type");
    if (cJSON_IsNull(creative_type)) {
        creative_type = NULL;
    }
    if (creative_type) { 
    creative_type_local_nonprim = creative_type_parseFromJSON(creative_type); //custom
    }

    // aggregated_pin_comment->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(aggregated_pin_commentJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // aggregated_pin_comment->dominant_color
    cJSON *dominant_color = cJSON_GetObjectItemCaseSensitive(aggregated_pin_commentJSON, "dominant_color");
    if (cJSON_IsNull(dominant_color)) {
        dominant_color = NULL;
    }
    if (dominant_color) { 
    if(!cJSON_IsString(dominant_color) && !cJSON_IsNull(dominant_color))
    {
    goto end; //String
    }
    }

    // aggregated_pin_comment->has_been_promoted
    cJSON *has_been_promoted = cJSON_GetObjectItemCaseSensitive(aggregated_pin_commentJSON, "has_been_promoted");
    if (cJSON_IsNull(has_been_promoted)) {
        has_been_promoted = NULL;
    }
    if (has_been_promoted) { 
    if(!cJSON_IsBool(has_been_promoted))
    {
    goto end; //Bool
    }
    has_been_promoted_local_var = malloc(sizeof(int));
    if(!has_been_promoted_local_var)
    {
        goto end;
    }
    *has_been_promoted_local_var = has_been_promoted->valueint;
    }

    // aggregated_pin_comment->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(aggregated_pin_commentJSON, "id");
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

    // aggregated_pin_comment->is_owner
    cJSON *is_owner = cJSON_GetObjectItemCaseSensitive(aggregated_pin_commentJSON, "is_owner");
    if (cJSON_IsNull(is_owner)) {
        is_owner = NULL;
    }
    if (is_owner) { 
    if(!cJSON_IsBool(is_owner))
    {
    goto end; //Bool
    }
    is_owner_local_var = malloc(sizeof(int));
    if(!is_owner_local_var)
    {
        goto end;
    }
    *is_owner_local_var = is_owner->valueint;
    }

    // aggregated_pin_comment->is_product
    cJSON *is_product = cJSON_GetObjectItemCaseSensitive(aggregated_pin_commentJSON, "is_product");
    if (cJSON_IsNull(is_product)) {
        is_product = NULL;
    }
    if (is_product) { 
    if(!cJSON_IsBool(is_product))
    {
    goto end; //Bool
    }
    is_product_local_var = malloc(sizeof(int));
    if(!is_product_local_var)
    {
        goto end;
    }
    *is_product_local_var = is_product->valueint;
    }

    // aggregated_pin_comment->is_standard
    cJSON *is_standard = cJSON_GetObjectItemCaseSensitive(aggregated_pin_commentJSON, "is_standard");
    if (cJSON_IsNull(is_standard)) {
        is_standard = NULL;
    }
    if (is_standard) { 
    if(!cJSON_IsBool(is_standard))
    {
    goto end; //Bool
    }
    is_standard_local_var = malloc(sizeof(int));
    if(!is_standard_local_var)
    {
        goto end;
    }
    *is_standard_local_var = is_standard->valueint;
    }

    // aggregated_pin_comment->link
    cJSON *link = cJSON_GetObjectItemCaseSensitive(aggregated_pin_commentJSON, "link");
    if (cJSON_IsNull(link)) {
        link = NULL;
    }
    if (link) { 
    if(!cJSON_IsString(link) && !cJSON_IsNull(link))
    {
    goto end; //String
    }
    }

    // aggregated_pin_comment->media
    cJSON *media = cJSON_GetObjectItemCaseSensitive(aggregated_pin_commentJSON, "media");
    if (cJSON_IsNull(media)) {
        media = NULL;
    }
    if (media) { 
    media_local_nonprim = pin_media_parseFromJSON(media); //nonprimitive
    }

    // aggregated_pin_comment->parent_pin_id
    cJSON *parent_pin_id = cJSON_GetObjectItemCaseSensitive(aggregated_pin_commentJSON, "parent_pin_id");
    if (cJSON_IsNull(parent_pin_id)) {
        parent_pin_id = NULL;
    }
    if (parent_pin_id) { 
    if(!cJSON_IsString(parent_pin_id) && !cJSON_IsNull(parent_pin_id))
    {
    goto end; //String
    }
    }

    // aggregated_pin_comment->pin_metrics
    cJSON *pin_metrics = cJSON_GetObjectItemCaseSensitive(aggregated_pin_commentJSON, "pin_metrics");
    if (cJSON_IsNull(pin_metrics)) {
        pin_metrics = NULL;
    }
    object_t *pin_metrics_local_object = NULL;
    if (pin_metrics) { 
    pin_metrics_local_object = object_parseFromJSON(pin_metrics); //object
    }

    // aggregated_pin_comment->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(aggregated_pin_commentJSON, "title");
    if (cJSON_IsNull(title)) {
        title = NULL;
    }
    if (title) { 
    if(!cJSON_IsString(title) && !cJSON_IsNull(title))
    {
    goto end; //String
    }
    }


    if (alt_text && !cJSON_IsNull(alt_text)) alt_text_local_str = strdup(alt_text->valuestring);
    if (board_id && !cJSON_IsNull(board_id)) board_id_local_str = strdup(board_id->valuestring);
    if (board_section_id && !cJSON_IsNull(board_section_id)) board_section_id_local_str = strdup(board_section_id->valuestring);
    if (created_at && !cJSON_IsNull(created_at)) created_at_local_str = strdup(created_at->valuestring);
    if (description && !cJSON_IsNull(description)) description_local_str = strdup(description->valuestring);
    if (dominant_color && !cJSON_IsNull(dominant_color)) dominant_color_local_str = strdup(dominant_color->valuestring);
    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (link && !cJSON_IsNull(link)) link_local_str = strdup(link->valuestring);
    if (parent_pin_id && !cJSON_IsNull(parent_pin_id)) parent_pin_id_local_str = strdup(parent_pin_id->valuestring);
    if (title && !cJSON_IsNull(title)) title_local_str = strdup(title->valuestring);

    aggregated_pin_comment_local_var = aggregated_pin_comment_create_internal (
        ai_disclosures ? ai_disclosures_local_nonprim : NULL,
        alt_text_local_str,
        board_id_local_str,
        board_owner ? board_owner_local_nonprim : NULL,
        board_section_id_local_str,
        created_at_local_str,
        creative_type ? creative_type_local_nonprim : NULL,
        description_local_str,
        dominant_color_local_str,
        has_been_promoted_local_var,
        id_local_str,
        is_owner_local_var,
        is_product_local_var,
        is_standard_local_var,
        link_local_str,
        media ? media_local_nonprim : NULL,
        parent_pin_id_local_str,
        pin_metrics ? pin_metrics_local_object : NULL,
        title_local_str
        );

    if (!aggregated_pin_comment_local_var) {
        goto end;
    }

    return aggregated_pin_comment_local_var;
end:
    if (ai_disclosures_local_nonprim) {
        ai_disclosures_free(ai_disclosures_local_nonprim);
        ai_disclosures_local_nonprim = NULL;
    }
    if (alt_text_local_str) {
        free(alt_text_local_str);
        alt_text_local_str = NULL;
    }
    if (board_id_local_str) {
        free(board_id_local_str);
        board_id_local_str = NULL;
    }
    if (board_owner_local_nonprim) {
        board_owner_free(board_owner_local_nonprim);
        board_owner_local_nonprim = NULL;
    }
    if (board_section_id_local_str) {
        free(board_section_id_local_str);
        board_section_id_local_str = NULL;
    }
    if (created_at_local_str) {
        free(created_at_local_str);
        created_at_local_str = NULL;
    }
    if (creative_type_local_nonprim) {
        creative_type_free(creative_type_local_nonprim);
        creative_type_local_nonprim = NULL;
    }
    if (description_local_str) {
        free(description_local_str);
        description_local_str = NULL;
    }
    if (dominant_color_local_str) {
        free(dominant_color_local_str);
        dominant_color_local_str = NULL;
    }
    if (has_been_promoted_local_var) {
        free(has_been_promoted_local_var);
        has_been_promoted_local_var = NULL;
    }
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (is_owner_local_var) {
        free(is_owner_local_var);
        is_owner_local_var = NULL;
    }
    if (is_product_local_var) {
        free(is_product_local_var);
        is_product_local_var = NULL;
    }
    if (is_standard_local_var) {
        free(is_standard_local_var);
        is_standard_local_var = NULL;
    }
    if (link_local_str) {
        free(link_local_str);
        link_local_str = NULL;
    }
    if (media_local_nonprim) {
        pin_media_free(media_local_nonprim);
        media_local_nonprim = NULL;
    }
    if (parent_pin_id_local_str) {
        free(parent_pin_id_local_str);
        parent_pin_id_local_str = NULL;
    }
    if (title_local_str) {
        free(title_local_str);
        title_local_str = NULL;
    }
    return NULL;

}
