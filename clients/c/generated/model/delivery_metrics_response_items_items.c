#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "delivery_metrics_response_items_items.h"


char* delivery_metrics_response_items_items_category_ToString(pinterest_rest_api_delivery_metrics_response_items_items_CATEGORY_e category) {
    char* categoryArray[] =  { "NULL", "ADS", "ORGANIC" };
    return categoryArray[category];
}

pinterest_rest_api_delivery_metrics_response_items_items_CATEGORY_e delivery_metrics_response_items_items_category_FromString(char* category){
    int stringToReturn = 0;
    char *categoryArray[] =  { "NULL", "ADS", "ORGANIC" };
    size_t sizeofArray = sizeof(categoryArray) / sizeof(categoryArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(category, categoryArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static delivery_metrics_response_items_items_t *delivery_metrics_response_items_items_create_internal(
    pinterest_rest_api_delivery_metrics_response_items_items_CATEGORY_e category,
    char *definition,
    char *display_name,
    char *name
    ) {
    delivery_metrics_response_items_items_t *delivery_metrics_response_items_items_local_var = malloc(sizeof(delivery_metrics_response_items_items_t));
    if (!delivery_metrics_response_items_items_local_var) {
        return NULL;
    }
    memset(delivery_metrics_response_items_items_local_var, 0, sizeof(delivery_metrics_response_items_items_t));
    delivery_metrics_response_items_items_local_var->_library_owned = 1;
    delivery_metrics_response_items_items_local_var->category = category;
    delivery_metrics_response_items_items_local_var->definition = definition;
    delivery_metrics_response_items_items_local_var->display_name = display_name;
    delivery_metrics_response_items_items_local_var->name = name;
    return delivery_metrics_response_items_items_local_var;
}

__attribute__((deprecated)) delivery_metrics_response_items_items_t *delivery_metrics_response_items_items_create(
    pinterest_rest_api_delivery_metrics_response_items_items_CATEGORY_e category,
    char *definition,
    char *display_name,
    char *name
    ) {
    delivery_metrics_response_items_items_t *result = delivery_metrics_response_items_items_create_internal (
        category,
        definition,
        display_name,
        name
        );
    if (!result) {
    }
    return result;
}

void delivery_metrics_response_items_items_free(delivery_metrics_response_items_items_t *delivery_metrics_response_items_items) {
    if(NULL == delivery_metrics_response_items_items){
        return ;
    }
    if(delivery_metrics_response_items_items->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "delivery_metrics_response_items_items_free");
        return ;
    }
    listEntry_t *listEntry;
    if (delivery_metrics_response_items_items->definition) {
        free(delivery_metrics_response_items_items->definition);
        delivery_metrics_response_items_items->definition = NULL;
    }
    if (delivery_metrics_response_items_items->display_name) {
        free(delivery_metrics_response_items_items->display_name);
        delivery_metrics_response_items_items->display_name = NULL;
    }
    if (delivery_metrics_response_items_items->name) {
        free(delivery_metrics_response_items_items->name);
        delivery_metrics_response_items_items->name = NULL;
    }
    free(delivery_metrics_response_items_items);
}

cJSON *delivery_metrics_response_items_items_convertToJSON(delivery_metrics_response_items_items_t *delivery_metrics_response_items_items) {
    cJSON *item = cJSON_CreateObject();

    // delivery_metrics_response_items_items->category
    if(delivery_metrics_response_items_items->category != pinterest_rest_api_delivery_metrics_response_items_items_CATEGORY_NULL) {
    if(cJSON_AddStringToObject(item, "category", delivery_metrics_response_items_items_category_ToString(delivery_metrics_response_items_items->category)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // delivery_metrics_response_items_items->definition
    if(delivery_metrics_response_items_items->definition) {
    if(cJSON_AddStringToObject(item, "definition", delivery_metrics_response_items_items->definition) == NULL) {
    goto fail; //String
    }
    }


    // delivery_metrics_response_items_items->display_name
    if(delivery_metrics_response_items_items->display_name) {
    if(cJSON_AddStringToObject(item, "display_name", delivery_metrics_response_items_items->display_name) == NULL) {
    goto fail; //String
    }
    }


    // delivery_metrics_response_items_items->name
    if(delivery_metrics_response_items_items->name) {
    if(cJSON_AddStringToObject(item, "name", delivery_metrics_response_items_items->name) == NULL) {
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

delivery_metrics_response_items_items_t *delivery_metrics_response_items_items_parseFromJSON(cJSON *delivery_metrics_response_items_itemsJSON){

    delivery_metrics_response_items_items_t *delivery_metrics_response_items_items_local_var = NULL;

    char *definition_local_str = NULL;

    char *display_name_local_str = NULL;

    char *name_local_str = NULL;

    // delivery_metrics_response_items_items->category
    cJSON *category = cJSON_GetObjectItemCaseSensitive(delivery_metrics_response_items_itemsJSON, "category");
    if (cJSON_IsNull(category)) {
        category = NULL;
    }
    pinterest_rest_api_delivery_metrics_response_items_items_CATEGORY_e categoryVariable;
    if (category) { 
    if(!cJSON_IsString(category))
    {
    goto end; //Enum
    }
    categoryVariable = delivery_metrics_response_items_items_category_FromString(category->valuestring);
    }

    // delivery_metrics_response_items_items->definition
    cJSON *definition = cJSON_GetObjectItemCaseSensitive(delivery_metrics_response_items_itemsJSON, "definition");
    if (cJSON_IsNull(definition)) {
        definition = NULL;
    }
    if (definition) { 
    if(!cJSON_IsString(definition) && !cJSON_IsNull(definition))
    {
    goto end; //String
    }
    }

    // delivery_metrics_response_items_items->display_name
    cJSON *display_name = cJSON_GetObjectItemCaseSensitive(delivery_metrics_response_items_itemsJSON, "display_name");
    if (cJSON_IsNull(display_name)) {
        display_name = NULL;
    }
    if (display_name) { 
    if(!cJSON_IsString(display_name) && !cJSON_IsNull(display_name))
    {
    goto end; //String
    }
    }

    // delivery_metrics_response_items_items->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(delivery_metrics_response_items_itemsJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }


    if (definition && !cJSON_IsNull(definition)) definition_local_str = strdup(definition->valuestring);
    if (display_name && !cJSON_IsNull(display_name)) display_name_local_str = strdup(display_name->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    delivery_metrics_response_items_items_local_var = delivery_metrics_response_items_items_create_internal (
        category ? categoryVariable : pinterest_rest_api_delivery_metrics_response_items_items_CATEGORY_NULL,
        definition_local_str,
        display_name_local_str,
        name_local_str
        );

    if (!delivery_metrics_response_items_items_local_var) {
        goto end;
    }

    return delivery_metrics_response_items_items_local_var;
end:
    if (definition_local_str) {
        free(definition_local_str);
        definition_local_str = NULL;
    }
    if (display_name_local_str) {
        free(display_name_local_str);
        display_name_local_str = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    return NULL;

}
