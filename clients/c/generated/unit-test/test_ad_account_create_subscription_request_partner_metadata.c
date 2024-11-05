#ifndef ad_account_create_subscription_request_partner_metadata_TEST
#define ad_account_create_subscription_request_partner_metadata_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ad_account_create_subscription_request_partner_metadata_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ad_account_create_subscription_request_partner_metadata.h"
ad_account_create_subscription_request_partner_metadata_t* instantiate_ad_account_create_subscription_request_partner_metadata(int include_optional);



ad_account_create_subscription_request_partner_metadata_t* instantiate_ad_account_create_subscription_request_partner_metadata(int include_optional) {
  ad_account_create_subscription_request_partner_metadata_t* ad_account_create_subscription_request_partner_metadata = NULL;
  if (include_optional) {
    ad_account_create_subscription_request_partner_metadata = ad_account_create_subscription_request_partner_metadata_create(
      "0"
    );
  } else {
    ad_account_create_subscription_request_partner_metadata = ad_account_create_subscription_request_partner_metadata_create(
      "0"
    );
  }

  return ad_account_create_subscription_request_partner_metadata;
}


#ifdef ad_account_create_subscription_request_partner_metadata_MAIN

void test_ad_account_create_subscription_request_partner_metadata(int include_optional) {
    ad_account_create_subscription_request_partner_metadata_t* ad_account_create_subscription_request_partner_metadata_1 = instantiate_ad_account_create_subscription_request_partner_metadata(include_optional);

	cJSON* jsonad_account_create_subscription_request_partner_metadata_1 = ad_account_create_subscription_request_partner_metadata_convertToJSON(ad_account_create_subscription_request_partner_metadata_1);
	printf("ad_account_create_subscription_request_partner_metadata :\n%s\n", cJSON_Print(jsonad_account_create_subscription_request_partner_metadata_1));
	ad_account_create_subscription_request_partner_metadata_t* ad_account_create_subscription_request_partner_metadata_2 = ad_account_create_subscription_request_partner_metadata_parseFromJSON(jsonad_account_create_subscription_request_partner_metadata_1);
	cJSON* jsonad_account_create_subscription_request_partner_metadata_2 = ad_account_create_subscription_request_partner_metadata_convertToJSON(ad_account_create_subscription_request_partner_metadata_2);
	printf("repeating ad_account_create_subscription_request_partner_metadata:\n%s\n", cJSON_Print(jsonad_account_create_subscription_request_partner_metadata_2));
}

int main() {
  test_ad_account_create_subscription_request_partner_metadata(1);
  test_ad_account_create_subscription_request_partner_metadata(0);

  printf("Hello world \n");
  return 0;
}

#endif // ad_account_create_subscription_request_partner_metadata_MAIN
#endif // ad_account_create_subscription_request_partner_metadata_TEST
