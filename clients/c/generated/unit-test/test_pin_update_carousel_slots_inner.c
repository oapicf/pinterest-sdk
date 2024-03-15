#ifndef pin_update_carousel_slots_inner_TEST
#define pin_update_carousel_slots_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pin_update_carousel_slots_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pin_update_carousel_slots_inner.h"
pin_update_carousel_slots_inner_t* instantiate_pin_update_carousel_slots_inner(int include_optional);



pin_update_carousel_slots_inner_t* instantiate_pin_update_carousel_slots_inner(int include_optional) {
  pin_update_carousel_slots_inner_t* pin_update_carousel_slots_inner = NULL;
  if (include_optional) {
    pin_update_carousel_slots_inner = pin_update_carousel_slots_inner_create(
      "0",
      "0",
      "0"
    );
  } else {
    pin_update_carousel_slots_inner = pin_update_carousel_slots_inner_create(
      "0",
      "0",
      "0"
    );
  }

  return pin_update_carousel_slots_inner;
}


#ifdef pin_update_carousel_slots_inner_MAIN

void test_pin_update_carousel_slots_inner(int include_optional) {
    pin_update_carousel_slots_inner_t* pin_update_carousel_slots_inner_1 = instantiate_pin_update_carousel_slots_inner(include_optional);

	cJSON* jsonpin_update_carousel_slots_inner_1 = pin_update_carousel_slots_inner_convertToJSON(pin_update_carousel_slots_inner_1);
	printf("pin_update_carousel_slots_inner :\n%s\n", cJSON_Print(jsonpin_update_carousel_slots_inner_1));
	pin_update_carousel_slots_inner_t* pin_update_carousel_slots_inner_2 = pin_update_carousel_slots_inner_parseFromJSON(jsonpin_update_carousel_slots_inner_1);
	cJSON* jsonpin_update_carousel_slots_inner_2 = pin_update_carousel_slots_inner_convertToJSON(pin_update_carousel_slots_inner_2);
	printf("repeating pin_update_carousel_slots_inner:\n%s\n", cJSON_Print(jsonpin_update_carousel_slots_inner_2));
}

int main() {
  test_pin_update_carousel_slots_inner(1);
  test_pin_update_carousel_slots_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // pin_update_carousel_slots_inner_MAIN
#endif // pin_update_carousel_slots_inner_TEST
