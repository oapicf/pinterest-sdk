#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_accounts_audience.h"



static ad_accounts_audience_t *ad_accounts_audience_create_internal(
    char *ad_account_id,
    audience_type_t *audience_type,
    char *created_by_company_name,
    int *created_timestamp,
    char *description,
    char *id,
    int *is_nca,
    char *name,
    ad_accounts_audience_rule_t *rule,
    int *size,
    audience_status_t *status,
    char *type,
    int *updated_timestamp
    ) {
    ad_accounts_audience_t *ad_accounts_audience_local_var = malloc(sizeof(ad_accounts_audience_t));
    if (!ad_accounts_audience_local_var) {
        return NULL;
    }
    memset(ad_accounts_audience_local_var, 0, sizeof(ad_accounts_audience_t));
    ad_accounts_audience_local_var->_library_owned = 1;
    ad_accounts_audience_local_var->ad_account_id = ad_account_id;
    ad_accounts_audience_local_var->audience_type = audience_type;
    ad_accounts_audience_local_var->created_by_company_name = created_by_company_name;
    ad_accounts_audience_local_var->created_timestamp = created_timestamp;
    ad_accounts_audience_local_var->description = description;
    ad_accounts_audience_local_var->id = id;
    ad_accounts_audience_local_var->is_nca = is_nca;
    ad_accounts_audience_local_var->name = name;
    ad_accounts_audience_local_var->rule = rule;
    ad_accounts_audience_local_var->size = size;
    ad_accounts_audience_local_var->status = status;
    ad_accounts_audience_local_var->type = type;
    ad_accounts_audience_local_var->updated_timestamp = updated_timestamp;
    return ad_accounts_audience_local_var;
}

__attribute__((deprecated)) ad_accounts_audience_t *ad_accounts_audience_create(
    char *ad_account_id,
    audience_type_t *audience_type,
    char *created_by_company_name,
    int *created_timestamp,
    char *description,
    char *id,
    int *is_nca,
    char *name,
    ad_accounts_audience_rule_t *rule,
    int *size,
    audience_status_t *status,
    char *type,
    int *updated_timestamp
    ) {
    int *created_timestamp_copy = NULL;
    if (created_timestamp) {
        created_timestamp_copy = malloc(sizeof(int));
        if (created_timestamp_copy) *created_timestamp_copy = *created_timestamp;
    }
    int *is_nca_copy = NULL;
    if (is_nca) {
        is_nca_copy = malloc(sizeof(int));
        if (is_nca_copy) *is_nca_copy = *is_nca;
    }
    int *size_copy = NULL;
    if (size) {
        size_copy = malloc(sizeof(int));
        if (size_copy) *size_copy = *size;
    }
    int *updated_timestamp_copy = NULL;
    if (updated_timestamp) {
        updated_timestamp_copy = malloc(sizeof(int));
        if (updated_timestamp_copy) *updated_timestamp_copy = *updated_timestamp;
    }
    ad_accounts_audience_t *result = ad_accounts_audience_create_internal (
        ad_account_id,
        audience_type,
        created_by_company_name,
        created_timestamp_copy,
        description,
        id,
        is_nca_copy,
        name,
        rule,
        size_copy,
        status,
        type,
        updated_timestamp_copy
        );
    if (!result) {
        free(created_timestamp_copy);
        free(is_nca_copy);
        free(size_copy);
        free(updated_timestamp_copy);
    }
    return result;
}

