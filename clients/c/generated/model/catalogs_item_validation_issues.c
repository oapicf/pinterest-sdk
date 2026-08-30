#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_item_validation_issues.h"



static catalogs_item_validation_issues_t *catalogs_item_validation_issues_create_internal(
    catalogs_item_validation_errors_t *errors,
    char *item_id,
    int *item_number,
    catalogs_item_validation_warnings_t *warnings
    ) {
    catalogs_item_validation_issues_t *catalogs_item_validation_issues_local_var = malloc(sizeof(catalogs_item_validation_issues_t));
    if (!catalogs_item_validation_issues_local_var) {
        return NULL;
    }
    memset(catalogs_item_validation_issues_local_var, 0, sizeof(catalogs_item_validation_issues_t));
    catalogs_item_validation_issues_local_var->_library_owned = 1;
    catalogs_item_validation_issues_local_var->errors = errors;
    catalogs_item_validation_issues_local_var->item_id = item_id;
    catalogs_item_validation_issues_local_var->item_number = item_number;
    catalogs_item_validation_issues_local_var->warnings = warnings;
    return catalogs_item_validation_issues_local_var;
}

__attribute__((deprecated)) catalogs_item_validation_issues_t *catalogs_item_validation_issues_create(
    catalogs_item_validation_errors_t *errors,
    char *item_id,
    int *item_number,
    catalogs_item_validation_warnings_t *warnings
    ) {
    int *item_number_copy = NULL;
    if (item_number) {
        item_number_copy = malloc(sizeof(int));
        if (item_number_copy) *item_number_copy = *item_number;
    }
    catalogs_item_validation_issues_t *result = catalogs_item_validation_issues_create_internal (
        errors,
        item_id,
        item_number_copy,
        warnings
        );
    if (!result) {
        free(item_number_copy);
    }
    return result;
}

void catalogs_item_validation_issues_free(catalogs_item_validation_issues_t *catalogs_item_validation_issues) {
    if(NULL == catalogs_item_validation_issues){
        return ;
    }
    if(catalogs_item_validation_issues->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_item_validation_issues_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_item_validation_issues->errors) {
        catalogs_item_validation_errors_free(catalogs_item_validation_issues->errors);
        catalogs_item_validation_issues->errors = NULL;
    }
    if (catalogs_item_validation_issues->item_id) {
        free(catalogs_item_validation_issues->item_id);
        catalogs_item_validation_issues->item_id = NULL;
    }
    if (catalogs_item_validation_issues->item_number) {
        free(catalogs_item_validation_issues->item_number);
        catalogs_item_validation_issues->item_number = NULL;
    }
    if (catalogs_item_validation_issues->warnings) {
        catalogs_item_validation_warnings_free(catalogs_item_validation_issues->warnings);
        catalogs_item_validation_issues->warnings = NULL;
    }
    free(catalogs_item_validation_issues);
}

cJSON *catalogs_item_validation_issues_convertToJSON(catalogs_item_validation_issues_t *catalogs_item_validation_issues) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_item_validation_issues->errors
    if (!catalogs_item_validation_issues->errors) {
        goto fail;
    }
    cJSON *errors_local_JSON = catalogs_item_validation_errors_convertToJSON(catalogs_item_validation_issues->errors);
    if(errors_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "errors", errors_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_item_validation_issues->item_id
    if (!catalogs_item_validation_issues->item_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "item_id", catalogs_item_validation_issues->item_id) == NULL) {
    goto fail; //String
    }


    // catalogs_item_validation_issues->item_number
    if (!catalogs_item_validation_issues->item_number) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "item_number", *catalogs_item_validation_issues->item_number) == NULL) {
    goto fail; //Numeric
    }


    // catalogs_item_validation_issues->warnings
    if (!catalogs_item_validation_issues->warnings) {
        goto fail;
    }
    cJSON *warnings_local_JSON = catalogs_item_validation_warnings_convertToJSON(catalogs_item_validation_issues->warnings);
    if(warnings_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "warnings", warnings_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_item_validation_issues_t *catalogs_item_validation_issues_parseFromJSON(cJSON *catalogs_item_validation_issuesJSON){

    catalogs_item_validation_issues_t *catalogs_item_validation_issues_local_var = NULL;

    // define the local variable for catalogs_item_validation_issues->errors
    catalogs_item_validation_errors_t *errors_local_nonprim = NULL;

    char *item_id_local_str = NULL;

    // define the local variable for catalogs_item_validation_issues->item_number
    int *item_number_local_var = NULL;

    // define the local variable for catalogs_item_validation_issues->warnings
    catalogs_item_validation_warnings_t *warnings_local_nonprim = NULL;

    // catalogs_item_validation_issues->errors
    cJSON *errors = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_issuesJSON, "errors");
    if (cJSON_IsNull(errors)) {
        errors = NULL;
    }
    if (!errors) {
        goto end;
    }

    
    errors_local_nonprim = catalogs_item_validation_errors_parseFromJSON(errors); //nonprimitive

    // catalogs_item_validation_issues->item_id
    cJSON *item_id = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_issuesJSON, "item_id");
    if (cJSON_IsNull(item_id)) {
        item_id = NULL;
    }
    if (!item_id) {
        goto end;
    }

    
    if(!cJSON_IsString(item_id))
    {
    goto end; //String
    }

    // catalogs_item_validation_issues->item_number
    cJSON *item_number = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_issuesJSON, "item_number");
    if (cJSON_IsNull(item_number)) {
        item_number = NULL;
    }
    if (!item_number) {
        goto end;
    }

    
    if(!cJSON_IsNumber(item_number))
    {
    goto end; //Numeric
    }
    item_number_local_var = malloc(sizeof(int));
    if(!item_number_local_var)
    {
        goto end;
    }
    *item_number_local_var = item_number->valuedouble;

    // catalogs_item_validation_issues->warnings
    cJSON *warnings = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_issuesJSON, "warnings");
    if (cJSON_IsNull(warnings)) {
        warnings = NULL;
    }
    if (!warnings) {
        goto end;
    }

    
    warnings_local_nonprim = catalogs_item_validation_warnings_parseFromJSON(warnings); //nonprimitive


    if (item_id && !cJSON_IsNull(item_id)) item_id_local_str = strdup(item_id->valuestring);

    catalogs_item_validation_issues_local_var = catalogs_item_validation_issues_create_internal (
        errors_local_nonprim,
        item_id_local_str,
        item_number_local_var,
        warnings_local_nonprim
        );

    if (!catalogs_item_validation_issues_local_var) {
        goto end;
    }

    return catalogs_item_validation_issues_local_var;
end:
    if (errors_local_nonprim) {
        catalogs_item_validation_errors_free(errors_local_nonprim);
        errors_local_nonprim = NULL;
    }
    if (item_id_local_str) {
        free(item_id_local_str);
        item_id_local_str = NULL;
    }
    if (item_number_local_var) {
        free(item_number_local_var);
        item_number_local_var = NULL;
    }
    if (warnings_local_nonprim) {
        catalogs_item_validation_warnings_free(warnings_local_nonprim);
        warnings_local_nonprim = NULL;
    }
    return NULL;

}
