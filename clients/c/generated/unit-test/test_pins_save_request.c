#ifndef pins_save_request_TEST
#define pins_save_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pins_save_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pins_save_request.h"
pins_save_request_t* instantiate_pins_save_request(int include_optional);



pins_save_request_t* instantiate_pins_save_request(int include_optional) {
  pins_save_request_t* pins_save_request = NULL;
  if (include_optional) {
    pins_save_request = pins_save_request_create(
      "a",
      "a"
    );
  } else {
    pins_save_request = pins_save_request_create(
      "a",
      "a"
    );
  }

  return pins_save_request;
}


#ifdef pins_save_request_MAIN

void test_pins_save_request(int include_optional) {
    pins_save_request_t* pins_save_request_1 = instantiate_pins_save_request(include_optional);

	cJSON* jsonpins_save_request_1 = pins_save_request_convertToJSON(pins_save_request_1);
	printf("pins_save_request :\n%s\n", cJSON_Print(jsonpins_save_request_1));
	pins_save_request_t* pins_save_request_2 = pins_save_request_parseFromJSON(jsonpins_save_request_1);
	cJSON* jsonpins_save_request_2 = pins_save_request_convertToJSON(pins_save_request_2);
	printf("repeating pins_save_request:\n%s\n", cJSON_Print(jsonpins_save_request_2));
}

int main() {
  test_pins_save_request(1);
  test_pins_save_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // pins_save_request_MAIN
#endif // pins_save_request_TEST
