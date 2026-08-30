#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "related_terms_related_terms_list_items.h"



static related_terms_related_terms_list_items_t *related_terms_related_terms_list_items_create_internal(
    list_t *related_terms,
    char *term
    ) {
    related_terms_related_terms_list_items_t *related_terms_related_terms_list_items_local_var = malloc(sizeof(related_terms_related_terms_list_items_t));
    if (!related_terms_related_terms_list_items_local_var) {
        return NULL;
    }
    memset(related_terms_related_terms_list_items_local_var, 0, sizeof(related_terms_related_terms_list_items_t));
    related_terms_related_terms_list_items_local_var->_library_owned = 1;
    related_terms_related_terms_list_items_local_var->related_terms = related_terms;
    related_terms_related_terms_list_items_local_var->term = term;
    return related_terms_related_terms_list_items_local_var;
}

__attribute__((deprecated)) related_terms_related_terms_list_items_t *related_terms_related_terms_list_items_create(
    list_t *related_terms,
    char *term
    ) {
    related_terms_related_terms_list_items_t *result = related_terms_related_terms_list_items_create_internal (
        related_terms,
        term
        );
    if (!result) {
    }
    return result;
}

void related_terms_related_terms_list_items_free(related_terms_related_terms_list_items_t *related_terms_related_terms_list_items) {
    if(NULL == related_terms_related_terms_list_items){
        return ;
    }
    if(related_terms_related_terms_list_items->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "related_terms_related_terms_list_items_free");
        return ;
    }
    listEntry_t *listEntry;
    if (related_terms_related_terms_list_items->related_terms) {
        list_ForEach(listEntry, related_terms_related_terms_list_items->related_terms) {
            free(listEntry->data);
        }
        list_freeList(related_terms_related_terms_list_items->related_terms);
        related_terms_related_terms_list_items->related_terms = NULL;
    }
    if (related_terms_related_terms_list_items->term) {
        free(related_terms_related_terms_list_items->term);
        related_terms_related_terms_list_items->term = NULL;
    }
    free(related_terms_related_terms_list_items);
}

cJSON *related_terms_related_terms_list_items_convertToJSON(related_terms_related_terms_list_items_t *related_terms_related_terms_list_items) {
    cJSON *item = cJSON_CreateObject();

    // related_terms_related_terms_list_items->related_terms
    if(related_terms_related_terms_list_items->related_terms) {
    cJSON *related_terms = cJSON_AddArrayToObject(item, "related_terms");
    if(related_terms == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *related_termsListEntry;
    list_ForEach(related_termsListEntry, related_terms_related_terms_list_items->related_terms) {
    if(cJSON_AddStringToObject(related_terms, "", related_termsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // related_terms_related_terms_list_items->term
    if(related_terms_related_terms_list_items->term) {
    if(cJSON_AddStringToObject(item, "term", related_terms_related_terms_list_items->term) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

related_terms_related_terms_list_items_t *related_terms_related_terms_list_items_parseFromJSON(cJSON *related_terms_related_terms_list_itemsJSON){

    related_terms_related_terms_list_items_t *related_terms_related_terms_list_items_local_var = NULL;

    // define the local list for related_terms_related_terms_list_items->related_terms
    list_t *related_termsList = NULL;

    char *term_local_str = NULL;

    // related_terms_related_terms_list_items->related_terms
    cJSON *related_terms = cJSON_GetObjectItemCaseSensitive(related_terms_related_terms_list_itemsJSON, "related_terms");
    if (cJSON_IsNull(related_terms)) {
        related_terms = NULL;
    }
    if (related_terms) { 
    cJSON *related_terms_local = NULL;
    if(!cJSON_IsArray(related_terms)) {
        goto end;//primitive container
    }
    related_termsList = list_createList();

    cJSON_ArrayForEach(related_terms_local, related_terms)
    {
        if(!cJSON_IsString(related_terms_local))
        {
            goto end;
        }
        list_addElement(related_termsList , strdup(related_terms_local->valuestring));
    }
    }

    // related_terms_related_terms_list_items->term
    cJSON *term = cJSON_GetObjectItemCaseSensitive(related_terms_related_terms_list_itemsJSON, "term");
    if (cJSON_IsNull(term)) {
        term = NULL;
    }
    if (term) { 
    if(!cJSON_IsString(term) && !cJSON_IsNull(term))
    {
    goto end; //String
    }
    }


    if (term && !cJSON_IsNull(term)) term_local_str = strdup(term->valuestring);

    related_terms_related_terms_list_items_local_var = related_terms_related_terms_list_items_create_internal (
        related_terms ? related_termsList : NULL,
        term_local_str
        );

    if (!related_terms_related_terms_list_items_local_var) {
        goto end;
    }

    return related_terms_related_terms_list_items_local_var;
end:
    if (related_termsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, related_termsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(related_termsList);
        related_termsList = NULL;
    }
    if (term_local_str) {
        free(term_local_str);
        term_local_str = NULL;
    }
    return NULL;

}
