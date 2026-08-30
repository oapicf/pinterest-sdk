#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "account.h"



static account_t *account_create_internal(
    char *about,
    user_account_type_t *account_type,
    int *board_count,
    char *business_name,
    int *follower_count,
    int *following_count,
    char *id,
    int *monthly_views,
    int *pin_count,
    char *profile_image,
    char *username,
    char *website_url
    ) {
    account_t *account_local_var = malloc(sizeof(account_t));
    if (!account_local_var) {
        return NULL;
    }
    memset(account_local_var, 0, sizeof(account_t));
    account_local_var->_library_owned = 1;
    account_local_var->about = about;
    account_local_var->account_type = account_type;
    account_local_var->board_count = board_count;
    account_local_var->business_name = business_name;
    account_local_var->follower_count = follower_count;
    account_local_var->following_count = following_count;
    account_local_var->id = id;
    account_local_var->monthly_views = monthly_views;
    account_local_var->pin_count = pin_count;
    account_local_var->profile_image = profile_image;
    account_local_var->username = username;
    account_local_var->website_url = website_url;
    return account_local_var;
}

__attribute__((deprecated)) account_t *account_create(
    char *about,
    user_account_type_t *account_type,
    int *board_count,
    char *business_name,
    int *follower_count,
    int *following_count,
    char *id,
    int *monthly_views,
    int *pin_count,
    char *profile_image,
    char *username,
    char *website_url
    ) {
    int *board_count_copy = NULL;
    if (board_count) {
        board_count_copy = malloc(sizeof(int));
        if (board_count_copy) *board_count_copy = *board_count;
    }
    int *follower_count_copy = NULL;
    if (follower_count) {
        follower_count_copy = malloc(sizeof(int));
        if (follower_count_copy) *follower_count_copy = *follower_count;
    }
    int *following_count_copy = NULL;
    if (following_count) {
        following_count_copy = malloc(sizeof(int));
        if (following_count_copy) *following_count_copy = *following_count;
    }
    int *monthly_views_copy = NULL;
    if (monthly_views) {
        monthly_views_copy = malloc(sizeof(int));
        if (monthly_views_copy) *monthly_views_copy = *monthly_views;
    }
    int *pin_count_copy = NULL;
    if (pin_count) {
        pin_count_copy = malloc(sizeof(int));
        if (pin_count_copy) *pin_count_copy = *pin_count;
    }
    account_t *result = account_create_internal (
        about,
        account_type,
        board_count_copy,
        business_name,
        follower_count_copy,
        following_count_copy,
        id,
        monthly_views_copy,
        pin_count_copy,
        profile_image,
        username,
        website_url
        );
    if (!result) {
        free(board_count_copy);
        free(follower_count_copy);
        free(following_count_copy);
        free(monthly_views_copy);
        free(pin_count_copy);
    }
    return result;
}

void account_free(account_t *account) {
    if(NULL == account){
        return ;
    }
    if(account->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "account_free");
        return ;
    }
    listEntry_t *listEntry;
    if (account->about) {
        free(account->about);
        account->about = NULL;
    }
    if (account->account_type) {
        user_account_type_free(account->account_type);
        account->account_type = NULL;
    }
    if (account->board_count) {
        free(account->board_count);
        account->board_count = NULL;
    }
    if (account->business_name) {
        free(account->business_name);
        account->business_name = NULL;
    }
    if (account->follower_count) {
        free(account->follower_count);
        account->follower_count = NULL;
    }
    if (account->following_count) {
        free(account->following_count);
        account->following_count = NULL;
    }
    if (account->id) {
        free(account->id);
        account->id = NULL;
    }
    if (account->monthly_views) {
        free(account->monthly_views);
        account->monthly_views = NULL;
    }
    if (account->pin_count) {
        free(account->pin_count);
        account->pin_count = NULL;
    }
    if (account->profile_image) {
        free(account->profile_image);
        account->profile_image = NULL;
    }
    if (account->username) {
        free(account->username);
        account->username = NULL;
    }
    if (account->website_url) {
        free(account->website_url);
        account->website_url = NULL;
    }
    free(account);
}

