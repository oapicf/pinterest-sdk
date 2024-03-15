#ifndef ads_list_200_response_TEST
#define ads_list_200_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ads_list_200_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ads_list_200_response.h"
ads_list_200_response_t* instantiate_ads_list_200_response(int include_optional);



ads_list_200_response_t* instantiate_ads_list_200_response(int include_optional) {
  ads_list_200_response_t* ads_list_200_response = NULL;
  if (include_optional) {
    ads_list_200_response = ads_list_200_response_create(
      list_createList(),
      "0"
    );
  } else {
    ads_list_200_response = ads_list_200_response_create(
      list_createList(),
      "0"
    );
  }

  return ads_list_200_response;
}


#ifdef ads_list_200_response_MAIN

void test_ads_list_200_response(int include_optional) {
    ads_list_200_response_t* ads_list_200_response_1 = instantiate_ads_list_200_response(include_optional);

	cJSON* jsonads_list_200_response_1 = ads_list_200_response_convertToJSON(ads_list_200_response_1);
	printf("ads_list_200_response :\n%s\n", cJSON_Print(jsonads_list_200_response_1));
	ads_list_200_response_t* ads_list_200_response_2 = ads_list_200_response_parseFromJSON(jsonads_list_200_response_1);
	cJSON* jsonads_list_200_response_2 = ads_list_200_response_convertToJSON(ads_list_200_response_2);
	printf("repeating ads_list_200_response:\n%s\n", cJSON_Print(jsonads_list_200_response_2));
}

int main() {
  test_ads_list_200_response(1);
  test_ads_list_200_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // ads_list_200_response_MAIN
#endif // ads_list_200_response_TEST
