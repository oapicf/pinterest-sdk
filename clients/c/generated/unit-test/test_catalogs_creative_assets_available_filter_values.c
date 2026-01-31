#ifndef catalogs_creative_assets_available_filter_values_TEST
#define catalogs_creative_assets_available_filter_values_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_creative_assets_available_filter_values_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_creative_assets_available_filter_values.h"
catalogs_creative_assets_available_filter_values_t* instantiate_catalogs_creative_assets_available_filter_values(int include_optional);

#include "test_catalogs_creative_assets_filter_values_map.c"


catalogs_creative_assets_available_filter_values_t* instantiate_catalogs_creative_assets_available_filter_values(int include_optional) {
  catalogs_creative_assets_available_filter_values_t* catalogs_creative_assets_available_filter_values = NULL;
  if (include_optional) {
    catalogs_creative_assets_available_filter_values = catalogs_creative_assets_available_filter_values_create(
      pinterest_rest_api_catalogs_creative_assets_available_filter_values_CATALOGTYPE_CREATIVE_ASSETS,
       // false, not to have infinite recursion
      instantiate_catalogs_creative_assets_filter_values_map(0)
    );
  } else {
    catalogs_creative_assets_available_filter_values = catalogs_creative_assets_available_filter_values_create(
      pinterest_rest_api_catalogs_creative_assets_available_filter_values_CATALOGTYPE_CREATIVE_ASSETS,
      NULL
    );
  }

  return catalogs_creative_assets_available_filter_values;
}


#ifdef catalogs_creative_assets_available_filter_values_MAIN

void test_catalogs_creative_assets_available_filter_values(int include_optional) {
    catalogs_creative_assets_available_filter_values_t* catalogs_creative_assets_available_filter_values_1 = instantiate_catalogs_creative_assets_available_filter_values(include_optional);

	cJSON* jsoncatalogs_creative_assets_available_filter_values_1 = catalogs_creative_assets_available_filter_values_convertToJSON(catalogs_creative_assets_available_filter_values_1);
	printf("catalogs_creative_assets_available_filter_values :\n%s\n", cJSON_Print(jsoncatalogs_creative_assets_available_filter_values_1));
	catalogs_creative_assets_available_filter_values_t* catalogs_creative_assets_available_filter_values_2 = catalogs_creative_assets_available_filter_values_parseFromJSON(jsoncatalogs_creative_assets_available_filter_values_1);
	cJSON* jsoncatalogs_creative_assets_available_filter_values_2 = catalogs_creative_assets_available_filter_values_convertToJSON(catalogs_creative_assets_available_filter_values_2);
	printf("repeating catalogs_creative_assets_available_filter_values:\n%s\n", cJSON_Print(jsoncatalogs_creative_assets_available_filter_values_2));
}

int main() {
  test_catalogs_creative_assets_available_filter_values(1);
  test_catalogs_creative_assets_available_filter_values(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_creative_assets_available_filter_values_MAIN
#endif // catalogs_creative_assets_available_filter_values_TEST
