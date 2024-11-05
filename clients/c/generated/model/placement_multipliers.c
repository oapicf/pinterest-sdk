#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "placement_multipliers.h"


char* placement_multipliers_placement_ToString(pinterest_rest_api_placement_multipliers_PLACEMENT_e placement) {
    char* placementArray[] =  { "NULL", "SEARCH", "BROWSE" };
    return placementArray[placement];
}

pinterest_rest_api_placement_multipliers_PLACEMENT_e placement_multipliers_placement_FromString(char* placement){
    int stringToReturn = 0;
    char *placementArray[] =  { "NULL", "SEARCH", "BROWSE" };
    size_t sizeofArray = sizeof(placementArray) / sizeof(placementArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(placement, placementArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

placement_multipliers_t *placement_multipliers_create(
    pinterest_rest_api_placement_multipliers_PLACEMENT_e placement
    ) {
    placement_multipliers_t *placement_multipliers_local_var = malloc(sizeof(placement_multipliers_t));
    if (!placement_multipliers_local_var) {
        return NULL;
    }
    placement_multipliers_local_var->placement = placement;

    return placement_multipliers_local_var;
}


void placement_multipliers_free(placement_multipliers_t *placement_multipliers) {
    if(NULL == placement_multipliers){
        return ;
    }
    listEntry_t *listEntry;
    free(placement_multipliers);
}

cJSON *placement_multipliers_convertToJSON(placement_multipliers_t *placement_multipliers) {
    cJSON *item = cJSON_CreateObject();

    // placement_multipliers->placement
    if(placement_multipliers->placement != pinterest_rest_api_placement_multipliers_PLACEMENT_NULL) {
    if(cJSON_AddStringToObject(item, "PLACEMENT", placementplacement_multipliers_ToString(placement_multipliers->placement)) == NULL)
    {
    goto fail; //Enum
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

placement_multipliers_t *placement_multipliers_parseFromJSON(cJSON *placement_multipliersJSON){

    placement_multipliers_t *placement_multipliers_local_var = NULL;

    // placement_multipliers->placement
    cJSON *placement = cJSON_GetObjectItemCaseSensitive(placement_multipliersJSON, "PLACEMENT");
    pinterest_rest_api_placement_multipliers_PLACEMENT_e placementVariable;
    if (placement) { 
    if(!cJSON_IsString(placement))
    {
    goto end; //Enum
    }
    placementVariable = placement_multipliers_placement_FromString(placement->valuestring);
    }


    placement_multipliers_local_var = placement_multipliers_create (
        placement ? placementVariable : pinterest_rest_api_placement_multipliers_PLACEMENT_NULL
        );

    return placement_multipliers_local_var;
end:
    return NULL;

}
