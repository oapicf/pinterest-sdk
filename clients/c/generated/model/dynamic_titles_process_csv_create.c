#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "dynamic_titles_process_csv_create.h"



static dynamic_titles_process_csv_create_t *dynamic_titles_process_csv_create_create_internal(
    char *request_id
    ) {
    dynamic_titles_process_csv_create_t *dynamic_titles_process_csv_create_local_var = malloc(sizeof(dynamic_titles_process_csv_create_t));
    if (!dynamic_titles_process_csv_create_local_var) {
        return NULL;
    }
    memset(dynamic_titles_process_csv_create_local_var, 0, sizeof(dynamic_titles_process_csv_create_t));
    dynamic_titles_process_csv_create_local_var->_library_owned = 1;
    dynamic_titles_process_csv_create_local_var->request_id = request_id;
    return dynamic_titles_process_csv_create_local_var;
}

__attribute__((deprecated)) dynamic_titles_process_csv_create_t *dynamic_titles_process_csv_create_create(
    char *request_id
    ) {
    dynamic_titles_process_csv_create_t *result = dynamic_titles_process_csv_create_create_internal (
        request_id
        );
    if (!result) {
    }
    return result;
}

void dynamic_titles_process_csv_create_free(dynamic_titles_process_csv_create_t *dynamic_titles_process_csv_create) {
    if(NULL == dynamic_titles_process_csv_create){
        return ;
    }
    if(dynamic_titles_process_csv_create->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "dynamic_titles_process_csv_create_free");
        return ;
    }
    listEntry_t *listEntry;
    if (dynamic_titles_process_csv_create->request_id) {
        free(dynamic_titles_process_csv_create->request_id);
        dynamic_titles_process_csv_create->request_id = NULL;
    }
    free(dynamic_titles_process_csv_create);
}

cJSON *dynamic_titles_process_csv_create_convertToJSON(dynamic_titles_process_csv_create_t *dynamic_titles_process_csv_create) {
    cJSON *item = cJSON_CreateObject();

    // dynamic_titles_process_csv_create->request_id
    if (!dynamic_titles_process_csv_create->request_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "request_id", dynamic_titles_process_csv_create->request_id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

dynamic_titles_process_csv_create_t *dynamic_titles_process_csv_create_parseFromJSON(cJSON *dynamic_titles_process_csv_createJSON){

    dynamic_titles_process_csv_create_t *dynamic_titles_process_csv_create_local_var = NULL;

    char *request_id_local_str = NULL;

    // dynamic_titles_process_csv_create->request_id
    cJSON *request_id = cJSON_GetObjectItemCaseSensitive(dynamic_titles_process_csv_createJSON, "request_id");
    if (cJSON_IsNull(request_id)) {
        request_id = NULL;
    }
    if (!request_id) {
        goto end;
    }

    
    if(!cJSON_IsString(request_id))
    {
    goto end; //String
    }


    if (request_id && !cJSON_IsNull(request_id)) request_id_local_str = strdup(request_id->valuestring);

    dynamic_titles_process_csv_create_local_var = dynamic_titles_process_csv_create_create_internal (
        request_id_local_str
        );

    if (!dynamic_titles_process_csv_create_local_var) {
        goto end;
    }

    return dynamic_titles_process_csv_create_local_var;
end:
    if (request_id_local_str) {
        free(request_id_local_str);
        request_id_local_str = NULL;
    }
    return NULL;

}
