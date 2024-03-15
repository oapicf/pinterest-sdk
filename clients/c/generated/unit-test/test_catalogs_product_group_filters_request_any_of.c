#ifndef catalogs_product_group_filters_request_any_of_TEST
#define catalogs_product_group_filters_request_any_of_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_product_group_filters_request_any_of_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_product_group_filters_request_any_of.h"
catalogs_product_group_filters_request_any_of_t* instantiate_catalogs_product_group_filters_request_any_of(int include_optional);



catalogs_product_group_filters_request_any_of_t* instantiate_catalogs_product_group_filters_request_any_of(int include_optional) {
  catalogs_product_group_filters_request_any_of_t* catalogs_product_group_filters_request_any_of = NULL;
  if (include_optional) {
    catalogs_product_group_filters_request_any_of = catalogs_product_group_filters_request_any_of_create(
      list_createList()
    );
  } else {
    catalogs_product_group_filters_request_any_of = catalogs_product_group_filters_request_any_of_create(
      list_createList()
    );
  }

  return catalogs_product_group_filters_request_any_of;
}


#ifdef catalogs_product_group_filters_request_any_of_MAIN

void test_catalogs_product_group_filters_request_any_of(int include_optional) {
    catalogs_product_group_filters_request_any_of_t* catalogs_product_group_filters_request_any_of_1 = instantiate_catalogs_product_group_filters_request_any_of(include_optional);

	cJSON* jsoncatalogs_product_group_filters_request_any_of_1 = catalogs_product_group_filters_request_any_of_convertToJSON(catalogs_product_group_filters_request_any_of_1);
	printf("catalogs_product_group_filters_request_any_of :\n%s\n", cJSON_Print(jsoncatalogs_product_group_filters_request_any_of_1));
	catalogs_product_group_filters_request_any_of_t* catalogs_product_group_filters_request_any_of_2 = catalogs_product_group_filters_request_any_of_parseFromJSON(jsoncatalogs_product_group_filters_request_any_of_1);
	cJSON* jsoncatalogs_product_group_filters_request_any_of_2 = catalogs_product_group_filters_request_any_of_convertToJSON(catalogs_product_group_filters_request_any_of_2);
	printf("repeating catalogs_product_group_filters_request_any_of:\n%s\n", cJSON_Print(jsoncatalogs_product_group_filters_request_any_of_2));
}

int main() {
  test_catalogs_product_group_filters_request_any_of(1);
  test_catalogs_product_group_filters_request_any_of(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_product_group_filters_request_any_of_MAIN
#endif // catalogs_product_group_filters_request_any_of_TEST
