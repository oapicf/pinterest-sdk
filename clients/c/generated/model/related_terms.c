#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "related_terms.h"



related_terms_t *related_terms_create(
    char *id,
    int related_term_count,
    list_t *related_terms_list
    ) {
    related_terms_t *related_terms_local_var = malloc(sizeof(related_terms_t));
    if (!related_terms_local_var) {
        return NULL;
    }
    related_terms_local_var->id = id;
    related_terms_local_var->related_term_count = related_term_count;
    related_terms_local_var->related_terms_list = related_terms_list;

    return related_terms_local_var;
}


void related_terms_free(related_terms_t *related_terms) {
    if(NULL == related_terms){
        return ;
    }
    listEntry_t *listEntry;
    if (related_terms->id) {
        free(related_terms->id);
        related_terms->id = NULL;
    }
    if (related_terms->related_terms_list) {
        list_ForEach(listEntry, related_terms->related_terms_list) {
            related_terms_related_terms_list_inner_free(listEntry->data);
        }
        list_freeList(related_terms->related_terms_list);
        related_terms->related_terms_list = NULL;
    }
    free(related_terms);
}

cJSON *related_terms_convertToJSON(related_terms_t *related_terms) {
    cJSON *item = cJSON_CreateObject();

    // related_terms->id
    if(related_terms->id) {
    if(cJSON_AddStringToObject(item, "id", related_terms->id) == NULL) {
    goto fail; //String
    }
    }


    // related_terms->related_term_count
    if(related_terms->related_term_count) {
    if(cJSON_AddNumberToObject(item, "related_term_count", related_terms->related_term_count) == NULL) {
    goto fail; //Numeric
    }
    }


    // related_terms->related_terms_list
    if(related_terms->related_terms_list) {
    cJSON *related_terms_list = cJSON_AddArrayToObject(item, "related_terms_list");
    if(related_terms_list == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *related_terms_listListEntry;
    if (related_terms->related_terms_list) {
    list_ForEach(related_terms_listListEntry, related_terms->related_terms_list) {
    cJSON *itemLocal = related_terms_related_terms_list_inner_convertToJSON(related_terms_listListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(related_terms_list, itemLocal);
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

related_terms_t *related_terms_parseFromJSON(cJSON *related_termsJSON){

    related_terms_t *related_terms_local_var = NULL;

    // define the local list for related_terms->related_terms_list
    list_t *related_terms_listList = NULL;

    // related_terms->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(related_termsJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // related_terms->related_term_count
    cJSON *related_term_count = cJSON_GetObjectItemCaseSensitive(related_termsJSON, "related_term_count");
    if (related_term_count) { 
    if(!cJSON_IsNumber(related_term_count))
    {
    goto end; //Numeric
    }
    }

    // related_terms->related_terms_list
    cJSON *related_terms_list = cJSON_GetObjectItemCaseSensitive(related_termsJSON, "related_terms_list");
    if (related_terms_list) { 
    cJSON *related_terms_list_local_nonprimitive = NULL;
    if(!cJSON_IsArray(related_terms_list)){
        goto end; //nonprimitive container
    }

    related_terms_listList = list_createList();

    cJSON_ArrayForEach(related_terms_list_local_nonprimitive,related_terms_list )
    {
        if(!cJSON_IsObject(related_terms_list_local_nonprimitive)){
            goto end;
        }
        related_terms_related_terms_list_inner_t *related_terms_listItem = related_terms_related_terms_list_inner_parseFromJSON(related_terms_list_local_nonprimitive);

        list_addElement(related_terms_listList, related_terms_listItem);
    }
    }


    related_terms_local_var = related_terms_create (
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        related_term_count ? related_term_count->valuedouble : 0,
        related_terms_list ? related_terms_listList : NULL
        );

    return related_terms_local_var;
end:
    if (related_terms_listList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, related_terms_listList) {
            related_terms_related_terms_list_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(related_terms_listList);
        related_terms_listList = NULL;
    }
    return NULL;

}
