#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "related_terms_related_terms_list_inner.h"



static related_terms_related_terms_list_inner_t *related_terms_related_terms_list_inner_create_internal(
    list_t *related_terms,
    char *term
    ) {
    related_terms_related_terms_list_inner_t *related_terms_related_terms_list_inner_local_var = malloc(sizeof(related_terms_related_terms_list_inner_t));
    if (!related_terms_related_terms_list_inner_local_var) {
        return NULL;
    }
    related_terms_related_terms_list_inner_local_var->related_terms = related_terms;
    related_terms_related_terms_list_inner_local_var->term = term;

    related_terms_related_terms_list_inner_local_var->_library_owned = 1;
    return related_terms_related_terms_list_inner_local_var;
}

__attribute__((deprecated)) related_terms_related_terms_list_inner_t *related_terms_related_terms_list_inner_create(
    list_t *related_terms,
    char *term
    ) {
    return related_terms_related_terms_list_inner_create_internal (
        related_terms,
        term
        );
}

void related_terms_related_terms_list_inner_free(related_terms_related_terms_list_inner_t *related_terms_related_terms_list_inner) {
    if(NULL == related_terms_related_terms_list_inner){
        return ;
    }
    if(related_terms_related_terms_list_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "related_terms_related_terms_list_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (related_terms_related_terms_list_inner->related_terms) {
        list_ForEach(listEntry, related_terms_related_terms_list_inner->related_terms) {
            free(listEntry->data);
        }
        list_freeList(related_terms_related_terms_list_inner->related_terms);
        related_terms_related_terms_list_inner->related_terms = NULL;
    }
    if (related_terms_related_terms_list_inner->term) {
        free(related_terms_related_terms_list_inner->term);
        related_terms_related_terms_list_inner->term = NULL;
    }
    free(related_terms_related_terms_list_inner);
}

cJSON *related_terms_related_terms_list_inner_convertToJSON(related_terms_related_terms_list_inner_t *related_terms_related_terms_list_inner) {
    cJSON *item = cJSON_CreateObject();

    // related_terms_related_terms_list_inner->related_terms
    if(related_terms_related_terms_list_inner->related_terms) {
    cJSON *related_terms = cJSON_AddArrayToObject(item, "related_terms");
    if(related_terms == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *related_termsListEntry;
    list_ForEach(related_termsListEntry, related_terms_related_terms_list_inner->related_terms) {
    if(cJSON_AddStringToObject(related_terms, "", related_termsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // related_terms_related_terms_list_inner->term
    if(related_terms_related_terms_list_inner->term) {
    if(cJSON_AddStringToObject(item, "term", related_terms_related_terms_list_inner->term) == NULL) {
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

related_terms_related_terms_list_inner_t *related_terms_related_terms_list_inner_parseFromJSON(cJSON *related_terms_related_terms_list_innerJSON){

    related_terms_related_terms_list_inner_t *related_terms_related_terms_list_inner_local_var = NULL;

    // define the local list for related_terms_related_terms_list_inner->related_terms
    list_t *related_termsList = NULL;

    // related_terms_related_terms_list_inner->related_terms
    cJSON *related_terms = cJSON_GetObjectItemCaseSensitive(related_terms_related_terms_list_innerJSON, "related_terms");
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

    // related_terms_related_terms_list_inner->term
    cJSON *term = cJSON_GetObjectItemCaseSensitive(related_terms_related_terms_list_innerJSON, "term");
    if (cJSON_IsNull(term)) {
        term = NULL;
    }
    if (term) { 
    if(!cJSON_IsString(term) && !cJSON_IsNull(term))
    {
    goto end; //String
    }
    }


    related_terms_related_terms_list_inner_local_var = related_terms_related_terms_list_inner_create_internal (
        related_terms ? related_termsList : NULL,
        term && !cJSON_IsNull(term) ? strdup(term->valuestring) : NULL
        );

    return related_terms_related_terms_list_inner_local_var;
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
    return NULL;

}
