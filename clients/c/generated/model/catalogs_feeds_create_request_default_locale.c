#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_feeds_create_request_default_locale.h"



catalogs_feeds_create_request_default_locale_t *catalogs_feeds_create_request_default_locale_create(
    ) {
    catalogs_feeds_create_request_default_locale_t *catalogs_feeds_create_request_default_locale_local_var = malloc(sizeof(catalogs_feeds_create_request_default_locale_t));
    if (!catalogs_feeds_create_request_default_locale_local_var) {
        return NULL;
    }

    return catalogs_feeds_create_request_default_locale_local_var;
}


void catalogs_feeds_create_request_default_locale_free(catalogs_feeds_create_request_default_locale_t *catalogs_feeds_create_request_default_locale) {
    if(NULL == catalogs_feeds_create_request_default_locale){
        return ;
    }
    listEntry_t *listEntry;
    free(catalogs_feeds_create_request_default_locale);
}

cJSON *catalogs_feeds_create_request_default_locale_convertToJSON(catalogs_feeds_create_request_default_locale_t *catalogs_feeds_create_request_default_locale) {
    cJSON *item = cJSON_CreateObject();
    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_feeds_create_request_default_locale_t *catalogs_feeds_create_request_default_locale_parseFromJSON(cJSON *catalogs_feeds_create_request_default_localeJSON){

    catalogs_feeds_create_request_default_locale_t *catalogs_feeds_create_request_default_locale_local_var = NULL;


    catalogs_feeds_create_request_default_locale_local_var = catalogs_feeds_create_request_default_locale_create (
        );

    return catalogs_feeds_create_request_default_locale_local_var;
end:
    return NULL;

}
