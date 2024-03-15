#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "bid_floor.h"



bid_floor_t *bid_floor_create(
    list_t *bid_floors,
    char *type
    ) {
    bid_floor_t *bid_floor_local_var = malloc(sizeof(bid_floor_t));
    if (!bid_floor_local_var) {
        return NULL;
    }
    bid_floor_local_var->bid_floors = bid_floors;
    bid_floor_local_var->type = type;

    return bid_floor_local_var;
}


void bid_floor_free(bid_floor_t *bid_floor) {
    if(NULL == bid_floor){
        return ;
    }
    listEntry_t *listEntry;
    if (bid_floor->bid_floors) {
        list_ForEach(listEntry, bid_floor->bid_floors) {
            free(listEntry->data);
        }
        list_freeList(bid_floor->bid_floors);
        bid_floor->bid_floors = NULL;
    }
    if (bid_floor->type) {
        free(bid_floor->type);
        bid_floor->type = NULL;
    }
    free(bid_floor);
}

cJSON *bid_floor_convertToJSON(bid_floor_t *bid_floor) {
    cJSON *item = cJSON_CreateObject();

    // bid_floor->bid_floors
    if(bid_floor->bid_floors) {
    cJSON *bid_floors = cJSON_AddArrayToObject(item, "bid_floors");
    if(bid_floors == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *bid_floorsListEntry;
    list_ForEach(bid_floorsListEntry, bid_floor->bid_floors) {
    if(cJSON_AddNumberToObject(bid_floors, "", *(double *)bid_floorsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // bid_floor->type
    if(bid_floor->type) {
    if(cJSON_AddStringToObject(item, "type", bid_floor->type) == NULL) {
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

bid_floor_t *bid_floor_parseFromJSON(cJSON *bid_floorJSON){

    bid_floor_t *bid_floor_local_var = NULL;

    // define the local list for bid_floor->bid_floors
    list_t *bid_floorsList = NULL;

    // bid_floor->bid_floors
    cJSON *bid_floors = cJSON_GetObjectItemCaseSensitive(bid_floorJSON, "bid_floors");
    if (bid_floors) { 
    cJSON *bid_floors_local = NULL;
    if(!cJSON_IsArray(bid_floors)) {
        goto end;//primitive container
    }
    bid_floorsList = list_createList();

    cJSON_ArrayForEach(bid_floors_local, bid_floors)
    {
        if(!cJSON_IsNumber(bid_floors_local))
        {
            goto end;
        }
        double *bid_floors_local_value = (double *)calloc(1, sizeof(double));
        if(!bid_floors_local_value)
        {
            goto end;
        }
        *bid_floors_local_value = bid_floors_local->valuedouble;
        list_addElement(bid_floorsList , bid_floors_local_value);
    }
    }

    // bid_floor->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(bid_floorJSON, "type");
    if (type) { 
    if(!cJSON_IsString(type) && !cJSON_IsNull(type))
    {
    goto end; //String
    }
    }


    bid_floor_local_var = bid_floor_create (
        bid_floors ? bid_floorsList : NULL,
        type && !cJSON_IsNull(type) ? strdup(type->valuestring) : NULL
        );

    return bid_floor_local_var;
end:
    if (bid_floorsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, bid_floorsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(bid_floorsList);
        bid_floorsList = NULL;
    }
    return NULL;

}
