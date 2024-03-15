#ifndef pin_media_metadata_TEST
#define pin_media_metadata_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pin_media_metadata_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pin_media_metadata.h"
pin_media_metadata_t* instantiate_pin_media_metadata(int include_optional);

#include "test_image_metadata_images.c"


pin_media_metadata_t* instantiate_pin_media_metadata(int include_optional) {
  pin_media_metadata_t* pin_media_metadata = NULL;
  if (include_optional) {
    pin_media_metadata = pin_media_metadata_create(
      "0",
      "0",
      "0",
      "0",
       // false, not to have infinite recursion
      instantiate_image_metadata_images(0),
      "0",
      "0",
      1.337,
      56,
      56
    );
  } else {
    pin_media_metadata = pin_media_metadata_create(
      "0",
      "0",
      "0",
      "0",
      NULL,
      "0",
      "0",
      1.337,
      56,
      56
    );
  }

  return pin_media_metadata;
}


#ifdef pin_media_metadata_MAIN

void test_pin_media_metadata(int include_optional) {
    pin_media_metadata_t* pin_media_metadata_1 = instantiate_pin_media_metadata(include_optional);

	cJSON* jsonpin_media_metadata_1 = pin_media_metadata_convertToJSON(pin_media_metadata_1);
	printf("pin_media_metadata :\n%s\n", cJSON_Print(jsonpin_media_metadata_1));
	pin_media_metadata_t* pin_media_metadata_2 = pin_media_metadata_parseFromJSON(jsonpin_media_metadata_1);
	cJSON* jsonpin_media_metadata_2 = pin_media_metadata_convertToJSON(pin_media_metadata_2);
	printf("repeating pin_media_metadata:\n%s\n", cJSON_Print(jsonpin_media_metadata_2));
}

int main() {
  test_pin_media_metadata(1);
  test_pin_media_metadata(0);

  printf("Hello world \n");
  return 0;
}

#endif // pin_media_metadata_MAIN
#endif // pin_media_metadata_TEST
