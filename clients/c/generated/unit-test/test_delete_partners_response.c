#ifndef delete_partners_response_TEST
#define delete_partners_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define delete_partners_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/delete_partners_response.h"
delete_partners_response_t* instantiate_delete_partners_response(int include_optional);



delete_partners_response_t* instantiate_delete_partners_response(int include_optional) {
  delete_partners_response_t* delete_partners_response = NULL;
  if (include_optional) {
    delete_partners_response = delete_partners_response_create(
      ["809944451643622187","383791336903426391"]
    );
  } else {
    delete_partners_response = delete_partners_response_create(
      ["809944451643622187","383791336903426391"]
    );
  }

  return delete_partners_response;
}


#ifdef delete_partners_response_MAIN

void test_delete_partners_response(int include_optional) {
    delete_partners_response_t* delete_partners_response_1 = instantiate_delete_partners_response(include_optional);

	cJSON* jsondelete_partners_response_1 = delete_partners_response_convertToJSON(delete_partners_response_1);
	printf("delete_partners_response :\n%s\n", cJSON_Print(jsondelete_partners_response_1));
	delete_partners_response_t* delete_partners_response_2 = delete_partners_response_parseFromJSON(jsondelete_partners_response_1);
	cJSON* jsondelete_partners_response_2 = delete_partners_response_convertToJSON(delete_partners_response_2);
	printf("repeating delete_partners_response:\n%s\n", cJSON_Print(jsondelete_partners_response_2));
}

int main() {
  test_delete_partners_response(1);
  test_delete_partners_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // delete_partners_response_MAIN
#endif // delete_partners_response_TEST
