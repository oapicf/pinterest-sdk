#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audience.h"



static audience_t *audience_create_internal(
    char *ad_account_id,
    pinner_list_type_t *audience_type,
    char *created_by_company_name,
    int *created_timestamp,
    char *description,
    char *id,
    int *is_nca,
    char *name,
    audience_rule_t *rule,
    int *size,
    audience_status_t *status,
    char *type,
    int *updated_timestamp
    ) {
    audience_t *audience_local_var = malloc(sizeof(audience_t));
    if (!audience_local_var) {
        return NULL;
    }
    memset(audience_local_var, 0, sizeof(audience_t));
    audience_local_var->_library_owned = 1;
    audience_local_var->ad_account_id = ad_account_id;
    audience_local_var->audience_type = audience_type;
    audience_local_var->created_by_company_name = created_by_company_name;
    audience_local_var->created_timestamp = created_timestamp;
    audience_local_var->description = description;
    audience_local_var->id = id;
    audience_local_var->is_nca = is_nca;
    audience_local_var->name = name;
    audience_local_var->rule = rule;
    audience_local_var->size = size;
    audience_local_var->status = status;
    audience_local_var->type = type;
    audience_local_var->updated_timestamp = updated_timestamp;
    return audience_local_var;
}

__attribute__((deprecated)) audience_t *audience_create(
    char *ad_account_id,
    pinner_list_type_t *audience_type,
    char *created_by_company_name,
    int *created_timestamp,
    char *description,
    char *id,
    int *is_nca,
    char *name,
    audience_rule_t *rule,
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
    audience_t *result = audience_create_internal (
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

void audience_free(audience_t *audience) {
    if(NULL == audience){
        return ;
    }
    if(audience->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "audience_free");
        return ;
    }
    listEntry_t *listEntry;
    if (audience->ad_account_id) {
        free(audience->ad_account_id);
        audience->ad_account_id = NULL;
    }
    if (audience->audience_type) {
        pinner_list_type_free(audience->audience_type);
        audience->audience_type = NULL;
    }
    if (audience->created_by_company_name) {
        free(audience->created_by_company_name);
        audience->created_by_company_name = NULL;
    }
    if (audience->created_timestamp) {
        free(audience->created_timestamp);
        audience->created_timestamp = NULL;
    }
    if (audience->description) {
        free(audience->description);
        audience->description = NULL;
    }
    if (audience->id) {
        free(audience->id);
        audience->id = NULL;
    }
    if (audience->is_nca) {
        free(audience->is_nca);
        audience->is_nca = NULL;
    }
    if (audience->name) {
        free(audience->name);
        audience->name = NULL;
    }
    if (audience->rule) {
        audience_rule_free(audience->rule);
        audience->rule = NULL;
    }
    if (audience->size) {
        free(audience->size);
        audience->size = NULL;
    }
    if (audience->status) {
        audience_status_free(audience->status);
        audience->status = NULL;
    }
    if (audience->type) {
        free(audience->type);
        audience->type = NULL;
    }
    if (audience->updated_timestamp) {
        free(audience->updated_timestamp);
        audience->updated_timestamp = NULL;
    }
    free(audience);
}

cJSON *audience_convertToJSON(audience_t *audience) {
    cJSON *item = cJSON_CreateObject();

    // audience->ad_account_id
    if(audience->ad_account_id) {
    if(cJSON_AddStringToObject(item, "ad_account_id", audience->ad_account_id) == NULL) {
    goto fail; //String
    }
    }


    // audience->audience_type
    if(audience->audience_type) {
    cJSON *audience_type_local_JSON = pinner_list_type_convertToJSON(audience->audience_type);
    if(audience_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "audience_type", audience_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // audience->created_by_company_name
    if(audience->created_by_company_name) {
    if(cJSON_AddStringToObject(item, "created_by_company_name", audience->created_by_company_name) == NULL) {
    goto fail; //String
    }
    }


    // audience->created_timestamp
    if(audience->created_timestamp) {
    if(cJSON_AddNumberToObject(item, "created_timestamp", *audience->created_timestamp) == NULL) {
    goto fail; //Numeric
    }
    }


    // audience->description
    if(audience->description) {
    if(cJSON_AddStringToObject(item, "description", audience->description) == NULL) {
    goto fail; //String
    }
    }


    // audience->id
    if(audience->id) {
    if(cJSON_AddStringToObject(item, "id", audience->id) == NULL) {
    goto fail; //String
    }
    }


    // audience->is_nca
    if(audience->is_nca) {
    if(cJSON_AddBoolToObject(item, "is_nca", *audience->is_nca) == NULL) {
    goto fail; //Bool
    }
    }


    // audience->name
    if(audience->name) {
    if(cJSON_AddStringToObject(item, "name", audience->name) == NULL) {
    goto fail; //String
    }
    }


    // audience->rule
    if(audience->rule) {
    cJSON *rule_local_JSON = audience_rule_convertToJSON(audience->rule);
    if(rule_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "rule", rule_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // audience->size
    if(audience->size) {
    if(cJSON_AddNumberToObject(item, "size", *audience->size) == NULL) {
    goto fail; //Numeric
    }
    }


    // audience->status
    if(audience->status) {
    cJSON *status_local_JSON = audience_status_convertToJSON(audience->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // audience->type
    if(audience->type) {
    if(cJSON_AddStringToObject(item, "type", audience->type) == NULL) {
    goto fail; //String
    }
    }


    // audience->updated_timestamp
    if(audience->updated_timestamp) {
    if(cJSON_AddNumberToObject(item, "updated_timestamp", *audience->updated_timestamp) == NULL) {
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

audience_t *audience_parseFromJSON(cJSON *audienceJSON){

    audience_t *audience_local_var = NULL;

    char *ad_account_id_local_str = NULL;

    // define the local variable for audience->audience_type
    pinner_list_type_t *audience_type_local_nonprim = NULL;

    char *created_by_company_name_local_str = NULL;

    // define the local variable for audience->created_timestamp
    int *created_timestamp_local_var = NULL;

    char *description_local_str = NULL;

    char *id_local_str = NULL;

    // define the local variable for audience->is_nca
    int *is_nca_local_var = NULL;

    char *name_local_str = NULL;

    // define the local variable for audience->rule
    audience_rule_t *rule_local_nonprim = NULL;

    // define the local variable for audience->size
    int *size_local_var = NULL;

    // define the local variable for audience->status
    audience_status_t *status_local_nonprim = NULL;

    char *type_local_str = NULL;

    // define the local variable for audience->updated_timestamp
    int *updated_timestamp_local_var = NULL;

    // audience->ad_account_id
    cJSON *ad_account_id = cJSON_GetObjectItemCaseSensitive(audienceJSON, "ad_account_id");
    if (cJSON_IsNull(ad_account_id)) {
        ad_account_id = NULL;
    }
    if (ad_account_id) { 
    if(!cJSON_IsString(ad_account_id) && !cJSON_IsNull(ad_account_id))
    {
    goto end; //String
    }
    }

    // audience->audience_type
    cJSON *audience_type = cJSON_GetObjectItemCaseSensitive(audienceJSON, "audience_type");
    if (cJSON_IsNull(audience_type)) {
        audience_type = NULL;
    }
    if (audience_type) { 
    audience_type_local_nonprim = pinner_list_type_parseFromJSON(audience_type); //custom
    }

    // audience->created_by_company_name
    cJSON *created_by_company_name = cJSON_GetObjectItemCaseSensitive(audienceJSON, "created_by_company_name");
    if (cJSON_IsNull(created_by_company_name)) {
        created_by_company_name = NULL;
    }
    if (created_by_company_name) { 
    if(!cJSON_IsString(created_by_company_name) && !cJSON_IsNull(created_by_company_name))
    {
    goto end; //String
    }
    }

    // audience->created_timestamp
    cJSON *created_timestamp = cJSON_GetObjectItemCaseSensitive(audienceJSON, "created_timestamp");
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

    // audience->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(audienceJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // audience->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(audienceJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // audience->is_nca
    cJSON *is_nca = cJSON_GetObjectItemCaseSensitive(audienceJSON, "is_nca");
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

    // audience->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(audienceJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // audience->rule
    cJSON *rule = cJSON_GetObjectItemCaseSensitive(audienceJSON, "rule");
    if (cJSON_IsNull(rule)) {
        rule = NULL;
    }
    if (rule) { 
    rule_local_nonprim = audience_rule_parseFromJSON(rule); //nonprimitive
    }

    // audience->size
    cJSON *size = cJSON_GetObjectItemCaseSensitive(audienceJSON, "size");
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

    // audience->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(audienceJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    status_local_nonprim = audience_status_parseFromJSON(status); //custom
    }

    // audience->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(audienceJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (type) { 
    if(!cJSON_IsString(type) && !cJSON_IsNull(type))
    {
    goto end; //String
    }
    }

    // audience->updated_timestamp
    cJSON *updated_timestamp = cJSON_GetObjectItemCaseSensitive(audienceJSON, "updated_timestamp");
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

    audience_local_var = audience_create_internal (
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

    if (!audience_local_var) {
        goto end;
    }

    return audience_local_var;
end:
    if (ad_account_id_local_str) {
        free(ad_account_id_local_str);
        ad_account_id_local_str = NULL;
    }
    if (audience_type_local_nonprim) {
        pinner_list_type_free(audience_type_local_nonprim);
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
        audience_rule_free(rule_local_nonprim);
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
