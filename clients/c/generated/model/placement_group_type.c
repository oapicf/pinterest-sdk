#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "placement_group_type.h"


char* placement_group_type_placement_group_type_ToString(pinterest_rest_api_placement_group_type__e placement_group_type) {
    char *placement_group_typeArray[] =  { "NULL", "ALL", "SEARCH", "BROWSE", "OTHER" };
    return placement_group_typeArray[placement_group_type];
}

pinterest_rest_api_placement_group_type__e placement_group_type_placement_group_type_FromString(char* placement_group_type) {
    int stringToReturn = 0;
    char *placement_group_typeArray[] =  { "NULL", "ALL", "SEARCH", "BROWSE", "OTHER" };
    size_t sizeofArray = sizeof(placement_group_typeArray) / sizeof(placement_group_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(placement_group_type, placement_group_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *placement_group_type_placement_group_type_convertToJSON(pinterest_rest_api_placement_group_type__e placement_group_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "placement_group_type", placement_group_type_placement_group_type_ToString(placement_group_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_placement_group_type__e placement_group_type_placement_group_type_parseFromJSON(cJSON *placement_group_typeJSON) {
    pinterest_rest_api_placement_group_type__e *placement_group_type = NULL;
    pinterest_rest_api_placement_group_type__e placement_group_typeVariable;
    cJSON *placement_group_typeVar = cJSON_GetObjectItemCaseSensitive(placement_group_typeJSON, "placement_group_type");
    if(!cJSON_IsString(placement_group_typeVar) || (placement_group_typeVar->valuestring == NULL)){
        goto end;
    }
    placement_group_typeVariable = placement_group_type_placement_group_type_FromString(placement_group_typeVar->valuestring);
    return placement_group_typeVariable;
end:
    return 0;
}
