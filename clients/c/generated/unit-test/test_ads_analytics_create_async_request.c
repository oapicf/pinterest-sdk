#ifndef ads_analytics_create_async_request_TEST
#define ads_analytics_create_async_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ads_analytics_create_async_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ads_analytics_create_async_request.h"
ads_analytics_create_async_request_t* instantiate_ads_analytics_create_async_request(int include_optional);



ads_analytics_create_async_request_t* instantiate_ads_analytics_create_async_request(int include_optional) {
  ads_analytics_create_async_request_t* ads_analytics_create_async_request = NULL;
  if (include_optional) {
    ads_analytics_create_async_request = ads_analytics_create_async_request_create(
      list_createList(),
      0,
      "TIME_OF_AD_ACTION",
      "2020-12-20",
      0,
      TOTAL,
      "2020-12-20",
      0,
      ["12345678"],
      ["RUNNING","PAUSED"],
      ["AWARENESS"],
      "Brand",
      ["12345678"],
      ["RUNNING","PAUSED"],
      ["12345678"],
      ["APPROVED","PAUSED"],
      ["12345678"],
      ["RUNNING","PAUSED"],
      ["12345678"],
      list_createList(),
      list_createList(),
      list_createList(),
      false,
      list_createList(),
      0,
      "CAMPAIGN",
      pinterest_rest_api_ads_analytics_create_async_request_PRIMARYSORT_"BY_ID",
      "JSON",
      "PINTEREST_TIME_ZONE",
      0
    );
  } else {
    ads_analytics_create_async_request = ads_analytics_create_async_request_create(
      list_createList(),
      0,
      "TIME_OF_AD_ACTION",
      "2020-12-20",
      0,
      TOTAL,
      "2020-12-20",
      0,
      ["12345678"],
      ["RUNNING","PAUSED"],
      ["AWARENESS"],
      "Brand",
      ["12345678"],
      ["RUNNING","PAUSED"],
      ["12345678"],
      ["APPROVED","PAUSED"],
      ["12345678"],
      ["RUNNING","PAUSED"],
      ["12345678"],
      list_createList(),
      list_createList(),
      list_createList(),
      false,
      list_createList(),
      0,
      "CAMPAIGN",
      pinterest_rest_api_ads_analytics_create_async_request_PRIMARYSORT_"BY_ID",
      "JSON",
      "PINTEREST_TIME_ZONE",
      0
    );
  }

  return ads_analytics_create_async_request;
}


#ifdef ads_analytics_create_async_request_MAIN

void test_ads_analytics_create_async_request(int include_optional) {
    ads_analytics_create_async_request_t* ads_analytics_create_async_request_1 = instantiate_ads_analytics_create_async_request(include_optional);

	cJSON* jsonads_analytics_create_async_request_1 = ads_analytics_create_async_request_convertToJSON(ads_analytics_create_async_request_1);
	printf("ads_analytics_create_async_request :\n%s\n", cJSON_Print(jsonads_analytics_create_async_request_1));
	ads_analytics_create_async_request_t* ads_analytics_create_async_request_2 = ads_analytics_create_async_request_parseFromJSON(jsonads_analytics_create_async_request_1);
	cJSON* jsonads_analytics_create_async_request_2 = ads_analytics_create_async_request_convertToJSON(ads_analytics_create_async_request_2);
	printf("repeating ads_analytics_create_async_request:\n%s\n", cJSON_Print(jsonads_analytics_create_async_request_2));
}

int main() {
  test_ads_analytics_create_async_request(1);
  test_ads_analytics_create_async_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // ads_analytics_create_async_request_MAIN
#endif // ads_analytics_create_async_request_TEST
