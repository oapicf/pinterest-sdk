#ifndef pin_media_source_images_url_item_TEST
#define pin_media_source_images_url_item_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pin_media_source_images_url_item_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pin_media_source_images_url_item.h"
pin_media_source_images_url_item_t* instantiate_pin_media_source_images_url_item(int include_optional);



pin_media_source_images_url_item_t* instantiate_pin_media_source_images_url_item(int include_optional) {
  pin_media_source_images_url_item_t* pin_media_source_images_url_item = NULL;
  if (include_optional) {
    pin_media_source_images_url_item = pin_media_source_images_url_item_create(
      "0",
      "0",
      "0",
      "0"
    );
  } else {
    pin_media_source_images_url_item = pin_media_source_images_url_item_create(
      "0",
      "0",
      "0",
      "0"
    );
  }

  return pin_media_source_images_url_item;
}


#ifdef pin_media_source_images_url_item_MAIN

void test_pin_media_source_images_url_item(int include_optional) {
    pin_media_source_images_url_item_t* pin_media_source_images_url_item_1 = instantiate_pin_media_source_images_url_item(include_optional);

	cJSON* jsonpin_media_source_images_url_item_1 = pin_media_source_images_url_item_convertToJSON(pin_media_source_images_url_item_1);
	printf("pin_media_source_images_url_item :\n%s\n", cJSON_Print(jsonpin_media_source_images_url_item_1));
	pin_media_source_images_url_item_t* pin_media_source_images_url_item_2 = pin_media_source_images_url_item_parseFromJSON(jsonpin_media_source_images_url_item_1);
	cJSON* jsonpin_media_source_images_url_item_2 = pin_media_source_images_url_item_convertToJSON(pin_media_source_images_url_item_2);
	printf("repeating pin_media_source_images_url_item:\n%s\n", cJSON_Print(jsonpin_media_source_images_url_item_2));
}

int main() {
  test_pin_media_source_images_url_item(1);
  test_pin_media_source_images_url_item(0);

  printf("Hello world \n");
  return 0;
}

#endif // pin_media_source_images_url_item_MAIN
#endif // pin_media_source_images_url_item_TEST
