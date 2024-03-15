#ifndef pin_media_with_videos_TEST
#define pin_media_with_videos_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pin_media_with_videos_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pin_media_with_videos.h"
pin_media_with_videos_t* instantiate_pin_media_with_videos(int include_optional);



pin_media_with_videos_t* instantiate_pin_media_with_videos(int include_optional) {
  pin_media_with_videos_t* pin_media_with_videos = NULL;
  if (include_optional) {
    pin_media_with_videos = pin_media_with_videos_create(
      "0",
      list_createList()
    );
  } else {
    pin_media_with_videos = pin_media_with_videos_create(
      "0",
      list_createList()
    );
  }

  return pin_media_with_videos;
}


#ifdef pin_media_with_videos_MAIN

void test_pin_media_with_videos(int include_optional) {
    pin_media_with_videos_t* pin_media_with_videos_1 = instantiate_pin_media_with_videos(include_optional);

	cJSON* jsonpin_media_with_videos_1 = pin_media_with_videos_convertToJSON(pin_media_with_videos_1);
	printf("pin_media_with_videos :\n%s\n", cJSON_Print(jsonpin_media_with_videos_1));
	pin_media_with_videos_t* pin_media_with_videos_2 = pin_media_with_videos_parseFromJSON(jsonpin_media_with_videos_1);
	cJSON* jsonpin_media_with_videos_2 = pin_media_with_videos_convertToJSON(pin_media_with_videos_2);
	printf("repeating pin_media_with_videos:\n%s\n", cJSON_Print(jsonpin_media_with_videos_2));
}

int main() {
  test_pin_media_with_videos(1);
  test_pin_media_with_videos(0);

  printf("Hello world \n");
  return 0;
}

#endif // pin_media_with_videos_MAIN
#endif // pin_media_with_videos_TEST
