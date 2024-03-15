#ifndef campaigns_list_200_response_TEST
#define campaigns_list_200_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define campaigns_list_200_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/campaigns_list_200_response.h"
campaigns_list_200_response_t* instantiate_campaigns_list_200_response(int include_optional);



campaigns_list_200_response_t* instantiate_campaigns_list_200_response(int include_optional) {
  campaigns_list_200_response_t* campaigns_list_200_response = NULL;
  if (include_optional) {
    campaigns_list_200_response = campaigns_list_200_response_create(
      list_createList(),
      "0"
    );
  } else {
    campaigns_list_200_response = campaigns_list_200_response_create(
      list_createList(),
      "0"
    );
  }

  return campaigns_list_200_response;
}


#ifdef campaigns_list_200_response_MAIN

void test_campaigns_list_200_response(int include_optional) {
    campaigns_list_200_response_t* campaigns_list_200_response_1 = instantiate_campaigns_list_200_response(include_optional);

	cJSON* jsoncampaigns_list_200_response_1 = campaigns_list_200_response_convertToJSON(campaigns_list_200_response_1);
	printf("campaigns_list_200_response :\n%s\n", cJSON_Print(jsoncampaigns_list_200_response_1));
	campaigns_list_200_response_t* campaigns_list_200_response_2 = campaigns_list_200_response_parseFromJSON(jsoncampaigns_list_200_response_1);
	cJSON* jsoncampaigns_list_200_response_2 = campaigns_list_200_response_convertToJSON(campaigns_list_200_response_2);
	printf("repeating campaigns_list_200_response:\n%s\n", cJSON_Print(jsoncampaigns_list_200_response_2));
}

int main() {
  test_campaigns_list_200_response(1);
  test_campaigns_list_200_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // campaigns_list_200_response_MAIN
#endif // campaigns_list_200_response_TEST
