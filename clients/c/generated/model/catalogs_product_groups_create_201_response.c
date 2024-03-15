#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_product_groups_create_201_response.h"


char* catalogs_product_groups_create_201_response_type_ToString(pinterest_rest_api_catalogs_product_groups_create_201_response__e type) {
    char* typeArray[] =  { "NULL", "MERCHANT_CREATED", "ALL_PRODUCTS", "BEST_DEALS", "PINNER_FAVORITES", "TOP_SELLERS", "BACK_IN_STOCK", "NEW_ARRIVALS", "SHOPIFY_COLLECTIONS", "I2PC" };
    return typeArray[type];
}

pinterest_rest_api_catalogs_product_groups_create_201_response__e catalogs_product_groups_create_201_response_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "MERCHANT_CREATED", "ALL_PRODUCTS", "BEST_DEALS", "PINNER_FAVORITES", "TOP_SELLERS", "BACK_IN_STOCK", "NEW_ARRIVALS", "SHOPIFY_COLLECTIONS", "I2PC" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* catalogs_product_groups_create_201_response_status_ToString(pinterest_rest_api_catalogs_product_groups_create_201_response__e status) {
    char* statusArray[] =  { "NULL", "ACTIVE", "INACTIVE" };
    return statusArray[status];
}

pinterest_rest_api_catalogs_product_groups_create_201_response__e catalogs_product_groups_create_201_response_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "ACTIVE", "INACTIVE" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* catalogs_product_groups_create_201_response_feed_id_ToString(pinterest_rest_api_catalogs_product_groups_create_201_response_FEEDID_e feed_id) {
    char* feed_idArray[] =  { "NULL", "" };
    return feed_idArray[feed_id];
}

