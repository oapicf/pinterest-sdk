#ifndef ad_preview_shopping_TEST
#define ad_preview_shopping_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ad_preview_shopping_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ad_preview_shopping.h"
ad_preview_shopping_t* instantiate_ad_preview_shopping(int include_optional);



ad_preview_shopping_t* instantiate_ad_preview_shopping(int include_optional) {
  ad_preview_shopping_t* ad_preview_shopping = NULL;
  if (include_optional) {
    ad_preview_shopping = ad_preview_shopping_create(
      "123456789",
      pinterest_rest_api_ad_preview_shopping_CREATIVETYPE_"SHOPPING",
      "LEARN_MORE",
      "My Preview Image",
      "https://somewebsite.com/someimage.jpg",
      "987654321",
      "Christmas Sale",
      "111111111",
      pinterest_rest_api_ad_preview_shopping_PREFERREDMEDIATYPE_"IMAGE",
      "Black Friday Sale"
    );
  } else {
    ad_preview_shopping = ad_preview_shopping_create(
      "123456789",
      pinterest_rest_api_ad_preview_shopping_CREATIVETYPE_"SHOPPING",
      "LEARN_MORE",
      "My Preview Image",
      "https://somewebsite.com/someimage.jpg",
      "987654321",
      "Christmas Sale",
      "111111111",
      pinterest_rest_api_ad_preview_shopping_PREFERREDMEDIATYPE_"IMAGE",
      "Black Friday Sale"
    );
  }

  return ad_preview_shopping;
}


#ifdef ad_preview_shopping_MAIN

void test_ad_preview_shopping(int include_optional) {
    ad_preview_shopping_t* ad_preview_shopping_1 = instantiate_ad_preview_shopping(include_optional);

	cJSON* jsonad_preview_shopping_1 = ad_preview_shopping_convertToJSON(ad_preview_shopping_1);
	printf("ad_preview_shopping :\n%s\n", cJSON_Print(jsonad_preview_shopping_1));
	ad_preview_shopping_t* ad_preview_shopping_2 = ad_preview_shopping_parseFromJSON(jsonad_preview_shopping_1);
	cJSON* jsonad_preview_shopping_2 = ad_preview_shopping_convertToJSON(ad_preview_shopping_2);
	printf("repeating ad_preview_shopping:\n%s\n", cJSON_Print(jsonad_preview_shopping_2));
}

int main() {
  test_ad_preview_shopping(1);
  test_ad_preview_shopping(0);

  printf("Hello world \n");
  return 0;
}

#endif // ad_preview_shopping_MAIN
#endif // ad_preview_shopping_TEST
