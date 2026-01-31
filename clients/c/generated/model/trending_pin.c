#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "trending_pin.h"



static trending_pin_t *trending_pin_create_internal(
    int height,
    char *id,
    char *src,
    int width
    ) {
    trending_pin_t *trending_pin_local_var = malloc(sizeof(trending_pin_t));
    if (!trending_pin_local_var) {
        return NULL;
    }
    trending_pin_local_var->height = height;
    trending_pin_local_var->id = id;
    trending_pin_local_var->src = src;
    trending_pin_local_var->width = width;

    trending_pin_local_var->_library_owned = 1;
    return trending_pin_local_var;
}

__attribute__((deprecated)) trending_pin_t *trending_pin_create(
    int height,
    char *id,
    char *src,
    int width
    ) {
    return trending_pin_create_internal (
        height,
        id,
        src,
        width
        );
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
    if (trending_pin->id) {
        free(trending_pin->id);
        trending_pin->id = NULL;
    }
    if (trending_pin->src) {
        free(trending_pin->src);
        trending_pin->src = NULL;
    }
    free(trending_pin);
}

cJSON *trending_pin_convertToJSON(trending_pin_t *trending_pin) {
    cJSON *item = cJSON_CreateObject();

    // trending_pin->height
    if (!trending_pin->height) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "height", trending_pin->height) == NULL) {
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


    // trending_pin->width
    if (!trending_pin->width) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "width", trending_pin->width) == NULL) {
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


    trending_pin_local_var = trending_pin_create_internal (
        height->valuedouble,
        strdup(id->valuestring),
        strdup(src->valuestring),
        width->valuedouble
        );

    return trending_pin_local_var;
end:
    return NULL;

}
