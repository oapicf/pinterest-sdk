#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "frequency_multipliers.h"



static frequency_multipliers_t *frequency_multipliers_create_internal(
    char *impression_count
    ) {
    frequency_multipliers_t *frequency_multipliers_local_var = malloc(sizeof(frequency_multipliers_t));
    if (!frequency_multipliers_local_var) {
        return NULL;
    }
    memset(frequency_multipliers_local_var, 0, sizeof(frequency_multipliers_t));
    frequency_multipliers_local_var->_library_owned = 1;
    frequency_multipliers_local_var->impression_count = impression_count;
    return frequency_multipliers_local_var;
}

__attribute__((deprecated)) frequency_multipliers_t *frequency_multipliers_create(
    char *impression_count
    ) {
    frequency_multipliers_t *result = frequency_multipliers_create_internal (
        impression_count
        );
    if (!result) {
    }
    return result;
}

void frequency_multipliers_free(frequency_multipliers_t *frequency_multipliers) {
    if(NULL == frequency_multipliers){
        return ;
    }
    if(frequency_multipliers->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "frequency_multipliers_free");
        return ;
    }
    listEntry_t *listEntry;
    if (frequency_multipliers->impression_count) {
        free(frequency_multipliers->impression_count);
        frequency_multipliers->impression_count = NULL;
    }
    free(frequency_multipliers);
}

cJSON *frequency_multipliers_convertToJSON(frequency_multipliers_t *frequency_multipliers) {
    cJSON *item = cJSON_CreateObject();

    // frequency_multipliers->impression_count
    if(frequency_multipliers->impression_count) {
    if(cJSON_AddStringToObject(item, "IMPRESSION_COUNT", frequency_multipliers->impression_count) == NULL) {
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

frequency_multipliers_t *frequency_multipliers_parseFromJSON(cJSON *frequency_multipliersJSON){

    frequency_multipliers_t *frequency_multipliers_local_var = NULL;

    char *impression_count_local_str = NULL;

    // frequency_multipliers->impression_count
    cJSON *impression_count = cJSON_GetObjectItemCaseSensitive(frequency_multipliersJSON, "IMPRESSION_COUNT");
    if (cJSON_IsNull(impression_count)) {
        impression_count = NULL;
    }
    if (impression_count) { 
    if(!cJSON_IsString(impression_count) && !cJSON_IsNull(impression_count))
    {
    goto end; //String
    }
    }


    if (impression_count && !cJSON_IsNull(impression_count)) impression_count_local_str = strdup(impression_count->valuestring);

    frequency_multipliers_local_var = frequency_multipliers_create_internal (
        impression_count_local_str
        );

    if (!frequency_multipliers_local_var) {
        goto end;
    }

    return frequency_multipliers_local_var;
end:
    if (impression_count_local_str) {
        free(impression_count_local_str);
        impression_count_local_str = NULL;
    }
    return NULL;

}
