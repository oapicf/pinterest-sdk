#ifndef catalogs_product_groups_create_request_TEST
#define catalogs_product_groups_create_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_product_groups_create_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_product_groups_create_request.h"
catalogs_product_groups_create_request_t* instantiate_catalogs_product_groups_create_request(int include_optional);

#include "test_catalogs_hotel_product_group_filters.c"


catalogs_product_groups_create_request_t* instantiate_catalogs_product_groups_create_request(int include_optional) {
  catalogs_product_groups_create_request_t* catalogs_product_groups_create_request = NULL;
  if (include_optional) {
    catalogs_product_groups_create_request = catalogs_product_groups_create_request_create(
      "0",
      "0",
      1,
       // false, not to have infinite recursion
      instantiate_catalogs_hotel_product_group_filters(0),
      "2680059592705",
      pinterest_rest_api_catalogs_product_groups_create_request_CATALOGTYPE_HOTEL,
      "2680059592705"
    );
  } else {
    catalogs_product_groups_create_request = catalogs_product_groups_create_request_create(
      "0",
      "0",
      1,
      NULL,
      "2680059592705",
      pinterest_rest_api_catalogs_product_groups_create_request_CATALOGTYPE_HOTEL,
      "2680059592705"
    );
  }

  return catalogs_product_groups_create_request;
}


#ifdef catalogs_product_groups_create_request_MAIN

void test_catalogs_product_groups_create_request(int include_optional) {
    catalogs_product_groups_create_request_t* catalogs_product_groups_create_request_1 = instantiate_catalogs_product_groups_create_request(include_optional);

	cJSON* jsoncatalogs_product_groups_create_request_1 = catalogs_product_groups_create_request_convertToJSON(catalogs_product_groups_create_request_1);
	printf("catalogs_product_groups_create_request :\n%s\n", cJSON_Print(jsoncatalogs_product_groups_create_request_1));
	catalogs_product_groups_create_request_t* catalogs_product_groups_create_request_2 = catalogs_product_groups_create_request_parseFromJSON(jsoncatalogs_product_groups_create_request_1);
	cJSON* jsoncatalogs_product_groups_create_request_2 = catalogs_product_groups_create_request_convertToJSON(catalogs_product_groups_create_request_2);
	printf("repeating catalogs_product_groups_create_request:\n%s\n", cJSON_Print(jsoncatalogs_product_groups_create_request_2));
}

int main() {
  test_catalogs_product_groups_create_request(1);
  test_catalogs_product_groups_create_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_product_groups_create_request_MAIN
#endif // catalogs_product_groups_create_request_TEST
