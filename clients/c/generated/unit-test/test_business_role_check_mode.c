#ifndef business_role_check_mode_TEST
#define business_role_check_mode_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define business_role_check_mode_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/business_role_check_mode.h"
business_role_check_mode_t* instantiate_business_role_check_mode(int include_optional);



business_role_check_mode_t* instantiate_business_role_check_mode(int include_optional) {
  business_role_check_mode_t* business_role_check_mode = NULL;
  if (include_optional) {
    business_role_check_mode = business_role_check_mode_create(
    );
  } else {
    business_role_check_mode = business_role_check_mode_create(
    );
  }

  return business_role_check_mode;
}


#ifdef business_role_check_mode_MAIN

void test_business_role_check_mode(int include_optional) {
    business_role_check_mode_t* business_role_check_mode_1 = instantiate_business_role_check_mode(include_optional);

	cJSON* jsonbusiness_role_check_mode_1 = business_role_check_mode_convertToJSON(business_role_check_mode_1);
	printf("business_role_check_mode :\n%s\n", cJSON_Print(jsonbusiness_role_check_mode_1));
	business_role_check_mode_t* business_role_check_mode_2 = business_role_check_mode_parseFromJSON(jsonbusiness_role_check_mode_1);
	cJSON* jsonbusiness_role_check_mode_2 = business_role_check_mode_convertToJSON(business_role_check_mode_2);
	printf("repeating business_role_check_mode:\n%s\n", cJSON_Print(jsonbusiness_role_check_mode_2));
}

int main() {
  test_business_role_check_mode(1);
  test_business_role_check_mode(0);

  printf("Hello world \n");
  return 0;
}

#endif // business_role_check_mode_MAIN
#endif // business_role_check_mode_TEST
