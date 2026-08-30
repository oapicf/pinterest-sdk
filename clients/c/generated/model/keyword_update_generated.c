#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "keyword_update_generated.h"



static keyword_update_generated_t *keyword_update_generated_create_internal(
    int *archived,
    int *bid,
    char *id
    ) {
    keyword_update_generated_t *keyword_update_generated_local_var = malloc(sizeof(keyword_update_generated_t));
    if (!keyword_update_generated_local_var) {
        return NULL;
    }
    memset(keyword_update_generated_local_var, 0, sizeof(keyword_update_generated_t));
    keyword_update_generated_local_var->_library_owned = 1;
    keyword_update_generated_local_var->archived = archived;
    keyword_update_generated_local_var->bid = bid;
    keyword_update_generated_local_var->id = id;
    return keyword_update_generated_local_var;
}

__attribute__((deprecated)) keyword_update_generated_t *keyword_update_generated_create(
    int *archived,
    int *bid,
    char *id
    ) {
    int *archived_copy = NULL;
    if (archived) {
        archived_copy = malloc(sizeof(int));
        if (archived_copy) *archived_copy = *archived;
    }
    int *bid_copy = NULL;
    if (bid) {
        bid_copy = malloc(sizeof(int));
        if (bid_copy) *bid_copy = *bid;
    }
    keyword_update_generated_t *result = keyword_update_generated_create_internal (
        archived_copy,
        bid_copy,
        id
        );
    if (!result) {
        free(archived_copy);
        free(bid_copy);
    }
    return result;
}

void keyword_update_generated_free(keyword_update_generated_t *keyword_update_generated) {
    if(NULL == keyword_update_generated){
        return ;
    }
    if(keyword_update_generated->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "keyword_update_generated_free");
        return ;
    }
    listEntry_t *listEntry;
    if (keyword_update_generated->archived) {
        free(keyword_update_generated->archived);
        keyword_update_generated->archived = NULL;
    }
    if (keyword_update_generated->bid) {
        free(keyword_update_generated->bid);
        keyword_update_generated->bid = NULL;
    }
    if (keyword_update_generated->id) {
        free(keyword_update_generated->id);
        keyword_update_generated->id = NULL;
    }
    free(keyword_update_generated);
}

cJSON *keyword_update_generated_convertToJSON(keyword_update_generated_t *keyword_update_generated) {
    cJSON *item = cJSON_CreateObject();

    // keyword_update_generated->archived
    if(keyword_update_generated->archived) {
    if(cJSON_AddBoolToObject(item, "archived", *keyword_update_generated->archived) == NULL) {
    goto fail; //Bool
    }
    }


    // keyword_update_generated->bid
    if(keyword_update_generated->bid) {
    if(cJSON_AddNumberToObject(item, "bid", *keyword_update_generated->bid) == NULL) {
    goto fail; //Numeric
    }
    }


    // keyword_update_generated->id
    if (!keyword_update_generated->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", keyword_update_generated->id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

keyword_update_generated_t *keyword_update_generated_parseFromJSON(cJSON *keyword_update_generatedJSON){

    keyword_update_generated_t *keyword_update_generated_local_var = NULL;

    // define the local variable for keyword_update_generated->archived
    int *archived_local_var = NULL;

    // define the local variable for keyword_update_generated->bid
    int *bid_local_var = NULL;

    char *id_local_str = NULL;

    // keyword_update_generated->archived
    cJSON *archived = cJSON_GetObjectItemCaseSensitive(keyword_update_generatedJSON, "archived");
    if (cJSON_IsNull(archived)) {
        archived = NULL;
    }
    if (archived) { 
    if(!cJSON_IsBool(archived))
    {
    goto end; //Bool
    }
    archived_local_var = malloc(sizeof(int));
    if(!archived_local_var)
    {
        goto end;
    }
    *archived_local_var = archived->valueint;
    }

    // keyword_update_generated->bid
    cJSON *bid = cJSON_GetObjectItemCaseSensitive(keyword_update_generatedJSON, "bid");
    if (cJSON_IsNull(bid)) {
        bid = NULL;
    }
    if (bid) { 
    if(!cJSON_IsNumber(bid))
    {
    goto end; //Numeric
    }
    bid_local_var = malloc(sizeof(int));
    if(!bid_local_var)
    {
        goto end;
    }
    *bid_local_var = bid->valuedouble;
    }

    // keyword_update_generated->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(keyword_update_generatedJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }


    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);

    keyword_update_generated_local_var = keyword_update_generated_create_internal (
        archived_local_var,
        bid_local_var,
        id_local_str
        );

    if (!keyword_update_generated_local_var) {
        goto end;
    }

    return keyword_update_generated_local_var;
end:
    if (archived_local_var) {
        free(archived_local_var);
        archived_local_var = NULL;
    }
    if (bid_local_var) {
        free(bid_local_var);
        bid_local_var = NULL;
    }
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    return NULL;

}
