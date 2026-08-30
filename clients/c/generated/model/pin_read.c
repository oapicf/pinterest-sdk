#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pin_read.h"



static pin_read_t *pin_read_create_internal(
    ai_disclosures_t *ai_disclosures,
    char *board_id,
    board_owner_t *board_owner,
    char *board_section_id,
    char *created_at,
    creative_type_t *creative_type,
    char *dominant_color,
    int *has_been_promoted,
    char *id,
    int *is_owner,
    int *is_product,
    int *is_standard,
    pin_media_t *media,
    char *parent_pin_id,
    object_t *pin_metrics,
    char *alt_text,
    char *description,
    char *link,
    char *title
    ) {
    pin_read_t *pin_read_local_var = malloc(sizeof(pin_read_t));
    if (!pin_read_local_var) {
        return NULL;
    }
    memset(pin_read_local_var, 0, sizeof(pin_read_t));
    pin_read_local_var->_library_owned = 1;
    pin_read_local_var->ai_disclosures = ai_disclosures;
    pin_read_local_var->board_id = board_id;
    pin_read_local_var->board_owner = board_owner;
    pin_read_local_var->board_section_id = board_section_id;
    pin_read_local_var->created_at = created_at;
    pin_read_local_var->creative_type = creative_type;
    pin_read_local_var->dominant_color = dominant_color;
    pin_read_local_var->has_been_promoted = has_been_promoted;
    pin_read_local_var->id = id;
    pin_read_local_var->is_owner = is_owner;
    pin_read_local_var->is_product = is_product;
    pin_read_local_var->is_standard = is_standard;
    pin_read_local_var->media = media;
    pin_read_local_var->parent_pin_id = parent_pin_id;
    pin_read_local_var->pin_metrics = pin_metrics;
    pin_read_local_var->alt_text = alt_text;
    pin_read_local_var->description = description;
    pin_read_local_var->link = link;
    pin_read_local_var->title = title;
    return pin_read_local_var;
}

