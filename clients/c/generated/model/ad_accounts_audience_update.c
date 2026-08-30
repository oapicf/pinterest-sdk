#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_accounts_audience_update.h"



static ad_accounts_audience_update_t *ad_accounts_audience_update_create_internal(
    char *ad_account_id,
    audience_type_t *audience_type,
    char *description,
    char *name,
    audience_update_operation_type_t *operation_type,
    ad_accounts_audience_rule_t *rule
    ) {
    ad_accounts_audience_update_t *ad_accounts_audience_update_local_var = malloc(sizeof(ad_accounts_audience_update_t));
    if (!ad_accounts_audience_update_local_var) {
        return NULL;
    }
    memset(ad_accounts_audience_update_local_var, 0, sizeof(ad_accounts_audience_update_t));
    ad_accounts_audience_update_local_var->_library_owned = 1;
    ad_accounts_audience_update_local_var->ad_account_id = ad_account_id;
    ad_accounts_audience_update_local_var->audience_type = audience_type;
    ad_accounts_audience_update_local_var->description = description;
    ad_accounts_audience_update_local_var->name = name;
    ad_accounts_audience_update_local_var->operation_type = operation_type;
    ad_accounts_audience_update_local_var->rule = rule;
    return ad_accounts_audience_update_local_var;
}

__attribute__((deprecated)) ad_accounts_audience_update_t *ad_accounts_audience_update_create(
    char *ad_account_id,
    audience_type_t *audience_type,
    char *description,
    char *name,
    audience_update_operation_type_t *operation_type,
    ad_accounts_audience_rule_t *rule
    ) {
    ad_accounts_audience_update_t *result = ad_accounts_audience_update_create_internal (
        ad_account_id,
        audience_type,
        description,
        name,
        operation_type,
        rule
        );
    if (!result) {
    }
    return result;
}

void ad_accounts_audience_update_free(ad_accounts_audience_update_t *ad_accounts_audience_update) {
    if(NULL == ad_accounts_audience_update){
        return ;
    }
    if(ad_accounts_audience_update->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ad_accounts_audience_update_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ad_accounts_audience_update->ad_account_id) {
        free(ad_accounts_audience_update->ad_account_id);
        ad_accounts_audience_update->ad_account_id = NULL;
    }
    if (ad_accounts_audience_update->audience_type) {
        audience_type_free(ad_accounts_audience_update->audience_type);
        ad_accounts_audience_update->audience_type = NULL;
    }
    if (ad_accounts_audience_update->description) {
        free(ad_accounts_audience_update->description);
        ad_accounts_audience_update->description = NULL;
    }
    if (ad_accounts_audience_update->name) {
        free(ad_accounts_audience_update->name);
        ad_accounts_audience_update->name = NULL;
    }
    if (ad_accounts_audience_update->operation_type) {
        audience_update_operation_type_free(ad_accounts_audience_update->operation_type);
        ad_accounts_audience_update->operation_type = NULL;
    }
    if (ad_accounts_audience_update->rule) {
        ad_accounts_audience_rule_free(ad_accounts_audience_update->rule);
        ad_accounts_audience_update->rule = NULL;
    }
    free(ad_accounts_audience_update);
}

