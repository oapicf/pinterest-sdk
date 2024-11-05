#ifndef catalogs_creative_assets_product_metadata_TEST
#define catalogs_creative_assets_product_metadata_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_creative_assets_product_metadata_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_creative_assets_product_metadata.h"
catalogs_creative_assets_product_metadata_t* instantiate_catalogs_creative_assets_product_metadata(int include_optional);



catalogs_creative_assets_product_metadata_t* instantiate_catalogs_creative_assets_product_metadata(int include_optional) {
  catalogs_creative_assets_product_metadata_t* catalogs_creative_assets_product_metadata = NULL;
  if (include_optional) {
    catalogs_creative_assets_product_metadata = catalogs_creative_assets_product_metadata_create(
      "123abc",
      pinterest_rest_api_catalogs_creative_assets_product_metadata__VISIBLE
    );
  } else {
    catalogs_creative_assets_product_metadata = catalogs_creative_assets_product_metadata_create(
      "123abc",
      pinterest_rest_api_catalogs_creative_assets_product_metadata__VISIBLE
    );
  }

  return catalogs_creative_assets_product_metadata;
}


#ifdef catalogs_creative_assets_product_metadata_MAIN

void test_catalogs_creative_assets_product_metadata(int include_optional) {
    catalogs_creative_assets_product_metadata_t* catalogs_creative_assets_product_metadata_1 = instantiate_catalogs_creative_assets_product_metadata(include_optional);

	cJSON* jsoncatalogs_creative_assets_product_metadata_1 = catalogs_creative_assets_product_metadata_convertToJSON(catalogs_creative_assets_product_metadata_1);
	printf("catalogs_creative_assets_product_metadata :\n%s\n", cJSON_Print(jsoncatalogs_creative_assets_product_metadata_1));
	catalogs_creative_assets_product_metadata_t* catalogs_creative_assets_product_metadata_2 = catalogs_creative_assets_product_metadata_parseFromJSON(jsoncatalogs_creative_assets_product_metadata_1);
	cJSON* jsoncatalogs_creative_assets_product_metadata_2 = catalogs_creative_assets_product_metadata_convertToJSON(catalogs_creative_assets_product_metadata_2);
	printf("repeating catalogs_creative_assets_product_metadata:\n%s\n", cJSON_Print(jsoncatalogs_creative_assets_product_metadata_2));
}

int main() {
  test_catalogs_creative_assets_product_metadata(1);
  test_catalogs_creative_assets_product_metadata(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_creative_assets_product_metadata_MAIN
#endif // catalogs_creative_assets_product_metadata_TEST
