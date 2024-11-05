#ifndef pin_media_with_image_TEST
#define pin_media_with_image_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pin_media_with_image_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pin_media_with_image.h"
pin_media_with_image_t* instantiate_pin_media_with_image(int include_optional);

#include "test_pin_media_with_image_all_of_images.c"


pin_media_with_image_t* instantiate_pin_media_with_image(int include_optional) {
  pin_media_with_image_t* pin_media_with_image = NULL;
  if (include_optional) {
    pin_media_with_image = pin_media_with_image_create(
      "0",
       // false, not to have infinite recursion
      instantiate_pin_media_with_image_all_of_images(0)
    );
  } else {
    pin_media_with_image = pin_media_with_image_create(
      "0",
      NULL
    );
  }

  return pin_media_with_image;
}


#ifdef pin_media_with_image_MAIN

void test_pin_media_with_image(int include_optional) {
    pin_media_with_image_t* pin_media_with_image_1 = instantiate_pin_media_with_image(include_optional);

	cJSON* jsonpin_media_with_image_1 = pin_media_with_image_convertToJSON(pin_media_with_image_1);
	printf("pin_media_with_image :\n%s\n", cJSON_Print(jsonpin_media_with_image_1));
	pin_media_with_image_t* pin_media_with_image_2 = pin_media_with_image_parseFromJSON(jsonpin_media_with_image_1);
	cJSON* jsonpin_media_with_image_2 = pin_media_with_image_convertToJSON(pin_media_with_image_2);
	printf("repeating pin_media_with_image:\n%s\n", cJSON_Print(jsonpin_media_with_image_2));
}

int main() {
  test_pin_media_with_image(1);
  test_pin_media_with_image(0);

  printf("Hello world \n");
  return 0;
}

#endif // pin_media_with_image_MAIN
#endif // pin_media_with_image_TEST
