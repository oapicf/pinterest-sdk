/*
 * catalogs_report_all_items_filter.h
 *
 * 
 */

#ifndef _catalogs_report_all_items_filter_H_
#define _catalogs_report_all_items_filter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_report_all_items_filter_t catalogs_report_all_items_filter_t;


// Enum REPORTTYPE for catalogs_report_all_items_filter

typedef enum  { pinterest_rest_api_catalogs_report_all_items_filter_REPORTTYPE_NULL = 0, pinterest_rest_api_catalogs_report_all_items_filter_REPORTTYPE_ALL_ITEMS } pinterest_rest_api_catalogs_report_all_items_filter_REPORTTYPE_e;

char* catalogs_report_all_items_filter_report_type_ToString(pinterest_rest_api_catalogs_report_all_items_filter_REPORTTYPE_e report_type);

pinterest_rest_api_catalogs_report_all_items_filter_REPORTTYPE_e catalogs_report_all_items_filter_report_type_FromString(char* report_type);



typedef struct catalogs_report_all_items_filter_t {
    char *catalog_id; // string
    pinterest_rest_api_catalogs_report_all_items_filter_REPORTTYPE_e report_type; //enum

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_report_all_items_filter_t;

__attribute__((deprecated)) catalogs_report_all_items_filter_t *catalogs_report_all_items_filter_create(
    char *catalog_id,
    pinterest_rest_api_catalogs_report_all_items_filter_REPORTTYPE_e report_type
);

void catalogs_report_all_items_filter_free(catalogs_report_all_items_filter_t *catalogs_report_all_items_filter);

catalogs_report_all_items_filter_t *catalogs_report_all_items_filter_parseFromJSON(cJSON *catalogs_report_all_items_filterJSON);

cJSON *catalogs_report_all_items_filter_convertToJSON(catalogs_report_all_items_filter_t *catalogs_report_all_items_filter);

#endif /* _catalogs_report_all_items_filter_H_ */

