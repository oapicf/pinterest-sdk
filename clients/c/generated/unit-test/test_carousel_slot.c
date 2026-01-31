#ifndef carousel_slot_TEST
#define carousel_slot_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define carousel_slot_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/carousel_slot.h"
carousel_slot_t* instantiate_carousel_slot(int include_optional);



carousel_slot_t* instantiate_carousel_slot(int include_optional) {
  carousel_slot_t* carousel_slot = NULL;
  if (include_optional) {
    carousel_slot = carousel_slot_create(
      "0",
      "0",
      "0"
    );
  } else {
    carousel_slot = carousel_slot_create(
      "0",
      "0",
      "0"
    );
  }

  return carousel_slot;
}


#ifdef carousel_slot_MAIN

void test_carousel_slot(int include_optional) {
    carousel_slot_t* carousel_slot_1 = instantiate_carousel_slot(include_optional);

	cJSON* jsoncarousel_slot_1 = carousel_slot_convertToJSON(carousel_slot_1);
	printf("carousel_slot :\n%s\n", cJSON_Print(jsoncarousel_slot_1));
	carousel_slot_t* carousel_slot_2 = carousel_slot_parseFromJSON(jsoncarousel_slot_1);
	cJSON* jsoncarousel_slot_2 = carousel_slot_convertToJSON(carousel_slot_2);
	printf("repeating carousel_slot:\n%s\n", cJSON_Print(jsoncarousel_slot_2));
}

int main() {
  test_carousel_slot(1);
  test_carousel_slot(0);

  printf("Hello world \n");
  return 0;
}

#endif // carousel_slot_MAIN
#endif // carousel_slot_TEST
