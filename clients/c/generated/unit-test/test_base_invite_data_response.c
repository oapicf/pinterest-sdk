#ifndef base_invite_data_response_TEST
#define base_invite_data_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define base_invite_data_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/base_invite_data_response.h"
base_invite_data_response_t* instantiate_base_invite_data_response(int include_optional);

#include "test_base_invite_data_response_invite_data.c"
#include "test_business_access_user_summary.c"


base_invite_data_response_t* instantiate_base_invite_data_response(int include_optional) {
  base_invite_data_response_t* base_invite_data_response = NULL;
  if (include_optional) {
    base_invite_data_response = base_invite_data_response_create(
      "383791336903426391",
       // false, not to have infinite recursion
      instantiate_base_invite_data_response_invite_data(0),
      1,
       // false, not to have infinite recursion
      instantiate_business_access_user_summary(0)
    );
  } else {
    base_invite_data_response = base_invite_data_response_create(
      "383791336903426391",
      NULL,
      1,
      NULL
    );
  }

  return base_invite_data_response;
}


#ifdef base_invite_data_response_MAIN

void test_base_invite_data_response(int include_optional) {
    base_invite_data_response_t* base_invite_data_response_1 = instantiate_base_invite_data_response(include_optional);

	cJSON* jsonbase_invite_data_response_1 = base_invite_data_response_convertToJSON(base_invite_data_response_1);
	printf("base_invite_data_response :\n%s\n", cJSON_Print(jsonbase_invite_data_response_1));
	base_invite_data_response_t* base_invite_data_response_2 = base_invite_data_response_parseFromJSON(jsonbase_invite_data_response_1);
	cJSON* jsonbase_invite_data_response_2 = base_invite_data_response_convertToJSON(base_invite_data_response_2);
	printf("repeating base_invite_data_response:\n%s\n", cJSON_Print(jsonbase_invite_data_response_2));
}

int main() {
  test_base_invite_data_response(1);
  test_base_invite_data_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // base_invite_data_response_MAIN
#endif // base_invite_data_response_TEST
