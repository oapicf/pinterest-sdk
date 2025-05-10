#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_items_request_language.h"



static catalogs_items_request_language_t *catalogs_items_request_language_create_internal(
    ) {
    catalogs_items_request_language_t *catalogs_items_request_language_local_var = malloc(sizeof(catalogs_items_request_language_t));
    if (!catalogs_items_request_language_local_var) {
        return NULL;
    }

    catalogs_items_request_language_local_var->_library_owned = 1;
    return catalogs_items_request_language_local_var;
}

__attribute__((deprecated)) catalogs_items_request_language_t *catalogs_items_request_language_create(
    ) {
    return catalogs_items_request_language_create_internal (
        );
}

void catalogs_items_request_language_free(catalogs_items_request_language_t *catalogs_items_request_language) {
    if(NULL == catalogs_items_request_language){
        return ;
    }
    if(catalogs_items_request_language->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_items_request_language_free");
        return ;
    }
    listEntry_t *listEntry;
    free(catalogs_items_request_language);
}

cJSON *catalogs_items_request_language_convertToJSON(catalogs_items_request_language_t *catalogs_items_request_language) {
    cJSON *item = cJSON_CreateObject();
    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_items_request_language_t *catalogs_items_request_language_parseFromJSON(cJSON *catalogs_items_request_languageJSON){

    catalogs_items_request_language_t *catalogs_items_request_language_local_var = NULL;


    catalogs_items_request_language_local_var = catalogs_items_request_language_create_internal (
        );

    return catalogs_items_request_language_local_var;
end:
    return NULL;

}
