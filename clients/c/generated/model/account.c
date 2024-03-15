#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "account.h"


char* account_account_type_ToString(pinterest_rest_api_account_ACCOUNTTYPE_e account_type) {
    char* account_typeArray[] =  { "NULL", "PINNER", "BUSINESS" };
    return account_typeArray[account_type];
}

pinterest_rest_api_account_ACCOUNTTYPE_e account_account_type_FromString(char* account_type){
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
    char *id,
    char *profile_image,
    char *website_url,
    char *username,
    char *about,
    char *business_name,
    int board_count,
    int pin_count,
    int follower_count,
    int following_count,
    int monthly_views
    ) {
    account_t *account_local_var = malloc(sizeof(account_t));
    if (!account_local_var) {
        return NULL;
    }
    account_local_var->account_type = account_type;
    account_local_var->id = id;
    account_local_var->profile_image = profile_image;
    account_local_var->website_url = website_url;
    account_local_var->username = username;
    account_local_var->about = about;
    account_local_var->business_name = business_name;
    account_local_var->board_count = board_count;
    account_local_var->pin_count = pin_count;
    account_local_var->follower_count = follower_count;
    account_local_var->following_count = following_count;
    account_local_var->monthly_views = monthly_views;

    return account_local_var;
}


void account_free(account_t *account) {
    if(NULL == account){
        return ;
    }
    listEntry_t *listEntry;
    if (account->id) {
        free(account->id);
        account->id = NULL;
    }
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
    if (account->about) {
        free(account->about);
        account->about = NULL;
    }
    if (account->business_name) {
        free(account->business_name);
        account->business_name = NULL;
    }
    free(account);
}

cJSON *account_convertToJSON(account_t *account) {
    cJSON *item = cJSON_CreateObject();

    // account->account_type
    if(account->account_type != pinterest_rest_api_account_ACCOUNTTYPE_NULL) {
    if(cJSON_AddStringToObject(item, "account_type", account_typeaccount_ToString(account->account_type)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // account->id
    if(account->id) {
    if(cJSON_AddStringToObject(item, "id", account->id) == NULL) {
    goto fail; //String
    }
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


    // account->about
    if(account->about) {
    if(cJSON_AddStringToObject(item, "about", account->about) == NULL) {
    goto fail; //String
    }
    }


    // account->business_name
    if(account->business_name) {
    if(cJSON_AddStringToObject(item, "business_name", account->business_name) == NULL) {
    goto fail; //String
    }
    }


    // account->board_count
    if(account->board_count) {
    if(cJSON_AddNumberToObject(item, "board_count", account->board_count) == NULL) {
    goto fail; //Numeric
    }
    }


    // account->pin_count
    if(account->pin_count) {
    if(cJSON_AddNumberToObject(item, "pin_count", account->pin_count) == NULL) {
    goto fail; //Numeric
    }
    }


    // account->follower_count
    if(account->follower_count) {
    if(cJSON_AddNumberToObject(item, "follower_count", account->follower_count) == NULL) {
    goto fail; //Numeric
    }
    }


    // account->following_count
    if(account->following_count) {
    if(cJSON_AddNumberToObject(item, "following_count", account->following_count) == NULL) {
    goto fail; //Numeric
    }
    }


    // account->monthly_views
    if(account->monthly_views) {
    if(cJSON_AddNumberToObject(item, "monthly_views", account->monthly_views) == NULL) {
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
    account_typeVariable = account_account_type_FromString(account_type->valuestring);
    }

    // account->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(accountJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // account->profile_image
    cJSON *profile_image = cJSON_GetObjectItemCaseSensitive(accountJSON, "profile_image");
    if (profile_image) { 
    if(!cJSON_IsString(profile_image) && !cJSON_IsNull(profile_image))
    {
    goto end; //String
    }
    }

    // account->website_url
    cJSON *website_url = cJSON_GetObjectItemCaseSensitive(accountJSON, "website_url");
    if (website_url) { 
    if(!cJSON_IsString(website_url) && !cJSON_IsNull(website_url))
    {
    goto end; //String
    }
    }

    // account->username
    cJSON *username = cJSON_GetObjectItemCaseSensitive(accountJSON, "username");
    if (username) { 
    if(!cJSON_IsString(username) && !cJSON_IsNull(username))
    {
    goto end; //String
    }
    }

    // account->about
    cJSON *about = cJSON_GetObjectItemCaseSensitive(accountJSON, "about");
    if (about) { 
    if(!cJSON_IsString(about) && !cJSON_IsNull(about))
    {
    goto end; //String
    }
    }

    // account->business_name
    cJSON *business_name = cJSON_GetObjectItemCaseSensitive(accountJSON, "business_name");
    if (business_name) { 
    if(!cJSON_IsString(business_name) && !cJSON_IsNull(business_name))
    {
    goto end; //String
    }
    }

    // account->board_count
    cJSON *board_count = cJSON_GetObjectItemCaseSensitive(accountJSON, "board_count");
    if (board_count) { 
    if(!cJSON_IsNumber(board_count))
    {
    goto end; //Numeric
    }
    }

    // account->pin_count
    cJSON *pin_count = cJSON_GetObjectItemCaseSensitive(accountJSON, "pin_count");
    if (pin_count) { 
    if(!cJSON_IsNumber(pin_count))
    {
    goto end; //Numeric
    }
    }

    // account->follower_count
    cJSON *follower_count = cJSON_GetObjectItemCaseSensitive(accountJSON, "follower_count");
    if (follower_count) { 
    if(!cJSON_IsNumber(follower_count))
    {
    goto end; //Numeric
    }
    }

    // account->following_count
    cJSON *following_count = cJSON_GetObjectItemCaseSensitive(accountJSON, "following_count");
    if (following_count) { 
    if(!cJSON_IsNumber(following_count))
    {
    goto end; //Numeric
    }
    }

    // account->monthly_views
    cJSON *monthly_views = cJSON_GetObjectItemCaseSensitive(accountJSON, "monthly_views");
    if (monthly_views) { 
    if(!cJSON_IsNumber(monthly_views))
    {
    goto end; //Numeric
    }
    }


    account_local_var = account_create (
        account_type ? account_typeVariable : pinterest_rest_api_account_ACCOUNTTYPE_NULL,
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        profile_image && !cJSON_IsNull(profile_image) ? strdup(profile_image->valuestring) : NULL,
        website_url && !cJSON_IsNull(website_url) ? strdup(website_url->valuestring) : NULL,
        username && !cJSON_IsNull(username) ? strdup(username->valuestring) : NULL,
        about && !cJSON_IsNull(about) ? strdup(about->valuestring) : NULL,
        business_name && !cJSON_IsNull(business_name) ? strdup(business_name->valuestring) : NULL,
        board_count ? board_count->valuedouble : 0,
        pin_count ? pin_count->valuedouble : 0,
        follower_count ? follower_count->valuedouble : 0,
        following_count ? following_count->valuedouble : 0,
        monthly_views ? monthly_views->valuedouble : 0
        );

    return account_local_var;
end:
    return NULL;

}
