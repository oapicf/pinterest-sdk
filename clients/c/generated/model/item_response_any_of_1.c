#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "item_response_any_of_1.h"


char* item_response_any_of_1_catalog_type_ToString(pinterest_rest_api_item_response_any_of_1__e catalog_type) {
    char* catalog_typeArray[] =  { "NULL", "RETAIL", "HOTEL", "CREATIVE_ASSETS" };
    return catalog_typeArray[catalog_type];
}

pinterest_rest_api_item_response_any_of_1__e item_response_any_of_1_catalog_type_FromString(char* catalog_type){
    int stringToReturn = 0;
    char *catalog_typeArray[] =  { "NULL", "RETAIL", "HOTEL", "CREATIVE_ASSETS" };
    size_t sizeofArray = sizeof(catalog_typeArray) / sizeof(catalog_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(catalog_type, catalog_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

item_response_any_of_1_t *item_response_any_of_1_create(
    catalogs_type_t *catalog_type,
    char *item_id,
    list_t *errors,
    char *hotel_id,
    char *creative_assets_id
    ) {
    item_response_any_of_1_t *item_response_any_of_1_local_var = malloc(sizeof(item_response_any_of_1_t));
    if (!item_response_any_of_1_local_var) {
        return NULL;
    }
    item_response_any_of_1_local_var->catalog_type = catalog_type;
    item_response_any_of_1_local_var->item_id = item_id;
    item_response_any_of_1_local_var->errors = errors;
    item_response_any_of_1_local_var->hotel_id = hotel_id;
    item_response_any_of_1_local_var->creative_assets_id = creative_assets_id;

    return item_response_any_of_1_local_var;
}


void item_response_any_of_1_free(item_response_any_of_1_t *item_response_any_of_1) {
    if(NULL == item_response_any_of_1){
        return ;
    }
    listEntry_t *listEntry;
    if (item_response_any_of_1->catalog_type) {
        catalogs_type_free(item_response_any_of_1->catalog_type);
        item_response_any_of_1->catalog_type = NULL;
    }
    if (item_response_any_of_1->item_id) {
        free(item_response_any_of_1->item_id);
        item_response_any_of_1->item_id = NULL;
    }
    if (item_response_any_of_1->errors) {
        list_ForEach(listEntry, item_response_any_of_1->errors) {
            item_validation_event_free(listEntry->data);
        }
        list_freeList(item_response_any_of_1->errors);
        item_response_any_of_1->errors = NULL;
    }
    if (item_response_any_of_1->hotel_id) {
        free(item_response_any_of_1->hotel_id);
        item_response_any_of_1->hotel_id = NULL;
    }
    if (item_response_any_of_1->creative_assets_id) {
        free(item_response_any_of_1->creative_assets_id);
        item_response_any_of_1->creative_assets_id = NULL;
    }
    free(item_response_any_of_1);
}

cJSON *item_response_any_of_1_convertToJSON(item_response_any_of_1_t *item_response_any_of_1) {
    cJSON *item = cJSON_CreateObject();

    // item_response_any_of_1->catalog_type
    if (pinterest_rest_api_item_response_any_of_1__NULL == item_response_any_of_1->catalog_type) {
        goto fail;
    }
    cJSON *catalog_type_local_JSON = catalogs_type_convertToJSON(item_response_any_of_1->catalog_type);
    if(catalog_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "catalog_type", catalog_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // item_response_any_of_1->item_id
    if(item_response_any_of_1->item_id) {
    if(cJSON_AddStringToObject(item, "item_id", item_response_any_of_1->item_id) == NULL) {
    goto fail; //String
    }
    }


    // item_response_any_of_1->errors
    if(item_response_any_of_1->errors) {
    cJSON *errors = cJSON_AddArrayToObject(item, "errors");
    if(errors == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *errorsListEntry;
    if (item_response_any_of_1->errors) {
    list_ForEach(errorsListEntry, item_response_any_of_1->errors) {
    cJSON *itemLocal = item_validation_event_convertToJSON(errorsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(errors, itemLocal);
    }
    }
    }


    // item_response_any_of_1->hotel_id
    if(item_response_any_of_1->hotel_id) {
    if(cJSON_AddStringToObject(item, "hotel_id", item_response_any_of_1->hotel_id) == NULL) {
    goto fail; //String
    }
    }


    // item_response_any_of_1->creative_assets_id
    if(item_response_any_of_1->creative_assets_id) {
    if(cJSON_AddStringToObject(item, "creative_assets_id", item_response_any_of_1->creative_assets_id) == NULL) {
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

item_response_any_of_1_t *item_response_any_of_1_parseFromJSON(cJSON *item_response_any_of_1JSON){

    item_response_any_of_1_t *item_response_any_of_1_local_var = NULL;

    // define the local variable for item_response_any_of_1->catalog_type
    catalogs_type_t *catalog_type_local_nonprim = NULL;

    // define the local list for item_response_any_of_1->errors
    list_t *errorsList = NULL;

    // item_response_any_of_1->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(item_response_any_of_1JSON, "catalog_type");
    if (!catalog_type) {
        goto end;
    }

    
    catalog_type_local_nonprim = catalogs_type_parseFromJSON(catalog_type); //custom

    // item_response_any_of_1->item_id
    cJSON *item_id = cJSON_GetObjectItemCaseSensitive(item_response_any_of_1JSON, "item_id");
    if (item_id) { 
    if(!cJSON_IsString(item_id) && !cJSON_IsNull(item_id))
    {
    goto end; //String
    }
    }

    // item_response_any_of_1->errors
    cJSON *errors = cJSON_GetObjectItemCaseSensitive(item_response_any_of_1JSON, "errors");
    if (errors) { 
    cJSON *errors_local_nonprimitive = NULL;
    if(!cJSON_IsArray(errors)){
        goto end; //nonprimitive container
    }

    errorsList = list_createList();

    cJSON_ArrayForEach(errors_local_nonprimitive,errors )
    {
        if(!cJSON_IsObject(errors_local_nonprimitive)){
            goto end;
        }
        item_validation_event_t *errorsItem = item_validation_event_parseFromJSON(errors_local_nonprimitive);

        list_addElement(errorsList, errorsItem);
    }
    }

    // item_response_any_of_1->hotel_id
    cJSON *hotel_id = cJSON_GetObjectItemCaseSensitive(item_response_any_of_1JSON, "hotel_id");
    if (hotel_id) { 
    if(!cJSON_IsString(hotel_id) && !cJSON_IsNull(hotel_id))
    {
    goto end; //String
    }
    }

    // item_response_any_of_1->creative_assets_id
    cJSON *creative_assets_id = cJSON_GetObjectItemCaseSensitive(item_response_any_of_1JSON, "creative_assets_id");
    if (creative_assets_id) { 
    if(!cJSON_IsString(creative_assets_id) && !cJSON_IsNull(creative_assets_id))
    {
    goto end; //String
    }
    }


    item_response_any_of_1_local_var = item_response_any_of_1_create (
        catalog_type_local_nonprim,
        item_id && !cJSON_IsNull(item_id) ? strdup(item_id->valuestring) : NULL,
        errors ? errorsList : NULL,
        hotel_id && !cJSON_IsNull(hotel_id) ? strdup(hotel_id->valuestring) : NULL,
        creative_assets_id && !cJSON_IsNull(creative_assets_id) ? strdup(creative_assets_id->valuestring) : NULL
        );

    return item_response_any_of_1_local_var;
end:
    if (catalog_type_local_nonprim) {
        catalogs_type_free(catalog_type_local_nonprim);
        catalog_type_local_nonprim = NULL;
    }
    if (errorsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, errorsList) {
            item_validation_event_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(errorsList);
        errorsList = NULL;
    }
    return NULL;

}
