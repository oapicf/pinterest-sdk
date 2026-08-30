#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "quiz_pin_result.h"



static quiz_pin_result_t *quiz_pin_result_create_internal(
    char *android_deep_link,
    char *destination_url,
    char *ios_deep_link,
    char *organic_pin_id,
    double *result_id
    ) {
    quiz_pin_result_t *quiz_pin_result_local_var = malloc(sizeof(quiz_pin_result_t));
    if (!quiz_pin_result_local_var) {
        return NULL;
    }
    memset(quiz_pin_result_local_var, 0, sizeof(quiz_pin_result_t));
    quiz_pin_result_local_var->_library_owned = 1;
    quiz_pin_result_local_var->android_deep_link = android_deep_link;
    quiz_pin_result_local_var->destination_url = destination_url;
    quiz_pin_result_local_var->ios_deep_link = ios_deep_link;
    quiz_pin_result_local_var->organic_pin_id = organic_pin_id;
    quiz_pin_result_local_var->result_id = result_id;
    return quiz_pin_result_local_var;
}

__attribute__((deprecated)) quiz_pin_result_t *quiz_pin_result_create(
    char *android_deep_link,
    char *destination_url,
    char *ios_deep_link,
    char *organic_pin_id,
    double *result_id
    ) {
    double *result_id_copy = NULL;
    if (result_id) {
        result_id_copy = malloc(sizeof(double));
        if (result_id_copy) *result_id_copy = *result_id;
    }
    quiz_pin_result_t *result = quiz_pin_result_create_internal (
        android_deep_link,
        destination_url,
        ios_deep_link,
        organic_pin_id,
        result_id_copy
        );
    if (!result) {
        free(result_id_copy);
    }
    return result;
}

void quiz_pin_result_free(quiz_pin_result_t *quiz_pin_result) {
    if(NULL == quiz_pin_result){
        return ;
    }
    if(quiz_pin_result->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "quiz_pin_result_free");
        return ;
    }
    listEntry_t *listEntry;
    if (quiz_pin_result->android_deep_link) {
        free(quiz_pin_result->android_deep_link);
        quiz_pin_result->android_deep_link = NULL;
    }
    if (quiz_pin_result->destination_url) {
        free(quiz_pin_result->destination_url);
        quiz_pin_result->destination_url = NULL;
    }
    if (quiz_pin_result->ios_deep_link) {
        free(quiz_pin_result->ios_deep_link);
        quiz_pin_result->ios_deep_link = NULL;
    }
    if (quiz_pin_result->organic_pin_id) {
        free(quiz_pin_result->organic_pin_id);
        quiz_pin_result->organic_pin_id = NULL;
    }
    if (quiz_pin_result->result_id) {
        free(quiz_pin_result->result_id);
        quiz_pin_result->result_id = NULL;
    }
    free(quiz_pin_result);
}

