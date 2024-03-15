#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audience_insights_response.h"


char* audience_insights_response_type_ToString(pinterest_rest_api_audience_insights_response__e type) {
    char* typeArray[] =  { "NULL", "YOUR_TOTAL_AUDIENCE", "YOUR_ENGAGED_AUDIENCE", "PINTEREST_TOTAL_AUDIENCE" };
    return typeArray[type];
}

pinterest_rest_api_audience_insights_response__e audience_insights_response_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "YOUR_TOTAL_AUDIENCE", "YOUR_ENGAGED_AUDIENCE", "PINTEREST_TOTAL_AUDIENCE" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

audience_insights_response_t *audience_insights_response_create(
    list_t *categories,
    audience_demographics_t *demographics,
    audience_insight_type_t *type,
    char *date,
    int size,
    int size_is_upper_bound
    ) {
    audience_insights_response_t *audience_insights_response_local_var = malloc(sizeof(audience_insights_response_t));
    if (!audience_insights_response_local_var) {
        return NULL;
    }
    audience_insights_response_local_var->categories = categories;
    audience_insights_response_local_var->demographics = demographics;
    audience_insights_response_local_var->type = type;
    audience_insights_response_local_var->date = date;
    audience_insights_response_local_var->size = size;
    audience_insights_response_local_var->size_is_upper_bound = size_is_upper_bound;

    return audience_insights_response_local_var;
}


void audience_insights_response_free(audience_insights_response_t *audience_insights_response) {
    if(NULL == audience_insights_response){
        return ;
    }
    listEntry_t *listEntry;
    if (audience_insights_response->categories) {
        list_ForEach(listEntry, audience_insights_response->categories) {
            audience_category_free(listEntry->data);
        }
        list_freeList(audience_insights_response->categories);
        audience_insights_response->categories = NULL;
    }
    if (audience_insights_response->demographics) {
        audience_demographics_free(audience_insights_response->demographics);
        audience_insights_response->demographics = NULL;
    }
    if (audience_insights_response->type) {
        audience_insight_type_free(audience_insights_response->type);
        audience_insights_response->type = NULL;
    }
    if (audience_insights_response->date) {
        free(audience_insights_response->date);
        audience_insights_response->date = NULL;
    }
    free(audience_insights_response);
}

cJSON *audience_insights_response_convertToJSON(audience_insights_response_t *audience_insights_response) {
    cJSON *item = cJSON_CreateObject();

    // audience_insights_response->categories
    if(audience_insights_response->categories) {
    cJSON *categories = cJSON_AddArrayToObject(item, "categories");
    if(categories == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *categoriesListEntry;
    if (audience_insights_response->categories) {
    list_ForEach(categoriesListEntry, audience_insights_response->categories) {
    cJSON *itemLocal = audience_category_convertToJSON(categoriesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(categories, itemLocal);
    }
    }
    }


    // audience_insights_response->demographics
    if(audience_insights_response->demographics) {
    cJSON *demographics_local_JSON = audience_demographics_convertToJSON(audience_insights_response->demographics);
    if(demographics_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "demographics", demographics_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // audience_insights_response->type
    if(audience_insights_response->type != pinterest_rest_api_audience_insights_response__NULL) {
    cJSON *type_local_JSON = audience_insight_type_convertToJSON(audience_insights_response->type);
    if(type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "type", type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // audience_insights_response->date
    if(audience_insights_response->date) {
    if(cJSON_AddStringToObject(item, "date", audience_insights_response->date) == NULL) {
    goto fail; //String
    }
    }


    // audience_insights_response->size
    if(audience_insights_response->size) {
    if(cJSON_AddNumberToObject(item, "size", audience_insights_response->size) == NULL) {
    goto fail; //Numeric
    }
    }


    // audience_insights_response->size_is_upper_bound
    if(audience_insights_response->size_is_upper_bound) {
    if(cJSON_AddBoolToObject(item, "size_is_upper_bound", audience_insights_response->size_is_upper_bound) == NULL) {
    goto fail; //Bool
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

audience_insights_response_t *audience_insights_response_parseFromJSON(cJSON *audience_insights_responseJSON){

    audience_insights_response_t *audience_insights_response_local_var = NULL;

    // define the local list for audience_insights_response->categories
    list_t *categoriesList = NULL;

    // define the local variable for audience_insights_response->demographics
    audience_demographics_t *demographics_local_nonprim = NULL;

    // define the local variable for audience_insights_response->type
    audience_insight_type_t *type_local_nonprim = NULL;

    // audience_insights_response->categories
    cJSON *categories = cJSON_GetObjectItemCaseSensitive(audience_insights_responseJSON, "categories");
    if (categories) { 
    cJSON *categories_local_nonprimitive = NULL;
    if(!cJSON_IsArray(categories)){
        goto end; //nonprimitive container
    }

    categoriesList = list_createList();

    cJSON_ArrayForEach(categories_local_nonprimitive,categories )
    {
        if(!cJSON_IsObject(categories_local_nonprimitive)){
            goto end;
        }
        audience_category_t *categoriesItem = audience_category_parseFromJSON(categories_local_nonprimitive);

        list_addElement(categoriesList, categoriesItem);
    }
    }

    // audience_insights_response->demographics
    cJSON *demographics = cJSON_GetObjectItemCaseSensitive(audience_insights_responseJSON, "demographics");
    if (demographics) { 
    demographics_local_nonprim = audience_demographics_parseFromJSON(demographics); //nonprimitive
    }

    // audience_insights_response->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(audience_insights_responseJSON, "type");
    if (type) { 
    type_local_nonprim = audience_insight_type_parseFromJSON(type); //custom
    }

    // audience_insights_response->date
    cJSON *date = cJSON_GetObjectItemCaseSensitive(audience_insights_responseJSON, "date");
    if (date) { 
    if(!cJSON_IsString(date) && !cJSON_IsNull(date))
    {
    goto end; //String
    }
    }

    // audience_insights_response->size
    cJSON *size = cJSON_GetObjectItemCaseSensitive(audience_insights_responseJSON, "size");
    if (size) { 
    if(!cJSON_IsNumber(size))
    {
    goto end; //Numeric
    }
    }

    // audience_insights_response->size_is_upper_bound
    cJSON *size_is_upper_bound = cJSON_GetObjectItemCaseSensitive(audience_insights_responseJSON, "size_is_upper_bound");
    if (size_is_upper_bound) { 
    if(!cJSON_IsBool(size_is_upper_bound))
    {
    goto end; //Bool
    }
    }


    audience_insights_response_local_var = audience_insights_response_create (
        categories ? categoriesList : NULL,
        demographics ? demographics_local_nonprim : NULL,
        type ? type_local_nonprim : NULL,
        date && !cJSON_IsNull(date) ? strdup(date->valuestring) : NULL,
        size ? size->valuedouble : 0,
        size_is_upper_bound ? size_is_upper_bound->valueint : 0
        );

    return audience_insights_response_local_var;
end:
    if (categoriesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, categoriesList) {
            audience_category_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(categoriesList);
        categoriesList = NULL;
    }
    if (demographics_local_nonprim) {
        audience_demographics_free(demographics_local_nonprim);
        demographics_local_nonprim = NULL;
    }
    if (type_local_nonprim) {
        audience_insight_type_free(type_local_nonprim);
        type_local_nonprim = NULL;
    }
    return NULL;

}
