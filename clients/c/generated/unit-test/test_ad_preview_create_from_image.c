#ifndef ad_preview_create_from_image_TEST
#define ad_preview_create_from_image_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ad_preview_create_from_image_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ad_preview_create_from_image.h"
ad_preview_create_from_image_t* instantiate_ad_preview_create_from_image(int include_optional);



ad_preview_create_from_image_t* instantiate_ad_preview_create_from_image(int include_optional) {
  ad_preview_create_from_image_t* ad_preview_create_from_image = NULL;
  if (include_optional) {
    ad_preview_create_from_image = ad_preview_create_from_image_create(
      "https://somewebsite.com/someimage.jpg",
      "My Preview Image"
    );
  } else {
    ad_preview_create_from_image = ad_preview_create_from_image_create(
      "https://somewebsite.com/someimage.jpg",
      "My Preview Image"
    );
  }

  return ad_preview_create_from_image;
}


#ifdef ad_preview_create_from_image_MAIN

void test_ad_preview_create_from_image(int include_optional) {
    ad_preview_create_from_image_t* ad_preview_create_from_image_1 = instantiate_ad_preview_create_from_image(include_optional);

	cJSON* jsonad_preview_create_from_image_1 = ad_preview_create_from_image_convertToJSON(ad_preview_create_from_image_1);
	printf("ad_preview_create_from_image :\n%s\n", cJSON_Print(jsonad_preview_create_from_image_1));
	ad_preview_create_from_image_t* ad_preview_create_from_image_2 = ad_preview_create_from_image_parseFromJSON(jsonad_preview_create_from_image_1);
	cJSON* jsonad_preview_create_from_image_2 = ad_preview_create_from_image_convertToJSON(ad_preview_create_from_image_2);
	printf("repeating ad_preview_create_from_image:\n%s\n", cJSON_Print(jsonad_preview_create_from_image_2));
}

int main() {
  test_ad_preview_create_from_image(1);
  test_ad_preview_create_from_image(0);

  printf("Hello world \n");
  return 0;
}

#endif // ad_preview_create_from_image_MAIN
#endif // ad_preview_create_from_image_TEST
