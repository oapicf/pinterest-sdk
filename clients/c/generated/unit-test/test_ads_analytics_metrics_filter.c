#ifndef ads_analytics_metrics_filter_TEST
#define ads_analytics_metrics_filter_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ads_analytics_metrics_filter_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ads_analytics_metrics_filter.h"
ads_analytics_metrics_filter_t* instantiate_ads_analytics_metrics_filter(int include_optional);



ads_analytics_metrics_filter_t* instantiate_ads_analytics_metrics_filter(int include_optional) {
  ads_analytics_metrics_filter_t* ads_analytics_metrics_filter = NULL;
  if (include_optional) {
    ads_analytics_metrics_filter = ads_analytics_metrics_filter_create(
      pinterest_rest_api_ads_analytics_metrics_filter__"SPEND_IN_DOLLAR",
      pinterest_rest_api_ads_analytics_metrics_filter__"LESS_THAN",
      list_createList()
    );
  } else {
    ads_analytics_metrics_filter = ads_analytics_metrics_filter_create(
      pinterest_rest_api_ads_analytics_metrics_filter__"SPEND_IN_DOLLAR",
      pinterest_rest_api_ads_analytics_metrics_filter__"LESS_THAN",
      list_createList()
    );
  }

  return ads_analytics_metrics_filter;
}


#ifdef ads_analytics_metrics_filter_MAIN

void test_ads_analytics_metrics_filter(int include_optional) {
    ads_analytics_metrics_filter_t* ads_analytics_metrics_filter_1 = instantiate_ads_analytics_metrics_filter(include_optional);

	cJSON* jsonads_analytics_metrics_filter_1 = ads_analytics_metrics_filter_convertToJSON(ads_analytics_metrics_filter_1);
	printf("ads_analytics_metrics_filter :\n%s\n", cJSON_Print(jsonads_analytics_metrics_filter_1));
	ads_analytics_metrics_filter_t* ads_analytics_metrics_filter_2 = ads_analytics_metrics_filter_parseFromJSON(jsonads_analytics_metrics_filter_1);
	cJSON* jsonads_analytics_metrics_filter_2 = ads_analytics_metrics_filter_convertToJSON(ads_analytics_metrics_filter_2);
	printf("repeating ads_analytics_metrics_filter:\n%s\n", cJSON_Print(jsonads_analytics_metrics_filter_2));
}

int main() {
  test_ads_analytics_metrics_filter(1);
  test_ads_analytics_metrics_filter(0);

  printf("Hello world \n");
  return 0;
}

#endif // ads_analytics_metrics_filter_MAIN
#endif // ads_analytics_metrics_filter_TEST
