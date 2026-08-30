#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ai_disclosures_update.h"


char* ai_disclosures_update_values_ToString(pinterest_rest_api_ai_disclosures_update__e values) {
    char *valuesArray[] =  { "NULL", "AI_MODIFIED", "SYNTHETIC_PERFORMER" };
    return valuesArray[values - 1];
}

pinterest_rest_api_ai_disclosures_update__e ai_disclosures_update_values_FromString(char* values) {
    int stringToReturn = 0;
    char *valuesArray[] =  { "NULL", "AI_MODIFIED", "SYNTHETIC_PERFORMER" };
    size_t sizeofArray = sizeof(valuesArray) / sizeof(valuesArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(values, valuesArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

static ai_disclosures_update_t *ai_disclosures_update_create_internal(
    list_t *values
    ) {
    ai_disclosures_update_t *ai_disclosures_update_local_var = malloc(sizeof(ai_disclosures_update_t));
    if (!ai_disclosures_update_local_var) {
        return NULL;
    }
    memset(ai_disclosures_update_local_var, 0, sizeof(ai_disclosures_update_t));
    ai_disclosures_update_local_var->_library_owned = 1;
    ai_disclosures_update_local_var->values = values;
    return ai_disclosures_update_local_var;
}

__attribute__((deprecated)) ai_disclosures_update_t *ai_disclosures_update_create(
    list_t *values
    ) {
    ai_disclosures_update_t *result = ai_disclosures_update_create_internal (
        values
        );
    if (!result) {
    }
    return result;
}

void ai_disclosures_update_free(ai_disclosures_update_t *ai_disclosures_update) {
    if(NULL == ai_disclosures_update){
        return ;
    }
    if(ai_disclosures_update->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ai_disclosures_update_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ai_disclosures_update->values) {
        list_ForEach(listEntry, ai_disclosures_update->values) {
            ai_disclosure_item_free(listEntry->data);
        }
        list_freeList(ai_disclosures_update->values);
        ai_disclosures_update->values = NULL;
    }
    free(ai_disclosures_update);
}

cJSON *ai_disclosures_update_convertToJSON(ai_disclosures_update_t *ai_disclosures_update) {
    cJSON *item = cJSON_CreateObject();

    // ai_disclosures_update->values
    if(ai_disclosures_update->values != pinterest_rest_api_list_VALUES_NULL) {
    cJSON *values = cJSON_AddArrayToObject(item, "values");
    if(values == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *valuesListEntry;
    if (ai_disclosures_update->values) {
    list_ForEach(valuesListEntry, ai_disclosures_update->values) {
    cJSON *itemLocal = ai_disclosure_item_convertToJSON((pinterest_rest_api_ai_disclosures_update__e)valuesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(values, itemLocal);
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

ai_disclosures_update_t *ai_disclosures_update_parseFromJSON(cJSON *ai_disclosures_updateJSON){

    ai_disclosures_update_t *ai_disclosures_update_local_var = NULL;

    // define the local list for ai_disclosures_update->values
    list_t *valuesList = NULL;

    // ai_disclosures_update->values
    cJSON *values = cJSON_GetObjectItemCaseSensitive(ai_disclosures_updateJSON, "values");
    if (cJSON_IsNull(values)) {
        values = NULL;
    }
    if (values) { 
    cJSON *values_local_nonprimitive = NULL;
    if(!cJSON_IsArray(values)){
        goto end; //nonprimitive container
    }

    valuesList = list_createList();

    cJSON_ArrayForEach(values_local_nonprimitive,values )
    {
        if(!cJSON_IsObject(values_local_nonprimitive)){
            goto end;
        }
        ai_disclosures_update_ai_disclosure_item_e valuesItem = ai_disclosure_item_parseFromJSON(values_local_nonprimitive);

        list_addElement(valuesList, (void *)valuesItem);
    }
    }



    ai_disclosures_update_local_var = ai_disclosures_update_create_internal (
        values ? valuesList : NULL
        );

    if (!ai_disclosures_update_local_var) {
        goto end;
    }

    return ai_disclosures_update_local_var;
end:
    if (valuesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, valuesList) {
            ai_disclosure_item_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(valuesList);
        valuesList = NULL;
    }
    return NULL;

}
