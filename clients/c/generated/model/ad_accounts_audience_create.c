#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_accounts_audience_create.h"



static ad_accounts_audience_create_t *ad_accounts_audience_create_create_internal(
    char *ad_account_id,
    audience_type_t *audience_type,
    char *description,
    char *name,
    ad_accounts_audience_rule_t *rule
    ) {
    ad_accounts_audience_create_t *ad_accounts_audience_create_local_var = malloc(sizeof(ad_accounts_audience_create_t));
    if (!ad_accounts_audience_create_local_var) {
        return NULL;
    }
    memset(ad_accounts_audience_create_local_var, 0, sizeof(ad_accounts_audience_create_t));
    ad_accounts_audience_create_local_var->_library_owned = 1;
    ad_accounts_audience_create_local_var->ad_account_id = ad_account_id;
    ad_accounts_audience_create_local_var->audience_type = audience_type;
    ad_accounts_audience_create_local_var->description = description;
    ad_accounts_audience_create_local_var->name = name;
    ad_accounts_audience_create_local_var->rule = rule;
    return ad_accounts_audience_create_local_var;
}

__attribute__((deprecated)) ad_accounts_audience_create_t *ad_accounts_audience_create_create(
    char *ad_account_id,
    audience_type_t *audience_type,
    char *description,
    char *name,
    ad_accounts_audience_rule_t *rule
    ) {
    ad_accounts_audience_create_t *result = ad_accounts_audience_create_create_internal (
        ad_account_id,
        audience_type,
        description,
        name,
        rule
        );
    if (!result) {
    }
    return result;
}

void ad_accounts_audience_create_free(ad_accounts_audience_create_t *ad_accounts_audience_create) {
    if(NULL == ad_accounts_audience_create){
        return ;
    }
    if(ad_accounts_audience_create->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ad_accounts_audience_create_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ad_accounts_audience_create->ad_account_id) {
        free(ad_accounts_audience_create->ad_account_id);
        ad_accounts_audience_create->ad_account_id = NULL;
    }
    if (ad_accounts_audience_create->audience_type) {
        audience_type_free(ad_accounts_audience_create->audience_type);
        ad_accounts_audience_create->audience_type = NULL;
    }
    if (ad_accounts_audience_create->description) {
        free(ad_accounts_audience_create->description);
        ad_accounts_audience_create->description = NULL;
    }
    if (ad_accounts_audience_create->name) {
        free(ad_accounts_audience_create->name);
        ad_accounts_audience_create->name = NULL;
    }
    if (ad_accounts_audience_create->rule) {
        ad_accounts_audience_rule_free(ad_accounts_audience_create->rule);
        ad_accounts_audience_create->rule = NULL;
    }
    free(ad_accounts_audience_create);
}

cJSON *ad_accounts_audience_create_convertToJSON(ad_accounts_audience_create_t *ad_accounts_audience_create) {
    cJSON *item = cJSON_CreateObject();

    // ad_accounts_audience_create->ad_account_id
    if(ad_accounts_audience_create->ad_account_id) {
    if(cJSON_AddStringToObject(item, "ad_account_id", ad_accounts_audience_create->ad_account_id) == NULL) {
    goto fail; //String
    }
    }


    // ad_accounts_audience_create->audience_type
    if(ad_accounts_audience_create->audience_type) {
    cJSON *audience_type_local_JSON = audience_type_convertToJSON(ad_accounts_audience_create->audience_type);
    if(audience_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "audience_type", audience_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_accounts_audience_create->description
    if(ad_accounts_audience_create->description) {
    if(cJSON_AddStringToObject(item, "description", ad_accounts_audience_create->description) == NULL) {
    goto fail; //String
    }
    }


    // ad_accounts_audience_create->name
    if(ad_accounts_audience_create->name) {
    if(cJSON_AddStringToObject(item, "name", ad_accounts_audience_create->name) == NULL) {
    goto fail; //String
    }
    }


    // ad_accounts_audience_create->rule
    if(ad_accounts_audience_create->rule) {
    cJSON *rule_local_JSON = ad_accounts_audience_rule_convertToJSON(ad_accounts_audience_create->rule);
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

ad_accounts_audience_create_t *ad_accounts_audience_create_parseFromJSON(cJSON *ad_accounts_audience_createJSON){

    ad_accounts_audience_create_t *ad_accounts_audience_create_local_var = NULL;

    char *ad_account_id_local_str = NULL;

    // define the local variable for ad_accounts_audience_create->audience_type
    audience_type_t *audience_type_local_nonprim = NULL;

    char *description_local_str = NULL;

    char *name_local_str = NULL;

    // define the local variable for ad_accounts_audience_create->rule
    ad_accounts_audience_rule_t *rule_local_nonprim = NULL;

    // ad_accounts_audience_create->ad_account_id
    cJSON *ad_account_id = cJSON_GetObjectItemCaseSensitive(ad_accounts_audience_createJSON, "ad_account_id");
    if (cJSON_IsNull(ad_account_id)) {
        ad_account_id = NULL;
    }
    if (ad_account_id) { 
    if(!cJSON_IsString(ad_account_id) && !cJSON_IsNull(ad_account_id))
    {
    goto end; //String
    }
    }

    // ad_accounts_audience_create->audience_type
    cJSON *audience_type = cJSON_GetObjectItemCaseSensitive(ad_accounts_audience_createJSON, "audience_type");
    if (cJSON_IsNull(audience_type)) {
        audience_type = NULL;
    }
    if (audience_type) { 
    audience_type_local_nonprim = audience_type_parseFromJSON(audience_type); //custom
    }

    // ad_accounts_audience_create->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(ad_accounts_audience_createJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // ad_accounts_audience_create->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(ad_accounts_audience_createJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // ad_accounts_audience_create->rule
    cJSON *rule = cJSON_GetObjectItemCaseSensitive(ad_accounts_audience_createJSON, "rule");
    if (cJSON_IsNull(rule)) {
        rule = NULL;
    }
    if (rule) { 
    rule_local_nonprim = ad_accounts_audience_rule_parseFromJSON(rule); //nonprimitive
    }


    if (ad_account_id && !cJSON_IsNull(ad_account_id)) ad_account_id_local_str = strdup(ad_account_id->valuestring);
    if (description && !cJSON_IsNull(description)) description_local_str = strdup(description->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    ad_accounts_audience_create_local_var = ad_accounts_audience_create_create_internal (
        ad_account_id_local_str,
        audience_type ? audience_type_local_nonprim : NULL,
        description_local_str,
        name_local_str,
        rule ? rule_local_nonprim : NULL
        );

    if (!ad_accounts_audience_create_local_var) {
        goto end;
    }

    return ad_accounts_audience_create_local_var;
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
    if (rule_local_nonprim) {
        ad_accounts_audience_rule_free(rule_local_nonprim);
        rule_local_nonprim = NULL;
    }
    return NULL;

}
