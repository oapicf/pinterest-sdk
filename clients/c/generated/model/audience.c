#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audience.h"



audience_t *audience_create(
    char *ad_account_id,
    char *id,
    char *name,
    char *audience_type,
    char *description,
    audience_rule_t *rule,
    int size,
    char *status,
    char *type,
    int created_timestamp,
    int updated_timestamp
    ) {
    audience_t *audience_local_var = malloc(sizeof(audience_t));
    if (!audience_local_var) {
        return NULL;
    }
    audience_local_var->ad_account_id = ad_account_id;
    audience_local_var->id = id;
    audience_local_var->name = name;
    audience_local_var->audience_type = audience_type;
    audience_local_var->description = description;
    audience_local_var->rule = rule;
    audience_local_var->size = size;
    audience_local_var->status = status;
    audience_local_var->type = type;
    audience_local_var->created_timestamp = created_timestamp;
    audience_local_var->updated_timestamp = updated_timestamp;

    return audience_local_var;
}


void audience_free(audience_t *audience) {
    if(NULL == audience){
        return ;
    }
    listEntry_t *listEntry;
    if (audience->ad_account_id) {
        free(audience->ad_account_id);
        audience->ad_account_id = NULL;
    }
    if (audience->id) {
        free(audience->id);
        audience->id = NULL;
    }
    if (audience->name) {
        free(audience->name);
        audience->name = NULL;
    }
    if (audience->audience_type) {
        free(audience->audience_type);
        audience->audience_type = NULL;
    }
    if (audience->description) {
        free(audience->description);
        audience->description = NULL;
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


    // audience->audience_type
    if(audience->audience_type) {
    if(cJSON_AddStringToObject(item, "audience_type", audience->audience_type) == NULL) {
    goto fail; //String
    }
    }


    // audience->description
    if(audience->description) {
    if(cJSON_AddStringToObject(item, "description", audience->description) == NULL) {
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


    // audience->created_timestamp
    if(audience->created_timestamp) {
    if(cJSON_AddNumberToObject(item, "created_timestamp", audience->created_timestamp) == NULL) {
    goto fail; //Numeric
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
    if (ad_account_id) { 
    if(!cJSON_IsString(ad_account_id) && !cJSON_IsNull(ad_account_id))
    {
    goto end; //String
    }
    }

    // audience->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(audienceJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // audience->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(audienceJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // audience->audience_type
    cJSON *audience_type = cJSON_GetObjectItemCaseSensitive(audienceJSON, "audience_type");
    if (audience_type) { 
    if(!cJSON_IsString(audience_type) && !cJSON_IsNull(audience_type))
    {
    goto end; //String
    }
    }

    // audience->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(audienceJSON, "description");
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // audience->rule
    cJSON *rule = cJSON_GetObjectItemCaseSensitive(audienceJSON, "rule");
    if (rule) { 
    rule_local_nonprim = audience_rule_parseFromJSON(rule); //nonprimitive
    }

    // audience->size
    cJSON *size = cJSON_GetObjectItemCaseSensitive(audienceJSON, "size");
    if (size) { 
    if(!cJSON_IsNumber(size))
    {
    goto end; //Numeric
    }
    }

    // audience->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(audienceJSON, "status");
    if (status) { 
    if(!cJSON_IsString(status) && !cJSON_IsNull(status))
    {
    goto end; //String
    }
    }

    // audience->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(audienceJSON, "type");
    if (type) { 
    if(!cJSON_IsString(type) && !cJSON_IsNull(type))
    {
    goto end; //String
    }
    }

    // audience->created_timestamp
    cJSON *created_timestamp = cJSON_GetObjectItemCaseSensitive(audienceJSON, "created_timestamp");
    if (created_timestamp) { 
    if(!cJSON_IsNumber(created_timestamp))
    {
    goto end; //Numeric
    }
    }

    // audience->updated_timestamp
    cJSON *updated_timestamp = cJSON_GetObjectItemCaseSensitive(audienceJSON, "updated_timestamp");
    if (updated_timestamp) { 
    if(!cJSON_IsNumber(updated_timestamp))
    {
    goto end; //Numeric
    }
    }


    audience_local_var = audience_create (
        ad_account_id && !cJSON_IsNull(ad_account_id) ? strdup(ad_account_id->valuestring) : NULL,
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        audience_type && !cJSON_IsNull(audience_type) ? strdup(audience_type->valuestring) : NULL,
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        rule ? rule_local_nonprim : NULL,
        size ? size->valuedouble : 0,
        status && !cJSON_IsNull(status) ? strdup(status->valuestring) : NULL,
        type && !cJSON_IsNull(type) ? strdup(type->valuestring) : NULL,
        created_timestamp ? created_timestamp->valuedouble : 0,
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
