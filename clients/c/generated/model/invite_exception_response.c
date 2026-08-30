#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "invite_exception_response.h"



static invite_exception_response_t *invite_exception_response_create_internal(
    int *code,
    char *invite_or_request_id,
    char *message,
    list_t *users_or_partner_ids
    ) {
    invite_exception_response_t *invite_exception_response_local_var = malloc(sizeof(invite_exception_response_t));
    if (!invite_exception_response_local_var) {
        return NULL;
    }
    memset(invite_exception_response_local_var, 0, sizeof(invite_exception_response_t));
    invite_exception_response_local_var->_library_owned = 1;
    invite_exception_response_local_var->code = code;
    invite_exception_response_local_var->invite_or_request_id = invite_or_request_id;
    invite_exception_response_local_var->message = message;
    invite_exception_response_local_var->users_or_partner_ids = users_or_partner_ids;
    return invite_exception_response_local_var;
}

__attribute__((deprecated)) invite_exception_response_t *invite_exception_response_create(
    int *code,
    char *invite_or_request_id,
    char *message,
    list_t *users_or_partner_ids
    ) {
    int *code_copy = NULL;
    if (code) {
        code_copy = malloc(sizeof(int));
        if (code_copy) *code_copy = *code;
    }
    invite_exception_response_t *result = invite_exception_response_create_internal (
        code_copy,
        invite_or_request_id,
        message,
        users_or_partner_ids
        );
    if (!result) {
        free(code_copy);
    }
    return result;
}

void invite_exception_response_free(invite_exception_response_t *invite_exception_response) {
    if(NULL == invite_exception_response){
        return ;
    }
    if(invite_exception_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "invite_exception_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (invite_exception_response->code) {
        free(invite_exception_response->code);
        invite_exception_response->code = NULL;
    }
    if (invite_exception_response->invite_or_request_id) {
        free(invite_exception_response->invite_or_request_id);
        invite_exception_response->invite_or_request_id = NULL;
    }
    if (invite_exception_response->message) {
        free(invite_exception_response->message);
        invite_exception_response->message = NULL;
    }
    if (invite_exception_response->users_or_partner_ids) {
        list_ForEach(listEntry, invite_exception_response->users_or_partner_ids) {
            free(listEntry->data);
        }
        list_freeList(invite_exception_response->users_or_partner_ids);
        invite_exception_response->users_or_partner_ids = NULL;
    }
    free(invite_exception_response);
}

cJSON *invite_exception_response_convertToJSON(invite_exception_response_t *invite_exception_response) {
    cJSON *item = cJSON_CreateObject();

    // invite_exception_response->code
    if(invite_exception_response->code) {
    if(cJSON_AddNumberToObject(item, "code", *invite_exception_response->code) == NULL) {
    goto fail; //Numeric
    }
    }


    // invite_exception_response->invite_or_request_id
    if(invite_exception_response->invite_or_request_id) {
    if(cJSON_AddStringToObject(item, "invite_or_request_id", invite_exception_response->invite_or_request_id) == NULL) {
    goto fail; //String
    }
    }


    // invite_exception_response->message
    if(invite_exception_response->message) {
    if(cJSON_AddStringToObject(item, "message", invite_exception_response->message) == NULL) {
    goto fail; //String
    }
    }


    // invite_exception_response->users_or_partner_ids
    if(invite_exception_response->users_or_partner_ids) {
    cJSON *users_or_partner_ids = cJSON_AddArrayToObject(item, "users_or_partner_ids");
    if(users_or_partner_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *users_or_partner_idsListEntry;
    list_ForEach(users_or_partner_idsListEntry, invite_exception_response->users_or_partner_ids) {
    if(cJSON_AddStringToObject(users_or_partner_ids, "", users_or_partner_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

invite_exception_response_t *invite_exception_response_parseFromJSON(cJSON *invite_exception_responseJSON){

    invite_exception_response_t *invite_exception_response_local_var = NULL;

    // define the local variable for invite_exception_response->code
    int *code_local_var = NULL;

    char *invite_or_request_id_local_str = NULL;

    char *message_local_str = NULL;

    // define the local list for invite_exception_response->users_or_partner_ids
    list_t *users_or_partner_idsList = NULL;

    // invite_exception_response->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(invite_exception_responseJSON, "code");
    if (cJSON_IsNull(code)) {
        code = NULL;
    }
    if (code) { 
    if(!cJSON_IsNumber(code))
    {
    goto end; //Numeric
    }
    code_local_var = malloc(sizeof(int));
    if(!code_local_var)
    {
        goto end;
    }
    *code_local_var = code->valuedouble;
    }

    // invite_exception_response->invite_or_request_id
    cJSON *invite_or_request_id = cJSON_GetObjectItemCaseSensitive(invite_exception_responseJSON, "invite_or_request_id");
    if (cJSON_IsNull(invite_or_request_id)) {
        invite_or_request_id = NULL;
    }
    if (invite_or_request_id) { 
    if(!cJSON_IsString(invite_or_request_id) && !cJSON_IsNull(invite_or_request_id))
    {
    goto end; //String
    }
    }

    // invite_exception_response->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(invite_exception_responseJSON, "message");
    if (cJSON_IsNull(message)) {
        message = NULL;
    }
    if (message) { 
    if(!cJSON_IsString(message) && !cJSON_IsNull(message))
    {
    goto end; //String
    }
    }

    // invite_exception_response->users_or_partner_ids
    cJSON *users_or_partner_ids = cJSON_GetObjectItemCaseSensitive(invite_exception_responseJSON, "users_or_partner_ids");
    if (cJSON_IsNull(users_or_partner_ids)) {
        users_or_partner_ids = NULL;
    }
    if (users_or_partner_ids) { 
    cJSON *users_or_partner_ids_local = NULL;
    if(!cJSON_IsArray(users_or_partner_ids)) {
        goto end;//primitive container
    }
    users_or_partner_idsList = list_createList();

    cJSON_ArrayForEach(users_or_partner_ids_local, users_or_partner_ids)
    {
        if(!cJSON_IsString(users_or_partner_ids_local))
        {
            goto end;
        }
        list_addElement(users_or_partner_idsList , strdup(users_or_partner_ids_local->valuestring));
    }
    }


    if (invite_or_request_id && !cJSON_IsNull(invite_or_request_id)) invite_or_request_id_local_str = strdup(invite_or_request_id->valuestring);
    if (message && !cJSON_IsNull(message)) message_local_str = strdup(message->valuestring);

    invite_exception_response_local_var = invite_exception_response_create_internal (
        code_local_var,
        invite_or_request_id_local_str,
        message_local_str,
        users_or_partner_ids ? users_or_partner_idsList : NULL
        );

    if (!invite_exception_response_local_var) {
        goto end;
    }

    return invite_exception_response_local_var;
end:
    if (code_local_var) {
        free(code_local_var);
        code_local_var = NULL;
    }
    if (invite_or_request_id_local_str) {
        free(invite_or_request_id_local_str);
        invite_or_request_id_local_str = NULL;
    }
    if (message_local_str) {
        free(message_local_str);
        message_local_str = NULL;
    }
    if (users_or_partner_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, users_or_partner_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(users_or_partner_idsList);
        users_or_partner_idsList = NULL;
    }
    return NULL;

}
