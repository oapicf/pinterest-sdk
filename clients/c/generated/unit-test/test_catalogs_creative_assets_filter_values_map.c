#ifndef catalogs_creative_assets_filter_values_map_TEST
#define catalogs_creative_assets_filter_values_map_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_creative_assets_filter_values_map_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_creative_assets_filter_values_map.h"
catalogs_creative_assets_filter_values_map_t* instantiate_catalogs_creative_assets_filter_values_map(int include_optional);



catalogs_creative_assets_filter_values_map_t* instantiate_catalogs_creative_assets_filter_values_map(int include_optional) {
  catalogs_creative_assets_filter_values_map_t* catalogs_creative_assets_filter_values_map = NULL;
  if (include_optional) {
    catalogs_creative_assets_filter_values_map = catalogs_creative_assets_filter_values_map_create(
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList()
    );
  } else {
    catalogs_creative_assets_filter_values_map = catalogs_creative_assets_filter_values_map_create(
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList()
    );
  }

  return catalogs_creative_assets_filter_values_map;
}


#ifdef catalogs_creative_assets_filter_values_map_MAIN

void test_catalogs_creative_assets_filter_values_map(int include_optional) {
    catalogs_creative_assets_filter_values_map_t* catalogs_creative_assets_filter_values_map_1 = instantiate_catalogs_creative_assets_filter_values_map(include_optional);

	cJSON* jsoncatalogs_creative_assets_filter_values_map_1 = catalogs_creative_assets_filter_values_map_convertToJSON(catalogs_creative_assets_filter_values_map_1);
	printf("catalogs_creative_assets_filter_values_map :\n%s\n", cJSON_Print(jsoncatalogs_creative_assets_filter_values_map_1));
	catalogs_creative_assets_filter_values_map_t* catalogs_creative_assets_filter_values_map_2 = catalogs_creative_assets_filter_values_map_parseFromJSON(jsoncatalogs_creative_assets_filter_values_map_1);
	cJSON* jsoncatalogs_creative_assets_filter_values_map_2 = catalogs_creative_assets_filter_values_map_convertToJSON(catalogs_creative_assets_filter_values_map_2);
	printf("repeating catalogs_creative_assets_filter_values_map:\n%s\n", cJSON_Print(jsoncatalogs_creative_assets_filter_values_map_2));
}

int main() {
  test_catalogs_creative_assets_filter_values_map(1);
  test_catalogs_creative_assets_filter_values_map(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_creative_assets_filter_values_map_MAIN
#endif // catalogs_creative_assets_filter_values_map_TEST
