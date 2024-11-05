#ifndef catalogs_creative_assets_attributes_TEST
#define catalogs_creative_assets_attributes_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_creative_assets_attributes_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_creative_assets_attributes.h"
catalogs_creative_assets_attributes_t* instantiate_catalogs_creative_assets_attributes(int include_optional);



catalogs_creative_assets_attributes_t* instantiate_catalogs_creative_assets_attributes(int include_optional) {
  catalogs_creative_assets_attributes_t* catalogs_creative_assets_attributes = NULL;
  if (include_optional) {
    catalogs_creative_assets_attributes = catalogs_creative_assets_attributes_create(
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "https://scene.example.com/image/image_v2.jpg",
      "https://scene.example.com/image/image_v2.mp4"
    );
  } else {
    catalogs_creative_assets_attributes = catalogs_creative_assets_attributes_create(
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "https://scene.example.com/image/image_v2.jpg",
      "https://scene.example.com/image/image_v2.mp4"
    );
  }

  return catalogs_creative_assets_attributes;
}


#ifdef catalogs_creative_assets_attributes_MAIN

void test_catalogs_creative_assets_attributes(int include_optional) {
    catalogs_creative_assets_attributes_t* catalogs_creative_assets_attributes_1 = instantiate_catalogs_creative_assets_attributes(include_optional);

	cJSON* jsoncatalogs_creative_assets_attributes_1 = catalogs_creative_assets_attributes_convertToJSON(catalogs_creative_assets_attributes_1);
	printf("catalogs_creative_assets_attributes :\n%s\n", cJSON_Print(jsoncatalogs_creative_assets_attributes_1));
	catalogs_creative_assets_attributes_t* catalogs_creative_assets_attributes_2 = catalogs_creative_assets_attributes_parseFromJSON(jsoncatalogs_creative_assets_attributes_1);
	cJSON* jsoncatalogs_creative_assets_attributes_2 = catalogs_creative_assets_attributes_convertToJSON(catalogs_creative_assets_attributes_2);
	printf("repeating catalogs_creative_assets_attributes:\n%s\n", cJSON_Print(jsoncatalogs_creative_assets_attributes_2));
}

int main() {
  test_catalogs_creative_assets_attributes(1);
  test_catalogs_creative_assets_attributes(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_creative_assets_attributes_MAIN
#endif // catalogs_creative_assets_attributes_TEST
