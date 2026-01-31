#ifndef media_TEST
#define media_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define media_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/media.h"
media_t* instantiate_media(int include_optional);



media_t* instantiate_media(int include_optional) {
  media_t* media = NULL;
  if (include_optional) {
    media = media_create(
      "12345",
      video,
      registered
    );
  } else {
    media = media_create(
      "12345",
      video,
      registered
    );
  }

  return media;
}


#ifdef media_MAIN

void test_media(int include_optional) {
    media_t* media_1 = instantiate_media(include_optional);

	cJSON* jsonmedia_1 = media_convertToJSON(media_1);
	printf("media :\n%s\n", cJSON_Print(jsonmedia_1));
	media_t* media_2 = media_parseFromJSON(jsonmedia_1);
	cJSON* jsonmedia_2 = media_convertToJSON(media_2);
	printf("repeating media:\n%s\n", cJSON_Print(jsonmedia_2));
}

int main() {
  test_media(1);
  test_media(0);

  printf("Hello world \n");
  return 0;
}

#endif // media_MAIN
#endif // media_TEST
