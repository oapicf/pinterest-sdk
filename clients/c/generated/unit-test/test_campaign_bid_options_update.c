#ifndef campaign_bid_options_update_TEST
#define campaign_bid_options_update_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define campaign_bid_options_update_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/campaign_bid_options_update.h"
campaign_bid_options_update_t* instantiate_campaign_bid_options_update(int include_optional);



campaign_bid_options_update_t* instantiate_campaign_bid_options_update(int include_optional) {
  campaign_bid_options_update_t* campaign_bid_options_update = NULL;
  if (include_optional) {
    campaign_bid_options_update = campaign_bid_options_update_create(
      {"android_mobile":1.1,"android_tablet":1.1,"ipad":1.2,"iphone":1.2,"web":0.9,"web_mobile":0.8},
      {"123":1.1,"456":1.2},
      {"browse":0.9,"search":1.2,"related_pins":1.1},
      list_createList()
    );
  } else {
    campaign_bid_options_update = campaign_bid_options_update_create(
      {"android_mobile":1.1,"android_tablet":1.1,"ipad":1.2,"iphone":1.2,"web":0.9,"web_mobile":0.8},
      {"123":1.1,"456":1.2},
      {"browse":0.9,"search":1.2,"related_pins":1.1},
      list_createList()
    );
  }

  return campaign_bid_options_update;
}


#ifdef campaign_bid_options_update_MAIN

void test_campaign_bid_options_update(int include_optional) {
    campaign_bid_options_update_t* campaign_bid_options_update_1 = instantiate_campaign_bid_options_update(include_optional);

	cJSON* jsoncampaign_bid_options_update_1 = campaign_bid_options_update_convertToJSON(campaign_bid_options_update_1);
	printf("campaign_bid_options_update :\n%s\n", cJSON_Print(jsoncampaign_bid_options_update_1));
	campaign_bid_options_update_t* campaign_bid_options_update_2 = campaign_bid_options_update_parseFromJSON(jsoncampaign_bid_options_update_1);
	cJSON* jsoncampaign_bid_options_update_2 = campaign_bid_options_update_convertToJSON(campaign_bid_options_update_2);
	printf("repeating campaign_bid_options_update:\n%s\n", cJSON_Print(jsoncampaign_bid_options_update_2));
}

int main() {
  test_campaign_bid_options_update(1);
  test_campaign_bid_options_update(0);

  printf("Hello world \n");
  return 0;
}

#endif // campaign_bid_options_update_MAIN
#endif // campaign_bid_options_update_TEST
