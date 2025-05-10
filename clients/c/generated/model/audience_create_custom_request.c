#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audience_create_custom_request.h"



static audience_create_custom_request_t *audience_create_custom_request_create_internal(
    char *ad_account_id,
    char *name,
    audience_rule_t *rule,
    pinterest_rest_api_audience_sharing_type__e sharing_type,
    pinterest_rest_api_audience_data_party__e data_party,
    char *category
    ) {
    audience_create_custom_request_t *audience_create_custom_request_local_var = malloc(sizeof(audience_create_custom_request_t));
    if (!audience_create_custom_request_local_var) {
        return NULL;
    }
    audience_create_custom_request_local_var->ad_account_id = ad_account_id;
    audience_create_custom_request_local_var->name = name;
    audience_create_custom_request_local_var->rule = rule;
    audience_create_custom_request_local_var->sharing_type = sharing_type;
    audience_create_custom_request_local_var->data_party = data_party;
    audience_create_custom_request_local_var->category = category;

    audience_create_custom_request_local_var->_library_owned = 1;
    return audience_create_custom_request_local_var;
}

__attribute__((deprecated)) audience_create_custom_request_t *audience_create_custom_request_create(
    char *ad_account_id,
    char *name,
    audience_rule_t *rule,
    pinterest_rest_api_audience_sharing_type__e sharing_type,
    pinterest_rest_api_audience_data_party__e data_party,
    char *category
    ) {
    return audience_create_custom_request_create_internal (
        ad_account_id,
        name,
        rule,
        sharing_type,
        data_party,
        category
        );
}

void audience_create_custom_request_free(audience_create_custom_request_t *audience_create_custom_request) {
    if(NULL == audience_create_custom_request){
        return ;
    }
    if(audience_create_custom_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "audience_create_custom_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (audience_create_custom_request->ad_account_id) {
        free(audience_create_custom_request->ad_account_id);
        audience_create_custom_request->ad_account_id = NULL;
    }
    if (audience_create_custom_request->name) {
        free(audience_create_custom_request->name);
        audience_create_custom_request->name = NULL;
    }
    if (audience_create_custom_request->rule) {
        audience_rule_free(audience_create_custom_request->rule);
        audience_create_custom_request->rule = NULL;
    }
    if (audience_create_custom_request->category) {
        free(audience_create_custom_request->category);
        audience_create_custom_request->category = NULL;
    }
    free(audience_create_custom_request);
}

cJSON *audience_create_custom_request_convertToJSON(audience_create_custom_request_t *audience_create_custom_request) {
    cJSON *item = cJSON_CreateObject();

    // audience_create_custom_request->ad_account_id
    if(audience_create_custom_request->ad_account_id) {
    if(cJSON_AddStringToObject(item, "ad_account_id", audience_create_custom_request->ad_account_id) == NULL) {
    goto fail; //String
    }
    }


    // audience_create_custom_request->name
    if (!audience_create_custom_request->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", audience_create_custom_request->name) == NULL) {
    goto fail; //String
    }


    // audience_create_custom_request->rule
    if (!audience_create_custom_request->rule) {
        goto fail;
    }
    cJSON *rule_local_JSON = audience_rule_convertToJSON(audience_create_custom_request->rule);
    if(rule_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "rule", rule_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // audience_create_custom_request->sharing_type
    if (pinterest_rest_api_audience_sharing_type__NULL == audience_create_custom_request->sharing_type) {
        goto fail;
    }
    cJSON *sharing_type_local_JSON = audience_sharing_type_convertToJSON(audience_create_custom_request->sharing_type);
    if(sharing_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "sharing_type", sharing_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // audience_create_custom_request->data_party
    if (pinterest_rest_api_audience_data_party__NULL == audience_create_custom_request->data_party) {
        goto fail;
    }
    cJSON *data_party_local_JSON = audience_data_party_convertToJSON(audience_create_custom_request->data_party);
    if(data_party_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "data_party", data_party_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // audience_create_custom_request->category
    if(audience_create_custom_request->category) {
    if(cJSON_AddStringToObject(item, "category", audience_create_custom_request->category) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

audience_create_custom_request_t *audience_create_custom_request_parseFromJSON(cJSON *audience_create_custom_requestJSON){

    audience_create_custom_request_t *audience_create_custom_request_local_var = NULL;

    // define the local variable for audience_create_custom_request->rule
    audience_rule_t *rule_local_nonprim = NULL;

    // define the local variable for audience_create_custom_request->sharing_type
    pinterest_rest_api_audience_sharing_type__e sharing_type_local_nonprim = 0;

    // define the local variable for audience_create_custom_request->data_party
    pinterest_rest_api_audience_data_party__e data_party_local_nonprim = 0;

    // audience_create_custom_request->ad_account_id
    cJSON *ad_account_id = cJSON_GetObjectItemCaseSensitive(audience_create_custom_requestJSON, "ad_account_id");
    if (cJSON_IsNull(ad_account_id)) {
        ad_account_id = NULL;
    }
    if (ad_account_id) { 
    if(!cJSON_IsString(ad_account_id) && !cJSON_IsNull(ad_account_id))
    {
    goto end; //String
    }
    }

    // audience_create_custom_request->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(audience_create_custom_requestJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // audience_create_custom_request->rule
    cJSON *rule = cJSON_GetObjectItemCaseSensitive(audience_create_custom_requestJSON, "rule");
    if (cJSON_IsNull(rule)) {
        rule = NULL;
    }
    if (!rule) {
        goto end;
    }

    
    rule_local_nonprim = audience_rule_parseFromJSON(rule); //nonprimitive

    // audience_create_custom_request->sharing_type
    cJSON *sharing_type = cJSON_GetObjectItemCaseSensitive(audience_create_custom_requestJSON, "sharing_type");
    if (cJSON_IsNull(sharing_type)) {
        sharing_type = NULL;
    }
    if (!sharing_type) {
        goto end;
    }

    
    sharing_type_local_nonprim = audience_sharing_type_parseFromJSON(sharing_type); //custom

    // audience_create_custom_request->data_party
    cJSON *data_party = cJSON_GetObjectItemCaseSensitive(audience_create_custom_requestJSON, "data_party");
    if (cJSON_IsNull(data_party)) {
        data_party = NULL;
    }
    if (!data_party) {
        goto end;
    }

    
    data_party_local_nonprim = audience_data_party_parseFromJSON(data_party); //custom

    // audience_create_custom_request->category
    cJSON *category = cJSON_GetObjectItemCaseSensitive(audience_create_custom_requestJSON, "category");
    if (cJSON_IsNull(category)) {
        category = NULL;
    }
    if (category) { 
    if(!cJSON_IsString(category) && !cJSON_IsNull(category))
    {
    goto end; //String
    }
    }


    audience_create_custom_request_local_var = audience_create_custom_request_create_internal (
        ad_account_id && !cJSON_IsNull(ad_account_id) ? strdup(ad_account_id->valuestring) : NULL,
        strdup(name->valuestring),
        rule_local_nonprim,
        sharing_type_local_nonprim,
        data_party_local_nonprim,
        category && !cJSON_IsNull(category) ? strdup(category->valuestring) : NULL
        );

    return audience_create_custom_request_local_var;
end:
    if (rule_local_nonprim) {
        audience_rule_free(rule_local_nonprim);
        rule_local_nonprim = NULL;
    }
    if (sharing_type_local_nonprim) {
        sharing_type_local_nonprim = 0;
    }
    if (data_party_local_nonprim) {
        data_party_local_nonprim = 0;
    }
    return NULL;

}
