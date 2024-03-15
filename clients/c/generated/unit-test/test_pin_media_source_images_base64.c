#ifndef pin_media_source_images_base64_TEST
#define pin_media_source_images_base64_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pin_media_source_images_base64_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pin_media_source_images_base64.h"
pin_media_source_images_base64_t* instantiate_pin_media_source_images_base64(int include_optional);



pin_media_source_images_base64_t* instantiate_pin_media_source_images_base64(int include_optional) {
  pin_media_source_images_base64_t* pin_media_source_images_base64 = NULL;
  if (include_optional) {
    pin_media_source_images_base64 = pin_media_source_images_base64_create(
      pinterest_rest_api_pin_media_source_images_base64_SOURCETYPE_multiple_image_base64,
      list_createList(),
      0
    );
  } else {
    pin_media_source_images_base64 = pin_media_source_images_base64_create(
      pinterest_rest_api_pin_media_source_images_base64_SOURCETYPE_multiple_image_base64,
      list_createList(),
      0
    );
  }

  return pin_media_source_images_base64;
}


#ifdef pin_media_source_images_base64_MAIN

void test_pin_media_source_images_base64(int include_optional) {
    pin_media_source_images_base64_t* pin_media_source_images_base64_1 = instantiate_pin_media_source_images_base64(include_optional);

	cJSON* jsonpin_media_source_images_base64_1 = pin_media_source_images_base64_convertToJSON(pin_media_source_images_base64_1);
	printf("pin_media_source_images_base64 :\n%s\n", cJSON_Print(jsonpin_media_source_images_base64_1));
	pin_media_source_images_base64_t* pin_media_source_images_base64_2 = pin_media_source_images_base64_parseFromJSON(jsonpin_media_source_images_base64_1);
	cJSON* jsonpin_media_source_images_base64_2 = pin_media_source_images_base64_convertToJSON(pin_media_source_images_base64_2);
	printf("repeating pin_media_source_images_base64:\n%s\n", cJSON_Print(jsonpin_media_source_images_base64_2));
}

int main() {
  test_pin_media_source_images_base64(1);
  test_pin_media_source_images_base64(0);

  printf("Hello world \n");
  return 0;
}

#endif // pin_media_source_images_base64_MAIN
#endif // pin_media_source_images_base64_TEST
