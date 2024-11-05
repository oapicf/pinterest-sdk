#ifndef business_role_TEST
#define business_role_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define business_role_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/business_role.h"
business_role_t* instantiate_business_role(int include_optional);



business_role_t* instantiate_business_role(int include_optional) {
  business_role_t* business_role = NULL;
  if (include_optional) {
    business_role = business_role_create(
    );
  } else {
    business_role = business_role_create(
    );
  }

  return business_role;
}


#ifdef business_role_MAIN

void test_business_role(int include_optional) {
    business_role_t* business_role_1 = instantiate_business_role(include_optional);

	cJSON* jsonbusiness_role_1 = business_role_convertToJSON(business_role_1);
	printf("business_role :\n%s\n", cJSON_Print(jsonbusiness_role_1));
	business_role_t* business_role_2 = business_role_parseFromJSON(jsonbusiness_role_1);
	cJSON* jsonbusiness_role_2 = business_role_convertToJSON(business_role_2);
	printf("repeating business_role:\n%s\n", cJSON_Print(jsonbusiness_role_2));
}

int main() {
  test_business_role(1);
  test_business_role(0);

  printf("Hello world \n");
  return 0;
}

#endif // business_role_MAIN
#endif // business_role_TEST
