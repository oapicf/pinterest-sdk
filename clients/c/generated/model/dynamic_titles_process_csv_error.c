#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "dynamic_titles_process_csv_error.h"



static dynamic_titles_process_csv_error_t *dynamic_titles_process_csv_error_create_internal(
    char *error_type,
    int *row_number
    ) {
    dynamic_titles_process_csv_error_t *dynamic_titles_process_csv_error_local_var = malloc(sizeof(dynamic_titles_process_csv_error_t));
    if (!dynamic_titles_process_csv_error_local_var) {
        return NULL;
    }
    memset(dynamic_titles_process_csv_error_local_var, 0, sizeof(dynamic_titles_process_csv_error_t));
    dynamic_titles_process_csv_error_local_var->_library_owned = 1;
    dynamic_titles_process_csv_error_local_var->error_type = error_type;
    dynamic_titles_process_csv_error_local_var->row_number = row_number;
    return dynamic_titles_process_csv_error_local_var;
}

__attribute__((deprecated)) dynamic_titles_process_csv_error_t *dynamic_titles_process_csv_error_create(
    char *error_type,
    int *row_number
    ) {
    int *row_number_copy = NULL;
    if (row_number) {
        row_number_copy = malloc(sizeof(int));
        if (row_number_copy) *row_number_copy = *row_number;
    }
    dynamic_titles_process_csv_error_t *result = dynamic_titles_process_csv_error_create_internal (
        error_type,
        row_number_copy
        );
    if (!result) {
        free(row_number_copy);
    }
    return result;
}

void dynamic_titles_process_csv_error_free(dynamic_titles_process_csv_error_t *dynamic_titles_process_csv_error) {
    if(NULL == dynamic_titles_process_csv_error){
        return ;
    }
    if(dynamic_titles_process_csv_error->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "dynamic_titles_process_csv_error_free");
        return ;
    }
    listEntry_t *listEntry;
    if (dynamic_titles_process_csv_error->error_type) {
        free(dynamic_titles_process_csv_error->error_type);
        dynamic_titles_process_csv_error->error_type = NULL;
    }
    if (dynamic_titles_process_csv_error->row_number) {
        free(dynamic_titles_process_csv_error->row_number);
        dynamic_titles_process_csv_error->row_number = NULL;
    }
    free(dynamic_titles_process_csv_error);
}

cJSON *dynamic_titles_process_csv_error_convertToJSON(dynamic_titles_process_csv_error_t *dynamic_titles_process_csv_error) {
    cJSON *item = cJSON_CreateObject();

    // dynamic_titles_process_csv_error->error_type
    if(dynamic_titles_process_csv_error->error_type) {
    if(cJSON_AddStringToObject(item, "error_type", dynamic_titles_process_csv_error->error_type) == NULL) {
    goto fail; //String
    }
    }


    // dynamic_titles_process_csv_error->row_number
    if(dynamic_titles_process_csv_error->row_number) {
    if(cJSON_AddNumberToObject(item, "row_number", *dynamic_titles_process_csv_error->row_number) == NULL) {
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

dynamic_titles_process_csv_error_t *dynamic_titles_process_csv_error_parseFromJSON(cJSON *dynamic_titles_process_csv_errorJSON){

    dynamic_titles_process_csv_error_t *dynamic_titles_process_csv_error_local_var = NULL;

    char *error_type_local_str = NULL;

    // define the local variable for dynamic_titles_process_csv_error->row_number
    int *row_number_local_var = NULL;

    // dynamic_titles_process_csv_error->error_type
    cJSON *error_type = cJSON_GetObjectItemCaseSensitive(dynamic_titles_process_csv_errorJSON, "error_type");
    if (cJSON_IsNull(error_type)) {
        error_type = NULL;
    }
    if (error_type) { 
    if(!cJSON_IsString(error_type) && !cJSON_IsNull(error_type))
    {
    goto end; //String
    }
    }

    // dynamic_titles_process_csv_error->row_number
    cJSON *row_number = cJSON_GetObjectItemCaseSensitive(dynamic_titles_process_csv_errorJSON, "row_number");
    if (cJSON_IsNull(row_number)) {
        row_number = NULL;
    }
    if (row_number) { 
    if(!cJSON_IsNumber(row_number))
    {
    goto end; //Numeric
    }
    row_number_local_var = malloc(sizeof(int));
    if(!row_number_local_var)
    {
        goto end;
    }
    *row_number_local_var = row_number->valuedouble;
    }


    if (error_type && !cJSON_IsNull(error_type)) error_type_local_str = strdup(error_type->valuestring);

    dynamic_titles_process_csv_error_local_var = dynamic_titles_process_csv_error_create_internal (
        error_type_local_str,
        row_number_local_var
        );

    if (!dynamic_titles_process_csv_error_local_var) {
        goto end;
    }

    return dynamic_titles_process_csv_error_local_var;
end:
    if (error_type_local_str) {
        free(error_type_local_str);
        error_type_local_str = NULL;
    }
    if (row_number_local_var) {
        free(row_number_local_var);
        row_number_local_var = NULL;
    }
    return NULL;

}
