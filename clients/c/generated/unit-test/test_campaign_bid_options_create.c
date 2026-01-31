#ifndef campaign_bid_options_create_TEST
#define campaign_bid_options_create_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define campaign_bid_options_create_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/campaign_bid_options_create.h"
campaign_bid_options_create_t* instantiate_campaign_bid_options_create(int include_optional);



campaign_bid_options_create_t* instantiate_campaign_bid_options_create(int include_optional) {
  campaign_bid_options_create_t* campaign_bid_options_create = NULL;
  if (include_optional) {
    campaign_bid_options_create = campaign_bid_options_create_create(
      {"android_mobile":1.1,"android_tablet":1.1,"ipad":1.2,"iphone":1.2,"web":0.9,"web_mobile":0.8},
      {"123":1.1,"456":1.2},
      {"browse":0.9,"search":1.2,"related_pins":1.1}
    );
  } else {
    campaign_bid_options_create = campaign_bid_options_create_create(
      {"android_mobile":1.1,"android_tablet":1.1,"ipad":1.2,"iphone":1.2,"web":0.9,"web_mobile":0.8},
      {"123":1.1,"456":1.2},
      {"browse":0.9,"search":1.2,"related_pins":1.1}
    );
  }

  return campaign_bid_options_create;
}


#ifdef campaign_bid_options_create_MAIN

void test_campaign_bid_options_create(int include_optional) {
    campaign_bid_options_create_t* campaign_bid_options_create_1 = instantiate_campaign_bid_options_create(include_optional);

	cJSON* jsoncampaign_bid_options_create_1 = campaign_bid_options_create_convertToJSON(campaign_bid_options_create_1);
	printf("campaign_bid_options_create :\n%s\n", cJSON_Print(jsoncampaign_bid_options_create_1));
	campaign_bid_options_create_t* campaign_bid_options_create_2 = campaign_bid_options_create_parseFromJSON(jsoncampaign_bid_options_create_1);
	cJSON* jsoncampaign_bid_options_create_2 = campaign_bid_options_create_convertToJSON(campaign_bid_options_create_2);
	printf("repeating campaign_bid_options_create:\n%s\n", cJSON_Print(jsoncampaign_bid_options_create_2));
}

int main() {
  test_campaign_bid_options_create(1);
  test_campaign_bid_options_create(0);

  printf("Hello world \n");
  return 0;
}

#endif // campaign_bid_options_create_MAIN
#endif // campaign_bid_options_create_TEST
