#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "leads_exports.h"



static leads_exports_t *leads_exports_create_internal(
    char *leads_export_id
    ) {
    leads_exports_t *leads_exports_local_var = malloc(sizeof(leads_exports_t));
    if (!leads_exports_local_var) {
        return NULL;
    }
    memset(leads_exports_local_var, 0, sizeof(leads_exports_t));
    leads_exports_local_var->_library_owned = 1;
    leads_exports_local_var->leads_export_id = leads_export_id;
    return leads_exports_local_var;
}

__attribute__((deprecated)) leads_exports_t *leads_exports_create(
    char *leads_export_id
    ) {
    leads_exports_t *result = leads_exports_create_internal (
        leads_export_id
        );
    if (!result) {
    }
    return result;
}

void leads_exports_free(leads_exports_t *leads_exports) {
    if(NULL == leads_exports){
        return ;
    }
    if(leads_exports->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "leads_exports_free");
        return ;
    }
    listEntry_t *listEntry;
    if (leads_exports->leads_export_id) {
        free(leads_exports->leads_export_id);
        leads_exports->leads_export_id = NULL;
    }
    free(leads_exports);
}

cJSON *leads_exports_convertToJSON(leads_exports_t *leads_exports) {
    cJSON *item = cJSON_CreateObject();

    // leads_exports->leads_export_id
    if(leads_exports->leads_export_id) {
    if(cJSON_AddStringToObject(item, "leads_export_id", leads_exports->leads_export_id) == NULL) {
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

leads_exports_t *leads_exports_parseFromJSON(cJSON *leads_exportsJSON){

    leads_exports_t *leads_exports_local_var = NULL;

    char *leads_export_id_local_str = NULL;

    // leads_exports->leads_export_id
    cJSON *leads_export_id = cJSON_GetObjectItemCaseSensitive(leads_exportsJSON, "leads_export_id");
    if (cJSON_IsNull(leads_export_id)) {
        leads_export_id = NULL;
    }
    if (leads_export_id) { 
    if(!cJSON_IsString(leads_export_id) && !cJSON_IsNull(leads_export_id))
    {
    goto end; //String
    }
    }


    if (leads_export_id && !cJSON_IsNull(leads_export_id)) leads_export_id_local_str = strdup(leads_export_id->valuestring);

    leads_exports_local_var = leads_exports_create_internal (
        leads_export_id_local_str
        );

    if (!leads_exports_local_var) {
        goto end;
    }

    return leads_exports_local_var;
end:
    if (leads_export_id_local_str) {
        free(leads_export_id_local_str);
        leads_export_id_local_str = NULL;
    }
    return NULL;

}
