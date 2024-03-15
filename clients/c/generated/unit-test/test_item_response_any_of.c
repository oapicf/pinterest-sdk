#ifndef item_response_any_of_TEST
#define item_response_any_of_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define item_response_any_of_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/item_response_any_of.h"
item_response_any_of_t* instantiate_item_response_any_of(int include_optional);

#include "test_catalogs_hotel_attributes.c"


item_response_any_of_t* instantiate_item_response_any_of(int include_optional) {
  item_response_any_of_t* item_response_any_of = NULL;
  if (include_optional) {
    item_response_any_of = item_response_any_of_create(
      pinterest_rest_api_item_response_any_of__RETAIL,
      "DS0294-M",
      list_createList(),
       // false, not to have infinite recursion
      instantiate_catalogs_hotel_attributes(0),
      "DS0294-M"
    );
  } else {
    item_response_any_of = item_response_any_of_create(
      pinterest_rest_api_item_response_any_of__RETAIL,
      "DS0294-M",
      list_createList(),
      NULL,
      "DS0294-M"
    );
  }

  return item_response_any_of;
}


#ifdef item_response_any_of_MAIN

void test_item_response_any_of(int include_optional) {
    item_response_any_of_t* item_response_any_of_1 = instantiate_item_response_any_of(include_optional);

	cJSON* jsonitem_response_any_of_1 = item_response_any_of_convertToJSON(item_response_any_of_1);
	printf("item_response_any_of :\n%s\n", cJSON_Print(jsonitem_response_any_of_1));
	item_response_any_of_t* item_response_any_of_2 = item_response_any_of_parseFromJSON(jsonitem_response_any_of_1);
	cJSON* jsonitem_response_any_of_2 = item_response_any_of_convertToJSON(item_response_any_of_2);
	printf("repeating item_response_any_of:\n%s\n", cJSON_Print(jsonitem_response_any_of_2));
}

int main() {
  test_item_response_any_of(1);
  test_item_response_any_of(0);

  printf("Hello world \n");
  return 0;
}

#endif // item_response_any_of_MAIN
#endif // item_response_any_of_TEST
