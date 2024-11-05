#ifndef catalogs_retail_product_TEST
#define catalogs_retail_product_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_retail_product_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_retail_product.h"
catalogs_retail_product_t* instantiate_catalogs_retail_product(int include_optional);

#include "test_catalogs_retail_product_metadata.c"
#include "test_pin.c"


catalogs_retail_product_t* instantiate_catalogs_retail_product(int include_optional) {
  catalogs_retail_product_t* catalogs_retail_product = NULL;
  if (include_optional) {
    catalogs_retail_product = catalogs_retail_product_create(
      pinterest_rest_api_catalogs_retail_product_CATALOGTYPE_RETAIL,
       // false, not to have infinite recursion
      instantiate_catalogs_retail_product_metadata(0),
       // false, not to have infinite recursion
      instantiate_pin(0)
    );
  } else {
    catalogs_retail_product = catalogs_retail_product_create(
      pinterest_rest_api_catalogs_retail_product_CATALOGTYPE_RETAIL,
      NULL,
      NULL
    );
  }

  return catalogs_retail_product;
}


#ifdef catalogs_retail_product_MAIN

void test_catalogs_retail_product(int include_optional) {
    catalogs_retail_product_t* catalogs_retail_product_1 = instantiate_catalogs_retail_product(include_optional);

	cJSON* jsoncatalogs_retail_product_1 = catalogs_retail_product_convertToJSON(catalogs_retail_product_1);
	printf("catalogs_retail_product :\n%s\n", cJSON_Print(jsoncatalogs_retail_product_1));
	catalogs_retail_product_t* catalogs_retail_product_2 = catalogs_retail_product_parseFromJSON(jsoncatalogs_retail_product_1);
	cJSON* jsoncatalogs_retail_product_2 = catalogs_retail_product_convertToJSON(catalogs_retail_product_2);
	printf("repeating catalogs_retail_product:\n%s\n", cJSON_Print(jsoncatalogs_retail_product_2));
}

int main() {
  test_catalogs_retail_product(1);
  test_catalogs_retail_product(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_retail_product_MAIN
#endif // catalogs_retail_product_TEST
