#ifndef account_TEST
#define account_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define account_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/account.h"
account_t* instantiate_account(int include_optional);



account_t* instantiate_account(int include_optional) {
  account_t* account = NULL;
  if (include_optional) {
    account = account_create(
      pinterest_rest_api_account_ACCOUNTTYPE_PINNER,
      "0",
      "0",
      "0"
    );
  } else {
    account = account_create(
      pinterest_rest_api_account_ACCOUNTTYPE_PINNER,
      "0",
      "0",
      "0"
    );
  }

  return account;
}


#ifdef account_MAIN

void test_account(int include_optional) {
    account_t* account_1 = instantiate_account(include_optional);

	cJSON* jsonaccount_1 = account_convertToJSON(account_1);
	printf("account :\n%s\n", cJSON_Print(jsonaccount_1));
	account_t* account_2 = account_parseFromJSON(jsonaccount_1);
	cJSON* jsonaccount_2 = account_convertToJSON(account_2);
	printf("repeating account:\n%s\n", cJSON_Print(jsonaccount_2));
}

int main() {
  test_account(1);
  test_account(0);

  printf("Hello world \n");
  return 0;
}

#endif // account_MAIN
#endif // account_TEST
