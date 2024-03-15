#ifndef ads_credit_redeem_response_TEST
#define ads_credit_redeem_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ads_credit_redeem_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ads_credit_redeem_response.h"
ads_credit_redeem_response_t* instantiate_ads_credit_redeem_response(int include_optional);



ads_credit_redeem_response_t* instantiate_ads_credit_redeem_response(int include_optional) {
  ads_credit_redeem_response_t* ads_credit_redeem_response = NULL;
  if (include_optional) {
    ads_credit_redeem_response = ads_credit_redeem_response_create(
      false,
      2708,
      "The offer has already been redeemed by this advertiser"
    );
  } else {
    ads_credit_redeem_response = ads_credit_redeem_response_create(
      false,
      2708,
      "The offer has already been redeemed by this advertiser"
    );
  }

  return ads_credit_redeem_response;
}


#ifdef ads_credit_redeem_response_MAIN

void test_ads_credit_redeem_response(int include_optional) {
    ads_credit_redeem_response_t* ads_credit_redeem_response_1 = instantiate_ads_credit_redeem_response(include_optional);

	cJSON* jsonads_credit_redeem_response_1 = ads_credit_redeem_response_convertToJSON(ads_credit_redeem_response_1);
	printf("ads_credit_redeem_response :\n%s\n", cJSON_Print(jsonads_credit_redeem_response_1));
	ads_credit_redeem_response_t* ads_credit_redeem_response_2 = ads_credit_redeem_response_parseFromJSON(jsonads_credit_redeem_response_1);
	cJSON* jsonads_credit_redeem_response_2 = ads_credit_redeem_response_convertToJSON(ads_credit_redeem_response_2);
	printf("repeating ads_credit_redeem_response:\n%s\n", cJSON_Print(jsonads_credit_redeem_response_2));
}

int main() {
  test_ads_credit_redeem_response(1);
  test_ads_credit_redeem_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // ads_credit_redeem_response_MAIN
#endif // ads_credit_redeem_response_TEST
