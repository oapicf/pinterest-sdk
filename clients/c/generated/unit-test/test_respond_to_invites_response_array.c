#ifndef respond_to_invites_response_array_TEST
#define respond_to_invites_response_array_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define respond_to_invites_response_array_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/respond_to_invites_response_array.h"
respond_to_invites_response_array_t* instantiate_respond_to_invites_response_array(int include_optional);



respond_to_invites_response_array_t* instantiate_respond_to_invites_response_array(int include_optional) {
  respond_to_invites_response_array_t* respond_to_invites_response_array = NULL;
  if (include_optional) {
    respond_to_invites_response_array = respond_to_invites_response_array_create(
      list_createList()
    );
  } else {
    respond_to_invites_response_array = respond_to_invites_response_array_create(
      list_createList()
    );
  }

  return respond_to_invites_response_array;
}


#ifdef respond_to_invites_response_array_MAIN

void test_respond_to_invites_response_array(int include_optional) {
    respond_to_invites_response_array_t* respond_to_invites_response_array_1 = instantiate_respond_to_invites_response_array(include_optional);

	cJSON* jsonrespond_to_invites_response_array_1 = respond_to_invites_response_array_convertToJSON(respond_to_invites_response_array_1);
	printf("respond_to_invites_response_array :\n%s\n", cJSON_Print(jsonrespond_to_invites_response_array_1));
	respond_to_invites_response_array_t* respond_to_invites_response_array_2 = respond_to_invites_response_array_parseFromJSON(jsonrespond_to_invites_response_array_1);
	cJSON* jsonrespond_to_invites_response_array_2 = respond_to_invites_response_array_convertToJSON(respond_to_invites_response_array_2);
	printf("repeating respond_to_invites_response_array:\n%s\n", cJSON_Print(jsonrespond_to_invites_response_array_2));
}

int main() {
  test_respond_to_invites_response_array(1);
  test_respond_to_invites_response_array(0);

  printf("Hello world \n");
  return 0;
}

#endif // respond_to_invites_response_array_MAIN
#endif // respond_to_invites_response_array_TEST
