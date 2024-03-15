#ifndef ad_response_TEST
#define ad_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ad_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ad_response.h"
ad_response_t* instantiate_ad_response(int include_optional);

#include "test_ad_common_tracking_urls.c"
#include "test_ad_common_quiz_pin_data.c"


ad_response_t* instantiate_ad_response(int include_optional) {
  ad_response_t* ad_response = NULL;
  if (include_optional) {
    ad_response = ad_response_create(
      "2680059592705",
      "0",
      list_createList(),
      list_createList(),
      list_createList(),
      "0",
      pinterest_rest_api_ad_response__"REGULAR",
      "0",
      "0",
      false,
      false,
      "0",
      pinterest_rest_api_ad_response__"ACTIVE",
       // false, not to have infinite recursion
      instantiate_ad_common_tracking_urls(0),
      "0",
      "a",
      pinterest_rest_api_ad_response__"CLOSEUP",
      pinterest_rest_api_ad_response_CUSTOMIZABLECTATYPE_"LEARN_MORE",
       // false, not to have infinite recursion
      instantiate_ad_common_quiz_pin_data(0),
      "394205773611545468",
      "549755885175",
      "626735565838",
      "0",
      1451431341,
      "687195134316",
      list_createList(),
      list_createList(),
      pinterest_rest_api_ad_response_REVIEWSTATUS_"PENDING",
      "pinpromotion",
      1451431341,
      "APPROVED"
    );
  } else {
    ad_response = ad_response_create(
      "2680059592705",
      "0",
      list_createList(),
      list_createList(),
      list_createList(),
      "0",
      pinterest_rest_api_ad_response__"REGULAR",
      "0",
      "0",
      false,
      false,
      "0",
      pinterest_rest_api_ad_response__"ACTIVE",
      NULL,
      "0",
      "a",
      pinterest_rest_api_ad_response__"CLOSEUP",
      pinterest_rest_api_ad_response_CUSTOMIZABLECTATYPE_"LEARN_MORE",
      NULL,
      "394205773611545468",
      "549755885175",
      "626735565838",
      "0",
      1451431341,
      "687195134316",
      list_createList(),
      list_createList(),
      pinterest_rest_api_ad_response_REVIEWSTATUS_"PENDING",
      "pinpromotion",
      1451431341,
      "APPROVED"
    );
  }

  return ad_response;
}


#ifdef ad_response_MAIN

void test_ad_response(int include_optional) {
    ad_response_t* ad_response_1 = instantiate_ad_response(include_optional);

	cJSON* jsonad_response_1 = ad_response_convertToJSON(ad_response_1);
	printf("ad_response :\n%s\n", cJSON_Print(jsonad_response_1));
	ad_response_t* ad_response_2 = ad_response_parseFromJSON(jsonad_response_1);
	cJSON* jsonad_response_2 = ad_response_convertToJSON(ad_response_2);
	printf("repeating ad_response:\n%s\n", cJSON_Print(jsonad_response_2));
}

int main() {
  test_ad_response(1);
  test_ad_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // ad_response_MAIN
#endif // ad_response_TEST
