#ifndef invite_response_TEST
#define invite_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define invite_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/invite_response.h"
invite_response_t* instantiate_invite_response(int include_optional);

#include "test_invite_assets_summary.c"
#include "test_business_access_user_summary.c"
#include "test_business_access_user_summary.c"
#include "test_base_invite_data_response_invite_data.c"
#include "test_business_access_user_summary.c"


invite_response_t* instantiate_invite_response(int include_optional) {
  invite_response_t* invite_response = NULL;
  if (include_optional) {
    invite_response = invite_response_create(
       // false, not to have infinite recursion
      instantiate_invite_assets_summary(0),
      ["BIZ_ADMIN"],
       // false, not to have infinite recursion
      instantiate_business_access_user_summary(0),
       // false, not to have infinite recursion
      instantiate_business_access_user_summary(0),
      1646767577816,
      "383791336903426391",
       // false, not to have infinite recursion
      instantiate_base_invite_data_response_invite_data(0),
      1,
       // false, not to have infinite recursion
      instantiate_business_access_user_summary(0)
    );
  } else {
    invite_response = invite_response_create(
      NULL,
      ["BIZ_ADMIN"],
      NULL,
      NULL,
      1646767577816,
      "383791336903426391",
      NULL,
      1,
      NULL
    );
  }

  return invite_response;
}


#ifdef invite_response_MAIN

void test_invite_response(int include_optional) {
    invite_response_t* invite_response_1 = instantiate_invite_response(include_optional);

	cJSON* jsoninvite_response_1 = invite_response_convertToJSON(invite_response_1);
	printf("invite_response :\n%s\n", cJSON_Print(jsoninvite_response_1));
	invite_response_t* invite_response_2 = invite_response_parseFromJSON(jsoninvite_response_1);
	cJSON* jsoninvite_response_2 = invite_response_convertToJSON(invite_response_2);
	printf("repeating invite_response:\n%s\n", cJSON_Print(jsoninvite_response_2));
}

int main() {
  test_invite_response(1);
  test_invite_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // invite_response_MAIN
#endif // invite_response_TEST
