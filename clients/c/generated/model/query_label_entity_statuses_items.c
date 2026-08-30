#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "query_label_entity_statuses_items.h"


char* query_label_entity_statuses_items_query_label_entity_statuses_items_ToString(pinterest_rest_api_query_label_entity_statuses_items__e query_label_entity_statuses_items) {
    char *query_label_entity_statuses_itemsArray[] =  { "NULL", "ACTIVE", "ARCHIVED" };
    return query_label_entity_statuses_itemsArray[query_label_entity_statuses_items];
}

pinterest_rest_api_query_label_entity_statuses_items__e query_label_entity_statuses_items_query_label_entity_statuses_items_FromString(char* query_label_entity_statuses_items) {
    int stringToReturn = 0;
    char *query_label_entity_statuses_itemsArray[] =  { "NULL", "ACTIVE", "ARCHIVED" };
    size_t sizeofArray = sizeof(query_label_entity_statuses_itemsArray) / sizeof(query_label_entity_statuses_itemsArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(query_label_entity_statuses_items, query_label_entity_statuses_itemsArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *query_label_entity_statuses_items_convertToJSON(pinterest_rest_api_query_label_entity_statuses_items__e query_label_entity_statuses_items) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "query_label_entity_statuses_items", query_label_entity_statuses_items_query_label_entity_statuses_items_ToString(query_label_entity_statuses_items)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_query_label_entity_statuses_items__e query_label_entity_statuses_items_parseFromJSON(cJSON *query_label_entity_statuses_itemsJSON) {
    if(!cJSON_IsString(query_label_entity_statuses_itemsJSON) || (query_label_entity_statuses_itemsJSON->valuestring == NULL)) {
        return 0;
    }
    return query_label_entity_statuses_items_query_label_entity_statuses_items_FromString(query_label_entity_statuses_itemsJSON->valuestring);
}
