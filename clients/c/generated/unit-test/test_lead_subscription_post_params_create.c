#ifndef lead_subscription_post_params_create_TEST
#define lead_subscription_post_params_create_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define lead_subscription_post_params_create_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/lead_subscription_post_params_create.h"
lead_subscription_post_params_create_t* instantiate_lead_subscription_post_params_create(int include_optional);

#include "test_lead_subscription_post_params_create_all_of_partner_metadata.c"


lead_subscription_post_params_create_t* instantiate_lead_subscription_post_params_create(int include_optional) {
  lead_subscription_post_params_create_t* lead_subscription_post_params_create = NULL;
  if (include_optional) {
    lead_subscription_post_params_create = lead_subscription_post_params_create_create(
      "a",
      "0",
      "0",
      null,
      "0"
    );
  } else {
    lead_subscription_post_params_create = lead_subscription_post_params_create_create(
      "a",
      "0",
      "0",
      null,
      "0"
    );
  }

  return lead_subscription_post_params_create;
}


#ifdef lead_subscription_post_params_create_MAIN

void test_lead_subscription_post_params_create(int include_optional) {
    lead_subscription_post_params_create_t* lead_subscription_post_params_create_1 = instantiate_lead_subscription_post_params_create(include_optional);

	cJSON* jsonlead_subscription_post_params_create_1 = lead_subscription_post_params_create_convertToJSON(lead_subscription_post_params_create_1);
	printf("lead_subscription_post_params_create :\n%s\n", cJSON_Print(jsonlead_subscription_post_params_create_1));
	lead_subscription_post_params_create_t* lead_subscription_post_params_create_2 = lead_subscription_post_params_create_parseFromJSON(jsonlead_subscription_post_params_create_1);
	cJSON* jsonlead_subscription_post_params_create_2 = lead_subscription_post_params_create_convertToJSON(lead_subscription_post_params_create_2);
	printf("repeating lead_subscription_post_params_create:\n%s\n", cJSON_Print(jsonlead_subscription_post_params_create_2));
}

int main() {
  test_lead_subscription_post_params_create(1);
  test_lead_subscription_post_params_create(0);

  printf("Hello world \n");
  return 0;
}

#endif // lead_subscription_post_params_create_MAIN
#endif // lead_subscription_post_params_create_TEST
