#ifndef image_metadata_TEST
#define image_metadata_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define image_metadata_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/image_metadata.h"
image_metadata_t* instantiate_image_metadata(int include_optional);

#include "test_image_metadata_images.c"


image_metadata_t* instantiate_image_metadata(int include_optional) {
  image_metadata_t* image_metadata = NULL;
  if (include_optional) {
    image_metadata = image_metadata_create(
      "0",
      "0",
      "0",
      "0",
       // false, not to have infinite recursion
      instantiate_image_metadata_images(0)
    );
  } else {
    image_metadata = image_metadata_create(
      "0",
      "0",
      "0",
      "0",
      NULL
    );
  }

  return image_metadata;
}


#ifdef image_metadata_MAIN

void test_image_metadata(int include_optional) {
    image_metadata_t* image_metadata_1 = instantiate_image_metadata(include_optional);

	cJSON* jsonimage_metadata_1 = image_metadata_convertToJSON(image_metadata_1);
	printf("image_metadata :\n%s\n", cJSON_Print(jsonimage_metadata_1));
	image_metadata_t* image_metadata_2 = image_metadata_parseFromJSON(jsonimage_metadata_1);
	cJSON* jsonimage_metadata_2 = image_metadata_convertToJSON(image_metadata_2);
	printf("repeating image_metadata:\n%s\n", cJSON_Print(jsonimage_metadata_2));
}

int main() {
  test_image_metadata(1);
  test_image_metadata(0);

  printf("Hello world \n");
  return 0;
}

#endif // image_metadata_MAIN
#endif // image_metadata_TEST
