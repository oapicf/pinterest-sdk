#ifndef video_metadata_with_item_type_TEST
#define video_metadata_with_item_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define video_metadata_with_item_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/video_metadata_with_item_type.h"
video_metadata_with_item_type_t* instantiate_video_metadata_with_item_type(int include_optional);



video_metadata_with_item_type_t* instantiate_video_metadata_with_item_type(int include_optional) {
  video_metadata_with_item_type_t* video_metadata_with_item_type = NULL;
  if (include_optional) {
    video_metadata_with_item_type = video_metadata_with_item_type_create(
      "0",
      1.337,
      56,
      "0",
      "0",
      56
    );
  } else {
    video_metadata_with_item_type = video_metadata_with_item_type_create(
      "0",
      1.337,
      56,
      "0",
      "0",
      56
    );
  }

  return video_metadata_with_item_type;
}


#ifdef video_metadata_with_item_type_MAIN

void test_video_metadata_with_item_type(int include_optional) {
    video_metadata_with_item_type_t* video_metadata_with_item_type_1 = instantiate_video_metadata_with_item_type(include_optional);

	cJSON* jsonvideo_metadata_with_item_type_1 = video_metadata_with_item_type_convertToJSON(video_metadata_with_item_type_1);
	printf("video_metadata_with_item_type :\n%s\n", cJSON_Print(jsonvideo_metadata_with_item_type_1));
	video_metadata_with_item_type_t* video_metadata_with_item_type_2 = video_metadata_with_item_type_parseFromJSON(jsonvideo_metadata_with_item_type_1);
	cJSON* jsonvideo_metadata_with_item_type_2 = video_metadata_with_item_type_convertToJSON(video_metadata_with_item_type_2);
	printf("repeating video_metadata_with_item_type:\n%s\n", cJSON_Print(jsonvideo_metadata_with_item_type_2));
}

int main() {
  test_video_metadata_with_item_type(1);
  test_video_metadata_with_item_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // video_metadata_with_item_type_MAIN
#endif // video_metadata_with_item_type_TEST
