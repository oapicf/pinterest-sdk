#ifndef shared_audience_account_TEST
#define shared_audience_account_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define shared_audience_account_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/shared_audience_account.h"
shared_audience_account_t* instantiate_shared_audience_account(int include_optional);



shared_audience_account_t* instantiate_shared_audience_account(int include_optional) {
  shared_audience_account_t* shared_audience_account = NULL;
  if (include_optional) {
    shared_audience_account = shared_audience_account_create(
      "549755885175",
      "Home Depot USA",
      pinterest_rest_api_shared_audience_account_ACCOUNTTYPE_AD_ACCOUNT,
      1677003860
    );
  } else {
    shared_audience_account = shared_audience_account_create(
      "549755885175",
      "Home Depot USA",
      pinterest_rest_api_shared_audience_account_ACCOUNTTYPE_AD_ACCOUNT,
      1677003860
    );
  }

  return shared_audience_account;
}


#ifdef shared_audience_account_MAIN

void test_shared_audience_account(int include_optional) {
    shared_audience_account_t* shared_audience_account_1 = instantiate_shared_audience_account(include_optional);

	cJSON* jsonshared_audience_account_1 = shared_audience_account_convertToJSON(shared_audience_account_1);
	printf("shared_audience_account :\n%s\n", cJSON_Print(jsonshared_audience_account_1));
	shared_audience_account_t* shared_audience_account_2 = shared_audience_account_parseFromJSON(jsonshared_audience_account_1);
	cJSON* jsonshared_audience_account_2 = shared_audience_account_convertToJSON(shared_audience_account_2);
	printf("repeating shared_audience_account:\n%s\n", cJSON_Print(jsonshared_audience_account_2));
}

int main() {
  test_shared_audience_account(1);
  test_shared_audience_account(0);

  printf("Hello world \n");
  return 0;
}

#endif // shared_audience_account_MAIN
#endif // shared_audience_account_TEST
