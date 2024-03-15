#ifndef catalogs_hotel_product_group_TEST
#define catalogs_hotel_product_group_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_hotel_product_group_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_hotel_product_group.h"
catalogs_hotel_product_group_t* instantiate_catalogs_hotel_product_group(int include_optional);

#include "test_catalogs_hotel_product_group_filters.c"


catalogs_hotel_product_group_t* instantiate_catalogs_hotel_product_group(int include_optional) {
  catalogs_hotel_product_group_t* catalogs_hotel_product_group = NULL;
  if (include_optional) {
    catalogs_hotel_product_group = catalogs_hotel_product_group_create(
      pinterest_rest_api_catalogs_hotel_product_group_CATALOGTYPE_HOTEL,
      "443727193917",
      "Most Popular",
      "0",
       // false, not to have infinite recursion
      instantiate_catalogs_hotel_product_group_filters(0),
      1621350033000,
      1622742155000,
      "a"
    );
  } else {
    catalogs_hotel_product_group = catalogs_hotel_product_group_create(
      pinterest_rest_api_catalogs_hotel_product_group_CATALOGTYPE_HOTEL,
      "443727193917",
      "Most Popular",
      "0",
      NULL,
      1621350033000,
      1622742155000,
      "a"
    );
  }

  return catalogs_hotel_product_group;
}


#ifdef catalogs_hotel_product_group_MAIN

void test_catalogs_hotel_product_group(int include_optional) {
    catalogs_hotel_product_group_t* catalogs_hotel_product_group_1 = instantiate_catalogs_hotel_product_group(include_optional);

	cJSON* jsoncatalogs_hotel_product_group_1 = catalogs_hotel_product_group_convertToJSON(catalogs_hotel_product_group_1);
	printf("catalogs_hotel_product_group :\n%s\n", cJSON_Print(jsoncatalogs_hotel_product_group_1));
	catalogs_hotel_product_group_t* catalogs_hotel_product_group_2 = catalogs_hotel_product_group_parseFromJSON(jsoncatalogs_hotel_product_group_1);
	cJSON* jsoncatalogs_hotel_product_group_2 = catalogs_hotel_product_group_convertToJSON(catalogs_hotel_product_group_2);
	printf("repeating catalogs_hotel_product_group:\n%s\n", cJSON_Print(jsoncatalogs_hotel_product_group_2));
}

int main() {
  test_catalogs_hotel_product_group(1);
  test_catalogs_hotel_product_group(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_hotel_product_group_MAIN
#endif // catalogs_hotel_product_group_TEST
