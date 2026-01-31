#ifndef campaign_audience_multipliers_TEST
#define campaign_audience_multipliers_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define campaign_audience_multipliers_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/campaign_audience_multipliers.h"
campaign_audience_multipliers_t* instantiate_campaign_audience_multipliers(int include_optional);



campaign_audience_multipliers_t* instantiate_campaign_audience_multipliers(int include_optional) {
  campaign_audience_multipliers_t* campaign_audience_multipliers = NULL;
  if (include_optional) {
    campaign_audience_multipliers = campaign_audience_multipliers_create(
      "a"
    );
  } else {
    campaign_audience_multipliers = campaign_audience_multipliers_create(
      "a"
    );
  }

  return campaign_audience_multipliers;
}


#ifdef campaign_audience_multipliers_MAIN

void test_campaign_audience_multipliers(int include_optional) {
    campaign_audience_multipliers_t* campaign_audience_multipliers_1 = instantiate_campaign_audience_multipliers(include_optional);

	cJSON* jsoncampaign_audience_multipliers_1 = campaign_audience_multipliers_convertToJSON(campaign_audience_multipliers_1);
	printf("campaign_audience_multipliers :\n%s\n", cJSON_Print(jsoncampaign_audience_multipliers_1));
	campaign_audience_multipliers_t* campaign_audience_multipliers_2 = campaign_audience_multipliers_parseFromJSON(jsoncampaign_audience_multipliers_1);
	cJSON* jsoncampaign_audience_multipliers_2 = campaign_audience_multipliers_convertToJSON(campaign_audience_multipliers_2);
	printf("repeating campaign_audience_multipliers:\n%s\n", cJSON_Print(jsoncampaign_audience_multipliers_2));
}

int main() {
  test_campaign_audience_multipliers(1);
  test_campaign_audience_multipliers(0);

  printf("Hello world \n");
  return 0;
}

#endif // campaign_audience_multipliers_MAIN
#endif // campaign_audience_multipliers_TEST