pinterest_rest_api_catalogs_product_groups_create_201_response_FEEDID_e catalogs_product_groups_create_201_response_feed_id_FromString(char* feed_id){
    int stringToReturn = 0;
    char *feed_idArray[] =  { "NULL", "" };
    size_t sizeofArray = sizeof(feed_idArray) / sizeof(feed_idArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(feed_id, feed_idArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* catalogs_product_groups_create_201_response_catalog_type_ToString(pinterest_rest_api_catalogs_product_groups_create_201_response_CATALOGTYPE_e catalog_type) {
    char* catalog_typeArray[] =  { "NULL", "RETAIL" };
    return catalog_typeArray[catalog_type];
}

pinterest_rest_api_catalogs_product_groups_create_201_response_CATALOGTYPE_e catalogs_product_groups_create_201_response_catalog_type_FromString(char* catalog_type){
    int stringToReturn = 0;
    char *catalog_typeArray[] =  { "NULL", "RETAIL" };
    size_t sizeofArray = sizeof(catalog_typeArray) / sizeof(catalog_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(catalog_type, catalog_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

catalogs_product_groups_create_201_response_t *catalogs_product_groups_create_201_response_create(
    char *id,
    char *name,
    char *description,
    catalogs_product_group_filters_t *filters,
    int is_featured,
    catalogs_product_group_type_t *type,
    catalogs_product_group_status_t *status,
    int created_at,
    int updated_at,
    pinterest_rest_api_catalogs_product_groups_create_201_response_FEEDID_e feed_id,
    pinterest_rest_api_catalogs_product_groups_create_201_response_CATALOGTYPE_e catalog_type,
    char *catalog_id
    ) {
    catalogs_product_groups_create_201_response_t *catalogs_product_groups_create_201_response_local_var = malloc(sizeof(catalogs_product_groups_create_201_response_t));
    if (!catalogs_product_groups_create_201_response_local_var) {
        return NULL;
    }
    catalogs_product_groups_create_201_response_local_var->id = id;
    catalogs_product_groups_create_201_response_local_var->name = name;
    catalogs_product_groups_create_201_response_local_var->description = description;
    catalogs_product_groups_create_201_response_local_var->filters = filters;
    catalogs_product_groups_create_201_response_local_var->is_featured = is_featured;
    catalogs_product_groups_create_201_response_local_var->type = type;
    catalogs_product_groups_create_201_response_local_var->status = status;
    catalogs_product_groups_create_201_response_local_var->created_at = created_at;
    catalogs_product_groups_create_201_response_local_var->updated_at = updated_at;
    catalogs_product_groups_create_201_response_local_var->feed_id = feed_id;
    catalogs_product_groups_create_201_response_local_var->catalog_type = catalog_type;
    catalogs_product_groups_create_201_response_local_var->catalog_id = catalog_id;

    return catalogs_product_groups_create_201_response_local_var;
}


void catalogs_product_groups_create_201_response_free(catalogs_product_groups_create_201_response_t *catalogs_product_groups_create_201_response) {
    if(NULL == catalogs_product_groups_create_201_response){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_product_groups_create_201_response->id) {
        free(catalogs_product_groups_create_201_response->id);
        catalogs_product_groups_create_201_response->id = NULL;
    }
    if (catalogs_product_groups_create_201_response->name) {
        free(catalogs_product_groups_create_201_response->name);
        catalogs_product_groups_create_201_response->name = NULL;
    }
    if (catalogs_product_groups_create_201_response->description) {
        free(catalogs_product_groups_create_201_response->description);
        catalogs_product_groups_create_201_response->description = NULL;
    }
    if (catalogs_product_groups_create_201_response->filters) {
        catalogs_product_group_filters_free(catalogs_product_groups_create_201_response->filters);
        catalogs_product_groups_create_201_response->filters = NULL;
    }
    if (catalogs_product_groups_create_201_response->type) {
        catalogs_product_group_type_free(catalogs_product_groups_create_201_response->type);
        catalogs_product_groups_create_201_response->type = NULL;
    }
    if (catalogs_product_groups_create_201_response->status) {
        catalogs_product_group_status_free(catalogs_product_groups_create_201_response->status);
        catalogs_product_groups_create_201_response->status = NULL;
    }
    if (catalogs_product_groups_create_201_response->catalog_id) {
        free(catalogs_product_groups_create_201_response->catalog_id);
        catalogs_product_groups_create_201_response->catalog_id = NULL;
    }
    free(catalogs_product_groups_create_201_response);
}

cJSON *catalogs_product_groups_create_201_response_convertToJSON(catalogs_product_groups_create_201_response_t *catalogs_product_groups_create_201_response) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_product_groups_create_201_response->id
    if (!catalogs_product_groups_create_201_response->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", catalogs_product_groups_create_201_response->id) == NULL) {
    goto fail; //String
    }


    // catalogs_product_groups_create_201_response->name
    if(catalogs_product_groups_create_201_response->name) {
    if(cJSON_AddStringToObject(item, "name", catalogs_product_groups_create_201_response->name) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_product_groups_create_201_response->description
    if(catalogs_product_groups_create_201_response->description) {
    if(cJSON_AddStringToObject(item, "description", catalogs_product_groups_create_201_response->description) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_product_groups_create_201_response->filters
    if (!catalogs_product_groups_create_201_response->filters) {
        goto fail;
    }
    cJSON *filters_local_JSON = catalogs_product_group_filters_convertToJSON(catalogs_product_groups_create_201_response->filters);
    if(filters_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "filters", filters_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_product_groups_create_201_response->is_featured
    if(catalogs_product_groups_create_201_response->is_featured) {
    if(cJSON_AddBoolToObject(item, "is_featured", catalogs_product_groups_create_201_response->is_featured) == NULL) {
    goto fail; //Bool
    }
    }


    // catalogs_product_groups_create_201_response->type
    if(catalogs_product_groups_create_201_response->type != pinterest_rest_api_catalogs_product_groups_create_201_response__NULL) {
    cJSON *type_local_JSON = catalogs_product_group_type_convertToJSON(catalogs_product_groups_create_201_response->type);
    if(type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "type", type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // catalogs_product_groups_create_201_response->status
    if(catalogs_product_groups_create_201_response->status != pinterest_rest_api_catalogs_product_groups_create_201_response__NULL) {
    cJSON *status_local_JSON = catalogs_product_group_status_convertToJSON(catalogs_product_groups_create_201_response->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // catalogs_product_groups_create_201_response->created_at
    if(catalogs_product_groups_create_201_response->created_at) {
    if(cJSON_AddNumberToObject(item, "created_at", catalogs_product_groups_create_201_response->created_at) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_product_groups_create_201_response->updated_at
    if(catalogs_product_groups_create_201_response->updated_at) {
    if(cJSON_AddNumberToObject(item, "updated_at", catalogs_product_groups_create_201_response->updated_at) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_product_groups_create_201_response->feed_id
    if (pinterest_rest_api_catalogs_product_groups_create_201_response_FEEDID_NULL == catalogs_product_groups_create_201_response->feed_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "feed_id", feed_idcatalogs_product_groups_create_201_response_ToString(catalogs_product_groups_create_201_response->feed_id)) == NULL)
    {
    goto fail; //Enum
    }


    // catalogs_product_groups_create_201_response->catalog_type
    if (pinterest_rest_api_catalogs_product_groups_create_201_response_CATALOGTYPE_NULL == catalogs_product_groups_create_201_response->catalog_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_type", catalog_typecatalogs_product_groups_create_201_response_ToString(catalogs_product_groups_create_201_response->catalog_type)) == NULL)
    {
    goto fail; //Enum
    }


    // catalogs_product_groups_create_201_response->catalog_id
    if (!catalogs_product_groups_create_201_response->catalog_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_id", catalogs_product_groups_create_201_response->catalog_id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_product_groups_create_201_response_t *catalogs_product_groups_create_201_response_parseFromJSON(cJSON *catalogs_product_groups_create_201_responseJSON){

    catalogs_product_groups_create_201_response_t *catalogs_product_groups_create_201_response_local_var = NULL;

    // define the local variable for catalogs_product_groups_create_201_response->filters
    catalogs_product_group_filters_t *filters_local_nonprim = NULL;

    // define the local variable for catalogs_product_groups_create_201_response->type
    catalogs_product_group_type_t *type_local_nonprim = NULL;

    // define the local variable for catalogs_product_groups_create_201_response->status
    catalogs_product_group_status_t *status_local_nonprim = NULL;

    // catalogs_product_groups_create_201_response->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(catalogs_product_groups_create_201_responseJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // catalogs_product_groups_create_201_response->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(catalogs_product_groups_create_201_responseJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // catalogs_product_groups_create_201_response->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(catalogs_product_groups_create_201_responseJSON, "description");
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // catalogs_product_groups_create_201_response->filters
    cJSON *filters = cJSON_GetObjectItemCaseSensitive(catalogs_product_groups_create_201_responseJSON, "filters");
    if (!filters) {
        goto end;
    }

    
    filters_local_nonprim = catalogs_product_group_filters_parseFromJSON(filters); //nonprimitive

    // catalogs_product_groups_create_201_response->is_featured
    cJSON *is_featured = cJSON_GetObjectItemCaseSensitive(catalogs_product_groups_create_201_responseJSON, "is_featured");
    if (is_featured) { 
    if(!cJSON_IsBool(is_featured))
    {
    goto end; //Bool
    }
    }

    // catalogs_product_groups_create_201_response->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(catalogs_product_groups_create_201_responseJSON, "type");
    if (type) { 
    type_local_nonprim = catalogs_product_group_type_parseFromJSON(type); //custom
    }

    // catalogs_product_groups_create_201_response->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(catalogs_product_groups_create_201_responseJSON, "status");
    if (status) { 
    status_local_nonprim = catalogs_product_group_status_parseFromJSON(status); //custom
    }

    // catalogs_product_groups_create_201_response->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(catalogs_product_groups_create_201_responseJSON, "created_at");
    if (created_at) { 
    if(!cJSON_IsNumber(created_at))
    {
    goto end; //Numeric
    }
    }

    // catalogs_product_groups_create_201_response->updated_at
    cJSON *updated_at = cJSON_GetObjectItemCaseSensitive(catalogs_product_groups_create_201_responseJSON, "updated_at");
    if (updated_at) { 
    if(!cJSON_IsNumber(updated_at))
    {
    goto end; //Numeric
    }
    }

    // catalogs_product_groups_create_201_response->feed_id
    cJSON *feed_id = cJSON_GetObjectItemCaseSensitive(catalogs_product_groups_create_201_responseJSON, "feed_id");
    if (!feed_id) {
        goto end;
    }

    pinterest_rest_api_catalogs_product_groups_create_201_response_FEEDID_e feed_idVariable;
    
    if(!cJSON_IsString(feed_id))
    {
    goto end; //Enum
    }
    feed_idVariable = catalogs_product_groups_create_201_response_feed_id_FromString(feed_id->valuestring);

    // catalogs_product_groups_create_201_response->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_product_groups_create_201_responseJSON, "catalog_type");
    if (!catalog_type) {
        goto end;
    }

    pinterest_rest_api_catalogs_product_groups_create_201_response_CATALOGTYPE_e catalog_typeVariable;
    
    if(!cJSON_IsString(catalog_type))
    {
    goto end; //Enum
    }
    catalog_typeVariable = catalogs_product_groups_create_201_response_catalog_type_FromString(catalog_type->valuestring);

    // catalogs_product_groups_create_201_response->catalog_id
    cJSON *catalog_id = cJSON_GetObjectItemCaseSensitive(catalogs_product_groups_create_201_responseJSON, "catalog_id");
    if (!catalog_id) {
        goto end;
    }

    
    if(!cJSON_IsString(catalog_id))
    {
    goto end; //String
    }


    catalogs_product_groups_create_201_response_local_var = catalogs_product_groups_create_201_response_create (
        strdup(id->valuestring),
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        filters_local_nonprim,
        is_featured ? is_featured->valueint : 0,
        type ? type_local_nonprim : NULL,
        status ? status_local_nonprim : NULL,
        created_at ? created_at->valuedouble : 0,
        updated_at ? updated_at->valuedouble : 0,
        feed_idVariable,
        catalog_typeVariable,
        strdup(catalog_id->valuestring)
        );

    return catalogs_product_groups_create_201_response_local_var;
end:
    if (filters_local_nonprim) {
        catalogs_product_group_filters_free(filters_local_nonprim);
        filters_local_nonprim = NULL;
    }
    if (type_local_nonprim) {
        catalogs_product_group_type_free(type_local_nonprim);
        type_local_nonprim = NULL;
    }
    if (status_local_nonprim) {
        catalogs_product_group_status_free(status_local_nonprim);
        status_local_nonprim = NULL;
    }
    return NULL;

}
