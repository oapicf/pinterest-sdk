#ifndef campaign_id_filter_TEST
#define campaign_id_filter_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define campaign_id_filter_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/campaign_id_filter.h"
campaign_id_filter_t* instantiate_campaign_id_filter(int include_optional);



campaign_id_filter_t* instantiate_campaign_id_filter(int include_optional) {
  campaign_id_filter_t* campaign_id_filter = NULL;
  if (include_optional) {
    campaign_id_filter = campaign_id_filter_create(
      ["12345678"]
    );
  } else {
    campaign_id_filter = campaign_id_filter_create(
      ["12345678"]
    );
  }

  return campaign_id_filter;
}


#ifdef campaign_id_filter_MAIN

void test_campaign_id_filter(int include_optional) {
    campaign_id_filter_t* campaign_id_filter_1 = instantiate_campaign_id_filter(include_optional);

	cJSON* jsoncampaign_id_filter_1 = campaign_id_filter_convertToJSON(campaign_id_filter_1);
	printf("campaign_id_filter :\n%s\n", cJSON_Print(jsoncampaign_id_filter_1));
	campaign_id_filter_t* campaign_id_filter_2 = campaign_id_filter_parseFromJSON(jsoncampaign_id_filter_1);
	cJSON* jsoncampaign_id_filter_2 = campaign_id_filter_convertToJSON(campaign_id_filter_2);
	printf("repeating campaign_id_filter:\n%s\n", cJSON_Print(jsoncampaign_id_filter_2));
}

int main() {
  test_campaign_id_filter(1);
  test_campaign_id_filter(0);

  printf("Hello world \n");
  return 0;
}

#endif // campaign_id_filter_MAIN
#endif // campaign_id_filter_TEST
