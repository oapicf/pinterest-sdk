#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_ai_content_disclosure.h"


char* catalogs_ai_content_disclosure_disclosure_ToString(pinterest_rest_api_catalogs_ai_content_disclosure__e disclosure) {
    char *disclosureArray[] =  { "NULL", "ai_modified", "synthetic_performer" };
    return disclosureArray[disclosure - 1];
}

pinterest_rest_api_catalogs_ai_content_disclosure__e catalogs_ai_content_disclosure_disclosure_FromString(char* disclosure) {
    int stringToReturn = 0;
    char *disclosureArray[] =  { "NULL", "ai_modified", "synthetic_performer" };
    size_t sizeofArray = sizeof(disclosureArray) / sizeof(disclosureArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(disclosure, disclosureArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

static catalogs_ai_content_disclosure_t *catalogs_ai_content_disclosure_create_internal(
    list_t *disclosure,
    char *url
    ) {
    catalogs_ai_content_disclosure_t *catalogs_ai_content_disclosure_local_var = malloc(sizeof(catalogs_ai_content_disclosure_t));
    if (!catalogs_ai_content_disclosure_local_var) {
        return NULL;
    }
    memset(catalogs_ai_content_disclosure_local_var, 0, sizeof(catalogs_ai_content_disclosure_t));
    catalogs_ai_content_disclosure_local_var->_library_owned = 1;
    catalogs_ai_content_disclosure_local_var->disclosure = disclosure;
    catalogs_ai_content_disclosure_local_var->url = url;
    return catalogs_ai_content_disclosure_local_var;
}

__attribute__((deprecated)) catalogs_ai_content_disclosure_t *catalogs_ai_content_disclosure_create(
    list_t *disclosure,
    char *url
    ) {
    catalogs_ai_content_disclosure_t *result = catalogs_ai_content_disclosure_create_internal (
        disclosure,
        url
        );
    if (!result) {
    }
    return result;
}

void catalogs_ai_content_disclosure_free(catalogs_ai_content_disclosure_t *catalogs_ai_content_disclosure) {
    if(NULL == catalogs_ai_content_disclosure){
        return ;
    }
    if(catalogs_ai_content_disclosure->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_ai_content_disclosure_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_ai_content_disclosure->disclosure) {
        list_ForEach(listEntry, catalogs_ai_content_disclosure->disclosure) {
            catalogs_ai_content_disclosure_label_free(listEntry->data);
        }
        list_freeList(catalogs_ai_content_disclosure->disclosure);
        catalogs_ai_content_disclosure->disclosure = NULL;
    }
    if (catalogs_ai_content_disclosure->url) {
        free(catalogs_ai_content_disclosure->url);
        catalogs_ai_content_disclosure->url = NULL;
    }
    free(catalogs_ai_content_disclosure);
}

cJSON *catalogs_ai_content_disclosure_convertToJSON(catalogs_ai_content_disclosure_t *catalogs_ai_content_disclosure) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_ai_content_disclosure->disclosure
    if (pinterest_rest_api_list_DISCLOSURE_NULL == catalogs_ai_content_disclosure->disclosure) {
        goto fail;
    }
    cJSON *disclosure = cJSON_AddArrayToObject(item, "disclosure");
    if(disclosure == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *disclosureListEntry;
    if (catalogs_ai_content_disclosure->disclosure) {
    list_ForEach(disclosureListEntry, catalogs_ai_content_disclosure->disclosure) {
    cJSON *itemLocal = catalogs_ai_content_disclosure_label_convertToJSON((pinterest_rest_api_catalogs_ai_content_disclosure__e)disclosureListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(disclosure, itemLocal);
    }
    }


    // catalogs_ai_content_disclosure->url
    if (!catalogs_ai_content_disclosure->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", catalogs_ai_content_disclosure->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_ai_content_disclosure_t *catalogs_ai_content_disclosure_parseFromJSON(cJSON *catalogs_ai_content_disclosureJSON){

    catalogs_ai_content_disclosure_t *catalogs_ai_content_disclosure_local_var = NULL;

    // define the local list for catalogs_ai_content_disclosure->disclosure
    list_t *disclosureList = NULL;

    char *url_local_str = NULL;

    // catalogs_ai_content_disclosure->disclosure
    cJSON *disclosure = cJSON_GetObjectItemCaseSensitive(catalogs_ai_content_disclosureJSON, "disclosure");
    if (cJSON_IsNull(disclosure)) {
        disclosure = NULL;
    }
    if (!disclosure) {
        goto end;
    }

    
    cJSON *disclosure_local_nonprimitive = NULL;
    if(!cJSON_IsArray(disclosure)){
        goto end; //nonprimitive container
    }

    disclosureList = list_createList();

    cJSON_ArrayForEach(disclosure_local_nonprimitive,disclosure )
    {
        if(!cJSON_IsObject(disclosure_local_nonprimitive)){
            goto end;
        }
        catalogs_ai_content_disclosure_catalogs_ai_content_disclosure_label_e disclosureItem = catalogs_ai_content_disclosure_label_parseFromJSON(disclosure_local_nonprimitive);

        list_addElement(disclosureList, (void *)disclosureItem);
    }

    // catalogs_ai_content_disclosure->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(catalogs_ai_content_disclosureJSON, "url");
    if (cJSON_IsNull(url)) {
        url = NULL;
    }
    if (!url) {
        goto end;
    }

    
    if(!cJSON_IsString(url))
    {
    goto end; //String
    }


    if (url && !cJSON_IsNull(url)) url_local_str = strdup(url->valuestring);

    catalogs_ai_content_disclosure_local_var = catalogs_ai_content_disclosure_create_internal (
        disclosureList,
        url_local_str
        );

    if (!catalogs_ai_content_disclosure_local_var) {
        goto end;
    }

    return catalogs_ai_content_disclosure_local_var;
end:
    if (disclosureList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, disclosureList) {
            catalogs_ai_content_disclosure_label_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(disclosureList);
        disclosureList = NULL;
    }
    if (url_local_str) {
        free(url_local_str);
        url_local_str = NULL;
    }
    return NULL;

}