cJSON *ad_accounts_audience_update_convertToJSON(ad_accounts_audience_update_t *ad_accounts_audience_update) {
    cJSON *item = cJSON_CreateObject();

    // ad_accounts_audience_update->ad_account_id
    if(ad_accounts_audience_update->ad_account_id) {
    if(cJSON_AddStringToObject(item, "ad_account_id", ad_accounts_audience_update->ad_account_id) == NULL) {
    goto fail; //String
    }
    }


    // ad_accounts_audience_update->audience_type
    if(ad_accounts_audience_update->audience_type) {
    cJSON *audience_type_local_JSON = audience_type_convertToJSON(ad_accounts_audience_update->audience_type);
    if(audience_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "audience_type", audience_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_accounts_audience_update->description
    if(ad_accounts_audience_update->description) {
    if(cJSON_AddStringToObject(item, "description", ad_accounts_audience_update->description) == NULL) {
    goto fail; //String
    }
    }


    // ad_accounts_audience_update->name
    if(ad_accounts_audience_update->name) {
    if(cJSON_AddStringToObject(item, "name", ad_accounts_audience_update->name) == NULL) {
    goto fail; //String
    }
    }


    // ad_accounts_audience_update->operation_type
    if(ad_accounts_audience_update->operation_type) {
    cJSON *operation_type_local_JSON = audience_update_operation_type_convertToJSON(ad_accounts_audience_update->operation_type);
    if(operation_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "operation_type", operation_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_accounts_audience_update->rule
    if(ad_accounts_audience_update->rule) {
    cJSON *rule_local_JSON = ad_accounts_audience_rule_convertToJSON(ad_accounts_audience_update->rule);
    if(rule_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "rule", rule_local_JSON);
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

ad_accounts_audience_update_t *ad_accounts_audience_update_parseFromJSON(cJSON *ad_accounts_audience_updateJSON){

    ad_accounts_audience_update_t *ad_accounts_audience_update_local_var = NULL;

    char *ad_account_id_local_str = NULL;

    // define the local variable for ad_accounts_audience_update->audience_type
    audience_type_t *audience_type_local_nonprim = NULL;

    char *description_local_str = NULL;

    char *name_local_str = NULL;

    // define the local variable for ad_accounts_audience_update->operation_type
    audience_update_operation_type_t *operation_type_local_nonprim = NULL;

    // define the local variable for ad_accounts_audience_update->rule
    ad_accounts_audience_rule_t *rule_local_nonprim = NULL;

    // ad_accounts_audience_update->ad_account_id
    cJSON *ad_account_id = cJSON_GetObjectItemCaseSensitive(ad_accounts_audience_updateJSON, "ad_account_id");
    if (cJSON_IsNull(ad_account_id)) {
        ad_account_id = NULL;
    }
    if (ad_account_id) { 
    if(!cJSON_IsString(ad_account_id) && !cJSON_IsNull(ad_account_id))
    {
    goto end; //String
    }
    }

    // ad_accounts_audience_update->audience_type
    cJSON *audience_type = cJSON_GetObjectItemCaseSensitive(ad_accounts_audience_updateJSON, "audience_type");
    if (cJSON_IsNull(audience_type)) {
        audience_type = NULL;
    }
    if (audience_type) { 
    audience_type_local_nonprim = audience_type_parseFromJSON(audience_type); //custom
    }

    // ad_accounts_audience_update->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(ad_accounts_audience_updateJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // ad_accounts_audience_update->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(ad_accounts_audience_updateJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // ad_accounts_audience_update->operation_type
    cJSON *operation_type = cJSON_GetObjectItemCaseSensitive(ad_accounts_audience_updateJSON, "operation_type");
    if (cJSON_IsNull(operation_type)) {
        operation_type = NULL;
    }
    if (operation_type) { 
    operation_type_local_nonprim = audience_update_operation_type_parseFromJSON(operation_type); //custom
    }

    // ad_accounts_audience_update->rule
    cJSON *rule = cJSON_GetObjectItemCaseSensitive(ad_accounts_audience_updateJSON, "rule");
    if (cJSON_IsNull(rule)) {
        rule = NULL;
    }
    if (rule) { 
    rule_local_nonprim = ad_accounts_audience_rule_parseFromJSON(rule); //nonprimitive
    }


    if (ad_account_id && !cJSON_IsNull(ad_account_id)) ad_account_id_local_str = strdup(ad_account_id->valuestring);
    if (description && !cJSON_IsNull(description)) description_local_str = strdup(description->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    ad_accounts_audience_update_local_var = ad_accounts_audience_update_create_internal (
        ad_account_id_local_str,
        audience_type ? audience_type_local_nonprim : NULL,
        description_local_str,
        name_local_str,
        operation_type ? operation_type_local_nonprim : NULL,
        rule ? rule_local_nonprim : NULL
        );

    if (!ad_accounts_audience_update_local_var) {
        goto end;
    }

    return ad_accounts_audience_update_local_var;
end:
    if (ad_account_id_local_str) {
        free(ad_account_id_local_str);
        ad_account_id_local_str = NULL;
    }
    if (audience_type_local_nonprim) {
        audience_type_free(audience_type_local_nonprim);
        audience_type_local_nonprim = NULL;
    }
    if (description_local_str) {
        free(description_local_str);
        description_local_str = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (operation_type_local_nonprim) {
        audience_update_operation_type_free(operation_type_local_nonprim);
        operation_type_local_nonprim = NULL;
    }
    if (rule_local_nonprim) {
        ad_accounts_audience_rule_free(rule_local_nonprim);
        rule_local_nonprim = NULL;
    }
    return NULL;

}
