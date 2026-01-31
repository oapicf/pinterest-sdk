#ifndef media_upload_create_TEST
#define media_upload_create_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define media_upload_create_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/media_upload_create.h"
media_upload_create_t* instantiate_media_upload_create(int include_optional);



media_upload_create_t* instantiate_media_upload_create(int include_optional) {
  media_upload_create_t* media_upload_create = NULL;
  if (include_optional) {
    media_upload_create = media_upload_create_create(
      video
    );
  } else {
    media_upload_create = media_upload_create_create(
      video
    );
  }

  return media_upload_create;
}


#ifdef media_upload_create_MAIN

void test_media_upload_create(int include_optional) {
    media_upload_create_t* media_upload_create_1 = instantiate_media_upload_create(include_optional);

	cJSON* jsonmedia_upload_create_1 = media_upload_create_convertToJSON(media_upload_create_1);
	printf("media_upload_create :\n%s\n", cJSON_Print(jsonmedia_upload_create_1));
	media_upload_create_t* media_upload_create_2 = media_upload_create_parseFromJSON(jsonmedia_upload_create_1);
	cJSON* jsonmedia_upload_create_2 = media_upload_create_convertToJSON(media_upload_create_2);
	printf("repeating media_upload_create:\n%s\n", cJSON_Print(jsonmedia_upload_create_2));
}

int main() {
  test_media_upload_create(1);
  test_media_upload_create(0);

  printf("Hello world \n");
  return 0;
}

#endif // media_upload_create_MAIN
#endif // media_upload_create_TEST
