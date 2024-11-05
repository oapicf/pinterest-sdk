#ifndef delete_member_access_result_TEST
#define delete_member_access_result_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define delete_member_access_result_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/delete_member_access_result.h"
delete_member_access_result_t* instantiate_delete_member_access_result(int include_optional);



delete_member_access_result_t* instantiate_delete_member_access_result(int include_optional) {
  delete_member_access_result_t* delete_member_access_result = NULL;
  if (include_optional) {
    delete_member_access_result = delete_member_access_result_create(
      "549755885175",
      "140943737684417"
    );
  } else {
    delete_member_access_result = delete_member_access_result_create(
      "549755885175",
      "140943737684417"
    );
  }

  return delete_member_access_result;
}


#ifdef delete_member_access_result_MAIN

void test_delete_member_access_result(int include_optional) {
    delete_member_access_result_t* delete_member_access_result_1 = instantiate_delete_member_access_result(include_optional);

	cJSON* jsondelete_member_access_result_1 = delete_member_access_result_convertToJSON(delete_member_access_result_1);
	printf("delete_member_access_result :\n%s\n", cJSON_Print(jsondelete_member_access_result_1));
	delete_member_access_result_t* delete_member_access_result_2 = delete_member_access_result_parseFromJSON(jsondelete_member_access_result_1);
	cJSON* jsondelete_member_access_result_2 = delete_member_access_result_convertToJSON(delete_member_access_result_2);
	printf("repeating delete_member_access_result:\n%s\n", cJSON_Print(jsondelete_member_access_result_2));
}

int main() {
  test_delete_member_access_result(1);
  test_delete_member_access_result(0);

  printf("Hello world \n");
  return 0;
}

#endif // delete_member_access_result_MAIN
#endif // delete_member_access_result_TEST
