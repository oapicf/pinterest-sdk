#ifndef media_upload_details_TEST
#define media_upload_details_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define media_upload_details_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/media_upload_details.h"
media_upload_details_t* instantiate_media_upload_details(int include_optional);



media_upload_details_t* instantiate_media_upload_details(int include_optional) {
  media_upload_details_t* media_upload_details = NULL;
  if (include_optional) {
    media_upload_details = media_upload_details_create(
      "a",
      video,
      registered
    );
  } else {
    media_upload_details = media_upload_details_create(
      "a",
      video,
      registered
    );
  }

  return media_upload_details;
}


#ifdef media_upload_details_MAIN

void test_media_upload_details(int include_optional) {
    media_upload_details_t* media_upload_details_1 = instantiate_media_upload_details(include_optional);

	cJSON* jsonmedia_upload_details_1 = media_upload_details_convertToJSON(media_upload_details_1);
	printf("media_upload_details :\n%s\n", cJSON_Print(jsonmedia_upload_details_1));
	media_upload_details_t* media_upload_details_2 = media_upload_details_parseFromJSON(jsonmedia_upload_details_1);
	cJSON* jsonmedia_upload_details_2 = media_upload_details_convertToJSON(media_upload_details_2);
	printf("repeating media_upload_details:\n%s\n", cJSON_Print(jsonmedia_upload_details_2));
}

int main() {
  test_media_upload_details(1);
  test_media_upload_details(0);

  printf("Hello world \n");
  return 0;
}

#endif // media_upload_details_MAIN
#endif // media_upload_details_TEST
