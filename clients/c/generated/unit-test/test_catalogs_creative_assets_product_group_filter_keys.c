#ifndef catalogs_creative_assets_product_group_filter_keys_TEST
#define catalogs_creative_assets_product_group_filter_keys_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_creative_assets_product_group_filter_keys_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_creative_assets_product_group_filter_keys.h"
catalogs_creative_assets_product_group_filter_keys_t* instantiate_catalogs_creative_assets_product_group_filter_keys(int include_optional);



catalogs_creative_assets_product_group_filter_keys_t* instantiate_catalogs_creative_assets_product_group_filter_keys(int include_optional) {
  catalogs_creative_assets_product_group_filter_keys_t* catalogs_creative_assets_product_group_filter_keys = NULL;
  if (include_optional) {
    catalogs_creative_assets_product_group_filter_keys = catalogs_creative_assets_product_group_filter_keys_create(
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0
    );
  } else {
    catalogs_creative_assets_product_group_filter_keys = catalogs_creative_assets_product_group_filter_keys_create(
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0
    );
  }

  return catalogs_creative_assets_product_group_filter_keys;
}


#ifdef catalogs_creative_assets_product_group_filter_keys_MAIN

void test_catalogs_creative_assets_product_group_filter_keys(int include_optional) {
    catalogs_creative_assets_product_group_filter_keys_t* catalogs_creative_assets_product_group_filter_keys_1 = instantiate_catalogs_creative_assets_product_group_filter_keys(include_optional);

	cJSON* jsoncatalogs_creative_assets_product_group_filter_keys_1 = catalogs_creative_assets_product_group_filter_keys_convertToJSON(catalogs_creative_assets_product_group_filter_keys_1);
	printf("catalogs_creative_assets_product_group_filter_keys :\n%s\n", cJSON_Print(jsoncatalogs_creative_assets_product_group_filter_keys_1));
	catalogs_creative_assets_product_group_filter_keys_t* catalogs_creative_assets_product_group_filter_keys_2 = catalogs_creative_assets_product_group_filter_keys_parseFromJSON(jsoncatalogs_creative_assets_product_group_filter_keys_1);
	cJSON* jsoncatalogs_creative_assets_product_group_filter_keys_2 = catalogs_creative_assets_product_group_filter_keys_convertToJSON(catalogs_creative_assets_product_group_filter_keys_2);
	printf("repeating catalogs_creative_assets_product_group_filter_keys:\n%s\n", cJSON_Print(jsoncatalogs_creative_assets_product_group_filter_keys_2));
}

int main() {
  test_catalogs_creative_assets_product_group_filter_keys(1);
  test_catalogs_creative_assets_product_group_filter_keys(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_creative_assets_product_group_filter_keys_MAIN
#endif // catalogs_creative_assets_product_group_filter_keys_TEST
