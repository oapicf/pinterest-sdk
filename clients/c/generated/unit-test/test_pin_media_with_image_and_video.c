#ifndef pin_media_with_image_and_video_TEST
#define pin_media_with_image_and_video_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pin_media_with_image_and_video_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pin_media_with_image_and_video.h"
pin_media_with_image_and_video_t* instantiate_pin_media_with_image_and_video(int include_optional);



pin_media_with_image_and_video_t* instantiate_pin_media_with_image_and_video(int include_optional) {
  pin_media_with_image_and_video_t* pin_media_with_image_and_video = NULL;
  if (include_optional) {
    pin_media_with_image_and_video = pin_media_with_image_and_video_create(
      "0",
      list_createList()
    );
  } else {
    pin_media_with_image_and_video = pin_media_with_image_and_video_create(
      "0",
      list_createList()
    );
  }

  return pin_media_with_image_and_video;
}


#ifdef pin_media_with_image_and_video_MAIN

void test_pin_media_with_image_and_video(int include_optional) {
    pin_media_with_image_and_video_t* pin_media_with_image_and_video_1 = instantiate_pin_media_with_image_and_video(include_optional);

	cJSON* jsonpin_media_with_image_and_video_1 = pin_media_with_image_and_video_convertToJSON(pin_media_with_image_and_video_1);
	printf("pin_media_with_image_and_video :\n%s\n", cJSON_Print(jsonpin_media_with_image_and_video_1));
	pin_media_with_image_and_video_t* pin_media_with_image_and_video_2 = pin_media_with_image_and_video_parseFromJSON(jsonpin_media_with_image_and_video_1);
	cJSON* jsonpin_media_with_image_and_video_2 = pin_media_with_image_and_video_convertToJSON(pin_media_with_image_and_video_2);
	printf("repeating pin_media_with_image_and_video:\n%s\n", cJSON_Print(jsonpin_media_with_image_and_video_2));
}

int main() {
  test_pin_media_with_image_and_video(1);
  test_pin_media_with_image_and_video(0);

  printf("Hello world \n");
  return 0;
}

#endif // pin_media_with_image_and_video_MAIN
#endif // pin_media_with_image_and_video_TEST
