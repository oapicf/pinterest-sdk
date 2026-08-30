#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "shared_audience_account.h"



static shared_audience_account_t *shared_audience_account_create_internal(
    char *account_id,
    char *account_name,
    audience_account_type_t *account_type,
    int *shared_on_timestamp
    ) {
    shared_audience_account_t *shared_audience_account_local_var = malloc(sizeof(shared_audience_account_t));
    if (!shared_audience_account_local_var) {
        return NULL;
    }
    memset(shared_audience_account_local_var, 0, sizeof(shared_audience_account_t));
    shared_audience_account_local_var->_library_owned = 1;
    shared_audience_account_local_var->account_id = account_id;
    shared_audience_account_local_var->account_name = account_name;
    shared_audience_account_local_var->account_type = account_type;
    shared_audience_account_local_var->shared_on_timestamp = shared_on_timestamp;
    return shared_audience_account_local_var;
}

__attribute__((deprecated)) shared_audience_account_t *shared_audience_account_create(
    char *account_id,
    char *account_name,
    audience_account_type_t *account_type,
    int *shared_on_timestamp
    ) {
    int *shared_on_timestamp_copy = NULL;
    if (shared_on_timestamp) {
        shared_on_timestamp_copy = malloc(sizeof(int));
        if (shared_on_timestamp_copy) *shared_on_timestamp_copy = *shared_on_timestamp;
    }
    shared_audience_account_t *result = shared_audience_account_create_internal (
        account_id,
        account_name,
        account_type,
        shared_on_timestamp_copy
        );
    if (!result) {
        free(shared_on_timestamp_copy);
    }
    return result;
}

void shared_audience_account_free(shared_audience_account_t *shared_audience_account) {
    if(NULL == shared_audience_account){
        return ;
    }
    if(shared_audience_account->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "shared_audience_account_free");
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
    if (shared_audience_account->account_type) {
        audience_account_type_free(shared_audience_account->account_type);
        shared_audience_account->account_type = NULL;
    }
    if (shared_audience_account->shared_on_timestamp) {
        free(shared_audience_account->shared_on_timestamp);
        shared_audience_account->shared_on_timestamp = NULL;
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
    if (!shared_audience_account->account_type) {
        goto fail;
    }
    cJSON *account_type_local_JSON = audience_account_type_convertToJSON(shared_audience_account->account_type);
    if(account_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "account_type", account_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // shared_audience_account->shared_on_timestamp
    if (!shared_audience_account->shared_on_timestamp) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "shared_on_timestamp", *shared_audience_account->shared_on_timestamp) == NULL) {
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

    char *account_id_local_str = NULL;

    char *account_name_local_str = NULL;

    // define the local variable for shared_audience_account->account_type
    audience_account_type_t *account_type_local_nonprim = NULL;

    // define the local variable for shared_audience_account->shared_on_timestamp
    int *shared_on_timestamp_local_var = NULL;

    // shared_audience_account->account_id
    cJSON *account_id = cJSON_GetObjectItemCaseSensitive(shared_audience_accountJSON, "account_id");
    if (cJSON_IsNull(account_id)) {
        account_id = NULL;
    }
    if (!account_id) {
        goto end;
    }

    
    if(!cJSON_IsString(account_id))
    {
    goto end; //String
    }

    // shared_audience_account->account_name
    cJSON *account_name = cJSON_GetObjectItemCaseSensitive(shared_audience_accountJSON, "account_name");
    if (cJSON_IsNull(account_name)) {
        account_name = NULL;
    }
    if (!account_name) {
        goto end;
    }

    
    if(!cJSON_IsString(account_name))
    {
    goto end; //String
    }

    // shared_audience_account->account_type
    cJSON *account_type = cJSON_GetObjectItemCaseSensitive(shared_audience_accountJSON, "account_type");
    if (cJSON_IsNull(account_type)) {
        account_type = NULL;
    }
    if (!account_type) {
        goto end;
    }

    
    account_type_local_nonprim = audience_account_type_parseFromJSON(account_type); //custom

    // shared_audience_account->shared_on_timestamp
    cJSON *shared_on_timestamp = cJSON_GetObjectItemCaseSensitive(shared_audience_accountJSON, "shared_on_timestamp");
    if (cJSON_IsNull(shared_on_timestamp)) {
        shared_on_timestamp = NULL;
    }
    if (!shared_on_timestamp) {
        goto end;
    }

    
    if(!cJSON_IsNumber(shared_on_timestamp))
    {
    goto end; //Numeric
    }
    shared_on_timestamp_local_var = malloc(sizeof(int));
    if(!shared_on_timestamp_local_var)
    {
        goto end;
    }
    *shared_on_timestamp_local_var = shared_on_timestamp->valuedouble;


    if (account_id && !cJSON_IsNull(account_id)) account_id_local_str = strdup(account_id->valuestring);
    if (account_name && !cJSON_IsNull(account_name)) account_name_local_str = strdup(account_name->valuestring);

    shared_audience_account_local_var = shared_audience_account_create_internal (
        account_id_local_str,
        account_name_local_str,
        account_type_local_nonprim,
        shared_on_timestamp_local_var
        );

    if (!shared_audience_account_local_var) {
        goto end;
    }

    return shared_audience_account_local_var;
end:
    if (account_id_local_str) {
        free(account_id_local_str);
        account_id_local_str = NULL;
    }
    if (account_name_local_str) {
        free(account_name_local_str);
        account_name_local_str = NULL;
    }
    if (account_type_local_nonprim) {
        audience_account_type_free(account_type_local_nonprim);
        account_type_local_nonprim = NULL;
    }
    if (shared_on_timestamp_local_var) {
        free(shared_on_timestamp_local_var);
        shared_on_timestamp_local_var = NULL;
    }
    return NULL;

}
