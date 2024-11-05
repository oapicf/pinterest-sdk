#ifndef catalogs_creative_assets_product_TEST
#define catalogs_creative_assets_product_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_creative_assets_product_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_creative_assets_product.h"
catalogs_creative_assets_product_t* instantiate_catalogs_creative_assets_product(int include_optional);

#include "test_catalogs_creative_assets_product_metadata.c"
#include "test_pin.c"


catalogs_creative_assets_product_t* instantiate_catalogs_creative_assets_product(int include_optional) {
  catalogs_creative_assets_product_t* catalogs_creative_assets_product = NULL;
  if (include_optional) {
    catalogs_creative_assets_product = catalogs_creative_assets_product_create(
      pinterest_rest_api_catalogs_creative_assets_product_CATALOGTYPE_CREATIVE_ASSETS,
       // false, not to have infinite recursion
      instantiate_catalogs_creative_assets_product_metadata(0),
       // false, not to have infinite recursion
      instantiate_pin(0)
    );
  } else {
    catalogs_creative_assets_product = catalogs_creative_assets_product_create(
      pinterest_rest_api_catalogs_creative_assets_product_CATALOGTYPE_CREATIVE_ASSETS,
      NULL,
      NULL
    );
  }

  return catalogs_creative_assets_product;
}


#ifdef catalogs_creative_assets_product_MAIN

void test_catalogs_creative_assets_product(int include_optional) {
    catalogs_creative_assets_product_t* catalogs_creative_assets_product_1 = instantiate_catalogs_creative_assets_product(include_optional);

	cJSON* jsoncatalogs_creative_assets_product_1 = catalogs_creative_assets_product_convertToJSON(catalogs_creative_assets_product_1);
	printf("catalogs_creative_assets_product :\n%s\n", cJSON_Print(jsoncatalogs_creative_assets_product_1));
	catalogs_creative_assets_product_t* catalogs_creative_assets_product_2 = catalogs_creative_assets_product_parseFromJSON(jsoncatalogs_creative_assets_product_1);
	cJSON* jsoncatalogs_creative_assets_product_2 = catalogs_creative_assets_product_convertToJSON(catalogs_creative_assets_product_2);
	printf("repeating catalogs_creative_assets_product:\n%s\n", cJSON_Print(jsoncatalogs_creative_assets_product_2));
}

int main() {
  test_catalogs_creative_assets_product(1);
  test_catalogs_creative_assets_product(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_creative_assets_product_MAIN
#endif // catalogs_creative_assets_product_TEST
