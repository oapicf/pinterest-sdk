#ifndef item_response_TEST
#define item_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define item_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/item_response.h"
item_response_t* instantiate_item_response(int include_optional);

#include "test_catalogs_creative_assets_attributes.c"


item_response_t* instantiate_item_response(int include_optional) {
  item_response_t* item_response = NULL;
  if (include_optional) {
    item_response = item_response_create(
      pinterest_rest_api_item_response__RETAIL,
      "DS0294-M",
      list_createList(),
       // false, not to have infinite recursion
      instantiate_catalogs_creative_assets_attributes(0),
      "DS0294-M",
      "DS0294-M",
      list_createList()
    );
  } else {
    item_response = item_response_create(
      pinterest_rest_api_item_response__RETAIL,
      "DS0294-M",
      list_createList(),
      NULL,
      "DS0294-M",
      "DS0294-M",
      list_createList()
    );
  }

  return item_response;
}


#ifdef item_response_MAIN

void test_item_response(int include_optional) {
    item_response_t* item_response_1 = instantiate_item_response(include_optional);

	cJSON* jsonitem_response_1 = item_response_convertToJSON(item_response_1);
	printf("item_response :\n%s\n", cJSON_Print(jsonitem_response_1));
	item_response_t* item_response_2 = item_response_parseFromJSON(jsonitem_response_1);
	cJSON* jsonitem_response_2 = item_response_convertToJSON(item_response_2);
	printf("repeating item_response:\n%s\n", cJSON_Print(jsonitem_response_2));
}

int main() {
  test_item_response(1);
  test_item_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // item_response_MAIN
#endif // item_response_TEST
