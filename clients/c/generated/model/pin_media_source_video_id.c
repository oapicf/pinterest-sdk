#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pin_media_source_video_id.h"


char* pin_media_source_video_id_source_type_ToString(pinterest_rest_api_pin_media_source_video_id_SOURCETYPE_e source_type) {
    char* source_typeArray[] =  { "NULL", "video_id" };
    return source_typeArray[source_type];
}

pinterest_rest_api_pin_media_source_video_id_SOURCETYPE_e pin_media_source_video_id_source_type_FromString(char* source_type){
    int stringToReturn = 0;
    char *source_typeArray[] =  { "NULL", "video_id" };
    size_t sizeofArray = sizeof(source_typeArray) / sizeof(source_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(source_type, source_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static pin_media_source_video_id_t *pin_media_source_video_id_create_internal(
    content_type_t *cover_image_content_type,
    char *cover_image_data,
    int *cover_image_key_frame_time,
    char *cover_image_url,
    int *is_standard,
    char *media_id,
    pinterest_rest_api_pin_media_source_video_id_SOURCETYPE_e source_type
    ) {
    pin_media_source_video_id_t *pin_media_source_video_id_local_var = malloc(sizeof(pin_media_source_video_id_t));
    if (!pin_media_source_video_id_local_var) {
        return NULL;
    }
    memset(pin_media_source_video_id_local_var, 0, sizeof(pin_media_source_video_id_t));
    pin_media_source_video_id_local_var->_library_owned = 1;
    pin_media_source_video_id_local_var->cover_image_content_type = cover_image_content_type;
    pin_media_source_video_id_local_var->cover_image_data = cover_image_data;
    pin_media_source_video_id_local_var->cover_image_key_frame_time = cover_image_key_frame_time;
    pin_media_source_video_id_local_var->cover_image_url = cover_image_url;
    pin_media_source_video_id_local_var->is_standard = is_standard;
    pin_media_source_video_id_local_var->media_id = media_id;
    pin_media_source_video_id_local_var->source_type = source_type;
    return pin_media_source_video_id_local_var;
}

__attribute__((deprecated)) pin_media_source_video_id_t *pin_media_source_video_id_create(
    content_type_t *cover_image_content_type,
    char *cover_image_data,
    int *cover_image_key_frame_time,
    char *cover_image_url,
    int *is_standard,
    char *media_id,
    pinterest_rest_api_pin_media_source_video_id_SOURCETYPE_e source_type
    ) {
    int *cover_image_key_frame_time_copy = NULL;
    if (cover_image_key_frame_time) {
        cover_image_key_frame_time_copy = malloc(sizeof(int));
        if (cover_image_key_frame_time_copy) *cover_image_key_frame_time_copy = *cover_image_key_frame_time;
    }
    int *is_standard_copy = NULL;
    if (is_standard) {
        is_standard_copy = malloc(sizeof(int));
        if (is_standard_copy) *is_standard_copy = *is_standard;
    }
    pin_media_source_video_id_t *result = pin_media_source_video_id_create_internal (
        cover_image_content_type,
        cover_image_data,
        cover_image_key_frame_time_copy,
        cover_image_url,
        is_standard_copy,
        media_id,
        source_type
        );
    if (!result) {
        free(cover_image_key_frame_time_copy);
        free(is_standard_copy);
    }
    return result;
}

void pin_media_source_video_id_free(pin_media_source_video_id_t *pin_media_source_video_id) {
    if(NULL == pin_media_source_video_id){
        return ;
    }
    if(pin_media_source_video_id->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pin_media_source_video_id_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pin_media_source_video_id->cover_image_content_type) {
        content_type_free(pin_media_source_video_id->cover_image_content_type);
        pin_media_source_video_id->cover_image_content_type = NULL;
    }
    if (pin_media_source_video_id->cover_image_data) {
        free(pin_media_source_video_id->cover_image_data);
        pin_media_source_video_id->cover_image_data = NULL;
    }
    if (pin_media_source_video_id->cover_image_key_frame_time) {
        free(pin_media_source_video_id->cover_image_key_frame_time);
        pin_media_source_video_id->cover_image_key_frame_time = NULL;
    }
    if (pin_media_source_video_id->cover_image_url) {
        free(pin_media_source_video_id->cover_image_url);
        pin_media_source_video_id->cover_image_url = NULL;
    }
    if (pin_media_source_video_id->is_standard) {
        free(pin_media_source_video_id->is_standard);
        pin_media_source_video_id->is_standard = NULL;
    }
    if (pin_media_source_video_id->media_id) {
        free(pin_media_source_video_id->media_id);
        pin_media_source_video_id->media_id = NULL;
    }
    free(pin_media_source_video_id);
}

cJSON *pin_media_source_video_id_convertToJSON(pin_media_source_video_id_t *pin_media_source_video_id) {
    cJSON *item = cJSON_CreateObject();

    // pin_media_source_video_id->cover_image_content_type
    if(pin_media_source_video_id->cover_image_content_type) {
    cJSON *cover_image_content_type_local_JSON = content_type_convertToJSON(pin_media_source_video_id->cover_image_content_type);
    if(cover_image_content_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "cover_image_content_type", cover_image_content_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // pin_media_source_video_id->cover_image_data
    if(pin_media_source_video_id->cover_image_data) {
    if(cJSON_AddStringToObject(item, "cover_image_data", pin_media_source_video_id->cover_image_data) == NULL) {
    goto fail; //String
    }
    }


    // pin_media_source_video_id->cover_image_key_frame_time
    if(pin_media_source_video_id->cover_image_key_frame_time) {
    if(cJSON_AddNumberToObject(item, "cover_image_key_frame_time", *pin_media_source_video_id->cover_image_key_frame_time) == NULL) {
    goto fail; //Numeric
    }
    }


    // pin_media_source_video_id->cover_image_url
    if(pin_media_source_video_id->cover_image_url) {
    if(cJSON_AddStringToObject(item, "cover_image_url", pin_media_source_video_id->cover_image_url) == NULL) {
    goto fail; //String
    }
    }


    // pin_media_source_video_id->is_standard
    if(pin_media_source_video_id->is_standard) {
    if(cJSON_AddBoolToObject(item, "is_standard", *pin_media_source_video_id->is_standard) == NULL) {
    goto fail; //Bool
    }
    }


    // pin_media_source_video_id->media_id
    if (!pin_media_source_video_id->media_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "media_id", pin_media_source_video_id->media_id) == NULL) {
    goto fail; //String
    }


    // pin_media_source_video_id->source_type
    if (pinterest_rest_api_pin_media_source_video_id_SOURCETYPE_NULL == pin_media_source_video_id->source_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "source_type", pin_media_source_video_id_source_type_ToString(pin_media_source_video_id->source_type)) == NULL)
    {
    goto fail; //Enum
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pin_media_source_video_id_t *pin_media_source_video_id_parseFromJSON(cJSON *pin_media_source_video_idJSON){

    pin_media_source_video_id_t *pin_media_source_video_id_local_var = NULL;

    // define the local variable for pin_media_source_video_id->cover_image_content_type
    content_type_t *cover_image_content_type_local_nonprim = NULL;

    char *cover_image_data_local_str = NULL;

    // define the local variable for pin_media_source_video_id->cover_image_key_frame_time
    int *cover_image_key_frame_time_local_var = NULL;

    char *cover_image_url_local_str = NULL;

    // define the local variable for pin_media_source_video_id->is_standard
    int *is_standard_local_var = NULL;

    char *media_id_local_str = NULL;

    // pin_media_source_video_id->cover_image_content_type
    cJSON *cover_image_content_type = cJSON_GetObjectItemCaseSensitive(pin_media_source_video_idJSON, "cover_image_content_type");
    if (cJSON_IsNull(cover_image_content_type)) {
        cover_image_content_type = NULL;
    }
    if (cover_image_content_type) { 
    cover_image_content_type_local_nonprim = content_type_parseFromJSON(cover_image_content_type); //custom
    }

    // pin_media_source_video_id->cover_image_data
    cJSON *cover_image_data = cJSON_GetObjectItemCaseSensitive(pin_media_source_video_idJSON, "cover_image_data");
    if (cJSON_IsNull(cover_image_data)) {
        cover_image_data = NULL;
    }
    if (cover_image_data) { 
    if(!cJSON_IsString(cover_image_data) && !cJSON_IsNull(cover_image_data))
    {
    goto end; //String
    }
    }

    // pin_media_source_video_id->cover_image_key_frame_time
    cJSON *cover_image_key_frame_time = cJSON_GetObjectItemCaseSensitive(pin_media_source_video_idJSON, "cover_image_key_frame_time");
    if (cJSON_IsNull(cover_image_key_frame_time)) {
        cover_image_key_frame_time = NULL;
    }
    if (cover_image_key_frame_time) { 
    if(!cJSON_IsNumber(cover_image_key_frame_time))
    {
    goto end; //Numeric
    }
    cover_image_key_frame_time_local_var = malloc(sizeof(int));
    if(!cover_image_key_frame_time_local_var)
    {
        goto end;
    }
    *cover_image_key_frame_time_local_var = cover_image_key_frame_time->valuedouble;
    }

    // pin_media_source_video_id->cover_image_url
    cJSON *cover_image_url = cJSON_GetObjectItemCaseSensitive(pin_media_source_video_idJSON, "cover_image_url");
    if (cJSON_IsNull(cover_image_url)) {
        cover_image_url = NULL;
    }
    if (cover_image_url) { 
    if(!cJSON_IsString(cover_image_url) && !cJSON_IsNull(cover_image_url))
    {
    goto end; //String
    }
    }

    // pin_media_source_video_id->is_standard
    cJSON *is_standard = cJSON_GetObjectItemCaseSensitive(pin_media_source_video_idJSON, "is_standard");
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

    // pin_media_source_video_id->media_id
    cJSON *media_id = cJSON_GetObjectItemCaseSensitive(pin_media_source_video_idJSON, "media_id");
    if (cJSON_IsNull(media_id)) {
        media_id = NULL;
    }
    if (!media_id) {
        goto end;
    }

    
    if(!cJSON_IsString(media_id))
    {
    goto end; //String
    }

    // pin_media_source_video_id->source_type
    cJSON *source_type = cJSON_GetObjectItemCaseSensitive(pin_media_source_video_idJSON, "source_type");
    if (cJSON_IsNull(source_type)) {
        source_type = NULL;
    }
    if (!source_type) {
        goto end;
    }

    pinterest_rest_api_pin_media_source_video_id_SOURCETYPE_e source_typeVariable;
    
    if(!cJSON_IsString(source_type))
    {
    goto end; //Enum
    }
    source_typeVariable = pin_media_source_video_id_source_type_FromString(source_type->valuestring);


    if (cover_image_data && !cJSON_IsNull(cover_image_data)) cover_image_data_local_str = strdup(cover_image_data->valuestring);
    if (cover_image_url && !cJSON_IsNull(cover_image_url)) cover_image_url_local_str = strdup(cover_image_url->valuestring);
    if (media_id && !cJSON_IsNull(media_id)) media_id_local_str = strdup(media_id->valuestring);

    pin_media_source_video_id_local_var = pin_media_source_video_id_create_internal (
        cover_image_content_type ? cover_image_content_type_local_nonprim : NULL,
        cover_image_data_local_str,
        cover_image_key_frame_time_local_var,
        cover_image_url_local_str,
        is_standard_local_var,
        media_id_local_str,
        source_typeVariable
        );

    if (!pin_media_source_video_id_local_var) {
        goto end;
    }

    return pin_media_source_video_id_local_var;
end:
    if (cover_image_content_type_local_nonprim) {
        content_type_free(cover_image_content_type_local_nonprim);
        cover_image_content_type_local_nonprim = NULL;
    }
    if (cover_image_data_local_str) {
        free(cover_image_data_local_str);
        cover_image_data_local_str = NULL;
    }
    if (cover_image_key_frame_time_local_var) {
        free(cover_image_key_frame_time_local_var);
        cover_image_key_frame_time_local_var = NULL;
    }
    if (cover_image_url_local_str) {
        free(cover_image_url_local_str);
        cover_image_url_local_str = NULL;
    }
    if (is_standard_local_var) {
        free(is_standard_local_var);
        is_standard_local_var = NULL;
    }
    if (media_id_local_str) {
        free(media_id_local_str);
        media_id_local_str = NULL;
    }
    return NULL;

}
