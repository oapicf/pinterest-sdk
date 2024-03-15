#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_retail_item_response.h"


char* catalogs_retail_item_response_catalog_type_ToString(pinterest_rest_api_catalogs_retail_item_response__e catalog_type) {
    char* catalog_typeArray[] =  { "NULL", "RETAIL", "HOTEL" };
    return catalog_typeArray[catalog_type];
}

pinterest_rest_api_catalogs_retail_item_response__e catalogs_retail_item_response_catalog_type_FromString(char* catalog_type){
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

catalogs_retail_item_response_t *catalogs_retail_item_response_create(
    catalogs_type_t *catalog_type,
    char *item_id,
    list_t *pins,
    item_attributes_t *attributes
    ) {
    catalogs_retail_item_response_t *catalogs_retail_item_response_local_var = malloc(sizeof(catalogs_retail_item_response_t));
    if (!catalogs_retail_item_response_local_var) {
        return NULL;
    }
    catalogs_retail_item_response_local_var->catalog_type = catalog_type;
    catalogs_retail_item_response_local_var->item_id = item_id;
    catalogs_retail_item_response_local_var->pins = pins;
    catalogs_retail_item_response_local_var->attributes = attributes;

    return catalogs_retail_item_response_local_var;
}


void catalogs_retail_item_response_free(catalogs_retail_item_response_t *catalogs_retail_item_response) {
    if(NULL == catalogs_retail_item_response){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_retail_item_response->catalog_type) {
        catalogs_type_free(catalogs_retail_item_response->catalog_type);
        catalogs_retail_item_response->catalog_type = NULL;
    }
    if (catalogs_retail_item_response->item_id) {
        free(catalogs_retail_item_response->item_id);
        catalogs_retail_item_response->item_id = NULL;
    }
    if (catalogs_retail_item_response->pins) {
        list_ForEach(listEntry, catalogs_retail_item_response->pins) {
            pin_free(listEntry->data);
        }
        list_freeList(catalogs_retail_item_response->pins);
        catalogs_retail_item_response->pins = NULL;
    }
    if (catalogs_retail_item_response->attributes) {
        item_attributes_free(catalogs_retail_item_response->attributes);
        catalogs_retail_item_response->attributes = NULL;
    }
    free(catalogs_retail_item_response);
}

cJSON *catalogs_retail_item_response_convertToJSON(catalogs_retail_item_response_t *catalogs_retail_item_response) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_retail_item_response->catalog_type
    if (pinterest_rest_api_catalogs_retail_item_response__NULL == catalogs_retail_item_response->catalog_type) {
        goto fail;
    }
    cJSON *catalog_type_local_JSON = catalogs_type_convertToJSON(catalogs_retail_item_response->catalog_type);
    if(catalog_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "catalog_type", catalog_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // catalogs_retail_item_response->item_id
    if(catalogs_retail_item_response->item_id) {
    if(cJSON_AddStringToObject(item, "item_id", catalogs_retail_item_response->item_id) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_retail_item_response->pins
    if(catalogs_retail_item_response->pins) {
    cJSON *pins = cJSON_AddArrayToObject(item, "pins");
    if(pins == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *pinsListEntry;
    if (catalogs_retail_item_response->pins) {
    list_ForEach(pinsListEntry, catalogs_retail_item_response->pins) {
    cJSON *itemLocal = pin_convertToJSON(pinsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(pins, itemLocal);
    }
    }
    }


    // catalogs_retail_item_response->attributes
    if(catalogs_retail_item_response->attributes) {
    cJSON *attributes_local_JSON = item_attributes_convertToJSON(catalogs_retail_item_response->attributes);
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

catalogs_retail_item_response_t *catalogs_retail_item_response_parseFromJSON(cJSON *catalogs_retail_item_responseJSON){

    catalogs_retail_item_response_t *catalogs_retail_item_response_local_var = NULL;

    // define the local variable for catalogs_retail_item_response->catalog_type
    catalogs_type_t *catalog_type_local_nonprim = NULL;

    // define the local list for catalogs_retail_item_response->pins
    list_t *pinsList = NULL;

    // define the local variable for catalogs_retail_item_response->attributes
    item_attributes_t *attributes_local_nonprim = NULL;

    // catalogs_retail_item_response->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_retail_item_responseJSON, "catalog_type");
    if (!catalog_type) {
        goto end;
    }

    
    catalog_type_local_nonprim = catalogs_type_parseFromJSON(catalog_type); //custom

    // catalogs_retail_item_response->item_id
    cJSON *item_id = cJSON_GetObjectItemCaseSensitive(catalogs_retail_item_responseJSON, "item_id");
    if (item_id) { 
    if(!cJSON_IsString(item_id) && !cJSON_IsNull(item_id))
    {
    goto end; //String
    }
    }

    // catalogs_retail_item_response->pins
    cJSON *pins = cJSON_GetObjectItemCaseSensitive(catalogs_retail_item_responseJSON, "pins");
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

    // catalogs_retail_item_response->attributes
    cJSON *attributes = cJSON_GetObjectItemCaseSensitive(catalogs_retail_item_responseJSON, "attributes");
    if (attributes) { 
    attributes_local_nonprim = item_attributes_parseFromJSON(attributes); //nonprimitive
    }


    catalogs_retail_item_response_local_var = catalogs_retail_item_response_create (
        catalog_type_local_nonprim,
        item_id && !cJSON_IsNull(item_id) ? strdup(item_id->valuestring) : NULL,
        pins ? pinsList : NULL,
        attributes ? attributes_local_nonprim : NULL
        );

    return catalogs_retail_item_response_local_var;
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
        item_attributes_free(attributes_local_nonprim);
        attributes_local_nonprim = NULL;
    }
    return NULL;

}
