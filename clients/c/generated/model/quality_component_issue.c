#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "quality_component_issue.h"



static quality_component_issue_t *quality_component_issue_create_internal(
    char *id,
    char *name,
    char *reason
    ) {
    quality_component_issue_t *quality_component_issue_local_var = malloc(sizeof(quality_component_issue_t));
    if (!quality_component_issue_local_var) {
        return NULL;
    }
    quality_component_issue_local_var->id = id;
    quality_component_issue_local_var->name = name;
    quality_component_issue_local_var->reason = reason;

    quality_component_issue_local_var->_library_owned = 1;
    return quality_component_issue_local_var;
}

__attribute__((deprecated)) quality_component_issue_t *quality_component_issue_create(
    char *id,
    char *name,
    char *reason
    ) {
    return quality_component_issue_create_internal (
        id,
        name,
        reason
        );
}

void quality_component_issue_free(quality_component_issue_t *quality_component_issue) {
    if(NULL == quality_component_issue){
        return ;
    }
    if(quality_component_issue->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "quality_component_issue_free");
        return ;
    }
    listEntry_t *listEntry;
    if (quality_component_issue->id) {
        free(quality_component_issue->id);
        quality_component_issue->id = NULL;
    }
    if (quality_component_issue->name) {
        free(quality_component_issue->name);
        quality_component_issue->name = NULL;
    }
    if (quality_component_issue->reason) {
        free(quality_component_issue->reason);
        quality_component_issue->reason = NULL;
    }
    free(quality_component_issue);
}

cJSON *quality_component_issue_convertToJSON(quality_component_issue_t *quality_component_issue) {
    cJSON *item = cJSON_CreateObject();

    // quality_component_issue->id
    if (!quality_component_issue->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", quality_component_issue->id) == NULL) {
    goto fail; //String
    }


    // quality_component_issue->name
    if (!quality_component_issue->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", quality_component_issue->name) == NULL) {
    goto fail; //String
    }


    // quality_component_issue->reason
    if (!quality_component_issue->reason) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "reason", quality_component_issue->reason) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

quality_component_issue_t *quality_component_issue_parseFromJSON(cJSON *quality_component_issueJSON){

    quality_component_issue_t *quality_component_issue_local_var = NULL;

    // quality_component_issue->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(quality_component_issueJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // quality_component_issue->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(quality_component_issueJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // quality_component_issue->reason
    cJSON *reason = cJSON_GetObjectItemCaseSensitive(quality_component_issueJSON, "reason");
    if (cJSON_IsNull(reason)) {
        reason = NULL;
    }
    if (!reason) {
        goto end;
    }

    
    if(!cJSON_IsString(reason))
    {
    goto end; //String
    }


    quality_component_issue_local_var = quality_component_issue_create_internal (
        strdup(id->valuestring),
        strdup(name->valuestring),
        strdup(reason->valuestring)
        );

    return quality_component_issue_local_var;
end:
    return NULL;

}
