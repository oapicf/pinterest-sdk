#ifndef pin_media_with_image_all_of_images_TEST
#define pin_media_with_image_all_of_images_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pin_media_with_image_all_of_images_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pin_media_with_image_all_of_images.h"
pin_media_with_image_all_of_images_t* instantiate_pin_media_with_image_all_of_images(int include_optional);



pin_media_with_image_all_of_images_t* instantiate_pin_media_with_image_all_of_images(int include_optional) {
  pin_media_with_image_all_of_images_t* pin_media_with_image_all_of_images = NULL;
  if (include_optional) {
    pin_media_with_image_all_of_images = pin_media_with_image_all_of_images_create(
      0,
      0,
      0,
      0
    );
  } else {
    pin_media_with_image_all_of_images = pin_media_with_image_all_of_images_create(
      0,
      0,
      0,
      0
    );
  }

  return pin_media_with_image_all_of_images;
}


#ifdef pin_media_with_image_all_of_images_MAIN

void test_pin_media_with_image_all_of_images(int include_optional) {
    pin_media_with_image_all_of_images_t* pin_media_with_image_all_of_images_1 = instantiate_pin_media_with_image_all_of_images(include_optional);

	cJSON* jsonpin_media_with_image_all_of_images_1 = pin_media_with_image_all_of_images_convertToJSON(pin_media_with_image_all_of_images_1);
	printf("pin_media_with_image_all_of_images :\n%s\n", cJSON_Print(jsonpin_media_with_image_all_of_images_1));
	pin_media_with_image_all_of_images_t* pin_media_with_image_all_of_images_2 = pin_media_with_image_all_of_images_parseFromJSON(jsonpin_media_with_image_all_of_images_1);
	cJSON* jsonpin_media_with_image_all_of_images_2 = pin_media_with_image_all_of_images_convertToJSON(pin_media_with_image_all_of_images_2);
	printf("repeating pin_media_with_image_all_of_images:\n%s\n", cJSON_Print(jsonpin_media_with_image_all_of_images_2));
}

int main() {
  test_pin_media_with_image_all_of_images(1);
  test_pin_media_with_image_all_of_images(0);

  printf("Hello world \n");
  return 0;
}

#endif // pin_media_with_image_all_of_images_MAIN
#endif // pin_media_with_image_all_of_images_TEST
