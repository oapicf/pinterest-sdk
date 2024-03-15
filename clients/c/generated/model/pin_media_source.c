#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pin_media_source.h"


char* pin_media_source_source_type_ToString(pinterest_rest_api_pin_media_source_SOURCETYPE_e source_type) {
    char* source_typeArray[] =  { "NULL", "pin_url" };
    return source_typeArray[source_type];
}

pinterest_rest_api_pin_media_source_SOURCETYPE_e pin_media_source_source_type_FromString(char* source_type){
    int stringToReturn = 0;
    char *source_typeArray[] =  { "NULL", "pin_url" };
    size_t sizeofArray = sizeof(source_typeArray) / sizeof(source_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(source_type, source_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* pin_media_source_content_type_ToString(pinterest_rest_api_pin_media_source_CONTENTTYPE_e content_type) {
    char* content_typeArray[] =  { "NULL", "image/jpeg", "image/png" };
    return content_typeArray[content_type];
}

pinterest_rest_api_pin_media_source_CONTENTTYPE_e pin_media_source_content_type_FromString(char* content_type){
    int stringToReturn = 0;
    char *content_typeArray[] =  { "NULL", "image/jpeg", "image/png" };
    size_t sizeofArray = sizeof(content_typeArray) / sizeof(content_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(content_type, content_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* pin_media_source_cover_image_content_type_ToString(pinterest_rest_api_pin_media_source_COVERIMAGECONTENTTYPE_e cover_image_content_type) {
    char* cover_image_content_typeArray[] =  { "NULL", "image/jpeg", "image/png" };
    return cover_image_content_typeArray[cover_image_content_type];
}

pinterest_rest_api_pin_media_source_COVERIMAGECONTENTTYPE_e pin_media_source_cover_image_content_type_FromString(char* cover_image_content_type){
    int stringToReturn = 0;
    char *cover_image_content_typeArray[] =  { "NULL", "image/jpeg", "image/png" };
    size_t sizeofArray = sizeof(cover_image_content_typeArray) / sizeof(cover_image_content_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(cover_image_content_type, cover_image_content_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

pin_media_source_t *pin_media_source_create(
    pinterest_rest_api_pin_media_source_SOURCETYPE_e source_type,
    pinterest_rest_api_pin_media_source_CONTENTTYPE_e content_type,
    char *data,
    int is_standard,
    char *url,
    char *cover_image_url,
    pinterest_rest_api_pin_media_source_COVERIMAGECONTENTTYPE_e cover_image_content_type,
    char *cover_image_data,
    char *media_id,
    list_t *items,
    int index,
    int is_affiliate_link
    ) {
    pin_media_source_t *pin_media_source_local_var = malloc(sizeof(pin_media_source_t));
    if (!pin_media_source_local_var) {
        return NULL;
    }
    pin_media_source_local_var->source_type = source_type;
    pin_media_source_local_var->content_type = content_type;
    pin_media_source_local_var->data = data;
    pin_media_source_local_var->is_standard = is_standard;
    pin_media_source_local_var->url = url;
    pin_media_source_local_var->cover_image_url = cover_image_url;
    pin_media_source_local_var->cover_image_content_type = cover_image_content_type;
    pin_media_source_local_var->cover_image_data = cover_image_data;
    pin_media_source_local_var->media_id = media_id;
    pin_media_source_local_var->items = items;
    pin_media_source_local_var->index = index;
    pin_media_source_local_var->is_affiliate_link = is_affiliate_link;

    return pin_media_source_local_var;
}


void pin_media_source_free(pin_media_source_t *pin_media_source) {
    if(NULL == pin_media_source){
        return ;
    }
    listEntry_t *listEntry;
    if (pin_media_source->data) {
        free(pin_media_source->data);
        pin_media_source->data = NULL;
    }
    if (pin_media_source->url) {
        free(pin_media_source->url);
        pin_media_source->url = NULL;
    }
    if (pin_media_source->cover_image_url) {
        free(pin_media_source->cover_image_url);
        pin_media_source->cover_image_url = NULL;
    }
    if (pin_media_source->cover_image_data) {
        free(pin_media_source->cover_image_data);
        pin_media_source->cover_image_data = NULL;
    }
    if (pin_media_source->media_id) {
        free(pin_media_source->media_id);
        pin_media_source->media_id = NULL;
    }
    if (pin_media_source->items) {
        list_ForEach(listEntry, pin_media_source->items) {
            pin_media_source_images_url_items_inner_free(listEntry->data);
        }
        list_freeList(pin_media_source->items);
        pin_media_source->items = NULL;
    }
    free(pin_media_source);
}

cJSON *pin_media_source_convertToJSON(pin_media_source_t *pin_media_source) {
    cJSON *item = cJSON_CreateObject();

    // pin_media_source->source_type
    if (pinterest_rest_api_pin_media_source_SOURCETYPE_NULL == pin_media_source->source_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "source_type", source_typepin_media_source_ToString(pin_media_source->source_type)) == NULL)
    {
    goto fail; //Enum
    }


    // pin_media_source->content_type
    if (pinterest_rest_api_pin_media_source_CONTENTTYPE_NULL == pin_media_source->content_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "content_type", content_typepin_media_source_ToString(pin_media_source->content_type)) == NULL)
    {
    goto fail; //Enum
    }


    // pin_media_source->data
    if (!pin_media_source->data) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "data", pin_media_source->data) == NULL) {
    goto fail; //String
    }


    // pin_media_source->is_standard
    if(pin_media_source->is_standard) {
    if(cJSON_AddBoolToObject(item, "is_standard", pin_media_source->is_standard) == NULL) {
    goto fail; //Bool
    }
    }


    // pin_media_source->url
    if (!pin_media_source->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", pin_media_source->url) == NULL) {
    goto fail; //String
    }


    // pin_media_source->cover_image_url
    if(pin_media_source->cover_image_url) {
    if(cJSON_AddStringToObject(item, "cover_image_url", pin_media_source->cover_image_url) == NULL) {
    goto fail; //String
    }
    }


    // pin_media_source->cover_image_content_type
    if(pin_media_source->cover_image_content_type != pinterest_rest_api_pin_media_source_COVERIMAGECONTENTTYPE_NULL) {
    if(cJSON_AddStringToObject(item, "cover_image_content_type", cover_image_content_typepin_media_source_ToString(pin_media_source->cover_image_content_type)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // pin_media_source->cover_image_data
    if(pin_media_source->cover_image_data) {
    if(cJSON_AddStringToObject(item, "cover_image_data", pin_media_source->cover_image_data) == NULL) {
    goto fail; //String
    }
    }


    // pin_media_source->media_id
    if (!pin_media_source->media_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "media_id", pin_media_source->media_id) == NULL) {
    goto fail; //String
    }


    // pin_media_source->items
    if (!pin_media_source->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (pin_media_source->items) {
    list_ForEach(itemsListEntry, pin_media_source->items) {
    cJSON *itemLocal = pin_media_source_images_url_items_inner_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }


    // pin_media_source->index
    if(pin_media_source->index) {
    if(cJSON_AddNumberToObject(item, "index", pin_media_source->index) == NULL) {
    goto fail; //Numeric
    }
    }


    // pin_media_source->is_affiliate_link
    if(pin_media_source->is_affiliate_link) {
    if(cJSON_AddBoolToObject(item, "is_affiliate_link", pin_media_source->is_affiliate_link) == NULL) {
    goto fail; //Bool
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pin_media_source_t *pin_media_source_parseFromJSON(cJSON *pin_media_sourceJSON){

    pin_media_source_t *pin_media_source_local_var = NULL;

    // define the local list for pin_media_source->items
    list_t *itemsList = NULL;

    // pin_media_source->source_type
    cJSON *source_type = cJSON_GetObjectItemCaseSensitive(pin_media_sourceJSON, "source_type");
    if (!source_type) {
        goto end;
    }

    pinterest_rest_api_pin_media_source_SOURCETYPE_e source_typeVariable;
    
    if(!cJSON_IsString(source_type))
    {
    goto end; //Enum
    }
    source_typeVariable = pin_media_source_source_type_FromString(source_type->valuestring);

    // pin_media_source->content_type
    cJSON *content_type = cJSON_GetObjectItemCaseSensitive(pin_media_sourceJSON, "content_type");
    if (!content_type) {
        goto end;
    }

    pinterest_rest_api_pin_media_source_CONTENTTYPE_e content_typeVariable;
    
    if(!cJSON_IsString(content_type))
    {
    goto end; //Enum
    }
    content_typeVariable = pin_media_source_content_type_FromString(content_type->valuestring);

    // pin_media_source->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(pin_media_sourceJSON, "data");
    if (!data) {
        goto end;
    }

    
    if(!cJSON_IsString(data))
    {
    goto end; //String
    }

    // pin_media_source->is_standard
    cJSON *is_standard = cJSON_GetObjectItemCaseSensitive(pin_media_sourceJSON, "is_standard");
    if (is_standard) { 
    if(!cJSON_IsBool(is_standard))
    {
    goto end; //Bool
    }
    }

    // pin_media_source->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(pin_media_sourceJSON, "url");
    if (!url) {
        goto end;
    }

    
    if(!cJSON_IsString(url))
    {
    goto end; //String
    }

    // pin_media_source->cover_image_url
    cJSON *cover_image_url = cJSON_GetObjectItemCaseSensitive(pin_media_sourceJSON, "cover_image_url");
    if (cover_image_url) { 
    if(!cJSON_IsString(cover_image_url) && !cJSON_IsNull(cover_image_url))
    {
    goto end; //String
    }
    }

    // pin_media_source->cover_image_content_type
    cJSON *cover_image_content_type = cJSON_GetObjectItemCaseSensitive(pin_media_sourceJSON, "cover_image_content_type");
    pinterest_rest_api_pin_media_source_COVERIMAGECONTENTTYPE_e cover_image_content_typeVariable;
    if (cover_image_content_type) { 
    if(!cJSON_IsString(cover_image_content_type))
    {
    goto end; //Enum
    }
    cover_image_content_typeVariable = pin_media_source_cover_image_content_type_FromString(cover_image_content_type->valuestring);
    }

    // pin_media_source->cover_image_data
    cJSON *cover_image_data = cJSON_GetObjectItemCaseSensitive(pin_media_sourceJSON, "cover_image_data");
    if (cover_image_data) { 
    if(!cJSON_IsString(cover_image_data) && !cJSON_IsNull(cover_image_data))
    {
    goto end; //String
    }
    }

    // pin_media_source->media_id
    cJSON *media_id = cJSON_GetObjectItemCaseSensitive(pin_media_sourceJSON, "media_id");
    if (!media_id) {
        goto end;
    }

    
    if(!cJSON_IsString(media_id))
    {
    goto end; //String
    }

    // pin_media_source->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(pin_media_sourceJSON, "items");
    if (!items) {
        goto end;
    }

    
    cJSON *items_local_nonprimitive = NULL;
    if(!cJSON_IsArray(items)){
        goto end; //nonprimitive container
    }

    itemsList = list_createList();

    cJSON_ArrayForEach(items_local_nonprimitive,items )
    {
        if(!cJSON_IsObject(items_local_nonprimitive)){
            goto end;
        }
        pin_media_source_images_url_items_inner_t *itemsItem = pin_media_source_images_url_items_inner_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }

    // pin_media_source->index
    cJSON *index = cJSON_GetObjectItemCaseSensitive(pin_media_sourceJSON, "index");
    if (index) { 
    if(!cJSON_IsNumber(index))
    {
    goto end; //Numeric
    }
    }

    // pin_media_source->is_affiliate_link
    cJSON *is_affiliate_link = cJSON_GetObjectItemCaseSensitive(pin_media_sourceJSON, "is_affiliate_link");
    if (is_affiliate_link) { 
    if(!cJSON_IsBool(is_affiliate_link))
    {
    goto end; //Bool
    }
    }


    pin_media_source_local_var = pin_media_source_create (
        source_typeVariable,
        content_typeVariable,
        strdup(data->valuestring),
        is_standard ? is_standard->valueint : 0,
        strdup(url->valuestring),
        cover_image_url && !cJSON_IsNull(cover_image_url) ? strdup(cover_image_url->valuestring) : NULL,
        cover_image_content_type ? cover_image_content_typeVariable : pinterest_rest_api_pin_media_source_COVERIMAGECONTENTTYPE_NULL,
        cover_image_data && !cJSON_IsNull(cover_image_data) ? strdup(cover_image_data->valuestring) : NULL,
        strdup(media_id->valuestring),
        itemsList,
        index ? index->valuedouble : 0,
        is_affiliate_link ? is_affiliate_link->valueint : 0
        );

    return pin_media_source_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            pin_media_source_images_url_items_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
