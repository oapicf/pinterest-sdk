#ifndef pin_media_TEST
#define pin_media_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pin_media_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pin_media.h"
pin_media_t* instantiate_pin_media(int include_optional);

#include "test_image_size.c"


pin_media_t* instantiate_pin_media(int include_optional) {
  pin_media_t* pin_media = NULL;
  if (include_optional) {
    pin_media = pin_media_create(
      {"150x150":{"width":150,"height":150,"url":"https://i.pinimg.com/150x150/0d/f6/f1/0df6f1f0bfe7aaca849c1bbc3607a34b.jpg"},"400x300":{"width":400,"height":300,"url":"https://i.pinimg.com/400x300/0d/f6/f1/0df6f1f0bfe7aaca849c1bbc3607a34b.jpg"},"600x":{"width":600,"height":600,"url":"https://i.pinimg.com/600x/0d/f6/f1/0df6f1f0bfe7aaca849c1bbc3607a34b.jpg"},"1200x":{"width":1200,"height":1200,"url":"https://i.pinimg.com/1200x/0d/f6/f1/0df6f1f0bfe7aaca849c1bbc3607a34b.jpg"}},
      pinterest_rest_api_pin_media_MEDIATYPE_multiple_mixed,
      "0",
      1.337,
      56,
      "0",
      56,
      list_createList()
    );
  } else {
    pin_media = pin_media_create(
      {"150x150":{"width":150,"height":150,"url":"https://i.pinimg.com/150x150/0d/f6/f1/0df6f1f0bfe7aaca849c1bbc3607a34b.jpg"},"400x300":{"width":400,"height":300,"url":"https://i.pinimg.com/400x300/0d/f6/f1/0df6f1f0bfe7aaca849c1bbc3607a34b.jpg"},"600x":{"width":600,"height":600,"url":"https://i.pinimg.com/600x/0d/f6/f1/0df6f1f0bfe7aaca849c1bbc3607a34b.jpg"},"1200x":{"width":1200,"height":1200,"url":"https://i.pinimg.com/1200x/0d/f6/f1/0df6f1f0bfe7aaca849c1bbc3607a34b.jpg"}},
      pinterest_rest_api_pin_media_MEDIATYPE_multiple_mixed,
      "0",
      1.337,
      56,
      "0",
      56,
      list_createList()
    );
  }

  return pin_media;
}


#ifdef pin_media_MAIN

void test_pin_media(int include_optional) {
    pin_media_t* pin_media_1 = instantiate_pin_media(include_optional);

	cJSON* jsonpin_media_1 = pin_media_convertToJSON(pin_media_1);
	printf("pin_media :\n%s\n", cJSON_Print(jsonpin_media_1));
	pin_media_t* pin_media_2 = pin_media_parseFromJSON(jsonpin_media_1);
	cJSON* jsonpin_media_2 = pin_media_convertToJSON(pin_media_2);
	printf("repeating pin_media:\n%s\n", cJSON_Print(jsonpin_media_2));
}

int main() {
  test_pin_media(1);
  test_pin_media(0);

  printf("Hello world \n");
  return 0;
}

#endif // pin_media_MAIN
#endif // pin_media_TEST
