#ifndef catalogs_product_group_product_counts_vertical_TEST
#define catalogs_product_group_product_counts_vertical_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_product_group_product_counts_vertical_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_product_group_product_counts_vertical.h"
catalogs_product_group_product_counts_vertical_t* instantiate_catalogs_product_group_product_counts_vertical(int include_optional);



catalogs_product_group_product_counts_vertical_t* instantiate_catalogs_product_group_product_counts_vertical(int include_optional) {
  catalogs_product_group_product_counts_vertical_t* catalogs_product_group_product_counts_vertical = NULL;
  if (include_optional) {
    catalogs_product_group_product_counts_vertical = catalogs_product_group_product_counts_vertical_create(
      pinterest_rest_api_catalogs_product_group_product_counts_vertical__RETAIL,
      0,
      0,
      0,
      0,
      0
    );
  } else {
    catalogs_product_group_product_counts_vertical = catalogs_product_group_product_counts_vertical_create(
      pinterest_rest_api_catalogs_product_group_product_counts_vertical__RETAIL,
      0,
      0,
      0,
      0,
      0
    );
  }

  return catalogs_product_group_product_counts_vertical;
}


#ifdef catalogs_product_group_product_counts_vertical_MAIN

void test_catalogs_product_group_product_counts_vertical(int include_optional) {
    catalogs_product_group_product_counts_vertical_t* catalogs_product_group_product_counts_vertical_1 = instantiate_catalogs_product_group_product_counts_vertical(include_optional);

	cJSON* jsoncatalogs_product_group_product_counts_vertical_1 = catalogs_product_group_product_counts_vertical_convertToJSON(catalogs_product_group_product_counts_vertical_1);
	printf("catalogs_product_group_product_counts_vertical :\n%s\n", cJSON_Print(jsoncatalogs_product_group_product_counts_vertical_1));
	catalogs_product_group_product_counts_vertical_t* catalogs_product_group_product_counts_vertical_2 = catalogs_product_group_product_counts_vertical_parseFromJSON(jsoncatalogs_product_group_product_counts_vertical_1);
	cJSON* jsoncatalogs_product_group_product_counts_vertical_2 = catalogs_product_group_product_counts_vertical_convertToJSON(catalogs_product_group_product_counts_vertical_2);
	printf("repeating catalogs_product_group_product_counts_vertical:\n%s\n", cJSON_Print(jsoncatalogs_product_group_product_counts_vertical_2));
}

int main() {
  test_catalogs_product_group_product_counts_vertical(1);
  test_catalogs_product_group_product_counts_vertical(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_product_group_product_counts_vertical_MAIN
#endif // catalogs_product_group_product_counts_vertical_TEST
