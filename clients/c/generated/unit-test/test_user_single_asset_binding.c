#ifndef user_single_asset_binding_TEST
#define user_single_asset_binding_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define user_single_asset_binding_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/user_single_asset_binding.h"
user_single_asset_binding_t* instantiate_user_single_asset_binding(int include_optional);

#include "test_business_access_user_summary.c"


user_single_asset_binding_t* instantiate_user_single_asset_binding(int include_optional) {
  user_single_asset_binding_t* user_single_asset_binding = NULL;
  if (include_optional) {
    user_single_asset_binding = user_single_asset_binding_create(
      ["FINANCE_MANAGER","CATALOGS_MANAGER","AUDIENCE_MANAGER"],
       // false, not to have infinite recursion
      instantiate_business_access_user_summary(0)
    );
  } else {
    user_single_asset_binding = user_single_asset_binding_create(
      ["FINANCE_MANAGER","CATALOGS_MANAGER","AUDIENCE_MANAGER"],
      NULL
    );
  }

  return user_single_asset_binding;
}


#ifdef user_single_asset_binding_MAIN

void test_user_single_asset_binding(int include_optional) {
    user_single_asset_binding_t* user_single_asset_binding_1 = instantiate_user_single_asset_binding(include_optional);

	cJSON* jsonuser_single_asset_binding_1 = user_single_asset_binding_convertToJSON(user_single_asset_binding_1);
	printf("user_single_asset_binding :\n%s\n", cJSON_Print(jsonuser_single_asset_binding_1));
	user_single_asset_binding_t* user_single_asset_binding_2 = user_single_asset_binding_parseFromJSON(jsonuser_single_asset_binding_1);
	cJSON* jsonuser_single_asset_binding_2 = user_single_asset_binding_convertToJSON(user_single_asset_binding_2);
	printf("repeating user_single_asset_binding:\n%s\n", cJSON_Print(jsonuser_single_asset_binding_2));
}

int main() {
  test_user_single_asset_binding(1);
  test_user_single_asset_binding(0);

  printf("Hello world \n");
  return 0;
}

#endif // user_single_asset_binding_MAIN
#endif // user_single_asset_binding_TEST
