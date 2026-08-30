#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "trending_topic.h"



static trending_topic_t *trending_topic_create_internal(
    char *description,
    char *id,
    int *percent_growth_mom,
    list_t *pins,
    list_t *related_interests,
    list_t *related_searches,
    list_t* time_series,
    char *title
    ) {
    trending_topic_t *trending_topic_local_var = malloc(sizeof(trending_topic_t));
    if (!trending_topic_local_var) {
        return NULL;
    }
    memset(trending_topic_local_var, 0, sizeof(trending_topic_t));
    trending_topic_local_var->_library_owned = 1;
    trending_topic_local_var->description = description;
    trending_topic_local_var->id = id;
    trending_topic_local_var->percent_growth_mom = percent_growth_mom;
    trending_topic_local_var->pins = pins;
    trending_topic_local_var->related_interests = related_interests;
    trending_topic_local_var->related_searches = related_searches;
    trending_topic_local_var->time_series = time_series;
    trending_topic_local_var->title = title;
    return trending_topic_local_var;
}

__attribute__((deprecated)) trending_topic_t *trending_topic_create(
    char *description,
    char *id,
    int *percent_growth_mom,
    list_t *pins,
    list_t *related_interests,
    list_t *related_searches,
    list_t* time_series,
    char *title
    ) {
    int *percent_growth_mom_copy = NULL;
    if (percent_growth_mom) {
        percent_growth_mom_copy = malloc(sizeof(int));
        if (percent_growth_mom_copy) *percent_growth_mom_copy = *percent_growth_mom;
    }
    trending_topic_t *result = trending_topic_create_internal (
        description,
        id,
        percent_growth_mom_copy,
        pins,
        related_interests,
        related_searches,
        time_series,
        title
        );
    if (!result) {
        free(percent_growth_mom_copy);
    }
    return result;
}

void trending_topic_free(trending_topic_t *trending_topic) {
    if(NULL == trending_topic){
        return ;
    }
    if(trending_topic->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "trending_topic_free");
        return ;
    }
    listEntry_t *listEntry;
    if (trending_topic->description) {
        free(trending_topic->description);
        trending_topic->description = NULL;
    }
    if (trending_topic->id) {
        free(trending_topic->id);
        trending_topic->id = NULL;
    }
    if (trending_topic->percent_growth_mom) {
        free(trending_topic->percent_growth_mom);
        trending_topic->percent_growth_mom = NULL;
    }
    if (trending_topic->pins) {
        list_ForEach(listEntry, trending_topic->pins) {
            trending_pin_free(listEntry->data);
        }
        list_freeList(trending_topic->pins);
        trending_topic->pins = NULL;
    }
    if (trending_topic->related_interests) {
        list_ForEach(listEntry, trending_topic->related_interests) {
            free(listEntry->data);
        }
        list_freeList(trending_topic->related_interests);
        trending_topic->related_interests = NULL;
    }
    if (trending_topic->related_searches) {
        list_ForEach(listEntry, trending_topic->related_searches) {
            free(listEntry->data);
        }
        list_freeList(trending_topic->related_searches);
        trending_topic->related_searches = NULL;
    }
    if (trending_topic->time_series) {
        list_ForEach(listEntry, trending_topic->time_series) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(trending_topic->time_series);
        trending_topic->time_series = NULL;
    }
    if (trending_topic->title) {
        free(trending_topic->title);
        trending_topic->title = NULL;
    }
    free(trending_topic);
}

