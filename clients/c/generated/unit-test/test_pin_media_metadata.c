#ifndef pin_media_metadata_TEST
#define pin_media_metadata_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pin_media_metadata_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pin_media_metadata.h"
pin_media_metadata_t* instantiate_pin_media_metadata(int include_optional);

#include "test_image_size.c"


pin_media_metadata_t* instantiate_pin_media_metadata(int include_optional) {
  pin_media_metadata_t* pin_media_metadata = NULL;
  if (include_optional) {
    pin_media_metadata = pin_media_metadata_create(
      "0",
      {"150x150":{"width":150,"height":150,"url":"https://i.pinimg.com/150x150/0d/f6/f1/0df6f1f0bfe7aaca849c1bbc3607a34b.jpg"},"400x300":{"width":400,"height":300,"url":"https://i.pinimg.com/400x300/0d/f6/f1/0df6f1f0bfe7aaca849c1bbc3607a34b.jpg"},"600x":{"width":600,"height":600,"url":"https://i.pinimg.com/600x/0d/f6/f1/0df6f1f0bfe7aaca849c1bbc3607a34b.jpg"},"1200x":{"width":1200,"height":1200,"url":"https://i.pinimg.com/1200x/0d/f6/f1/0df6f1f0bfe7aaca849c1bbc3607a34b.jpg"}},
      "0",
      "0",
      "0",
      "0",
      1.337,
      56,
      "0",
      56
    );
  } else {
    pin_media_metadata = pin_media_metadata_create(
      "0",
      {"150x150":{"width":150,"height":150,"url":"https://i.pinimg.com/150x150/0d/f6/f1/0df6f1f0bfe7aaca849c1bbc3607a34b.jpg"},"400x300":{"width":400,"height":300,"url":"https://i.pinimg.com/400x300/0d/f6/f1/0df6f1f0bfe7aaca849c1bbc3607a34b.jpg"},"600x":{"width":600,"height":600,"url":"https://i.pinimg.com/600x/0d/f6/f1/0df6f1f0bfe7aaca849c1bbc3607a34b.jpg"},"1200x":{"width":1200,"height":1200,"url":"https://i.pinimg.com/1200x/0d/f6/f1/0df6f1f0bfe7aaca849c1bbc3607a34b.jpg"}},
      "0",
      "0",
      "0",
      "0",
      1.337,
      56,
      "0",
      56
    );
  }

  return pin_media_metadata;
}


#ifdef pin_media_metadata_MAIN

void test_pin_media_metadata(int include_optional) {
    pin_media_metadata_t* pin_media_metadata_1 = instantiate_pin_media_metadata(include_optional);

	cJSON* jsonpin_media_metadata_1 = pin_media_metadata_convertToJSON(pin_media_metadata_1);
	printf("pin_media_metadata :\n%s\n", cJSON_Print(jsonpin_media_metadata_1));
	pin_media_metadata_t* pin_media_metadata_2 = pin_media_metadata_parseFromJSON(jsonpin_media_metadata_1);
	cJSON* jsonpin_media_metadata_2 = pin_media_metadata_convertToJSON(pin_media_metadata_2);
	printf("repeating pin_media_metadata:\n%s\n", cJSON_Print(jsonpin_media_metadata_2));
}

int main() {
  test_pin_media_metadata(1);
  test_pin_media_metadata(0);

  printf("Hello world \n");
  return 0;
}

#endif // pin_media_metadata_MAIN
#endif // pin_media_metadata_TEST
