#ifndef media_type_filter_TEST
#define media_type_filter_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define media_type_filter_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/media_type_filter.h"
media_type_filter_t* instantiate_media_type_filter(int include_optional);



media_type_filter_t* instantiate_media_type_filter(int include_optional) {
  media_type_filter_t* media_type_filter = NULL;
  if (include_optional) {
    media_type_filter = media_type_filter_create(
      0
    );
  } else {
    media_type_filter = media_type_filter_create(
      0
    );
  }

  return media_type_filter;
}


#ifdef media_type_filter_MAIN

void test_media_type_filter(int include_optional) {
    media_type_filter_t* media_type_filter_1 = instantiate_media_type_filter(include_optional);

	cJSON* jsonmedia_type_filter_1 = media_type_filter_convertToJSON(media_type_filter_1);
	printf("media_type_filter :\n%s\n", cJSON_Print(jsonmedia_type_filter_1));
	media_type_filter_t* media_type_filter_2 = media_type_filter_parseFromJSON(jsonmedia_type_filter_1);
	cJSON* jsonmedia_type_filter_2 = media_type_filter_convertToJSON(media_type_filter_2);
	printf("repeating media_type_filter:\n%s\n", cJSON_Print(jsonmedia_type_filter_2));
}

int main() {
  test_media_type_filter(1);
  test_media_type_filter(0);

  printf("Hello world \n");
  return 0;
}

#endif // media_type_filter_MAIN
#endif // media_type_filter_TEST
