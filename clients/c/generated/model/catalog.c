#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalog.h"


char* catalog_catalog_type_ToString(pinterest_rest_api_catalog__e catalog_type) {
    char* catalog_typeArray[] =  { "NULL", "RETAIL", "HOTEL", "CREATIVE_ASSETS" };
    return catalog_typeArray[catalog_type];
}

pinterest_rest_api_catalog__e catalog_catalog_type_FromString(char* catalog_type){
    int stringToReturn = 0;
    char *catalog_typeArray[] =  { "NULL", "RETAIL", "HOTEL", "CREATIVE_ASSETS" };
    size_t sizeofArray = sizeof(catalog_typeArray) / sizeof(catalog_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(catalog_type, catalog_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

catalog_t *catalog_create(
    char *created_at,
    char *id,
    char *updated_at,
    char *name,
    catalogs_type_t *catalog_type
    ) {
    catalog_t *catalog_local_var = malloc(sizeof(catalog_t));
    if (!catalog_local_var) {
        return NULL;
    }
    catalog_local_var->created_at = created_at;
    catalog_local_var->id = id;
    catalog_local_var->updated_at = updated_at;
    catalog_local_var->name = name;
    catalog_local_var->catalog_type = catalog_type;

    return catalog_local_var;
}


void catalog_free(catalog_t *catalog) {
    if(NULL == catalog){
        return ;
    }
    listEntry_t *listEntry;
    if (catalog->created_at) {
        free(catalog->created_at);
        catalog->created_at = NULL;
    }
    if (catalog->id) {
        free(catalog->id);
        catalog->id = NULL;
    }
    if (catalog->updated_at) {
        free(catalog->updated_at);
        catalog->updated_at = NULL;
    }
    if (catalog->name) {
        free(catalog->name);
        catalog->name = NULL;
    }
    if (catalog->catalog_type) {
        catalogs_type_free(catalog->catalog_type);
        catalog->catalog_type = NULL;
    }
    free(catalog);
}

cJSON *catalog_convertToJSON(catalog_t *catalog) {
    cJSON *item = cJSON_CreateObject();

    // catalog->created_at
    if (!catalog->created_at) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "created_at", catalog->created_at) == NULL) {
    goto fail; //Date-Time
    }


    // catalog->id
    if (!catalog->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", catalog->id) == NULL) {
    goto fail; //String
    }


    // catalog->updated_at
    if (!catalog->updated_at) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "updated_at", catalog->updated_at) == NULL) {
    goto fail; //Date-Time
    }


    // catalog->name
    if (!catalog->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", catalog->name) == NULL) {
    goto fail; //String
    }


    // catalog->catalog_type
    if (pinterest_rest_api_catalog__NULL == catalog->catalog_type) {
        goto fail;
    }
    cJSON *catalog_type_local_JSON = catalogs_type_convertToJSON(catalog->catalog_type);
    if(catalog_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "catalog_type", catalog_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalog_t *catalog_parseFromJSON(cJSON *catalogJSON){

    catalog_t *catalog_local_var = NULL;

    // define the local variable for catalog->catalog_type
    catalogs_type_t *catalog_type_local_nonprim = NULL;

    // catalog->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(catalogJSON, "created_at");
    if (!created_at) {
        goto end;
    }

    
    if(!cJSON_IsString(created_at) && !cJSON_IsNull(created_at))
    {
    goto end; //DateTime
    }

    // catalog->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(catalogJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // catalog->updated_at
    cJSON *updated_at = cJSON_GetObjectItemCaseSensitive(catalogJSON, "updated_at");
    if (!updated_at) {
        goto end;
    }

    
    if(!cJSON_IsString(updated_at) && !cJSON_IsNull(updated_at))
    {
    goto end; //DateTime
    }

    // catalog->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(catalogJSON, "name");
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // catalog->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogJSON, "catalog_type");
    if (!catalog_type) {
        goto end;
    }

    
    catalog_type_local_nonprim = catalogs_type_parseFromJSON(catalog_type); //custom


    catalog_local_var = catalog_create (
        strdup(created_at->valuestring),
        strdup(id->valuestring),
        strdup(updated_at->valuestring),
        strdup(name->valuestring),
        catalog_type_local_nonprim
        );

    return catalog_local_var;
end:
    if (catalog_type_local_nonprim) {
        catalogs_type_free(catalog_type_local_nonprim);
        catalog_type_local_nonprim = NULL;
    }
    return NULL;

}
