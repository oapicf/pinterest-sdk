#ifndef business_access_user_summary_TEST
#define business_access_user_summary_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define business_access_user_summary_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/business_access_user_summary.h"
business_access_user_summary_t* instantiate_business_access_user_summary(int include_optional);



business_access_user_summary_t* instantiate_business_access_user_summary(int include_optional) {
  business_access_user_summary_t* business_access_user_summary = NULL;
  if (include_optional) {
    business_access_user_summary = business_access_user_summary_create(
      "business0101@business.com",
      "383791336903426391",
      "business0101"
    );
  } else {
    business_access_user_summary = business_access_user_summary_create(
      "business0101@business.com",
      "383791336903426391",
      "business0101"
    );
  }

  return business_access_user_summary;
}


#ifdef business_access_user_summary_MAIN

void test_business_access_user_summary(int include_optional) {
    business_access_user_summary_t* business_access_user_summary_1 = instantiate_business_access_user_summary(include_optional);

	cJSON* jsonbusiness_access_user_summary_1 = business_access_user_summary_convertToJSON(business_access_user_summary_1);
	printf("business_access_user_summary :\n%s\n", cJSON_Print(jsonbusiness_access_user_summary_1));
	business_access_user_summary_t* business_access_user_summary_2 = business_access_user_summary_parseFromJSON(jsonbusiness_access_user_summary_1);
	cJSON* jsonbusiness_access_user_summary_2 = business_access_user_summary_convertToJSON(business_access_user_summary_2);
	printf("repeating business_access_user_summary:\n%s\n", cJSON_Print(jsonbusiness_access_user_summary_2));
}

int main() {
  test_business_access_user_summary(1);
  test_business_access_user_summary(0);

  printf("Hello world \n");
  return 0;
}

#endif // business_access_user_summary_MAIN
#endif // business_access_user_summary_TEST
