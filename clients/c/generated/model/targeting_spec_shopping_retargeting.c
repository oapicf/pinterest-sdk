#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "targeting_spec_shopping_retargeting.h"



static targeting_spec_shopping_retargeting_t *targeting_spec_shopping_retargeting_create_internal(
    int *exclusion_window,
    int *lookback_window,
    list_t *tag_types
    ) {
    targeting_spec_shopping_retargeting_t *targeting_spec_shopping_retargeting_local_var = malloc(sizeof(targeting_spec_shopping_retargeting_t));
    if (!targeting_spec_shopping_retargeting_local_var) {
        return NULL;
    }
    memset(targeting_spec_shopping_retargeting_local_var, 0, sizeof(targeting_spec_shopping_retargeting_t));
    targeting_spec_shopping_retargeting_local_var->_library_owned = 1;
    targeting_spec_shopping_retargeting_local_var->exclusion_window = exclusion_window;
    targeting_spec_shopping_retargeting_local_var->lookback_window = lookback_window;
    targeting_spec_shopping_retargeting_local_var->tag_types = tag_types;
    return targeting_spec_shopping_retargeting_local_var;
}

__attribute__((deprecated)) targeting_spec_shopping_retargeting_t *targeting_spec_shopping_retargeting_create(
    int *exclusion_window,
    int *lookback_window,
    list_t *tag_types
    ) {
    int *exclusion_window_copy = NULL;
    if (exclusion_window) {
        exclusion_window_copy = malloc(sizeof(int));
        if (exclusion_window_copy) *exclusion_window_copy = *exclusion_window;
    }
    int *lookback_window_copy = NULL;
    if (lookback_window) {
        lookback_window_copy = malloc(sizeof(int));
        if (lookback_window_copy) *lookback_window_copy = *lookback_window;
    }
    targeting_spec_shopping_retargeting_t *result = targeting_spec_shopping_retargeting_create_internal (
        exclusion_window_copy,
        lookback_window_copy,
        tag_types
        );
    if (!result) {
        free(exclusion_window_copy);
        free(lookback_window_copy);
    }
    return result;
}

void targeting_spec_shopping_retargeting_free(targeting_spec_shopping_retargeting_t *targeting_spec_shopping_retargeting) {
    if(NULL == targeting_spec_shopping_retargeting){
        return ;
    }
    if(targeting_spec_shopping_retargeting->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "targeting_spec_shopping_retargeting_free");
        return ;
    }
    listEntry_t *listEntry;
    if (targeting_spec_shopping_retargeting->exclusion_window) {
        free(targeting_spec_shopping_retargeting->exclusion_window);
        targeting_spec_shopping_retargeting->exclusion_window = NULL;
    }
    if (targeting_spec_shopping_retargeting->lookback_window) {
        free(targeting_spec_shopping_retargeting->lookback_window);
        targeting_spec_shopping_retargeting->lookback_window = NULL;
    }
    if (targeting_spec_shopping_retargeting->tag_types) {
        list_ForEach(listEntry, targeting_spec_shopping_retargeting->tag_types) {
            free(listEntry->data);
        }
        list_freeList(targeting_spec_shopping_retargeting->tag_types);
        targeting_spec_shopping_retargeting->tag_types = NULL;
    }
    free(targeting_spec_shopping_retargeting);
}

