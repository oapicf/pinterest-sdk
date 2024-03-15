#ifndef media_upload_type_TEST
#define media_upload_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define media_upload_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/media_upload_type.h"
media_upload_type_t* instantiate_media_upload_type(int include_optional);



media_upload_type_t* instantiate_media_upload_type(int include_optional) {
  media_upload_type_t* media_upload_type = NULL;
  if (include_optional) {
    media_upload_type = media_upload_type_create(
    );
  } else {
    media_upload_type = media_upload_type_create(
    );
  }

  return media_upload_type;
}


#ifdef media_upload_type_MAIN

void test_media_upload_type(int include_optional) {
    media_upload_type_t* media_upload_type_1 = instantiate_media_upload_type(include_optional);

	cJSON* jsonmedia_upload_type_1 = media_upload_type_convertToJSON(media_upload_type_1);
	printf("media_upload_type :\n%s\n", cJSON_Print(jsonmedia_upload_type_1));
	media_upload_type_t* media_upload_type_2 = media_upload_type_parseFromJSON(jsonmedia_upload_type_1);
	cJSON* jsonmedia_upload_type_2 = media_upload_type_convertToJSON(media_upload_type_2);
	printf("repeating media_upload_type:\n%s\n", cJSON_Print(jsonmedia_upload_type_2));
}

int main() {
  test_media_upload_type(1);
  test_media_upload_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // media_upload_type_MAIN
#endif // media_upload_type_TEST
