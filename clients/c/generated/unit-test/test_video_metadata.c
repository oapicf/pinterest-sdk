#ifndef video_metadata_TEST
#define video_metadata_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define video_metadata_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/video_metadata.h"
video_metadata_t* instantiate_video_metadata(int include_optional);



video_metadata_t* instantiate_video_metadata(int include_optional) {
  video_metadata_t* video_metadata = NULL;
  if (include_optional) {
    video_metadata = video_metadata_create(
      "0",
      "0",
      "0",
      1.337,
      56,
      56
    );
  } else {
    video_metadata = video_metadata_create(
      "0",
      "0",
      "0",
      1.337,
      56,
      56
    );
  }

  return video_metadata;
}


#ifdef video_metadata_MAIN

void test_video_metadata(int include_optional) {
    video_metadata_t* video_metadata_1 = instantiate_video_metadata(include_optional);

	cJSON* jsonvideo_metadata_1 = video_metadata_convertToJSON(video_metadata_1);
	printf("video_metadata :\n%s\n", cJSON_Print(jsonvideo_metadata_1));
	video_metadata_t* video_metadata_2 = video_metadata_parseFromJSON(jsonvideo_metadata_1);
	cJSON* jsonvideo_metadata_2 = video_metadata_convertToJSON(video_metadata_2);
	printf("repeating video_metadata:\n%s\n", cJSON_Print(jsonvideo_metadata_2));
}

int main() {
  test_video_metadata(1);
  test_video_metadata(0);

  printf("Hello world \n");
  return 0;
}

#endif // video_metadata_MAIN
#endif // video_metadata_TEST
