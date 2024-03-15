#ifndef ad_group_response_TEST
#define ad_group_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ad_group_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ad_group_response.h"
ad_group_response_t* instantiate_ad_group_response(int include_optional);

#include "test_ad_group_common_optimization_goal_metadata.c"
#include "test_targeting_spec.c"
#include "test_ad_group_common_tracking_urls.c"


ad_group_response_t* instantiate_ad_group_response(int include_optional) {
  ad_group_response_t* ad_group_response = NULL;
  if (include_optional) {
    ad_group_response = ad_group_response_create(
      "Ad Group For Pin: 687195905986",
      "ACTIVE",
      5000000,
      5000000,
       // false, not to have infinite recursion
      instantiate_ad_group_common_optimization_goal_metadata(0),
      "DAILY",
      5686848000,
      5705424000,
       // false, not to have infinite recursion
      instantiate_targeting_spec(0),
      100,
       // false, not to have infinite recursion
      instantiate_ad_group_common_tracking_urls(0),
      true,
      "ALL",
      "STANDARD",
      "626736533506",
      pinterest_rest_api_ad_group_response__"CLICKTHROUGH",
      pinterest_rest_api_ad_group_response_BIDSTRATEGYTYPE_"MAX_BID",
      "2680060704746",
      "549755885175",
      1476477189,
      1476477189,
      "adgroup",
      pinterest_rest_api_ad_group_response_CONVERSIONLEARNINGMODETYPE_"ACTIVE",
      "RUNNING",
      "626736533506",
      null
    );
  } else {
    ad_group_response = ad_group_response_create(
      "Ad Group For Pin: 687195905986",
      "ACTIVE",
      5000000,
      5000000,
      NULL,
      "DAILY",
      5686848000,
      5705424000,
      NULL,
      100,
      NULL,
      true,
      "ALL",
      "STANDARD",
      "626736533506",
      pinterest_rest_api_ad_group_response__"CLICKTHROUGH",
      pinterest_rest_api_ad_group_response_BIDSTRATEGYTYPE_"MAX_BID",
      "2680060704746",
      "549755885175",
      1476477189,
      1476477189,
      "adgroup",
      pinterest_rest_api_ad_group_response_CONVERSIONLEARNINGMODETYPE_"ACTIVE",
      "RUNNING",
      "626736533506",
      null
    );
  }

  return ad_group_response;
}


#ifdef ad_group_response_MAIN

void test_ad_group_response(int include_optional) {
    ad_group_response_t* ad_group_response_1 = instantiate_ad_group_response(include_optional);

	cJSON* jsonad_group_response_1 = ad_group_response_convertToJSON(ad_group_response_1);
	printf("ad_group_response :\n%s\n", cJSON_Print(jsonad_group_response_1));
	ad_group_response_t* ad_group_response_2 = ad_group_response_parseFromJSON(jsonad_group_response_1);
	cJSON* jsonad_group_response_2 = ad_group_response_convertToJSON(ad_group_response_2);
	printf("repeating ad_group_response:\n%s\n", cJSON_Print(jsonad_group_response_2));
}

int main() {
  test_ad_group_response(1);
  test_ad_group_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // ad_group_response_MAIN
#endif // ad_group_response_TEST