void ad_accounts_audience_free(ad_accounts_audience_t *ad_accounts_audience) {
    if(NULL == ad_accounts_audience){
        return ;
    }
    if(ad_accounts_audience->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ad_accounts_audience_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ad_accounts_audience->ad_account_id) {
        free(ad_accounts_audience->ad_account_id);
        ad_accounts_audience->ad_account_id = NULL;
    }
    if (ad_accounts_audience->audience_type) {
        audience_type_free(ad_accounts_audience->audience_type);
        ad_accounts_audience->audience_type = NULL;
    }
    if (ad_accounts_audience->created_by_company_name) {
        free(ad_accounts_audience->created_by_company_name);
        ad_accounts_audience->created_by_company_name = NULL;
    }
    if (ad_accounts_audience->created_timestamp) {
        free(ad_accounts_audience->created_timestamp);
        ad_accounts_audience->created_timestamp = NULL;
    }
    if (ad_accounts_audience->description) {
        free(ad_accounts_audience->description);
        ad_accounts_audience->description = NULL;
    }
    if (ad_accounts_audience->id) {
        free(ad_accounts_audience->id);
        ad_accounts_audience->id = NULL;
    }
    if (ad_accounts_audience->is_nca) {
        free(ad_accounts_audience->is_nca);
        ad_accounts_audience->is_nca = NULL;
    }
    if (ad_accounts_audience->name) {
        free(ad_accounts_audience->name);
        ad_accounts_audience->name = NULL;
    }
    if (ad_accounts_audience->rule) {
        ad_accounts_audience_rule_free(ad_accounts_audience->rule);
        ad_accounts_audience->rule = NULL;
    }
    if (ad_accounts_audience->size) {
        free(ad_accounts_audience->size);
        ad_accounts_audience->size = NULL;
    }
    if (ad_accounts_audience->status) {
        audience_status_free(ad_accounts_audience->status);
        ad_accounts_audience->status = NULL;
    }
    if (ad_accounts_audience->type) {
        free(ad_accounts_audience->type);
        ad_accounts_audience->type = NULL;
    }
    if (ad_accounts_audience->updated_timestamp) {
        free(ad_accounts_audience->updated_timestamp);
        ad_accounts_audience->updated_timestamp = NULL;
    }
    free(ad_accounts_audience);
}

