#ifndef campaign_objectives_filter_TEST
#define campaign_objectives_filter_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define campaign_objectives_filter_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/campaign_objectives_filter.h"
campaign_objectives_filter_t* instantiate_campaign_objectives_filter(int include_optional);



campaign_objectives_filter_t* instantiate_campaign_objectives_filter(int include_optional) {
  campaign_objectives_filter_t* campaign_objectives_filter = NULL;
  if (include_optional) {
    campaign_objectives_filter = campaign_objectives_filter_create(
      ["AWARENESS"]
    );
  } else {
    campaign_objectives_filter = campaign_objectives_filter_create(
      ["AWARENESS"]
    );
  }

  return campaign_objectives_filter;
}


#ifdef campaign_objectives_filter_MAIN

void test_campaign_objectives_filter(int include_optional) {
    campaign_objectives_filter_t* campaign_objectives_filter_1 = instantiate_campaign_objectives_filter(include_optional);

	cJSON* jsoncampaign_objectives_filter_1 = campaign_objectives_filter_convertToJSON(campaign_objectives_filter_1);
	printf("campaign_objectives_filter :\n%s\n", cJSON_Print(jsoncampaign_objectives_filter_1));
	campaign_objectives_filter_t* campaign_objectives_filter_2 = campaign_objectives_filter_parseFromJSON(jsoncampaign_objectives_filter_1);
	cJSON* jsoncampaign_objectives_filter_2 = campaign_objectives_filter_convertToJSON(campaign_objectives_filter_2);
	printf("repeating campaign_objectives_filter:\n%s\n", cJSON_Print(jsoncampaign_objectives_filter_2));
}

int main() {
  test_campaign_objectives_filter(1);
  test_campaign_objectives_filter(0);

  printf("Hello world \n");
  return 0;
}

#endif // campaign_objectives_filter_MAIN
#endif // campaign_objectives_filter_TEST
