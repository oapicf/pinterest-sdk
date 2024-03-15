#ifndef pin_media_source_images_url_items_inner_TEST
#define pin_media_source_images_url_items_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pin_media_source_images_url_items_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pin_media_source_images_url_items_inner.h"
pin_media_source_images_url_items_inner_t* instantiate_pin_media_source_images_url_items_inner(int include_optional);



pin_media_source_images_url_items_inner_t* instantiate_pin_media_source_images_url_items_inner(int include_optional) {
  pin_media_source_images_url_items_inner_t* pin_media_source_images_url_items_inner = NULL;
  if (include_optional) {
    pin_media_source_images_url_items_inner = pin_media_source_images_url_items_inner_create(
      "0",
      "0",
      "0",
      "0"
    );
  } else {
    pin_media_source_images_url_items_inner = pin_media_source_images_url_items_inner_create(
      "0",
      "0",
      "0",
      "0"
    );
  }

  return pin_media_source_images_url_items_inner;
}


#ifdef pin_media_source_images_url_items_inner_MAIN

void test_pin_media_source_images_url_items_inner(int include_optional) {
    pin_media_source_images_url_items_inner_t* pin_media_source_images_url_items_inner_1 = instantiate_pin_media_source_images_url_items_inner(include_optional);

	cJSON* jsonpin_media_source_images_url_items_inner_1 = pin_media_source_images_url_items_inner_convertToJSON(pin_media_source_images_url_items_inner_1);
	printf("pin_media_source_images_url_items_inner :\n%s\n", cJSON_Print(jsonpin_media_source_images_url_items_inner_1));
	pin_media_source_images_url_items_inner_t* pin_media_source_images_url_items_inner_2 = pin_media_source_images_url_items_inner_parseFromJSON(jsonpin_media_source_images_url_items_inner_1);
	cJSON* jsonpin_media_source_images_url_items_inner_2 = pin_media_source_images_url_items_inner_convertToJSON(pin_media_source_images_url_items_inner_2);
	printf("repeating pin_media_source_images_url_items_inner:\n%s\n", cJSON_Print(jsonpin_media_source_images_url_items_inner_2));
}

int main() {
  test_pin_media_source_images_url_items_inner(1);
  test_pin_media_source_images_url_items_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // pin_media_source_images_url_items_inner_MAIN
#endif // pin_media_source_images_url_items_inner_TEST
