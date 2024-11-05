#ifndef create_invites_results_response_array_TEST
#define create_invites_results_response_array_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_invites_results_response_array_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_invites_results_response_array.h"
create_invites_results_response_array_t* instantiate_create_invites_results_response_array(int include_optional);



create_invites_results_response_array_t* instantiate_create_invites_results_response_array(int include_optional) {
  create_invites_results_response_array_t* create_invites_results_response_array = NULL;
  if (include_optional) {
    create_invites_results_response_array = create_invites_results_response_array_create(
      list_createList()
    );
  } else {
    create_invites_results_response_array = create_invites_results_response_array_create(
      list_createList()
    );
  }

  return create_invites_results_response_array;
}


#ifdef create_invites_results_response_array_MAIN

void test_create_invites_results_response_array(int include_optional) {
    create_invites_results_response_array_t* create_invites_results_response_array_1 = instantiate_create_invites_results_response_array(include_optional);

	cJSON* jsoncreate_invites_results_response_array_1 = create_invites_results_response_array_convertToJSON(create_invites_results_response_array_1);
	printf("create_invites_results_response_array :\n%s\n", cJSON_Print(jsoncreate_invites_results_response_array_1));
	create_invites_results_response_array_t* create_invites_results_response_array_2 = create_invites_results_response_array_parseFromJSON(jsoncreate_invites_results_response_array_1);
	cJSON* jsoncreate_invites_results_response_array_2 = create_invites_results_response_array_convertToJSON(create_invites_results_response_array_2);
	printf("repeating create_invites_results_response_array:\n%s\n", cJSON_Print(jsoncreate_invites_results_response_array_2));
}

int main() {
  test_create_invites_results_response_array(1);
  test_create_invites_results_response_array(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_invites_results_response_array_MAIN
#endif // create_invites_results_response_array_TEST
