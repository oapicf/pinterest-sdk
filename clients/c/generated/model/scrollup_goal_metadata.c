#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "scrollup_goal_metadata.h"



static scrollup_goal_metadata_t *scrollup_goal_metadata_create_internal(
    char *scrollup_goal_value_in_micro_currency
    ) {
    scrollup_goal_metadata_t *scrollup_goal_metadata_local_var = malloc(sizeof(scrollup_goal_metadata_t));
    if (!scrollup_goal_metadata_local_var) {
        return NULL;
    }
    memset(scrollup_goal_metadata_local_var, 0, sizeof(scrollup_goal_metadata_t));
    scrollup_goal_metadata_local_var->_library_owned = 1;
    scrollup_goal_metadata_local_var->scrollup_goal_value_in_micro_currency = scrollup_goal_value_in_micro_currency;
    return scrollup_goal_metadata_local_var;
}

__attribute__((deprecated)) scrollup_goal_metadata_t *scrollup_goal_metadata_create(
    char *scrollup_goal_value_in_micro_currency
    ) {
    scrollup_goal_metadata_t *result = scrollup_goal_metadata_create_internal (
        scrollup_goal_value_in_micro_currency
        );
    if (!result) {
    }
    return result;
}

void scrollup_goal_metadata_free(scrollup_goal_metadata_t *scrollup_goal_metadata) {
    if(NULL == scrollup_goal_metadata){
        return ;
    }
    if(scrollup_goal_metadata->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "scrollup_goal_metadata_free");
        return ;
    }
    listEntry_t *listEntry;
    if (scrollup_goal_metadata->scrollup_goal_value_in_micro_currency) {
        free(scrollup_goal_metadata->scrollup_goal_value_in_micro_currency);
        scrollup_goal_metadata->scrollup_goal_value_in_micro_currency = NULL;
    }
    free(scrollup_goal_metadata);
}

cJSON *scrollup_goal_metadata_convertToJSON(scrollup_goal_metadata_t *scrollup_goal_metadata) {
    cJSON *item = cJSON_CreateObject();

    // scrollup_goal_metadata->scrollup_goal_value_in_micro_currency
    if(scrollup_goal_metadata->scrollup_goal_value_in_micro_currency) {
    if(cJSON_AddStringToObject(item, "scrollup_goal_value_in_micro_currency", scrollup_goal_metadata->scrollup_goal_value_in_micro_currency) == NULL) {
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

scrollup_goal_metadata_t *scrollup_goal_metadata_parseFromJSON(cJSON *scrollup_goal_metadataJSON){

    scrollup_goal_metadata_t *scrollup_goal_metadata_local_var = NULL;

    char *scrollup_goal_value_in_micro_currency_local_str = NULL;

    // scrollup_goal_metadata->scrollup_goal_value_in_micro_currency
    cJSON *scrollup_goal_value_in_micro_currency = cJSON_GetObjectItemCaseSensitive(scrollup_goal_metadataJSON, "scrollup_goal_value_in_micro_currency");
    if (cJSON_IsNull(scrollup_goal_value_in_micro_currency)) {
        scrollup_goal_value_in_micro_currency = NULL;
    }
    if (scrollup_goal_value_in_micro_currency) { 
    if(!cJSON_IsString(scrollup_goal_value_in_micro_currency) && !cJSON_IsNull(scrollup_goal_value_in_micro_currency))
    {
    goto end; //String
    }
    }


    if (scrollup_goal_value_in_micro_currency && !cJSON_IsNull(scrollup_goal_value_in_micro_currency)) scrollup_goal_value_in_micro_currency_local_str = strdup(scrollup_goal_value_in_micro_currency->valuestring);

    scrollup_goal_metadata_local_var = scrollup_goal_metadata_create_internal (
        scrollup_goal_value_in_micro_currency_local_str
        );

    if (!scrollup_goal_metadata_local_var) {
        goto end;
    }

    return scrollup_goal_metadata_local_var;
end:
    if (scrollup_goal_value_in_micro_currency_local_str) {
        free(scrollup_goal_value_in_micro_currency_local_str);
        scrollup_goal_value_in_micro_currency_local_str = NULL;
    }
    return NULL;

}
