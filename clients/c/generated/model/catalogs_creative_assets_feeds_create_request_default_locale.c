#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_creative_assets_feeds_create_request_default_locale.h"



static catalogs_creative_assets_feeds_create_request_default_locale_t *catalogs_creative_assets_feeds_create_request_default_locale_create_internal(
    ) {
    catalogs_creative_assets_feeds_create_request_default_locale_t *catalogs_creative_assets_feeds_create_request_default_locale_local_var = malloc(sizeof(catalogs_creative_assets_feeds_create_request_default_locale_t));
    if (!catalogs_creative_assets_feeds_create_request_default_locale_local_var) {
        return NULL;
    }
    memset(catalogs_creative_assets_feeds_create_request_default_locale_local_var, 0, sizeof(catalogs_creative_assets_feeds_create_request_default_locale_t));
    catalogs_creative_assets_feeds_create_request_default_locale_local_var->_library_owned = 1;
    return catalogs_creative_assets_feeds_create_request_default_locale_local_var;
}

__attribute__((deprecated)) catalogs_creative_assets_feeds_create_request_default_locale_t *catalogs_creative_assets_feeds_create_request_default_locale_create(
    ) {
    catalogs_creative_assets_feeds_create_request_default_locale_t *result = catalogs_creative_assets_feeds_create_request_default_locale_create_internal (
        );
    if (!result) {
    }
    return result;
}

void catalogs_creative_assets_feeds_create_request_default_locale_free(catalogs_creative_assets_feeds_create_request_default_locale_t *catalogs_creative_assets_feeds_create_request_default_locale) {
    if(NULL == catalogs_creative_assets_feeds_create_request_default_locale){
        return ;
    }
    if(catalogs_creative_assets_feeds_create_request_default_locale->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_creative_assets_feeds_create_request_default_locale_free");
        return ;
    }
    listEntry_t *listEntry;
    free(catalogs_creative_assets_feeds_create_request_default_locale);
}

cJSON *catalogs_creative_assets_feeds_create_request_default_locale_convertToJSON(catalogs_creative_assets_feeds_create_request_default_locale_t *catalogs_creative_assets_feeds_create_request_default_locale) {
    cJSON *item = cJSON_CreateObject();
    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_creative_assets_feeds_create_request_default_locale_t *catalogs_creative_assets_feeds_create_request_default_locale_parseFromJSON(cJSON *catalogs_creative_assets_feeds_create_request_default_localeJSON){

    catalogs_creative_assets_feeds_create_request_default_locale_t *catalogs_creative_assets_feeds_create_request_default_locale_local_var = NULL;



    catalogs_creative_assets_feeds_create_request_default_locale_local_var = catalogs_creative_assets_feeds_create_request_default_locale_create_internal (
        );

    if (!catalogs_creative_assets_feeds_create_request_default_locale_local_var) {
        goto end;
    }

    return catalogs_creative_assets_feeds_create_request_default_locale_local_var;
end:
    return NULL;

}