cJSON *ad_accounts_audience_convertToJSON(ad_accounts_audience_t *ad_accounts_audience) {
    cJSON *item = cJSON_CreateObject();

    // ad_accounts_audience->ad_account_id
    if(ad_accounts_audience->ad_account_id) {
    if(cJSON_AddStringToObject(item, "ad_account_id", ad_accounts_audience->ad_account_id) == NULL) {
    goto fail; //String
    }
    }


    // ad_accounts_audience->audience_type
    if(ad_accounts_audience->audience_type) {
    cJSON *audience_type_local_JSON = audience_type_convertToJSON(ad_accounts_audience->audience_type);
    if(audience_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "audience_type", audience_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_accounts_audience->created_by_company_name
    if(ad_accounts_audience->created_by_company_name) {
    if(cJSON_AddStringToObject(item, "created_by_company_name", ad_accounts_audience->created_by_company_name) == NULL) {
    goto fail; //String
    }
    }


    // ad_accounts_audience->created_timestamp
    if(ad_accounts_audience->created_timestamp) {
    if(cJSON_AddNumberToObject(item, "created_timestamp", *ad_accounts_audience->created_timestamp) == NULL) {
    goto fail; //Numeric
    }
    }


    // ad_accounts_audience->description
    if(ad_accounts_audience->description) {
    if(cJSON_AddStringToObject(item, "description", ad_accounts_audience->description) == NULL) {
    goto fail; //String
    }
    }


    // ad_accounts_audience->id
    if (!ad_accounts_audience->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", ad_accounts_audience->id) == NULL) {
    goto fail; //String
    }


    // ad_accounts_audience->is_nca
    if(ad_accounts_audience->is_nca) {
    if(cJSON_AddBoolToObject(item, "is_nca", *ad_accounts_audience->is_nca) == NULL) {
    goto fail; //Bool
    }
    }


    // ad_accounts_audience->name
    if(ad_accounts_audience->name) {
    if(cJSON_AddStringToObject(item, "name", ad_accounts_audience->name) == NULL) {
    goto fail; //String
    }
    }


    // ad_accounts_audience->rule
    if(ad_accounts_audience->rule) {
    cJSON *rule_local_JSON = ad_accounts_audience_rule_convertToJSON(ad_accounts_audience->rule);
    if(rule_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "rule", rule_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // ad_accounts_audience->size
    if(ad_accounts_audience->size) {
    if(cJSON_AddNumberToObject(item, "size", *ad_accounts_audience->size) == NULL) {
    goto fail; //Numeric
    }
    }


    // ad_accounts_audience->status
    if(ad_accounts_audience->status) {
    cJSON *status_local_JSON = audience_status_convertToJSON(ad_accounts_audience->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // ad_accounts_audience->type
    if(ad_accounts_audience->type) {
    if(cJSON_AddStringToObject(item, "type", ad_accounts_audience->type) == NULL) {
    goto fail; //String
    }
    }


    // ad_accounts_audience->updated_timestamp
    if(ad_accounts_audience->updated_timestamp) {
    if(cJSON_AddNumberToObject(item, "updated_timestamp", *ad_accounts_audience->updated_timestamp) == NULL) {
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

ad_accounts_audience_t *ad_accounts_audience_parseFromJSON(cJSON *ad_accounts_audienceJSON){

    ad_accounts_audience_t *ad_accounts_audience_local_var = NULL;

    char *ad_account_id_local_str = NULL;

    // define the local variable for ad_accounts_audience->audience_type
    audience_type_t *audience_type_local_nonprim = NULL;

    char *created_by_company_name_local_str = NULL;

    // define the local variable for ad_accounts_audience->created_timestamp
    int *created_timestamp_local_var = NULL;

    char *description_local_str = NULL;

    char *id_local_str = NULL;

    // define the local variable for ad_accounts_audience->is_nca
    int *is_nca_local_var = NULL;

    char *name_local_str = NULL;

    // define the local variable for ad_accounts_audience->rule
    ad_accounts_audience_rule_t *rule_local_nonprim = NULL;

    // define the local variable for ad_accounts_audience->size
    int *size_local_var = NULL;

    // define the local variable for ad_accounts_audience->status
    audience_status_t *status_local_nonprim = NULL;

    char *type_local_str = NULL;

    // define the local variable for ad_accounts_audience->updated_timestamp
    int *updated_timestamp_local_var = NULL;

    // ad_accounts_audience->ad_account_id
    cJSON *ad_account_id = cJSON_GetObjectItemCaseSensitive(ad_accounts_audienceJSON, "ad_account_id");
    if (cJSON_IsNull(ad_account_id)) {
        ad_account_id = NULL;
    }
    if (ad_account_id) { 
    if(!cJSON_IsString(ad_account_id) && !cJSON_IsNull(ad_account_id))
    {
    goto end; //String
    }
    }

    // ad_accounts_audience->audience_type
    cJSON *audience_type = cJSON_GetObjectItemCaseSensitive(ad_accounts_audienceJSON, "audience_type");
    if (cJSON_IsNull(audience_type)) {
        audience_type = NULL;
    }
    if (audience_type) { 
    audience_type_local_nonprim = audience_type_parseFromJSON(audience_type); //custom
    }

    // ad_accounts_audience->created_by_company_name
    cJSON *created_by_company_name = cJSON_GetObjectItemCaseSensitive(ad_accounts_audienceJSON, "created_by_company_name");
    if (cJSON_IsNull(created_by_company_name)) {
        created_by_company_name = NULL;
    }
    if (created_by_company_name) { 
    if(!cJSON_IsString(created_by_company_name) && !cJSON_IsNull(created_by_company_name))
    {
    goto end; //String
    }
    }

    // ad_accounts_audience->created_timestamp
    cJSON *created_timestamp = cJSON_GetObjectItemCaseSensitive(ad_accounts_audienceJSON, "created_timestamp");
    if (cJSON_IsNull(created_timestamp)) {
        created_timestamp = NULL;
    }
    if (created_timestamp) { 
    if(!cJSON_IsNumber(created_timestamp))
    {
    goto end; //Numeric
    }
    created_timestamp_local_var = malloc(sizeof(int));
    if(!created_timestamp_local_var)
    {
        goto end;
    }
    *created_timestamp_local_var = created_timestamp->valuedouble;
    }

    // ad_accounts_audience->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(ad_accounts_audienceJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // ad_accounts_audience->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(ad_accounts_audienceJSON, "id");
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

    // ad_accounts_audience->is_nca
    cJSON *is_nca = cJSON_GetObjectItemCaseSensitive(ad_accounts_audienceJSON, "is_nca");
    if (cJSON_IsNull(is_nca)) {
        is_nca = NULL;
    }
    if (is_nca) { 
    if(!cJSON_IsBool(is_nca))
    {
    goto end; //Bool
    }
    is_nca_local_var = malloc(sizeof(int));
    if(!is_nca_local_var)
    {
        goto end;
    }
    *is_nca_local_var = is_nca->valueint;
    }

    // ad_accounts_audience->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(ad_accounts_audienceJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // ad_accounts_audience->rule
    cJSON *rule = cJSON_GetObjectItemCaseSensitive(ad_accounts_audienceJSON, "rule");
    if (cJSON_IsNull(rule)) {
        rule = NULL;
    }
    if (rule) { 
    rule_local_nonprim = ad_accounts_audience_rule_parseFromJSON(rule); //nonprimitive
    }

    // ad_accounts_audience->size
    cJSON *size = cJSON_GetObjectItemCaseSensitive(ad_accounts_audienceJSON, "size");
    if (cJSON_IsNull(size)) {
        size = NULL;
    }
    if (size) { 
    if(!cJSON_IsNumber(size))
    {
    goto end; //Numeric
    }
    size_local_var = malloc(sizeof(int));
    if(!size_local_var)
    {
        goto end;
    }
    *size_local_var = size->valuedouble;
    }

    // ad_accounts_audience->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(ad_accounts_audienceJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    status_local_nonprim = audience_status_parseFromJSON(status); //custom
    }

    // ad_accounts_audience->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(ad_accounts_audienceJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (type) { 
    if(!cJSON_IsString(type) && !cJSON_IsNull(type))
    {
    goto end; //String
    }
    }

    // ad_accounts_audience->updated_timestamp
    cJSON *updated_timestamp = cJSON_GetObjectItemCaseSensitive(ad_accounts_audienceJSON, "updated_timestamp");
    if (cJSON_IsNull(updated_timestamp)) {
        updated_timestamp = NULL;
    }
    if (updated_timestamp) { 
    if(!cJSON_IsNumber(updated_timestamp))
    {
    goto end; //Numeric
    }
    updated_timestamp_local_var = malloc(sizeof(int));
    if(!updated_timestamp_local_var)
    {
        goto end;
    }
    *updated_timestamp_local_var = updated_timestamp->valuedouble;
    }


    if (ad_account_id && !cJSON_IsNull(ad_account_id)) ad_account_id_local_str = strdup(ad_account_id->valuestring);
    if (created_by_company_name && !cJSON_IsNull(created_by_company_name)) created_by_company_name_local_str = strdup(created_by_company_name->valuestring);
    if (description && !cJSON_IsNull(description)) description_local_str = strdup(description->valuestring);
    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);
    if (type && !cJSON_IsNull(type)) type_local_str = strdup(type->valuestring);

    ad_accounts_audience_local_var = ad_accounts_audience_create_internal (
        ad_account_id_local_str,
        audience_type ? audience_type_local_nonprim : NULL,
        created_by_company_name_local_str,
        created_timestamp_local_var,
        description_local_str,
        id_local_str,
        is_nca_local_var,
        name_local_str,
        rule ? rule_local_nonprim : NULL,
        size_local_var,
        status ? status_local_nonprim : NULL,
        type_local_str,
        updated_timestamp_local_var
        );

    if (!ad_accounts_audience_local_var) {
        goto end;
    }

    return ad_accounts_audience_local_var;
end:
    if (ad_account_id_local_str) {
        free(ad_account_id_local_str);
        ad_account_id_local_str = NULL;
    }
    if (audience_type_local_nonprim) {
        audience_type_free(audience_type_local_nonprim);
        audience_type_local_nonprim = NULL;
    }
    if (created_by_company_name_local_str) {
        free(created_by_company_name_local_str);
        created_by_company_name_local_str = NULL;
    }
    if (created_timestamp_local_var) {
        free(created_timestamp_local_var);
        created_timestamp_local_var = NULL;
    }
    if (description_local_str) {
        free(description_local_str);
        description_local_str = NULL;
    }
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (is_nca_local_var) {
        free(is_nca_local_var);
        is_nca_local_var = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (rule_local_nonprim) {
        ad_accounts_audience_rule_free(rule_local_nonprim);
        rule_local_nonprim = NULL;
    }
    if (size_local_var) {
        free(size_local_var);
        size_local_var = NULL;
    }
    if (status_local_nonprim) {
        audience_status_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    if (type_local_str) {
        free(type_local_str);
        type_local_str = NULL;
    }
    if (updated_timestamp_local_var) {
        free(updated_timestamp_local_var);
        updated_timestamp_local_var = NULL;
    }
    return NULL;

}
