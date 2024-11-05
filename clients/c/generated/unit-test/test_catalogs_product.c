#ifndef catalogs_product_TEST
#define catalogs_product_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_product_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_product.h"
catalogs_product_t* instantiate_catalogs_product(int include_optional);

#include "test_catalogs_creative_assets_product_metadata.c"
#include "test_pin.c"


catalogs_product_t* instantiate_catalogs_product(int include_optional) {
  catalogs_product_t* catalogs_product = NULL;
  if (include_optional) {
    catalogs_product = catalogs_product_create(
      pinterest_rest_api_catalogs_product__RETAIL,
       // false, not to have infinite recursion
      instantiate_catalogs_creative_assets_product_metadata(0),
       // false, not to have infinite recursion
      instantiate_pin(0)
    );
  } else {
    catalogs_product = catalogs_product_create(
      pinterest_rest_api_catalogs_product__RETAIL,
      NULL,
      NULL
    );
  }

  return catalogs_product;
}


#ifdef catalogs_product_MAIN

void test_catalogs_product(int include_optional) {
    catalogs_product_t* catalogs_product_1 = instantiate_catalogs_product(include_optional);

	cJSON* jsoncatalogs_product_1 = catalogs_product_convertToJSON(catalogs_product_1);
	printf("catalogs_product :\n%s\n", cJSON_Print(jsoncatalogs_product_1));
	catalogs_product_t* catalogs_product_2 = catalogs_product_parseFromJSON(jsoncatalogs_product_1);
	cJSON* jsoncatalogs_product_2 = catalogs_product_convertToJSON(catalogs_product_2);
	printf("repeating catalogs_product:\n%s\n", cJSON_Print(jsoncatalogs_product_2));
}

int main() {
  test_catalogs_product(1);
  test_catalogs_product(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_product_MAIN
#endif // catalogs_product_TEST
