#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "bulk_entity_type.h"


char* bulk_entity_type_bulk_entity_type_ToString(pinterest_rest_api_bulk_entity_type__e bulk_entity_type) {
    char *bulk_entity_typeArray[] =  { "NULL", "CAMPAIGN", "AD_GROUP", "PRODUCT_GROUP", "AD", "KEYWORD" };
    return bulk_entity_typeArray[bulk_entity_type];
}

pinterest_rest_api_bulk_entity_type__e bulk_entity_type_bulk_entity_type_FromString(char* bulk_entity_type) {
    int stringToReturn = 0;
    char *bulk_entity_typeArray[] =  { "NULL", "CAMPAIGN", "AD_GROUP", "PRODUCT_GROUP", "AD", "KEYWORD" };
    size_t sizeofArray = sizeof(bulk_entity_typeArray) / sizeof(bulk_entity_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(bulk_entity_type, bulk_entity_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *bulk_entity_type_bulk_entity_type_convertToJSON(pinterest_rest_api_bulk_entity_type__e bulk_entity_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "bulk_entity_type", bulk_entity_type_bulk_entity_type_ToString(bulk_entity_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_bulk_entity_type__e bulk_entity_type_bulk_entity_type_parseFromJSON(cJSON *bulk_entity_typeJSON) {
    pinterest_rest_api_bulk_entity_type__e *bulk_entity_type = NULL;
    pinterest_rest_api_bulk_entity_type__e bulk_entity_typeVariable;
    cJSON *bulk_entity_typeVar = cJSON_GetObjectItemCaseSensitive(bulk_entity_typeJSON, "bulk_entity_type");
    if(!cJSON_IsString(bulk_entity_typeVar) || (bulk_entity_typeVar->valuestring == NULL)){
        goto end;
    }
    bulk_entity_typeVariable = bulk_entity_type_bulk_entity_type_FromString(bulk_entity_typeVar->valuestring);
    return bulk_entity_typeVariable;
end:
    return 0;
}
