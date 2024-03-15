#ifndef media_upload_all_of_upload_parameters_TEST
#define media_upload_all_of_upload_parameters_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define media_upload_all_of_upload_parameters_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/media_upload_all_of_upload_parameters.h"
media_upload_all_of_upload_parameters_t* instantiate_media_upload_all_of_upload_parameters(int include_optional);



media_upload_all_of_upload_parameters_t* instantiate_media_upload_all_of_upload_parameters(int include_optional) {
  media_upload_all_of_upload_parameters_t* media_upload_all_of_upload_parameters = NULL;
  if (include_optional) {
    media_upload_all_of_upload_parameters = media_upload_all_of_upload_parameters_create(
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "multipart/form-data"
    );
  } else {
    media_upload_all_of_upload_parameters = media_upload_all_of_upload_parameters_create(
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "multipart/form-data"
    );
  }

  return media_upload_all_of_upload_parameters;
}


#ifdef media_upload_all_of_upload_parameters_MAIN

void test_media_upload_all_of_upload_parameters(int include_optional) {
    media_upload_all_of_upload_parameters_t* media_upload_all_of_upload_parameters_1 = instantiate_media_upload_all_of_upload_parameters(include_optional);

	cJSON* jsonmedia_upload_all_of_upload_parameters_1 = media_upload_all_of_upload_parameters_convertToJSON(media_upload_all_of_upload_parameters_1);
	printf("media_upload_all_of_upload_parameters :\n%s\n", cJSON_Print(jsonmedia_upload_all_of_upload_parameters_1));
	media_upload_all_of_upload_parameters_t* media_upload_all_of_upload_parameters_2 = media_upload_all_of_upload_parameters_parseFromJSON(jsonmedia_upload_all_of_upload_parameters_1);
	cJSON* jsonmedia_upload_all_of_upload_parameters_2 = media_upload_all_of_upload_parameters_convertToJSON(media_upload_all_of_upload_parameters_2);
	printf("repeating media_upload_all_of_upload_parameters:\n%s\n", cJSON_Print(jsonmedia_upload_all_of_upload_parameters_2));
}

int main() {
  test_media_upload_all_of_upload_parameters(1);
  test_media_upload_all_of_upload_parameters(0);

  printf("Hello world \n");
  return 0;
}

#endif // media_upload_all_of_upload_parameters_MAIN
#endif // media_upload_all_of_upload_parameters_TEST
