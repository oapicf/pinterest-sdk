#ifndef update_member_result_TEST
#define update_member_result_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define update_member_result_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/update_member_result.h"
update_member_result_t* instantiate_update_member_result(int include_optional);



update_member_result_t* instantiate_update_member_result(int include_optional) {
  update_member_result_t* update_member_result = NULL;
  if (include_optional) {
    update_member_result = update_member_result_create(
      "EMPLOYEE",
      "140943737684417"
    );
  } else {
    update_member_result = update_member_result_create(
      "EMPLOYEE",
      "140943737684417"
    );
  }

  return update_member_result;
}


#ifdef update_member_result_MAIN

void test_update_member_result(int include_optional) {
    update_member_result_t* update_member_result_1 = instantiate_update_member_result(include_optional);

	cJSON* jsonupdate_member_result_1 = update_member_result_convertToJSON(update_member_result_1);
	printf("update_member_result :\n%s\n", cJSON_Print(jsonupdate_member_result_1));
	update_member_result_t* update_member_result_2 = update_member_result_parseFromJSON(jsonupdate_member_result_1);
	cJSON* jsonupdate_member_result_2 = update_member_result_convertToJSON(update_member_result_2);
	printf("repeating update_member_result:\n%s\n", cJSON_Print(jsonupdate_member_result_2));
}

int main() {
  test_update_member_result(1);
  test_update_member_result(0);

  printf("Hello world \n");
  return 0;
}

#endif // update_member_result_MAIN
#endif // update_member_result_TEST
