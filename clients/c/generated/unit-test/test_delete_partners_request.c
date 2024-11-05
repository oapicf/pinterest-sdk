#ifndef delete_partners_request_TEST
#define delete_partners_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define delete_partners_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/delete_partners_request.h"
delete_partners_request_t* instantiate_delete_partners_request(int include_optional);

#include "test_char.c"


delete_partners_request_t* instantiate_delete_partners_request(int include_optional) {
  delete_partners_request_t* delete_partners_request = NULL;
  if (include_optional) {
    delete_partners_request = delete_partners_request_create(
      list_createList(),
      "0"
    );
  } else {
    delete_partners_request = delete_partners_request_create(
      list_createList(),
      "0"
    );
  }

  return delete_partners_request;
}


#ifdef delete_partners_request_MAIN

void test_delete_partners_request(int include_optional) {
    delete_partners_request_t* delete_partners_request_1 = instantiate_delete_partners_request(include_optional);

	cJSON* jsondelete_partners_request_1 = delete_partners_request_convertToJSON(delete_partners_request_1);
	printf("delete_partners_request :\n%s\n", cJSON_Print(jsondelete_partners_request_1));
	delete_partners_request_t* delete_partners_request_2 = delete_partners_request_parseFromJSON(jsondelete_partners_request_1);
	cJSON* jsondelete_partners_request_2 = delete_partners_request_convertToJSON(delete_partners_request_2);
	printf("repeating delete_partners_request:\n%s\n", cJSON_Print(jsondelete_partners_request_2));
}

int main() {
  test_delete_partners_request(1);
  test_delete_partners_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // delete_partners_request_MAIN
#endif // delete_partners_request_TEST
