#ifndef pin_media_source_video_id_TEST
#define pin_media_source_video_id_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pin_media_source_video_id_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pin_media_source_video_id.h"
pin_media_source_video_id_t* instantiate_pin_media_source_video_id(int include_optional);



pin_media_source_video_id_t* instantiate_pin_media_source_video_id(int include_optional) {
  pin_media_source_video_id_t* pin_media_source_video_id = NULL;
  if (include_optional) {
    pin_media_source_video_id = pin_media_source_video_id_create(
      pinterest_rest_api_pin_media_source_video_id_SOURCETYPE_video_id,
      "0",
      pinterest_rest_api_pin_media_source_video_id_COVERIMAGECONTENTTYPE_image/jpeg,
      "0",
      "a",
      1
    );
  } else {
    pin_media_source_video_id = pin_media_source_video_id_create(
      pinterest_rest_api_pin_media_source_video_id_SOURCETYPE_video_id,
      "0",
      pinterest_rest_api_pin_media_source_video_id_COVERIMAGECONTENTTYPE_image/jpeg,
      "0",
      "a",
      1
    );
  }

  return pin_media_source_video_id;
}


#ifdef pin_media_source_video_id_MAIN

void test_pin_media_source_video_id(int include_optional) {
    pin_media_source_video_id_t* pin_media_source_video_id_1 = instantiate_pin_media_source_video_id(include_optional);

	cJSON* jsonpin_media_source_video_id_1 = pin_media_source_video_id_convertToJSON(pin_media_source_video_id_1);
	printf("pin_media_source_video_id :\n%s\n", cJSON_Print(jsonpin_media_source_video_id_1));
	pin_media_source_video_id_t* pin_media_source_video_id_2 = pin_media_source_video_id_parseFromJSON(jsonpin_media_source_video_id_1);
	cJSON* jsonpin_media_source_video_id_2 = pin_media_source_video_id_convertToJSON(pin_media_source_video_id_2);
	printf("repeating pin_media_source_video_id:\n%s\n", cJSON_Print(jsonpin_media_source_video_id_2));
}

int main() {
  test_pin_media_source_video_id(1);
  test_pin_media_source_video_id(0);

  printf("Hello world \n");
  return 0;
}

#endif // pin_media_source_video_id_MAIN
#endif // pin_media_source_video_id_TEST
