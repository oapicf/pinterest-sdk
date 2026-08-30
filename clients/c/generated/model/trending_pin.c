#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "trending_pin.h"



static trending_pin_t *trending_pin_create_internal(
    char *color,
    int *height,
    char *id,
    char *src,
    double *vertical_offset,
    int *width
    ) {
    trending_pin_t *trending_pin_local_var = malloc(sizeof(trending_pin_t));
    if (!trending_pin_local_var) {
        return NULL;
    }
    memset(trending_pin_local_var, 0, sizeof(trending_pin_t));
    trending_pin_local_var->_library_owned = 1;
    trending_pin_local_var->color = color;
    trending_pin_local_var->height = height;
    trending_pin_local_var->id = id;
    trending_pin_local_var->src = src;
    trending_pin_local_var->vertical_offset = vertical_offset;
    trending_pin_local_var->width = width;
    return trending_pin_local_var;
}

__attribute__((deprecated)) trending_pin_t *trending_pin_create(
    char *color,
    int *height,
    char *id,
    char *src,
    double *vertical_offset,
    int *width
    ) {
    int *height_copy = NULL;
    if (height) {
        height_copy = malloc(sizeof(int));
        if (height_copy) *height_copy = *height;
    }
    double *vertical_offset_copy = NULL;
    if (vertical_offset) {
        vertical_offset_copy = malloc(sizeof(double));
        if (vertical_offset_copy) *vertical_offset_copy = *vertical_offset;
    }
    int *width_copy = NULL;
    if (width) {
        width_copy = malloc(sizeof(int));
        if (width_copy) *width_copy = *width;
    }
    trending_pin_t *result = trending_pin_create_internal (
        color,
        height_copy,
        id,
        src,
        vertical_offset_copy,
        width_copy
        );
    if (!result) {
        free(height_copy);
        free(vertical_offset_copy);
        free(width_copy);
    }
    return result;
}

void trending_pin_free(trending_pin_t *trending_pin) {
    if(NULL == trending_pin){
        return ;
    }
    if(trending_pin->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "trending_pin_free");
        return ;
    }
    listEntry_t *listEntry;
    if (trending_pin->color) {
        free(trending_pin->color);
        trending_pin->color = NULL;
    }
    if (trending_pin->height) {
        free(trending_pin->height);
        trending_pin->height = NULL;
    }
    if (trending_pin->id) {
        free(trending_pin->id);
        trending_pin->id = NULL;
    }
    if (trending_pin->src) {
        free(trending_pin->src);
        trending_pin->src = NULL;
    }
    if (trending_pin->vertical_offset) {
        free(trending_pin->vertical_offset);
        trending_pin->vertical_offset = NULL;
    }
    if (trending_pin->width) {
        free(trending_pin->width);
        trending_pin->width = NULL;
    }
    free(trending_pin);
}

cJSON *trending_pin_convertToJSON(trending_pin_t *trending_pin) {
    cJSON *item = cJSON_CreateObject();

    // trending_pin->color
    if (!trending_pin->color) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "color", trending_pin->color) == NULL) {
    goto fail; //String
    }


    // trending_pin->height
    if (!trending_pin->height) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "height", *trending_pin->height) == NULL) {
    goto fail; //Numeric
    }


    // trending_pin->id
    if (!trending_pin->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", trending_pin->id) == NULL) {
    goto fail; //String
    }


    // trending_pin->src
    if (!trending_pin->src) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "src", trending_pin->src) == NULL) {
    goto fail; //String
    }


    // trending_pin->vertical_offset
    if(trending_pin->vertical_offset) {
    if(cJSON_AddNumberToObject(item, "vertical_offset", *trending_pin->vertical_offset) == NULL) {
    goto fail; //Numeric
    }
    }


    // trending_pin->width
    if (!trending_pin->width) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "width", *trending_pin->width) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

trending_pin_t *trending_pin_parseFromJSON(cJSON *trending_pinJSON){

    trending_pin_t *trending_pin_local_var = NULL;

    char *color_local_str = NULL;

    // define the local variable for trending_pin->height
    int *height_local_var = NULL;

    char *id_local_str = NULL;

    char *src_local_str = NULL;

    // define the local variable for trending_pin->vertical_offset
    double *vertical_offset_local_var = NULL;

    // define the local variable for trending_pin->width
    int *width_local_var = NULL;

    // trending_pin->color
    cJSON *color = cJSON_GetObjectItemCaseSensitive(trending_pinJSON, "color");
    if (cJSON_IsNull(color)) {
        color = NULL;
    }
    if (!color) {
        goto end;
    }

    
    if(!cJSON_IsString(color))
    {
    goto end; //String
    }

    // trending_pin->height
    cJSON *height = cJSON_GetObjectItemCaseSensitive(trending_pinJSON, "height");
    if (cJSON_IsNull(height)) {
        height = NULL;
    }
    if (!height) {
        goto end;
    }

    
    if(!cJSON_IsNumber(height))
    {
    goto end; //Numeric
    }
    height_local_var = malloc(sizeof(int));
    if(!height_local_var)
    {
        goto end;
    }
    *height_local_var = height->valuedouble;

    // trending_pin->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(trending_pinJSON, "id");
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

    // trending_pin->src
    cJSON *src = cJSON_GetObjectItemCaseSensitive(trending_pinJSON, "src");
    if (cJSON_IsNull(src)) {
        src = NULL;
    }
    if (!src) {
        goto end;
    }

    
    if(!cJSON_IsString(src))
    {
    goto end; //String
    }

    // trending_pin->vertical_offset
    cJSON *vertical_offset = cJSON_GetObjectItemCaseSensitive(trending_pinJSON, "vertical_offset");
    if (cJSON_IsNull(vertical_offset)) {
        vertical_offset = NULL;
    }
    if (vertical_offset) { 
    if(!cJSON_IsNumber(vertical_offset))
    {
    goto end; //Numeric
    }
    vertical_offset_local_var = malloc(sizeof(double));
    if(!vertical_offset_local_var)
    {
        goto end;
    }
    *vertical_offset_local_var = vertical_offset->valuedouble;
    }

    // trending_pin->width
    cJSON *width = cJSON_GetObjectItemCaseSensitive(trending_pinJSON, "width");
    if (cJSON_IsNull(width)) {
        width = NULL;
    }
    if (!width) {
        goto end;
    }

    
    if(!cJSON_IsNumber(width))
    {
    goto end; //Numeric
    }
    width_local_var = malloc(sizeof(int));
    if(!width_local_var)
    {
        goto end;
    }
    *width_local_var = width->valuedouble;


    if (color && !cJSON_IsNull(color)) color_local_str = strdup(color->valuestring);
    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (src && !cJSON_IsNull(src)) src_local_str = strdup(src->valuestring);

    trending_pin_local_var = trending_pin_create_internal (
        color_local_str,
        height_local_var,
        id_local_str,
        src_local_str,
        vertical_offset_local_var,
        width_local_var
        );

    if (!trending_pin_local_var) {
        goto end;
    }

    return trending_pin_local_var;
end:
    if (color_local_str) {
        free(color_local_str);
        color_local_str = NULL;
    }
    if (height_local_var) {
        free(height_local_var);
        height_local_var = NULL;
    }
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (src_local_str) {
        free(src_local_str);
        src_local_str = NULL;
    }
    if (vertical_offset_local_var) {
        free(vertical_offset_local_var);
        vertical_offset_local_var = NULL;
    }
    if (width_local_var) {
        free(width_local_var);
        width_local_var = NULL;
    }
    return NULL;

}
