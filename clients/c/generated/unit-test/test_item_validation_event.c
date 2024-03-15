#ifndef item_validation_event_TEST
#define item_validation_event_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define item_validation_event_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/item_validation_event.h"
item_validation_event_t* instantiate_item_validation_event(int include_optional);



item_validation_event_t* instantiate_item_validation_event(int include_optional) {
  item_validation_event_t* item_validation_event = NULL;
  if (include_optional) {
    item_validation_event = item_validation_event_create(
      "title",
      106,
      "Title is missing from product metadata."
    );
  } else {
    item_validation_event = item_validation_event_create(
      "title",
      106,
      "Title is missing from product metadata."
    );
  }

  return item_validation_event;
}


#ifdef item_validation_event_MAIN

void test_item_validation_event(int include_optional) {
    item_validation_event_t* item_validation_event_1 = instantiate_item_validation_event(include_optional);

	cJSON* jsonitem_validation_event_1 = item_validation_event_convertToJSON(item_validation_event_1);
	printf("item_validation_event :\n%s\n", cJSON_Print(jsonitem_validation_event_1));
	item_validation_event_t* item_validation_event_2 = item_validation_event_parseFromJSON(jsonitem_validation_event_1);
	cJSON* jsonitem_validation_event_2 = item_validation_event_convertToJSON(item_validation_event_2);
	printf("repeating item_validation_event:\n%s\n", cJSON_Print(jsonitem_validation_event_2));
}

int main() {
  test_item_validation_event(1);
  test_item_validation_event(0);

  printf("Hello world \n");
  return 0;
}

#endif // item_validation_event_MAIN
#endif // item_validation_event_TEST
