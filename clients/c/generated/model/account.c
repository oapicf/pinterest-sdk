#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "account.h"


char* account_typeaccount_ToString(pinterest_rest_api_account_ACCOUNTTYPE_e account_type) {
    char* account_typeArray[] =  { "NULL", "PINNER", "BUSINESS" };
	return account_typeArray[account_type];
}

pinterest_rest_api_account_ACCOUNTTYPE_e account_typeaccount_FromString(char* account_type){
    int stringToReturn = 0;
    char *account_typeArray[] =  { "NULL", "PINNER", "BUSINESS" };
    size_t sizeofArray = sizeof(account_typeArray) / sizeof(account_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(account_type, account_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

account_t *account_create(
    pinterest_rest_api_account_ACCOUNTTYPE_e account_type,
    char *profile_image,
    char *website_url,
    char *username
    ) {
    account_t *account_local_var = malloc(sizeof(account_t));
    if (!account_local_var) {
        return NULL;
    }
    account_local_var->account_type = account_type;
    account_local_var->profile_image = profile_image;
    account_local_var->website_url = website_url;
    account_local_var->username = username;

    return account_local_var;
}


void account_free(account_t *account) {
    if(NULL == account){
        return ;
    }
    listEntry_t *listEntry;
    if (account->profile_image) {
        free(account->profile_image);
        account->profile_image = NULL;
    }
    if (account->website_url) {
        free(account->website_url);
        account->website_url = NULL;
    }
    if (account->username) {
        free(account->username);
        account->username = NULL;
    }
    free(account);
}

cJSON *account_convertToJSON(account_t *account) {
    cJSON *item = cJSON_CreateObject();

    // account->account_type
    
    if(cJSON_AddStringToObject(item, "account_type", account_typeaccount_ToString(account->account_type)) == NULL)
    {
    goto fail; //Enum
    }
    


    // account->profile_image
    if(account->profile_image) { 
    if(cJSON_AddStringToObject(item, "profile_image", account->profile_image) == NULL) {
    goto fail; //String
    }
     } 


    // account->website_url
    if(account->website_url) { 
    if(cJSON_AddStringToObject(item, "website_url", account->website_url) == NULL) {
    goto fail; //String
    }
     } 


    // account->username
    if(account->username) { 
    if(cJSON_AddStringToObject(item, "username", account->username) == NULL) {
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

account_t *account_parseFromJSON(cJSON *accountJSON){

    account_t *account_local_var = NULL;

    // account->account_type
    cJSON *account_type = cJSON_GetObjectItemCaseSensitive(accountJSON, "account_type");
    pinterest_rest_api_account_ACCOUNTTYPE_e account_typeVariable;
    if (account_type) { 
    if(!cJSON_IsString(account_type))
    {
    goto end; //Enum
    }
    account_typeVariable = account_typeaccount_FromString(account_type->valuestring);
    }

    // account->profile_image
    cJSON *profile_image = cJSON_GetObjectItemCaseSensitive(accountJSON, "profile_image");
    if (profile_image) { 
    if(!cJSON_IsString(profile_image))
    {
    goto end; //String
    }
    }

    // account->website_url
    cJSON *website_url = cJSON_GetObjectItemCaseSensitive(accountJSON, "website_url");
    if (website_url) { 
    if(!cJSON_IsString(website_url))
    {
    goto end; //String
    }
    }

    // account->username
    cJSON *username = cJSON_GetObjectItemCaseSensitive(accountJSON, "username");
    if (username) { 
    if(!cJSON_IsString(username))
    {
    goto end; //String
    }
    }


    account_local_var = account_create (
        account_type ? account_typeVariable : -1,
        profile_image ? strdup(profile_image->valuestring) : NULL,
        website_url ? strdup(website_url->valuestring) : NULL,
        username ? strdup(username->valuestring) : NULL
        );

    return account_local_var;
end:
    return NULL;

}
