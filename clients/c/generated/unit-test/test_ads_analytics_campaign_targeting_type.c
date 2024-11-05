#ifndef ads_analytics_campaign_targeting_type_TEST
#define ads_analytics_campaign_targeting_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ads_analytics_campaign_targeting_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ads_analytics_campaign_targeting_type.h"
ads_analytics_campaign_targeting_type_t* instantiate_ads_analytics_campaign_targeting_type(int include_optional);



ads_analytics_campaign_targeting_type_t* instantiate_ads_analytics_campaign_targeting_type(int include_optional) {
  ads_analytics_campaign_targeting_type_t* ads_analytics_campaign_targeting_type = NULL;
  if (include_optional) {
    ads_analytics_campaign_targeting_type = ads_analytics_campaign_targeting_type_create(
    );
  } else {
    ads_analytics_campaign_targeting_type = ads_analytics_campaign_targeting_type_create(
    );
  }

  return ads_analytics_campaign_targeting_type;
}


#ifdef ads_analytics_campaign_targeting_type_MAIN

void test_ads_analytics_campaign_targeting_type(int include_optional) {
    ads_analytics_campaign_targeting_type_t* ads_analytics_campaign_targeting_type_1 = instantiate_ads_analytics_campaign_targeting_type(include_optional);

	cJSON* jsonads_analytics_campaign_targeting_type_1 = ads_analytics_campaign_targeting_type_convertToJSON(ads_analytics_campaign_targeting_type_1);
	printf("ads_analytics_campaign_targeting_type :\n%s\n", cJSON_Print(jsonads_analytics_campaign_targeting_type_1));
	ads_analytics_campaign_targeting_type_t* ads_analytics_campaign_targeting_type_2 = ads_analytics_campaign_targeting_type_parseFromJSON(jsonads_analytics_campaign_targeting_type_1);
	cJSON* jsonads_analytics_campaign_targeting_type_2 = ads_analytics_campaign_targeting_type_convertToJSON(ads_analytics_campaign_targeting_type_2);
	printf("repeating ads_analytics_campaign_targeting_type:\n%s\n", cJSON_Print(jsonads_analytics_campaign_targeting_type_2));
}

int main() {
  test_ads_analytics_campaign_targeting_type(1);
  test_ads_analytics_campaign_targeting_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // ads_analytics_campaign_targeting_type_MAIN
#endif // ads_analytics_campaign_targeting_type_TEST
