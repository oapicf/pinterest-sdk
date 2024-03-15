#ifndef campaign_common_TEST
#define campaign_common_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define campaign_common_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/campaign_common.h"
campaign_common_t* instantiate_campaign_common(int include_optional);

#include "test_ad_common_tracking_urls.c"


campaign_common_t* instantiate_campaign_common(int include_optional) {
  campaign_common_t* campaign_common = NULL;
  if (include_optional) {
    campaign_common = campaign_common_create(
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
      "RUNNING"
    );
  } else {
    campaign_common = campaign_common_create(
      "549755885175",
      "ACME Tools",
      "ACTIVE",
      1432744744,
      1432744744,
      "549755885175",
      NULL,
      1580865126,
      1644023526,
      "RUNNING"
    );
  }

  return campaign_common;
}


#ifdef campaign_common_MAIN

void test_campaign_common(int include_optional) {
    campaign_common_t* campaign_common_1 = instantiate_campaign_common(include_optional);

	cJSON* jsoncampaign_common_1 = campaign_common_convertToJSON(campaign_common_1);
	printf("campaign_common :\n%s\n", cJSON_Print(jsoncampaign_common_1));
	campaign_common_t* campaign_common_2 = campaign_common_parseFromJSON(jsoncampaign_common_1);
	cJSON* jsoncampaign_common_2 = campaign_common_convertToJSON(campaign_common_2);
	printf("repeating campaign_common:\n%s\n", cJSON_Print(jsoncampaign_common_2));
}

int main() {
  test_campaign_common(1);
  test_campaign_common(0);

  printf("Hello world \n");
  return 0;
}

#endif // campaign_common_MAIN
#endif // campaign_common_TEST
