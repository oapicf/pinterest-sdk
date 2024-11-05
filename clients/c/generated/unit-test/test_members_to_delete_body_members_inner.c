#ifndef members_to_delete_body_members_inner_TEST
#define members_to_delete_body_members_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define members_to_delete_body_members_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/members_to_delete_body_members_inner.h"
members_to_delete_body_members_inner_t* instantiate_members_to_delete_body_members_inner(int include_optional);



members_to_delete_body_members_inner_t* instantiate_members_to_delete_body_members_inner(int include_optional) {
  members_to_delete_body_members_inner_t* members_to_delete_body_members_inner = NULL;
  if (include_optional) {
    members_to_delete_body_members_inner = members_to_delete_body_members_inner_create(
      "140943737684417",
      pinterest_rest_api_members_to_delete_body_members_inner__"BIZ_ADMIN"
    );
  } else {
    members_to_delete_body_members_inner = members_to_delete_body_members_inner_create(
      "140943737684417",
      pinterest_rest_api_members_to_delete_body_members_inner__"BIZ_ADMIN"
    );
  }

  return members_to_delete_body_members_inner;
}


#ifdef members_to_delete_body_members_inner_MAIN

void test_members_to_delete_body_members_inner(int include_optional) {
    members_to_delete_body_members_inner_t* members_to_delete_body_members_inner_1 = instantiate_members_to_delete_body_members_inner(include_optional);

	cJSON* jsonmembers_to_delete_body_members_inner_1 = members_to_delete_body_members_inner_convertToJSON(members_to_delete_body_members_inner_1);
	printf("members_to_delete_body_members_inner :\n%s\n", cJSON_Print(jsonmembers_to_delete_body_members_inner_1));
	members_to_delete_body_members_inner_t* members_to_delete_body_members_inner_2 = members_to_delete_body_members_inner_parseFromJSON(jsonmembers_to_delete_body_members_inner_1);
	cJSON* jsonmembers_to_delete_body_members_inner_2 = members_to_delete_body_members_inner_convertToJSON(members_to_delete_body_members_inner_2);
	printf("repeating members_to_delete_body_members_inner:\n%s\n", cJSON_Print(jsonmembers_to_delete_body_members_inner_2));
}

int main() {
  test_members_to_delete_body_members_inner(1);
  test_members_to_delete_body_members_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // members_to_delete_body_members_inner_MAIN
#endif // members_to_delete_body_members_inner_TEST
