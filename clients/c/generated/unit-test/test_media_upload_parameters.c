#ifndef media_upload_parameters_TEST
#define media_upload_parameters_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define media_upload_parameters_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/media_upload_parameters.h"
media_upload_parameters_t* instantiate_media_upload_parameters(int include_optional);



media_upload_parameters_t* instantiate_media_upload_parameters(int include_optional) {
  media_upload_parameters_t* media_upload_parameters = NULL;
  if (include_optional) {
    media_upload_parameters = media_upload_parameters_create(
      "multipart/form-data",
      "uploads/11/aa/22/3:video:203014033110991560:5212123920968240771",
      "eyJleHBpcmF0aW9uIjoiMj..==",
      "AWS4-HMAC-SHA256",
      "ASIA6QZJ64OPIKV7FRVX/20220127/us-east-1/s3/aws4_request",
      "20220127T185143Z",
      "IQoJb3JpZ2luX2VjEJr...==",
      "fcd6309a6aaee213348666a72abed8b44552a43acb6b340e8e1b288d21a5fe92"
    );
  } else {
    media_upload_parameters = media_upload_parameters_create(
      "multipart/form-data",
      "uploads/11/aa/22/3:video:203014033110991560:5212123920968240771",
      "eyJleHBpcmF0aW9uIjoiMj..==",
      "AWS4-HMAC-SHA256",
      "ASIA6QZJ64OPIKV7FRVX/20220127/us-east-1/s3/aws4_request",
      "20220127T185143Z",
      "IQoJb3JpZ2luX2VjEJr...==",
      "fcd6309a6aaee213348666a72abed8b44552a43acb6b340e8e1b288d21a5fe92"
    );
  }

  return media_upload_parameters;
}


#ifdef media_upload_parameters_MAIN

void test_media_upload_parameters(int include_optional) {
    media_upload_parameters_t* media_upload_parameters_1 = instantiate_media_upload_parameters(include_optional);

	cJSON* jsonmedia_upload_parameters_1 = media_upload_parameters_convertToJSON(media_upload_parameters_1);
	printf("media_upload_parameters :\n%s\n", cJSON_Print(jsonmedia_upload_parameters_1));
	media_upload_parameters_t* media_upload_parameters_2 = media_upload_parameters_parseFromJSON(jsonmedia_upload_parameters_1);
	cJSON* jsonmedia_upload_parameters_2 = media_upload_parameters_convertToJSON(media_upload_parameters_2);
	printf("repeating media_upload_parameters:\n%s\n", cJSON_Print(jsonmedia_upload_parameters_2));
}

int main() {
  test_media_upload_parameters(1);
  test_media_upload_parameters(0);

  printf("Hello world \n");
  return 0;
}

#endif // media_upload_parameters_MAIN
#endif // media_upload_parameters_TEST