cJSON *account_convertToJSON(account_t *account) {
    cJSON *item = cJSON_CreateObject();

    // account->about
    if(account->about) {
    if(cJSON_AddStringToObject(item, "about", account->about) == NULL) {
    goto fail; //String
    }
    }


    // account->account_type
    if(account->account_type) {
    cJSON *account_type_local_JSON = user_account_type_convertToJSON(account->account_type);
    if(account_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "account_type", account_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // account->board_count
    if(account->board_count) {
    if(cJSON_AddNumberToObject(item, "board_count", *account->board_count) == NULL) {
    goto fail; //Numeric
    }
    }


    // account->business_name
    if(account->business_name) {
    if(cJSON_AddStringToObject(item, "business_name", account->business_name) == NULL) {
    goto fail; //String
    }
    }


    // account->follower_count
    if(account->follower_count) {
    if(cJSON_AddNumberToObject(item, "follower_count", *account->follower_count) == NULL) {
    goto fail; //Numeric
    }
    }


    // account->following_count
    if(account->following_count) {
    if(cJSON_AddNumberToObject(item, "following_count", *account->following_count) == NULL) {
    goto fail; //Numeric
    }
    }


    // account->id
    if(account->id) {
    if(cJSON_AddStringToObject(item, "id", account->id) == NULL) {
    goto fail; //String
    }
    }


    // account->monthly_views
    if(account->monthly_views) {
    if(cJSON_AddNumberToObject(item, "monthly_views", *account->monthly_views) == NULL) {
    goto fail; //Numeric
    }
    }


    // account->pin_count
    if(account->pin_count) {
    if(cJSON_AddNumberToObject(item, "pin_count", *account->pin_count) == NULL) {
    goto fail; //Numeric
    }
    }


    // account->profile_image
    if(account->profile_image) {
    if(cJSON_AddStringToObject(item, "profile_image", account->profile_image) == NULL) {
    goto fail; //String
    }
    }


    // account->username
    if(account->username) {
    if(cJSON_AddStringToObject(item, "username", account->username) == NULL) {
    goto fail; //String
    }
    }


    // account->website_url
    if(account->website_url) {
    if(cJSON_AddStringToObject(item, "website_url", account->website_url) == NULL) {
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

    char *about_local_str = NULL;

    // define the local variable for account->account_type
    user_account_type_t *account_type_local_nonprim = NULL;

    // define the local variable for account->board_count
    int *board_count_local_var = NULL;

    char *business_name_local_str = NULL;

    // define the local variable for account->follower_count
    int *follower_count_local_var = NULL;

    // define the local variable for account->following_count
    int *following_count_local_var = NULL;

    char *id_local_str = NULL;

    // define the local variable for account->monthly_views
    int *monthly_views_local_var = NULL;

    // define the local variable for account->pin_count
    int *pin_count_local_var = NULL;

    char *profile_image_local_str = NULL;

    char *username_local_str = NULL;

    char *website_url_local_str = NULL;

    // account->about
    cJSON *about = cJSON_GetObjectItemCaseSensitive(accountJSON, "about");
    if (cJSON_IsNull(about)) {
        about = NULL;
    }
    if (about) { 
    if(!cJSON_IsString(about) && !cJSON_IsNull(about))
    {
    goto end; //String
    }
    }

    // account->account_type
    cJSON *account_type = cJSON_GetObjectItemCaseSensitive(accountJSON, "account_type");
    if (cJSON_IsNull(account_type)) {
        account_type = NULL;
    }
    if (account_type) { 
    account_type_local_nonprim = user_account_type_parseFromJSON(account_type); //custom
    }

    // account->board_count
    cJSON *board_count = cJSON_GetObjectItemCaseSensitive(accountJSON, "board_count");
    if (cJSON_IsNull(board_count)) {
        board_count = NULL;
    }
    if (board_count) { 
    if(!cJSON_IsNumber(board_count))
    {
    goto end; //Numeric
    }
    board_count_local_var = malloc(sizeof(int));
    if(!board_count_local_var)
    {
        goto end;
    }
    *board_count_local_var = board_count->valuedouble;
    }

    // account->business_name
    cJSON *business_name = cJSON_GetObjectItemCaseSensitive(accountJSON, "business_name");
    if (cJSON_IsNull(business_name)) {
        business_name = NULL;
    }
    if (business_name) { 
    if(!cJSON_IsString(business_name) && !cJSON_IsNull(business_name))
    {
    goto end; //String
    }
    }

    // account->follower_count
    cJSON *follower_count = cJSON_GetObjectItemCaseSensitive(accountJSON, "follower_count");
    if (cJSON_IsNull(follower_count)) {
        follower_count = NULL;
    }
    if (follower_count) { 
    if(!cJSON_IsNumber(follower_count))
    {
    goto end; //Numeric
    }
    follower_count_local_var = malloc(sizeof(int));
    if(!follower_count_local_var)
    {
        goto end;
    }
    *follower_count_local_var = follower_count->valuedouble;
    }

    // account->following_count
    cJSON *following_count = cJSON_GetObjectItemCaseSensitive(accountJSON, "following_count");
    if (cJSON_IsNull(following_count)) {
        following_count = NULL;
    }
    if (following_count) { 
    if(!cJSON_IsNumber(following_count))
    {
    goto end; //Numeric
    }
    following_count_local_var = malloc(sizeof(int));
    if(!following_count_local_var)
    {
        goto end;
    }
    *following_count_local_var = following_count->valuedouble;
    }

    // account->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(accountJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // account->monthly_views
    cJSON *monthly_views = cJSON_GetObjectItemCaseSensitive(accountJSON, "monthly_views");
    if (cJSON_IsNull(monthly_views)) {
        monthly_views = NULL;
    }
    if (monthly_views) { 
    if(!cJSON_IsNumber(monthly_views))
    {
    goto end; //Numeric
    }
    monthly_views_local_var = malloc(sizeof(int));
    if(!monthly_views_local_var)
    {
        goto end;
    }
    *monthly_views_local_var = monthly_views->valuedouble;
    }

    // account->pin_count
    cJSON *pin_count = cJSON_GetObjectItemCaseSensitive(accountJSON, "pin_count");
    if (cJSON_IsNull(pin_count)) {
        pin_count = NULL;
    }
    if (pin_count) { 
    if(!cJSON_IsNumber(pin_count))
    {
    goto end; //Numeric
    }
    pin_count_local_var = malloc(sizeof(int));
    if(!pin_count_local_var)
    {
        goto end;
    }
    *pin_count_local_var = pin_count->valuedouble;
    }

    // account->profile_image
    cJSON *profile_image = cJSON_GetObjectItemCaseSensitive(accountJSON, "profile_image");
    if (cJSON_IsNull(profile_image)) {
        profile_image = NULL;
    }
    if (profile_image) { 
    if(!cJSON_IsString(profile_image) && !cJSON_IsNull(profile_image))
    {
    goto end; //String
    }
    }

    // account->username
    cJSON *username = cJSON_GetObjectItemCaseSensitive(accountJSON, "username");
    if (cJSON_IsNull(username)) {
        username = NULL;
    }
    if (username) { 
    if(!cJSON_IsString(username) && !cJSON_IsNull(username))
    {
    goto end; //String
    }
    }

    // account->website_url
    cJSON *website_url = cJSON_GetObjectItemCaseSensitive(accountJSON, "website_url");
    if (cJSON_IsNull(website_url)) {
        website_url = NULL;
    }
    if (website_url) { 
    if(!cJSON_IsString(website_url) && !cJSON_IsNull(website_url))
    {
    goto end; //String
    }
    }


    if (about && !cJSON_IsNull(about)) about_local_str = strdup(about->valuestring);
    if (business_name && !cJSON_IsNull(business_name)) business_name_local_str = strdup(business_name->valuestring);
    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (profile_image && !cJSON_IsNull(profile_image)) profile_image_local_str = strdup(profile_image->valuestring);
    if (username && !cJSON_IsNull(username)) username_local_str = strdup(username->valuestring);
    if (website_url && !cJSON_IsNull(website_url)) website_url_local_str = strdup(website_url->valuestring);

    account_local_var = account_create_internal (
        about_local_str,
        account_type ? account_type_local_nonprim : NULL,
        board_count_local_var,
        business_name_local_str,
        follower_count_local_var,
        following_count_local_var,
        id_local_str,
        monthly_views_local_var,
        pin_count_local_var,
        profile_image_local_str,
        username_local_str,
        website_url_local_str
        );

    if (!account_local_var) {
        goto end;
    }

    return account_local_var;
end:
    if (about_local_str) {
        free(about_local_str);
        about_local_str = NULL;
    }
    if (account_type_local_nonprim) {
        user_account_type_free(account_type_local_nonprim);
        account_type_local_nonprim = NULL;
    }
    if (board_count_local_var) {
        free(board_count_local_var);
        board_count_local_var = NULL;
    }
    if (business_name_local_str) {
        free(business_name_local_str);
        business_name_local_str = NULL;
    }
    if (follower_count_local_var) {
        free(follower_count_local_var);
        follower_count_local_var = NULL;
    }
    if (following_count_local_var) {
        free(following_count_local_var);
        following_count_local_var = NULL;
    }
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (monthly_views_local_var) {
        free(monthly_views_local_var);
        monthly_views_local_var = NULL;
    }
    if (pin_count_local_var) {
        free(pin_count_local_var);
        pin_count_local_var = NULL;
    }
    if (profile_image_local_str) {
        free(profile_image_local_str);
        profile_image_local_str = NULL;
    }
    if (username_local_str) {
        free(username_local_str);
        username_local_str = NULL;
    }
    if (website_url_local_str) {
        free(website_url_local_str);
        website_url_local_str = NULL;
    }
    return NULL;

}
