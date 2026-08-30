#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "schedule_audience_multipliers.h"



static schedule_audience_multipliers_t *schedule_audience_multipliers_create_internal(
    char *audience_id
    ) {
    schedule_audience_multipliers_t *schedule_audience_multipliers_local_var = malloc(sizeof(schedule_audience_multipliers_t));
    if (!schedule_audience_multipliers_local_var) {
        return NULL;
    }
    memset(schedule_audience_multipliers_local_var, 0, sizeof(schedule_audience_multipliers_t));
    schedule_audience_multipliers_local_var->_library_owned = 1;
    schedule_audience_multipliers_local_var->audience_id = audience_id;
    return schedule_audience_multipliers_local_var;
}

__attribute__((deprecated)) schedule_audience_multipliers_t *schedule_audience_multipliers_create(
    char *audience_id
    ) {
    schedule_audience_multipliers_t *result = schedule_audience_multipliers_create_internal (
        audience_id
        );
    if (!result) {
    }
    return result;
}

void schedule_audience_multipliers_free(schedule_audience_multipliers_t *schedule_audience_multipliers) {
    if(NULL == schedule_audience_multipliers){
        return ;
    }
    if(schedule_audience_multipliers->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "schedule_audience_multipliers_free");
        return ;
    }
    listEntry_t *listEntry;
    if (schedule_audience_multipliers->audience_id) {
        free(schedule_audience_multipliers->audience_id);
        schedule_audience_multipliers->audience_id = NULL;
    }
    free(schedule_audience_multipliers);
}

cJSON *schedule_audience_multipliers_convertToJSON(schedule_audience_multipliers_t *schedule_audience_multipliers) {
    cJSON *item = cJSON_CreateObject();

    // schedule_audience_multipliers->audience_id
    if(schedule_audience_multipliers->audience_id) {
    if(cJSON_AddStringToObject(item, "AUDIENCE_ID", schedule_audience_multipliers->audience_id) == NULL) {
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

schedule_audience_multipliers_t *schedule_audience_multipliers_parseFromJSON(cJSON *schedule_audience_multipliersJSON){

    schedule_audience_multipliers_t *schedule_audience_multipliers_local_var = NULL;

    char *audience_id_local_str = NULL;

    // schedule_audience_multipliers->audience_id
    cJSON *audience_id = cJSON_GetObjectItemCaseSensitive(schedule_audience_multipliersJSON, "AUDIENCE_ID");
    if (cJSON_IsNull(audience_id)) {
        audience_id = NULL;
    }
    if (audience_id) { 
    if(!cJSON_IsString(audience_id) && !cJSON_IsNull(audience_id))
    {
    goto end; //String
    }
    }


    if (audience_id && !cJSON_IsNull(audience_id)) audience_id_local_str = strdup(audience_id->valuestring);

    schedule_audience_multipliers_local_var = schedule_audience_multipliers_create_internal (
        audience_id_local_str
        );

    if (!schedule_audience_multipliers_local_var) {
        goto end;
    }

    return schedule_audience_multipliers_local_var;
end:
    if (audience_id_local_str) {
        free(audience_id_local_str);
        audience_id_local_str = NULL;
    }
    return NULL;

}
