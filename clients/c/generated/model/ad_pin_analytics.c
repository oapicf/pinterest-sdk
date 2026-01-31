#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_pin_analytics.h"



static ad_pin_analytics_t *ad_pin_analytics_create_internal(
    char *date,
    char *pin_id
    ) {
    ad_pin_analytics_t *ad_pin_analytics_local_var = malloc(sizeof(ad_pin_analytics_t));
    if (!ad_pin_analytics_local_var) {
        return NULL;
    }
    ad_pin_analytics_local_var->date = date;
    ad_pin_analytics_local_var->pin_id = pin_id;

    ad_pin_analytics_local_var->_library_owned = 1;
    return ad_pin_analytics_local_var;
}

__attribute__((deprecated)) ad_pin_analytics_t *ad_pin_analytics_create(
    char *date,
    char *pin_id
    ) {
    return ad_pin_analytics_create_internal (
        date,
        pin_id
        );
}

void ad_pin_analytics_free(ad_pin_analytics_t *ad_pin_analytics) {
    if(NULL == ad_pin_analytics){
        return ;
    }
    if(ad_pin_analytics->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ad_pin_analytics_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ad_pin_analytics->date) {
        free(ad_pin_analytics->date);
        ad_pin_analytics->date = NULL;
    }
    if (ad_pin_analytics->pin_id) {
        free(ad_pin_analytics->pin_id);
        ad_pin_analytics->pin_id = NULL;
    }
    free(ad_pin_analytics);
}

cJSON *ad_pin_analytics_convertToJSON(ad_pin_analytics_t *ad_pin_analytics) {
    cJSON *item = cJSON_CreateObject();

    // ad_pin_analytics->date
    if(ad_pin_analytics->date) {
    if(cJSON_AddStringToObject(item, "DATE", ad_pin_analytics->date) == NULL) {
    goto fail; //Date
    }
    }


    // ad_pin_analytics->pin_id
    if (!ad_pin_analytics->pin_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "PIN_ID", ad_pin_analytics->pin_id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

ad_pin_analytics_t *ad_pin_analytics_parseFromJSON(cJSON *ad_pin_analyticsJSON){

    ad_pin_analytics_t *ad_pin_analytics_local_var = NULL;

    // ad_pin_analytics->date
    cJSON *date = cJSON_GetObjectItemCaseSensitive(ad_pin_analyticsJSON, "DATE");
    if (cJSON_IsNull(date)) {
        date = NULL;
    }
    if (date) { 
    if(!cJSON_IsString(date))
    {
    goto end; //Date
    }
    }

    // ad_pin_analytics->pin_id
    cJSON *pin_id = cJSON_GetObjectItemCaseSensitive(ad_pin_analyticsJSON, "PIN_ID");
    if (cJSON_IsNull(pin_id)) {
        pin_id = NULL;
    }
    if (!pin_id) {
        goto end;
    }

    
    if(!cJSON_IsString(pin_id))
    {
    goto end; //String
    }


    ad_pin_analytics_local_var = ad_pin_analytics_create_internal (
        date ? strdup(date->valuestring) : NULL,
        strdup(pin_id->valuestring)
        );

    return ad_pin_analytics_local_var;
end:
    return NULL;

}
