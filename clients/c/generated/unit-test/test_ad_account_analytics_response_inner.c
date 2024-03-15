#ifndef ad_account_analytics_response_inner_TEST
#define ad_account_analytics_response_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ad_account_analytics_response_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ad_account_analytics_response_inner.h"
ad_account_analytics_response_inner_t* instantiate_ad_account_analytics_response_inner(int include_optional);



ad_account_analytics_response_inner_t* instantiate_ad_account_analytics_response_inner(int include_optional) {
  ad_account_analytics_response_inner_t* ad_account_analytics_response_inner = NULL;
  if (include_optional) {
    ad_account_analytics_response_inner = ad_account_analytics_response_inner_create(
      "a",
      "2013-10-20"
    );
  } else {
    ad_account_analytics_response_inner = ad_account_analytics_response_inner_create(
      "a",
      "2013-10-20"
    );
  }

  return ad_account_analytics_response_inner;
}


#ifdef ad_account_analytics_response_inner_MAIN

void test_ad_account_analytics_response_inner(int include_optional) {
    ad_account_analytics_response_inner_t* ad_account_analytics_response_inner_1 = instantiate_ad_account_analytics_response_inner(include_optional);

	cJSON* jsonad_account_analytics_response_inner_1 = ad_account_analytics_response_inner_convertToJSON(ad_account_analytics_response_inner_1);
	printf("ad_account_analytics_response_inner :\n%s\n", cJSON_Print(jsonad_account_analytics_response_inner_1));
	ad_account_analytics_response_inner_t* ad_account_analytics_response_inner_2 = ad_account_analytics_response_inner_parseFromJSON(jsonad_account_analytics_response_inner_1);
	cJSON* jsonad_account_analytics_response_inner_2 = ad_account_analytics_response_inner_convertToJSON(ad_account_analytics_response_inner_2);
	printf("repeating ad_account_analytics_response_inner:\n%s\n", cJSON_Print(jsonad_account_analytics_response_inner_2));
}

int main() {
  test_ad_account_analytics_response_inner(1);
  test_ad_account_analytics_response_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // ad_account_analytics_response_inner_MAIN
#endif // ad_account_analytics_response_inner_TEST
