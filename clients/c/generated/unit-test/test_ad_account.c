#ifndef ad_account_TEST
#define ad_account_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ad_account_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ad_account.h"
ad_account_t* instantiate_ad_account(int include_optional);

#include "test_ad_account_owner.c"


ad_account_t* instantiate_ad_account(int include_optional) {
  ad_account_t* ad_account = NULL;
  if (include_optional) {
    ad_account = ad_account_create(
      "0",
      "0",
       // false, not to have infinite recursion
      instantiate_ad_account_owner(0),
      pinterest_rest_api_ad_account__"US",
      pinterest_rest_api_ad_account__"USD"
    );
  } else {
    ad_account = ad_account_create(
      "0",
      "0",
      NULL,
      pinterest_rest_api_ad_account__"US",
      pinterest_rest_api_ad_account__"USD"
    );
  }

  return ad_account;
}


#ifdef ad_account_MAIN

void test_ad_account(int include_optional) {
    ad_account_t* ad_account_1 = instantiate_ad_account(include_optional);

	cJSON* jsonad_account_1 = ad_account_convertToJSON(ad_account_1);
	printf("ad_account :\n%s\n", cJSON_Print(jsonad_account_1));
	ad_account_t* ad_account_2 = ad_account_parseFromJSON(jsonad_account_1);
	cJSON* jsonad_account_2 = ad_account_convertToJSON(ad_account_2);
	printf("repeating ad_account:\n%s\n", cJSON_Print(jsonad_account_2));
}

int main() {
  test_ad_account(1);
  test_ad_account(0);

  printf("Hello world \n");
  return 0;
}

#endif // ad_account_MAIN
#endif // ad_account_TEST
