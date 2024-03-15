#ifndef ads_credit_redeem_request_TEST
#define ads_credit_redeem_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ads_credit_redeem_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ads_credit_redeem_request.h"
ads_credit_redeem_request_t* instantiate_ads_credit_redeem_request(int include_optional);



ads_credit_redeem_request_t* instantiate_ads_credit_redeem_request(int include_optional) {
  ads_credit_redeem_request_t* ads_credit_redeem_request = NULL;
  if (include_optional) {
    ads_credit_redeem_request = ads_credit_redeem_request_create(
      "138e9e0ff7e38cf511b880975eb574c09aa9d5e1657590ab0431040da68caa67",
      true
    );
  } else {
    ads_credit_redeem_request = ads_credit_redeem_request_create(
      "138e9e0ff7e38cf511b880975eb574c09aa9d5e1657590ab0431040da68caa67",
      true
    );
  }

  return ads_credit_redeem_request;
}


#ifdef ads_credit_redeem_request_MAIN

void test_ads_credit_redeem_request(int include_optional) {
    ads_credit_redeem_request_t* ads_credit_redeem_request_1 = instantiate_ads_credit_redeem_request(include_optional);

	cJSON* jsonads_credit_redeem_request_1 = ads_credit_redeem_request_convertToJSON(ads_credit_redeem_request_1);
	printf("ads_credit_redeem_request :\n%s\n", cJSON_Print(jsonads_credit_redeem_request_1));
	ads_credit_redeem_request_t* ads_credit_redeem_request_2 = ads_credit_redeem_request_parseFromJSON(jsonads_credit_redeem_request_1);
	cJSON* jsonads_credit_redeem_request_2 = ads_credit_redeem_request_convertToJSON(ads_credit_redeem_request_2);
	printf("repeating ads_credit_redeem_request:\n%s\n", cJSON_Print(jsonads_credit_redeem_request_2));
}

int main() {
  test_ads_credit_redeem_request(1);
  test_ads_credit_redeem_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // ads_credit_redeem_request_MAIN
#endif // ads_credit_redeem_request_TEST
