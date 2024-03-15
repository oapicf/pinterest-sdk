#ifndef campaign_create_response_item_TEST
#define campaign_create_response_item_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define campaign_create_response_item_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/campaign_create_response_item.h"
campaign_create_response_item_t* instantiate_campaign_create_response_item(int include_optional);

#include "test_campaign_create_response_data.c"


campaign_create_response_item_t* instantiate_campaign_create_response_item(int include_optional) {
  campaign_create_response_item_t* campaign_create_response_item = NULL;
  if (include_optional) {
    campaign_create_response_item = campaign_create_response_item_create(
       // false, not to have infinite recursion
      instantiate_campaign_create_response_data(0),
      list_createList()
    );
  } else {
    campaign_create_response_item = campaign_create_response_item_create(
      NULL,
      list_createList()
    );
  }

  return campaign_create_response_item;
}


#ifdef campaign_create_response_item_MAIN

void test_campaign_create_response_item(int include_optional) {
    campaign_create_response_item_t* campaign_create_response_item_1 = instantiate_campaign_create_response_item(include_optional);

	cJSON* jsoncampaign_create_response_item_1 = campaign_create_response_item_convertToJSON(campaign_create_response_item_1);
	printf("campaign_create_response_item :\n%s\n", cJSON_Print(jsoncampaign_create_response_item_1));
	campaign_create_response_item_t* campaign_create_response_item_2 = campaign_create_response_item_parseFromJSON(jsoncampaign_create_response_item_1);
	cJSON* jsoncampaign_create_response_item_2 = campaign_create_response_item_convertToJSON(campaign_create_response_item_2);
	printf("repeating campaign_create_response_item:\n%s\n", cJSON_Print(jsoncampaign_create_response_item_2));
}

int main() {
  test_campaign_create_response_item(1);
  test_campaign_create_response_item(0);

  printf("Hello world \n");
  return 0;
}

#endif // campaign_create_response_item_MAIN
#endif // campaign_create_response_item_TEST
