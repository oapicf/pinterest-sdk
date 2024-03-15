#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "item_response.h"


char* item_response_catalog_type_ToString(pinterest_rest_api_item_response__e catalog_type) {
    char* catalog_typeArray[] =  { "NULL", "RETAIL", "HOTEL" };
    return catalog_typeArray[catalog_type];
}

pinterest_rest_api_item_response__e item_response_catalog_type_FromString(char* catalog_type){
    int stringToReturn = 0;
    char *catalog_typeArray[] =  { "NULL", "RETAIL", "HOTEL" };
    size_t sizeofArray = sizeof(catalog_typeArray) / sizeof(catalog_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(catalog_type, catalog_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

item_response_t *item_response_create(
    catalogs_type_t *catalog_type,
    char *item_id,
    list_t *pins,
    catalogs_hotel_attributes_t *attributes,
    char *hotel_id,
    list_t *errors
    ) {
    item_response_t *item_response_local_var = malloc(sizeof(item_response_t));
    if (!item_response_local_var) {
        return NULL;
    }
    item_response_local_var->catalog_type = catalog_type;
    item_response_local_var->item_id = item_id;
    item_response_local_var->pins = pins;
    item_response_local_var->attributes = attributes;
    item_response_local_var->hotel_id = hotel_id;
    item_response_local_var->errors = errors;

    return item_response_local_var;
}


void item_response_free(item_response_t *item_response) {
    if(NULL == item_response){
        return ;
    }
    listEntry_t *listEntry;
    if (item_response->catalog_type) {
        catalogs_type_free(item_response->catalog_type);
        item_response->catalog_type = NULL;
    }
    if (item_response->item_id) {
        free(item_response->item_id);
        item_response->item_id = NULL;
    }
    if (item_response->pins) {
        list_ForEach(listEntry, item_response->pins) {
            pin_free(listEntry->data);
        }
        list_freeList(item_response->pins);
        item_response->pins = NULL;
    }
    if (item_response->attributes) {
        catalogs_hotel_attributes_free(item_response->attributes);
        item_response->attributes = NULL;
    }
    if (item_response->hotel_id) {
        free(item_response->hotel_id);
        item_response->hotel_id = NULL;
    }
    if (item_response->errors) {
        list_ForEach(listEntry, item_response->errors) {
            item_validation_event_free(listEntry->data);
        }
        list_freeList(item_response->errors);
        item_response->errors = NULL;
    }
    free(item_response);
}

cJSON *item_response_convertToJSON(item_response_t *item_response) {
    cJSON *item = cJSON_CreateObject();

    // item_response->catalog_type
    if (pinterest_rest_api_item_response__NULL == item_response->catalog_type) {
        goto fail;
    }
    cJSON *catalog_type_local_JSON = catalogs_type_convertToJSON(item_response->catalog_type);
    if(catalog_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "catalog_type", catalog_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // item_response->item_id
    if(item_response->item_id) {
    if(cJSON_AddStringToObject(item, "item_id", item_response->item_id) == NULL) {
    goto fail; //String
    }
    }


    // item_response->pins
    if(item_response->pins) {
    cJSON *pins = cJSON_AddArrayToObject(item, "pins");
    if(pins == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *pinsListEntry;
    if (item_response->pins) {
    list_ForEach(pinsListEntry, item_response->pins) {
    cJSON *itemLocal = pin_convertToJSON(pinsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(pins, itemLocal);
    }
    }
    }


    // item_response->attributes
    if(item_response->attributes) {
    cJSON *attributes_local_JSON = catalogs_hotel_attributes_convertToJSON(item_response->attributes);
    if(attributes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "attributes", attributes_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // item_response->hotel_id
    if(item_response->hotel_id) {
    if(cJSON_AddStringToObject(item, "hotel_id", item_response->hotel_id) == NULL) {
    goto fail; //String
    }
    }


    // item_response->errors
    if(item_response->errors) {
    cJSON *errors = cJSON_AddArrayToObject(item, "errors");
    if(errors == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *errorsListEntry;
    if (item_response->errors) {
    list_ForEach(errorsListEntry, item_response->errors) {
    cJSON *itemLocal = item_validation_event_convertToJSON(errorsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(errors, itemLocal);
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

item_response_t *item_response_parseFromJSON(cJSON *item_responseJSON){

    item_response_t *item_response_local_var = NULL;

    // define the local variable for item_response->catalog_type
    catalogs_type_t *catalog_type_local_nonprim = NULL;

    // define the local list for item_response->pins
    list_t *pinsList = NULL;

    // define the local variable for item_response->attributes
    catalogs_hotel_attributes_t *attributes_local_nonprim = NULL;

    // define the local list for item_response->errors
    list_t *errorsList = NULL;

    // item_response->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(item_responseJSON, "catalog_type");
    if (!catalog_type) {
        goto end;
    }

    
    catalog_type_local_nonprim = catalogs_type_parseFromJSON(catalog_type); //custom

    // item_response->item_id
    cJSON *item_id = cJSON_GetObjectItemCaseSensitive(item_responseJSON, "item_id");
    if (item_id) { 
    if(!cJSON_IsString(item_id) && !cJSON_IsNull(item_id))
    {
    goto end; //String
    }
    }

    // item_response->pins
    cJSON *pins = cJSON_GetObjectItemCaseSensitive(item_responseJSON, "pins");
    if (pins) { 
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
        pin_t *pinsItem = pin_parseFromJSON(pins_local_nonprimitive);

        list_addElement(pinsList, pinsItem);
    }
    }

    // item_response->attributes
    cJSON *attributes = cJSON_GetObjectItemCaseSensitive(item_responseJSON, "attributes");
    if (attributes) { 
    attributes_local_nonprim = catalogs_hotel_attributes_parseFromJSON(attributes); //nonprimitive
    }

    // item_response->hotel_id
    cJSON *hotel_id = cJSON_GetObjectItemCaseSensitive(item_responseJSON, "hotel_id");
    if (hotel_id) { 
    if(!cJSON_IsString(hotel_id) && !cJSON_IsNull(hotel_id))
    {
    goto end; //String
    }
    }

    // item_response->errors
    cJSON *errors = cJSON_GetObjectItemCaseSensitive(item_responseJSON, "errors");
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


    item_response_local_var = item_response_create (
        catalog_type_local_nonprim,
        item_id && !cJSON_IsNull(item_id) ? strdup(item_id->valuestring) : NULL,
        pins ? pinsList : NULL,
        attributes ? attributes_local_nonprim : NULL,
        hotel_id && !cJSON_IsNull(hotel_id) ? strdup(hotel_id->valuestring) : NULL,
        errors ? errorsList : NULL
        );

    return item_response_local_var;
end:
    if (catalog_type_local_nonprim) {
        catalogs_type_free(catalog_type_local_nonprim);
        catalog_type_local_nonprim = NULL;
    }
    if (pinsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, pinsList) {
            pin_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(pinsList);
        pinsList = NULL;
    }
    if (attributes_local_nonprim) {
        catalogs_hotel_attributes_free(attributes_local_nonprim);
        attributes_local_nonprim = NULL;
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
