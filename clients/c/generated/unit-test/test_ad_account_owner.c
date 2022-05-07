#ifndef ad_account_owner_TEST
#define ad_account_owner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ad_account_owner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ad_account_owner.h"
ad_account_owner_t* instantiate_ad_account_owner(int include_optional);



ad_account_owner_t* instantiate_ad_account_owner(int include_optional) {
  ad_account_owner_t* ad_account_owner = NULL;
  if (include_optional) {
    ad_account_owner = ad_account_owner_create(
      "0"
    );
  } else {
    ad_account_owner = ad_account_owner_create(
      "0"
    );
  }

  return ad_account_owner;
}


#ifdef ad_account_owner_MAIN

void test_ad_account_owner(int include_optional) {
    ad_account_owner_t* ad_account_owner_1 = instantiate_ad_account_owner(include_optional);

	cJSON* jsonad_account_owner_1 = ad_account_owner_convertToJSON(ad_account_owner_1);
	printf("ad_account_owner :\n%s\n", cJSON_Print(jsonad_account_owner_1));
	ad_account_owner_t* ad_account_owner_2 = ad_account_owner_parseFromJSON(jsonad_account_owner_1);
	cJSON* jsonad_account_owner_2 = ad_account_owner_convertToJSON(ad_account_owner_2);
	printf("repeating ad_account_owner:\n%s\n", cJSON_Print(jsonad_account_owner_2));
}

int main() {
  test_ad_account_owner(1);
  test_ad_account_owner(0);

  printf("Hello world \n");
  return 0;
}

#endif // ad_account_owner_MAIN
#endif // ad_account_owner_TEST
