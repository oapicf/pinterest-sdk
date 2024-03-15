#ifndef campaign_id_TEST
#define campaign_id_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define campaign_id_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/campaign_id.h"
campaign_id_t* instantiate_campaign_id(int include_optional);



campaign_id_t* instantiate_campaign_id(int include_optional) {
  campaign_id_t* campaign_id = NULL;
  if (include_optional) {
    campaign_id = campaign_id_create(
      "549755885175"
    );
  } else {
    campaign_id = campaign_id_create(
      "549755885175"
    );
  }

  return campaign_id;
}


#ifdef campaign_id_MAIN

void test_campaign_id(int include_optional) {
    campaign_id_t* campaign_id_1 = instantiate_campaign_id(include_optional);

	cJSON* jsoncampaign_id_1 = campaign_id_convertToJSON(campaign_id_1);
	printf("campaign_id :\n%s\n", cJSON_Print(jsoncampaign_id_1));
	campaign_id_t* campaign_id_2 = campaign_id_parseFromJSON(jsoncampaign_id_1);
	cJSON* jsoncampaign_id_2 = campaign_id_convertToJSON(campaign_id_2);
	printf("repeating campaign_id:\n%s\n", cJSON_Print(jsoncampaign_id_2));
}

int main() {
  test_campaign_id(1);
  test_campaign_id(0);

  printf("Hello world \n");
  return 0;
}

#endif // campaign_id_MAIN
#endif // campaign_id_TEST
