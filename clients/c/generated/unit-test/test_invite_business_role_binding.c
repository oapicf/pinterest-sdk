#ifndef invite_business_role_binding_TEST
#define invite_business_role_binding_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define invite_business_role_binding_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/invite_business_role_binding.h"
invite_business_role_binding_t* instantiate_invite_business_role_binding(int include_optional);

#include "test_business_access_user_summary.c"
#include "test_base_invite_data_response_invite_data.c"


invite_business_role_binding_t* instantiate_invite_business_role_binding(int include_optional) {
  invite_business_role_binding_t* invite_business_role_binding = NULL;
  if (include_optional) {
    invite_business_role_binding = invite_business_role_binding_create(
      "1234567890123",
      "1234567890123",
       // false, not to have infinite recursion
      instantiate_business_access_user_summary(0),
      "383791336903426391",
       // false, not to have infinite recursion
      instantiate_base_invite_data_response_invite_data(0),
      1
    );
  } else {
    invite_business_role_binding = invite_business_role_binding_create(
      "1234567890123",
      "1234567890123",
      NULL,
      "383791336903426391",
      NULL,
      1
    );
  }

  return invite_business_role_binding;
}


#ifdef invite_business_role_binding_MAIN

void test_invite_business_role_binding(int include_optional) {
    invite_business_role_binding_t* invite_business_role_binding_1 = instantiate_invite_business_role_binding(include_optional);

	cJSON* jsoninvite_business_role_binding_1 = invite_business_role_binding_convertToJSON(invite_business_role_binding_1);
	printf("invite_business_role_binding :\n%s\n", cJSON_Print(jsoninvite_business_role_binding_1));
	invite_business_role_binding_t* invite_business_role_binding_2 = invite_business_role_binding_parseFromJSON(jsoninvite_business_role_binding_1);
	cJSON* jsoninvite_business_role_binding_2 = invite_business_role_binding_convertToJSON(invite_business_role_binding_2);
	printf("repeating invite_business_role_binding:\n%s\n", cJSON_Print(jsoninvite_business_role_binding_2));
}

int main() {
  test_invite_business_role_binding(1);
  test_invite_business_role_binding(0);

  printf("Hello world \n");
  return 0;
}

#endif // invite_business_role_binding_MAIN
#endif // invite_business_role_binding_TEST
