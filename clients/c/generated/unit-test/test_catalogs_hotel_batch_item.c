#ifndef catalogs_hotel_batch_item_TEST
#define catalogs_hotel_batch_item_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_hotel_batch_item_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_hotel_batch_item.h"
catalogs_hotel_batch_item_t* instantiate_catalogs_hotel_batch_item(int include_optional);

#include "test_catalogs_updatable_hotel_attributes.c"


catalogs_hotel_batch_item_t* instantiate_catalogs_hotel_batch_item(int include_optional) {
  catalogs_hotel_batch_item_t* catalogs_hotel_batch_item = NULL;
  if (include_optional) {
    catalogs_hotel_batch_item = catalogs_hotel_batch_item_create(
      "DS0294-M",
      pinterest_rest_api_catalogs_hotel_batch_item_OPERATION_DELETE,
       // false, not to have infinite recursion
      instantiate_catalogs_updatable_hotel_attributes(0)
    );
  } else {
    catalogs_hotel_batch_item = catalogs_hotel_batch_item_create(
      "DS0294-M",
      pinterest_rest_api_catalogs_hotel_batch_item_OPERATION_DELETE,
      NULL
    );
  }

  return catalogs_hotel_batch_item;
}


#ifdef catalogs_hotel_batch_item_MAIN

void test_catalogs_hotel_batch_item(int include_optional) {
    catalogs_hotel_batch_item_t* catalogs_hotel_batch_item_1 = instantiate_catalogs_hotel_batch_item(include_optional);

	cJSON* jsoncatalogs_hotel_batch_item_1 = catalogs_hotel_batch_item_convertToJSON(catalogs_hotel_batch_item_1);
	printf("catalogs_hotel_batch_item :\n%s\n", cJSON_Print(jsoncatalogs_hotel_batch_item_1));
	catalogs_hotel_batch_item_t* catalogs_hotel_batch_item_2 = catalogs_hotel_batch_item_parseFromJSON(jsoncatalogs_hotel_batch_item_1);
	cJSON* jsoncatalogs_hotel_batch_item_2 = catalogs_hotel_batch_item_convertToJSON(catalogs_hotel_batch_item_2);
	printf("repeating catalogs_hotel_batch_item:\n%s\n", cJSON_Print(jsoncatalogs_hotel_batch_item_2));
}

int main() {
  test_catalogs_hotel_batch_item(1);
  test_catalogs_hotel_batch_item(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_hotel_batch_item_MAIN
#endif // catalogs_hotel_batch_item_TEST
