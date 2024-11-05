#ifndef business_member_assets_summary_TEST
#define business_member_assets_summary_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define business_member_assets_summary_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/business_member_assets_summary.h"
business_member_assets_summary_t* instantiate_business_member_assets_summary(int include_optional);



business_member_assets_summary_t* instantiate_business_member_assets_summary(int include_optional) {
  business_member_assets_summary_t* business_member_assets_summary = NULL;
  if (include_optional) {
    business_member_assets_summary = business_member_assets_summary_create(
      list_createList(),
      list_createList()
    );
  } else {
    business_member_assets_summary = business_member_assets_summary_create(
      list_createList(),
      list_createList()
    );
  }

  return business_member_assets_summary;
}


#ifdef business_member_assets_summary_MAIN

void test_business_member_assets_summary(int include_optional) {
    business_member_assets_summary_t* business_member_assets_summary_1 = instantiate_business_member_assets_summary(include_optional);

	cJSON* jsonbusiness_member_assets_summary_1 = business_member_assets_summary_convertToJSON(business_member_assets_summary_1);
	printf("business_member_assets_summary :\n%s\n", cJSON_Print(jsonbusiness_member_assets_summary_1));
	business_member_assets_summary_t* business_member_assets_summary_2 = business_member_assets_summary_parseFromJSON(jsonbusiness_member_assets_summary_1);
	cJSON* jsonbusiness_member_assets_summary_2 = business_member_assets_summary_convertToJSON(business_member_assets_summary_2);
	printf("repeating business_member_assets_summary:\n%s\n", cJSON_Print(jsonbusiness_member_assets_summary_2));
}

int main() {
  test_business_member_assets_summary(1);
  test_business_member_assets_summary(0);

  printf("Hello world \n");
  return 0;
}

#endif // business_member_assets_summary_MAIN
#endif // business_member_assets_summary_TEST
