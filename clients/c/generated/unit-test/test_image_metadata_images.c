#ifndef image_metadata_images_TEST
#define image_metadata_images_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define image_metadata_images_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/image_metadata_images.h"
image_metadata_images_t* instantiate_image_metadata_images(int include_optional);



image_metadata_images_t* instantiate_image_metadata_images(int include_optional) {
  image_metadata_images_t* image_metadata_images = NULL;
  if (include_optional) {
    image_metadata_images = image_metadata_images_create(
      {"width":400,"height":300,"url":"https://i.pinimg.com/400x300/0d/f6/f1/0df6f1f0bfe7aaca849c1bbc3607a34b.jpg"},
      {"width":400,"height":300,"url":"https://i.pinimg.com/400x300/0d/f6/f1/0df6f1f0bfe7aaca849c1bbc3607a34b.jpg"},
      {"width":400,"height":300,"url":"https://i.pinimg.com/400x300/0d/f6/f1/0df6f1f0bfe7aaca849c1bbc3607a34b.jpg"},
      {"width":400,"height":300,"url":"https://i.pinimg.com/400x300/0d/f6/f1/0df6f1f0bfe7aaca849c1bbc3607a34b.jpg"}
    );
  } else {
    image_metadata_images = image_metadata_images_create(
      {"width":400,"height":300,"url":"https://i.pinimg.com/400x300/0d/f6/f1/0df6f1f0bfe7aaca849c1bbc3607a34b.jpg"},
      {"width":400,"height":300,"url":"https://i.pinimg.com/400x300/0d/f6/f1/0df6f1f0bfe7aaca849c1bbc3607a34b.jpg"},
      {"width":400,"height":300,"url":"https://i.pinimg.com/400x300/0d/f6/f1/0df6f1f0bfe7aaca849c1bbc3607a34b.jpg"},
      {"width":400,"height":300,"url":"https://i.pinimg.com/400x300/0d/f6/f1/0df6f1f0bfe7aaca849c1bbc3607a34b.jpg"}
    );
  }

  return image_metadata_images;
}


#ifdef image_metadata_images_MAIN

void test_image_metadata_images(int include_optional) {
    image_metadata_images_t* image_metadata_images_1 = instantiate_image_metadata_images(include_optional);

	cJSON* jsonimage_metadata_images_1 = image_metadata_images_convertToJSON(image_metadata_images_1);
	printf("image_metadata_images :\n%s\n", cJSON_Print(jsonimage_metadata_images_1));
	image_metadata_images_t* image_metadata_images_2 = image_metadata_images_parseFromJSON(jsonimage_metadata_images_1);
	cJSON* jsonimage_metadata_images_2 = image_metadata_images_convertToJSON(image_metadata_images_2);
	printf("repeating image_metadata_images:\n%s\n", cJSON_Print(jsonimage_metadata_images_2));
}

int main() {
  test_image_metadata_images(1);
  test_image_metadata_images(0);

  printf("Hello world \n");
  return 0;
}

#endif // image_metadata_images_MAIN
#endif // image_metadata_images_TEST
