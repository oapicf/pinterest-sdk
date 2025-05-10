#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_feeds_create_request_default_locale.h"



static catalogs_feeds_create_request_default_locale_t *catalogs_feeds_create_request_default_locale_create_internal(
    ) {
    catalogs_feeds_create_request_default_locale_t *catalogs_feeds_create_request_default_locale_local_var = malloc(sizeof(catalogs_feeds_create_request_default_locale_t));
    if (!catalogs_feeds_create_request_default_locale_local_var) {
        return NULL;
    }

    catalogs_feeds_create_request_default_locale_local_var->_library_owned = 1;
    return catalogs_feeds_create_request_default_locale_local_var;
}

__attribute__((deprecated)) catalogs_feeds_create_request_default_locale_t *catalogs_feeds_create_request_default_locale_create(
    ) {
    return catalogs_feeds_create_request_default_locale_create_internal (
        );
}

void catalogs_feeds_create_request_default_locale_free(catalogs_feeds_create_request_default_locale_t *catalogs_feeds_create_request_default_locale) {
    if(NULL == catalogs_feeds_create_request_default_locale){
        return ;
    }
    if(catalogs_feeds_create_request_default_locale->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_feeds_create_request_default_locale_free");
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


    catalogs_feeds_create_request_default_locale_local_var = catalogs_feeds_create_request_default_locale_create_internal (
        );

    return catalogs_feeds_create_request_default_locale_local_var;
end:
    return NULL;

}
