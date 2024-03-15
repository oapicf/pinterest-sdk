#ifndef business_access_role_TEST
#define business_access_role_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define business_access_role_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/business_access_role.h"
business_access_role_t* instantiate_business_access_role(int include_optional);



business_access_role_t* instantiate_business_access_role(int include_optional) {
  business_access_role_t* business_access_role = NULL;
  if (include_optional) {
    business_access_role = business_access_role_create(
    );
  } else {
    business_access_role = business_access_role_create(
    );
  }

  return business_access_role;
}


#ifdef business_access_role_MAIN

void test_business_access_role(int include_optional) {
    business_access_role_t* business_access_role_1 = instantiate_business_access_role(include_optional);

	cJSON* jsonbusiness_access_role_1 = business_access_role_convertToJSON(business_access_role_1);
	printf("business_access_role :\n%s\n", cJSON_Print(jsonbusiness_access_role_1));
	business_access_role_t* business_access_role_2 = business_access_role_parseFromJSON(jsonbusiness_access_role_1);
	cJSON* jsonbusiness_access_role_2 = business_access_role_convertToJSON(business_access_role_2);
	printf("repeating business_access_role:\n%s\n", cJSON_Print(jsonbusiness_access_role_2));
}

int main() {
  test_business_access_role(1);
  test_business_access_role(0);

  printf("Hello world \n");
  return 0;
}

#endif // business_access_role_MAIN
#endif // business_access_role_TEST
