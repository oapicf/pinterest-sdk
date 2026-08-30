#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "leads_exports_create.h"



static leads_exports_create_t *leads_exports_create_create_internal(
    char *ad_id,
    char *end_date,
    char *start_date
    ) {
    leads_exports_create_t *leads_exports_create_local_var = malloc(sizeof(leads_exports_create_t));
    if (!leads_exports_create_local_var) {
        return NULL;
    }
    memset(leads_exports_create_local_var, 0, sizeof(leads_exports_create_t));
    leads_exports_create_local_var->_library_owned = 1;
    leads_exports_create_local_var->ad_id = ad_id;
    leads_exports_create_local_var->end_date = end_date;
    leads_exports_create_local_var->start_date = start_date;
    return leads_exports_create_local_var;
}

__attribute__((deprecated)) leads_exports_create_t *leads_exports_create_create(
    char *ad_id,
    char *end_date,
    char *start_date
    ) {
    leads_exports_create_t *result = leads_exports_create_create_internal (
        ad_id,
        end_date,
        start_date
        );
    if (!result) {
    }
    return result;
}

void leads_exports_create_free(leads_exports_create_t *leads_exports_create) {
    if(NULL == leads_exports_create){
        return ;
    }
    if(leads_exports_create->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "leads_exports_create_free");
        return ;
    }
    listEntry_t *listEntry;
    if (leads_exports_create->ad_id) {
        free(leads_exports_create->ad_id);
        leads_exports_create->ad_id = NULL;
    }
    if (leads_exports_create->end_date) {
        free(leads_exports_create->end_date);
        leads_exports_create->end_date = NULL;
    }
    if (leads_exports_create->start_date) {
        free(leads_exports_create->start_date);
        leads_exports_create->start_date = NULL;
    }
    free(leads_exports_create);
}

cJSON *leads_exports_create_convertToJSON(leads_exports_create_t *leads_exports_create) {
    cJSON *item = cJSON_CreateObject();

    // leads_exports_create->ad_id
    if (!leads_exports_create->ad_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "ad_id", leads_exports_create->ad_id) == NULL) {
    goto fail; //String
    }


    // leads_exports_create->end_date
    if (!leads_exports_create->end_date) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "end_date", leads_exports_create->end_date) == NULL) {
    goto fail; //String
    }


    // leads_exports_create->start_date
    if (!leads_exports_create->start_date) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "start_date", leads_exports_create->start_date) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

leads_exports_create_t *leads_exports_create_parseFromJSON(cJSON *leads_exports_createJSON){

    leads_exports_create_t *leads_exports_create_local_var = NULL;

    char *ad_id_local_str = NULL;

    char *end_date_local_str = NULL;

    char *start_date_local_str = NULL;

    // leads_exports_create->ad_id
    cJSON *ad_id = cJSON_GetObjectItemCaseSensitive(leads_exports_createJSON, "ad_id");
    if (cJSON_IsNull(ad_id)) {
        ad_id = NULL;
    }
    if (!ad_id) {
        goto end;
    }

    
    if(!cJSON_IsString(ad_id))
    {
    goto end; //String
    }

    // leads_exports_create->end_date
    cJSON *end_date = cJSON_GetObjectItemCaseSensitive(leads_exports_createJSON, "end_date");
    if (cJSON_IsNull(end_date)) {
        end_date = NULL;
    }
    if (!end_date) {
        goto end;
    }

    
    if(!cJSON_IsString(end_date))
    {
    goto end; //String
    }

    // leads_exports_create->start_date
    cJSON *start_date = cJSON_GetObjectItemCaseSensitive(leads_exports_createJSON, "start_date");
    if (cJSON_IsNull(start_date)) {
        start_date = NULL;
    }
    if (!start_date) {
        goto end;
    }

    
    if(!cJSON_IsString(start_date))
    {
    goto end; //String
    }


    if (ad_id && !cJSON_IsNull(ad_id)) ad_id_local_str = strdup(ad_id->valuestring);
    if (end_date && !cJSON_IsNull(end_date)) end_date_local_str = strdup(end_date->valuestring);
    if (start_date && !cJSON_IsNull(start_date)) start_date_local_str = strdup(start_date->valuestring);

    leads_exports_create_local_var = leads_exports_create_create_internal (
        ad_id_local_str,
        end_date_local_str,
        start_date_local_str
        );

    if (!leads_exports_create_local_var) {
        goto end;
    }

    return leads_exports_create_local_var;
end:
    if (ad_id_local_str) {
        free(ad_id_local_str);
        ad_id_local_str = NULL;
    }
    if (end_date_local_str) {
        free(end_date_local_str);
        end_date_local_str = NULL;
    }
    if (start_date_local_str) {
        free(start_date_local_str);
        start_date_local_str = NULL;
    }
    return NULL;

}
