#ifndef base_invite_data_response_invite_data_TEST
#define base_invite_data_response_invite_data_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define base_invite_data_response_invite_data_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/base_invite_data_response_invite_data.h"
base_invite_data_response_invite_data_t* instantiate_base_invite_data_response_invite_data(int include_optional);



base_invite_data_response_invite_data_t* instantiate_base_invite_data_response_invite_data(int include_optional) {
  base_invite_data_response_invite_data_t* base_invite_data_response_invite_data = NULL;
  if (include_optional) {
    base_invite_data_response_invite_data = base_invite_data_response_invite_data_create(
      1709748104775,
      "PENDING",
      "MEMBER_INVITE",
      1646767577816,
      1646767577816
    );
  } else {
    base_invite_data_response_invite_data = base_invite_data_response_invite_data_create(
      1709748104775,
      "PENDING",
      "MEMBER_INVITE",
      1646767577816,
      1646767577816
    );
  }

  return base_invite_data_response_invite_data;
}


#ifdef base_invite_data_response_invite_data_MAIN

void test_base_invite_data_response_invite_data(int include_optional) {
    base_invite_data_response_invite_data_t* base_invite_data_response_invite_data_1 = instantiate_base_invite_data_response_invite_data(include_optional);

	cJSON* jsonbase_invite_data_response_invite_data_1 = base_invite_data_response_invite_data_convertToJSON(base_invite_data_response_invite_data_1);
	printf("base_invite_data_response_invite_data :\n%s\n", cJSON_Print(jsonbase_invite_data_response_invite_data_1));
	base_invite_data_response_invite_data_t* base_invite_data_response_invite_data_2 = base_invite_data_response_invite_data_parseFromJSON(jsonbase_invite_data_response_invite_data_1);
	cJSON* jsonbase_invite_data_response_invite_data_2 = base_invite_data_response_invite_data_convertToJSON(base_invite_data_response_invite_data_2);
	printf("repeating base_invite_data_response_invite_data:\n%s\n", cJSON_Print(jsonbase_invite_data_response_invite_data_2));
}

int main() {
  test_base_invite_data_response_invite_data(1);
  test_base_invite_data_response_invite_data(0);

  printf("Hello world \n");
  return 0;
}

#endif // base_invite_data_response_invite_data_MAIN
#endif // base_invite_data_response_invite_data_TEST
