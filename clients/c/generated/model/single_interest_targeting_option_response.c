#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "single_interest_targeting_option_response.h"



single_interest_targeting_option_response_t *single_interest_targeting_option_response_create(
    char *id,
    char *name,
    list_t *child_interests,
    int level
    ) {
    single_interest_targeting_option_response_t *single_interest_targeting_option_response_local_var = malloc(sizeof(single_interest_targeting_option_response_t));
    if (!single_interest_targeting_option_response_local_var) {
        return NULL;
    }
    single_interest_targeting_option_response_local_var->id = id;
    single_interest_targeting_option_response_local_var->name = name;
    single_interest_targeting_option_response_local_var->child_interests = child_interests;
    single_interest_targeting_option_response_local_var->level = level;

    return single_interest_targeting_option_response_local_var;
}


void single_interest_targeting_option_response_free(single_interest_targeting_option_response_t *single_interest_targeting_option_response) {
    if(NULL == single_interest_targeting_option_response){
        return ;
    }
    listEntry_t *listEntry;
    if (single_interest_targeting_option_response->id) {
        free(single_interest_targeting_option_response->id);
        single_interest_targeting_option_response->id = NULL;
    }
    if (single_interest_targeting_option_response->name) {
        free(single_interest_targeting_option_response->name);
        single_interest_targeting_option_response->name = NULL;
    }
    if (single_interest_targeting_option_response->child_interests) {
        list_ForEach(listEntry, single_interest_targeting_option_response->child_interests) {
            free(listEntry->data);
        }
        list_freeList(single_interest_targeting_option_response->child_interests);
        single_interest_targeting_option_response->child_interests = NULL;
    }
    free(single_interest_targeting_option_response);
}

cJSON *single_interest_targeting_option_response_convertToJSON(single_interest_targeting_option_response_t *single_interest_targeting_option_response) {
    cJSON *item = cJSON_CreateObject();

    // single_interest_targeting_option_response->id
    if(single_interest_targeting_option_response->id) {
    if(cJSON_AddStringToObject(item, "id", single_interest_targeting_option_response->id) == NULL) {
    goto fail; //String
    }
    }


    // single_interest_targeting_option_response->name
    if(single_interest_targeting_option_response->name) {
    if(cJSON_AddStringToObject(item, "name", single_interest_targeting_option_response->name) == NULL) {
    goto fail; //String
    }
    }


    // single_interest_targeting_option_response->child_interests
    if(single_interest_targeting_option_response->child_interests) {
    cJSON *child_interests = cJSON_AddArrayToObject(item, "child_interests");
    if(child_interests == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *child_interestsListEntry;
    list_ForEach(child_interestsListEntry, single_interest_targeting_option_response->child_interests) {
    if(cJSON_AddStringToObject(child_interests, "", (char*)child_interestsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // single_interest_targeting_option_response->level
    if(single_interest_targeting_option_response->level) {
    if(cJSON_AddNumberToObject(item, "level", single_interest_targeting_option_response->level) == NULL) {
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

single_interest_targeting_option_response_t *single_interest_targeting_option_response_parseFromJSON(cJSON *single_interest_targeting_option_responseJSON){

    single_interest_targeting_option_response_t *single_interest_targeting_option_response_local_var = NULL;

    // define the local list for single_interest_targeting_option_response->child_interests
    list_t *child_interestsList = NULL;

    // single_interest_targeting_option_response->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(single_interest_targeting_option_responseJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // single_interest_targeting_option_response->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(single_interest_targeting_option_responseJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // single_interest_targeting_option_response->child_interests
    cJSON *child_interests = cJSON_GetObjectItemCaseSensitive(single_interest_targeting_option_responseJSON, "child_interests");
    if (child_interests) { 
    cJSON *child_interests_local = NULL;
    if(!cJSON_IsArray(child_interests)) {
        goto end;//primitive container
    }
    child_interestsList = list_createList();

    cJSON_ArrayForEach(child_interests_local, child_interests)
    {
        if(!cJSON_IsString(child_interests_local))
        {
            goto end;
        }
        list_addElement(child_interestsList , strdup(child_interests_local->valuestring));
    }
    }

    // single_interest_targeting_option_response->level
    cJSON *level = cJSON_GetObjectItemCaseSensitive(single_interest_targeting_option_responseJSON, "level");
    if (level) { 
    if(!cJSON_IsNumber(level))
    {
    goto end; //Numeric
    }
    }


    single_interest_targeting_option_response_local_var = single_interest_targeting_option_response_create (
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        child_interests ? child_interestsList : NULL,
        level ? level->valuedouble : 0
        );

    return single_interest_targeting_option_response_local_var;
end:
    if (child_interestsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, child_interestsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(child_interestsList);
        child_interestsList = NULL;
    }
    return NULL;

}
