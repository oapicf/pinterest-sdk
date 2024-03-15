#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "grid_click_type.h"


char* grid_click_type_grid_click_type_ToString(pinterest_rest_api_grid_click_type__e grid_click_type) {
    char *grid_click_typeArray[] =  { "NULL", "CLOSEUP", "DIRECT_TO_DESTINATION" };
    return grid_click_typeArray[grid_click_type];
}

pinterest_rest_api_grid_click_type__e grid_click_type_grid_click_type_FromString(char* grid_click_type) {
    int stringToReturn = 0;
    char *grid_click_typeArray[] =  { "NULL", "CLOSEUP", "DIRECT_TO_DESTINATION" };
    size_t sizeofArray = sizeof(grid_click_typeArray) / sizeof(grid_click_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(grid_click_type, grid_click_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *grid_click_type_grid_click_type_convertToJSON(pinterest_rest_api_grid_click_type__e grid_click_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "grid_click_type", grid_click_type_grid_click_type_ToString(grid_click_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_grid_click_type__e grid_click_type_grid_click_type_parseFromJSON(cJSON *grid_click_typeJSON) {
    pinterest_rest_api_grid_click_type__e *grid_click_type = NULL;
    pinterest_rest_api_grid_click_type__e grid_click_typeVariable;
    cJSON *grid_click_typeVar = cJSON_GetObjectItemCaseSensitive(grid_click_typeJSON, "grid_click_type");
    if(!cJSON_IsString(grid_click_typeVar) || (grid_click_typeVar->valuestring == NULL)){
        goto end;
    }
    grid_click_typeVariable = grid_click_type_grid_click_type_FromString(grid_click_typeVar->valuestring);
    return grid_click_typeVariable;
end:
    return 0;
}
