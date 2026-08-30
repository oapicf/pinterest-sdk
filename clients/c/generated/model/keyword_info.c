#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "keyword_info.h"



static keyword_info_t *keyword_info_create_internal(
    char *name,
    double *pct_growth_mom
    ) {
    keyword_info_t *keyword_info_local_var = malloc(sizeof(keyword_info_t));
    if (!keyword_info_local_var) {
        return NULL;
    }
    memset(keyword_info_local_var, 0, sizeof(keyword_info_t));
    keyword_info_local_var->_library_owned = 1;
    keyword_info_local_var->name = name;
    keyword_info_local_var->pct_growth_mom = pct_growth_mom;
    return keyword_info_local_var;
}

__attribute__((deprecated)) keyword_info_t *keyword_info_create(
    char *name,
    double *pct_growth_mom
    ) {
    double *pct_growth_mom_copy = NULL;
    if (pct_growth_mom) {
        pct_growth_mom_copy = malloc(sizeof(double));
        if (pct_growth_mom_copy) *pct_growth_mom_copy = *pct_growth_mom;
    }
    keyword_info_t *result = keyword_info_create_internal (
        name,
        pct_growth_mom_copy
        );
    if (!result) {
        free(pct_growth_mom_copy);
    }
    return result;
}

void keyword_info_free(keyword_info_t *keyword_info) {
    if(NULL == keyword_info){
        return ;
    }
    if(keyword_info->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "keyword_info_free");
        return ;
    }
    listEntry_t *listEntry;
    if (keyword_info->name) {
        free(keyword_info->name);
        keyword_info->name = NULL;
    }
    if (keyword_info->pct_growth_mom) {
        free(keyword_info->pct_growth_mom);
        keyword_info->pct_growth_mom = NULL;
    }
    free(keyword_info);
}

cJSON *keyword_info_convertToJSON(keyword_info_t *keyword_info) {
    cJSON *item = cJSON_CreateObject();

    // keyword_info->name
    if (!keyword_info->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", keyword_info->name) == NULL) {
    goto fail; //String
    }


    // keyword_info->pct_growth_mom
    if(keyword_info->pct_growth_mom) {
    if(cJSON_AddNumberToObject(item, "pct_growth_mom", *keyword_info->pct_growth_mom) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

keyword_info_t *keyword_info_parseFromJSON(cJSON *keyword_infoJSON){

    keyword_info_t *keyword_info_local_var = NULL;

    char *name_local_str = NULL;

    // define the local variable for keyword_info->pct_growth_mom
    double *pct_growth_mom_local_var = NULL;

    // keyword_info->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(keyword_infoJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // keyword_info->pct_growth_mom
    cJSON *pct_growth_mom = cJSON_GetObjectItemCaseSensitive(keyword_infoJSON, "pct_growth_mom");
    if (cJSON_IsNull(pct_growth_mom)) {
        pct_growth_mom = NULL;
    }
    if (pct_growth_mom) { 
    if(!cJSON_IsNumber(pct_growth_mom))
    {
    goto end; //Numeric
    }
    pct_growth_mom_local_var = malloc(sizeof(double));
    if(!pct_growth_mom_local_var)
    {
        goto end;
    }
    *pct_growth_mom_local_var = pct_growth_mom->valuedouble;
    }


    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    keyword_info_local_var = keyword_info_create_internal (
        name_local_str,
        pct_growth_mom_local_var
        );

    if (!keyword_info_local_var) {
        goto end;
    }

    return keyword_info_local_var;
end:
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (pct_growth_mom_local_var) {
        free(pct_growth_mom_local_var);
        pct_growth_mom_local_var = NULL;
    }
    return NULL;

}
