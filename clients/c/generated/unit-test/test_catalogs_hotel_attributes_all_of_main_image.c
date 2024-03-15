#ifndef catalogs_hotel_attributes_all_of_main_image_TEST
#define catalogs_hotel_attributes_all_of_main_image_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_hotel_attributes_all_of_main_image_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_hotel_attributes_all_of_main_image.h"
catalogs_hotel_attributes_all_of_main_image_t* instantiate_catalogs_hotel_attributes_all_of_main_image(int include_optional);



catalogs_hotel_attributes_all_of_main_image_t* instantiate_catalogs_hotel_attributes_all_of_main_image(int include_optional) {
  catalogs_hotel_attributes_all_of_main_image_t* catalogs_hotel_attributes_all_of_main_image = NULL;
  if (include_optional) {
    catalogs_hotel_attributes_all_of_main_image = catalogs_hotel_attributes_all_of_main_image_create(
      "0",
      list_createList()
    );
  } else {
    catalogs_hotel_attributes_all_of_main_image = catalogs_hotel_attributes_all_of_main_image_create(
      "0",
      list_createList()
    );
  }

  return catalogs_hotel_attributes_all_of_main_image;
}


#ifdef catalogs_hotel_attributes_all_of_main_image_MAIN

void test_catalogs_hotel_attributes_all_of_main_image(int include_optional) {
    catalogs_hotel_attributes_all_of_main_image_t* catalogs_hotel_attributes_all_of_main_image_1 = instantiate_catalogs_hotel_attributes_all_of_main_image(include_optional);

	cJSON* jsoncatalogs_hotel_attributes_all_of_main_image_1 = catalogs_hotel_attributes_all_of_main_image_convertToJSON(catalogs_hotel_attributes_all_of_main_image_1);
	printf("catalogs_hotel_attributes_all_of_main_image :\n%s\n", cJSON_Print(jsoncatalogs_hotel_attributes_all_of_main_image_1));
	catalogs_hotel_attributes_all_of_main_image_t* catalogs_hotel_attributes_all_of_main_image_2 = catalogs_hotel_attributes_all_of_main_image_parseFromJSON(jsoncatalogs_hotel_attributes_all_of_main_image_1);
	cJSON* jsoncatalogs_hotel_attributes_all_of_main_image_2 = catalogs_hotel_attributes_all_of_main_image_convertToJSON(catalogs_hotel_attributes_all_of_main_image_2);
	printf("repeating catalogs_hotel_attributes_all_of_main_image:\n%s\n", cJSON_Print(jsoncatalogs_hotel_attributes_all_of_main_image_2));
}

int main() {
  test_catalogs_hotel_attributes_all_of_main_image(1);
  test_catalogs_hotel_attributes_all_of_main_image(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_hotel_attributes_all_of_main_image_MAIN
#endif // catalogs_hotel_attributes_all_of_main_image_TEST
