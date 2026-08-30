#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "s3_file_part.h"



static s3_file_part_t *s3_file_part_create_internal(
    int *part_number,
    char *presigned_url
    ) {
    s3_file_part_t *s3_file_part_local_var = malloc(sizeof(s3_file_part_t));
    if (!s3_file_part_local_var) {
        return NULL;
    }
    memset(s3_file_part_local_var, 0, sizeof(s3_file_part_t));
    s3_file_part_local_var->_library_owned = 1;
    s3_file_part_local_var->part_number = part_number;
    s3_file_part_local_var->presigned_url = presigned_url;
    return s3_file_part_local_var;
}

__attribute__((deprecated)) s3_file_part_t *s3_file_part_create(
    int *part_number,
    char *presigned_url
    ) {
    int *part_number_copy = NULL;
    if (part_number) {
        part_number_copy = malloc(sizeof(int));
        if (part_number_copy) *part_number_copy = *part_number;
    }
    s3_file_part_t *result = s3_file_part_create_internal (
        part_number_copy,
        presigned_url
        );
    if (!result) {
        free(part_number_copy);
    }
    return result;
}

void s3_file_part_free(s3_file_part_t *s3_file_part) {
    if(NULL == s3_file_part){
        return ;
    }
    if(s3_file_part->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "s3_file_part_free");
        return ;
    }
    listEntry_t *listEntry;
    if (s3_file_part->part_number) {
        free(s3_file_part->part_number);
        s3_file_part->part_number = NULL;
    }
    if (s3_file_part->presigned_url) {
        free(s3_file_part->presigned_url);
        s3_file_part->presigned_url = NULL;
    }
    free(s3_file_part);
}

cJSON *s3_file_part_convertToJSON(s3_file_part_t *s3_file_part) {
    cJSON *item = cJSON_CreateObject();

    // s3_file_part->part_number
    if (!s3_file_part->part_number) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "part_number", *s3_file_part->part_number) == NULL) {
    goto fail; //Numeric
    }


    // s3_file_part->presigned_url
    if (!s3_file_part->presigned_url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "presigned_url", s3_file_part->presigned_url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

s3_file_part_t *s3_file_part_parseFromJSON(cJSON *s3_file_partJSON){

    s3_file_part_t *s3_file_part_local_var = NULL;

    // define the local variable for s3_file_part->part_number
    int *part_number_local_var = NULL;

    char *presigned_url_local_str = NULL;

    // s3_file_part->part_number
    cJSON *part_number = cJSON_GetObjectItemCaseSensitive(s3_file_partJSON, "part_number");
    if (cJSON_IsNull(part_number)) {
        part_number = NULL;
    }
    if (!part_number) {
        goto end;
    }

    
    if(!cJSON_IsNumber(part_number))
    {
    goto end; //Numeric
    }
    part_number_local_var = malloc(sizeof(int));
    if(!part_number_local_var)
    {
        goto end;
    }
    *part_number_local_var = part_number->valuedouble;

    // s3_file_part->presigned_url
    cJSON *presigned_url = cJSON_GetObjectItemCaseSensitive(s3_file_partJSON, "presigned_url");
    if (cJSON_IsNull(presigned_url)) {
        presigned_url = NULL;
    }
    if (!presigned_url) {
        goto end;
    }

    
    if(!cJSON_IsString(presigned_url))
    {
    goto end; //String
    }


    if (presigned_url && !cJSON_IsNull(presigned_url)) presigned_url_local_str = strdup(presigned_url->valuestring);

    s3_file_part_local_var = s3_file_part_create_internal (
        part_number_local_var,
        presigned_url_local_str
        );

    if (!s3_file_part_local_var) {
        goto end;
    }

    return s3_file_part_local_var;
end:
    if (part_number_local_var) {
        free(part_number_local_var);
        part_number_local_var = NULL;
    }
    if (presigned_url_local_str) {
        free(presigned_url_local_str);
        presigned_url_local_str = NULL;
    }
    return NULL;

}
