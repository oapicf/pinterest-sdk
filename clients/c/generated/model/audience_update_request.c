#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audience_update_request.h"



static audience_update_request_t *audience_update_request_create_internal(
    char *ad_account_id,
    char *name,
    audience_rule_t *rule,
    char *description,
    pinterest_rest_api_audience_update_operation_type__e operation_type
    ) {
    audience_update_request_t *audience_update_request_local_var = malloc(sizeof(audience_update_request_t));
    if (!audience_update_request_local_var) {
        return NULL;
    }
    audience_update_request_local_var->ad_account_id = ad_account_id;
    audience_update_request_local_var->name = name;
    audience_update_request_local_var->rule = rule;
    audience_update_request_local_var->description = description;
    audience_update_request_local_var->operation_type = operation_type;

    audience_update_request_local_var->_library_owned = 1;
    return audience_update_request_local_var;
}

__attribute__((deprecated)) audience_update_request_t *audience_update_request_create(
    char *ad_account_id,
    char *name,
    audience_rule_t *rule,
    char *description,
    pinterest_rest_api_audience_update_operation_type__e operation_type
    ) {
    return audience_update_request_create_internal (
        ad_account_id,
        name,
        rule,
        description,
        operation_type
        );
}

void audience_update_request_free(audience_update_request_t *audience_update_request) {
    if(NULL == audience_update_request){
        return ;
    }
    if(audience_update_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "audience_update_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (audience_update_request->ad_account_id) {
        free(audience_update_request->ad_account_id);
        audience_update_request->ad_account_id = NULL;
    }
    if (audience_update_request->name) {
        free(audience_update_request->name);
        audience_update_request->name = NULL;
    }
    if (audience_update_request->rule) {
        audience_rule_free(audience_update_request->rule);
        audience_update_request->rule = NULL;
    }
    if (audience_update_request->description) {
        free(audience_update_request->description);
        audience_update_request->description = NULL;
    }
    free(audience_update_request);
}

cJSON *audience_update_request_convertToJSON(audience_update_request_t *audience_update_request) {
    cJSON *item = cJSON_CreateObject();

    // audience_update_request->ad_account_id
    if(audience_update_request->ad_account_id) {
    if(cJSON_AddStringToObject(item, "ad_account_id", audience_update_request->ad_account_id) == NULL) {
    goto fail; //String
    }
    }


    // audience_update_request->name
    if(audience_update_request->name) {
    if(cJSON_AddStringToObject(item, "name", audience_update_request->name) == NULL) {
    goto fail; //String
    }
    }


    // audience_update_request->rule
    if(audience_update_request->rule) {
    cJSON *rule_local_JSON = audience_rule_convertToJSON(audience_update_request->rule);
    if(rule_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "rule", rule_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // audience_update_request->description
    if(audience_update_request->description) {
    if(cJSON_AddStringToObject(item, "description", audience_update_request->description) == NULL) {
    goto fail; //String
    }
    }


    // audience_update_request->operation_type
    if(audience_update_request->operation_type != pinterest_rest_api_audience_update_operation_type__NULL) {
    cJSON *operation_type_local_JSON = audience_update_operation_type_convertToJSON(audience_update_request->operation_type);
    if(operation_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "operation_type", operation_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

audience_update_request_t *audience_update_request_parseFromJSON(cJSON *audience_update_requestJSON){

    audience_update_request_t *audience_update_request_local_var = NULL;

    // define the local variable for audience_update_request->rule
    audience_rule_t *rule_local_nonprim = NULL;

    // define the local variable for audience_update_request->operation_type
    pinterest_rest_api_audience_update_operation_type__e operation_type_local_nonprim = 0;

    // audience_update_request->ad_account_id
    cJSON *ad_account_id = cJSON_GetObjectItemCaseSensitive(audience_update_requestJSON, "ad_account_id");
    if (cJSON_IsNull(ad_account_id)) {
        ad_account_id = NULL;
    }
    if (ad_account_id) { 
    if(!cJSON_IsString(ad_account_id) && !cJSON_IsNull(ad_account_id))
    {
    goto end; //String
    }
    }

    // audience_update_request->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(audience_update_requestJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // audience_update_request->rule
    cJSON *rule = cJSON_GetObjectItemCaseSensitive(audience_update_requestJSON, "rule");
    if (cJSON_IsNull(rule)) {
        rule = NULL;
    }
    if (rule) { 
    rule_local_nonprim = audience_rule_parseFromJSON(rule); //nonprimitive
    }

    // audience_update_request->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(audience_update_requestJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // audience_update_request->operation_type
    cJSON *operation_type = cJSON_GetObjectItemCaseSensitive(audience_update_requestJSON, "operation_type");
    if (cJSON_IsNull(operation_type)) {
        operation_type = NULL;
    }
    if (operation_type) { 
    operation_type_local_nonprim = audience_update_operation_type_parseFromJSON(operation_type); //custom
    }


    audience_update_request_local_var = audience_update_request_create_internal (
        ad_account_id && !cJSON_IsNull(ad_account_id) ? strdup(ad_account_id->valuestring) : NULL,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        rule ? rule_local_nonprim : NULL,
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        operation_type ? operation_type_local_nonprim : 0
        );

    return audience_update_request_local_var;
end:
    if (rule_local_nonprim) {
        audience_rule_free(rule_local_nonprim);
        rule_local_nonprim = NULL;
    }
    if (operation_type_local_nonprim) {
        operation_type_local_nonprim = 0;
    }
    return NULL;

}
