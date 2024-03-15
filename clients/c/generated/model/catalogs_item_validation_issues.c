#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_item_validation_issues.h"



catalogs_item_validation_issues_t *catalogs_item_validation_issues_create(
    int item_number,
    char *item_id,
    catalogs_item_validation_errors_t *errors,
    catalogs_item_validation_warnings_t *warnings
    ) {
    catalogs_item_validation_issues_t *catalogs_item_validation_issues_local_var = malloc(sizeof(catalogs_item_validation_issues_t));
    if (!catalogs_item_validation_issues_local_var) {
        return NULL;
    }
    catalogs_item_validation_issues_local_var->item_number = item_number;
    catalogs_item_validation_issues_local_var->item_id = item_id;
    catalogs_item_validation_issues_local_var->errors = errors;
    catalogs_item_validation_issues_local_var->warnings = warnings;

    return catalogs_item_validation_issues_local_var;
}


void catalogs_item_validation_issues_free(catalogs_item_validation_issues_t *catalogs_item_validation_issues) {
    if(NULL == catalogs_item_validation_issues){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_item_validation_issues->item_id) {
        free(catalogs_item_validation_issues->item_id);
        catalogs_item_validation_issues->item_id = NULL;
    }
    if (catalogs_item_validation_issues->errors) {
        catalogs_item_validation_errors_free(catalogs_item_validation_issues->errors);
        catalogs_item_validation_issues->errors = NULL;
    }
    if (catalogs_item_validation_issues->warnings) {
        catalogs_item_validation_warnings_free(catalogs_item_validation_issues->warnings);
        catalogs_item_validation_issues->warnings = NULL;
    }
    free(catalogs_item_validation_issues);
}

cJSON *catalogs_item_validation_issues_convertToJSON(catalogs_item_validation_issues_t *catalogs_item_validation_issues) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_item_validation_issues->item_number
    if (!catalogs_item_validation_issues->item_number) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "item_number", catalogs_item_validation_issues->item_number) == NULL) {
    goto fail; //Numeric
    }


    // catalogs_item_validation_issues->item_id
    if (!catalogs_item_validation_issues->item_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "item_id", catalogs_item_validation_issues->item_id) == NULL) {
    goto fail; //String
    }


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

    // define the local variable for catalogs_item_validation_issues->warnings
    catalogs_item_validation_warnings_t *warnings_local_nonprim = NULL;

    // catalogs_item_validation_issues->item_number
    cJSON *item_number = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_issuesJSON, "item_number");
    if (!item_number) {
        goto end;
    }

    
    if(!cJSON_IsNumber(item_number))
    {
    goto end; //Numeric
    }

    // catalogs_item_validation_issues->item_id
    cJSON *item_id = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_issuesJSON, "item_id");
    if (!item_id) {
        goto end;
    }

    
    if(!cJSON_IsString(item_id))
    {
    goto end; //String
    }

    // catalogs_item_validation_issues->errors
    cJSON *errors = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_issuesJSON, "errors");
    if (!errors) {
        goto end;
    }

    
    errors_local_nonprim = catalogs_item_validation_errors_parseFromJSON(errors); //nonprimitive

    // catalogs_item_validation_issues->warnings
    cJSON *warnings = cJSON_GetObjectItemCaseSensitive(catalogs_item_validation_issuesJSON, "warnings");
    if (!warnings) {
        goto end;
    }

    
    warnings_local_nonprim = catalogs_item_validation_warnings_parseFromJSON(warnings); //nonprimitive


    catalogs_item_validation_issues_local_var = catalogs_item_validation_issues_create (
        item_number->valuedouble,
        strdup(item_id->valuestring),
        errors_local_nonprim,
        warnings_local_nonprim
        );

    return catalogs_item_validation_issues_local_var;
end:
    if (errors_local_nonprim) {
        catalogs_item_validation_errors_free(errors_local_nonprim);
        errors_local_nonprim = NULL;
    }
    if (warnings_local_nonprim) {
        catalogs_item_validation_warnings_free(warnings_local_nonprim);
        warnings_local_nonprim = NULL;
    }
    return NULL;

}
