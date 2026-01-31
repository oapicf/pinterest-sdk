#ifndef campaign_response_TEST
#define campaign_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define campaign_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/campaign_response.h"
campaign_response_t* instantiate_campaign_response(int include_optional);

#include "test_tracking_urls.c"
#include "test_campaign_bid_options.c"


campaign_response_t* instantiate_campaign_response(int include_optional) {
  campaign_response_t* campaign_response = NULL;
  if (include_optional) {
    campaign_response = campaign_response_create(
      "549755885175",
      "549755885175",
      1432744744,
      1644023526,
      true,
      true,
      1432744744,
      "ACME Tools",
      "549755885175",
      1580865126,
      "ACTIVE",
      {"impression":["URL1","URL2"],"click":["URL1","URL2"],"engagement":["URL1","URL2"],"buyable_button":["URL1","URL2"],"audience_verification":["URL1","URL2"]},
       // false, not to have infinite recursion
      instantiate_campaign_bid_options(0),
      1432744744,
      true,
      true,
      pinterest_rest_api_campaign_response__AWARENESS,
      pinterest_rest_api_campaign_response__"RUNNING",
      "campaign",
      1432744744
    );
  } else {
    campaign_response = campaign_response_create(
      "549755885175",
      "549755885175",
      1432744744,
      1644023526,
      true,
      true,
      1432744744,
      "ACME Tools",
      "549755885175",
      1580865126,
      "ACTIVE",
      {"impression":["URL1","URL2"],"click":["URL1","URL2"],"engagement":["URL1","URL2"],"buyable_button":["URL1","URL2"],"audience_verification":["URL1","URL2"]},
      NULL,
      1432744744,
      true,
      true,
      pinterest_rest_api_campaign_response__AWARENESS,
      pinterest_rest_api_campaign_response__"RUNNING",
      "campaign",
      1432744744
    );
  }

  return campaign_response;
}


#ifdef campaign_response_MAIN

void test_campaign_response(int include_optional) {
    campaign_response_t* campaign_response_1 = instantiate_campaign_response(include_optional);

	cJSON* jsoncampaign_response_1 = campaign_response_convertToJSON(campaign_response_1);
	printf("campaign_response :\n%s\n", cJSON_Print(jsoncampaign_response_1));
	campaign_response_t* campaign_response_2 = campaign_response_parseFromJSON(jsoncampaign_response_1);
	cJSON* jsoncampaign_response_2 = campaign_response_convertToJSON(campaign_response_2);
	printf("repeating campaign_response:\n%s\n", cJSON_Print(jsoncampaign_response_2));
}

int main() {
  test_campaign_response(1);
  test_campaign_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // campaign_response_MAIN
#endif // campaign_response_TEST
