#ifndef image_size_TEST
#define image_size_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define image_size_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/image_size.h"
image_size_t* instantiate_image_size(int include_optional);

#include "test_image_details.c"
#include "test_image_details.c"
#include "test_image_details.c"
#include "test_image_details.c"


image_size_t* instantiate_image_size(int include_optional) {
  image_size_t* image_size = NULL;
  if (include_optional) {
    image_size = image_size_create(
       // false, not to have infinite recursion
      instantiate_image_details(0),
       // false, not to have infinite recursion
      instantiate_image_details(0),
       // false, not to have infinite recursion
      instantiate_image_details(0),
       // false, not to have infinite recursion
      instantiate_image_details(0)
    );
  } else {
    image_size = image_size_create(
      NULL,
      NULL,
      NULL,
      NULL
    );
  }

  return image_size;
}


#ifdef image_size_MAIN

void test_image_size(int include_optional) {
    image_size_t* image_size_1 = instantiate_image_size(include_optional);

	cJSON* jsonimage_size_1 = image_size_convertToJSON(image_size_1);
	printf("image_size :\n%s\n", cJSON_Print(jsonimage_size_1));
	image_size_t* image_size_2 = image_size_parseFromJSON(jsonimage_size_1);
	cJSON* jsonimage_size_2 = image_size_convertToJSON(image_size_2);
	printf("repeating image_size:\n%s\n", cJSON_Print(jsonimage_size_2));
}

int main() {
  test_image_size(1);
  test_image_size(0);

  printf("Hello world \n");
  return 0;
}

#endif // image_size_MAIN
#endif // image_size_TEST
