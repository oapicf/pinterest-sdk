#ifndef catalogs_hotel_attributes_TEST
#define catalogs_hotel_attributes_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_hotel_attributes_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_hotel_attributes.h"
catalogs_hotel_attributes_t* instantiate_catalogs_hotel_attributes(int include_optional);

#include "test_catalogs_hotel_address.c"
#include "test_catalogs_hotel_guest_ratings.c"
#include "test_catalogs_hotel_attributes_all_of_main_image.c"


catalogs_hotel_attributes_t* instantiate_catalogs_hotel_attributes(int include_optional) {
  catalogs_hotel_attributes_t* catalogs_hotel_attributes = NULL;
  if (include_optional) {
    catalogs_hotel_attributes = catalogs_hotel_attributes_create(
      "0",
      "0",
      "0",
      "0",
      1.337,
      1.337,
      list_createList(),
       // false, not to have infinite recursion
      instantiate_catalogs_hotel_address(0),
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "100 USD",
      "90 USD",
       // false, not to have infinite recursion
      instantiate_catalogs_hotel_guest_ratings(0),
       // false, not to have infinite recursion
      instantiate_catalogs_hotel_attributes_all_of_main_image(0),
      ["https://scene.example.com/image/image_v2.jpg","https://scene.example.com/image/image_v3.jpg"]
    );
  } else {
    catalogs_hotel_attributes = catalogs_hotel_attributes_create(
      "0",
      "0",
      "0",
      "0",
      1.337,
      1.337,
      list_createList(),
      NULL,
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "100 USD",
      "90 USD",
      NULL,
      NULL,
      ["https://scene.example.com/image/image_v2.jpg","https://scene.example.com/image/image_v3.jpg"]
    );
  }

  return catalogs_hotel_attributes;
}


#ifdef catalogs_hotel_attributes_MAIN

void test_catalogs_hotel_attributes(int include_optional) {
    catalogs_hotel_attributes_t* catalogs_hotel_attributes_1 = instantiate_catalogs_hotel_attributes(include_optional);

	cJSON* jsoncatalogs_hotel_attributes_1 = catalogs_hotel_attributes_convertToJSON(catalogs_hotel_attributes_1);
	printf("catalogs_hotel_attributes :\n%s\n", cJSON_Print(jsoncatalogs_hotel_attributes_1));
	catalogs_hotel_attributes_t* catalogs_hotel_attributes_2 = catalogs_hotel_attributes_parseFromJSON(jsoncatalogs_hotel_attributes_1);
	cJSON* jsoncatalogs_hotel_attributes_2 = catalogs_hotel_attributes_convertToJSON(catalogs_hotel_attributes_2);
	printf("repeating catalogs_hotel_attributes:\n%s\n", cJSON_Print(jsoncatalogs_hotel_attributes_2));
}

int main() {
  test_catalogs_hotel_attributes(1);
  test_catalogs_hotel_attributes(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_hotel_attributes_MAIN
#endif // catalogs_hotel_attributes_TEST
