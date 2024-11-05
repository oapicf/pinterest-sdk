#ifndef catalogs_creative_assets_items_post_filter_TEST
#define catalogs_creative_assets_items_post_filter_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_creative_assets_items_post_filter_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_creative_assets_items_post_filter.h"
catalogs_creative_assets_items_post_filter_t* instantiate_catalogs_creative_assets_items_post_filter(int include_optional);



catalogs_creative_assets_items_post_filter_t* instantiate_catalogs_creative_assets_items_post_filter(int include_optional) {
  catalogs_creative_assets_items_post_filter_t* catalogs_creative_assets_items_post_filter = NULL;
  if (include_optional) {
    catalogs_creative_assets_items_post_filter = catalogs_creative_assets_items_post_filter_create(
      pinterest_rest_api_catalogs_creative_assets_items_post_filter_CATALOGTYPE_CREATIVE_ASSETS,
      list_createList(),
      "a"
    );
  } else {
    catalogs_creative_assets_items_post_filter = catalogs_creative_assets_items_post_filter_create(
      pinterest_rest_api_catalogs_creative_assets_items_post_filter_CATALOGTYPE_CREATIVE_ASSETS,
      list_createList(),
      "a"
    );
  }

  return catalogs_creative_assets_items_post_filter;
}


#ifdef catalogs_creative_assets_items_post_filter_MAIN

void test_catalogs_creative_assets_items_post_filter(int include_optional) {
    catalogs_creative_assets_items_post_filter_t* catalogs_creative_assets_items_post_filter_1 = instantiate_catalogs_creative_assets_items_post_filter(include_optional);

	cJSON* jsoncatalogs_creative_assets_items_post_filter_1 = catalogs_creative_assets_items_post_filter_convertToJSON(catalogs_creative_assets_items_post_filter_1);
	printf("catalogs_creative_assets_items_post_filter :\n%s\n", cJSON_Print(jsoncatalogs_creative_assets_items_post_filter_1));
	catalogs_creative_assets_items_post_filter_t* catalogs_creative_assets_items_post_filter_2 = catalogs_creative_assets_items_post_filter_parseFromJSON(jsoncatalogs_creative_assets_items_post_filter_1);
	cJSON* jsoncatalogs_creative_assets_items_post_filter_2 = catalogs_creative_assets_items_post_filter_convertToJSON(catalogs_creative_assets_items_post_filter_2);
	printf("repeating catalogs_creative_assets_items_post_filter:\n%s\n", cJSON_Print(jsoncatalogs_creative_assets_items_post_filter_2));
}

int main() {
  test_catalogs_creative_assets_items_post_filter(1);
  test_catalogs_creative_assets_items_post_filter(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_creative_assets_items_post_filter_MAIN
#endif // catalogs_creative_assets_items_post_filter_TEST
