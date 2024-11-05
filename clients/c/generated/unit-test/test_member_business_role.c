#ifndef member_business_role_TEST
#define member_business_role_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define member_business_role_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/member_business_role.h"
member_business_role_t* instantiate_member_business_role(int include_optional);



member_business_role_t* instantiate_member_business_role(int include_optional) {
  member_business_role_t* member_business_role = NULL;
  if (include_optional) {
    member_business_role = member_business_role_create(
    );
  } else {
    member_business_role = member_business_role_create(
    );
  }

  return member_business_role;
}


#ifdef member_business_role_MAIN

void test_member_business_role(int include_optional) {
    member_business_role_t* member_business_role_1 = instantiate_member_business_role(include_optional);

	cJSON* jsonmember_business_role_1 = member_business_role_convertToJSON(member_business_role_1);
	printf("member_business_role :\n%s\n", cJSON_Print(jsonmember_business_role_1));
	member_business_role_t* member_business_role_2 = member_business_role_parseFromJSON(jsonmember_business_role_1);
	cJSON* jsonmember_business_role_2 = member_business_role_convertToJSON(member_business_role_2);
	printf("repeating member_business_role:\n%s\n", cJSON_Print(jsonmember_business_role_2));
}

int main() {
  test_member_business_role(1);
  test_member_business_role(0);

  printf("Hello world \n");
  return 0;
}

#endif // member_business_role_MAIN
#endif // member_business_role_TEST
