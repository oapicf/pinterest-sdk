#ifndef media_type_TEST
#define media_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define media_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/media_type.h"
media_type_t* instantiate_media_type(int include_optional);



media_type_t* instantiate_media_type(int include_optional) {
  media_type_t* media_type = NULL;
  if (include_optional) {
    media_type = media_type_create(
    );
  } else {
    media_type = media_type_create(
    );
  }

  return media_type;
}


#ifdef media_type_MAIN

void test_media_type(int include_optional) {
    media_type_t* media_type_1 = instantiate_media_type(include_optional);

	cJSON* jsonmedia_type_1 = media_type_convertToJSON(media_type_1);
	printf("media_type :\n%s\n", cJSON_Print(jsonmedia_type_1));
	media_type_t* media_type_2 = media_type_parseFromJSON(jsonmedia_type_1);
	cJSON* jsonmedia_type_2 = media_type_convertToJSON(media_type_2);
	printf("repeating media_type:\n%s\n", cJSON_Print(jsonmedia_type_2));
}

int main() {
  test_media_type(1);
  test_media_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // media_type_MAIN
#endif // media_type_TEST
