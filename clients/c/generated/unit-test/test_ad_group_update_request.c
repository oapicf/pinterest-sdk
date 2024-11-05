#ifndef ad_group_update_request_TEST
#define ad_group_update_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ad_group_update_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ad_group_update_request.h"
ad_group_update_request_t* instantiate_ad_group_update_request(int include_optional);

#include "test_optimization_goal_metadata.c"
#include "test_targeting_spec.c"
#include "test_tracking_urls.c"


ad_group_update_request_t* instantiate_ad_group_update_request(int include_optional) {
  ad_group_update_request_t* ad_group_update_request = NULL;
  if (include_optional) {
    ad_group_update_request = ad_group_update_request_create(
      "Ad Group For Pin: 687195905986",
      "ACTIVE",
      5000000,
      5000000,
       // false, not to have infinite recursion
      instantiate_optimization_goal_metadata(0),
      "DAILY",
      5686848000,
      5705424000,
       // false, not to have infinite recursion
      instantiate_targeting_spec(0),
      100,
      {"impression":["URL1","URL2"],"click":["URL1","URL2"],"engagement":["URL1","URL2"],"buyable_button":["URL1","URL2"],"audience_verification":["URL1","URL2"]},
      true,
      "ALL",
      "STANDARD",
      "626736533506",
      pinterest_rest_api_ad_group_update_request__"CLICKTHROUGH",
      pinterest_rest_api_ad_group_update_request_BIDSTRATEGYTYPE_"MAX_BID",
      list_createList(),
      "2680060704746"
    );
  } else {
    ad_group_update_request = ad_group_update_request_create(
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
      {"impression":["URL1","URL2"],"click":["URL1","URL2"],"engagement":["URL1","URL2"],"buyable_button":["URL1","URL2"],"audience_verification":["URL1","URL2"]},
      true,
      "ALL",
      "STANDARD",
      "626736533506",
      pinterest_rest_api_ad_group_update_request__"CLICKTHROUGH",
      pinterest_rest_api_ad_group_update_request_BIDSTRATEGYTYPE_"MAX_BID",
      list_createList(),
      "2680060704746"
    );
  }

  return ad_group_update_request;
}


#ifdef ad_group_update_request_MAIN

void test_ad_group_update_request(int include_optional) {
    ad_group_update_request_t* ad_group_update_request_1 = instantiate_ad_group_update_request(include_optional);

	cJSON* jsonad_group_update_request_1 = ad_group_update_request_convertToJSON(ad_group_update_request_1);
	printf("ad_group_update_request :\n%s\n", cJSON_Print(jsonad_group_update_request_1));
	ad_group_update_request_t* ad_group_update_request_2 = ad_group_update_request_parseFromJSON(jsonad_group_update_request_1);
	cJSON* jsonad_group_update_request_2 = ad_group_update_request_convertToJSON(ad_group_update_request_2);
	printf("repeating ad_group_update_request:\n%s\n", cJSON_Print(jsonad_group_update_request_2));
}

int main() {
  test_ad_group_update_request(1);
  test_ad_group_update_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // ad_group_update_request_MAIN
#endif // ad_group_update_request_TEST
