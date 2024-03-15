#ifndef ads_analytics_filter_column_TEST
#define ads_analytics_filter_column_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ads_analytics_filter_column_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ads_analytics_filter_column.h"
ads_analytics_filter_column_t* instantiate_ads_analytics_filter_column(int include_optional);



ads_analytics_filter_column_t* instantiate_ads_analytics_filter_column(int include_optional) {
  ads_analytics_filter_column_t* ads_analytics_filter_column = NULL;
  if (include_optional) {
    ads_analytics_filter_column = ads_analytics_filter_column_create(
    );
  } else {
    ads_analytics_filter_column = ads_analytics_filter_column_create(
    );
  }

  return ads_analytics_filter_column;
}


#ifdef ads_analytics_filter_column_MAIN

void test_ads_analytics_filter_column(int include_optional) {
    ads_analytics_filter_column_t* ads_analytics_filter_column_1 = instantiate_ads_analytics_filter_column(include_optional);

	cJSON* jsonads_analytics_filter_column_1 = ads_analytics_filter_column_convertToJSON(ads_analytics_filter_column_1);
	printf("ads_analytics_filter_column :\n%s\n", cJSON_Print(jsonads_analytics_filter_column_1));
	ads_analytics_filter_column_t* ads_analytics_filter_column_2 = ads_analytics_filter_column_parseFromJSON(jsonads_analytics_filter_column_1);
	cJSON* jsonads_analytics_filter_column_2 = ads_analytics_filter_column_convertToJSON(ads_analytics_filter_column_2);
	printf("repeating ads_analytics_filter_column:\n%s\n", cJSON_Print(jsonads_analytics_filter_column_2));
}

int main() {
  test_ads_analytics_filter_column(1);
  test_ads_analytics_filter_column(0);

  printf("Hello world \n");
  return 0;
}

#endif // ads_analytics_filter_column_MAIN
#endif // ads_analytics_filter_column_TEST
