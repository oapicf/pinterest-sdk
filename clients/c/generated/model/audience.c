#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audience.h"



static audience_t *audience_create_internal(
    char *ad_account_id,
    char *audience_type,
    char *created_by_company_name,
    int created_timestamp,
    char *description,
    char *id,
    char *name,
    audience_rule_t *rule,
    int size,
    char *status,
    char *type,
    int updated_timestamp
    ) {
    audience_t *audience_local_var = malloc(sizeof(audience_t));
    if (!audience_local_var) {
        return NULL;
    }
    audience_local_var->ad_account_id = ad_account_id;
    audience_local_var->audience_type = audience_type;
    audience_local_var->created_by_company_name = created_by_company_name;
    audience_local_var->created_timestamp = created_timestamp;
    audience_local_var->description = description;
    audience_local_var->id = id;
    audience_local_var->name = name;
    audience_local_var->rule = rule;
    audience_local_var->size = size;
    audience_local_var->status = status;
    audience_local_var->type = type;
    audience_local_var->updated_timestamp = updated_timestamp;

    audience_local_var->_library_owned = 1;
    return audience_local_var;
}

__attribute__((deprecated)) audience_t *audience_create(
    char *ad_account_id,
    char *audience_type,
    char *created_by_company_name,
    int created_timestamp,
    char *description,
    char *id,
    char *name,
    audience_rule_t *rule,
    int size,
    char *status,
    char *type,
    int updated_timestamp
    ) {
    return audience_create_internal (
        ad_account_id,
        audience_type,
        created_by_company_name,
        created_timestamp,
        description,
        id,
        name,
        rule,
        size,
        status,
        type,
        updated_timestamp
        );
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
        free(audience->audience_type);
        audience->audience_type = NULL;
    }
    if (audience->created_by_company_name) {
        free(audience->created_by_company_name);
        audience->created_by_company_name = NULL;
    }
    if (audience->description) {
        free(audience->description);
        audience->description = NULL;
    }
    if (audience->id) {
        free(audience->id);
        audience->id = NULL;
    }
    if (audience->name) {
        free(audience->name);
        audience->name = NULL;
    }
    if (audience->rule) {
        audience_rule_free(audience->rule);
        audience->rule = NULL;
    }
    if (audience->status) {
        free(audience->status);
        audience->status = NULL;
    }
    if (audience->type) {
        free(audience->type);
        audience->type = NULL;
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
    if(cJSON_AddStringToObject(item, "audience_type", audience->audience_type) == NULL) {
    goto fail; //String
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
    if(cJSON_AddNumberToObject(item, "created_timestamp", audience->created_timestamp) == NULL) {
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
    if(cJSON_AddNumberToObject(item, "size", audience->size) == NULL) {
    goto fail; //Numeric
    }
    }


    // audience->status
    if(audience->status) {
    if(cJSON_AddStringToObject(item, "status", audience->status) == NULL) {
    goto fail; //String
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
    if(cJSON_AddNumberToObject(item, "updated_timestamp", audience->updated_timestamp) == NULL) {
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

    // define the local variable for audience->rule
    audience_rule_t *rule_local_nonprim = NULL;

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
    if(!cJSON_IsString(audience_type) && !cJSON_IsNull(audience_type))
    {
    goto end; //String
    }
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
    }

    // audience->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(audienceJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    if(!cJSON_IsString(status) && !cJSON_IsNull(status))
    {
    goto end; //String
    }
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
    }


    audience_local_var = audience_create_internal (
        ad_account_id && !cJSON_IsNull(ad_account_id) ? strdup(ad_account_id->valuestring) : NULL,
        audience_type && !cJSON_IsNull(audience_type) ? strdup(audience_type->valuestring) : NULL,
        created_by_company_name && !cJSON_IsNull(created_by_company_name) ? strdup(created_by_company_name->valuestring) : NULL,
        created_timestamp ? created_timestamp->valuedouble : 0,
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        rule ? rule_local_nonprim : NULL,
        size ? size->valuedouble : 0,
        status && !cJSON_IsNull(status) ? strdup(status->valuestring) : NULL,
        type && !cJSON_IsNull(type) ? strdup(type->valuestring) : NULL,
        updated_timestamp ? updated_timestamp->valuedouble : 0
        );

    return audience_local_var;
end:
    if (rule_local_nonprim) {
        audience_rule_free(rule_local_nonprim);
        rule_local_nonprim = NULL;
    }
    return NULL;

}
