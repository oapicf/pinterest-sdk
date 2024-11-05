#ifndef invite_type_TEST
#define invite_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define invite_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/invite_type.h"
invite_type_t* instantiate_invite_type(int include_optional);



invite_type_t* instantiate_invite_type(int include_optional) {
  invite_type_t* invite_type = NULL;
  if (include_optional) {
    invite_type = invite_type_create(
    );
  } else {
    invite_type = invite_type_create(
    );
  }

  return invite_type;
}


#ifdef invite_type_MAIN

void test_invite_type(int include_optional) {
    invite_type_t* invite_type_1 = instantiate_invite_type(include_optional);

	cJSON* jsoninvite_type_1 = invite_type_convertToJSON(invite_type_1);
	printf("invite_type :\n%s\n", cJSON_Print(jsoninvite_type_1));
	invite_type_t* invite_type_2 = invite_type_parseFromJSON(jsoninvite_type_1);
	cJSON* jsoninvite_type_2 = invite_type_convertToJSON(invite_type_2);
	printf("repeating invite_type:\n%s\n", cJSON_Print(jsoninvite_type_2));
}

int main() {
  test_invite_type(1);
  test_invite_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // invite_type_MAIN
#endif // invite_type_TEST
