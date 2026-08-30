#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "placement_multipliers.h"



static placement_multipliers_t *placement_multipliers_create_internal(
    placement_type_t *placement
    ) {
    placement_multipliers_t *placement_multipliers_local_var = malloc(sizeof(placement_multipliers_t));
    if (!placement_multipliers_local_var) {
        return NULL;
    }
    memset(placement_multipliers_local_var, 0, sizeof(placement_multipliers_t));
    placement_multipliers_local_var->_library_owned = 1;
    placement_multipliers_local_var->placement = placement;
    return placement_multipliers_local_var;
}

__attribute__((deprecated)) placement_multipliers_t *placement_multipliers_create(
    placement_type_t *placement
    ) {
    placement_multipliers_t *result = placement_multipliers_create_internal (
        placement
        );
    if (!result) {
    }
    return result;
}

void placement_multipliers_free(placement_multipliers_t *placement_multipliers) {
    if(NULL == placement_multipliers){
        return ;
    }
    if(placement_multipliers->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "placement_multipliers_free");
        return ;
    }
    listEntry_t *listEntry;
    if (placement_multipliers->placement) {
        placement_type_free(placement_multipliers->placement);
        placement_multipliers->placement = NULL;
    }
    free(placement_multipliers);
}

cJSON *placement_multipliers_convertToJSON(placement_multipliers_t *placement_multipliers) {
    cJSON *item = cJSON_CreateObject();

    // placement_multipliers->placement
    if(placement_multipliers->placement) {
    cJSON *placement_local_JSON = placement_type_convertToJSON(placement_multipliers->placement);
    if(placement_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "PLACEMENT", placement_local_JSON);
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

placement_multipliers_t *placement_multipliers_parseFromJSON(cJSON *placement_multipliersJSON){

    placement_multipliers_t *placement_multipliers_local_var = NULL;

    // define the local variable for placement_multipliers->placement
    placement_type_t *placement_local_nonprim = NULL;

    // placement_multipliers->placement
    cJSON *placement = cJSON_GetObjectItemCaseSensitive(placement_multipliersJSON, "PLACEMENT");
    if (cJSON_IsNull(placement)) {
        placement = NULL;
    }
    if (placement) { 
    placement_local_nonprim = placement_type_parseFromJSON(placement); //custom
    }



    placement_multipliers_local_var = placement_multipliers_create_internal (
        placement ? placement_local_nonprim : NULL
        );

    if (!placement_multipliers_local_var) {
        goto end;
    }

    return placement_multipliers_local_var;
end:
    if (placement_local_nonprim) {
        placement_type_free(placement_local_nonprim);
        placement_local_nonprim = NULL;
    }
    return NULL;

}
