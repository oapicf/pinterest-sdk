#ifndef media_upload_status_TEST
#define media_upload_status_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define media_upload_status_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/media_upload_status.h"
media_upload_status_t* instantiate_media_upload_status(int include_optional);



media_upload_status_t* instantiate_media_upload_status(int include_optional) {
  media_upload_status_t* media_upload_status = NULL;
  if (include_optional) {
    media_upload_status = media_upload_status_create(
    );
  } else {
    media_upload_status = media_upload_status_create(
    );
  }

  return media_upload_status;
}


#ifdef media_upload_status_MAIN

void test_media_upload_status(int include_optional) {
    media_upload_status_t* media_upload_status_1 = instantiate_media_upload_status(include_optional);

	cJSON* jsonmedia_upload_status_1 = media_upload_status_convertToJSON(media_upload_status_1);
	printf("media_upload_status :\n%s\n", cJSON_Print(jsonmedia_upload_status_1));
	media_upload_status_t* media_upload_status_2 = media_upload_status_parseFromJSON(jsonmedia_upload_status_1);
	cJSON* jsonmedia_upload_status_2 = media_upload_status_convertToJSON(media_upload_status_2);
	printf("repeating media_upload_status:\n%s\n", cJSON_Print(jsonmedia_upload_status_2));
}

int main() {
  test_media_upload_status(1);
  test_media_upload_status(0);

  printf("Hello world \n");
  return 0;
}

#endif // media_upload_status_MAIN
#endif // media_upload_status_TEST
