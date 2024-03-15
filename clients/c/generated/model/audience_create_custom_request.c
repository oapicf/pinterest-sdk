#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audience_create_custom_request.h"


char* audience_create_custom_request_sharing_type_ToString(pinterest_rest_api_audience_create_custom_request__e sharing_type) {
    char* sharing_typeArray[] =  { "NULL", "CUSTOM", "SYNDICATED" };
    return sharing_typeArray[sharing_type];
}

pinterest_rest_api_audience_create_custom_request__e audience_create_custom_request_sharing_type_FromString(char* sharing_type){
    int stringToReturn = 0;
    char *sharing_typeArray[] =  { "NULL", "CUSTOM", "SYNDICATED" };
    size_t sizeofArray = sizeof(sharing_typeArray) / sizeof(sharing_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(sharing_type, sharing_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* audience_create_custom_request_data_party_ToString(pinterest_rest_api_audience_create_custom_request__e data_party) {
    char* data_partyArray[] =  { "NULL", "1p", "3p" };
    return data_partyArray[data_party];
}

pinterest_rest_api_audience_create_custom_request__e audience_create_custom_request_data_party_FromString(char* data_party){
    int stringToReturn = 0;
    char *data_partyArray[] =  { "NULL", "1p", "3p" };
    size_t sizeofArray = sizeof(data_partyArray) / sizeof(data_partyArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(data_party, data_partyArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

audience_create_custom_request_t *audience_create_custom_request_create(
    char *ad_account_id,
    char *name,
    audience_rule_t *rule,
    audience_sharing_type_t *sharing_type,
    audience_data_party_t *data_party,
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

    return audience_create_custom_request_local_var;
}


void audience_create_custom_request_free(audience_create_custom_request_t *audience_create_custom_request) {
    if(NULL == audience_create_custom_request){
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
    if (audience_create_custom_request->sharing_type) {
        audience_sharing_type_free(audience_create_custom_request->sharing_type);
        audience_create_custom_request->sharing_type = NULL;
    }
    if (audience_create_custom_request->data_party) {
        audience_data_party_free(audience_create_custom_request->data_party);
        audience_create_custom_request->data_party = NULL;
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
    if (pinterest_rest_api_audience_create_custom_request__NULL == audience_create_custom_request->sharing_type) {
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
    if (pinterest_rest_api_audience_create_custom_request__NULL == audience_create_custom_request->data_party) {
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
    audience_sharing_type_t *sharing_type_local_nonprim = NULL;

    // define the local variable for audience_create_custom_request->data_party
    audience_data_party_t *data_party_local_nonprim = NULL;

    // audience_create_custom_request->ad_account_id
    cJSON *ad_account_id = cJSON_GetObjectItemCaseSensitive(audience_create_custom_requestJSON, "ad_account_id");
    if (ad_account_id) { 
    if(!cJSON_IsString(ad_account_id) && !cJSON_IsNull(ad_account_id))
    {
    goto end; //String
    }
    }

    // audience_create_custom_request->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(audience_create_custom_requestJSON, "name");
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // audience_create_custom_request->rule
    cJSON *rule = cJSON_GetObjectItemCaseSensitive(audience_create_custom_requestJSON, "rule");
    if (!rule) {
        goto end;
    }

    
    rule_local_nonprim = audience_rule_parseFromJSON(rule); //nonprimitive

    // audience_create_custom_request->sharing_type
    cJSON *sharing_type = cJSON_GetObjectItemCaseSensitive(audience_create_custom_requestJSON, "sharing_type");
    if (!sharing_type) {
        goto end;
    }

    
    sharing_type_local_nonprim = audience_sharing_type_parseFromJSON(sharing_type); //custom

    // audience_create_custom_request->data_party
    cJSON *data_party = cJSON_GetObjectItemCaseSensitive(audience_create_custom_requestJSON, "data_party");
    if (!data_party) {
        goto end;
    }

    
    data_party_local_nonprim = audience_data_party_parseFromJSON(data_party); //custom

    // audience_create_custom_request->category
    cJSON *category = cJSON_GetObjectItemCaseSensitive(audience_create_custom_requestJSON, "category");
    if (category) { 
    if(!cJSON_IsString(category) && !cJSON_IsNull(category))
    {
    goto end; //String
    }
    }


    audience_create_custom_request_local_var = audience_create_custom_request_create (
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
        audience_sharing_type_free(sharing_type_local_nonprim);
        sharing_type_local_nonprim = NULL;
    }
    if (data_party_local_nonprim) {
        audience_data_party_free(data_party_local_nonprim);
        data_party_local_nonprim = NULL;
    }
    return NULL;

}
