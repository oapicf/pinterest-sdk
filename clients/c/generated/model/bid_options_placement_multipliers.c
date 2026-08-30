#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "bid_options_placement_multipliers.h"



static bid_options_placement_multipliers_t *bid_options_placement_multipliers_create_internal(
    double *browse,
    double *related_pins,
    double *search
    ) {
    bid_options_placement_multipliers_t *bid_options_placement_multipliers_local_var = malloc(sizeof(bid_options_placement_multipliers_t));
    if (!bid_options_placement_multipliers_local_var) {
        return NULL;
    }
    memset(bid_options_placement_multipliers_local_var, 0, sizeof(bid_options_placement_multipliers_t));
    bid_options_placement_multipliers_local_var->_library_owned = 1;
    bid_options_placement_multipliers_local_var->browse = browse;
    bid_options_placement_multipliers_local_var->related_pins = related_pins;
    bid_options_placement_multipliers_local_var->search = search;
    return bid_options_placement_multipliers_local_var;
}

__attribute__((deprecated)) bid_options_placement_multipliers_t *bid_options_placement_multipliers_create(
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
    bid_options_placement_multipliers_t *result = bid_options_placement_multipliers_create_internal (
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

void bid_options_placement_multipliers_free(bid_options_placement_multipliers_t *bid_options_placement_multipliers) {
    if(NULL == bid_options_placement_multipliers){
        return ;
    }
    if(bid_options_placement_multipliers->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "bid_options_placement_multipliers_free");
        return ;
    }
    listEntry_t *listEntry;
    if (bid_options_placement_multipliers->browse) {
        free(bid_options_placement_multipliers->browse);
        bid_options_placement_multipliers->browse = NULL;
    }
    if (bid_options_placement_multipliers->related_pins) {
        free(bid_options_placement_multipliers->related_pins);
        bid_options_placement_multipliers->related_pins = NULL;
    }
    if (bid_options_placement_multipliers->search) {
        free(bid_options_placement_multipliers->search);
        bid_options_placement_multipliers->search = NULL;
    }
    free(bid_options_placement_multipliers);
}

cJSON *bid_options_placement_multipliers_convertToJSON(bid_options_placement_multipliers_t *bid_options_placement_multipliers) {
    cJSON *item = cJSON_CreateObject();

    // bid_options_placement_multipliers->browse
    if(bid_options_placement_multipliers->browse) {
    if(cJSON_AddNumberToObject(item, "browse", *bid_options_placement_multipliers->browse) == NULL) {
    goto fail; //Numeric
    }
    }


    // bid_options_placement_multipliers->related_pins
    if(bid_options_placement_multipliers->related_pins) {
    if(cJSON_AddNumberToObject(item, "related_pins", *bid_options_placement_multipliers->related_pins) == NULL) {
    goto fail; //Numeric
    }
    }


    // bid_options_placement_multipliers->search
    if(bid_options_placement_multipliers->search) {
    if(cJSON_AddNumberToObject(item, "search", *bid_options_placement_multipliers->search) == NULL) {
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

bid_options_placement_multipliers_t *bid_options_placement_multipliers_parseFromJSON(cJSON *bid_options_placement_multipliersJSON){

    bid_options_placement_multipliers_t *bid_options_placement_multipliers_local_var = NULL;

    // define the local variable for bid_options_placement_multipliers->browse
    double *browse_local_var = NULL;

    // define the local variable for bid_options_placement_multipliers->related_pins
    double *related_pins_local_var = NULL;

    // define the local variable for bid_options_placement_multipliers->search
    double *search_local_var = NULL;

    // bid_options_placement_multipliers->browse
    cJSON *browse = cJSON_GetObjectItemCaseSensitive(bid_options_placement_multipliersJSON, "browse");
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

    // bid_options_placement_multipliers->related_pins
    cJSON *related_pins = cJSON_GetObjectItemCaseSensitive(bid_options_placement_multipliersJSON, "related_pins");
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

    // bid_options_placement_multipliers->search
    cJSON *search = cJSON_GetObjectItemCaseSensitive(bid_options_placement_multipliersJSON, "search");
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



    bid_options_placement_multipliers_local_var = bid_options_placement_multipliers_create_internal (
        browse_local_var,
        related_pins_local_var,
        search_local_var
        );

    if (!bid_options_placement_multipliers_local_var) {
        goto end;
    }

    return bid_options_placement_multipliers_local_var;
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
