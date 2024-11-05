#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_creative_assets_item_response.h"


char* catalogs_creative_assets_item_response_catalog_type_ToString(pinterest_rest_api_catalogs_creative_assets_item_response__e catalog_type) {
    char* catalog_typeArray[] =  { "NULL", "RETAIL", "HOTEL", "CREATIVE_ASSETS" };
    return catalog_typeArray[catalog_type];
}

pinterest_rest_api_catalogs_creative_assets_item_response__e catalogs_creative_assets_item_response_catalog_type_FromString(char* catalog_type){
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

catalogs_creative_assets_item_response_t *catalogs_creative_assets_item_response_create(
    catalogs_type_t *catalog_type,
    char *creative_assets_id,
    list_t *pins,
    catalogs_creative_assets_attributes_t *attributes
    ) {
    catalogs_creative_assets_item_response_t *catalogs_creative_assets_item_response_local_var = malloc(sizeof(catalogs_creative_assets_item_response_t));
    if (!catalogs_creative_assets_item_response_local_var) {
        return NULL;
    }
    catalogs_creative_assets_item_response_local_var->catalog_type = catalog_type;
    catalogs_creative_assets_item_response_local_var->creative_assets_id = creative_assets_id;
    catalogs_creative_assets_item_response_local_var->pins = pins;
    catalogs_creative_assets_item_response_local_var->attributes = attributes;

    return catalogs_creative_assets_item_response_local_var;
}


void catalogs_creative_assets_item_response_free(catalogs_creative_assets_item_response_t *catalogs_creative_assets_item_response) {
    if(NULL == catalogs_creative_assets_item_response){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_creative_assets_item_response->catalog_type) {
        catalogs_type_free(catalogs_creative_assets_item_response->catalog_type);
        catalogs_creative_assets_item_response->catalog_type = NULL;
    }
    if (catalogs_creative_assets_item_response->creative_assets_id) {
        free(catalogs_creative_assets_item_response->creative_assets_id);
        catalogs_creative_assets_item_response->creative_assets_id = NULL;
    }
    if (catalogs_creative_assets_item_response->pins) {
        list_ForEach(listEntry, catalogs_creative_assets_item_response->pins) {
            pin_free(listEntry->data);
        }
        list_freeList(catalogs_creative_assets_item_response->pins);
        catalogs_creative_assets_item_response->pins = NULL;
    }
    if (catalogs_creative_assets_item_response->attributes) {
        catalogs_creative_assets_attributes_free(catalogs_creative_assets_item_response->attributes);
        catalogs_creative_assets_item_response->attributes = NULL;
    }
    free(catalogs_creative_assets_item_response);
}

cJSON *catalogs_creative_assets_item_response_convertToJSON(catalogs_creative_assets_item_response_t *catalogs_creative_assets_item_response) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_creative_assets_item_response->catalog_type
    if (pinterest_rest_api_catalogs_creative_assets_item_response__NULL == catalogs_creative_assets_item_response->catalog_type) {
        goto fail;
    }
    cJSON *catalog_type_local_JSON = catalogs_type_convertToJSON(catalogs_creative_assets_item_response->catalog_type);
    if(catalog_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "catalog_type", catalog_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_creative_assets_item_response->creative_assets_id
    if(catalogs_creative_assets_item_response->creative_assets_id) {
    if(cJSON_AddStringToObject(item, "creative_assets_id", catalogs_creative_assets_item_response->creative_assets_id) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_creative_assets_item_response->pins
    if(catalogs_creative_assets_item_response->pins) {
    cJSON *pins = cJSON_AddArrayToObject(item, "pins");
    if(pins == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *pinsListEntry;
    if (catalogs_creative_assets_item_response->pins) {
    list_ForEach(pinsListEntry, catalogs_creative_assets_item_response->pins) {
    cJSON *itemLocal = pin_convertToJSON(pinsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(pins, itemLocal);
    }
    }
    }


    // catalogs_creative_assets_item_response->attributes
    if(catalogs_creative_assets_item_response->attributes) {
    cJSON *attributes_local_JSON = catalogs_creative_assets_attributes_convertToJSON(catalogs_creative_assets_item_response->attributes);
    if(attributes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "attributes", attributes_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_creative_assets_item_response_t *catalogs_creative_assets_item_response_parseFromJSON(cJSON *catalogs_creative_assets_item_responseJSON){

    catalogs_creative_assets_item_response_t *catalogs_creative_assets_item_response_local_var = NULL;

    // define the local variable for catalogs_creative_assets_item_response->catalog_type
    catalogs_type_t *catalog_type_local_nonprim = NULL;

    // define the local list for catalogs_creative_assets_item_response->pins
    list_t *pinsList = NULL;

    // define the local variable for catalogs_creative_assets_item_response->attributes
    catalogs_creative_assets_attributes_t *attributes_local_nonprim = NULL;

    // catalogs_creative_assets_item_response->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_item_responseJSON, "catalog_type");
    if (!catalog_type) {
        goto end;
    }

    
    catalog_type_local_nonprim = catalogs_type_parseFromJSON(catalog_type); //custom

    // catalogs_creative_assets_item_response->creative_assets_id
    cJSON *creative_assets_id = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_item_responseJSON, "creative_assets_id");
    if (creative_assets_id) { 
    if(!cJSON_IsString(creative_assets_id) && !cJSON_IsNull(creative_assets_id))
    {
    goto end; //String
    }
    }

    // catalogs_creative_assets_item_response->pins
    cJSON *pins = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_item_responseJSON, "pins");
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

    // catalogs_creative_assets_item_response->attributes
    cJSON *attributes = cJSON_GetObjectItemCaseSensitive(catalogs_creative_assets_item_responseJSON, "attributes");
    if (attributes) { 
    attributes_local_nonprim = catalogs_creative_assets_attributes_parseFromJSON(attributes); //nonprimitive
    }


    catalogs_creative_assets_item_response_local_var = catalogs_creative_assets_item_response_create (
        catalog_type_local_nonprim,
        creative_assets_id && !cJSON_IsNull(creative_assets_id) ? strdup(creative_assets_id->valuestring) : NULL,
        pins ? pinsList : NULL,
        attributes ? attributes_local_nonprim : NULL
        );

    return catalogs_creative_assets_item_response_local_var;
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
