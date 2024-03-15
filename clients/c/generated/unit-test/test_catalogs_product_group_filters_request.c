#ifndef catalogs_product_group_filters_request_TEST
#define catalogs_product_group_filters_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_product_group_filters_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_product_group_filters_request.h"
catalogs_product_group_filters_request_t* instantiate_catalogs_product_group_filters_request(int include_optional);



catalogs_product_group_filters_request_t* instantiate_catalogs_product_group_filters_request(int include_optional) {
  catalogs_product_group_filters_request_t* catalogs_product_group_filters_request = NULL;
  if (include_optional) {
    catalogs_product_group_filters_request = catalogs_product_group_filters_request_create(
      list_createList(),
      list_createList()
    );
  } else {
    catalogs_product_group_filters_request = catalogs_product_group_filters_request_create(
      list_createList(),
      list_createList()
    );
  }

  return catalogs_product_group_filters_request;
}


#ifdef catalogs_product_group_filters_request_MAIN

void test_catalogs_product_group_filters_request(int include_optional) {
    catalogs_product_group_filters_request_t* catalogs_product_group_filters_request_1 = instantiate_catalogs_product_group_filters_request(include_optional);

	cJSON* jsoncatalogs_product_group_filters_request_1 = catalogs_product_group_filters_request_convertToJSON(catalogs_product_group_filters_request_1);
	printf("catalogs_product_group_filters_request :\n%s\n", cJSON_Print(jsoncatalogs_product_group_filters_request_1));
	catalogs_product_group_filters_request_t* catalogs_product_group_filters_request_2 = catalogs_product_group_filters_request_parseFromJSON(jsoncatalogs_product_group_filters_request_1);
	cJSON* jsoncatalogs_product_group_filters_request_2 = catalogs_product_group_filters_request_convertToJSON(catalogs_product_group_filters_request_2);
	printf("repeating catalogs_product_group_filters_request:\n%s\n", cJSON_Print(jsoncatalogs_product_group_filters_request_2));
}

int main() {
  test_catalogs_product_group_filters_request(1);
  test_catalogs_product_group_filters_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_product_group_filters_request_MAIN
#endif // catalogs_product_group_filters_request_TEST
