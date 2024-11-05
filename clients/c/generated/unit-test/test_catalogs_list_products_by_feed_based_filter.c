#ifndef catalogs_list_products_by_feed_based_filter_TEST
#define catalogs_list_products_by_feed_based_filter_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_list_products_by_feed_based_filter_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_list_products_by_feed_based_filter.h"
catalogs_list_products_by_feed_based_filter_t* instantiate_catalogs_list_products_by_feed_based_filter(int include_optional);

#include "test_catalogs_product_group_filters.c"


catalogs_list_products_by_feed_based_filter_t* instantiate_catalogs_list_products_by_feed_based_filter(int include_optional) {
  catalogs_list_products_by_feed_based_filter_t* catalogs_list_products_by_feed_based_filter = NULL;
  if (include_optional) {
    catalogs_list_products_by_feed_based_filter = catalogs_list_products_by_feed_based_filter_create(
      "2680059592705",
       // false, not to have infinite recursion
      instantiate_catalogs_product_group_filters(0)
    );
  } else {
    catalogs_list_products_by_feed_based_filter = catalogs_list_products_by_feed_based_filter_create(
      "2680059592705",
      NULL
    );
  }

  return catalogs_list_products_by_feed_based_filter;
}


#ifdef catalogs_list_products_by_feed_based_filter_MAIN

void test_catalogs_list_products_by_feed_based_filter(int include_optional) {
    catalogs_list_products_by_feed_based_filter_t* catalogs_list_products_by_feed_based_filter_1 = instantiate_catalogs_list_products_by_feed_based_filter(include_optional);

	cJSON* jsoncatalogs_list_products_by_feed_based_filter_1 = catalogs_list_products_by_feed_based_filter_convertToJSON(catalogs_list_products_by_feed_based_filter_1);
	printf("catalogs_list_products_by_feed_based_filter :\n%s\n", cJSON_Print(jsoncatalogs_list_products_by_feed_based_filter_1));
	catalogs_list_products_by_feed_based_filter_t* catalogs_list_products_by_feed_based_filter_2 = catalogs_list_products_by_feed_based_filter_parseFromJSON(jsoncatalogs_list_products_by_feed_based_filter_1);
	cJSON* jsoncatalogs_list_products_by_feed_based_filter_2 = catalogs_list_products_by_feed_based_filter_convertToJSON(catalogs_list_products_by_feed_based_filter_2);
	printf("repeating catalogs_list_products_by_feed_based_filter:\n%s\n", cJSON_Print(jsoncatalogs_list_products_by_feed_based_filter_2));
}

int main() {
  test_catalogs_list_products_by_feed_based_filter(1);
  test_catalogs_list_products_by_feed_based_filter(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_list_products_by_feed_based_filter_MAIN
#endif // catalogs_list_products_by_feed_based_filter_TEST
