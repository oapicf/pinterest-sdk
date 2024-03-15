#ifndef image_details_TEST
#define image_details_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define image_details_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/image_details.h"
image_details_t* instantiate_image_details(int include_optional);



image_details_t* instantiate_image_details(int include_optional) {
  image_details_t* image_details = NULL;
  if (include_optional) {
    image_details = image_details_create(
      100,
      100,
      "0"
    );
  } else {
    image_details = image_details_create(
      100,
      100,
      "0"
    );
  }

  return image_details;
}


#ifdef image_details_MAIN

void test_image_details(int include_optional) {
    image_details_t* image_details_1 = instantiate_image_details(include_optional);

	cJSON* jsonimage_details_1 = image_details_convertToJSON(image_details_1);
	printf("image_details :\n%s\n", cJSON_Print(jsonimage_details_1));
	image_details_t* image_details_2 = image_details_parseFromJSON(jsonimage_details_1);
	cJSON* jsonimage_details_2 = image_details_convertToJSON(image_details_2);
	printf("repeating image_details:\n%s\n", cJSON_Print(jsonimage_details_2));
}

int main() {
  test_image_details(1);
  test_image_details(0);

  printf("Hello world \n");
  return 0;
}

#endif // image_details_MAIN
#endif // image_details_TEST
