#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "quiz_pin_result.h"



quiz_pin_result_t *quiz_pin_result_create(
    char *organic_pin_id,
    char *android_deep_link,
    char *ios_deep_link,
    char *destination_url,
    double result_id
    ) {
    quiz_pin_result_t *quiz_pin_result_local_var = malloc(sizeof(quiz_pin_result_t));
    if (!quiz_pin_result_local_var) {
        return NULL;
    }
    quiz_pin_result_local_var->organic_pin_id = organic_pin_id;
    quiz_pin_result_local_var->android_deep_link = android_deep_link;
    quiz_pin_result_local_var->ios_deep_link = ios_deep_link;
    quiz_pin_result_local_var->destination_url = destination_url;
    quiz_pin_result_local_var->result_id = result_id;

    return quiz_pin_result_local_var;
}


void quiz_pin_result_free(quiz_pin_result_t *quiz_pin_result) {
    if(NULL == quiz_pin_result){
        return ;
    }
    listEntry_t *listEntry;
    if (quiz_pin_result->organic_pin_id) {
        free(quiz_pin_result->organic_pin_id);
        quiz_pin_result->organic_pin_id = NULL;
    }
    if (quiz_pin_result->android_deep_link) {
        free(quiz_pin_result->android_deep_link);
        quiz_pin_result->android_deep_link = NULL;
    }
    if (quiz_pin_result->ios_deep_link) {
        free(quiz_pin_result->ios_deep_link);
        quiz_pin_result->ios_deep_link = NULL;
    }
    if (quiz_pin_result->destination_url) {
        free(quiz_pin_result->destination_url);
        quiz_pin_result->destination_url = NULL;
    }
    free(quiz_pin_result);
}

cJSON *quiz_pin_result_convertToJSON(quiz_pin_result_t *quiz_pin_result) {
    cJSON *item = cJSON_CreateObject();

    // quiz_pin_result->organic_pin_id
    if(quiz_pin_result->organic_pin_id) {
    if(cJSON_AddStringToObject(item, "organic_pin_id", quiz_pin_result->organic_pin_id) == NULL) {
    goto fail; //String
    }
    }


    // quiz_pin_result->android_deep_link
    if(quiz_pin_result->android_deep_link) {
    if(cJSON_AddStringToObject(item, "android_deep_link", quiz_pin_result->android_deep_link) == NULL) {
    goto fail; //String
    }
    }


    // quiz_pin_result->ios_deep_link
    if(quiz_pin_result->ios_deep_link) {
    if(cJSON_AddStringToObject(item, "ios_deep_link", quiz_pin_result->ios_deep_link) == NULL) {
    goto fail; //String
    }
    }


    // quiz_pin_result->destination_url
    if(quiz_pin_result->destination_url) {
    if(cJSON_AddStringToObject(item, "destination_url", quiz_pin_result->destination_url) == NULL) {
    goto fail; //String
    }
    }


    // quiz_pin_result->result_id
    if(quiz_pin_result->result_id) {
    if(cJSON_AddNumberToObject(item, "result_id", quiz_pin_result->result_id) == NULL) {
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

    // quiz_pin_result->organic_pin_id
    cJSON *organic_pin_id = cJSON_GetObjectItemCaseSensitive(quiz_pin_resultJSON, "organic_pin_id");
    if (organic_pin_id) { 
    if(!cJSON_IsString(organic_pin_id) && !cJSON_IsNull(organic_pin_id))
    {
    goto end; //String
    }
    }

    // quiz_pin_result->android_deep_link
    cJSON *android_deep_link = cJSON_GetObjectItemCaseSensitive(quiz_pin_resultJSON, "android_deep_link");
    if (android_deep_link) { 
    if(!cJSON_IsString(android_deep_link) && !cJSON_IsNull(android_deep_link))
    {
    goto end; //String
    }
    }

    // quiz_pin_result->ios_deep_link
    cJSON *ios_deep_link = cJSON_GetObjectItemCaseSensitive(quiz_pin_resultJSON, "ios_deep_link");
    if (ios_deep_link) { 
    if(!cJSON_IsString(ios_deep_link) && !cJSON_IsNull(ios_deep_link))
    {
    goto end; //String
    }
    }

    // quiz_pin_result->destination_url
    cJSON *destination_url = cJSON_GetObjectItemCaseSensitive(quiz_pin_resultJSON, "destination_url");
    if (destination_url) { 
    if(!cJSON_IsString(destination_url) && !cJSON_IsNull(destination_url))
    {
    goto end; //String
    }
    }

    // quiz_pin_result->result_id
    cJSON *result_id = cJSON_GetObjectItemCaseSensitive(quiz_pin_resultJSON, "result_id");
    if (result_id) { 
    if(!cJSON_IsNumber(result_id))
    {
    goto end; //Numeric
    }
    }


    quiz_pin_result_local_var = quiz_pin_result_create (
        organic_pin_id && !cJSON_IsNull(organic_pin_id) ? strdup(organic_pin_id->valuestring) : NULL,
        android_deep_link && !cJSON_IsNull(android_deep_link) ? strdup(android_deep_link->valuestring) : NULL,
        ios_deep_link && !cJSON_IsNull(ios_deep_link) ? strdup(ios_deep_link->valuestring) : NULL,
        destination_url && !cJSON_IsNull(destination_url) ? strdup(destination_url->valuestring) : NULL,
        result_id ? result_id->valuedouble : 0
        );

    return quiz_pin_result_local_var;
end:
    return NULL;

}
