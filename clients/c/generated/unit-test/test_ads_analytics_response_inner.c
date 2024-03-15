#ifndef ads_analytics_response_inner_TEST
#define ads_analytics_response_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ads_analytics_response_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ads_analytics_response_inner.h"
ads_analytics_response_inner_t* instantiate_ads_analytics_response_inner(int include_optional);



ads_analytics_response_inner_t* instantiate_ads_analytics_response_inner(int include_optional) {
  ads_analytics_response_inner_t* ads_analytics_response_inner = NULL;
  if (include_optional) {
    ads_analytics_response_inner = ads_analytics_response_inner_create(
      "a",
      "2013-10-20"
    );
  } else {
    ads_analytics_response_inner = ads_analytics_response_inner_create(
      "a",
      "2013-10-20"
    );
  }

  return ads_analytics_response_inner;
}


#ifdef ads_analytics_response_inner_MAIN

void test_ads_analytics_response_inner(int include_optional) {
    ads_analytics_response_inner_t* ads_analytics_response_inner_1 = instantiate_ads_analytics_response_inner(include_optional);

	cJSON* jsonads_analytics_response_inner_1 = ads_analytics_response_inner_convertToJSON(ads_analytics_response_inner_1);
	printf("ads_analytics_response_inner :\n%s\n", cJSON_Print(jsonads_analytics_response_inner_1));
	ads_analytics_response_inner_t* ads_analytics_response_inner_2 = ads_analytics_response_inner_parseFromJSON(jsonads_analytics_response_inner_1);
	cJSON* jsonads_analytics_response_inner_2 = ads_analytics_response_inner_convertToJSON(ads_analytics_response_inner_2);
	printf("repeating ads_analytics_response_inner:\n%s\n", cJSON_Print(jsonads_analytics_response_inner_2));
}

int main() {
  test_ads_analytics_response_inner(1);
  test_ads_analytics_response_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // ads_analytics_response_inner_MAIN
#endif // ads_analytics_response_inner_TEST
