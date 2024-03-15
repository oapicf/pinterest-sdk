#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "keyword_update.h"



keyword_update_t *keyword_update_create(
    char *id,
    int archived,
    int bid
    ) {
    keyword_update_t *keyword_update_local_var = malloc(sizeof(keyword_update_t));
    if (!keyword_update_local_var) {
        return NULL;
    }
    keyword_update_local_var->id = id;
    keyword_update_local_var->archived = archived;
    keyword_update_local_var->bid = bid;

    return keyword_update_local_var;
}


void keyword_update_free(keyword_update_t *keyword_update) {
    if(NULL == keyword_update){
        return ;
    }
    listEntry_t *listEntry;
    if (keyword_update->id) {
        free(keyword_update->id);
        keyword_update->id = NULL;
    }
    free(keyword_update);
}

cJSON *keyword_update_convertToJSON(keyword_update_t *keyword_update) {
    cJSON *item = cJSON_CreateObject();

    // keyword_update->id
    if (!keyword_update->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", keyword_update->id) == NULL) {
    goto fail; //String
    }


    // keyword_update->archived
    if(keyword_update->archived) {
    if(cJSON_AddBoolToObject(item, "archived", keyword_update->archived) == NULL) {
    goto fail; //Bool
    }
    }


    // keyword_update->bid
    if(keyword_update->bid) {
    if(cJSON_AddNumberToObject(item, "bid", keyword_update->bid) == NULL) {
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

keyword_update_t *keyword_update_parseFromJSON(cJSON *keyword_updateJSON){

    keyword_update_t *keyword_update_local_var = NULL;

    // keyword_update->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(keyword_updateJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // keyword_update->archived
    cJSON *archived = cJSON_GetObjectItemCaseSensitive(keyword_updateJSON, "archived");
    if (archived) { 
    if(!cJSON_IsBool(archived))
    {
    goto end; //Bool
    }
    }

    // keyword_update->bid
    cJSON *bid = cJSON_GetObjectItemCaseSensitive(keyword_updateJSON, "bid");
    if (bid) { 
    if(!cJSON_IsNumber(bid))
    {
    goto end; //Numeric
    }
    }


    keyword_update_local_var = keyword_update_create (
        strdup(id->valuestring),
        archived ? archived->valueint : 0,
        bid ? bid->valuedouble : 0
        );

    return keyword_update_local_var;
end:
    return NULL;

}
