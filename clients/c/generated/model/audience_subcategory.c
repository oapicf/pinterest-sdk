#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audience_subcategory.h"



audience_subcategory_t *audience_subcategory_create(
    char *key,
    char *name,
    double ratio,
    double index,
    char *id
    ) {
    audience_subcategory_t *audience_subcategory_local_var = malloc(sizeof(audience_subcategory_t));
    if (!audience_subcategory_local_var) {
        return NULL;
    }
    audience_subcategory_local_var->key = key;
    audience_subcategory_local_var->name = name;
    audience_subcategory_local_var->ratio = ratio;
    audience_subcategory_local_var->index = index;
    audience_subcategory_local_var->id = id;

    return audience_subcategory_local_var;
}


void audience_subcategory_free(audience_subcategory_t *audience_subcategory) {
    if(NULL == audience_subcategory){
        return ;
    }
    listEntry_t *listEntry;
    if (audience_subcategory->key) {
        free(audience_subcategory->key);
        audience_subcategory->key = NULL;
    }
    if (audience_subcategory->name) {
        free(audience_subcategory->name);
        audience_subcategory->name = NULL;
    }
    if (audience_subcategory->id) {
        free(audience_subcategory->id);
        audience_subcategory->id = NULL;
    }
    free(audience_subcategory);
}

cJSON *audience_subcategory_convertToJSON(audience_subcategory_t *audience_subcategory) {
    cJSON *item = cJSON_CreateObject();

    // audience_subcategory->key
    if(audience_subcategory->key) {
    if(cJSON_AddStringToObject(item, "key", audience_subcategory->key) == NULL) {
    goto fail; //String
    }
    }


    // audience_subcategory->name
    if(audience_subcategory->name) {
    if(cJSON_AddStringToObject(item, "name", audience_subcategory->name) == NULL) {
    goto fail; //String
    }
    }


    // audience_subcategory->ratio
    if(audience_subcategory->ratio) {
    if(cJSON_AddNumberToObject(item, "ratio", audience_subcategory->ratio) == NULL) {
    goto fail; //Numeric
    }
    }


    // audience_subcategory->index
    if(audience_subcategory->index) {
    if(cJSON_AddNumberToObject(item, "index", audience_subcategory->index) == NULL) {
    goto fail; //Numeric
    }
    }


    // audience_subcategory->id
    if(audience_subcategory->id) {
    if(cJSON_AddStringToObject(item, "id", audience_subcategory->id) == NULL) {
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

audience_subcategory_t *audience_subcategory_parseFromJSON(cJSON *audience_subcategoryJSON){

    audience_subcategory_t *audience_subcategory_local_var = NULL;

    // audience_subcategory->key
    cJSON *key = cJSON_GetObjectItemCaseSensitive(audience_subcategoryJSON, "key");
    if (key) { 
    if(!cJSON_IsString(key) && !cJSON_IsNull(key))
    {
    goto end; //String
    }
    }

    // audience_subcategory->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(audience_subcategoryJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // audience_subcategory->ratio
    cJSON *ratio = cJSON_GetObjectItemCaseSensitive(audience_subcategoryJSON, "ratio");
    if (ratio) { 
    if(!cJSON_IsNumber(ratio))
    {
    goto end; //Numeric
    }
    }

    // audience_subcategory->index
    cJSON *index = cJSON_GetObjectItemCaseSensitive(audience_subcategoryJSON, "index");
    if (index) { 
    if(!cJSON_IsNumber(index))
    {
    goto end; //Numeric
    }
    }

    // audience_subcategory->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(audience_subcategoryJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }


    audience_subcategory_local_var = audience_subcategory_create (
        key && !cJSON_IsNull(key) ? strdup(key->valuestring) : NULL,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        ratio ? ratio->valuedouble : 0,
        index ? index->valuedouble : 0,
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL
        );

    return audience_subcategory_local_var;
end:
    return NULL;

}
