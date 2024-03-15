#ifndef media_upload_TEST
#define media_upload_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define media_upload_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/media_upload.h"
media_upload_t* instantiate_media_upload(int include_optional);

#include "test_media_upload_all_of_upload_parameters.c"


media_upload_t* instantiate_media_upload(int include_optional) {
  media_upload_t* media_upload = NULL;
  if (include_optional) {
    media_upload = media_upload_create(
      "0",
      video,
      "https://pinterest-media-upload.s3-accelerate.amazonaws.com/",
       // false, not to have infinite recursion
      instantiate_media_upload_all_of_upload_parameters(0)
    );
  } else {
    media_upload = media_upload_create(
      "0",
      video,
      "https://pinterest-media-upload.s3-accelerate.amazonaws.com/",
      NULL
    );
  }

  return media_upload;
}


#ifdef media_upload_MAIN

void test_media_upload(int include_optional) {
    media_upload_t* media_upload_1 = instantiate_media_upload(include_optional);

	cJSON* jsonmedia_upload_1 = media_upload_convertToJSON(media_upload_1);
	printf("media_upload :\n%s\n", cJSON_Print(jsonmedia_upload_1));
	media_upload_t* media_upload_2 = media_upload_parseFromJSON(jsonmedia_upload_1);
	cJSON* jsonmedia_upload_2 = media_upload_convertToJSON(media_upload_2);
	printf("repeating media_upload:\n%s\n", cJSON_Print(jsonmedia_upload_2));
}

int main() {
  test_media_upload(1);
  test_media_upload(0);

  printf("Hello world \n");
  return 0;
}

#endif // media_upload_MAIN
#endif // media_upload_TEST
