#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "label.h"


char* label_parent_type_ToString(pinterest_rest_api_label_PARENTTYPE_e parent_type) {
    char* parent_typeArray[] =  { "NULL", "CAMPAIGN", "" };
    return parent_typeArray[parent_type];
}

pinterest_rest_api_label_PARENTTYPE_e label_parent_type_FromString(char* parent_type){
    int stringToReturn = 0;
    char *parent_typeArray[] =  { "NULL", "CAMPAIGN", "" };
    size_t sizeofArray = sizeof(parent_typeArray) / sizeof(parent_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(parent_type, parent_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static label_t *label_create_internal(
    char *id,
    pinterest_rest_api_label_type__e label_type,
    char *parent_id,
    pinterest_rest_api_label_PARENTTYPE_e parent_type,
    pinterest_rest_api_label_status__e status,
    char *value
    ) {
    label_t *label_local_var = malloc(sizeof(label_t));
    if (!label_local_var) {
        return NULL;
    }
    label_local_var->id = id;
    label_local_var->label_type = label_type;
    label_local_var->parent_id = parent_id;
    label_local_var->parent_type = parent_type;
    label_local_var->status = status;
    label_local_var->value = value;

    label_local_var->_library_owned = 1;
    return label_local_var;
}

__attribute__((deprecated)) label_t *label_create(
    char *id,
    pinterest_rest_api_label_type__e label_type,
    char *parent_id,
    pinterest_rest_api_label_PARENTTYPE_e parent_type,
    pinterest_rest_api_label_status__e status,
    char *value
    ) {
    return label_create_internal (
        id,
        label_type,
        parent_id,
        parent_type,
        status,
        value
        );
}

void label_free(label_t *label) {
    if(NULL == label){
        return ;
    }
    if(label->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "label_free");
        return ;
    }
    listEntry_t *listEntry;
    if (label->id) {
        free(label->id);
        label->id = NULL;
    }
    if (label->parent_id) {
        free(label->parent_id);
        label->parent_id = NULL;
    }
    if (label->value) {
        free(label->value);
        label->value = NULL;
    }
    free(label);
}

cJSON *label_convertToJSON(label_t *label) {
    cJSON *item = cJSON_CreateObject();

    // label->id
    if(label->id) {
    if(cJSON_AddStringToObject(item, "id", label->id) == NULL) {
    goto fail; //String
    }
    }


    // label->label_type
    if(label->label_type != pinterest_rest_api_label_type__NULL) {
    cJSON *label_type_local_JSON = label_type_convertToJSON(label->label_type);
    if(label_type_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "label_type", label_type_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // label->parent_id
    if(label->parent_id) {
    if(cJSON_AddStringToObject(item, "parent_id", label->parent_id) == NULL) {
    goto fail; //String
    }
    }


    // label->parent_type
    if(label->parent_type != pinterest_rest_api_label_PARENTTYPE_NULL) {
    if(cJSON_AddStringToObject(item, "parent_type", label_parent_type_ToString(label->parent_type)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // label->status
    if(label->status != pinterest_rest_api_label_status__NULL) {
    cJSON *status_local_JSON = label_status_convertToJSON(label->status);
    if(status_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "status", status_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // label->value
    if(label->value) {
    if(cJSON_AddStringToObject(item, "value", label->value) == NULL) {
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

label_t *label_parseFromJSON(cJSON *labelJSON){

    label_t *label_local_var = NULL;

    // define the local variable for label->label_type
    pinterest_rest_api_label_type__e label_type_local_nonprim = 0;

    // define the local variable for label->status
    pinterest_rest_api_label_status__e status_local_nonprim = 0;

    // label->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(labelJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // label->label_type
    cJSON *label_type = cJSON_GetObjectItemCaseSensitive(labelJSON, "label_type");
    if (cJSON_IsNull(label_type)) {
        label_type = NULL;
    }
    if (label_type) { 
    label_type_local_nonprim = label_type_parseFromJSON(label_type); //custom
    }

    // label->parent_id
    cJSON *parent_id = cJSON_GetObjectItemCaseSensitive(labelJSON, "parent_id");
    if (cJSON_IsNull(parent_id)) {
        parent_id = NULL;
    }
    if (parent_id) { 
    if(!cJSON_IsString(parent_id) && !cJSON_IsNull(parent_id))
    {
    goto end; //String
    }
    }

    // label->parent_type
    cJSON *parent_type = cJSON_GetObjectItemCaseSensitive(labelJSON, "parent_type");
    if (cJSON_IsNull(parent_type)) {
        parent_type = NULL;
    }
    pinterest_rest_api_label_PARENTTYPE_e parent_typeVariable;
    if (parent_type) { 
    if(!cJSON_IsString(parent_type))
    {
    goto end; //Enum
    }
    parent_typeVariable = label_parent_type_FromString(parent_type->valuestring);
    }

    // label->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(labelJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (status) { 
    status_local_nonprim = label_status_parseFromJSON(status); //custom
    }

    // label->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(labelJSON, "value");
    if (cJSON_IsNull(value)) {
        value = NULL;
    }
    if (value) { 
    if(!cJSON_IsString(value) && !cJSON_IsNull(value))
    {
    goto end; //String
    }
    }


    label_local_var = label_create_internal (
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        label_type ? label_type_local_nonprim : 0,
        parent_id && !cJSON_IsNull(parent_id) ? strdup(parent_id->valuestring) : NULL,
        parent_type ? parent_typeVariable : pinterest_rest_api_label_PARENTTYPE_NULL,
        status ? status_local_nonprim : 0,
        value && !cJSON_IsNull(value) ? strdup(value->valuestring) : NULL
        );

    return label_local_var;
end:
    if (label_type_local_nonprim) {
        label_type_local_nonprim = 0;
    }
    if (status_local_nonprim) {
        status_local_nonprim = 0;
    }
    return NULL;

}
