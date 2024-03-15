#ifndef ad_common_TEST
#define ad_common_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ad_common_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ad_common.h"
ad_common_t* instantiate_ad_common(int include_optional);

#include "test_ad_common_tracking_urls.c"
#include "test_ad_common_quiz_pin_data.c"


ad_common_t* instantiate_ad_common(int include_optional) {
  ad_common_t* ad_common = NULL;
  if (include_optional) {
    ad_common = ad_common_create(
      "2680059592705",
      "0",
      list_createList(),
      list_createList(),
      list_createList(),
      "0",
      pinterest_rest_api_ad_common__"REGULAR",
      "0",
      "0",
      false,
      false,
      "0",
      pinterest_rest_api_ad_common__"ACTIVE",
       // false, not to have infinite recursion
      instantiate_ad_common_tracking_urls(0),
      "0",
      "a",
      pinterest_rest_api_ad_common__"CLOSEUP",
      pinterest_rest_api_ad_common_CUSTOMIZABLECTATYPE_"LEARN_MORE",
       // false, not to have infinite recursion
      instantiate_ad_common_quiz_pin_data(0)
    );
  } else {
    ad_common = ad_common_create(
      "2680059592705",
      "0",
      list_createList(),
      list_createList(),
      list_createList(),
      "0",
      pinterest_rest_api_ad_common__"REGULAR",
      "0",
      "0",
      false,
      false,
      "0",
      pinterest_rest_api_ad_common__"ACTIVE",
      NULL,
      "0",
      "a",
      pinterest_rest_api_ad_common__"CLOSEUP",
      pinterest_rest_api_ad_common_CUSTOMIZABLECTATYPE_"LEARN_MORE",
      NULL
    );
  }

  return ad_common;
}


#ifdef ad_common_MAIN

void test_ad_common(int include_optional) {
    ad_common_t* ad_common_1 = instantiate_ad_common(include_optional);

	cJSON* jsonad_common_1 = ad_common_convertToJSON(ad_common_1);
	printf("ad_common :\n%s\n", cJSON_Print(jsonad_common_1));
	ad_common_t* ad_common_2 = ad_common_parseFromJSON(jsonad_common_1);
	cJSON* jsonad_common_2 = ad_common_convertToJSON(ad_common_2);
	printf("repeating ad_common:\n%s\n", cJSON_Print(jsonad_common_2));
}

int main() {
  test_ad_common(1);
  test_ad_common(0);

  printf("Hello world \n");
  return 0;
}

#endif // ad_common_MAIN
#endif // ad_common_TEST
