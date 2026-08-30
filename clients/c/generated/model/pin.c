#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pin.h"



static pin_t *pin_create_internal(
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
    pin_t *pin_local_var = malloc(sizeof(pin_t));
    if (!pin_local_var) {
        return NULL;
    }
    memset(pin_local_var, 0, sizeof(pin_t));
    pin_local_var->_library_owned = 1;
    pin_local_var->ai_disclosures = ai_disclosures;
    pin_local_var->board_id = board_id;
    pin_local_var->board_owner = board_owner;
    pin_local_var->board_section_id = board_section_id;
    pin_local_var->created_at = created_at;
    pin_local_var->creative_type = creative_type;
    pin_local_var->dominant_color = dominant_color;
    pin_local_var->has_been_promoted = has_been_promoted;
    pin_local_var->id = id;
    pin_local_var->is_owner = is_owner;
    pin_local_var->is_product = is_product;
    pin_local_var->is_standard = is_standard;
    pin_local_var->media = media;
    pin_local_var->parent_pin_id = parent_pin_id;
    pin_local_var->pin_metrics = pin_metrics;
    pin_local_var->alt_text = alt_text;
    pin_local_var->description = description;
    pin_local_var->link = link;
    pin_local_var->title = title;
    return pin_local_var;
}

__attribute__((deprecated)) pin_t *pin_create(
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
    pin_t *result = pin_create_internal (
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

void pin_free(pin_t *pin) {
    if(NULL == pin){
        return ;
    }
    if(pin->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pin_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pin->ai_disclosures) {
        ai_disclosures_free(pin->ai_disclosures);
        pin->ai_disclosures = NULL;
    }
    if (pin->board_id) {
        free(pin->board_id);
        pin->board_id = NULL;
    }
    if (pin->board_owner) {
        board_owner_free(pin->board_owner);
        pin->board_owner = NULL;
    }
    if (pin->board_section_id) {
        free(pin->board_section_id);
        pin->board_section_id = NULL;
    }
    if (pin->created_at) {
        free(pin->created_at);
        pin->created_at = NULL;
    }
    if (pin->creative_type) {
        creative_type_free(pin->creative_type);
        pin->creative_type = NULL;
    }
    if (pin->dominant_color) {
        free(pin->dominant_color);
        pin->dominant_color = NULL;
    }
    if (pin->has_been_promoted) {
        free(pin->has_been_promoted);
        pin->has_been_promoted = NULL;
    }
    if (pin->id) {
        free(pin->id);
        pin->id = NULL;
    }
    if (pin->is_owner) {
        free(pin->is_owner);
        pin->is_owner = NULL;
    }
    if (pin->is_product) {
        free(pin->is_product);
        pin->is_product = NULL;
    }
    if (pin->is_standard) {
        free(pin->is_standard);
        pin->is_standard = NULL;
    }
    if (pin->media) {
        pin_media_free(pin->media);
        pin->media = NULL;
    }
    if (pin->parent_pin_id) {
        free(pin->parent_pin_id);
        pin->parent_pin_id = NULL;
    }
    if (pin->pin_metrics) {
        object_free(pin->pin_metrics);
        pin->pin_metrics = NULL;
    }
    if (pin->alt_text) {
        free(pin->alt_text);
        pin->alt_text = NULL;
    }
    if (pin->description) {
        free(pin->description);
        pin->description = NULL;
    }
    if (pin->link) {
        free(pin->link);
        pin->link = NULL;
    }
    if (pin->title) {
        free(pin->title);
        pin->title = NULL;
    }
    free(pin);
}

cJSON *pin_convertToJSON(pin_t *pin) {
    cJSON *item = cJSON_CreateObject();

    // pin->ai_disclosures
    if(pin->ai_disclosures) {
    cJSON *ai_disclosures_local_JSON = ai_disclosures_convertToJSON(pin->ai_disclosures);
    if(ai_disclosures_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ai_disclosures", ai_disclosures_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // pin->board_id
    if(pin->board_id) {
    if(cJSON_AddStringToObject(item, "board_id", pin->board_id) == NULL) {
    goto fail; //String
    }
    }


    // pin->board_owner
    if(pin->board_owner) {
    cJSON *board_owner_local_JSON = board_owner_convertToJSON(pin->board_owner);
    if(board_owner_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "board_owner", board_owner_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // pin->board_section_id
    if(pin->board_section_id) {
    if(cJSON_AddStringToObject(item, "board_section_id", pin->board_section_id) == NULL) {
    goto fail; //String
    }
    }


    // pin->created_at
    if(pin->created_at) {
    if(cJSON_AddStringToObject(item, "created_at", pin->created_at) == NULL) {
    goto fail; //Date-Time
    }
    }


    // pin->creative_type
    if(pin->creative_type) {
    cJSON *creative_type_local_JSON = creative_type_convertToJSON(pin->creative_type);
    if(creative_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "creative_type", creative_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // pin->dominant_color
    if(pin->dominant_color) {
    if(cJSON_AddStringToObject(item, "dominant_color", pin->dominant_color) == NULL) {
    goto fail; //String
    }
    }


    // pin->has_been_promoted
    if(pin->has_been_promoted) {
    if(cJSON_AddBoolToObject(item, "has_been_promoted", *pin->has_been_promoted) == NULL) {
    goto fail; //Bool
    }
    }


    // pin->id
    if (!pin->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", pin->id) == NULL) {
    goto fail; //String
    }


    // pin->is_owner
    if(pin->is_owner) {
    if(cJSON_AddBoolToObject(item, "is_owner", *pin->is_owner) == NULL) {
    goto fail; //Bool
    }
    }


    // pin->is_product
    if(pin->is_product) {
    if(cJSON_AddBoolToObject(item, "is_product", *pin->is_product) == NULL) {
    goto fail; //Bool
    }
    }


    // pin->is_standard
    if(pin->is_standard) {
    if(cJSON_AddBoolToObject(item, "is_standard", *pin->is_standard) == NULL) {
    goto fail; //Bool
    }
    }


    // pin->media
    if(pin->media) {
    cJSON *media_local_JSON = pin_media_convertToJSON(pin->media);
    if(media_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "media", media_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // pin->parent_pin_id
    if(pin->parent_pin_id) {
    if(cJSON_AddStringToObject(item, "parent_pin_id", pin->parent_pin_id) == NULL) {
    goto fail; //String
    }
    }


    // pin->pin_metrics
    if(pin->pin_metrics) {
    cJSON *pin_metrics_object = object_convertToJSON(pin->pin_metrics);
    if(pin_metrics_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pin_metrics", pin_metrics_object);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // pin->alt_text
    if(pin->alt_text) {
    if(cJSON_AddStringToObject(item, "alt_text", pin->alt_text) == NULL) {
    goto fail; //String
    }
    }


    // pin->description
    if(pin->description) {
    if(cJSON_AddStringToObject(item, "description", pin->description) == NULL) {
    goto fail; //String
    }
    }


    // pin->link
    if(pin->link) {
    if(cJSON_AddStringToObject(item, "link", pin->link) == NULL) {
    goto fail; //String
    }
    }


    // pin->title
    if(pin->title) {
    if(cJSON_AddStringToObject(item, "title", pin->title) == NULL) {
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

pin_t *pin_parseFromJSON(cJSON *pinJSON){

    pin_t *pin_local_var = NULL;

    // define the local variable for pin->ai_disclosures
    ai_disclosures_t *ai_disclosures_local_nonprim = NULL;

    char *board_id_local_str = NULL;

    // define the local variable for pin->board_owner
    board_owner_t *board_owner_local_nonprim = NULL;

    char *board_section_id_local_str = NULL;

    char *created_at_local_str = NULL;

    // define the local variable for pin->creative_type
    creative_type_t *creative_type_local_nonprim = NULL;

    char *dominant_color_local_str = NULL;

    // define the local variable for pin->has_been_promoted
    int *has_been_promoted_local_var = NULL;

    char *id_local_str = NULL;

    // define the local variable for pin->is_owner
    int *is_owner_local_var = NULL;

    // define the local variable for pin->is_product
    int *is_product_local_var = NULL;

    // define the local variable for pin->is_standard
    int *is_standard_local_var = NULL;

    // define the local variable for pin->media
    pin_media_t *media_local_nonprim = NULL;

    char *parent_pin_id_local_str = NULL;

    char *alt_text_local_str = NULL;

    char *description_local_str = NULL;

    char *link_local_str = NULL;

    char *title_local_str = NULL;

    // pin->ai_disclosures
    cJSON *ai_disclosures = cJSON_GetObjectItemCaseSensitive(pinJSON, "ai_disclosures");
    if (cJSON_IsNull(ai_disclosures)) {
        ai_disclosures = NULL;
    }
    if (ai_disclosures) { 
    ai_disclosures_local_nonprim = ai_disclosures_parseFromJSON(ai_disclosures); //nonprimitive
    }

    // pin->board_id
    cJSON *board_id = cJSON_GetObjectItemCaseSensitive(pinJSON, "board_id");
    if (cJSON_IsNull(board_id)) {
        board_id = NULL;
    }
    if (board_id) { 
    if(!cJSON_IsString(board_id) && !cJSON_IsNull(board_id))
    {
    goto end; //String
    }
    }

    // pin->board_owner
    cJSON *board_owner = cJSON_GetObjectItemCaseSensitive(pinJSON, "board_owner");
    if (cJSON_IsNull(board_owner)) {
        board_owner = NULL;
    }
    if (board_owner) { 
    board_owner_local_nonprim = board_owner_parseFromJSON(board_owner); //nonprimitive
    }

    // pin->board_section_id
    cJSON *board_section_id = cJSON_GetObjectItemCaseSensitive(pinJSON, "board_section_id");
    if (cJSON_IsNull(board_section_id)) {
        board_section_id = NULL;
    }
    if (board_section_id) { 
    if(!cJSON_IsString(board_section_id) && !cJSON_IsNull(board_section_id))
    {
    goto end; //String
    }
    }

    // pin->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(pinJSON, "created_at");
    if (cJSON_IsNull(created_at)) {
        created_at = NULL;
    }
    if (created_at) { 
    if(!cJSON_IsString(created_at) && !cJSON_IsNull(created_at))
    {
    goto end; //DateTime
    }
    }

    // pin->creative_type
    cJSON *creative_type = cJSON_GetObjectItemCaseSensitive(pinJSON, "creative_type");
    if (cJSON_IsNull(creative_type)) {
        creative_type = NULL;
    }
    if (creative_type) { 
    creative_type_local_nonprim = creative_type_parseFromJSON(creative_type); //custom
    }

    // pin->dominant_color
    cJSON *dominant_color = cJSON_GetObjectItemCaseSensitive(pinJSON, "dominant_color");
    if (cJSON_IsNull(dominant_color)) {
        dominant_color = NULL;
    }
    if (dominant_color) { 
    if(!cJSON_IsString(dominant_color) && !cJSON_IsNull(dominant_color))
    {
    goto end; //String
    }
    }

    // pin->has_been_promoted
    cJSON *has_been_promoted = cJSON_GetObjectItemCaseSensitive(pinJSON, "has_been_promoted");
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

    // pin->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(pinJSON, "id");
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

    // pin->is_owner
    cJSON *is_owner = cJSON_GetObjectItemCaseSensitive(pinJSON, "is_owner");
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

    // pin->is_product
    cJSON *is_product = cJSON_GetObjectItemCaseSensitive(pinJSON, "is_product");
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

    // pin->is_standard
    cJSON *is_standard = cJSON_GetObjectItemCaseSensitive(pinJSON, "is_standard");
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

    // pin->media
    cJSON *media = cJSON_GetObjectItemCaseSensitive(pinJSON, "media");
    if (cJSON_IsNull(media)) {
        media = NULL;
    }
    if (media) { 
    media_local_nonprim = pin_media_parseFromJSON(media); //nonprimitive
    }

    // pin->parent_pin_id
    cJSON *parent_pin_id = cJSON_GetObjectItemCaseSensitive(pinJSON, "parent_pin_id");
    if (cJSON_IsNull(parent_pin_id)) {
        parent_pin_id = NULL;
    }
    if (parent_pin_id) { 
    if(!cJSON_IsString(parent_pin_id) && !cJSON_IsNull(parent_pin_id))
    {
    goto end; //String
    }
    }

    // pin->pin_metrics
    cJSON *pin_metrics = cJSON_GetObjectItemCaseSensitive(pinJSON, "pin_metrics");
    if (cJSON_IsNull(pin_metrics)) {
        pin_metrics = NULL;
    }
    object_t *pin_metrics_local_object = NULL;
    if (pin_metrics) { 
    pin_metrics_local_object = object_parseFromJSON(pin_metrics); //object
    }

    // pin->alt_text
    cJSON *alt_text = cJSON_GetObjectItemCaseSensitive(pinJSON, "alt_text");
    if (cJSON_IsNull(alt_text)) {
        alt_text = NULL;
    }
    if (alt_text) { 
    if(!cJSON_IsString(alt_text) && !cJSON_IsNull(alt_text))
    {
    goto end; //String
    }
    }

    // pin->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(pinJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // pin->link
    cJSON *link = cJSON_GetObjectItemCaseSensitive(pinJSON, "link");
    if (cJSON_IsNull(link)) {
        link = NULL;
    }
    if (link) { 
    if(!cJSON_IsString(link) && !cJSON_IsNull(link))
    {
    goto end; //String
    }
    }

    // pin->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(pinJSON, "title");
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

    pin_local_var = pin_create_internal (
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

    if (!pin_local_var) {
        goto end;
    }

    return pin_local_var;
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
