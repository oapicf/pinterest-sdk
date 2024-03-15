#ifndef catalogs_product_group_filters_request_any_of_1_TEST
#define catalogs_product_group_filters_request_any_of_1_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_product_group_filters_request_any_of_1_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_product_group_filters_request_any_of_1.h"
catalogs_product_group_filters_request_any_of_1_t* instantiate_catalogs_product_group_filters_request_any_of_1(int include_optional);



catalogs_product_group_filters_request_any_of_1_t* instantiate_catalogs_product_group_filters_request_any_of_1(int include_optional) {
  catalogs_product_group_filters_request_any_of_1_t* catalogs_product_group_filters_request_any_of_1 = NULL;
  if (include_optional) {
    catalogs_product_group_filters_request_any_of_1 = catalogs_product_group_filters_request_any_of_1_create(
      list_createList()
    );
  } else {
    catalogs_product_group_filters_request_any_of_1 = catalogs_product_group_filters_request_any_of_1_create(
      list_createList()
    );
  }

  return catalogs_product_group_filters_request_any_of_1;
}


#ifdef catalogs_product_group_filters_request_any_of_1_MAIN

void test_catalogs_product_group_filters_request_any_of_1(int include_optional) {
    catalogs_product_group_filters_request_any_of_1_t* catalogs_product_group_filters_request_any_of_1_1 = instantiate_catalogs_product_group_filters_request_any_of_1(include_optional);

	cJSON* jsoncatalogs_product_group_filters_request_any_of_1_1 = catalogs_product_group_filters_request_any_of_1_convertToJSON(catalogs_product_group_filters_request_any_of_1_1);
	printf("catalogs_product_group_filters_request_any_of_1 :\n%s\n", cJSON_Print(jsoncatalogs_product_group_filters_request_any_of_1_1));
	catalogs_product_group_filters_request_any_of_1_t* catalogs_product_group_filters_request_any_of_1_2 = catalogs_product_group_filters_request_any_of_1_parseFromJSON(jsoncatalogs_product_group_filters_request_any_of_1_1);
	cJSON* jsoncatalogs_product_group_filters_request_any_of_1_2 = catalogs_product_group_filters_request_any_of_1_convertToJSON(catalogs_product_group_filters_request_any_of_1_2);
	printf("repeating catalogs_product_group_filters_request_any_of_1:\n%s\n", cJSON_Print(jsoncatalogs_product_group_filters_request_any_of_1_2));
}

int main() {
  test_catalogs_product_group_filters_request_any_of_1(1);
  test_catalogs_product_group_filters_request_any_of_1(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_product_group_filters_request_any_of_1_MAIN
#endif // catalogs_product_group_filters_request_any_of_1_TEST
