#ifndef lead_subscription_post_params_create_all_of_partner_metadata_TEST
#define lead_subscription_post_params_create_all_of_partner_metadata_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define lead_subscription_post_params_create_all_of_partner_metadata_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/lead_subscription_post_params_create_all_of_partner_metadata.h"
lead_subscription_post_params_create_all_of_partner_metadata_t* instantiate_lead_subscription_post_params_create_all_of_partner_metadata(int include_optional);



lead_subscription_post_params_create_all_of_partner_metadata_t* instantiate_lead_subscription_post_params_create_all_of_partner_metadata(int include_optional) {
  lead_subscription_post_params_create_all_of_partner_metadata_t* lead_subscription_post_params_create_all_of_partner_metadata = NULL;
  if (include_optional) {
    lead_subscription_post_params_create_all_of_partner_metadata = lead_subscription_post_params_create_all_of_partner_metadata_create(
      "0"
    );
  } else {
    lead_subscription_post_params_create_all_of_partner_metadata = lead_subscription_post_params_create_all_of_partner_metadata_create(
      "0"
    );
  }

  return lead_subscription_post_params_create_all_of_partner_metadata;
}


#ifdef lead_subscription_post_params_create_all_of_partner_metadata_MAIN

void test_lead_subscription_post_params_create_all_of_partner_metadata(int include_optional) {
    lead_subscription_post_params_create_all_of_partner_metadata_t* lead_subscription_post_params_create_all_of_partner_metadata_1 = instantiate_lead_subscription_post_params_create_all_of_partner_metadata(include_optional);

	cJSON* jsonlead_subscription_post_params_create_all_of_partner_metadata_1 = lead_subscription_post_params_create_all_of_partner_metadata_convertToJSON(lead_subscription_post_params_create_all_of_partner_metadata_1);
	printf("lead_subscription_post_params_create_all_of_partner_metadata :\n%s\n", cJSON_Print(jsonlead_subscription_post_params_create_all_of_partner_metadata_1));
	lead_subscription_post_params_create_all_of_partner_metadata_t* lead_subscription_post_params_create_all_of_partner_metadata_2 = lead_subscription_post_params_create_all_of_partner_metadata_parseFromJSON(jsonlead_subscription_post_params_create_all_of_partner_metadata_1);
	cJSON* jsonlead_subscription_post_params_create_all_of_partner_metadata_2 = lead_subscription_post_params_create_all_of_partner_metadata_convertToJSON(lead_subscription_post_params_create_all_of_partner_metadata_2);
	printf("repeating lead_subscription_post_params_create_all_of_partner_metadata:\n%s\n", cJSON_Print(jsonlead_subscription_post_params_create_all_of_partner_metadata_2));
}

int main() {
  test_lead_subscription_post_params_create_all_of_partner_metadata(1);
  test_lead_subscription_post_params_create_all_of_partner_metadata(0);

  printf("Hello world \n");
  return 0;
}

#endif // lead_subscription_post_params_create_all_of_partner_metadata_MAIN
#endif // lead_subscription_post_params_create_all_of_partner_metadata_TEST
