#ifndef catalogs_hotel_product_group_type_TEST
#define catalogs_hotel_product_group_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_hotel_product_group_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_hotel_product_group_type.h"
catalogs_hotel_product_group_type_t* instantiate_catalogs_hotel_product_group_type(int include_optional);



catalogs_hotel_product_group_type_t* instantiate_catalogs_hotel_product_group_type(int include_optional) {
  catalogs_hotel_product_group_type_t* catalogs_hotel_product_group_type = NULL;
  if (include_optional) {
    catalogs_hotel_product_group_type = catalogs_hotel_product_group_type_create(
    );
  } else {
    catalogs_hotel_product_group_type = catalogs_hotel_product_group_type_create(
    );
  }

  return catalogs_hotel_product_group_type;
}


#ifdef catalogs_hotel_product_group_type_MAIN

void test_catalogs_hotel_product_group_type(int include_optional) {
    catalogs_hotel_product_group_type_t* catalogs_hotel_product_group_type_1 = instantiate_catalogs_hotel_product_group_type(include_optional);

	cJSON* jsoncatalogs_hotel_product_group_type_1 = catalogs_hotel_product_group_type_convertToJSON(catalogs_hotel_product_group_type_1);
	printf("catalogs_hotel_product_group_type :\n%s\n", cJSON_Print(jsoncatalogs_hotel_product_group_type_1));
	catalogs_hotel_product_group_type_t* catalogs_hotel_product_group_type_2 = catalogs_hotel_product_group_type_parseFromJSON(jsoncatalogs_hotel_product_group_type_1);
	cJSON* jsoncatalogs_hotel_product_group_type_2 = catalogs_hotel_product_group_type_convertToJSON(catalogs_hotel_product_group_type_2);
	printf("repeating catalogs_hotel_product_group_type:\n%s\n", cJSON_Print(jsoncatalogs_hotel_product_group_type_2));
}

int main() {
  test_catalogs_hotel_product_group_type(1);
  test_catalogs_hotel_product_group_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_hotel_product_group_type_MAIN
#endif // catalogs_hotel_product_group_type_TEST
