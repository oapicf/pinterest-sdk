#ifndef catalogs_retail_items_filter_TEST
#define catalogs_retail_items_filter_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_retail_items_filter_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_retail_items_filter.h"
catalogs_retail_items_filter_t* instantiate_catalogs_retail_items_filter(int include_optional);



catalogs_retail_items_filter_t* instantiate_catalogs_retail_items_filter(int include_optional) {
  catalogs_retail_items_filter_t* catalogs_retail_items_filter = NULL;
  if (include_optional) {
    catalogs_retail_items_filter = catalogs_retail_items_filter_create(
      pinterest_rest_api_catalogs_retail_items_filter_CATALOGTYPE_RETAIL,
      list_createList(),
      "a"
    );
  } else {
    catalogs_retail_items_filter = catalogs_retail_items_filter_create(
      pinterest_rest_api_catalogs_retail_items_filter_CATALOGTYPE_RETAIL,
      list_createList(),
      "a"
    );
  }

  return catalogs_retail_items_filter;
}


#ifdef catalogs_retail_items_filter_MAIN

void test_catalogs_retail_items_filter(int include_optional) {
    catalogs_retail_items_filter_t* catalogs_retail_items_filter_1 = instantiate_catalogs_retail_items_filter(include_optional);

	cJSON* jsoncatalogs_retail_items_filter_1 = catalogs_retail_items_filter_convertToJSON(catalogs_retail_items_filter_1);
	printf("catalogs_retail_items_filter :\n%s\n", cJSON_Print(jsoncatalogs_retail_items_filter_1));
	catalogs_retail_items_filter_t* catalogs_retail_items_filter_2 = catalogs_retail_items_filter_parseFromJSON(jsoncatalogs_retail_items_filter_1);
	cJSON* jsoncatalogs_retail_items_filter_2 = catalogs_retail_items_filter_convertToJSON(catalogs_retail_items_filter_2);
	printf("repeating catalogs_retail_items_filter:\n%s\n", cJSON_Print(jsoncatalogs_retail_items_filter_2));
}

int main() {
  test_catalogs_retail_items_filter(1);
  test_catalogs_retail_items_filter(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_retail_items_filter_MAIN
#endif // catalogs_retail_items_filter_TEST
