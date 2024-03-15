#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "terms_of_service.h"



terms_of_service_t *terms_of_service_create(
    char *id,
    char *html,
    int has_accepted,
    char *ad_account_id
    ) {
    terms_of_service_t *terms_of_service_local_var = malloc(sizeof(terms_of_service_t));
    if (!terms_of_service_local_var) {
        return NULL;
    }
    terms_of_service_local_var->id = id;
    terms_of_service_local_var->html = html;
    terms_of_service_local_var->has_accepted = has_accepted;
    terms_of_service_local_var->ad_account_id = ad_account_id;

    return terms_of_service_local_var;
}


void terms_of_service_free(terms_of_service_t *terms_of_service) {
    if(NULL == terms_of_service){
        return ;
    }
    listEntry_t *listEntry;
    if (terms_of_service->id) {
        free(terms_of_service->id);
        terms_of_service->id = NULL;
    }
    if (terms_of_service->html) {
        free(terms_of_service->html);
        terms_of_service->html = NULL;
    }
    if (terms_of_service->ad_account_id) {
        free(terms_of_service->ad_account_id);
        terms_of_service->ad_account_id = NULL;
    }
    free(terms_of_service);
}

cJSON *terms_of_service_convertToJSON(terms_of_service_t *terms_of_service) {
    cJSON *item = cJSON_CreateObject();

    // terms_of_service->id
    if(terms_of_service->id) {
    if(cJSON_AddStringToObject(item, "id", terms_of_service->id) == NULL) {
    goto fail; //String
    }
    }


    // terms_of_service->html
    if(terms_of_service->html) {
    if(cJSON_AddStringToObject(item, "html", terms_of_service->html) == NULL) {
    goto fail; //String
    }
    }


    // terms_of_service->has_accepted
    if(terms_of_service->has_accepted) {
    if(cJSON_AddBoolToObject(item, "has_accepted", terms_of_service->has_accepted) == NULL) {
    goto fail; //Bool
    }
    }


    // terms_of_service->ad_account_id
    if(terms_of_service->ad_account_id) {
    if(cJSON_AddStringToObject(item, "ad_account_id", terms_of_service->ad_account_id) == NULL) {
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

terms_of_service_t *terms_of_service_parseFromJSON(cJSON *terms_of_serviceJSON){

    terms_of_service_t *terms_of_service_local_var = NULL;

    // terms_of_service->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(terms_of_serviceJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // terms_of_service->html
    cJSON *html = cJSON_GetObjectItemCaseSensitive(terms_of_serviceJSON, "html");
    if (html) { 
    if(!cJSON_IsString(html) && !cJSON_IsNull(html))
    {
    goto end; //String
    }
    }

    // terms_of_service->has_accepted
    cJSON *has_accepted = cJSON_GetObjectItemCaseSensitive(terms_of_serviceJSON, "has_accepted");
    if (has_accepted) { 
    if(!cJSON_IsBool(has_accepted))
    {
    goto end; //Bool
    }
    }

    // terms_of_service->ad_account_id
    cJSON *ad_account_id = cJSON_GetObjectItemCaseSensitive(terms_of_serviceJSON, "ad_account_id");
    if (ad_account_id) { 
    if(!cJSON_IsString(ad_account_id) && !cJSON_IsNull(ad_account_id))
    {
    goto end; //String
    }
    }


    terms_of_service_local_var = terms_of_service_create (
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        html && !cJSON_IsNull(html) ? strdup(html->valuestring) : NULL,
        has_accepted ? has_accepted->valueint : 0,
        ad_account_id && !cJSON_IsNull(ad_account_id) ? strdup(ad_account_id->valuestring) : NULL
        );

    return terms_of_service_local_var;
end:
    return NULL;

}
