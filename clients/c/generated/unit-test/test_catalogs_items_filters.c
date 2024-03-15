#ifndef catalogs_items_filters_TEST
#define catalogs_items_filters_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_items_filters_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_items_filters.h"
catalogs_items_filters_t* instantiate_catalogs_items_filters(int include_optional);



catalogs_items_filters_t* instantiate_catalogs_items_filters(int include_optional) {
  catalogs_items_filters_t* catalogs_items_filters = NULL;
  if (include_optional) {
    catalogs_items_filters = catalogs_items_filters_create(
      pinterest_rest_api_catalogs_items_filters__RETAIL,
      list_createList(),
      "a",
      list_createList()
    );
  } else {
    catalogs_items_filters = catalogs_items_filters_create(
      pinterest_rest_api_catalogs_items_filters__RETAIL,
      list_createList(),
      "a",
      list_createList()
    );
  }

  return catalogs_items_filters;
}


#ifdef catalogs_items_filters_MAIN

void test_catalogs_items_filters(int include_optional) {
    catalogs_items_filters_t* catalogs_items_filters_1 = instantiate_catalogs_items_filters(include_optional);

	cJSON* jsoncatalogs_items_filters_1 = catalogs_items_filters_convertToJSON(catalogs_items_filters_1);
	printf("catalogs_items_filters :\n%s\n", cJSON_Print(jsoncatalogs_items_filters_1));
	catalogs_items_filters_t* catalogs_items_filters_2 = catalogs_items_filters_parseFromJSON(jsoncatalogs_items_filters_1);
	cJSON* jsoncatalogs_items_filters_2 = catalogs_items_filters_convertToJSON(catalogs_items_filters_2);
	printf("repeating catalogs_items_filters:\n%s\n", cJSON_Print(jsoncatalogs_items_filters_2));
}

int main() {
  test_catalogs_items_filters(1);
  test_catalogs_items_filters(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_items_filters_MAIN
#endif // catalogs_items_filters_TEST
