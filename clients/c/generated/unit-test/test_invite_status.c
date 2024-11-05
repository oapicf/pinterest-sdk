#ifndef invite_status_TEST
#define invite_status_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define invite_status_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/invite_status.h"
invite_status_t* instantiate_invite_status(int include_optional);



invite_status_t* instantiate_invite_status(int include_optional) {
  invite_status_t* invite_status = NULL;
  if (include_optional) {
    invite_status = invite_status_create(
    );
  } else {
    invite_status = invite_status_create(
    );
  }

  return invite_status;
}


#ifdef invite_status_MAIN

void test_invite_status(int include_optional) {
    invite_status_t* invite_status_1 = instantiate_invite_status(include_optional);

	cJSON* jsoninvite_status_1 = invite_status_convertToJSON(invite_status_1);
	printf("invite_status :\n%s\n", cJSON_Print(jsoninvite_status_1));
	invite_status_t* invite_status_2 = invite_status_parseFromJSON(jsoninvite_status_1);
	cJSON* jsoninvite_status_2 = invite_status_convertToJSON(invite_status_2);
	printf("repeating invite_status:\n%s\n", cJSON_Print(jsoninvite_status_2));
}

int main() {
  test_invite_status(1);
  test_invite_status(0);

  printf("Hello world \n");
  return 0;
}

#endif // invite_status_MAIN
#endif // invite_status_TEST
