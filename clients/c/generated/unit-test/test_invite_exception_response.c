#ifndef invite_exception_response_TEST
#define invite_exception_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define invite_exception_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/invite_exception_response.h"
invite_exception_response_t* instantiate_invite_exception_response(int include_optional);



invite_exception_response_t* instantiate_invite_exception_response(int include_optional) {
  invite_exception_response_t* invite_exception_response = NULL;
  if (include_optional) {
    invite_exception_response = invite_exception_response_create(
      "383791336903426391",
      403,
      "You hit the maximum number of pending invites allowed.",
      ["businessMember0101","business+member@business.com"]
    );
  } else {
    invite_exception_response = invite_exception_response_create(
      "383791336903426391",
      403,
      "You hit the maximum number of pending invites allowed.",
      ["businessMember0101","business+member@business.com"]
    );
  }

  return invite_exception_response;
}


#ifdef invite_exception_response_MAIN

void test_invite_exception_response(int include_optional) {
    invite_exception_response_t* invite_exception_response_1 = instantiate_invite_exception_response(include_optional);

	cJSON* jsoninvite_exception_response_1 = invite_exception_response_convertToJSON(invite_exception_response_1);
	printf("invite_exception_response :\n%s\n", cJSON_Print(jsoninvite_exception_response_1));
	invite_exception_response_t* invite_exception_response_2 = invite_exception_response_parseFromJSON(jsoninvite_exception_response_1);
	cJSON* jsoninvite_exception_response_2 = invite_exception_response_convertToJSON(invite_exception_response_2);
	printf("repeating invite_exception_response:\n%s\n", cJSON_Print(jsoninvite_exception_response_2));
}

int main() {
  test_invite_exception_response(1);
  test_invite_exception_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // invite_exception_response_MAIN
#endif // invite_exception_response_TEST