__attribute__((deprecated)) pin_read_t *pin_read_create(
    ai_disclosures_t *ai_disclosures,
    char *board_id,
    board_owner_t *board_owner,
    char *board_section_id,
    char *created_at,
    creative_type_t *creative_type,
    char *dominant_color,
    int *has_been_promoted,
    char *id,
    int *is_owner,
    int *is_product,
    int *is_standard,
    pin_media_t *media,
    char *parent_pin_id,
    object_t *pin_metrics,
    char *alt_text,
    char *description,
    char *link,
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
    pin_read_t *result = pin_read_create_internal (
        ai_disclosures,
        board_id,
        board_owner,
        board_section_id,
        created_at,
        creative_type,
        dominant_color,
        has_been_promoted_copy,
        id,
        is_owner_copy,
        is_product_copy,
        is_standard_copy,
        media,
        parent_pin_id,
        pin_metrics,
        alt_text,
        description,
        link,
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

void pin_read_free(pin_read_t *pin_read) {
    if(NULL == pin_read){
        return ;
    }
    if(pin_read->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pin_read_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pin_read->ai_disclosures) {
        ai_disclosures_free(pin_read->ai_disclosures);
        pin_read->ai_disclosures = NULL;
    }
    if (pin_read->board_id) {
        free(pin_read->board_id);
        pin_read->board_id = NULL;
    }
    if (pin_read->board_owner) {
        board_owner_free(pin_read->board_owner);
        pin_read->board_owner = NULL;
    }
    if (pin_read->board_section_id) {
        free(pin_read->board_section_id);
        pin_read->board_section_id = NULL;
    }
    if (pin_read->created_at) {
        free(pin_read->created_at);
        pin_read->created_at = NULL;
    }
    if (pin_read->creative_type) {
        creative_type_free(pin_read->creative_type);
        pin_read->creative_type = NULL;
    }
    if (pin_read->dominant_color) {
        free(pin_read->dominant_color);
        pin_read->dominant_color = NULL;
    }
    if (pin_read->has_been_promoted) {
        free(pin_read->has_been_promoted);
        pin_read->has_been_promoted = NULL;
    }
    if (pin_read->id) {
        free(pin_read->id);
        pin_read->id = NULL;
    }
    if (pin_read->is_owner) {
        free(pin_read->is_owner);
        pin_read->is_owner = NULL;
    }
    if (pin_read->is_product) {
        free(pin_read->is_product);
        pin_read->is_product = NULL;
    }
    if (pin_read->is_standard) {
        free(pin_read->is_standard);
        pin_read->is_standard = NULL;
    }
    if (pin_read->media) {
        pin_media_free(pin_read->media);
        pin_read->media = NULL;
    }
    if (pin_read->parent_pin_id) {
        free(pin_read->parent_pin_id);
        pin_read->parent_pin_id = NULL;
    }
    if (pin_read->pin_metrics) {
        object_free(pin_read->pin_metrics);
        pin_read->pin_metrics = NULL;
    }
    if (pin_read->alt_text) {
        free(pin_read->alt_text);
        pin_read->alt_text = NULL;
    }
    if (pin_read->description) {
        free(pin_read->description);
        pin_read->description = NULL;
    }
    if (pin_read->link) {
        free(pin_read->link);
        pin_read->link = NULL;
    }
    if (pin_read->title) {
        free(pin_read->title);
        pin_read->title = NULL;
    }
    free(pin_read);
}

cJSON *pin_read_convertToJSON(pin_read_t *pin_read) {
    cJSON *item = cJSON_CreateObject();

    // pin_read->ai_disclosures
    if(pin_read->ai_disclosures) {
    cJSON *ai_disclosures_local_JSON = ai_disclosures_convertToJSON(pin_read->ai_disclosures);
    if(ai_disclosures_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ai_disclosures", ai_disclosures_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // pin_read->board_id
    if(pin_read->board_id) {
    if(cJSON_AddStringToObject(item, "board_id", pin_read->board_id) == NULL) {
    goto fail; //String
    }
    }


    // pin_read->board_owner
    if(pin_read->board_owner) {
    cJSON *board_owner_local_JSON = board_owner_convertToJSON(pin_read->board_owner);
    if(board_owner_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "board_owner", board_owner_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // pin_read->board_section_id
    if(pin_read->board_section_id) {
    if(cJSON_AddStringToObject(item, "board_section_id", pin_read->board_section_id) == NULL) {
    goto fail; //String
    }
    }


    // pin_read->created_at
    if(pin_read->created_at) {
    if(cJSON_AddStringToObject(item, "created_at", pin_read->created_at) == NULL) {
    goto fail; //Date-Time
    }
    }


    // pin_read->creative_type
    if(pin_read->creative_type) {
    cJSON *creative_type_local_JSON = creative_type_convertToJSON(pin_read->creative_type);
    if(creative_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "creative_type", creative_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // pin_read->dominant_color
    if(pin_read->dominant_color) {
    if(cJSON_AddStringToObject(item, "dominant_color", pin_read->dominant_color) == NULL) {
    goto fail; //String
    }
    }


    // pin_read->has_been_promoted
    if(pin_read->has_been_promoted) {
    if(cJSON_AddBoolToObject(item, "has_been_promoted", *pin_read->has_been_promoted) == NULL) {
    goto fail; //Bool
    }
    }


    // pin_read->id
    if (!pin_read->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", pin_read->id) == NULL) {
    goto fail; //String
    }


    // pin_read->is_owner
    if(pin_read->is_owner) {
    if(cJSON_AddBoolToObject(item, "is_owner", *pin_read->is_owner) == NULL) {
    goto fail; //Bool
    }
    }


    // pin_read->is_product
    if(pin_read->is_product) {
    if(cJSON_AddBoolToObject(item, "is_product", *pin_read->is_product) == NULL) {
    goto fail; //Bool
    }
    }


    // pin_read->is_standard
    if(pin_read->is_standard) {
    if(cJSON_AddBoolToObject(item, "is_standard", *pin_read->is_standard) == NULL) {
    goto fail; //Bool
    }
    }


    // pin_read->media
    if(pin_read->media) {
    cJSON *media_local_JSON = pin_media_convertToJSON(pin_read->media);
    if(media_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "media", media_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // pin_read->parent_pin_id
    if(pin_read->parent_pin_id) {
    if(cJSON_AddStringToObject(item, "parent_pin_id", pin_read->parent_pin_id) == NULL) {
    goto fail; //String
    }
    }


    // pin_read->pin_metrics
    if(pin_read->pin_metrics) {
    cJSON *pin_metrics_object = object_convertToJSON(pin_read->pin_metrics);
    if(pin_metrics_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pin_metrics", pin_metrics_object);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // pin_read->alt_text
    if(pin_read->alt_text) {
    if(cJSON_AddStringToObject(item, "alt_text", pin_read->alt_text) == NULL) {
    goto fail; //String
    }
    }


    // pin_read->description
    if(pin_read->description) {
    if(cJSON_AddStringToObject(item, "description", pin_read->description) == NULL) {
    goto fail; //String
    }
    }


    // pin_read->link
    if(pin_read->link) {
    if(cJSON_AddStringToObject(item, "link", pin_read->link) == NULL) {
    goto fail; //String
    }
    }


    // pin_read->title
    if(pin_read->title) {
    if(cJSON_AddStringToObject(item, "title", pin_read->title) == NULL) {
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

pin_read_t *pin_read_parseFromJSON(cJSON *pin_readJSON){

    pin_read_t *pin_read_local_var = NULL;

    // define the local variable for pin_read->ai_disclosures
    ai_disclosures_t *ai_disclosures_local_nonprim = NULL;

    char *board_id_local_str = NULL;

    // define the local variable for pin_read->board_owner
    board_owner_t *board_owner_local_nonprim = NULL;

    char *board_section_id_local_str = NULL;

    char *created_at_local_str = NULL;

    // define the local variable for pin_read->creative_type
    creative_type_t *creative_type_local_nonprim = NULL;

    char *dominant_color_local_str = NULL;

    // define the local variable for pin_read->has_been_promoted
    int *has_been_promoted_local_var = NULL;

    char *id_local_str = NULL;

    // define the local variable for pin_read->is_owner
    int *is_owner_local_var = NULL;

    // define the local variable for pin_read->is_product
    int *is_product_local_var = NULL;

    // define the local variable for pin_read->is_standard
    int *is_standard_local_var = NULL;

    // define the local variable for pin_read->media
    pin_media_t *media_local_nonprim = NULL;

    char *parent_pin_id_local_str = NULL;

    char *alt_text_local_str = NULL;

    char *description_local_str = NULL;

    char *link_local_str = NULL;

    char *title_local_str = NULL;

    // pin_read->ai_disclosures
    cJSON *ai_disclosures = cJSON_GetObjectItemCaseSensitive(pin_readJSON, "ai_disclosures");
    if (cJSON_IsNull(ai_disclosures)) {
        ai_disclosures = NULL;
    }
    if (ai_disclosures) { 
    ai_disclosures_local_nonprim = ai_disclosures_parseFromJSON(ai_disclosures); //nonprimitive
    }

    // pin_read->board_id
    cJSON *board_id = cJSON_GetObjectItemCaseSensitive(pin_readJSON, "board_id");
    if (cJSON_IsNull(board_id)) {
        board_id = NULL;
    }
    if (board_id) { 
    if(!cJSON_IsString(board_id) && !cJSON_IsNull(board_id))
    {
    goto end; //String
    }
    }

    // pin_read->board_owner
    cJSON *board_owner = cJSON_GetObjectItemCaseSensitive(pin_readJSON, "board_owner");
    if (cJSON_IsNull(board_owner)) {
        board_owner = NULL;
    }
    if (board_owner) { 
    board_owner_local_nonprim = board_owner_parseFromJSON(board_owner); //nonprimitive
    }

    // pin_read->board_section_id
    cJSON *board_section_id = cJSON_GetObjectItemCaseSensitive(pin_readJSON, "board_section_id");
    if (cJSON_IsNull(board_section_id)) {
        board_section_id = NULL;
    }
    if (board_section_id) { 
    if(!cJSON_IsString(board_section_id) && !cJSON_IsNull(board_section_id))
    {
    goto end; //String
    }
    }

    // pin_read->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(pin_readJSON, "created_at");
    if (cJSON_IsNull(created_at)) {
        created_at = NULL;
    }
    if (created_at) { 
    if(!cJSON_IsString(created_at) && !cJSON_IsNull(created_at))
    {
    goto end; //DateTime
    }
    }

    // pin_read->creative_type
    cJSON *creative_type = cJSON_GetObjectItemCaseSensitive(pin_readJSON, "creative_type");
    if (cJSON_IsNull(creative_type)) {
        creative_type = NULL;
    }
    if (creative_type) { 
    creative_type_local_nonprim = creative_type_parseFromJSON(creative_type); //custom
    }

    // pin_read->dominant_color
    cJSON *dominant_color = cJSON_GetObjectItemCaseSensitive(pin_readJSON, "dominant_color");
    if (cJSON_IsNull(dominant_color)) {
        dominant_color = NULL;
    }
    if (dominant_color) { 
    if(!cJSON_IsString(dominant_color) && !cJSON_IsNull(dominant_color))
    {
    goto end; //String
    }
    }

    // pin_read->has_been_promoted
    cJSON *has_been_promoted = cJSON_GetObjectItemCaseSensitive(pin_readJSON, "has_been_promoted");
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

    // pin_read->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(pin_readJSON, "id");
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

    // pin_read->is_owner
    cJSON *is_owner = cJSON_GetObjectItemCaseSensitive(pin_readJSON, "is_owner");
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

    // pin_read->is_product
    cJSON *is_product = cJSON_GetObjectItemCaseSensitive(pin_readJSON, "is_product");
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

    // pin_read->is_standard
    cJSON *is_standard = cJSON_GetObjectItemCaseSensitive(pin_readJSON, "is_standard");
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

    // pin_read->media
    cJSON *media = cJSON_GetObjectItemCaseSensitive(pin_readJSON, "media");
    if (cJSON_IsNull(media)) {
        media = NULL;
    }
    if (media) { 
    media_local_nonprim = pin_media_parseFromJSON(media); //nonprimitive
    }

    // pin_read->parent_pin_id
    cJSON *parent_pin_id = cJSON_GetObjectItemCaseSensitive(pin_readJSON, "parent_pin_id");
    if (cJSON_IsNull(parent_pin_id)) {
        parent_pin_id = NULL;
    }
    if (parent_pin_id) { 
    if(!cJSON_IsString(parent_pin_id) && !cJSON_IsNull(parent_pin_id))
    {
    goto end; //String
    }
    }

    // pin_read->pin_metrics
    cJSON *pin_metrics = cJSON_GetObjectItemCaseSensitive(pin_readJSON, "pin_metrics");
    if (cJSON_IsNull(pin_metrics)) {
        pin_metrics = NULL;
    }
    object_t *pin_metrics_local_object = NULL;
    if (pin_metrics) { 
    pin_metrics_local_object = object_parseFromJSON(pin_metrics); //object
    }

    // pin_read->alt_text
    cJSON *alt_text = cJSON_GetObjectItemCaseSensitive(pin_readJSON, "alt_text");
    if (cJSON_IsNull(alt_text)) {
        alt_text = NULL;
    }
    if (alt_text) { 
    if(!cJSON_IsString(alt_text) && !cJSON_IsNull(alt_text))
    {
    goto end; //String
    }
    }

    // pin_read->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(pin_readJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // pin_read->link
    cJSON *link = cJSON_GetObjectItemCaseSensitive(pin_readJSON, "link");
    if (cJSON_IsNull(link)) {
        link = NULL;
    }
    if (link) { 
    if(!cJSON_IsString(link) && !cJSON_IsNull(link))
    {
    goto end; //String
    }
    }

    // pin_read->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(pin_readJSON, "title");
    if (cJSON_IsNull(title)) {
        title = NULL;
    }
    if (title) { 
    if(!cJSON_IsString(title) && !cJSON_IsNull(title))
    {
    goto end; //String
    }
    }


    if (board_id && !cJSON_IsNull(board_id)) board_id_local_str = strdup(board_id->valuestring);
    if (board_section_id && !cJSON_IsNull(board_section_id)) board_section_id_local_str = strdup(board_section_id->valuestring);
    if (created_at && !cJSON_IsNull(created_at)) created_at_local_str = strdup(created_at->valuestring);
    if (dominant_color && !cJSON_IsNull(dominant_color)) dominant_color_local_str = strdup(dominant_color->valuestring);
    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (parent_pin_id && !cJSON_IsNull(parent_pin_id)) parent_pin_id_local_str = strdup(parent_pin_id->valuestring);
    if (alt_text && !cJSON_IsNull(alt_text)) alt_text_local_str = strdup(alt_text->valuestring);
    if (description && !cJSON_IsNull(description)) description_local_str = strdup(description->valuestring);
    if (link && !cJSON_IsNull(link)) link_local_str = strdup(link->valuestring);
    if (title && !cJSON_IsNull(title)) title_local_str = strdup(title->valuestring);

    pin_read_local_var = pin_read_create_internal (
        ai_disclosures ? ai_disclosures_local_nonprim : NULL,
        board_id_local_str,
        board_owner ? board_owner_local_nonprim : NULL,
        board_section_id_local_str,
        created_at_local_str,
        creative_type ? creative_type_local_nonprim : NULL,
        dominant_color_local_str,
        has_been_promoted_local_var,
        id_local_str,
        is_owner_local_var,
        is_product_local_var,
        is_standard_local_var,
        media ? media_local_nonprim : NULL,
        parent_pin_id_local_str,
        pin_metrics ? pin_metrics_local_object : NULL,
        alt_text_local_str,
        description_local_str,
        link_local_str,
        title_local_str
        );

    if (!pin_read_local_var) {
        goto end;
    }

    return pin_read_local_var;
end:
    if (ai_disclosures_local_nonprim) {
        ai_disclosures_free(ai_disclosures_local_nonprim);
        ai_disclosures_local_nonprim = NULL;
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
    if (media_local_nonprim) {
        pin_media_free(media_local_nonprim);
        media_local_nonprim = NULL;
    }
    if (parent_pin_id_local_str) {
        free(parent_pin_id_local_str);
        parent_pin_id_local_str = NULL;
    }
    if (alt_text_local_str) {
        free(alt_text_local_str);
        alt_text_local_str = NULL;
    }
    if (description_local_str) {
        free(description_local_str);
        description_local_str = NULL;
    }
    if (link_local_str) {
        free(link_local_str);
        link_local_str = NULL;
    }
    if (title_local_str) {
        free(title_local_str);
        title_local_str = NULL;
    }
    return NULL;

}
