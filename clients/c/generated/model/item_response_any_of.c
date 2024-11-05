#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "item_response_any_of.h"


char* item_response_any_of_catalog_type_ToString(pinterest_rest_api_item_response_any_of__e catalog_type) {
    char* catalog_typeArray[] =  { "NULL", "RETAIL", "HOTEL", "CREATIVE_ASSETS" };
    return catalog_typeArray[catalog_type];
}

pinterest_rest_api_item_response_any_of__e item_response_any_of_catalog_type_FromString(char* catalog_type){
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

item_response_any_of_t *item_response_any_of_create(
    catalogs_type_t *catalog_type,
    char *item_id,
    list_t *pins,
    catalogs_creative_assets_attributes_t *attributes,
    char *hotel_id,
    char *creative_assets_id
    ) {
    item_response_any_of_t *item_response_any_of_local_var = malloc(sizeof(item_response_any_of_t));
    if (!item_response_any_of_local_var) {
        return NULL;
    }
    item_response_any_of_local_var->catalog_type = catalog_type;
    item_response_any_of_local_var->item_id = item_id;
    item_response_any_of_local_var->pins = pins;
    item_response_any_of_local_var->attributes = attributes;
    item_response_any_of_local_var->hotel_id = hotel_id;
    item_response_any_of_local_var->creative_assets_id = creative_assets_id;

    return item_response_any_of_local_var;
}


void item_response_any_of_free(item_response_any_of_t *item_response_any_of) {
    if(NULL == item_response_any_of){
        return ;
    }
    listEntry_t *listEntry;
    if (item_response_any_of->catalog_type) {
        catalogs_type_free(item_response_any_of->catalog_type);
        item_response_any_of->catalog_type = NULL;
    }
    if (item_response_any_of->item_id) {
        free(item_response_any_of->item_id);
        item_response_any_of->item_id = NULL;
    }
    if (item_response_any_of->pins) {
        list_ForEach(listEntry, item_response_any_of->pins) {
            pin_free(listEntry->data);
        }
        list_freeList(item_response_any_of->pins);
        item_response_any_of->pins = NULL;
    }
    if (item_response_any_of->attributes) {
        catalogs_creative_assets_attributes_free(item_response_any_of->attributes);
        item_response_any_of->attributes = NULL;
    }
    if (item_response_any_of->hotel_id) {
        free(item_response_any_of->hotel_id);
        item_response_any_of->hotel_id = NULL;
    }
    if (item_response_any_of->creative_assets_id) {
        free(item_response_any_of->creative_assets_id);
        item_response_any_of->creative_assets_id = NULL;
    }
    free(item_response_any_of);
}

cJSON *item_response_any_of_convertToJSON(item_response_any_of_t *item_response_any_of) {
    cJSON *item = cJSON_CreateObject();

    // item_response_any_of->catalog_type
    if (pinterest_rest_api_item_response_any_of__NULL == item_response_any_of->catalog_type) {
        goto fail;
    }
    cJSON *catalog_type_local_JSON = catalogs_type_convertToJSON(item_response_any_of->catalog_type);
    if(catalog_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "catalog_type", catalog_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // item_response_any_of->item_id
    if(item_response_any_of->item_id) {
    if(cJSON_AddStringToObject(item, "item_id", item_response_any_of->item_id) == NULL) {
    goto fail; //String
    }
    }


    // item_response_any_of->pins
    if(item_response_any_of->pins) {
    cJSON *pins = cJSON_AddArrayToObject(item, "pins");
    if(pins == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *pinsListEntry;
    if (item_response_any_of->pins) {
    list_ForEach(pinsListEntry, item_response_any_of->pins) {
    cJSON *itemLocal = pin_convertToJSON(pinsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(pins, itemLocal);
    }
    }
    }


    // item_response_any_of->attributes
    if(item_response_any_of->attributes) {
    cJSON *attributes_local_JSON = catalogs_creative_assets_attributes_convertToJSON(item_response_any_of->attributes);
    if(attributes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "attributes", attributes_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // item_response_any_of->hotel_id
    if(item_response_any_of->hotel_id) {
    if(cJSON_AddStringToObject(item, "hotel_id", item_response_any_of->hotel_id) == NULL) {
    goto fail; //String
    }
    }


    // item_response_any_of->creative_assets_id
    if(item_response_any_of->creative_assets_id) {
    if(cJSON_AddStringToObject(item, "creative_assets_id", item_response_any_of->creative_assets_id) == NULL) {
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

item_response_any_of_t *item_response_any_of_parseFromJSON(cJSON *item_response_any_ofJSON){

    item_response_any_of_t *item_response_any_of_local_var = NULL;

    // define the local variable for item_response_any_of->catalog_type
    catalogs_type_t *catalog_type_local_nonprim = NULL;

    // define the local list for item_response_any_of->pins
    list_t *pinsList = NULL;

    // define the local variable for item_response_any_of->attributes
    catalogs_creative_assets_attributes_t *attributes_local_nonprim = NULL;

    // item_response_any_of->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(item_response_any_ofJSON, "catalog_type");
    if (!catalog_type) {
        goto end;
    }

    
    catalog_type_local_nonprim = catalogs_type_parseFromJSON(catalog_type); //custom

    // item_response_any_of->item_id
    cJSON *item_id = cJSON_GetObjectItemCaseSensitive(item_response_any_ofJSON, "item_id");
    if (item_id) { 
    if(!cJSON_IsString(item_id) && !cJSON_IsNull(item_id))
    {
    goto end; //String
    }
    }

    // item_response_any_of->pins
    cJSON *pins = cJSON_GetObjectItemCaseSensitive(item_response_any_ofJSON, "pins");
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

    // item_response_any_of->attributes
    cJSON *attributes = cJSON_GetObjectItemCaseSensitive(item_response_any_ofJSON, "attributes");
    if (attributes) { 
    attributes_local_nonprim = catalogs_creative_assets_attributes_parseFromJSON(attributes); //nonprimitive
    }

    // item_response_any_of->hotel_id
    cJSON *hotel_id = cJSON_GetObjectItemCaseSensitive(item_response_any_ofJSON, "hotel_id");
    if (hotel_id) { 
    if(!cJSON_IsString(hotel_id) && !cJSON_IsNull(hotel_id))
    {
    goto end; //String
    }
    }

    // item_response_any_of->creative_assets_id
    cJSON *creative_assets_id = cJSON_GetObjectItemCaseSensitive(item_response_any_ofJSON, "creative_assets_id");
    if (creative_assets_id) { 
    if(!cJSON_IsString(creative_assets_id) && !cJSON_IsNull(creative_assets_id))
    {
    goto end; //String
    }
    }


    item_response_any_of_local_var = item_response_any_of_create (
        catalog_type_local_nonprim,
        item_id && !cJSON_IsNull(item_id) ? strdup(item_id->valuestring) : NULL,
        pins ? pinsList : NULL,
        attributes ? attributes_local_nonprim : NULL,
        hotel_id && !cJSON_IsNull(hotel_id) ? strdup(hotel_id->valuestring) : NULL,
        creative_assets_id && !cJSON_IsNull(creative_assets_id) ? strdup(creative_assets_id->valuestring) : NULL
        );

    return item_response_any_of_local_var;
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
        catalogs_creative_assets_attributes_free(attributes_local_nonprim);
        attributes_local_nonprim = NULL;
    }
    return NULL;

}
