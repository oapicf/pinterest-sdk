#ifndef campaign_create_response_TEST
#define campaign_create_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define campaign_create_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/campaign_create_response.h"
campaign_create_response_t* instantiate_campaign_create_response(int include_optional);



campaign_create_response_t* instantiate_campaign_create_response(int include_optional) {
  campaign_create_response_t* campaign_create_response = NULL;
  if (include_optional) {
    campaign_create_response = campaign_create_response_create(
      list_createList()
    );
  } else {
    campaign_create_response = campaign_create_response_create(
      list_createList()
    );
  }

  return campaign_create_response;
}


#ifdef campaign_create_response_MAIN

void test_campaign_create_response(int include_optional) {
    campaign_create_response_t* campaign_create_response_1 = instantiate_campaign_create_response(include_optional);

	cJSON* jsoncampaign_create_response_1 = campaign_create_response_convertToJSON(campaign_create_response_1);
	printf("campaign_create_response :\n%s\n", cJSON_Print(jsoncampaign_create_response_1));
	campaign_create_response_t* campaign_create_response_2 = campaign_create_response_parseFromJSON(jsoncampaign_create_response_1);
	cJSON* jsoncampaign_create_response_2 = campaign_create_response_convertToJSON(campaign_create_response_2);
	printf("repeating campaign_create_response:\n%s\n", cJSON_Print(jsoncampaign_create_response_2));
}

int main() {
  test_campaign_create_response(1);
  test_campaign_create_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // campaign_create_response_MAIN
#endif // campaign_create_response_TEST
