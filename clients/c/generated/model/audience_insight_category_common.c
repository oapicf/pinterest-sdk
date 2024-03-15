#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audience_insight_category_common.h"



audience_insight_category_common_t *audience_insight_category_common_create(
    char *key,
    char *name,
    double ratio,
    double index,
    char *id
    ) {
    audience_insight_category_common_t *audience_insight_category_common_local_var = malloc(sizeof(audience_insight_category_common_t));
    if (!audience_insight_category_common_local_var) {
        return NULL;
    }
    audience_insight_category_common_local_var->key = key;
    audience_insight_category_common_local_var->name = name;
    audience_insight_category_common_local_var->ratio = ratio;
    audience_insight_category_common_local_var->index = index;
    audience_insight_category_common_local_var->id = id;

    return audience_insight_category_common_local_var;
}


void audience_insight_category_common_free(audience_insight_category_common_t *audience_insight_category_common) {
    if(NULL == audience_insight_category_common){
        return ;
    }
    listEntry_t *listEntry;
    if (audience_insight_category_common->key) {
        free(audience_insight_category_common->key);
        audience_insight_category_common->key = NULL;
    }
    if (audience_insight_category_common->name) {
        free(audience_insight_category_common->name);
        audience_insight_category_common->name = NULL;
    }
    if (audience_insight_category_common->id) {
        free(audience_insight_category_common->id);
        audience_insight_category_common->id = NULL;
    }
    free(audience_insight_category_common);
}

cJSON *audience_insight_category_common_convertToJSON(audience_insight_category_common_t *audience_insight_category_common) {
    cJSON *item = cJSON_CreateObject();

    // audience_insight_category_common->key
    if(audience_insight_category_common->key) {
    if(cJSON_AddStringToObject(item, "key", audience_insight_category_common->key) == NULL) {
    goto fail; //String
    }
    }


    // audience_insight_category_common->name
    if(audience_insight_category_common->name) {
    if(cJSON_AddStringToObject(item, "name", audience_insight_category_common->name) == NULL) {
    goto fail; //String
    }
    }


    // audience_insight_category_common->ratio
    if(audience_insight_category_common->ratio) {
    if(cJSON_AddNumberToObject(item, "ratio", audience_insight_category_common->ratio) == NULL) {
    goto fail; //Numeric
    }
    }


    // audience_insight_category_common->index
    if(audience_insight_category_common->index) {
    if(cJSON_AddNumberToObject(item, "index", audience_insight_category_common->index) == NULL) {
    goto fail; //Numeric
    }
    }


    // audience_insight_category_common->id
    if(audience_insight_category_common->id) {
    if(cJSON_AddStringToObject(item, "id", audience_insight_category_common->id) == NULL) {
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

audience_insight_category_common_t *audience_insight_category_common_parseFromJSON(cJSON *audience_insight_category_commonJSON){

    audience_insight_category_common_t *audience_insight_category_common_local_var = NULL;

    // audience_insight_category_common->key
    cJSON *key = cJSON_GetObjectItemCaseSensitive(audience_insight_category_commonJSON, "key");
    if (key) { 
    if(!cJSON_IsString(key) && !cJSON_IsNull(key))
    {
    goto end; //String
    }
    }

    // audience_insight_category_common->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(audience_insight_category_commonJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // audience_insight_category_common->ratio
    cJSON *ratio = cJSON_GetObjectItemCaseSensitive(audience_insight_category_commonJSON, "ratio");
    if (ratio) { 
    if(!cJSON_IsNumber(ratio))
    {
    goto end; //Numeric
    }
    }

    // audience_insight_category_common->index
    cJSON *index = cJSON_GetObjectItemCaseSensitive(audience_insight_category_commonJSON, "index");
    if (index) { 
    if(!cJSON_IsNumber(index))
    {
    goto end; //Numeric
    }
    }

    // audience_insight_category_common->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(audience_insight_category_commonJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }


    audience_insight_category_common_local_var = audience_insight_category_common_create (
        key && !cJSON_IsNull(key) ? strdup(key->valuestring) : NULL,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        ratio ? ratio->valuedouble : 0,
        index ? index->valuedouble : 0,
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL
        );

    return audience_insight_category_common_local_var;
end:
    return NULL;

}
