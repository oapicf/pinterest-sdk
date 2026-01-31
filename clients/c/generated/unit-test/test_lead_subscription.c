#ifndef lead_subscription_TEST
#define lead_subscription_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define lead_subscription_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/lead_subscription.h"
lead_subscription_t* instantiate_lead_subscription(int include_optional);



lead_subscription_t* instantiate_lead_subscription(int include_optional) {
  lead_subscription_t* lead_subscription = NULL;
  if (include_optional) {
    lead_subscription = lead_subscription_create(
      "a",
      "0",
      56,
      "0",
      "0",
      "a",
      "a",
      "a",
      "0"
    );
  } else {
    lead_subscription = lead_subscription_create(
      "a",
      "0",
      56,
      "0",
      "0",
      "a",
      "a",
      "a",
      "0"
    );
  }

  return lead_subscription;
}


#ifdef lead_subscription_MAIN

void test_lead_subscription(int include_optional) {
    lead_subscription_t* lead_subscription_1 = instantiate_lead_subscription(include_optional);

	cJSON* jsonlead_subscription_1 = lead_subscription_convertToJSON(lead_subscription_1);
	printf("lead_subscription :\n%s\n", cJSON_Print(jsonlead_subscription_1));
	lead_subscription_t* lead_subscription_2 = lead_subscription_parseFromJSON(jsonlead_subscription_1);
	cJSON* jsonlead_subscription_2 = lead_subscription_convertToJSON(lead_subscription_2);
	printf("repeating lead_subscription:\n%s\n", cJSON_Print(jsonlead_subscription_2));
}

int main() {
  test_lead_subscription(1);
  test_lead_subscription(0);

  printf("Hello world \n");
  return 0;
}

#endif // lead_subscription_MAIN
#endif // lead_subscription_TEST
