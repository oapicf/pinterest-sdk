#ifndef deleted_members_response_TEST
#define deleted_members_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define deleted_members_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/deleted_members_response.h"
deleted_members_response_t* instantiate_deleted_members_response(int include_optional);



deleted_members_response_t* instantiate_deleted_members_response(int include_optional) {
  deleted_members_response_t* deleted_members_response = NULL;
  if (include_optional) {
    deleted_members_response = deleted_members_response_create(
      ["809944451643622187","383791336903426391"]
    );
  } else {
    deleted_members_response = deleted_members_response_create(
      ["809944451643622187","383791336903426391"]
    );
  }

  return deleted_members_response;
}


#ifdef deleted_members_response_MAIN

void test_deleted_members_response(int include_optional) {
    deleted_members_response_t* deleted_members_response_1 = instantiate_deleted_members_response(include_optional);

	cJSON* jsondeleted_members_response_1 = deleted_members_response_convertToJSON(deleted_members_response_1);
	printf("deleted_members_response :\n%s\n", cJSON_Print(jsondeleted_members_response_1));
	deleted_members_response_t* deleted_members_response_2 = deleted_members_response_parseFromJSON(jsondeleted_members_response_1);
	cJSON* jsondeleted_members_response_2 = deleted_members_response_convertToJSON(deleted_members_response_2);
	printf("repeating deleted_members_response:\n%s\n", cJSON_Print(jsondeleted_members_response_2));
}

int main() {
  test_deleted_members_response(1);
  test_deleted_members_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // deleted_members_response_MAIN
#endif // deleted_members_response_TEST
