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
    memset(quality_component_issue_local_var, 0, sizeof(quality_component_issue_t));
    quality_component_issue_local_var->_library_owned = 1;
    quality_component_issue_local_var->id = id;
    quality_component_issue_local_var->name = name;
    quality_component_issue_local_var->reason = reason;
    return quality_component_issue_local_var;
}

__attribute__((deprecated)) quality_component_issue_t *quality_component_issue_create(
    char *id,
    char *name,
    char *reason
    ) {
    quality_component_issue_t *result = quality_component_issue_create_internal (
        id,
        name,
        reason
        );
    if (!result) {
    }
    return result;
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

    char *id_local_str = NULL;

    char *name_local_str = NULL;

    char *reason_local_str = NULL;

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


    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);
    if (reason && !cJSON_IsNull(reason)) reason_local_str = strdup(reason->valuestring);

    quality_component_issue_local_var = quality_component_issue_create_internal (
        id_local_str,
        name_local_str,
        reason_local_str
        );

    if (!quality_component_issue_local_var) {
        goto end;
    }

    return quality_component_issue_local_var;
end:
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (reason_local_str) {
        free(reason_local_str);
        reason_local_str = NULL;
    }
    return NULL;

}
