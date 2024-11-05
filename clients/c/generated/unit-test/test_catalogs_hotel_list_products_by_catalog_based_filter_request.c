#ifndef catalogs_hotel_list_products_by_catalog_based_filter_request_TEST
#define catalogs_hotel_list_products_by_catalog_based_filter_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_hotel_list_products_by_catalog_based_filter_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_hotel_list_products_by_catalog_based_filter_request.h"
catalogs_hotel_list_products_by_catalog_based_filter_request_t* instantiate_catalogs_hotel_list_products_by_catalog_based_filter_request(int include_optional);

#include "test_catalogs_hotel_product_group_filters.c"


catalogs_hotel_list_products_by_catalog_based_filter_request_t* instantiate_catalogs_hotel_list_products_by_catalog_based_filter_request(int include_optional) {
  catalogs_hotel_list_products_by_catalog_based_filter_request_t* catalogs_hotel_list_products_by_catalog_based_filter_request = NULL;
  if (include_optional) {
    catalogs_hotel_list_products_by_catalog_based_filter_request = catalogs_hotel_list_products_by_catalog_based_filter_request_create(
      pinterest_rest_api_catalogs_hotel_list_products_by_catalog_based_filter_request_CATALOGTYPE_HOTEL,
      "2680059592705",
       // false, not to have infinite recursion
      instantiate_catalogs_hotel_product_group_filters(0)
    );
  } else {
    catalogs_hotel_list_products_by_catalog_based_filter_request = catalogs_hotel_list_products_by_catalog_based_filter_request_create(
      pinterest_rest_api_catalogs_hotel_list_products_by_catalog_based_filter_request_CATALOGTYPE_HOTEL,
      "2680059592705",
      NULL
    );
  }

  return catalogs_hotel_list_products_by_catalog_based_filter_request;
}


#ifdef catalogs_hotel_list_products_by_catalog_based_filter_request_MAIN

void test_catalogs_hotel_list_products_by_catalog_based_filter_request(int include_optional) {
    catalogs_hotel_list_products_by_catalog_based_filter_request_t* catalogs_hotel_list_products_by_catalog_based_filter_request_1 = instantiate_catalogs_hotel_list_products_by_catalog_based_filter_request(include_optional);

	cJSON* jsoncatalogs_hotel_list_products_by_catalog_based_filter_request_1 = catalogs_hotel_list_products_by_catalog_based_filter_request_convertToJSON(catalogs_hotel_list_products_by_catalog_based_filter_request_1);
	printf("catalogs_hotel_list_products_by_catalog_based_filter_request :\n%s\n", cJSON_Print(jsoncatalogs_hotel_list_products_by_catalog_based_filter_request_1));
	catalogs_hotel_list_products_by_catalog_based_filter_request_t* catalogs_hotel_list_products_by_catalog_based_filter_request_2 = catalogs_hotel_list_products_by_catalog_based_filter_request_parseFromJSON(jsoncatalogs_hotel_list_products_by_catalog_based_filter_request_1);
	cJSON* jsoncatalogs_hotel_list_products_by_catalog_based_filter_request_2 = catalogs_hotel_list_products_by_catalog_based_filter_request_convertToJSON(catalogs_hotel_list_products_by_catalog_based_filter_request_2);
	printf("repeating catalogs_hotel_list_products_by_catalog_based_filter_request:\n%s\n", cJSON_Print(jsoncatalogs_hotel_list_products_by_catalog_based_filter_request_2));
}

int main() {
  test_catalogs_hotel_list_products_by_catalog_based_filter_request(1);
  test_catalogs_hotel_list_products_by_catalog_based_filter_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_hotel_list_products_by_catalog_based_filter_request_MAIN
#endif // catalogs_hotel_list_products_by_catalog_based_filter_request_TEST
