#ifndef catalogs_hotel_items_filter_TEST
#define catalogs_hotel_items_filter_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_hotel_items_filter_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_hotel_items_filter.h"
catalogs_hotel_items_filter_t* instantiate_catalogs_hotel_items_filter(int include_optional);



catalogs_hotel_items_filter_t* instantiate_catalogs_hotel_items_filter(int include_optional) {
  catalogs_hotel_items_filter_t* catalogs_hotel_items_filter = NULL;
  if (include_optional) {
    catalogs_hotel_items_filter = catalogs_hotel_items_filter_create(
      pinterest_rest_api_catalogs_hotel_items_filter_CATALOGTYPE_HOTEL,
      list_createList(),
      "a"
    );
  } else {
    catalogs_hotel_items_filter = catalogs_hotel_items_filter_create(
      pinterest_rest_api_catalogs_hotel_items_filter_CATALOGTYPE_HOTEL,
      list_createList(),
      "a"
    );
  }

  return catalogs_hotel_items_filter;
}


#ifdef catalogs_hotel_items_filter_MAIN

void test_catalogs_hotel_items_filter(int include_optional) {
    catalogs_hotel_items_filter_t* catalogs_hotel_items_filter_1 = instantiate_catalogs_hotel_items_filter(include_optional);

	cJSON* jsoncatalogs_hotel_items_filter_1 = catalogs_hotel_items_filter_convertToJSON(catalogs_hotel_items_filter_1);
	printf("catalogs_hotel_items_filter :\n%s\n", cJSON_Print(jsoncatalogs_hotel_items_filter_1));
	catalogs_hotel_items_filter_t* catalogs_hotel_items_filter_2 = catalogs_hotel_items_filter_parseFromJSON(jsoncatalogs_hotel_items_filter_1);
	cJSON* jsoncatalogs_hotel_items_filter_2 = catalogs_hotel_items_filter_convertToJSON(catalogs_hotel_items_filter_2);
	printf("repeating catalogs_hotel_items_filter:\n%s\n", cJSON_Print(jsoncatalogs_hotel_items_filter_2));
}

int main() {
  test_catalogs_hotel_items_filter(1);
  test_catalogs_hotel_items_filter(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_hotel_items_filter_MAIN
#endif // catalogs_hotel_items_filter_TEST
