#ifndef ad_account_get_subscription_response_TEST
#define ad_account_get_subscription_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ad_account_get_subscription_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ad_account_get_subscription_response.h"
ad_account_get_subscription_response_t* instantiate_ad_account_get_subscription_response(int include_optional);



ad_account_get_subscription_response_t* instantiate_ad_account_get_subscription_response(int include_optional) {
  ad_account_get_subscription_response_t* ad_account_get_subscription_response = NULL;
  if (include_optional) {
    ad_account_get_subscription_response = ad_account_get_subscription_response_create(
      "383791336903426390",
      "https://webhook.example.com/xyz",
      "8078432025948590686",
      "549755885175",
      "549755885176",
      "v5",
      "ucvxbV2Tdss0vNeYsdh4Qfa/1Khm2b0PqXvXeTTZh54",
      "AES-256-GCM",
      1699209842000
    );
  } else {
    ad_account_get_subscription_response = ad_account_get_subscription_response_create(
      "383791336903426390",
      "https://webhook.example.com/xyz",
      "8078432025948590686",
      "549755885175",
      "549755885176",
      "v5",
      "ucvxbV2Tdss0vNeYsdh4Qfa/1Khm2b0PqXvXeTTZh54",
      "AES-256-GCM",
      1699209842000
    );
  }

  return ad_account_get_subscription_response;
}


#ifdef ad_account_get_subscription_response_MAIN

void test_ad_account_get_subscription_response(int include_optional) {
    ad_account_get_subscription_response_t* ad_account_get_subscription_response_1 = instantiate_ad_account_get_subscription_response(include_optional);

	cJSON* jsonad_account_get_subscription_response_1 = ad_account_get_subscription_response_convertToJSON(ad_account_get_subscription_response_1);
	printf("ad_account_get_subscription_response :\n%s\n", cJSON_Print(jsonad_account_get_subscription_response_1));
	ad_account_get_subscription_response_t* ad_account_get_subscription_response_2 = ad_account_get_subscription_response_parseFromJSON(jsonad_account_get_subscription_response_1);
	cJSON* jsonad_account_get_subscription_response_2 = ad_account_get_subscription_response_convertToJSON(ad_account_get_subscription_response_2);
	printf("repeating ad_account_get_subscription_response:\n%s\n", cJSON_Print(jsonad_account_get_subscription_response_2));
}

int main() {
  test_ad_account_get_subscription_response(1);
  test_ad_account_get_subscription_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // ad_account_get_subscription_response_MAIN
#endif // ad_account_get_subscription_response_TEST
