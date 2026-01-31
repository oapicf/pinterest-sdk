#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "s3_multipart_upload_data.h"



static s3_multipart_upload_data_t *s3_multipart_upload_data_create_internal(
    list_t *file_parts
    ) {
    s3_multipart_upload_data_t *s3_multipart_upload_data_local_var = malloc(sizeof(s3_multipart_upload_data_t));
    if (!s3_multipart_upload_data_local_var) {
        return NULL;
    }
    s3_multipart_upload_data_local_var->file_parts = file_parts;

    s3_multipart_upload_data_local_var->_library_owned = 1;
    return s3_multipart_upload_data_local_var;
}

__attribute__((deprecated)) s3_multipart_upload_data_t *s3_multipart_upload_data_create(
    list_t *file_parts
    ) {
    return s3_multipart_upload_data_create_internal (
        file_parts
        );
}

void s3_multipart_upload_data_free(s3_multipart_upload_data_t *s3_multipart_upload_data) {
    if(NULL == s3_multipart_upload_data){
        return ;
    }
    if(s3_multipart_upload_data->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "s3_multipart_upload_data_free");
        return ;
    }
    listEntry_t *listEntry;
    if (s3_multipart_upload_data->file_parts) {
        list_ForEach(listEntry, s3_multipart_upload_data->file_parts) {
            s3_file_part_free(listEntry->data);
        }
        list_freeList(s3_multipart_upload_data->file_parts);
        s3_multipart_upload_data->file_parts = NULL;
    }
    free(s3_multipart_upload_data);
}

cJSON *s3_multipart_upload_data_convertToJSON(s3_multipart_upload_data_t *s3_multipart_upload_data) {
    cJSON *item = cJSON_CreateObject();

    // s3_multipart_upload_data->file_parts
    if(s3_multipart_upload_data->file_parts) {
    cJSON *file_parts = cJSON_AddArrayToObject(item, "file_parts");
    if(file_parts == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *file_partsListEntry;
    if (s3_multipart_upload_data->file_parts) {
    list_ForEach(file_partsListEntry, s3_multipart_upload_data->file_parts) {
    cJSON *itemLocal = s3_file_part_convertToJSON(file_partsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(file_parts, itemLocal);
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

s3_multipart_upload_data_t *s3_multipart_upload_data_parseFromJSON(cJSON *s3_multipart_upload_dataJSON){

    s3_multipart_upload_data_t *s3_multipart_upload_data_local_var = NULL;

    // define the local list for s3_multipart_upload_data->file_parts
    list_t *file_partsList = NULL;

    // s3_multipart_upload_data->file_parts
    cJSON *file_parts = cJSON_GetObjectItemCaseSensitive(s3_multipart_upload_dataJSON, "file_parts");
    if (cJSON_IsNull(file_parts)) {
        file_parts = NULL;
    }
    if (file_parts) { 
    cJSON *file_parts_local_nonprimitive = NULL;
    if(!cJSON_IsArray(file_parts)){
        goto end; //nonprimitive container
    }

    file_partsList = list_createList();

    cJSON_ArrayForEach(file_parts_local_nonprimitive,file_parts )
    {
        if(!cJSON_IsObject(file_parts_local_nonprimitive)){
            goto end;
        }
        s3_file_part_t *file_partsItem = s3_file_part_parseFromJSON(file_parts_local_nonprimitive);

        list_addElement(file_partsList, file_partsItem);
    }
    }


    s3_multipart_upload_data_local_var = s3_multipart_upload_data_create_internal (
        file_parts ? file_partsList : NULL
        );

    return s3_multipart_upload_data_local_var;
end:
    if (file_partsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, file_partsList) {
            s3_file_part_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(file_partsList);
        file_partsList = NULL;
    }
    return NULL;

}
