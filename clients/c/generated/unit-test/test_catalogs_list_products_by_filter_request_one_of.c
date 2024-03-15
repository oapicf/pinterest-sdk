#ifndef catalogs_list_products_by_filter_request_one_of_TEST
#define catalogs_list_products_by_filter_request_one_of_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_list_products_by_filter_request_one_of_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_list_products_by_filter_request_one_of.h"
catalogs_list_products_by_filter_request_one_of_t* instantiate_catalogs_list_products_by_filter_request_one_of(int include_optional);

#include "test_catalogs_product_group_filters.c"


catalogs_list_products_by_filter_request_one_of_t* instantiate_catalogs_list_products_by_filter_request_one_of(int include_optional) {
  catalogs_list_products_by_filter_request_one_of_t* catalogs_list_products_by_filter_request_one_of = NULL;
  if (include_optional) {
    catalogs_list_products_by_filter_request_one_of = catalogs_list_products_by_filter_request_one_of_create(
      "2680059592705",
       // false, not to have infinite recursion
      instantiate_catalogs_product_group_filters(0)
    );
  } else {
    catalogs_list_products_by_filter_request_one_of = catalogs_list_products_by_filter_request_one_of_create(
      "2680059592705",
      NULL
    );
  }

  return catalogs_list_products_by_filter_request_one_of;
}


#ifdef catalogs_list_products_by_filter_request_one_of_MAIN

void test_catalogs_list_products_by_filter_request_one_of(int include_optional) {
    catalogs_list_products_by_filter_request_one_of_t* catalogs_list_products_by_filter_request_one_of_1 = instantiate_catalogs_list_products_by_filter_request_one_of(include_optional);

	cJSON* jsoncatalogs_list_products_by_filter_request_one_of_1 = catalogs_list_products_by_filter_request_one_of_convertToJSON(catalogs_list_products_by_filter_request_one_of_1);
	printf("catalogs_list_products_by_filter_request_one_of :\n%s\n", cJSON_Print(jsoncatalogs_list_products_by_filter_request_one_of_1));
	catalogs_list_products_by_filter_request_one_of_t* catalogs_list_products_by_filter_request_one_of_2 = catalogs_list_products_by_filter_request_one_of_parseFromJSON(jsoncatalogs_list_products_by_filter_request_one_of_1);
	cJSON* jsoncatalogs_list_products_by_filter_request_one_of_2 = catalogs_list_products_by_filter_request_one_of_convertToJSON(catalogs_list_products_by_filter_request_one_of_2);
	printf("repeating catalogs_list_products_by_filter_request_one_of:\n%s\n", cJSON_Print(jsoncatalogs_list_products_by_filter_request_one_of_2));
}

int main() {
  test_catalogs_list_products_by_filter_request_one_of(1);
  test_catalogs_list_products_by_filter_request_one_of(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_list_products_by_filter_request_one_of_MAIN
#endif // catalogs_list_products_by_filter_request_one_of_TEST
