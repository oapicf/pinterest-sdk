#ifndef media_upload_request_TEST
#define media_upload_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define media_upload_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/media_upload_request.h"
media_upload_request_t* instantiate_media_upload_request(int include_optional);



media_upload_request_t* instantiate_media_upload_request(int include_optional) {
  media_upload_request_t* media_upload_request = NULL;
  if (include_optional) {
    media_upload_request = media_upload_request_create(
      video
    );
  } else {
    media_upload_request = media_upload_request_create(
      video
    );
  }

  return media_upload_request;
}


#ifdef media_upload_request_MAIN

void test_media_upload_request(int include_optional) {
    media_upload_request_t* media_upload_request_1 = instantiate_media_upload_request(include_optional);

	cJSON* jsonmedia_upload_request_1 = media_upload_request_convertToJSON(media_upload_request_1);
	printf("media_upload_request :\n%s\n", cJSON_Print(jsonmedia_upload_request_1));
	media_upload_request_t* media_upload_request_2 = media_upload_request_parseFromJSON(jsonmedia_upload_request_1);
	cJSON* jsonmedia_upload_request_2 = media_upload_request_convertToJSON(media_upload_request_2);
	printf("repeating media_upload_request:\n%s\n", cJSON_Print(jsonmedia_upload_request_2));
}

int main() {
  test_media_upload_request(1);
  test_media_upload_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // media_upload_request_MAIN
#endif // media_upload_request_TEST
