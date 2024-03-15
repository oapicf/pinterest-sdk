#ifndef media_list_200_response_TEST
#define media_list_200_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define media_list_200_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/media_list_200_response.h"
media_list_200_response_t* instantiate_media_list_200_response(int include_optional);



media_list_200_response_t* instantiate_media_list_200_response(int include_optional) {
  media_list_200_response_t* media_list_200_response = NULL;
  if (include_optional) {
    media_list_200_response = media_list_200_response_create(
      list_createList(),
      "0"
    );
  } else {
    media_list_200_response = media_list_200_response_create(
      list_createList(),
      "0"
    );
  }

  return media_list_200_response;
}


#ifdef media_list_200_response_MAIN

void test_media_list_200_response(int include_optional) {
    media_list_200_response_t* media_list_200_response_1 = instantiate_media_list_200_response(include_optional);

	cJSON* jsonmedia_list_200_response_1 = media_list_200_response_convertToJSON(media_list_200_response_1);
	printf("media_list_200_response :\n%s\n", cJSON_Print(jsonmedia_list_200_response_1));
	media_list_200_response_t* media_list_200_response_2 = media_list_200_response_parseFromJSON(jsonmedia_list_200_response_1);
	cJSON* jsonmedia_list_200_response_2 = media_list_200_response_convertToJSON(media_list_200_response_2);
	printf("repeating media_list_200_response:\n%s\n", cJSON_Print(jsonmedia_list_200_response_2));
}

int main() {
  test_media_list_200_response(1);
  test_media_list_200_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // media_list_200_response_MAIN
#endif // media_list_200_response_TEST
