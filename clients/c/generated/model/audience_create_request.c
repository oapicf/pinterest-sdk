#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audience_create_request.h"



audience_create_request_t *audience_create_request_create(
    char *ad_account_id,
    char *name,
    audience_rule_t *rule,
    char *description,
    audience_create_request_1_audience_type_t *audience_type
    ) {
    audience_create_request_t *audience_create_request_local_var = malloc(sizeof(audience_create_request_t));
    if (!audience_create_request_local_var) {
        return NULL;
    }
    audience_create_request_local_var->ad_account_id = ad_account_id;
    audience_create_request_local_var->name = name;
    audience_create_request_local_var->rule = rule;
    audience_create_request_local_var->description = description;
    audience_create_request_local_var->audience_type = audience_type;

    return audience_create_request_local_var;
}


void audience_create_request_free(audience_create_request_t *audience_create_request) {
    if(NULL == audience_create_request){
        return ;
    }
    listEntry_t *listEntry;
    if (audience_create_request->ad_account_id) {
        free(audience_create_request->ad_account_id);
        audience_create_request->ad_account_id = NULL;
    }
    if (audience_create_request->name) {
        free(audience_create_request->name);
        audience_create_request->name = NULL;
    }
    if (audience_create_request->rule) {
        audience_rule_free(audience_create_request->rule);
        audience_create_request->rule = NULL;
    }
    if (audience_create_request->description) {
        free(audience_create_request->description);
        audience_create_request->description = NULL;
    }
    if (audience_create_request->audience_type) {
        audience_create_request_1_audience_type_free(audience_create_request->audience_type);
        audience_create_request->audience_type = NULL;
    }
    free(audience_create_request);
}

cJSON *audience_create_request_convertToJSON(audience_create_request_t *audience_create_request) {
    cJSON *item = cJSON_CreateObject();

    // audience_create_request->ad_account_id
    if(audience_create_request->ad_account_id) {
    if(cJSON_AddStringToObject(item, "ad_account_id", audience_create_request->ad_account_id) == NULL) {
    goto fail; //String
    }
    }


    // audience_create_request->name
    if (!audience_create_request->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", audience_create_request->name) == NULL) {
    goto fail; //String
    }


    // audience_create_request->rule
    if (!audience_create_request->rule) {
        goto fail;
    }
    cJSON *rule_local_JSON = audience_rule_convertToJSON(audience_create_request->rule);
    if(rule_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "rule", rule_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // audience_create_request->description
    if(audience_create_request->description) {
    if(cJSON_AddStringToObject(item, "description", audience_create_request->description) == NULL) {
    goto fail; //String
    }
    }


    // audience_create_request->audience_type
    if (!audience_create_request->audience_type) {
        goto fail;
    }
    cJSON *audience_type_local_JSON = audience_create_request_1_audience_type_convertToJSON(audience_create_request->audience_type);
    if(audience_type_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "audience_type", audience_type_local_JSON);
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

audience_create_request_t *audience_create_request_parseFromJSON(cJSON *audience_create_requestJSON){

    audience_create_request_t *audience_create_request_local_var = NULL;

    // define the local variable for audience_create_request->rule
    audience_rule_t *rule_local_nonprim = NULL;

    // define the local variable for audience_create_request->audience_type
    audience_create_request_1_audience_type_t *audience_type_local_nonprim = NULL;

    // audience_create_request->ad_account_id
    cJSON *ad_account_id = cJSON_GetObjectItemCaseSensitive(audience_create_requestJSON, "ad_account_id");
    if (ad_account_id) { 
    if(!cJSON_IsString(ad_account_id) && !cJSON_IsNull(ad_account_id))
    {
    goto end; //String
    }
    }

    // audience_create_request->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(audience_create_requestJSON, "name");
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // audience_create_request->rule
    cJSON *rule = cJSON_GetObjectItemCaseSensitive(audience_create_requestJSON, "rule");
    if (!rule) {
        goto end;
    }

    
    rule_local_nonprim = audience_rule_parseFromJSON(rule); //nonprimitive

    // audience_create_request->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(audience_create_requestJSON, "description");
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // audience_create_request->audience_type
    cJSON *audience_type = cJSON_GetObjectItemCaseSensitive(audience_create_requestJSON, "audience_type");
    if (!audience_type) {
        goto end;
    }

    
    audience_type_local_nonprim = audience_create_request_1_audience_type_parseFromJSON(audience_type); //nonprimitive


    audience_create_request_local_var = audience_create_request_create (
        ad_account_id && !cJSON_IsNull(ad_account_id) ? strdup(ad_account_id->valuestring) : NULL,
        strdup(name->valuestring),
        rule_local_nonprim,
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        audience_type_local_nonprim
        );

    return audience_create_request_local_var;
end:
    if (rule_local_nonprim) {
        audience_rule_free(rule_local_nonprim);
        rule_local_nonprim = NULL;
    }
    if (audience_type_local_nonprim) {
        audience_create_request_1_audience_type_free(audience_type_local_nonprim);
        audience_type_local_nonprim = NULL;
    }
    return NULL;

}
