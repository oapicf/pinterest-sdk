#ifndef pin_media_TEST
#define pin_media_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pin_media_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pin_media.h"
pin_media_t* instantiate_pin_media(int include_optional);



pin_media_t* instantiate_pin_media(int include_optional) {
  pin_media_t* pin_media = NULL;
  if (include_optional) {
    pin_media = pin_media_create(
      "0"
    );
  } else {
    pin_media = pin_media_create(
      "0"
    );
  }

  return pin_media;
}


#ifdef pin_media_MAIN

void test_pin_media(int include_optional) {
    pin_media_t* pin_media_1 = instantiate_pin_media(include_optional);

	cJSON* jsonpin_media_1 = pin_media_convertToJSON(pin_media_1);
	printf("pin_media :\n%s\n", cJSON_Print(jsonpin_media_1));
	pin_media_t* pin_media_2 = pin_media_parseFromJSON(jsonpin_media_1);
	cJSON* jsonpin_media_2 = pin_media_convertToJSON(pin_media_2);
	printf("repeating pin_media:\n%s\n", cJSON_Print(jsonpin_media_2));
}

int main() {
  test_pin_media(1);
  test_pin_media(0);

  printf("Hello world \n");
  return 0;
}

#endif // pin_media_MAIN
#endif // pin_media_TEST
