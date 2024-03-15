#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "delivery_metrics_response_items_inner.h"


char* delivery_metrics_response_items_inner_category_ToString(pinterest_rest_api_delivery_metrics_response_items_inner_CATEGORY_e category) {
    char* categoryArray[] =  { "NULL", "ADS", "ORGANIC" };
    return categoryArray[category];
}

pinterest_rest_api_delivery_metrics_response_items_inner_CATEGORY_e delivery_metrics_response_items_inner_category_FromString(char* category){
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

delivery_metrics_response_items_inner_t *delivery_metrics_response_items_inner_create(
    char *name,
    pinterest_rest_api_delivery_metrics_response_items_inner_CATEGORY_e category,
    char *definition,
    char *display_name
    ) {
    delivery_metrics_response_items_inner_t *delivery_metrics_response_items_inner_local_var = malloc(sizeof(delivery_metrics_response_items_inner_t));
    if (!delivery_metrics_response_items_inner_local_var) {
        return NULL;
    }
    delivery_metrics_response_items_inner_local_var->name = name;
    delivery_metrics_response_items_inner_local_var->category = category;
    delivery_metrics_response_items_inner_local_var->definition = definition;
    delivery_metrics_response_items_inner_local_var->display_name = display_name;

    return delivery_metrics_response_items_inner_local_var;
}


void delivery_metrics_response_items_inner_free(delivery_metrics_response_items_inner_t *delivery_metrics_response_items_inner) {
    if(NULL == delivery_metrics_response_items_inner){
        return ;
    }
    listEntry_t *listEntry;
    if (delivery_metrics_response_items_inner->name) {
        free(delivery_metrics_response_items_inner->name);
        delivery_metrics_response_items_inner->name = NULL;
    }
    if (delivery_metrics_response_items_inner->definition) {
        free(delivery_metrics_response_items_inner->definition);
        delivery_metrics_response_items_inner->definition = NULL;
    }
    if (delivery_metrics_response_items_inner->display_name) {
        free(delivery_metrics_response_items_inner->display_name);
        delivery_metrics_response_items_inner->display_name = NULL;
    }
    free(delivery_metrics_response_items_inner);
}

cJSON *delivery_metrics_response_items_inner_convertToJSON(delivery_metrics_response_items_inner_t *delivery_metrics_response_items_inner) {
    cJSON *item = cJSON_CreateObject();

    // delivery_metrics_response_items_inner->name
    if(delivery_metrics_response_items_inner->name) {
    if(cJSON_AddStringToObject(item, "name", delivery_metrics_response_items_inner->name) == NULL) {
    goto fail; //String
    }
    }


    // delivery_metrics_response_items_inner->category
    if(delivery_metrics_response_items_inner->category != pinterest_rest_api_delivery_metrics_response_items_inner_CATEGORY_NULL) {
    if(cJSON_AddStringToObject(item, "category", categorydelivery_metrics_response_items_inner_ToString(delivery_metrics_response_items_inner->category)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // delivery_metrics_response_items_inner->definition
    if(delivery_metrics_response_items_inner->definition) {
    if(cJSON_AddStringToObject(item, "definition", delivery_metrics_response_items_inner->definition) == NULL) {
    goto fail; //String
    }
    }


    // delivery_metrics_response_items_inner->display_name
    if(delivery_metrics_response_items_inner->display_name) {
    if(cJSON_AddStringToObject(item, "display_name", delivery_metrics_response_items_inner->display_name) == NULL) {
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

delivery_metrics_response_items_inner_t *delivery_metrics_response_items_inner_parseFromJSON(cJSON *delivery_metrics_response_items_innerJSON){

    delivery_metrics_response_items_inner_t *delivery_metrics_response_items_inner_local_var = NULL;

    // delivery_metrics_response_items_inner->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(delivery_metrics_response_items_innerJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // delivery_metrics_response_items_inner->category
    cJSON *category = cJSON_GetObjectItemCaseSensitive(delivery_metrics_response_items_innerJSON, "category");
    pinterest_rest_api_delivery_metrics_response_items_inner_CATEGORY_e categoryVariable;
    if (category) { 
    if(!cJSON_IsString(category))
    {
    goto end; //Enum
    }
    categoryVariable = delivery_metrics_response_items_inner_category_FromString(category->valuestring);
    }

    // delivery_metrics_response_items_inner->definition
    cJSON *definition = cJSON_GetObjectItemCaseSensitive(delivery_metrics_response_items_innerJSON, "definition");
    if (definition) { 
    if(!cJSON_IsString(definition) && !cJSON_IsNull(definition))
    {
    goto end; //String
    }
    }

    // delivery_metrics_response_items_inner->display_name
    cJSON *display_name = cJSON_GetObjectItemCaseSensitive(delivery_metrics_response_items_innerJSON, "display_name");
    if (display_name) { 
    if(!cJSON_IsString(display_name) && !cJSON_IsNull(display_name))
    {
    goto end; //String
    }
    }


    delivery_metrics_response_items_inner_local_var = delivery_metrics_response_items_inner_create (
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        category ? categoryVariable : pinterest_rest_api_delivery_metrics_response_items_inner_CATEGORY_NULL,
        definition && !cJSON_IsNull(definition) ? strdup(definition->valuestring) : NULL,
        display_name && !cJSON_IsNull(display_name) ? strdup(display_name->valuestring) : NULL
        );

    return delivery_metrics_response_items_inner_local_var;
end:
    return NULL;

}
