#ifndef pin_media_source_images_url_TEST
#define pin_media_source_images_url_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pin_media_source_images_url_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pin_media_source_images_url.h"
pin_media_source_images_url_t* instantiate_pin_media_source_images_url(int include_optional);



pin_media_source_images_url_t* instantiate_pin_media_source_images_url(int include_optional) {
  pin_media_source_images_url_t* pin_media_source_images_url = NULL;
  if (include_optional) {
    pin_media_source_images_url = pin_media_source_images_url_create(
      pinterest_rest_api_pin_media_source_images_url_SOURCETYPE_multiple_image_urls,
      list_createList(),
      0
    );
  } else {
    pin_media_source_images_url = pin_media_source_images_url_create(
      pinterest_rest_api_pin_media_source_images_url_SOURCETYPE_multiple_image_urls,
      list_createList(),
      0
    );
  }

  return pin_media_source_images_url;
}


#ifdef pin_media_source_images_url_MAIN

void test_pin_media_source_images_url(int include_optional) {
    pin_media_source_images_url_t* pin_media_source_images_url_1 = instantiate_pin_media_source_images_url(include_optional);

	cJSON* jsonpin_media_source_images_url_1 = pin_media_source_images_url_convertToJSON(pin_media_source_images_url_1);
	printf("pin_media_source_images_url :\n%s\n", cJSON_Print(jsonpin_media_source_images_url_1));
	pin_media_source_images_url_t* pin_media_source_images_url_2 = pin_media_source_images_url_parseFromJSON(jsonpin_media_source_images_url_1);
	cJSON* jsonpin_media_source_images_url_2 = pin_media_source_images_url_convertToJSON(pin_media_source_images_url_2);
	printf("repeating pin_media_source_images_url:\n%s\n", cJSON_Print(jsonpin_media_source_images_url_2));
}

int main() {
  test_pin_media_source_images_url(1);
  test_pin_media_source_images_url(0);

  printf("Hello world \n");
  return 0;
}

#endif // pin_media_source_images_url_MAIN
#endif // pin_media_source_images_url_TEST
