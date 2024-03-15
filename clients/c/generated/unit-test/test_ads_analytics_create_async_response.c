#ifndef ads_analytics_create_async_response_TEST
#define ads_analytics_create_async_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ads_analytics_create_async_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ads_analytics_create_async_response.h"
ads_analytics_create_async_response_t* instantiate_ads_analytics_create_async_response(int include_optional);



ads_analytics_create_async_response_t* instantiate_ads_analytics_create_async_response(int include_optional) {
  ads_analytics_create_async_response_t* ads_analytics_create_async_response = NULL;
  if (include_optional) {
    ads_analytics_create_async_response = ads_analytics_create_async_response_create(
      "FINISHED",
      "0",
      "0"
    );
  } else {
    ads_analytics_create_async_response = ads_analytics_create_async_response_create(
      "FINISHED",
      "0",
      "0"
    );
  }

  return ads_analytics_create_async_response;
}


#ifdef ads_analytics_create_async_response_MAIN

void test_ads_analytics_create_async_response(int include_optional) {
    ads_analytics_create_async_response_t* ads_analytics_create_async_response_1 = instantiate_ads_analytics_create_async_response(include_optional);

	cJSON* jsonads_analytics_create_async_response_1 = ads_analytics_create_async_response_convertToJSON(ads_analytics_create_async_response_1);
	printf("ads_analytics_create_async_response :\n%s\n", cJSON_Print(jsonads_analytics_create_async_response_1));
	ads_analytics_create_async_response_t* ads_analytics_create_async_response_2 = ads_analytics_create_async_response_parseFromJSON(jsonads_analytics_create_async_response_1);
	cJSON* jsonads_analytics_create_async_response_2 = ads_analytics_create_async_response_convertToJSON(ads_analytics_create_async_response_2);
	printf("repeating ads_analytics_create_async_response:\n%s\n", cJSON_Print(jsonads_analytics_create_async_response_2));
}

int main() {
  test_ads_analytics_create_async_response(1);
  test_ads_analytics_create_async_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // ads_analytics_create_async_response_MAIN
#endif // ads_analytics_create_async_response_TEST
