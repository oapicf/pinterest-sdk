#ifndef catalogs_product_group_filters_TEST
#define catalogs_product_group_filters_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_product_group_filters_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_product_group_filters.h"
catalogs_product_group_filters_t* instantiate_catalogs_product_group_filters(int include_optional);



catalogs_product_group_filters_t* instantiate_catalogs_product_group_filters(int include_optional) {
  catalogs_product_group_filters_t* catalogs_product_group_filters = NULL;
  if (include_optional) {
    catalogs_product_group_filters = catalogs_product_group_filters_create(
      list_createList(),
      list_createList()
    );
  } else {
    catalogs_product_group_filters = catalogs_product_group_filters_create(
      list_createList(),
      list_createList()
    );
  }

  return catalogs_product_group_filters;
}


#ifdef catalogs_product_group_filters_MAIN

void test_catalogs_product_group_filters(int include_optional) {
    catalogs_product_group_filters_t* catalogs_product_group_filters_1 = instantiate_catalogs_product_group_filters(include_optional);

	cJSON* jsoncatalogs_product_group_filters_1 = catalogs_product_group_filters_convertToJSON(catalogs_product_group_filters_1);
	printf("catalogs_product_group_filters :\n%s\n", cJSON_Print(jsoncatalogs_product_group_filters_1));
	catalogs_product_group_filters_t* catalogs_product_group_filters_2 = catalogs_product_group_filters_parseFromJSON(jsoncatalogs_product_group_filters_1);
	cJSON* jsoncatalogs_product_group_filters_2 = catalogs_product_group_filters_convertToJSON(catalogs_product_group_filters_2);
	printf("repeating catalogs_product_group_filters:\n%s\n", cJSON_Print(jsoncatalogs_product_group_filters_2));
}

int main() {
  test_catalogs_product_group_filters(1);
  test_catalogs_product_group_filters(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_product_group_filters_MAIN
#endif // catalogs_product_group_filters_TEST
