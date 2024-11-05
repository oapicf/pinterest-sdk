#ifndef user_business_role_binding_TEST
#define user_business_role_binding_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define user_business_role_binding_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/user_business_role_binding.h"
user_business_role_binding_t* instantiate_user_business_role_binding(int include_optional);

#include "test_business_member_assets_summary.c"
#include "test_business_access_user_summary.c"
#include "test_business_access_user_summary.c"
#include "test_business_access_user_summary.c"


user_business_role_binding_t* instantiate_user_business_role_binding(int include_optional) {
  user_business_role_binding_t* user_business_role_binding = NULL;
  if (include_optional) {
    user_business_role_binding = user_business_role_binding_create(
       // false, not to have infinite recursion
      instantiate_business_member_assets_summary(0),
      ["BIZ_ADMIN"],
       // false, not to have infinite recursion
      instantiate_business_access_user_summary(0),
       // false, not to have infinite recursion
      instantiate_business_access_user_summary(0),
      1646767577816,
      "383791336903426391",
      false,
       // false, not to have infinite recursion
      instantiate_business_access_user_summary(0)
    );
  } else {
    user_business_role_binding = user_business_role_binding_create(
      NULL,
      ["BIZ_ADMIN"],
      NULL,
      NULL,
      1646767577816,
      "383791336903426391",
      false,
      NULL
    );
  }

  return user_business_role_binding;
}


#ifdef user_business_role_binding_MAIN

void test_user_business_role_binding(int include_optional) {
    user_business_role_binding_t* user_business_role_binding_1 = instantiate_user_business_role_binding(include_optional);

	cJSON* jsonuser_business_role_binding_1 = user_business_role_binding_convertToJSON(user_business_role_binding_1);
	printf("user_business_role_binding :\n%s\n", cJSON_Print(jsonuser_business_role_binding_1));
	user_business_role_binding_t* user_business_role_binding_2 = user_business_role_binding_parseFromJSON(jsonuser_business_role_binding_1);
	cJSON* jsonuser_business_role_binding_2 = user_business_role_binding_convertToJSON(user_business_role_binding_2);
	printf("repeating user_business_role_binding:\n%s\n", cJSON_Print(jsonuser_business_role_binding_2));
}

int main() {
  test_user_business_role_binding(1);
  test_user_business_role_binding(0);

  printf("Hello world \n");
  return 0;
}

#endif // user_business_role_binding_MAIN
#endif // user_business_role_binding_TEST
