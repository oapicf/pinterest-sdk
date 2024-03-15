#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "optimization_goal_metadata_scrollup_goal_metadata.h"



optimization_goal_metadata_scrollup_goal_metadata_t *optimization_goal_metadata_scrollup_goal_metadata_create(
    char *scrollup_goal_value_in_micro_currency
    ) {
    optimization_goal_metadata_scrollup_goal_metadata_t *optimization_goal_metadata_scrollup_goal_metadata_local_var = malloc(sizeof(optimization_goal_metadata_scrollup_goal_metadata_t));
    if (!optimization_goal_metadata_scrollup_goal_metadata_local_var) {
        return NULL;
    }
    optimization_goal_metadata_scrollup_goal_metadata_local_var->scrollup_goal_value_in_micro_currency = scrollup_goal_value_in_micro_currency;

    return optimization_goal_metadata_scrollup_goal_metadata_local_var;
}


void optimization_goal_metadata_scrollup_goal_metadata_free(optimization_goal_metadata_scrollup_goal_metadata_t *optimization_goal_metadata_scrollup_goal_metadata) {
    if(NULL == optimization_goal_metadata_scrollup_goal_metadata){
        return ;
    }
    listEntry_t *listEntry;
    if (optimization_goal_metadata_scrollup_goal_metadata->scrollup_goal_value_in_micro_currency) {
        free(optimization_goal_metadata_scrollup_goal_metadata->scrollup_goal_value_in_micro_currency);
        optimization_goal_metadata_scrollup_goal_metadata->scrollup_goal_value_in_micro_currency = NULL;
    }
    free(optimization_goal_metadata_scrollup_goal_metadata);
}

cJSON *optimization_goal_metadata_scrollup_goal_metadata_convertToJSON(optimization_goal_metadata_scrollup_goal_metadata_t *optimization_goal_metadata_scrollup_goal_metadata) {
    cJSON *item = cJSON_CreateObject();

    // optimization_goal_metadata_scrollup_goal_metadata->scrollup_goal_value_in_micro_currency
    if(optimization_goal_metadata_scrollup_goal_metadata->scrollup_goal_value_in_micro_currency) {
    if(cJSON_AddStringToObject(item, "scrollup_goal_value_in_micro_currency", optimization_goal_metadata_scrollup_goal_metadata->scrollup_goal_value_in_micro_currency) == NULL) {
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

optimization_goal_metadata_scrollup_goal_metadata_t *optimization_goal_metadata_scrollup_goal_metadata_parseFromJSON(cJSON *optimization_goal_metadata_scrollup_goal_metadataJSON){

    optimization_goal_metadata_scrollup_goal_metadata_t *optimization_goal_metadata_scrollup_goal_metadata_local_var = NULL;

    // optimization_goal_metadata_scrollup_goal_metadata->scrollup_goal_value_in_micro_currency
    cJSON *scrollup_goal_value_in_micro_currency = cJSON_GetObjectItemCaseSensitive(optimization_goal_metadata_scrollup_goal_metadataJSON, "scrollup_goal_value_in_micro_currency");
    if (scrollup_goal_value_in_micro_currency) { 
    if(!cJSON_IsString(scrollup_goal_value_in_micro_currency) && !cJSON_IsNull(scrollup_goal_value_in_micro_currency))
    {
    goto end; //String
    }
    }


    optimization_goal_metadata_scrollup_goal_metadata_local_var = optimization_goal_metadata_scrollup_goal_metadata_create (
        scrollup_goal_value_in_micro_currency && !cJSON_IsNull(scrollup_goal_value_in_micro_currency) ? strdup(scrollup_goal_value_in_micro_currency->valuestring) : NULL
        );

    return optimization_goal_metadata_scrollup_goal_metadata_local_var;
end:
    return NULL;

}
