#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audience_common.h"



audience_common_t *audience_common_create(
    char *ad_account_id,
    char *name,
    audience_rule_t *rule
    ) {
    audience_common_t *audience_common_local_var = malloc(sizeof(audience_common_t));
    if (!audience_common_local_var) {
        return NULL;
    }
    audience_common_local_var->ad_account_id = ad_account_id;
    audience_common_local_var->name = name;
    audience_common_local_var->rule = rule;

    return audience_common_local_var;
}


void audience_common_free(audience_common_t *audience_common) {
    if(NULL == audience_common){
        return ;
    }
    listEntry_t *listEntry;
    if (audience_common->ad_account_id) {
        free(audience_common->ad_account_id);
        audience_common->ad_account_id = NULL;
    }
    if (audience_common->name) {
        free(audience_common->name);
        audience_common->name = NULL;
    }
    if (audience_common->rule) {
        audience_rule_free(audience_common->rule);
        audience_common->rule = NULL;
    }
    free(audience_common);
}

cJSON *audience_common_convertToJSON(audience_common_t *audience_common) {
    cJSON *item = cJSON_CreateObject();

    // audience_common->ad_account_id
    if(audience_common->ad_account_id) {
    if(cJSON_AddStringToObject(item, "ad_account_id", audience_common->ad_account_id) == NULL) {
    goto fail; //String
    }
    }


    // audience_common->name
    if(audience_common->name) {
    if(cJSON_AddStringToObject(item, "name", audience_common->name) == NULL) {
    goto fail; //String
    }
    }


    // audience_common->rule
    if(audience_common->rule) {
    cJSON *rule_local_JSON = audience_rule_convertToJSON(audience_common->rule);
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

audience_common_t *audience_common_parseFromJSON(cJSON *audience_commonJSON){

    audience_common_t *audience_common_local_var = NULL;

    // define the local variable for audience_common->rule
    audience_rule_t *rule_local_nonprim = NULL;

    // audience_common->ad_account_id
    cJSON *ad_account_id = cJSON_GetObjectItemCaseSensitive(audience_commonJSON, "ad_account_id");
    if (ad_account_id) { 
    if(!cJSON_IsString(ad_account_id) && !cJSON_IsNull(ad_account_id))
    {
    goto end; //String
    }
    }

    // audience_common->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(audience_commonJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // audience_common->rule
    cJSON *rule = cJSON_GetObjectItemCaseSensitive(audience_commonJSON, "rule");
    if (rule) { 
    rule_local_nonprim = audience_rule_parseFromJSON(rule); //nonprimitive
    }


    audience_common_local_var = audience_common_create (
        ad_account_id && !cJSON_IsNull(ad_account_id) ? strdup(ad_account_id->valuestring) : NULL,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        rule ? rule_local_nonprim : NULL
        );

    return audience_common_local_var;
end:
    if (rule_local_nonprim) {
        audience_rule_free(rule_local_nonprim);
        rule_local_nonprim = NULL;
    }
    return NULL;

}
