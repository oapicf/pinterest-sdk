#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "targeting_template_keyword.h"



static targeting_template_keyword_t *targeting_template_keyword_create_internal(
    pinterest_rest_api_match_type__e match_type,
    char *value
    ) {
    targeting_template_keyword_t *targeting_template_keyword_local_var = malloc(sizeof(targeting_template_keyword_t));
    if (!targeting_template_keyword_local_var) {
        return NULL;
    }
    targeting_template_keyword_local_var->match_type = match_type;
    targeting_template_keyword_local_var->value = value;

    targeting_template_keyword_local_var->_library_owned = 1;
    return targeting_template_keyword_local_var;
}

__attribute__((deprecated)) targeting_template_keyword_t *targeting_template_keyword_create(
    pinterest_rest_api_match_type__e match_type,
    char *value
    ) {
    return targeting_template_keyword_create_internal (
        match_type,
        value
        );
}

void targeting_template_keyword_free(targeting_template_keyword_t *targeting_template_keyword) {
    if(NULL == targeting_template_keyword){
        return ;
    }
    if(targeting_template_keyword->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "targeting_template_keyword_free");
        return ;
    }
    listEntry_t *listEntry;
    if (targeting_template_keyword->value) {
        free(targeting_template_keyword->value);
        targeting_template_keyword->value = NULL;
    }
    free(targeting_template_keyword);
}

cJSON *targeting_template_keyword_convertToJSON(targeting_template_keyword_t *targeting_template_keyword) {
    cJSON *item = cJSON_CreateObject();

    // targeting_template_keyword->match_type
    if(targeting_template_keyword->match_type != pinterest_rest_api_match_type__NULL) {
    cJSON *match_type_local_JSON = match_type_convertToJSON(targeting_template_keyword->match_type);
    if(match_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "match_type", match_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // targeting_template_keyword->value
    if(targeting_template_keyword->value) {
    if(cJSON_AddStringToObject(item, "value", targeting_template_keyword->value) == NULL) {
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

targeting_template_keyword_t *targeting_template_keyword_parseFromJSON(cJSON *targeting_template_keywordJSON){

    targeting_template_keyword_t *targeting_template_keyword_local_var = NULL;

    // define the local variable for targeting_template_keyword->match_type
    pinterest_rest_api_match_type__e match_type_local_nonprim = 0;

    // targeting_template_keyword->match_type
    cJSON *match_type = cJSON_GetObjectItemCaseSensitive(targeting_template_keywordJSON, "match_type");
    if (cJSON_IsNull(match_type)) {
        match_type = NULL;
    }
    if (match_type) { 
    match_type_local_nonprim = match_type_parseFromJSON(match_type); //custom
    }

    // targeting_template_keyword->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(targeting_template_keywordJSON, "value");
    if (cJSON_IsNull(value)) {
        value = NULL;
    }
    if (value) { 
    if(!cJSON_IsString(value) && !cJSON_IsNull(value))
    {
    goto end; //String
    }
    }


    targeting_template_keyword_local_var = targeting_template_keyword_create_internal (
        match_type ? match_type_local_nonprim : 0,
        value && !cJSON_IsNull(value) ? strdup(value->valuestring) : NULL
        );

    return targeting_template_keyword_local_var;
end:
    if (match_type_local_nonprim) {
        match_type_local_nonprim = 0;
    }
    return NULL;

}
