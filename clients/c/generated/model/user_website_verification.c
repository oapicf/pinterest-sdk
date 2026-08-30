#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "user_website_verification.h"



static user_website_verification_t *user_website_verification_create_internal(
    char *dns_txt_record,
    char *file_content,
    char *filename,
    char *metatag,
    char *verification_code
    ) {
    user_website_verification_t *user_website_verification_local_var = malloc(sizeof(user_website_verification_t));
    if (!user_website_verification_local_var) {
        return NULL;
    }
    memset(user_website_verification_local_var, 0, sizeof(user_website_verification_t));
    user_website_verification_local_var->_library_owned = 1;
    user_website_verification_local_var->dns_txt_record = dns_txt_record;
    user_website_verification_local_var->file_content = file_content;
    user_website_verification_local_var->filename = filename;
    user_website_verification_local_var->metatag = metatag;
    user_website_verification_local_var->verification_code = verification_code;
    return user_website_verification_local_var;
}

__attribute__((deprecated)) user_website_verification_t *user_website_verification_create(
    char *dns_txt_record,
    char *file_content,
    char *filename,
    char *metatag,
    char *verification_code
    ) {
    user_website_verification_t *result = user_website_verification_create_internal (
        dns_txt_record,
        file_content,
        filename,
        metatag,
        verification_code
        );
    if (!result) {
    }
    return result;
}

void user_website_verification_free(user_website_verification_t *user_website_verification) {
    if(NULL == user_website_verification){
        return ;
    }
    if(user_website_verification->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "user_website_verification_free");
        return ;
    }
    listEntry_t *listEntry;
    if (user_website_verification->dns_txt_record) {
        free(user_website_verification->dns_txt_record);
        user_website_verification->dns_txt_record = NULL;
    }
    if (user_website_verification->file_content) {
        free(user_website_verification->file_content);
        user_website_verification->file_content = NULL;
    }
    if (user_website_verification->filename) {
        free(user_website_verification->filename);
        user_website_verification->filename = NULL;
    }
    if (user_website_verification->metatag) {
        free(user_website_verification->metatag);
        user_website_verification->metatag = NULL;
    }
    if (user_website_verification->verification_code) {
        free(user_website_verification->verification_code);
        user_website_verification->verification_code = NULL;
    }
    free(user_website_verification);
}

cJSON *user_website_verification_convertToJSON(user_website_verification_t *user_website_verification) {
    cJSON *item = cJSON_CreateObject();

    // user_website_verification->dns_txt_record
    if(user_website_verification->dns_txt_record) {
    if(cJSON_AddStringToObject(item, "dns_txt_record", user_website_verification->dns_txt_record) == NULL) {
    goto fail; //String
    }
    }


    // user_website_verification->file_content
    if(user_website_verification->file_content) {
    if(cJSON_AddStringToObject(item, "file_content", user_website_verification->file_content) == NULL) {
    goto fail; //String
    }
    }


    // user_website_verification->filename
    if(user_website_verification->filename) {
    if(cJSON_AddStringToObject(item, "filename", user_website_verification->filename) == NULL) {
    goto fail; //String
    }
    }


    // user_website_verification->metatag
    if(user_website_verification->metatag) {
    if(cJSON_AddStringToObject(item, "metatag", user_website_verification->metatag) == NULL) {
    goto fail; //String
    }
    }


    // user_website_verification->verification_code
    if(user_website_verification->verification_code) {
    if(cJSON_AddStringToObject(item, "verification_code", user_website_verification->verification_code) == NULL) {
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

user_website_verification_t *user_website_verification_parseFromJSON(cJSON *user_website_verificationJSON){

    user_website_verification_t *user_website_verification_local_var = NULL;

    char *dns_txt_record_local_str = NULL;

    char *file_content_local_str = NULL;

    char *filename_local_str = NULL;

    char *metatag_local_str = NULL;

    char *verification_code_local_str = NULL;

    // user_website_verification->dns_txt_record
    cJSON *dns_txt_record = cJSON_GetObjectItemCaseSensitive(user_website_verificationJSON, "dns_txt_record");
    if (cJSON_IsNull(dns_txt_record)) {
        dns_txt_record = NULL;
    }
    if (dns_txt_record) { 
    if(!cJSON_IsString(dns_txt_record) && !cJSON_IsNull(dns_txt_record))
    {
    goto end; //String
    }
    }

    // user_website_verification->file_content
    cJSON *file_content = cJSON_GetObjectItemCaseSensitive(user_website_verificationJSON, "file_content");
    if (cJSON_IsNull(file_content)) {
        file_content = NULL;
    }
    if (file_content) { 
    if(!cJSON_IsString(file_content) && !cJSON_IsNull(file_content))
    {
    goto end; //String
    }
    }

    // user_website_verification->filename
    cJSON *filename = cJSON_GetObjectItemCaseSensitive(user_website_verificationJSON, "filename");
    if (cJSON_IsNull(filename)) {
        filename = NULL;
    }
    if (filename) { 
    if(!cJSON_IsString(filename) && !cJSON_IsNull(filename))
    {
    goto end; //String
    }
    }

    // user_website_verification->metatag
    cJSON *metatag = cJSON_GetObjectItemCaseSensitive(user_website_verificationJSON, "metatag");
    if (cJSON_IsNull(metatag)) {
        metatag = NULL;
    }
    if (metatag) { 
    if(!cJSON_IsString(metatag) && !cJSON_IsNull(metatag))
    {
    goto end; //String
    }
    }

    // user_website_verification->verification_code
    cJSON *verification_code = cJSON_GetObjectItemCaseSensitive(user_website_verificationJSON, "verification_code");
    if (cJSON_IsNull(verification_code)) {
        verification_code = NULL;
    }
    if (verification_code) { 
    if(!cJSON_IsString(verification_code) && !cJSON_IsNull(verification_code))
    {
    goto end; //String
    }
    }


    if (dns_txt_record && !cJSON_IsNull(dns_txt_record)) dns_txt_record_local_str = strdup(dns_txt_record->valuestring);
    if (file_content && !cJSON_IsNull(file_content)) file_content_local_str = strdup(file_content->valuestring);
    if (filename && !cJSON_IsNull(filename)) filename_local_str = strdup(filename->valuestring);
    if (metatag && !cJSON_IsNull(metatag)) metatag_local_str = strdup(metatag->valuestring);
    if (verification_code && !cJSON_IsNull(verification_code)) verification_code_local_str = strdup(verification_code->valuestring);

    user_website_verification_local_var = user_website_verification_create_internal (
        dns_txt_record_local_str,
        file_content_local_str,
        filename_local_str,
        metatag_local_str,
        verification_code_local_str
        );

    if (!user_website_verification_local_var) {
        goto end;
    }

    return user_website_verification_local_var;
end:
    if (dns_txt_record_local_str) {
        free(dns_txt_record_local_str);
        dns_txt_record_local_str = NULL;
    }
    if (file_content_local_str) {
        free(file_content_local_str);
        file_content_local_str = NULL;
    }
    if (filename_local_str) {
        free(filename_local_str);
        filename_local_str = NULL;
    }
    if (metatag_local_str) {
        free(metatag_local_str);
        metatag_local_str = NULL;
    }
    if (verification_code_local_str) {
        free(verification_code_local_str);
        verification_code_local_str = NULL;
    }
    return NULL;

}
