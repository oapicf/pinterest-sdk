#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "image_metadata.h"



image_metadata_t *image_metadata_create(
    char *item_type,
    char *title,
    char *description,
    char *link,
    image_metadata_images_t *images
    ) {
    image_metadata_t *image_metadata_local_var = malloc(sizeof(image_metadata_t));
    if (!image_metadata_local_var) {
        return NULL;
    }
    image_metadata_local_var->item_type = item_type;
    image_metadata_local_var->title = title;
    image_metadata_local_var->description = description;
    image_metadata_local_var->link = link;
    image_metadata_local_var->images = images;

    return image_metadata_local_var;
}


void image_metadata_free(image_metadata_t *image_metadata) {
    if(NULL == image_metadata){
        return ;
    }
    listEntry_t *listEntry;
    if (image_metadata->item_type) {
        free(image_metadata->item_type);
        image_metadata->item_type = NULL;
    }
    if (image_metadata->title) {
        free(image_metadata->title);
        image_metadata->title = NULL;
    }
    if (image_metadata->description) {
        free(image_metadata->description);
        image_metadata->description = NULL;
    }
    if (image_metadata->link) {
        free(image_metadata->link);
        image_metadata->link = NULL;
    }
    if (image_metadata->images) {
        image_metadata_images_free(image_metadata->images);
        image_metadata->images = NULL;
    }
    free(image_metadata);
}

cJSON *image_metadata_convertToJSON(image_metadata_t *image_metadata) {
    cJSON *item = cJSON_CreateObject();

    // image_metadata->item_type
    if(image_metadata->item_type) {
    if(cJSON_AddStringToObject(item, "item_type", image_metadata->item_type) == NULL) {
    goto fail; //String
    }
    }


    // image_metadata->title
    if(image_metadata->title) {
    if(cJSON_AddStringToObject(item, "title", image_metadata->title) == NULL) {
    goto fail; //String
    }
    }


    // image_metadata->description
    if(image_metadata->description) {
    if(cJSON_AddStringToObject(item, "description", image_metadata->description) == NULL) {
    goto fail; //String
    }
    }


    // image_metadata->link
    if(image_metadata->link) {
    if(cJSON_AddStringToObject(item, "link", image_metadata->link) == NULL) {
    goto fail; //String
    }
    }


    // image_metadata->images
    if(image_metadata->images) {
    cJSON *images_local_JSON = image_metadata_images_convertToJSON(image_metadata->images);
    if(images_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "images", images_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

image_metadata_t *image_metadata_parseFromJSON(cJSON *image_metadataJSON){

    image_metadata_t *image_metadata_local_var = NULL;

    // define the local variable for image_metadata->images
    image_metadata_images_t *images_local_nonprim = NULL;

    // image_metadata->item_type
    cJSON *item_type = cJSON_GetObjectItemCaseSensitive(image_metadataJSON, "item_type");
    if (item_type) { 
    if(!cJSON_IsString(item_type) && !cJSON_IsNull(item_type))
    {
    goto end; //String
    }
    }

    // image_metadata->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(image_metadataJSON, "title");
    if (title) { 
    if(!cJSON_IsString(title) && !cJSON_IsNull(title))
    {
    goto end; //String
    }
    }

    // image_metadata->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(image_metadataJSON, "description");
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // image_metadata->link
    cJSON *link = cJSON_GetObjectItemCaseSensitive(image_metadataJSON, "link");
    if (link) { 
    if(!cJSON_IsString(link) && !cJSON_IsNull(link))
    {
    goto end; //String
    }
    }

    // image_metadata->images
    cJSON *images = cJSON_GetObjectItemCaseSensitive(image_metadataJSON, "images");
    if (images) { 
    images_local_nonprim = image_metadata_images_parseFromJSON(images); //nonprimitive
    }


    image_metadata_local_var = image_metadata_create (
        item_type && !cJSON_IsNull(item_type) ? strdup(item_type->valuestring) : NULL,
        title && !cJSON_IsNull(title) ? strdup(title->valuestring) : NULL,
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        link && !cJSON_IsNull(link) ? strdup(link->valuestring) : NULL,
        images ? images_local_nonprim : NULL
        );

    return image_metadata_local_var;
end:
    if (images_local_nonprim) {
        image_metadata_images_free(images_local_nonprim);
        images_local_nonprim = NULL;
    }
    return NULL;

}
