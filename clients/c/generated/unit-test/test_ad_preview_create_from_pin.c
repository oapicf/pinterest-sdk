#ifndef ad_preview_create_from_pin_TEST
#define ad_preview_create_from_pin_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ad_preview_create_from_pin_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ad_preview_create_from_pin.h"
ad_preview_create_from_pin_t* instantiate_ad_preview_create_from_pin(int include_optional);



ad_preview_create_from_pin_t* instantiate_ad_preview_create_from_pin(int include_optional) {
  ad_preview_create_from_pin_t* ad_preview_create_from_pin = NULL;
  if (include_optional) {
    ad_preview_create_from_pin = ad_preview_create_from_pin_create(
      "7389479023"
    );
  } else {
    ad_preview_create_from_pin = ad_preview_create_from_pin_create(
      "7389479023"
    );
  }

  return ad_preview_create_from_pin;
}


#ifdef ad_preview_create_from_pin_MAIN

void test_ad_preview_create_from_pin(int include_optional) {
    ad_preview_create_from_pin_t* ad_preview_create_from_pin_1 = instantiate_ad_preview_create_from_pin(include_optional);

	cJSON* jsonad_preview_create_from_pin_1 = ad_preview_create_from_pin_convertToJSON(ad_preview_create_from_pin_1);
	printf("ad_preview_create_from_pin :\n%s\n", cJSON_Print(jsonad_preview_create_from_pin_1));
	ad_preview_create_from_pin_t* ad_preview_create_from_pin_2 = ad_preview_create_from_pin_parseFromJSON(jsonad_preview_create_from_pin_1);
	cJSON* jsonad_preview_create_from_pin_2 = ad_preview_create_from_pin_convertToJSON(ad_preview_create_from_pin_2);
	printf("repeating ad_preview_create_from_pin:\n%s\n", cJSON_Print(jsonad_preview_create_from_pin_2));
}

int main() {
  test_ad_preview_create_from_pin(1);
  test_ad_preview_create_from_pin(0);

  printf("Hello world \n");
  return 0;
}

#endif // ad_preview_create_from_pin_MAIN
#endif // ad_preview_create_from_pin_TEST
