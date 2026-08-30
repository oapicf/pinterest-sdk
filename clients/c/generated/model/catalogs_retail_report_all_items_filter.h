/*
 * catalogs_retail_report_all_items_filter.h
 *
 * ALL_ITEMS filter for retail catalogs. Optional product_group_id scopes the report to items in that product group. If omitted, all items are included.
 */

#ifndef _catalogs_retail_report_all_items_filter_H_
#define _catalogs_retail_report_all_items_filter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_retail_report_all_items_filter_t catalogs_retail_report_all_items_filter_t;


// Enum REPORTTYPE for catalogs_retail_report_all_items_filter

typedef enum  { pinterest_rest_api_catalogs_retail_report_all_items_filter_REPORTTYPE_NULL = 0, pinterest_rest_api_catalogs_retail_report_all_items_filter_REPORTTYPE_ALL_ITEMS } pinterest_rest_api_catalogs_retail_report_all_items_filter_REPORTTYPE_e;

char* catalogs_retail_report_all_items_filter_report_type_ToString(pinterest_rest_api_catalogs_retail_report_all_items_filter_REPORTTYPE_e report_type);

pinterest_rest_api_catalogs_retail_report_all_items_filter_REPORTTYPE_e catalogs_retail_report_all_items_filter_report_type_FromString(char* report_type);



typedef struct catalogs_retail_report_all_items_filter_t {
    char *catalog_id; // string
    char *product_group_id; // string
    pinterest_rest_api_catalogs_retail_report_all_items_filter_REPORTTYPE_e report_type; //enum

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_retail_report_all_items_filter_t;

__attribute__((deprecated)) catalogs_retail_report_all_items_filter_t *catalogs_retail_report_all_items_filter_create(
    char *catalog_id,
    char *product_group_id,
    pinterest_rest_api_catalogs_retail_report_all_items_filter_REPORTTYPE_e report_type
);

void catalogs_retail_report_all_items_filter_free(catalogs_retail_report_all_items_filter_t *catalogs_retail_report_all_items_filter);

catalogs_retail_report_all_items_filter_t *catalogs_retail_report_all_items_filter_parseFromJSON(cJSON *catalogs_retail_report_all_items_filterJSON);

cJSON *catalogs_retail_report_all_items_filter_convertToJSON(catalogs_retail_report_all_items_filter_t *catalogs_retail_report_all_items_filter);

#endif /* _catalogs_retail_report_all_items_filter_H_ */

