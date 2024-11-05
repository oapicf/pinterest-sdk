#ifndef campaign_create_common_TEST
#define campaign_create_common_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define campaign_create_common_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/campaign_create_common.h"
campaign_create_common_t* instantiate_campaign_create_common(int include_optional);

#include "test_tracking_urls.c"


campaign_create_common_t* instantiate_campaign_create_common(int include_optional) {
  campaign_create_common_t* campaign_create_common = NULL;
  if (include_optional) {
    campaign_create_common = campaign_create_common_create(
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
      true
    );
  } else {
    campaign_create_common = campaign_create_common_create(
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
      true
    );
  }

  return campaign_create_common;
}


#ifdef campaign_create_common_MAIN

void test_campaign_create_common(int include_optional) {
    campaign_create_common_t* campaign_create_common_1 = instantiate_campaign_create_common(include_optional);

	cJSON* jsoncampaign_create_common_1 = campaign_create_common_convertToJSON(campaign_create_common_1);
	printf("campaign_create_common :\n%s\n", cJSON_Print(jsoncampaign_create_common_1));
	campaign_create_common_t* campaign_create_common_2 = campaign_create_common_parseFromJSON(jsoncampaign_create_common_1);
	cJSON* jsoncampaign_create_common_2 = campaign_create_common_convertToJSON(campaign_create_common_2);
	printf("repeating campaign_create_common:\n%s\n", cJSON_Print(jsoncampaign_create_common_2));
}

int main() {
  test_campaign_create_common(1);
  test_campaign_create_common(0);

  printf("Hello world \n");
  return 0;
}

#endif // campaign_create_common_MAIN
#endif // campaign_create_common_TEST
