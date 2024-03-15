#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audience_definition.h"



audience_definition_t *audience_definition_create(
    char *date,
    ) {
    audience_definition_t *audience_definition_local_var = malloc(sizeof(audience_definition_t));
    if (!audience_definition_local_var) {
        return NULL;
    }
    audience_definition_local_var->date = date;
    audience_definition_local_var->type = type;
    audience_definition_local_var->scope = scope;

    return audience_definition_local_var;
}


void audience_definition_free(audience_definition_t *audience_definition) {
    if(NULL == audience_definition){
        return ;
    }
    listEntry_t *listEntry;
    if (audience_definition->date) {
        free(audience_definition->date);
        audience_definition->date = NULL;
    }
    free(audience_definition);
}

cJSON *audience_definition_convertToJSON(audience_definition_t *audience_definition) {
    cJSON *item = cJSON_CreateObject();

    // audience_definition->date
    if(audience_definition->date) {
    if(cJSON_AddStringToObject(item, "date", audience_definition->date) == NULL) {
    goto fail; //String
    }
    }


    // audience_definition->type
    if(audience_definition->type) {
    }


    // audience_definition->scope
    if(audience_definition->scope) {
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

audience_definition_t *audience_definition_parseFromJSON(cJSON *audience_definitionJSON){

    audience_definition_t *audience_definition_local_var = NULL;

    // audience_definition->date
    cJSON *date = cJSON_GetObjectItemCaseSensitive(audience_definitionJSON, "date");
    if (date) { 
    if(!cJSON_IsString(date) && !cJSON_IsNull(date))
    {
    goto end; //String
    }
    }

    // audience_definition->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(audience_definitionJSON, "type");
    }

    // audience_definition->scope
    cJSON *scope = cJSON_GetObjectItemCaseSensitive(audience_definitionJSON, "scope");
    }


    audience_definition_local_var = audience_definition_create (
        date && !cJSON_IsNull(date) ? strdup(date->valuestring) : NULL,
        );

    return audience_definition_local_var;
end:
    return NULL;

}
