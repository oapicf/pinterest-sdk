#ifndef catalogs_hotel_product_TEST
#define catalogs_hotel_product_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_hotel_product_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_hotel_product.h"
catalogs_hotel_product_t* instantiate_catalogs_hotel_product(int include_optional);

#include "test_catalogs_hotel_product_metadata.c"
#include "test_pin.c"


catalogs_hotel_product_t* instantiate_catalogs_hotel_product(int include_optional) {
  catalogs_hotel_product_t* catalogs_hotel_product = NULL;
  if (include_optional) {
    catalogs_hotel_product = catalogs_hotel_product_create(
      pinterest_rest_api_catalogs_hotel_product_CATALOGTYPE_HOTEL,
       // false, not to have infinite recursion
      instantiate_catalogs_hotel_product_metadata(0),
       // false, not to have infinite recursion
      instantiate_pin(0)
    );
  } else {
    catalogs_hotel_product = catalogs_hotel_product_create(
      pinterest_rest_api_catalogs_hotel_product_CATALOGTYPE_HOTEL,
      NULL,
      NULL
    );
  }

  return catalogs_hotel_product;
}


#ifdef catalogs_hotel_product_MAIN

void test_catalogs_hotel_product(int include_optional) {
    catalogs_hotel_product_t* catalogs_hotel_product_1 = instantiate_catalogs_hotel_product(include_optional);

	cJSON* jsoncatalogs_hotel_product_1 = catalogs_hotel_product_convertToJSON(catalogs_hotel_product_1);
	printf("catalogs_hotel_product :\n%s\n", cJSON_Print(jsoncatalogs_hotel_product_1));
	catalogs_hotel_product_t* catalogs_hotel_product_2 = catalogs_hotel_product_parseFromJSON(jsoncatalogs_hotel_product_1);
	cJSON* jsoncatalogs_hotel_product_2 = catalogs_hotel_product_convertToJSON(catalogs_hotel_product_2);
	printf("repeating catalogs_hotel_product:\n%s\n", cJSON_Print(jsoncatalogs_hotel_product_2));
}

int main() {
  test_catalogs_hotel_product(1);
  test_catalogs_hotel_product(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_hotel_product_MAIN
#endif // catalogs_hotel_product_TEST