cJSON *targeting_spec_shopping_retargeting_convertToJSON(targeting_spec_shopping_retargeting_t *targeting_spec_shopping_retargeting) {
    cJSON *item = cJSON_CreateObject();

    // targeting_spec_shopping_retargeting->exclusion_window
    if(targeting_spec_shopping_retargeting->exclusion_window) {
    if(cJSON_AddNumberToObject(item, "exclusion_window", *targeting_spec_shopping_retargeting->exclusion_window) == NULL) {
    goto fail; //Numeric
    }
    }


    // targeting_spec_shopping_retargeting->lookback_window
    if(targeting_spec_shopping_retargeting->lookback_window) {
    if(cJSON_AddNumberToObject(item, "lookback_window", *targeting_spec_shopping_retargeting->lookback_window) == NULL) {
    goto fail; //Numeric
    }
    }


    // targeting_spec_shopping_retargeting->tag_types
    if(targeting_spec_shopping_retargeting->tag_types) {
    cJSON *tag_types = cJSON_AddArrayToObject(item, "tag_types");
    if(tag_types == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *tag_typesListEntry;
    list_ForEach(tag_typesListEntry, targeting_spec_shopping_retargeting->tag_types) {
    if(cJSON_AddNumberToObject(tag_types, "", *(double *)tag_typesListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

targeting_spec_shopping_retargeting_t *targeting_spec_shopping_retargeting_parseFromJSON(cJSON *targeting_spec_shopping_retargetingJSON){

    targeting_spec_shopping_retargeting_t *targeting_spec_shopping_retargeting_local_var = NULL;

    // define the local variable for targeting_spec_shopping_retargeting->exclusion_window
    int *exclusion_window_local_var = NULL;

    // define the local variable for targeting_spec_shopping_retargeting->lookback_window
    int *lookback_window_local_var = NULL;

    // define the local list for targeting_spec_shopping_retargeting->tag_types
    list_t *tag_typesList = NULL;

    // targeting_spec_shopping_retargeting->exclusion_window
    cJSON *exclusion_window = cJSON_GetObjectItemCaseSensitive(targeting_spec_shopping_retargetingJSON, "exclusion_window");
    if (cJSON_IsNull(exclusion_window)) {
        exclusion_window = NULL;
    }
    if (exclusion_window) { 
    if(!cJSON_IsNumber(exclusion_window))
    {
    goto end; //Numeric
    }
    exclusion_window_local_var = malloc(sizeof(int));
    if(!exclusion_window_local_var)
    {
        goto end;
    }
    *exclusion_window_local_var = exclusion_window->valuedouble;
    }

    // targeting_spec_shopping_retargeting->lookback_window
    cJSON *lookback_window = cJSON_GetObjectItemCaseSensitive(targeting_spec_shopping_retargetingJSON, "lookback_window");
    if (cJSON_IsNull(lookback_window)) {
        lookback_window = NULL;
    }
    if (lookback_window) { 
    if(!cJSON_IsNumber(lookback_window))
    {
    goto end; //Numeric
    }
    lookback_window_local_var = malloc(sizeof(int));
    if(!lookback_window_local_var)
    {
        goto end;
    }
    *lookback_window_local_var = lookback_window->valuedouble;
    }

    // targeting_spec_shopping_retargeting->tag_types
    cJSON *tag_types = cJSON_GetObjectItemCaseSensitive(targeting_spec_shopping_retargetingJSON, "tag_types");
    if (cJSON_IsNull(tag_types)) {
        tag_types = NULL;
    }
    if (tag_types) { 
    cJSON *tag_types_local = NULL;
    if(!cJSON_IsArray(tag_types)) {
        goto end;//primitive container
    }
    tag_typesList = list_createList();

    cJSON_ArrayForEach(tag_types_local, tag_types)
    {
        if(!cJSON_IsNumber(tag_types_local))
        {
            goto end;
        }
        double *tag_types_local_value = calloc(1, sizeof(double));
        if(!tag_types_local_value)
        {
            goto end;
        }
        *tag_types_local_value = tag_types_local->valuedouble;
        list_addElement(tag_typesList , tag_types_local_value);
    }
    }



    targeting_spec_shopping_retargeting_local_var = targeting_spec_shopping_retargeting_create_internal (
        exclusion_window_local_var,
        lookback_window_local_var,
        tag_types ? tag_typesList : NULL
        );

    if (!targeting_spec_shopping_retargeting_local_var) {
        goto end;
    }

    return targeting_spec_shopping_retargeting_local_var;
end:
    if (exclusion_window_local_var) {
        free(exclusion_window_local_var);
        exclusion_window_local_var = NULL;
    }
    if (lookback_window_local_var) {
        free(lookback_window_local_var);
        lookback_window_local_var = NULL;
    }
    if (tag_typesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, tag_typesList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(tag_typesList);
        tag_typesList = NULL;
    }
    return NULL;

}
