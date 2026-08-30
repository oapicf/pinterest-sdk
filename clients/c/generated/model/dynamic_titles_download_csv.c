#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "dynamic_titles_download_csv.h"



static dynamic_titles_download_csv_t *dynamic_titles_download_csv_create_internal(
    char *download_url
    ) {
    dynamic_titles_download_csv_t *dynamic_titles_download_csv_local_var = malloc(sizeof(dynamic_titles_download_csv_t));
    if (!dynamic_titles_download_csv_local_var) {
        return NULL;
    }
    memset(dynamic_titles_download_csv_local_var, 0, sizeof(dynamic_titles_download_csv_t));
    dynamic_titles_download_csv_local_var->_library_owned = 1;
    dynamic_titles_download_csv_local_var->download_url = download_url;
    return dynamic_titles_download_csv_local_var;
}

__attribute__((deprecated)) dynamic_titles_download_csv_t *dynamic_titles_download_csv_create(
    char *download_url
    ) {
    dynamic_titles_download_csv_t *result = dynamic_titles_download_csv_create_internal (
        download_url
        );
    if (!result) {
    }
    return result;
}

void dynamic_titles_download_csv_free(dynamic_titles_download_csv_t *dynamic_titles_download_csv) {
    if(NULL == dynamic_titles_download_csv){
        return ;
    }
    if(dynamic_titles_download_csv->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "dynamic_titles_download_csv_free");
        return ;
    }
    listEntry_t *listEntry;
    if (dynamic_titles_download_csv->download_url) {
        free(dynamic_titles_download_csv->download_url);
        dynamic_titles_download_csv->download_url = NULL;
    }
    free(dynamic_titles_download_csv);
}

cJSON *dynamic_titles_download_csv_convertToJSON(dynamic_titles_download_csv_t *dynamic_titles_download_csv) {
    cJSON *item = cJSON_CreateObject();

    // dynamic_titles_download_csv->download_url
    if(dynamic_titles_download_csv->download_url) {
    if(cJSON_AddStringToObject(item, "download_url", dynamic_titles_download_csv->download_url) == NULL) {
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

dynamic_titles_download_csv_t *dynamic_titles_download_csv_parseFromJSON(cJSON *dynamic_titles_download_csvJSON){

    dynamic_titles_download_csv_t *dynamic_titles_download_csv_local_var = NULL;

    char *download_url_local_str = NULL;

    // dynamic_titles_download_csv->download_url
    cJSON *download_url = cJSON_GetObjectItemCaseSensitive(dynamic_titles_download_csvJSON, "download_url");
    if (cJSON_IsNull(download_url)) {
        download_url = NULL;
    }
    if (download_url) { 
    if(!cJSON_IsString(download_url) && !cJSON_IsNull(download_url))
    {
    goto end; //String
    }
    }


    if (download_url && !cJSON_IsNull(download_url)) download_url_local_str = strdup(download_url->valuestring);

    dynamic_titles_download_csv_local_var = dynamic_titles_download_csv_create_internal (
        download_url_local_str
        );

    if (!dynamic_titles_download_csv_local_var) {
        goto end;
    }

    return dynamic_titles_download_csv_local_var;
end:
    if (download_url_local_str) {
        free(download_url_local_str);
        download_url_local_str = NULL;
    }
    return NULL;

}
