#ifndef catalogs_product_groups_create_201_response_TEST
#define catalogs_product_groups_create_201_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_product_groups_create_201_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_product_groups_create_201_response.h"
catalogs_product_groups_create_201_response_t* instantiate_catalogs_product_groups_create_201_response(int include_optional);

#include "test_catalogs_product_group_filters.c"


catalogs_product_groups_create_201_response_t* instantiate_catalogs_product_groups_create_201_response(int include_optional) {
  catalogs_product_groups_create_201_response_t* catalogs_product_groups_create_201_response = NULL;
  if (include_optional) {
    catalogs_product_groups_create_201_response = catalogs_product_groups_create_201_response_create(
      "443727193917",
      "Most Popular",
      "0",
       // false, not to have infinite recursion
      instantiate_catalogs_product_group_filters(0),
      1,
      pinterest_rest_api_catalogs_product_groups_create_201_response__"TOP_SELLERS",
      pinterest_rest_api_catalogs_product_groups_create_201_response__ACTIVE,
      1621350033000,
      1622742155000,
      pinterest_rest_api_catalogs_product_groups_create_201_response_FEEDID_ERROR_TO_EXAMPLE_VALUE,
      pinterest_rest_api_catalogs_product_groups_create_201_response_CATALOGTYPE_RETAIL,
      "a"
    );
  } else {
    catalogs_product_groups_create_201_response = catalogs_product_groups_create_201_response_create(
      "443727193917",
      "Most Popular",
      "0",
      NULL,
      1,
      pinterest_rest_api_catalogs_product_groups_create_201_response__"TOP_SELLERS",
      pinterest_rest_api_catalogs_product_groups_create_201_response__ACTIVE,
      1621350033000,
      1622742155000,
      pinterest_rest_api_catalogs_product_groups_create_201_response_FEEDID_ERROR_TO_EXAMPLE_VALUE,
      pinterest_rest_api_catalogs_product_groups_create_201_response_CATALOGTYPE_RETAIL,
      "a"
    );
  }

  return catalogs_product_groups_create_201_response;
}


#ifdef catalogs_product_groups_create_201_response_MAIN

void test_catalogs_product_groups_create_201_response(int include_optional) {
    catalogs_product_groups_create_201_response_t* catalogs_product_groups_create_201_response_1 = instantiate_catalogs_product_groups_create_201_response(include_optional);

	cJSON* jsoncatalogs_product_groups_create_201_response_1 = catalogs_product_groups_create_201_response_convertToJSON(catalogs_product_groups_create_201_response_1);
	printf("catalogs_product_groups_create_201_response :\n%s\n", cJSON_Print(jsoncatalogs_product_groups_create_201_response_1));
	catalogs_product_groups_create_201_response_t* catalogs_product_groups_create_201_response_2 = catalogs_product_groups_create_201_response_parseFromJSON(jsoncatalogs_product_groups_create_201_response_1);
	cJSON* jsoncatalogs_product_groups_create_201_response_2 = catalogs_product_groups_create_201_response_convertToJSON(catalogs_product_groups_create_201_response_2);
	printf("repeating catalogs_product_groups_create_201_response:\n%s\n", cJSON_Print(jsoncatalogs_product_groups_create_201_response_2));
}

int main() {
  test_catalogs_product_groups_create_201_response(1);
  test_catalogs_product_groups_create_201_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_product_groups_create_201_response_MAIN
#endif // catalogs_product_groups_create_201_response_TEST
