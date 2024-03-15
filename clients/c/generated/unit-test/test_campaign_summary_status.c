#ifndef campaign_summary_status_TEST
#define campaign_summary_status_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define campaign_summary_status_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/campaign_summary_status.h"
campaign_summary_status_t* instantiate_campaign_summary_status(int include_optional);



campaign_summary_status_t* instantiate_campaign_summary_status(int include_optional) {
  campaign_summary_status_t* campaign_summary_status = NULL;
  if (include_optional) {
    campaign_summary_status = campaign_summary_status_create(
    );
  } else {
    campaign_summary_status = campaign_summary_status_create(
    );
  }

  return campaign_summary_status;
}


#ifdef campaign_summary_status_MAIN

void test_campaign_summary_status(int include_optional) {
    campaign_summary_status_t* campaign_summary_status_1 = instantiate_campaign_summary_status(include_optional);

	cJSON* jsoncampaign_summary_status_1 = campaign_summary_status_convertToJSON(campaign_summary_status_1);
	printf("campaign_summary_status :\n%s\n", cJSON_Print(jsoncampaign_summary_status_1));
	campaign_summary_status_t* campaign_summary_status_2 = campaign_summary_status_parseFromJSON(jsoncampaign_summary_status_1);
	cJSON* jsoncampaign_summary_status_2 = campaign_summary_status_convertToJSON(campaign_summary_status_2);
	printf("repeating campaign_summary_status:\n%s\n", cJSON_Print(jsoncampaign_summary_status_2));
}

int main() {
  test_campaign_summary_status(1);
  test_campaign_summary_status(0);

  printf("Hello world \n");
  return 0;
}

#endif // campaign_summary_status_MAIN
#endif // campaign_summary_status_TEST
