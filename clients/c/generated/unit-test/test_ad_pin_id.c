#ifndef ad_pin_id_TEST
#define ad_pin_id_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ad_pin_id_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ad_pin_id.h"
ad_pin_id_t* instantiate_ad_pin_id(int include_optional);



ad_pin_id_t* instantiate_ad_pin_id(int include_optional) {
  ad_pin_id_t* ad_pin_id = NULL;
  if (include_optional) {
    ad_pin_id = ad_pin_id_create(
      "394205773611545468"
    );
  } else {
    ad_pin_id = ad_pin_id_create(
      "394205773611545468"
    );
  }

  return ad_pin_id;
}


#ifdef ad_pin_id_MAIN

void test_ad_pin_id(int include_optional) {
    ad_pin_id_t* ad_pin_id_1 = instantiate_ad_pin_id(include_optional);

	cJSON* jsonad_pin_id_1 = ad_pin_id_convertToJSON(ad_pin_id_1);
	printf("ad_pin_id :\n%s\n", cJSON_Print(jsonad_pin_id_1));
	ad_pin_id_t* ad_pin_id_2 = ad_pin_id_parseFromJSON(jsonad_pin_id_1);
	cJSON* jsonad_pin_id_2 = ad_pin_id_convertToJSON(ad_pin_id_2);
	printf("repeating ad_pin_id:\n%s\n", cJSON_Print(jsonad_pin_id_2));
}

int main() {
  test_ad_pin_id(1);
  test_ad_pin_id(0);

  printf("Hello world \n");
  return 0;
}

#endif // ad_pin_id_MAIN
#endif // ad_pin_id_TEST
