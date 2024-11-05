#ifndef summary_pin_TEST
#define summary_pin_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define summary_pin_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/summary_pin.h"
summary_pin_t* instantiate_summary_pin(int include_optional);

#include "test_pin_media.c"


summary_pin_t* instantiate_summary_pin(int include_optional) {
  summary_pin_t* summary_pin = NULL;
  if (include_optional) {
    summary_pin = summary_pin_create(
       // false, not to have infinite recursion
      instantiate_pin_media(0),
      "0",
      "https://www.pinterest.com/",
      "0",
      "0"
    );
  } else {
    summary_pin = summary_pin_create(
      NULL,
      "0",
      "https://www.pinterest.com/",
      "0",
      "0"
    );
  }

  return summary_pin;
}


#ifdef summary_pin_MAIN

void test_summary_pin(int include_optional) {
    summary_pin_t* summary_pin_1 = instantiate_summary_pin(include_optional);

	cJSON* jsonsummary_pin_1 = summary_pin_convertToJSON(summary_pin_1);
	printf("summary_pin :\n%s\n", cJSON_Print(jsonsummary_pin_1));
	summary_pin_t* summary_pin_2 = summary_pin_parseFromJSON(jsonsummary_pin_1);
	cJSON* jsonsummary_pin_2 = summary_pin_convertToJSON(summary_pin_2);
	printf("repeating summary_pin:\n%s\n", cJSON_Print(jsonsummary_pin_2));
}

int main() {
  test_summary_pin(1);
  test_summary_pin(0);

  printf("Hello world \n");
  return 0;
}

#endif // summary_pin_MAIN
#endif // summary_pin_TEST
