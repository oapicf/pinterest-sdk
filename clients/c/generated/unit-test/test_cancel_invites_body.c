#ifndef cancel_invites_body_TEST
#define cancel_invites_body_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define cancel_invites_body_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/cancel_invites_body.h"
cancel_invites_body_t* instantiate_cancel_invites_body(int include_optional);



cancel_invites_body_t* instantiate_cancel_invites_body(int include_optional) {
  cancel_invites_body_t* cancel_invites_body = NULL;
  if (include_optional) {
    cancel_invites_body = cancel_invites_body_create(
      ["1234567890123456789","1122334455667788991"]
    );
  } else {
    cancel_invites_body = cancel_invites_body_create(
      ["1234567890123456789","1122334455667788991"]
    );
  }

  return cancel_invites_body;
}


#ifdef cancel_invites_body_MAIN

void test_cancel_invites_body(int include_optional) {
    cancel_invites_body_t* cancel_invites_body_1 = instantiate_cancel_invites_body(include_optional);

	cJSON* jsoncancel_invites_body_1 = cancel_invites_body_convertToJSON(cancel_invites_body_1);
	printf("cancel_invites_body :\n%s\n", cJSON_Print(jsoncancel_invites_body_1));
	cancel_invites_body_t* cancel_invites_body_2 = cancel_invites_body_parseFromJSON(jsoncancel_invites_body_1);
	cJSON* jsoncancel_invites_body_2 = cancel_invites_body_convertToJSON(cancel_invites_body_2);
	printf("repeating cancel_invites_body:\n%s\n", cJSON_Print(jsoncancel_invites_body_2));
}

int main() {
  test_cancel_invites_body(1);
  test_cancel_invites_body(0);

  printf("Hello world \n");
  return 0;
}

#endif // cancel_invites_body_MAIN
#endif // cancel_invites_body_TEST