cJSON *trending_topic_convertToJSON(trending_topic_t *trending_topic) {
    cJSON *item = cJSON_CreateObject();

    // trending_topic->description
    if (!trending_topic->description) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "description", trending_topic->description) == NULL) {
    goto fail; //String
    }


    // trending_topic->id
    if (!trending_topic->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", trending_topic->id) == NULL) {
    goto fail; //String
    }


    // trending_topic->percent_growth_mom
    if(trending_topic->percent_growth_mom) {
    if(cJSON_AddNumberToObject(item, "percent_growth_mom", *trending_topic->percent_growth_mom) == NULL) {
    goto fail; //Numeric
    }
    }


    // trending_topic->pins
    if (!trending_topic->pins) {
        goto fail;
    }
    cJSON *pins = cJSON_AddArrayToObject(item, "pins");
    if(pins == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *pinsListEntry;
    if (trending_topic->pins) {
    list_ForEach(pinsListEntry, trending_topic->pins) {
    cJSON *itemLocal = trending_pin_convertToJSON(pinsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(pins, itemLocal);
    }
    }


    // trending_topic->related_interests
    if (!trending_topic->related_interests) {
        goto fail;
    }
    cJSON *related_interests = cJSON_AddArrayToObject(item, "related_interests");
    if(related_interests == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *related_interestsListEntry;
    list_ForEach(related_interestsListEntry, trending_topic->related_interests) {
    if(cJSON_AddStringToObject(related_interests, "", related_interestsListEntry->data) == NULL)
    {
        goto fail;
    }
    }


    // trending_topic->related_searches
    if (!trending_topic->related_searches) {
        goto fail;
    }
    cJSON *related_searches = cJSON_AddArrayToObject(item, "related_searches");
    if(related_searches == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *related_searchesListEntry;
    list_ForEach(related_searchesListEntry, trending_topic->related_searches) {
    if(cJSON_AddStringToObject(related_searches, "", related_searchesListEntry->data) == NULL)
    {
        goto fail;
    }
    }


    // trending_topic->time_series
    if (!trending_topic->time_series) {
        goto fail;
    }
    cJSON *time_series = cJSON_AddObjectToObject(item, "time_series");
    if(time_series == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = time_series;
    listEntry_t *time_seriesListEntry;
    if (trending_topic->time_series) {
    list_ForEach(time_seriesListEntry, trending_topic->time_series) {
        keyValuePair_t *localKeyValue = time_seriesListEntry->data;
        if(cJSON_AddNumberToObject(localMapObject, localKeyValue->key, *(double *)localKeyValue->value) == NULL)
        {
            goto fail;
        }
    }
    }


    // trending_topic->title
    if (!trending_topic->title) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "title", trending_topic->title) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

trending_topic_t *trending_topic_parseFromJSON(cJSON *trending_topicJSON){

    trending_topic_t *trending_topic_local_var = NULL;

    char *description_local_str = NULL;

    char *id_local_str = NULL;

    // define the local variable for trending_topic->percent_growth_mom
    int *percent_growth_mom_local_var = NULL;

    // define the local list for trending_topic->pins
    list_t *pinsList = NULL;

    // define the local list for trending_topic->related_interests
    list_t *related_interestsList = NULL;

    // define the local list for trending_topic->related_searches
    list_t *related_searchesList = NULL;

    // define the local map for trending_topic->time_series
    list_t *time_seriesList = NULL;

    char *title_local_str = NULL;

    // trending_topic->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(trending_topicJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (!description) {
        goto end;
    }

    
    if(!cJSON_IsString(description))
    {
    goto end; //String
    }

    // trending_topic->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(trending_topicJSON, "id");
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

    // trending_topic->percent_growth_mom
    cJSON *percent_growth_mom = cJSON_GetObjectItemCaseSensitive(trending_topicJSON, "percent_growth_mom");
    if (cJSON_IsNull(percent_growth_mom)) {
        percent_growth_mom = NULL;
    }
    if (percent_growth_mom) { 
    if(!cJSON_IsNumber(percent_growth_mom))
    {
    goto end; //Numeric
    }
    percent_growth_mom_local_var = malloc(sizeof(int));
    if(!percent_growth_mom_local_var)
    {
        goto end;
    }
    *percent_growth_mom_local_var = percent_growth_mom->valuedouble;
    }

    // trending_topic->pins
    cJSON *pins = cJSON_GetObjectItemCaseSensitive(trending_topicJSON, "pins");
    if (cJSON_IsNull(pins)) {
        pins = NULL;
    }
    if (!pins) {
        goto end;
    }

    
    cJSON *pins_local_nonprimitive = NULL;
    if(!cJSON_IsArray(pins)){
        goto end; //nonprimitive container
    }

    pinsList = list_createList();

    cJSON_ArrayForEach(pins_local_nonprimitive,pins )
    {
        if(!cJSON_IsObject(pins_local_nonprimitive)){
            goto end;
        }
        trending_pin_t *pinsItem = trending_pin_parseFromJSON(pins_local_nonprimitive);

        list_addElement(pinsList, pinsItem);
    }

    // trending_topic->related_interests
    cJSON *related_interests = cJSON_GetObjectItemCaseSensitive(trending_topicJSON, "related_interests");
    if (cJSON_IsNull(related_interests)) {
        related_interests = NULL;
    }
    if (!related_interests) {
        goto end;
    }

    
    cJSON *related_interests_local = NULL;
    if(!cJSON_IsArray(related_interests)) {
        goto end;//primitive container
    }
    related_interestsList = list_createList();

    cJSON_ArrayForEach(related_interests_local, related_interests)
    {
        if(!cJSON_IsString(related_interests_local))
        {
            goto end;
        }
        list_addElement(related_interestsList , strdup(related_interests_local->valuestring));
    }

    // trending_topic->related_searches
    cJSON *related_searches = cJSON_GetObjectItemCaseSensitive(trending_topicJSON, "related_searches");
    if (cJSON_IsNull(related_searches)) {
        related_searches = NULL;
    }
    if (!related_searches) {
        goto end;
    }

    
    cJSON *related_searches_local = NULL;
    if(!cJSON_IsArray(related_searches)) {
        goto end;//primitive container
    }
    related_searchesList = list_createList();

    cJSON_ArrayForEach(related_searches_local, related_searches)
    {
        if(!cJSON_IsString(related_searches_local))
        {
            goto end;
        }
        list_addElement(related_searchesList , strdup(related_searches_local->valuestring));
    }

    // trending_topic->time_series
    cJSON *time_series = cJSON_GetObjectItemCaseSensitive(trending_topicJSON, "time_series");
    if (cJSON_IsNull(time_series)) {
        time_series = NULL;
    }
    if (!time_series) {
        goto end;
    }

    
    cJSON *time_series_local_map = NULL;
    if(!cJSON_IsObject(time_series) && !cJSON_IsNull(time_series))
    {
        goto end;//primitive map container
    }
    if(cJSON_IsObject(time_series))
    {
        time_seriesList = list_createList();
        keyValuePair_t *localMapKeyPair;
        cJSON_ArrayForEach(time_series_local_map, time_series)
        {
            cJSON *localMapObject = time_series_local_map;
            if(!cJSON_IsNumber(localMapObject))
            {
                goto end;
            }
            localMapKeyPair = keyValuePair_create(strdup(localMapObject->string),&localMapObject->valuedouble );
            list_addElement(time_seriesList , localMapKeyPair);
        }
    }

    // trending_topic->title
    cJSON *title = cJSON_GetObjectItemCaseSensitive(trending_topicJSON, "title");
    if (cJSON_IsNull(title)) {
        title = NULL;
    }
    if (!title) {
        goto end;
    }

    
    if(!cJSON_IsString(title))
    {
    goto end; //String
    }


    if (description && !cJSON_IsNull(description)) description_local_str = strdup(description->valuestring);
    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (title && !cJSON_IsNull(title)) title_local_str = strdup(title->valuestring);

    trending_topic_local_var = trending_topic_create_internal (
        description_local_str,
        id_local_str,
        percent_growth_mom_local_var,
        pinsList,
        related_interestsList,
        related_searchesList,
        time_seriesList,
        title_local_str
        );

    if (!trending_topic_local_var) {
        goto end;
    }

    return trending_topic_local_var;
end:
    if (description_local_str) {
        free(description_local_str);
        description_local_str = NULL;
    }
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (percent_growth_mom_local_var) {
        free(percent_growth_mom_local_var);
        percent_growth_mom_local_var = NULL;
    }
    if (pinsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, pinsList) {
            trending_pin_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(pinsList);
        pinsList = NULL;
    }
    if (related_interestsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, related_interestsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(related_interestsList);
        related_interestsList = NULL;
    }
    if (related_searchesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, related_searchesList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(related_searchesList);
        related_searchesList = NULL;
    }
    if (time_seriesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, time_seriesList) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free(localKeyValue->key);
            localKeyValue->key = NULL;
            keyValuePair_free(localKeyValue);
            localKeyValue = NULL;
        }
        list_freeList(time_seriesList);
        time_seriesList = NULL;
    }
    if (title_local_str) {
        free(title_local_str);
        title_local_str = NULL;
    }
    return NULL;

}
