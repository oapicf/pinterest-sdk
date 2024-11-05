#ifndef business_member_assets_summary_ad_accounts_inner_TEST
#define business_member_assets_summary_ad_accounts_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define business_member_assets_summary_ad_accounts_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/business_member_assets_summary_ad_accounts_inner.h"
business_member_assets_summary_ad_accounts_inner_t* instantiate_business_member_assets_summary_ad_accounts_inner(int include_optional);



business_member_assets_summary_ad_accounts_inner_t* instantiate_business_member_assets_summary_ad_accounts_inner(int include_optional) {
  business_member_assets_summary_ad_accounts_inner_t* business_member_assets_summary_ad_accounts_inner = NULL;
  if (include_optional) {
    business_member_assets_summary_ad_accounts_inner = business_member_assets_summary_ad_accounts_inner_create(
      "549755885175",
      ["FINANCE_MANAGER","CATALOGS_MANAGER","AUDIENCE_MANAGER"]
    );
  } else {
    business_member_assets_summary_ad_accounts_inner = business_member_assets_summary_ad_accounts_inner_create(
      "549755885175",
      ["FINANCE_MANAGER","CATALOGS_MANAGER","AUDIENCE_MANAGER"]
    );
  }

  return business_member_assets_summary_ad_accounts_inner;
}


#ifdef business_member_assets_summary_ad_accounts_inner_MAIN

void test_business_member_assets_summary_ad_accounts_inner(int include_optional) {
    business_member_assets_summary_ad_accounts_inner_t* business_member_assets_summary_ad_accounts_inner_1 = instantiate_business_member_assets_summary_ad_accounts_inner(include_optional);

	cJSON* jsonbusiness_member_assets_summary_ad_accounts_inner_1 = business_member_assets_summary_ad_accounts_inner_convertToJSON(business_member_assets_summary_ad_accounts_inner_1);
	printf("business_member_assets_summary_ad_accounts_inner :\n%s\n", cJSON_Print(jsonbusiness_member_assets_summary_ad_accounts_inner_1));
	business_member_assets_summary_ad_accounts_inner_t* business_member_assets_summary_ad_accounts_inner_2 = business_member_assets_summary_ad_accounts_inner_parseFromJSON(jsonbusiness_member_assets_summary_ad_accounts_inner_1);
	cJSON* jsonbusiness_member_assets_summary_ad_accounts_inner_2 = business_member_assets_summary_ad_accounts_inner_convertToJSON(business_member_assets_summary_ad_accounts_inner_2);
	printf("repeating business_member_assets_summary_ad_accounts_inner:\n%s\n", cJSON_Print(jsonbusiness_member_assets_summary_ad_accounts_inner_2));
}

int main() {
  test_business_member_assets_summary_ad_accounts_inner(1);
  test_business_member_assets_summary_ad_accounts_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // business_member_assets_summary_ad_accounts_inner_MAIN
#endif // business_member_assets_summary_ad_accounts_inner_TEST
