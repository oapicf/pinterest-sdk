#ifndef pin_update_TEST
#define pin_update_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pin_update_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pin_update.h"
pin_update_t* instantiate_pin_update(int include_optional);



pin_update_t* instantiate_pin_update(int include_optional) {
  pin_update_t* pin_update = NULL;
  if (include_optional) {
    pin_update = pin_update_create(
      "0",
      "a",
      "a",
      "0",
      "https://www.pinterest.com/",
      "0",
      list_createList(),
      "0"
    );
  } else {
    pin_update = pin_update_create(
      "0",
      "a",
      "a",
      "0",
      "https://www.pinterest.com/",
      "0",
      list_createList(),
      "0"
    );
  }

  return pin_update;
}


#ifdef pin_update_MAIN

void test_pin_update(int include_optional) {
    pin_update_t* pin_update_1 = instantiate_pin_update(include_optional);

	cJSON* jsonpin_update_1 = pin_update_convertToJSON(pin_update_1);
	printf("pin_update :\n%s\n", cJSON_Print(jsonpin_update_1));
	pin_update_t* pin_update_2 = pin_update_parseFromJSON(jsonpin_update_1);
	cJSON* jsonpin_update_2 = pin_update_convertToJSON(pin_update_2);
	printf("repeating pin_update:\n%s\n", cJSON_Print(jsonpin_update_2));
}

int main() {
  test_pin_update(1);
  test_pin_update(0);

  printf("Hello world \n");
  return 0;
}

#endif // pin_update_MAIN
#endif // pin_update_TEST
