#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "targeting_spec_shopping_retargeting.h"



targeting_spec_shopping_retargeting_t *targeting_spec_shopping_retargeting_create(
    int lookback_window,
    list_t *tag_types,
    int exclusion_window
    ) {
    targeting_spec_shopping_retargeting_t *targeting_spec_shopping_retargeting_local_var = malloc(sizeof(targeting_spec_shopping_retargeting_t));
    if (!targeting_spec_shopping_retargeting_local_var) {
        return NULL;
    }
    targeting_spec_shopping_retargeting_local_var->lookback_window = lookback_window;
    targeting_spec_shopping_retargeting_local_var->tag_types = tag_types;
    targeting_spec_shopping_retargeting_local_var->exclusion_window = exclusion_window;

    return targeting_spec_shopping_retargeting_local_var;
}


void targeting_spec_shopping_retargeting_free(targeting_spec_shopping_retargeting_t *targeting_spec_shopping_retargeting) {
    if(NULL == targeting_spec_shopping_retargeting){
        return ;
    }
    listEntry_t *listEntry;
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

    // targeting_spec_shopping_retargeting->lookback_window
    if(targeting_spec_shopping_retargeting->lookback_window) {
    if(cJSON_AddNumberToObject(item, "lookback_window", targeting_spec_shopping_retargeting->lookback_window) == NULL) {
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


    // targeting_spec_shopping_retargeting->exclusion_window
    if(targeting_spec_shopping_retargeting->exclusion_window) {
    if(cJSON_AddNumberToObject(item, "exclusion_window", targeting_spec_shopping_retargeting->exclusion_window) == NULL) {
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

targeting_spec_shopping_retargeting_t *targeting_spec_shopping_retargeting_parseFromJSON(cJSON *targeting_spec_shopping_retargetingJSON){

    targeting_spec_shopping_retargeting_t *targeting_spec_shopping_retargeting_local_var = NULL;

    // define the local list for targeting_spec_shopping_retargeting->tag_types
    list_t *tag_typesList = NULL;

    // targeting_spec_shopping_retargeting->lookback_window
    cJSON *lookback_window = cJSON_GetObjectItemCaseSensitive(targeting_spec_shopping_retargetingJSON, "lookback_window");
    if (lookback_window) { 
    if(!cJSON_IsNumber(lookback_window))
    {
    goto end; //Numeric
    }
    }

    // targeting_spec_shopping_retargeting->tag_types
    cJSON *tag_types = cJSON_GetObjectItemCaseSensitive(targeting_spec_shopping_retargetingJSON, "tag_types");
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
        double *tag_types_local_value = (double *)calloc(1, sizeof(double));
        if(!tag_types_local_value)
        {
            goto end;
        }
        *tag_types_local_value = tag_types_local->valuedouble;
        list_addElement(tag_typesList , tag_types_local_value);
    }
    }

    // targeting_spec_shopping_retargeting->exclusion_window
    cJSON *exclusion_window = cJSON_GetObjectItemCaseSensitive(targeting_spec_shopping_retargetingJSON, "exclusion_window");
    if (exclusion_window) { 
    if(!cJSON_IsNumber(exclusion_window))
    {
    goto end; //Numeric
    }
    }


    targeting_spec_shopping_retargeting_local_var = targeting_spec_shopping_retargeting_create (
        lookback_window ? lookback_window->valuedouble : 0,
        tag_types ? tag_typesList : NULL,
        exclusion_window ? exclusion_window->valuedouble : 0
        );

    return targeting_spec_shopping_retargeting_local_var;
end:
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
