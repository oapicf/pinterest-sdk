#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "schedule_placement_multipliers.h"



static schedule_placement_multipliers_t *schedule_placement_multipliers_create_internal(
    double *browse,
    double *related_pins,
    double *search
    ) {
    schedule_placement_multipliers_t *schedule_placement_multipliers_local_var = malloc(sizeof(schedule_placement_multipliers_t));
    if (!schedule_placement_multipliers_local_var) {
        return NULL;
    }
    memset(schedule_placement_multipliers_local_var, 0, sizeof(schedule_placement_multipliers_t));
    schedule_placement_multipliers_local_var->_library_owned = 1;
    schedule_placement_multipliers_local_var->browse = browse;
    schedule_placement_multipliers_local_var->related_pins = related_pins;
    schedule_placement_multipliers_local_var->search = search;
    return schedule_placement_multipliers_local_var;
}

__attribute__((deprecated)) schedule_placement_multipliers_t *schedule_placement_multipliers_create(
    double *browse,
    double *related_pins,
    double *search
    ) {
    double *browse_copy = NULL;
    if (browse) {
        browse_copy = malloc(sizeof(double));
        if (browse_copy) *browse_copy = *browse;
    }
    double *related_pins_copy = NULL;
    if (related_pins) {
        related_pins_copy = malloc(sizeof(double));
        if (related_pins_copy) *related_pins_copy = *related_pins;
    }
    double *search_copy = NULL;
    if (search) {
        search_copy = malloc(sizeof(double));
        if (search_copy) *search_copy = *search;
    }
    schedule_placement_multipliers_t *result = schedule_placement_multipliers_create_internal (
        browse_copy,
        related_pins_copy,
        search_copy
        );
    if (!result) {
        free(browse_copy);
        free(related_pins_copy);
        free(search_copy);
    }
    return result;
}

void schedule_placement_multipliers_free(schedule_placement_multipliers_t *schedule_placement_multipliers) {
    if(NULL == schedule_placement_multipliers){
        return ;
    }
    if(schedule_placement_multipliers->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "schedule_placement_multipliers_free");
        return ;
    }
    listEntry_t *listEntry;
    if (schedule_placement_multipliers->browse) {
        free(schedule_placement_multipliers->browse);
        schedule_placement_multipliers->browse = NULL;
    }
    if (schedule_placement_multipliers->related_pins) {
        free(schedule_placement_multipliers->related_pins);
        schedule_placement_multipliers->related_pins = NULL;
    }
    if (schedule_placement_multipliers->search) {
        free(schedule_placement_multipliers->search);
        schedule_placement_multipliers->search = NULL;
    }
    free(schedule_placement_multipliers);
}

cJSON *schedule_placement_multipliers_convertToJSON(schedule_placement_multipliers_t *schedule_placement_multipliers) {
    cJSON *item = cJSON_CreateObject();

    // schedule_placement_multipliers->browse
    if(schedule_placement_multipliers->browse) {
    if(cJSON_AddNumberToObject(item, "browse", *schedule_placement_multipliers->browse) == NULL) {
    goto fail; //Numeric
    }
    }


    // schedule_placement_multipliers->related_pins
    if(schedule_placement_multipliers->related_pins) {
    if(cJSON_AddNumberToObject(item, "related_pins", *schedule_placement_multipliers->related_pins) == NULL) {
    goto fail; //Numeric
    }
    }


    // schedule_placement_multipliers->search
    if(schedule_placement_multipliers->search) {
    if(cJSON_AddNumberToObject(item, "search", *schedule_placement_multipliers->search) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

schedule_placement_multipliers_t *schedule_placement_multipliers_parseFromJSON(cJSON *schedule_placement_multipliersJSON){

    schedule_placement_multipliers_t *schedule_placement_multipliers_local_var = NULL;

    // define the local variable for schedule_placement_multipliers->browse
    double *browse_local_var = NULL;

    // define the local variable for schedule_placement_multipliers->related_pins
    double *related_pins_local_var = NULL;

    // define the local variable for schedule_placement_multipliers->search
    double *search_local_var = NULL;

    // schedule_placement_multipliers->browse
    cJSON *browse = cJSON_GetObjectItemCaseSensitive(schedule_placement_multipliersJSON, "browse");
    if (cJSON_IsNull(browse)) {
        browse = NULL;
    }
    if (browse) { 
    if(!cJSON_IsNumber(browse))
    {
    goto end; //Numeric
    }
    browse_local_var = malloc(sizeof(double));
    if(!browse_local_var)
    {
        goto end;
    }
    *browse_local_var = browse->valuedouble;
    }

    // schedule_placement_multipliers->related_pins
    cJSON *related_pins = cJSON_GetObjectItemCaseSensitive(schedule_placement_multipliersJSON, "related_pins");
    if (cJSON_IsNull(related_pins)) {
        related_pins = NULL;
    }
    if (related_pins) { 
    if(!cJSON_IsNumber(related_pins))
    {
    goto end; //Numeric
    }
    related_pins_local_var = malloc(sizeof(double));
    if(!related_pins_local_var)
    {
        goto end;
    }
    *related_pins_local_var = related_pins->valuedouble;
    }

    // schedule_placement_multipliers->search
    cJSON *search = cJSON_GetObjectItemCaseSensitive(schedule_placement_multipliersJSON, "search");
    if (cJSON_IsNull(search)) {
        search = NULL;
    }
    if (search) { 
    if(!cJSON_IsNumber(search))
    {
    goto end; //Numeric
    }
    search_local_var = malloc(sizeof(double));
    if(!search_local_var)
    {
        goto end;
    }
    *search_local_var = search->valuedouble;
    }



    schedule_placement_multipliers_local_var = schedule_placement_multipliers_create_internal (
        browse_local_var,
        related_pins_local_var,
        search_local_var
        );

    if (!schedule_placement_multipliers_local_var) {
        goto end;
    }

    return schedule_placement_multipliers_local_var;
end:
    if (browse_local_var) {
        free(browse_local_var);
        browse_local_var = NULL;
    }
    if (related_pins_local_var) {
        free(related_pins_local_var);
        related_pins_local_var = NULL;
    }
    if (search_local_var) {
        free(search_local_var);
        search_local_var = NULL;
    }
    return NULL;

}
