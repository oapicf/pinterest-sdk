#ifndef campaign_create_request_TEST
#define campaign_create_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define campaign_create_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/campaign_create_request.h"
campaign_create_request_t* instantiate_campaign_create_request(int include_optional);

#include "test_tracking_urls.c"


campaign_create_request_t* instantiate_campaign_create_request(int include_optional) {
  campaign_create_request_t* campaign_create_request = NULL;
  if (include_optional) {
    campaign_create_request = campaign_create_request_create(
      "549755885175",
      "ACME Tools",
      "ACTIVE",
      1432744744,
      1432744744,
      "549755885175",
      {"impression":["URL1","URL2"],"click":["URL1","URL2"],"engagement":["URL1","URL2"],"buyable_button":["URL1","URL2"],"audience_verification":["URL1","URL2"]},
      1580865126,
      1644023526,
      true,
      0,
      true,
      pinterest_rest_api_campaign_create_request__AWARENESS
    );
  } else {
    campaign_create_request = campaign_create_request_create(
      "549755885175",
      "ACME Tools",
      "ACTIVE",
      1432744744,
      1432744744,
      "549755885175",
      {"impression":["URL1","URL2"],"click":["URL1","URL2"],"engagement":["URL1","URL2"],"buyable_button":["URL1","URL2"],"audience_verification":["URL1","URL2"]},
      1580865126,
      1644023526,
      true,
      0,
      true,
      pinterest_rest_api_campaign_create_request__AWARENESS
    );
  }

  return campaign_create_request;
}


#ifdef campaign_create_request_MAIN

void test_campaign_create_request(int include_optional) {
    campaign_create_request_t* campaign_create_request_1 = instantiate_campaign_create_request(include_optional);

	cJSON* jsoncampaign_create_request_1 = campaign_create_request_convertToJSON(campaign_create_request_1);
	printf("campaign_create_request :\n%s\n", cJSON_Print(jsoncampaign_create_request_1));
	campaign_create_request_t* campaign_create_request_2 = campaign_create_request_parseFromJSON(jsoncampaign_create_request_1);
	cJSON* jsoncampaign_create_request_2 = campaign_create_request_convertToJSON(campaign_create_request_2);
	printf("repeating campaign_create_request:\n%s\n", cJSON_Print(jsoncampaign_create_request_2));
}

int main() {
  test_campaign_create_request(1);
  test_campaign_create_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // campaign_create_request_MAIN
#endif // campaign_create_request_TEST
