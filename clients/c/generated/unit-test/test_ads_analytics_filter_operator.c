#ifndef ads_analytics_filter_operator_TEST
#define ads_analytics_filter_operator_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ads_analytics_filter_operator_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ads_analytics_filter_operator.h"
ads_analytics_filter_operator_t* instantiate_ads_analytics_filter_operator(int include_optional);



ads_analytics_filter_operator_t* instantiate_ads_analytics_filter_operator(int include_optional) {
  ads_analytics_filter_operator_t* ads_analytics_filter_operator = NULL;
  if (include_optional) {
    ads_analytics_filter_operator = ads_analytics_filter_operator_create(
    );
  } else {
    ads_analytics_filter_operator = ads_analytics_filter_operator_create(
    );
  }

  return ads_analytics_filter_operator;
}


#ifdef ads_analytics_filter_operator_MAIN

void test_ads_analytics_filter_operator(int include_optional) {
    ads_analytics_filter_operator_t* ads_analytics_filter_operator_1 = instantiate_ads_analytics_filter_operator(include_optional);

	cJSON* jsonads_analytics_filter_operator_1 = ads_analytics_filter_operator_convertToJSON(ads_analytics_filter_operator_1);
	printf("ads_analytics_filter_operator :\n%s\n", cJSON_Print(jsonads_analytics_filter_operator_1));
	ads_analytics_filter_operator_t* ads_analytics_filter_operator_2 = ads_analytics_filter_operator_parseFromJSON(jsonads_analytics_filter_operator_1);
	cJSON* jsonads_analytics_filter_operator_2 = ads_analytics_filter_operator_convertToJSON(ads_analytics_filter_operator_2);
	printf("repeating ads_analytics_filter_operator:\n%s\n", cJSON_Print(jsonads_analytics_filter_operator_2));
}

int main() {
  test_ads_analytics_filter_operator(1);
  test_ads_analytics_filter_operator(0);

  printf("Hello world \n");
  return 0;
}

#endif // ads_analytics_filter_operator_MAIN
#endif // ads_analytics_filter_operator_TEST
