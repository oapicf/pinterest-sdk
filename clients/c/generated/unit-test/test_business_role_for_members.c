#ifndef business_role_for_members_TEST
#define business_role_for_members_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define business_role_for_members_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/business_role_for_members.h"
business_role_for_members_t* instantiate_business_role_for_members(int include_optional);



business_role_for_members_t* instantiate_business_role_for_members(int include_optional) {
  business_role_for_members_t* business_role_for_members = NULL;
  if (include_optional) {
    business_role_for_members = business_role_for_members_create(
    );
  } else {
    business_role_for_members = business_role_for_members_create(
    );
  }

  return business_role_for_members;
}


#ifdef business_role_for_members_MAIN

void test_business_role_for_members(int include_optional) {
    business_role_for_members_t* business_role_for_members_1 = instantiate_business_role_for_members(include_optional);

	cJSON* jsonbusiness_role_for_members_1 = business_role_for_members_convertToJSON(business_role_for_members_1);
	printf("business_role_for_members :\n%s\n", cJSON_Print(jsonbusiness_role_for_members_1));
	business_role_for_members_t* business_role_for_members_2 = business_role_for_members_parseFromJSON(jsonbusiness_role_for_members_1);
	cJSON* jsonbusiness_role_for_members_2 = business_role_for_members_convertToJSON(business_role_for_members_2);
	printf("repeating business_role_for_members:\n%s\n", cJSON_Print(jsonbusiness_role_for_members_2));
}

int main() {
  test_business_role_for_members(1);
  test_business_role_for_members(0);

  printf("Hello world \n");
  return 0;
}

#endif // business_role_for_members_MAIN
#endif // business_role_for_members_TEST