cJSON *quiz_pin_result_convertToJSON(quiz_pin_result_t *quiz_pin_result) {
    cJSON *item = cJSON_CreateObject();

    // quiz_pin_result->android_deep_link
    if(quiz_pin_result->android_deep_link) {
    if(cJSON_AddStringToObject(item, "android_deep_link", quiz_pin_result->android_deep_link) == NULL) {
    goto fail; //String
    }
    }


    // quiz_pin_result->destination_url
    if(quiz_pin_result->destination_url) {
    if(cJSON_AddStringToObject(item, "destination_url", quiz_pin_result->destination_url) == NULL) {
    goto fail; //String
    }
    }


    // quiz_pin_result->ios_deep_link
    if(quiz_pin_result->ios_deep_link) {
    if(cJSON_AddStringToObject(item, "ios_deep_link", quiz_pin_result->ios_deep_link) == NULL) {
    goto fail; //String
    }
    }


    // quiz_pin_result->organic_pin_id
    if(quiz_pin_result->organic_pin_id) {
    if(cJSON_AddStringToObject(item, "organic_pin_id", quiz_pin_result->organic_pin_id) == NULL) {
    goto fail; //String
    }
    }


    // quiz_pin_result->result_id
    if(quiz_pin_result->result_id) {
    if(cJSON_AddNumberToObject(item, "result_id", *quiz_pin_result->result_id) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

quiz_pin_result_t *quiz_pin_result_parseFromJSON(cJSON *quiz_pin_resultJSON){

    quiz_pin_result_t *quiz_pin_result_local_var = NULL;

    char *android_deep_link_local_str = NULL;

    char *destination_url_local_str = NULL;

    char *ios_deep_link_local_str = NULL;

    char *organic_pin_id_local_str = NULL;

    // define the local variable for quiz_pin_result->result_id
    double *result_id_local_var = NULL;

    // quiz_pin_result->android_deep_link
    cJSON *android_deep_link = cJSON_GetObjectItemCaseSensitive(quiz_pin_resultJSON, "android_deep_link");
    if (cJSON_IsNull(android_deep_link)) {
        android_deep_link = NULL;
    }
    if (android_deep_link) { 
    if(!cJSON_IsString(android_deep_link) && !cJSON_IsNull(android_deep_link))
    {
    goto end; //String
    }
    }

    // quiz_pin_result->destination_url
    cJSON *destination_url = cJSON_GetObjectItemCaseSensitive(quiz_pin_resultJSON, "destination_url");
    if (cJSON_IsNull(destination_url)) {
        destination_url = NULL;
    }
    if (destination_url) { 
    if(!cJSON_IsString(destination_url) && !cJSON_IsNull(destination_url))
    {
    goto end; //String
    }
    }

    // quiz_pin_result->ios_deep_link
    cJSON *ios_deep_link = cJSON_GetObjectItemCaseSensitive(quiz_pin_resultJSON, "ios_deep_link");
    if (cJSON_IsNull(ios_deep_link)) {
        ios_deep_link = NULL;
    }
    if (ios_deep_link) { 
    if(!cJSON_IsString(ios_deep_link) && !cJSON_IsNull(ios_deep_link))
    {
    goto end; //String
    }
    }

    // quiz_pin_result->organic_pin_id
    cJSON *organic_pin_id = cJSON_GetObjectItemCaseSensitive(quiz_pin_resultJSON, "organic_pin_id");
    if (cJSON_IsNull(organic_pin_id)) {
        organic_pin_id = NULL;
    }
    if (organic_pin_id) { 
    if(!cJSON_IsString(organic_pin_id) && !cJSON_IsNull(organic_pin_id))
    {
    goto end; //String
    }
    }

    // quiz_pin_result->result_id
    cJSON *result_id = cJSON_GetObjectItemCaseSensitive(quiz_pin_resultJSON, "result_id");
    if (cJSON_IsNull(result_id)) {
        result_id = NULL;
    }
    if (result_id) { 
    if(!cJSON_IsNumber(result_id))
    {
    goto end; //Numeric
    }
    result_id_local_var = malloc(sizeof(double));
    if(!result_id_local_var)
    {
        goto end;
    }
    *result_id_local_var = result_id->valuedouble;
    }


    if (android_deep_link && !cJSON_IsNull(android_deep_link)) android_deep_link_local_str = strdup(android_deep_link->valuestring);
    if (destination_url && !cJSON_IsNull(destination_url)) destination_url_local_str = strdup(destination_url->valuestring);
    if (ios_deep_link && !cJSON_IsNull(ios_deep_link)) ios_deep_link_local_str = strdup(ios_deep_link->valuestring);
    if (organic_pin_id && !cJSON_IsNull(organic_pin_id)) organic_pin_id_local_str = strdup(organic_pin_id->valuestring);

    quiz_pin_result_local_var = quiz_pin_result_create_internal (
        android_deep_link_local_str,
        destination_url_local_str,
        ios_deep_link_local_str,
        organic_pin_id_local_str,
        result_id_local_var
        );

    if (!quiz_pin_result_local_var) {
        goto end;
    }

    return quiz_pin_result_local_var;
end:
    if (android_deep_link_local_str) {
        free(android_deep_link_local_str);
        android_deep_link_local_str = NULL;
    }
    if (destination_url_local_str) {
        free(destination_url_local_str);
        destination_url_local_str = NULL;
    }
    if (ios_deep_link_local_str) {
        free(ios_deep_link_local_str);
        ios_deep_link_local_str = NULL;
    }
    if (organic_pin_id_local_str) {
        free(organic_pin_id_local_str);
        organic_pin_id_local_str = NULL;
    }
    if (result_id_local_var) {
        free(result_id_local_var);
        result_id_local_var = NULL;
    }
    return NULL;

}
