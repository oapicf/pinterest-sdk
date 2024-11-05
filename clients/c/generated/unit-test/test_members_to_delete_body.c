#ifndef members_to_delete_body_TEST
#define members_to_delete_body_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define members_to_delete_body_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/members_to_delete_body.h"
members_to_delete_body_t* instantiate_members_to_delete_body(int include_optional);



members_to_delete_body_t* instantiate_members_to_delete_body(int include_optional) {
  members_to_delete_body_t* members_to_delete_body = NULL;
  if (include_optional) {
    members_to_delete_body = members_to_delete_body_create(
      list_createList()
    );
  } else {
    members_to_delete_body = members_to_delete_body_create(
      list_createList()
    );
  }

  return members_to_delete_body;
}


#ifdef members_to_delete_body_MAIN

void test_members_to_delete_body(int include_optional) {
    members_to_delete_body_t* members_to_delete_body_1 = instantiate_members_to_delete_body(include_optional);

	cJSON* jsonmembers_to_delete_body_1 = members_to_delete_body_convertToJSON(members_to_delete_body_1);
	printf("members_to_delete_body :\n%s\n", cJSON_Print(jsonmembers_to_delete_body_1));
	members_to_delete_body_t* members_to_delete_body_2 = members_to_delete_body_parseFromJSON(jsonmembers_to_delete_body_1);
	cJSON* jsonmembers_to_delete_body_2 = members_to_delete_body_convertToJSON(members_to_delete_body_2);
	printf("repeating members_to_delete_body:\n%s\n", cJSON_Print(jsonmembers_to_delete_body_2));
}

int main() {
  test_members_to_delete_body(1);
  test_members_to_delete_body(0);

  printf("Hello world \n");
  return 0;
}

#endif // members_to_delete_body_MAIN
#endif // members_to_delete_body_TEST
