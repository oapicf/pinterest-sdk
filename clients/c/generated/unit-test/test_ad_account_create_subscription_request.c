#ifndef ad_account_create_subscription_request_TEST
#define ad_account_create_subscription_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ad_account_create_subscription_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ad_account_create_subscription_request.h"
ad_account_create_subscription_request_t* instantiate_ad_account_create_subscription_request(int include_optional);



ad_account_create_subscription_request_t* instantiate_ad_account_create_subscription_request(int include_optional) {
  ad_account_create_subscription_request_t* ad_account_create_subscription_request = NULL;
  if (include_optional) {
    ad_account_create_subscription_request = ad_account_create_subscription_request_create(
      "https://webhook.example.com/xyz",
      "383791336903426390",
      "0",
      "0"
    );
  } else {
    ad_account_create_subscription_request = ad_account_create_subscription_request_create(
      "https://webhook.example.com/xyz",
      "383791336903426390",
      "0",
      "0"
    );
  }

  return ad_account_create_subscription_request;
}


#ifdef ad_account_create_subscription_request_MAIN

void test_ad_account_create_subscription_request(int include_optional) {
    ad_account_create_subscription_request_t* ad_account_create_subscription_request_1 = instantiate_ad_account_create_subscription_request(include_optional);

	cJSON* jsonad_account_create_subscription_request_1 = ad_account_create_subscription_request_convertToJSON(ad_account_create_subscription_request_1);
	printf("ad_account_create_subscription_request :\n%s\n", cJSON_Print(jsonad_account_create_subscription_request_1));
	ad_account_create_subscription_request_t* ad_account_create_subscription_request_2 = ad_account_create_subscription_request_parseFromJSON(jsonad_account_create_subscription_request_1);
	cJSON* jsonad_account_create_subscription_request_2 = ad_account_create_subscription_request_convertToJSON(ad_account_create_subscription_request_2);
	printf("repeating ad_account_create_subscription_request:\n%s\n", cJSON_Print(jsonad_account_create_subscription_request_2));
}

int main() {
  test_ad_account_create_subscription_request(1);
  test_ad_account_create_subscription_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // ad_account_create_subscription_request_MAIN
#endif // ad_account_create_subscription_request_TEST
