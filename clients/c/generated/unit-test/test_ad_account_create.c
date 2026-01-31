#ifndef ad_account_create_TEST
#define ad_account_create_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ad_account_create_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ad_account_create.h"
ad_account_create_t* instantiate_ad_account_create(int include_optional);



ad_account_create_t* instantiate_ad_account_create(int include_optional) {
  ad_account_create_t* ad_account_create = NULL;
  if (include_optional) {
    ad_account_create = ad_account_create_create(
      pinterest_rest_api_ad_account_create__AD,
      pinterest_rest_api_ad_account_create__UNK,
      "0",
      "a"
    );
  } else {
    ad_account_create = ad_account_create_create(
      pinterest_rest_api_ad_account_create__AD,
      pinterest_rest_api_ad_account_create__UNK,
      "0",
      "a"
    );
  }

  return ad_account_create;
}


#ifdef ad_account_create_MAIN

void test_ad_account_create(int include_optional) {
    ad_account_create_t* ad_account_create_1 = instantiate_ad_account_create(include_optional);

	cJSON* jsonad_account_create_1 = ad_account_create_convertToJSON(ad_account_create_1);
	printf("ad_account_create :\n%s\n", cJSON_Print(jsonad_account_create_1));
	ad_account_create_t* ad_account_create_2 = ad_account_create_parseFromJSON(jsonad_account_create_1);
	cJSON* jsonad_account_create_2 = ad_account_create_convertToJSON(ad_account_create_2);
	printf("repeating ad_account_create:\n%s\n", cJSON_Print(jsonad_account_create_2));
}

int main() {
  test_ad_account_create(1);
  test_ad_account_create(0);

  printf("Hello world \n");
  return 0;
}

#endif // ad_account_create_MAIN
#endif // ad_account_create_TEST
