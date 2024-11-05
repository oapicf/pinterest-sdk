#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_items_request_language.h"



catalogs_items_request_language_t *catalogs_items_request_language_create(
    ) {
    catalogs_items_request_language_t *catalogs_items_request_language_local_var = malloc(sizeof(catalogs_items_request_language_t));
    if (!catalogs_items_request_language_local_var) {
        return NULL;
    }

    return catalogs_items_request_language_local_var;
}


void catalogs_items_request_language_free(catalogs_items_request_language_t *catalogs_items_request_language) {
    if(NULL == catalogs_items_request_language){
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


    catalogs_items_request_language_local_var = catalogs_items_request_language_create (
        );

    return catalogs_items_request_language_local_var;
end:
    return NULL;

}
