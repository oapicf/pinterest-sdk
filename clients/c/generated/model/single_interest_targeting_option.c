#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "single_interest_targeting_option.h"



static single_interest_targeting_option_t *single_interest_targeting_option_create_internal(
    list_t *child_interests,
    char *id,
    int *level,
    char *name
    ) {
    single_interest_targeting_option_t *single_interest_targeting_option_local_var = malloc(sizeof(single_interest_targeting_option_t));
    if (!single_interest_targeting_option_local_var) {
        return NULL;
    }
    memset(single_interest_targeting_option_local_var, 0, sizeof(single_interest_targeting_option_t));
    single_interest_targeting_option_local_var->_library_owned = 1;
    single_interest_targeting_option_local_var->child_interests = child_interests;
    single_interest_targeting_option_local_var->id = id;
    single_interest_targeting_option_local_var->level = level;
    single_interest_targeting_option_local_var->name = name;
    return single_interest_targeting_option_local_var;
}

__attribute__((deprecated)) single_interest_targeting_option_t *single_interest_targeting_option_create(
    list_t *child_interests,
    char *id,
    int *level,
    char *name
    ) {
    int *level_copy = NULL;
    if (level) {
        level_copy = malloc(sizeof(int));
        if (level_copy) *level_copy = *level;
    }
    single_interest_targeting_option_t *result = single_interest_targeting_option_create_internal (
        child_interests,
        id,
        level_copy,
        name
        );
    if (!result) {
        free(level_copy);
    }
    return result;
}

void single_interest_targeting_option_free(single_interest_targeting_option_t *single_interest_targeting_option) {
    if(NULL == single_interest_targeting_option){
        return ;
    }
    if(single_interest_targeting_option->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "single_interest_targeting_option_free");
        return ;
    }
    listEntry_t *listEntry;
    if (single_interest_targeting_option->child_interests) {
        list_ForEach(listEntry, single_interest_targeting_option->child_interests) {
            free(listEntry->data);
        }
        list_freeList(single_interest_targeting_option->child_interests);
        single_interest_targeting_option->child_interests = NULL;
    }
    if (single_interest_targeting_option->id) {
        free(single_interest_targeting_option->id);
        single_interest_targeting_option->id = NULL;
    }
    if (single_interest_targeting_option->level) {
        free(single_interest_targeting_option->level);
        single_interest_targeting_option->level = NULL;
    }
    if (single_interest_targeting_option->name) {
        free(single_interest_targeting_option->name);
        single_interest_targeting_option->name = NULL;
    }
    free(single_interest_targeting_option);
}

cJSON *single_interest_targeting_option_convertToJSON(single_interest_targeting_option_t *single_interest_targeting_option) {
    cJSON *item = cJSON_CreateObject();

    // single_interest_targeting_option->child_interests
    if (!single_interest_targeting_option->child_interests) {
        goto fail;
    }
    cJSON *child_interests = cJSON_AddArrayToObject(item, "child_interests");
    if(child_interests == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *child_interestsListEntry;
    list_ForEach(child_interestsListEntry, single_interest_targeting_option->child_interests) {
    if(cJSON_AddStringToObject(child_interests, "", child_interestsListEntry->data) == NULL)
    {
        goto fail;
    }
    }


    // single_interest_targeting_option->id
    if (!single_interest_targeting_option->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", single_interest_targeting_option->id) == NULL) {
    goto fail; //String
    }


    // single_interest_targeting_option->level
    if (!single_interest_targeting_option->level) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "level", *single_interest_targeting_option->level) == NULL) {
    goto fail; //Numeric
    }


    // single_interest_targeting_option->name
    if (!single_interest_targeting_option->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", single_interest_targeting_option->name) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

single_interest_targeting_option_t *single_interest_targeting_option_parseFromJSON(cJSON *single_interest_targeting_optionJSON){

    single_interest_targeting_option_t *single_interest_targeting_option_local_var = NULL;

    // define the local list for single_interest_targeting_option->child_interests
    list_t *child_interestsList = NULL;

    char *id_local_str = NULL;

    // define the local variable for single_interest_targeting_option->level
    int *level_local_var = NULL;

    char *name_local_str = NULL;

    // single_interest_targeting_option->child_interests
    cJSON *child_interests = cJSON_GetObjectItemCaseSensitive(single_interest_targeting_optionJSON, "child_interests");
    if (cJSON_IsNull(child_interests)) {
        child_interests = NULL;
    }
    if (!child_interests) {
        goto end;
    }

    
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

    // single_interest_targeting_option->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(single_interest_targeting_optionJSON, "id");
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

    // single_interest_targeting_option->level
    cJSON *level = cJSON_GetObjectItemCaseSensitive(single_interest_targeting_optionJSON, "level");
    if (cJSON_IsNull(level)) {
        level = NULL;
    }
    if (!level) {
        goto end;
    }

    
    if(!cJSON_IsNumber(level))
    {
    goto end; //Numeric
    }
    level_local_var = malloc(sizeof(int));
    if(!level_local_var)
    {
        goto end;
    }
    *level_local_var = level->valuedouble;

    // single_interest_targeting_option->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(single_interest_targeting_optionJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }


    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    single_interest_targeting_option_local_var = single_interest_targeting_option_create_internal (
        child_interestsList,
        id_local_str,
        level_local_var,
        name_local_str
        );

    if (!single_interest_targeting_option_local_var) {
        goto end;
    }

    return single_interest_targeting_option_local_var;
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
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (level_local_var) {
        free(level_local_var);
        level_local_var = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    return NULL;

}
