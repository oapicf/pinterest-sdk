#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "user_website_verification_code.h"



user_website_verification_code_t *user_website_verification_code_create(
    char *verification_code,
    char *dns_txt_record,
    char *metatag,
    char *filename,
    char *file_content
    ) {
    user_website_verification_code_t *user_website_verification_code_local_var = malloc(sizeof(user_website_verification_code_t));
    if (!user_website_verification_code_local_var) {
        return NULL;
    }
    user_website_verification_code_local_var->verification_code = verification_code;
    user_website_verification_code_local_var->dns_txt_record = dns_txt_record;
    user_website_verification_code_local_var->metatag = metatag;
    user_website_verification_code_local_var->filename = filename;
    user_website_verification_code_local_var->file_content = file_content;

    return user_website_verification_code_local_var;
}


void user_website_verification_code_free(user_website_verification_code_t *user_website_verification_code) {
    if(NULL == user_website_verification_code){
        return ;
    }
    listEntry_t *listEntry;
    if (user_website_verification_code->verification_code) {
        free(user_website_verification_code->verification_code);
        user_website_verification_code->verification_code = NULL;
    }
    if (user_website_verification_code->dns_txt_record) {
        free(user_website_verification_code->dns_txt_record);
        user_website_verification_code->dns_txt_record = NULL;
    }
    if (user_website_verification_code->metatag) {
        free(user_website_verification_code->metatag);
        user_website_verification_code->metatag = NULL;
    }
    if (user_website_verification_code->filename) {
        free(user_website_verification_code->filename);
        user_website_verification_code->filename = NULL;
    }
    if (user_website_verification_code->file_content) {
        free(user_website_verification_code->file_content);
        user_website_verification_code->file_content = NULL;
    }
    free(user_website_verification_code);
}

cJSON *user_website_verification_code_convertToJSON(user_website_verification_code_t *user_website_verification_code) {
    cJSON *item = cJSON_CreateObject();

    // user_website_verification_code->verification_code
    if(user_website_verification_code->verification_code) {
    if(cJSON_AddStringToObject(item, "verification_code", user_website_verification_code->verification_code) == NULL) {
    goto fail; //String
    }
    }


    // user_website_verification_code->dns_txt_record
    if(user_website_verification_code->dns_txt_record) {
    if(cJSON_AddStringToObject(item, "dns_txt_record", user_website_verification_code->dns_txt_record) == NULL) {
    goto fail; //String
    }
    }


    // user_website_verification_code->metatag
    if(user_website_verification_code->metatag) {
    if(cJSON_AddStringToObject(item, "metatag", user_website_verification_code->metatag) == NULL) {
    goto fail; //String
    }
    }


    // user_website_verification_code->filename
    if(user_website_verification_code->filename) {
    if(cJSON_AddStringToObject(item, "filename", user_website_verification_code->filename) == NULL) {
    goto fail; //String
    }
    }


    // user_website_verification_code->file_content
    if(user_website_verification_code->file_content) {
    if(cJSON_AddStringToObject(item, "file_content", user_website_verification_code->file_content) == NULL) {
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

user_website_verification_code_t *user_website_verification_code_parseFromJSON(cJSON *user_website_verification_codeJSON){

    user_website_verification_code_t *user_website_verification_code_local_var = NULL;

    // user_website_verification_code->verification_code
    cJSON *verification_code = cJSON_GetObjectItemCaseSensitive(user_website_verification_codeJSON, "verification_code");
    if (verification_code) { 
    if(!cJSON_IsString(verification_code) && !cJSON_IsNull(verification_code))
    {
    goto end; //String
    }
    }

    // user_website_verification_code->dns_txt_record
    cJSON *dns_txt_record = cJSON_GetObjectItemCaseSensitive(user_website_verification_codeJSON, "dns_txt_record");
    if (dns_txt_record) { 
    if(!cJSON_IsString(dns_txt_record) && !cJSON_IsNull(dns_txt_record))
    {
    goto end; //String
    }
    }

    // user_website_verification_code->metatag
    cJSON *metatag = cJSON_GetObjectItemCaseSensitive(user_website_verification_codeJSON, "metatag");
    if (metatag) { 
    if(!cJSON_IsString(metatag) && !cJSON_IsNull(metatag))
    {
    goto end; //String
    }
    }

    // user_website_verification_code->filename
    cJSON *filename = cJSON_GetObjectItemCaseSensitive(user_website_verification_codeJSON, "filename");
    if (filename) { 
    if(!cJSON_IsString(filename) && !cJSON_IsNull(filename))
    {
    goto end; //String
    }
    }

    // user_website_verification_code->file_content
    cJSON *file_content = cJSON_GetObjectItemCaseSensitive(user_website_verification_codeJSON, "file_content");
    if (file_content) { 
    if(!cJSON_IsString(file_content) && !cJSON_IsNull(file_content))
    {
    goto end; //String
    }
    }


    user_website_verification_code_local_var = user_website_verification_code_create (
        verification_code && !cJSON_IsNull(verification_code) ? strdup(verification_code->valuestring) : NULL,
        dns_txt_record && !cJSON_IsNull(dns_txt_record) ? strdup(dns_txt_record->valuestring) : NULL,
        metatag && !cJSON_IsNull(metatag) ? strdup(metatag->valuestring) : NULL,
        filename && !cJSON_IsNull(filename) ? strdup(filename->valuestring) : NULL,
        file_content && !cJSON_IsNull(file_content) ? strdup(file_content->valuestring) : NULL
        );

    return user_website_verification_code_local_var;
end:
    return NULL;

}
