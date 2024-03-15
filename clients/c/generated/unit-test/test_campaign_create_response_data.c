#ifndef campaign_create_response_data_TEST
#define campaign_create_response_data_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define campaign_create_response_data_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/campaign_create_response_data.h"
campaign_create_response_data_t* instantiate_campaign_create_response_data(int include_optional);

#include "test_ad_common_tracking_urls.c"


campaign_create_response_data_t* instantiate_campaign_create_response_data(int include_optional) {
  campaign_create_response_data_t* campaign_create_response_data = NULL;
  if (include_optional) {
    campaign_create_response_data = campaign_create_response_data_create(
      "549755885175",
      "ACME Tools",
      "ACTIVE",
      1432744744,
      1432744744,
      "549755885175",
       // false, not to have infinite recursion
      instantiate_ad_common_tracking_urls(0),
      1580865126,
      1644023526,
      "RUNNING",
      true,
      0,
      true,
      "549755885175",
      pinterest_rest_api_campaign_create_response_data__AWARENESS,
      1432744744,
      1432744744,
      "campaign",
      true
    );
  } else {
    campaign_create_response_data = campaign_create_response_data_create(
      "549755885175",
      "ACME Tools",
      "ACTIVE",
      1432744744,
      1432744744,
      "549755885175",
      NULL,
      1580865126,
      1644023526,
      "RUNNING",
      true,
      0,
      true,
      "549755885175",
      pinterest_rest_api_campaign_create_response_data__AWARENESS,
      1432744744,
      1432744744,
      "campaign",
      true
    );
  }

  return campaign_create_response_data;
}


#ifdef campaign_create_response_data_MAIN

void test_campaign_create_response_data(int include_optional) {
    campaign_create_response_data_t* campaign_create_response_data_1 = instantiate_campaign_create_response_data(include_optional);

	cJSON* jsoncampaign_create_response_data_1 = campaign_create_response_data_convertToJSON(campaign_create_response_data_1);
	printf("campaign_create_response_data :\n%s\n", cJSON_Print(jsoncampaign_create_response_data_1));
	campaign_create_response_data_t* campaign_create_response_data_2 = campaign_create_response_data_parseFromJSON(jsoncampaign_create_response_data_1);
	cJSON* jsoncampaign_create_response_data_2 = campaign_create_response_data_convertToJSON(campaign_create_response_data_2);
	printf("repeating campaign_create_response_data:\n%s\n", cJSON_Print(jsoncampaign_create_response_data_2));
}

int main() {
  test_campaign_create_response_data(1);
  test_campaign_create_response_data(0);

  printf("Hello world \n");
  return 0;
}

#endif // campaign_create_response_data_MAIN
#endif // campaign_create_response_data_TEST
