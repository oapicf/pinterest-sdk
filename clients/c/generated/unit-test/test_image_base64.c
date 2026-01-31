#ifndef image_base64_TEST
#define image_base64_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define image_base64_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/image_base64.h"
image_base64_t* instantiate_image_base64(int include_optional);



image_base64_t* instantiate_image_base64(int include_optional) {
  image_base64_t* image_base64 = NULL;
  if (include_optional) {
    image_base64 = image_base64_create(
      pinterest_rest_api_image_base64_CONTENTTYPE_image/jpeg,
      "a"
    );
  } else {
    image_base64 = image_base64_create(
      pinterest_rest_api_image_base64_CONTENTTYPE_image/jpeg,
      "a"
    );
  }

  return image_base64;
}


#ifdef image_base64_MAIN

void test_image_base64(int include_optional) {
    image_base64_t* image_base64_1 = instantiate_image_base64(include_optional);

	cJSON* jsonimage_base64_1 = image_base64_convertToJSON(image_base64_1);
	printf("image_base64 :\n%s\n", cJSON_Print(jsonimage_base64_1));
	image_base64_t* image_base64_2 = image_base64_parseFromJSON(jsonimage_base64_1);
	cJSON* jsonimage_base64_2 = image_base64_convertToJSON(image_base64_2);
	printf("repeating image_base64:\n%s\n", cJSON_Print(jsonimage_base64_2));
}

int main() {
  test_image_base64(1);
  test_image_base64(0);

  printf("Hello world \n");
  return 0;
}

#endif // image_base64_MAIN
#endif // image_base64_TEST
