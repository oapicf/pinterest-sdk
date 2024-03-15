#ifndef item_response_any_of_1_TEST
#define item_response_any_of_1_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define item_response_any_of_1_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/item_response_any_of_1.h"
item_response_any_of_1_t* instantiate_item_response_any_of_1(int include_optional);



item_response_any_of_1_t* instantiate_item_response_any_of_1(int include_optional) {
  item_response_any_of_1_t* item_response_any_of_1 = NULL;
  if (include_optional) {
    item_response_any_of_1 = item_response_any_of_1_create(
      pinterest_rest_api_item_response_any_of_1__RETAIL,
      "DS0294-M",
      list_createList(),
      "DS0294-M"
    );
  } else {
    item_response_any_of_1 = item_response_any_of_1_create(
      pinterest_rest_api_item_response_any_of_1__RETAIL,
      "DS0294-M",
      list_createList(),
      "DS0294-M"
    );
  }

  return item_response_any_of_1;
}


#ifdef item_response_any_of_1_MAIN

void test_item_response_any_of_1(int include_optional) {
    item_response_any_of_1_t* item_response_any_of_1_1 = instantiate_item_response_any_of_1(include_optional);

	cJSON* jsonitem_response_any_of_1_1 = item_response_any_of_1_convertToJSON(item_response_any_of_1_1);
	printf("item_response_any_of_1 :\n%s\n", cJSON_Print(jsonitem_response_any_of_1_1));
	item_response_any_of_1_t* item_response_any_of_1_2 = item_response_any_of_1_parseFromJSON(jsonitem_response_any_of_1_1);
	cJSON* jsonitem_response_any_of_1_2 = item_response_any_of_1_convertToJSON(item_response_any_of_1_2);
	printf("repeating item_response_any_of_1:\n%s\n", cJSON_Print(jsonitem_response_any_of_1_2));
}

int main() {
  test_item_response_any_of_1(1);
  test_item_response_any_of_1(0);

  printf("Hello world \n");
  return 0;
}

#endif // item_response_any_of_1_MAIN
#endif // item_response_any_of_1_TEST
