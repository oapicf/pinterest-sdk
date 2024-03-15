#ifndef catalogs_hotel_address_TEST
#define catalogs_hotel_address_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_hotel_address_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_hotel_address.h"
catalogs_hotel_address_t* instantiate_catalogs_hotel_address(int include_optional);



catalogs_hotel_address_t* instantiate_catalogs_hotel_address(int include_optional) {
  catalogs_hotel_address_t* catalogs_hotel_address = NULL;
  if (include_optional) {
    catalogs_hotel_address = catalogs_hotel_address_create(
      "0",
      "0",
      "0",
      "0",
      "0"
    );
  } else {
    catalogs_hotel_address = catalogs_hotel_address_create(
      "0",
      "0",
      "0",
      "0",
      "0"
    );
  }

  return catalogs_hotel_address;
}


#ifdef catalogs_hotel_address_MAIN

void test_catalogs_hotel_address(int include_optional) {
    catalogs_hotel_address_t* catalogs_hotel_address_1 = instantiate_catalogs_hotel_address(include_optional);

	cJSON* jsoncatalogs_hotel_address_1 = catalogs_hotel_address_convertToJSON(catalogs_hotel_address_1);
	printf("catalogs_hotel_address :\n%s\n", cJSON_Print(jsoncatalogs_hotel_address_1));
	catalogs_hotel_address_t* catalogs_hotel_address_2 = catalogs_hotel_address_parseFromJSON(jsoncatalogs_hotel_address_1);
	cJSON* jsoncatalogs_hotel_address_2 = catalogs_hotel_address_convertToJSON(catalogs_hotel_address_2);
	printf("repeating catalogs_hotel_address:\n%s\n", cJSON_Print(jsoncatalogs_hotel_address_2));
}

int main() {
  test_catalogs_hotel_address(1);
  test_catalogs_hotel_address(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_hotel_address_MAIN
#endif // catalogs_hotel_address_TEST
