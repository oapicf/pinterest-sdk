#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "shared_audience_account.h"


char* shared_audience_account_account_type_ToString(pinterest_rest_api_shared_audience_account_ACCOUNTTYPE_e account_type) {
    char* account_typeArray[] =  { "NULL", "AD_ACCOUNT", "BUSINESS_ACCOUNT" };
    return account_typeArray[account_type];
}

pinterest_rest_api_shared_audience_account_ACCOUNTTYPE_e shared_audience_account_account_type_FromString(char* account_type){
    int stringToReturn = 0;
    char *account_typeArray[] =  { "NULL", "AD_ACCOUNT", "BUSINESS_ACCOUNT" };
    size_t sizeofArray = sizeof(account_typeArray) / sizeof(account_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(account_type, account_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

shared_audience_account_t *shared_audience_account_create(
    char *account_id,
    char *account_name,
    pinterest_rest_api_shared_audience_account_ACCOUNTTYPE_e account_type,
    int shared_on_timestamp
    ) {
    shared_audience_account_t *shared_audience_account_local_var = malloc(sizeof(shared_audience_account_t));
    if (!shared_audience_account_local_var) {
        return NULL;
    }
    shared_audience_account_local_var->account_id = account_id;
    shared_audience_account_local_var->account_name = account_name;
    shared_audience_account_local_var->account_type = account_type;
    shared_audience_account_local_var->shared_on_timestamp = shared_on_timestamp;

    return shared_audience_account_local_var;
}


void shared_audience_account_free(shared_audience_account_t *shared_audience_account) {
    if(NULL == shared_audience_account){
        return ;
    }
    listEntry_t *listEntry;
    if (shared_audience_account->account_id) {
        free(shared_audience_account->account_id);
        shared_audience_account->account_id = NULL;
    }
    if (shared_audience_account->account_name) {
        free(shared_audience_account->account_name);
        shared_audience_account->account_name = NULL;
    }
    free(shared_audience_account);
}

cJSON *shared_audience_account_convertToJSON(shared_audience_account_t *shared_audience_account) {
    cJSON *item = cJSON_CreateObject();

    // shared_audience_account->account_id
    if (!shared_audience_account->account_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "account_id", shared_audience_account->account_id) == NULL) {
    goto fail; //String
    }


    // shared_audience_account->account_name
    if (!shared_audience_account->account_name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "account_name", shared_audience_account->account_name) == NULL) {
    goto fail; //String
    }


    // shared_audience_account->account_type
    if (pinterest_rest_api_shared_audience_account_ACCOUNTTYPE_NULL == shared_audience_account->account_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "account_type", account_typeshared_audience_account_ToString(shared_audience_account->account_type)) == NULL)
    {
    goto fail; //Enum
    }


    // shared_audience_account->shared_on_timestamp
    if (!shared_audience_account->shared_on_timestamp) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "shared_on_timestamp", shared_audience_account->shared_on_timestamp) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

shared_audience_account_t *shared_audience_account_parseFromJSON(cJSON *shared_audience_accountJSON){

    shared_audience_account_t *shared_audience_account_local_var = NULL;

    // shared_audience_account->account_id
    cJSON *account_id = cJSON_GetObjectItemCaseSensitive(shared_audience_accountJSON, "account_id");
    if (!account_id) {
        goto end;
    }

    
    if(!cJSON_IsString(account_id))
    {
    goto end; //String
    }

    // shared_audience_account->account_name
    cJSON *account_name = cJSON_GetObjectItemCaseSensitive(shared_audience_accountJSON, "account_name");
    if (!account_name) {
        goto end;
    }

    
    if(!cJSON_IsString(account_name))
    {
    goto end; //String
    }

    // shared_audience_account->account_type
    cJSON *account_type = cJSON_GetObjectItemCaseSensitive(shared_audience_accountJSON, "account_type");
    if (!account_type) {
        goto end;
    }

    pinterest_rest_api_shared_audience_account_ACCOUNTTYPE_e account_typeVariable;
    
    if(!cJSON_IsString(account_type))
    {
    goto end; //Enum
    }
    account_typeVariable = shared_audience_account_account_type_FromString(account_type->valuestring);

    // shared_audience_account->shared_on_timestamp
    cJSON *shared_on_timestamp = cJSON_GetObjectItemCaseSensitive(shared_audience_accountJSON, "shared_on_timestamp");
    if (!shared_on_timestamp) {
        goto end;
    }

    
    if(!cJSON_IsNumber(shared_on_timestamp))
    {
    goto end; //Numeric
    }


    shared_audience_account_local_var = shared_audience_account_create (
        strdup(account_id->valuestring),
        strdup(account_name->valuestring),
        account_typeVariable,
        shared_on_timestamp->valuedouble
        );

    return shared_audience_account_local_var;
end:
    return NULL;

}
