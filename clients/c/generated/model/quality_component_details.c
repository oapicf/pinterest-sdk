#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "quality_component_details.h"



static quality_component_details_t *quality_component_details_create_internal(
    double coverage,
    list_t *issues,
    double overlap
    ) {
    quality_component_details_t *quality_component_details_local_var = malloc(sizeof(quality_component_details_t));
    if (!quality_component_details_local_var) {
        return NULL;
    }
    quality_component_details_local_var->coverage = coverage;
    quality_component_details_local_var->issues = issues;
    quality_component_details_local_var->overlap = overlap;

    quality_component_details_local_var->_library_owned = 1;
    return quality_component_details_local_var;
}

__attribute__((deprecated)) quality_component_details_t *quality_component_details_create(
    double coverage,
    list_t *issues,
    double overlap
    ) {
    return quality_component_details_create_internal (
        coverage,
        issues,
        overlap
        );
}

void quality_component_details_free(quality_component_details_t *quality_component_details) {
    if(NULL == quality_component_details){
        return ;
    }
    if(quality_component_details->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "quality_component_details_free");
        return ;
    }
    listEntry_t *listEntry;
    if (quality_component_details->issues) {
        list_ForEach(listEntry, quality_component_details->issues) {
            quality_component_issue_free(listEntry->data);
        }
        list_freeList(quality_component_details->issues);
        quality_component_details->issues = NULL;
    }
    free(quality_component_details);
}

cJSON *quality_component_details_convertToJSON(quality_component_details_t *quality_component_details) {
    cJSON *item = cJSON_CreateObject();

    // quality_component_details->coverage
    if (!quality_component_details->coverage) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "coverage", quality_component_details->coverage) == NULL) {
    goto fail; //Numeric
    }


    // quality_component_details->issues
    if(quality_component_details->issues) {
    cJSON *issues = cJSON_AddArrayToObject(item, "issues");
    if(issues == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *issuesListEntry;
    if (quality_component_details->issues) {
    list_ForEach(issuesListEntry, quality_component_details->issues) {
    cJSON *itemLocal = quality_component_issue_convertToJSON(issuesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(issues, itemLocal);
    }
    }
    }


    // quality_component_details->overlap
    if(quality_component_details->overlap) {
    if(cJSON_AddNumberToObject(item, "overlap", quality_component_details->overlap) == NULL) {
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

quality_component_details_t *quality_component_details_parseFromJSON(cJSON *quality_component_detailsJSON){

    quality_component_details_t *quality_component_details_local_var = NULL;

    // define the local list for quality_component_details->issues
    list_t *issuesList = NULL;

    // quality_component_details->coverage
    cJSON *coverage = cJSON_GetObjectItemCaseSensitive(quality_component_detailsJSON, "coverage");
    if (cJSON_IsNull(coverage)) {
        coverage = NULL;
    }
    if (!coverage) {
        goto end;
    }

    
    if(!cJSON_IsNumber(coverage))
    {
    goto end; //Numeric
    }

    // quality_component_details->issues
    cJSON *issues = cJSON_GetObjectItemCaseSensitive(quality_component_detailsJSON, "issues");
    if (cJSON_IsNull(issues)) {
        issues = NULL;
    }
    if (issues) { 
    cJSON *issues_local_nonprimitive = NULL;
    if(!cJSON_IsArray(issues)){
        goto end; //nonprimitive container
    }

    issuesList = list_createList();

    cJSON_ArrayForEach(issues_local_nonprimitive,issues )
    {
        if(!cJSON_IsObject(issues_local_nonprimitive)){
            goto end;
        }
        quality_component_issue_t *issuesItem = quality_component_issue_parseFromJSON(issues_local_nonprimitive);

        list_addElement(issuesList, issuesItem);
    }
    }

    // quality_component_details->overlap
    cJSON *overlap = cJSON_GetObjectItemCaseSensitive(quality_component_detailsJSON, "overlap");
    if (cJSON_IsNull(overlap)) {
        overlap = NULL;
    }
    if (overlap) { 
    if(!cJSON_IsNumber(overlap))
    {
    goto end; //Numeric
    }
    }


    quality_component_details_local_var = quality_component_details_create_internal (
        coverage->valuedouble,
        issues ? issuesList : NULL,
        overlap ? overlap->valuedouble : 0
        );

    return quality_component_details_local_var;
end:
    if (issuesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, issuesList) {
            quality_component_issue_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(issuesList);
        issuesList = NULL;
    }
    return NULL;

}
