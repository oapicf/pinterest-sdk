#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "query_label_types_items.h"


char* query_label_types_items_query_label_types_items_ToString(pinterest_rest_api_query_label_types_items__e query_label_types_items) {
    char *query_label_types_itemsArray[] =  { "NULL", "BRAND", "CUSTOM" };
    return query_label_types_itemsArray[query_label_types_items];
}

pinterest_rest_api_query_label_types_items__e query_label_types_items_query_label_types_items_FromString(char* query_label_types_items) {
    int stringToReturn = 0;
    char *query_label_types_itemsArray[] =  { "NULL", "BRAND", "CUSTOM" };
    size_t sizeofArray = sizeof(query_label_types_itemsArray) / sizeof(query_label_types_itemsArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(query_label_types_items, query_label_types_itemsArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *query_label_types_items_convertToJSON(pinterest_rest_api_query_label_types_items__e query_label_types_items) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "query_label_types_items", query_label_types_items_query_label_types_items_ToString(query_label_types_items)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_query_label_types_items__e query_label_types_items_parseFromJSON(cJSON *query_label_types_itemsJSON) {
    if(!cJSON_IsString(query_label_types_itemsJSON) || (query_label_types_itemsJSON->valuestring == NULL)) {
        return 0;
    }
    return query_label_types_items_query_label_types_items_FromString(query_label_types_itemsJSON->valuestring);
}
