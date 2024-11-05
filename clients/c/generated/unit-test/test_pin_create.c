#ifndef pin_create_TEST
#define pin_create_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pin_create_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pin_create.h"
pin_create_t* instantiate_pin_create(int include_optional);

#include "test_board_owner.c"
#include "test_pin_media.c"
#include "test_pin_media_source.c"


pin_create_t* instantiate_pin_create(int include_optional) {
  pin_create_t* pin_create = NULL;
  if (include_optional) {
    pin_create = pin_create_create(
      "813744226420795884",
      "2020-01-01T20:10:40Z",
      "https://www.pinterest.com/",
      "0",
      "0",
      "#6E7874",
      "0",
      "a",
      "a",
       // false, not to have infinite recursion
      instantiate_board_owner(0),
       // false, not to have infinite recursion
      instantiate_pin_media(0),
      null,
      "a",
      "0"
    );
  } else {
    pin_create = pin_create_create(
      "813744226420795884",
      "2020-01-01T20:10:40Z",
      "https://www.pinterest.com/",
      "0",
      "0",
      "#6E7874",
      "0",
      "a",
      "a",
      NULL,
      NULL,
      null,
      "a",
      "0"
    );
  }

  return pin_create;
}


#ifdef pin_create_MAIN

void test_pin_create(int include_optional) {
    pin_create_t* pin_create_1 = instantiate_pin_create(include_optional);

	cJSON* jsonpin_create_1 = pin_create_convertToJSON(pin_create_1);
	printf("pin_create :\n%s\n", cJSON_Print(jsonpin_create_1));
	pin_create_t* pin_create_2 = pin_create_parseFromJSON(jsonpin_create_1);
	cJSON* jsonpin_create_2 = pin_create_convertToJSON(pin_create_2);
	printf("repeating pin_create:\n%s\n", cJSON_Print(jsonpin_create_2));
}

int main() {
  test_pin_create(1);
  test_pin_create(0);

  printf("Hello world \n");
  return 0;
}

#endif // pin_create_MAIN
#endif // pin_create_TEST
