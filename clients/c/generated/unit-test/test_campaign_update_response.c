#ifndef campaign_update_response_TEST
#define campaign_update_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define campaign_update_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/campaign_update_response.h"
campaign_update_response_t* instantiate_campaign_update_response(int include_optional);



campaign_update_response_t* instantiate_campaign_update_response(int include_optional) {
  campaign_update_response_t* campaign_update_response = NULL;
  if (include_optional) {
    campaign_update_response = campaign_update_response_create(
      list_createList()
    );
  } else {
    campaign_update_response = campaign_update_response_create(
      list_createList()
    );
  }

  return campaign_update_response;
}


#ifdef campaign_update_response_MAIN

void test_campaign_update_response(int include_optional) {
    campaign_update_response_t* campaign_update_response_1 = instantiate_campaign_update_response(include_optional);

	cJSON* jsoncampaign_update_response_1 = campaign_update_response_convertToJSON(campaign_update_response_1);
	printf("campaign_update_response :\n%s\n", cJSON_Print(jsoncampaign_update_response_1));
	campaign_update_response_t* campaign_update_response_2 = campaign_update_response_parseFromJSON(jsoncampaign_update_response_1);
	cJSON* jsoncampaign_update_response_2 = campaign_update_response_convertToJSON(campaign_update_response_2);
	printf("repeating campaign_update_response:\n%s\n", cJSON_Print(jsoncampaign_update_response_2));
}

int main() {
  test_campaign_update_response(1);
  test_campaign_update_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // campaign_update_response_MAIN
#endif // campaign_update_response_TEST
