#ifndef pin_TEST
#define pin_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pin_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pin.h"
pin_t* instantiate_pin(int include_optional);

#include "test_board_owner.c"
#include "test_summary_pin_media.c"
#include "test_pin_media_source.c"


pin_t* instantiate_pin(int include_optional) {
  pin_t* pin = NULL;
  if (include_optional) {
    pin = pin_create(
      "813744226420795884",
      "2020-01-01T20:10:40Z",
      "https://www.pinterest.com/",
      "0",
      "0",
      "#6E7874",
      "0",
      "REGULAR",
      "a",
      "a",
       // false, not to have infinite recursion
      instantiate_board_owner(0),
      1,
       // false, not to have infinite recursion
      instantiate_summary_pin_media(0),
      null,
      "a",
      1,
      1,
      "0",
      {"pin_metrics":[{"90d":{"pin_click":7,"impression":2,"clickthrough":3},"all_time":{"pin_click":7,"impression":2,"clickthrough":3,"reaction":10,"comment":2}},null]}
    );
  } else {
    pin = pin_create(
      "813744226420795884",
      "2020-01-01T20:10:40Z",
      "https://www.pinterest.com/",
      "0",
      "0",
      "#6E7874",
      "0",
      "REGULAR",
      "a",
      "a",
      NULL,
      1,
      NULL,
      null,
      "a",
      1,
      1,
      "0",
      {"pin_metrics":[{"90d":{"pin_click":7,"impression":2,"clickthrough":3},"all_time":{"pin_click":7,"impression":2,"clickthrough":3,"reaction":10,"comment":2}},null]}
    );
  }

  return pin;
}


#ifdef pin_MAIN

void test_pin(int include_optional) {
    pin_t* pin_1 = instantiate_pin(include_optional);

	cJSON* jsonpin_1 = pin_convertToJSON(pin_1);
	printf("pin :\n%s\n", cJSON_Print(jsonpin_1));
	pin_t* pin_2 = pin_parseFromJSON(jsonpin_1);
	cJSON* jsonpin_2 = pin_convertToJSON(pin_2);
	printf("repeating pin:\n%s\n", cJSON_Print(jsonpin_2));
}

int main() {
  test_pin(1);
  test_pin(0);

  printf("Hello world \n");
  return 0;
}

#endif // pin_MAIN
#endif // pin_TEST
