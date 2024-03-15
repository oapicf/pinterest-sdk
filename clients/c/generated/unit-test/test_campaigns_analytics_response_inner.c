#ifndef campaigns_analytics_response_inner_TEST
#define campaigns_analytics_response_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define campaigns_analytics_response_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/campaigns_analytics_response_inner.h"
campaigns_analytics_response_inner_t* instantiate_campaigns_analytics_response_inner(int include_optional);



campaigns_analytics_response_inner_t* instantiate_campaigns_analytics_response_inner(int include_optional) {
  campaigns_analytics_response_inner_t* campaigns_analytics_response_inner = NULL;
  if (include_optional) {
    campaigns_analytics_response_inner = campaigns_analytics_response_inner_create(
      "a",
      "2013-10-20"
    );
  } else {
    campaigns_analytics_response_inner = campaigns_analytics_response_inner_create(
      "a",
      "2013-10-20"
    );
  }

  return campaigns_analytics_response_inner;
}


#ifdef campaigns_analytics_response_inner_MAIN

void test_campaigns_analytics_response_inner(int include_optional) {
    campaigns_analytics_response_inner_t* campaigns_analytics_response_inner_1 = instantiate_campaigns_analytics_response_inner(include_optional);

	cJSON* jsoncampaigns_analytics_response_inner_1 = campaigns_analytics_response_inner_convertToJSON(campaigns_analytics_response_inner_1);
	printf("campaigns_analytics_response_inner :\n%s\n", cJSON_Print(jsoncampaigns_analytics_response_inner_1));
	campaigns_analytics_response_inner_t* campaigns_analytics_response_inner_2 = campaigns_analytics_response_inner_parseFromJSON(jsoncampaigns_analytics_response_inner_1);
	cJSON* jsoncampaigns_analytics_response_inner_2 = campaigns_analytics_response_inner_convertToJSON(campaigns_analytics_response_inner_2);
	printf("repeating campaigns_analytics_response_inner:\n%s\n", cJSON_Print(jsoncampaigns_analytics_response_inner_2));
}

int main() {
  test_campaigns_analytics_response_inner(1);
  test_campaigns_analytics_response_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // campaigns_analytics_response_inner_MAIN
#endif // campaigns_analytics_response_inner_TEST
