#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_vertical_product_group.h"


char* catalogs_vertical_product_group_catalog_type_ToString(pinterest_rest_api_catalogs_vertical_product_group_CATALOGTYPE_e catalog_type) {
    char* catalog_typeArray[] =  { "NULL", "RETAIL" };
    return catalog_typeArray[catalog_type];
}

pinterest_rest_api_catalogs_vertical_product_group_CATALOGTYPE_e catalogs_vertical_product_group_catalog_type_FromString(char* catalog_type){
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
char* catalogs_vertical_product_group_type_ToString(pinterest_rest_api_catalogs_vertical_product_group__e type) {
    char* typeArray[] =  { "NULL", "MERCHANT_CREATED", "ALL_PRODUCTS", "BEST_DEALS", "PINNER_FAVORITES", "TOP_SELLERS", "BACK_IN_STOCK", "NEW_ARRIVALS", "SHOPIFY_COLLECTIONS", "I2PC" };
    return typeArray[type];
}

pinterest_rest_api_catalogs_vertical_product_group__e catalogs_vertical_product_group_type_FromString(char* type){
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
char* catalogs_vertical_product_group_status_ToString(pinterest_rest_api_catalogs_vertical_product_group__e status) {
    char* statusArray[] =  { "NULL", "ACTIVE", "INACTIVE" };
    return statusArray[status];
}

pinterest_rest_api_catalogs_vertical_product_group__e catalogs_vertical_product_group_status_FromString(char* status){
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
char* catalogs_vertical_product_group_feed_id_ToString(pinterest_rest_api_catalogs_vertical_product_group_FEEDID_e feed_id) {
    char* feed_idArray[] =  { "NULL", "" };
    return feed_idArray[feed_id];
}

pinterest_rest_api_catalogs_vertical_product_group_FEEDID_e catalogs_vertical_product_group_feed_id_FromString(char* feed_id){
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

catalogs_vertical_product_group_t *catalogs_vertical_product_group_create(
    pinterest_rest_api_catalogs_vertical_product_group_CATALOGTYPE_e catalog_type,
    char *id,
    char *name,
    char *description,
    catalogs_product_group_filters_t *filters,
    int created_at,
    int updated_at,
    char *catalog_id,
    int is_featured,
    catalogs_product_group_type_t *type,
    catalogs_product_group_status_t *status,
    pinterest_rest_api_catalogs_vertical_product_group_FEEDID_e feed_id
    ) {
    catalogs_vertical_product_group_t *catalogs_vertical_product_group_local_var = malloc(sizeof(catalogs_vertical_product_group_t));
    if (!catalogs_vertical_product_group_local_var) {
        return NULL;
    }
    catalogs_vertical_product_group_local_var->catalog_type = catalog_type;
    catalogs_vertical_product_group_local_var->id = id;
    catalogs_vertical_product_group_local_var->name = name;
    catalogs_vertical_product_group_local_var->description = description;
    catalogs_vertical_product_group_local_var->filters = filters;
    catalogs_vertical_product_group_local_var->created_at = created_at;
    catalogs_vertical_product_group_local_var->updated_at = updated_at;
    catalogs_vertical_product_group_local_var->catalog_id = catalog_id;
    catalogs_vertical_product_group_local_var->is_featured = is_featured;
    catalogs_vertical_product_group_local_var->type = type;
    catalogs_vertical_product_group_local_var->status = status;
    catalogs_vertical_product_group_local_var->feed_id = feed_id;

    return catalogs_vertical_product_group_local_var;
}


void catalogs_vertical_product_group_free(catalogs_vertical_product_group_t *catalogs_vertical_product_group) {
    if(NULL == catalogs_vertical_product_group){
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_vertical_product_group->id) {
        free(catalogs_vertical_product_group->id);
        catalogs_vertical_product_group->id = NULL;
    }
    if (catalogs_vertical_product_group->name) {
        free(catalogs_vertical_product_group->name);
        catalogs_vertical_product_group->name = NULL;
    }
    if (catalogs_vertical_product_group->description) {
        free(catalogs_vertical_product_group->description);
        catalogs_vertical_product_group->description = NULL;
    }
    if (catalogs_vertical_product_group->filters) {
        catalogs_product_group_filters_free(catalogs_vertical_product_group->filters);
        catalogs_vertical_product_group->filters = NULL;
    }
    if (catalogs_vertical_product_group->catalog_id) {
        free(catalogs_vertical_product_group->catalog_id);
        catalogs_vertical_product_group->catalog_id = NULL;
    }
    if (catalogs_vertical_product_group->type) {
        catalogs_product_group_type_free(catalogs_vertical_product_group->type);
        catalogs_vertical_product_group->type = NULL;
    }
    if (catalogs_vertical_product_group->status) {
        catalogs_product_group_status_free(catalogs_vertical_product_group->status);
        catalogs_vertical_product_group->status = NULL;
    }
    free(catalogs_vertical_product_group);
}

cJSON *catalogs_vertical_product_group_convertToJSON(catalogs_vertical_product_group_t *catalogs_vertical_product_group) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_vertical_product_group->catalog_type
    if (pinterest_rest_api_catalogs_vertical_product_group_CATALOGTYPE_NULL == catalogs_vertical_product_group->catalog_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_type", catalog_typecatalogs_vertical_product_group_ToString(catalogs_vertical_product_group->catalog_type)) == NULL)
    {
    goto fail; //Enum
    }


    // catalogs_vertical_product_group->id
    if (!catalogs_vertical_product_group->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", catalogs_vertical_product_group->id) == NULL) {
    goto fail; //String
    }


    // catalogs_vertical_product_group->name
    if(catalogs_vertical_product_group->name) {
    if(cJSON_AddStringToObject(item, "name", catalogs_vertical_product_group->name) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_vertical_product_group->description
    if(catalogs_vertical_product_group->description) {
    if(cJSON_AddStringToObject(item, "description", catalogs_vertical_product_group->description) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_vertical_product_group->filters
    if (!catalogs_vertical_product_group->filters) {
        goto fail;
    }
    cJSON *filters_local_JSON = catalogs_product_group_filters_convertToJSON(catalogs_vertical_product_group->filters);
    if(filters_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "filters", filters_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // catalogs_vertical_product_group->created_at
    if(catalogs_vertical_product_group->created_at) {
    if(cJSON_AddNumberToObject(item, "created_at", catalogs_vertical_product_group->created_at) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_vertical_product_group->updated_at
    if(catalogs_vertical_product_group->updated_at) {
    if(cJSON_AddNumberToObject(item, "updated_at", catalogs_vertical_product_group->updated_at) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_vertical_product_group->catalog_id
    if (!catalogs_vertical_product_group->catalog_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "catalog_id", catalogs_vertical_product_group->catalog_id) == NULL) {
    goto fail; //String
    }


    // catalogs_vertical_product_group->is_featured
    if(catalogs_vertical_product_group->is_featured) {
    if(cJSON_AddBoolToObject(item, "is_featured", catalogs_vertical_product_group->is_featured) == NULL) {
    goto fail; //Bool
    }
    }


    // catalogs_vertical_product_group->type
    if(catalogs_vertical_product_group->type != pinterest_rest_api_catalogs_vertical_product_group__NULL) {
    cJSON *type_local_JSON = catalogs_product_group_type_convertToJSON(catalogs_vertical_product_group->type);
    if(type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "type", type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // catalogs_vertical_product_group->status
    if(catalogs_vertical_product_group->status != pinterest_rest_api_catalogs_vertical_product_group__NULL) {
    cJSON *status_local_JSON = catalogs_product_group_status_convertToJSON(catalogs_vertical_product_group->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // catalogs_vertical_product_group->feed_id
    if (pinterest_rest_api_catalogs_vertical_product_group_FEEDID_NULL == catalogs_vertical_product_group->feed_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "feed_id", feed_idcatalogs_vertical_product_group_ToString(catalogs_vertical_product_group->feed_id)) == NULL)
    {
    goto fail; //Enum
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_vertical_product_group_t *catalogs_vertical_product_group_parseFromJSON(cJSON *catalogs_vertical_product_groupJSON){

    catalogs_vertical_product_group_t *catalogs_vertical_product_group_local_var = NULL;

    // define the local variable for catalogs_vertical_product_group->filters
    catalogs_product_group_filters_t *filters_local_nonprim = NULL;

    // define the local variable for catalogs_vertical_product_group->type
    catalogs_product_group_type_t *type_local_nonprim = NULL;

    // define the local variable for catalogs_vertical_product_group->status
    catalogs_product_group_status_t *status_local_nonprim = NULL;

    // catalogs_vertical_product_group->catalog_type
    cJSON *catalog_type = cJSON_GetObjectItemCaseSensitive(catalogs_vertical_product_groupJSON, "catalog_type");
    if (!catalog_type) {
        goto end;
    }

    pinterest_rest_api_catalogs_vertical_product_group_CATALOGTYPE_e catalog_typeVariable;
    
    if(!cJSON_IsString(catalog_type))
    {
    goto end; //Enum
    }
    catalog_typeVariable = catalogs_vertical_product_group_catalog_type_FromString(catalog_type->valuestring);

    // catalogs_vertical_product_group->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(catalogs_vertical_product_groupJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // catalogs_vertical_product_group->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(catalogs_vertical_product_groupJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // catalogs_vertical_product_group->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(catalogs_vertical_product_groupJSON, "description");
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // catalogs_vertical_product_group->filters
    cJSON *filters = cJSON_GetObjectItemCaseSensitive(catalogs_vertical_product_groupJSON, "filters");
    if (!filters) {
        goto end;
    }

    
    filters_local_nonprim = catalogs_product_group_filters_parseFromJSON(filters); //nonprimitive

    // catalogs_vertical_product_group->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(catalogs_vertical_product_groupJSON, "created_at");
    if (created_at) { 
    if(!cJSON_IsNumber(created_at))
    {
    goto end; //Numeric
    }
    }

    // catalogs_vertical_product_group->updated_at
    cJSON *updated_at = cJSON_GetObjectItemCaseSensitive(catalogs_vertical_product_groupJSON, "updated_at");
    if (updated_at) { 
    if(!cJSON_IsNumber(updated_at))
    {
    goto end; //Numeric
    }
    }

    // catalogs_vertical_product_group->catalog_id
    cJSON *catalog_id = cJSON_GetObjectItemCaseSensitive(catalogs_vertical_product_groupJSON, "catalog_id");
    if (!catalog_id) {
        goto end;
    }

    
    if(!cJSON_IsString(catalog_id))
    {
    goto end; //String
    }

    // catalogs_vertical_product_group->is_featured
    cJSON *is_featured = cJSON_GetObjectItemCaseSensitive(catalogs_vertical_product_groupJSON, "is_featured");
    if (is_featured) { 
    if(!cJSON_IsBool(is_featured))
    {
    goto end; //Bool
    }
    }

    // catalogs_vertical_product_group->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(catalogs_vertical_product_groupJSON, "type");
    if (type) { 
    type_local_nonprim = catalogs_product_group_type_parseFromJSON(type); //custom
    }

    // catalogs_vertical_product_group->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(catalogs_vertical_product_groupJSON, "status");
    if (status) { 
    status_local_nonprim = catalogs_product_group_status_parseFromJSON(status); //custom
    }

    // catalogs_vertical_product_group->feed_id
    cJSON *feed_id = cJSON_GetObjectItemCaseSensitive(catalogs_vertical_product_groupJSON, "feed_id");
    if (!feed_id) {
        goto end;
    }

    pinterest_rest_api_catalogs_vertical_product_group_FEEDID_e feed_idVariable;
    
    if(!cJSON_IsString(feed_id))
    {
    goto end; //Enum
    }
    feed_idVariable = catalogs_vertical_product_group_feed_id_FromString(feed_id->valuestring);


    catalogs_vertical_product_group_local_var = catalogs_vertical_product_group_create (
        catalog_typeVariable,
        strdup(id->valuestring),
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        filters_local_nonprim,
        created_at ? created_at->valuedouble : 0,
        updated_at ? updated_at->valuedouble : 0,
        strdup(catalog_id->valuestring),
        is_featured ? is_featured->valueint : 0,
        type ? type_local_nonprim : NULL,
        status ? status_local_nonprim : NULL,
        feed_idVariable
        );

    return catalogs_vertical_product_group_local_var;
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
