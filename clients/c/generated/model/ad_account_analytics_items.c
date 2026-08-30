#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_account_analytics_items.h"



static ad_account_analytics_items_t *ad_account_analytics_items_create_internal(
    char *ad_account_id,
    char *date
    ) {
    ad_account_analytics_items_t *ad_account_analytics_items_local_var = malloc(sizeof(ad_account_analytics_items_t));
    if (!ad_account_analytics_items_local_var) {
        return NULL;
    }
    memset(ad_account_analytics_items_local_var, 0, sizeof(ad_account_analytics_items_t));
    ad_account_analytics_items_local_var->_library_owned = 1;
    ad_account_analytics_items_local_var->ad_account_id = ad_account_id;
    ad_account_analytics_items_local_var->date = date;
    return ad_account_analytics_items_local_var;
}

__attribute__((deprecated)) ad_account_analytics_items_t *ad_account_analytics_items_create(
    char *ad_account_id,
    char *date
    ) {
    ad_account_analytics_items_t *result = ad_account_analytics_items_create_internal (
        ad_account_id,
        date
        );
    if (!result) {
    }
    return result;
}

void ad_account_analytics_items_free(ad_account_analytics_items_t *ad_account_analytics_items) {
    if(NULL == ad_account_analytics_items){
        return ;
    }
    if(ad_account_analytics_items->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ad_account_analytics_items_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ad_account_analytics_items->ad_account_id) {
        free(ad_account_analytics_items->ad_account_id);
        ad_account_analytics_items->ad_account_id = NULL;
    }
    if (ad_account_analytics_items->date) {
        free(ad_account_analytics_items->date);
        ad_account_analytics_items->date = NULL;
    }
    free(ad_account_analytics_items);
}

cJSON *ad_account_analytics_items_convertToJSON(ad_account_analytics_items_t *ad_account_analytics_items) {
    cJSON *item = cJSON_CreateObject();

    // ad_account_analytics_items->ad_account_id
    if (!ad_account_analytics_items->ad_account_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "AD_ACCOUNT_ID", ad_account_analytics_items->ad_account_id) == NULL) {
    goto fail; //String
    }


    // ad_account_analytics_items->date
    if(ad_account_analytics_items->date) {
    if(cJSON_AddStringToObject(item, "DATE", ad_account_analytics_items->date) == NULL) {
    goto fail; //Date
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

ad_account_analytics_items_t *ad_account_analytics_items_parseFromJSON(cJSON *ad_account_analytics_itemsJSON){

    ad_account_analytics_items_t *ad_account_analytics_items_local_var = NULL;

    char *ad_account_id_local_str = NULL;

    char *date_local_str = NULL;

    // ad_account_analytics_items->ad_account_id
    cJSON *ad_account_id = cJSON_GetObjectItemCaseSensitive(ad_account_analytics_itemsJSON, "AD_ACCOUNT_ID");
    if (cJSON_IsNull(ad_account_id)) {
        ad_account_id = NULL;
    }
    if (!ad_account_id) {
        goto end;
    }

    
    if(!cJSON_IsString(ad_account_id))
    {
    goto end; //String
    }

    // ad_account_analytics_items->date
    cJSON *date = cJSON_GetObjectItemCaseSensitive(ad_account_analytics_itemsJSON, "DATE");
    if (cJSON_IsNull(date)) {
        date = NULL;
    }
    if (date) { 
    if(!cJSON_IsString(date))
    {
    goto end; //Date
    }
    }


    if (ad_account_id && !cJSON_IsNull(ad_account_id)) ad_account_id_local_str = strdup(ad_account_id->valuestring);
    if (date) date_local_str = strdup(date->valuestring);

    ad_account_analytics_items_local_var = ad_account_analytics_items_create_internal (
        ad_account_id_local_str,
        date_local_str
        );

    if (!ad_account_analytics_items_local_var) {
        goto end;
    }

    return ad_account_analytics_items_local_var;
end:
    if (ad_account_id_local_str) {
        free(ad_account_id_local_str);
        ad_account_id_local_str = NULL;
    }
    if (date_local_str) {
        free(date_local_str);
        date_local_str = NULL;
    }
    return NULL;

}
