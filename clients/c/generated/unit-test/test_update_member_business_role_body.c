#ifndef update_member_business_role_body_TEST
#define update_member_business_role_body_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define update_member_business_role_body_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/update_member_business_role_body.h"
update_member_business_role_body_t* instantiate_update_member_business_role_body(int include_optional);



update_member_business_role_body_t* instantiate_update_member_business_role_body(int include_optional) {
  update_member_business_role_body_t* update_member_business_role_body = NULL;
  if (include_optional) {
    update_member_business_role_body = update_member_business_role_body_create(
      pinterest_rest_api_update_member_business_role_body__"BIZ_ADMIN",
      "140943737684417"
    );
  } else {
    update_member_business_role_body = update_member_business_role_body_create(
      pinterest_rest_api_update_member_business_role_body__"BIZ_ADMIN",
      "140943737684417"
    );
  }

  return update_member_business_role_body;
}


#ifdef update_member_business_role_body_MAIN

void test_update_member_business_role_body(int include_optional) {
    update_member_business_role_body_t* update_member_business_role_body_1 = instantiate_update_member_business_role_body(include_optional);

	cJSON* jsonupdate_member_business_role_body_1 = update_member_business_role_body_convertToJSON(update_member_business_role_body_1);
	printf("update_member_business_role_body :\n%s\n", cJSON_Print(jsonupdate_member_business_role_body_1));
	update_member_business_role_body_t* update_member_business_role_body_2 = update_member_business_role_body_parseFromJSON(jsonupdate_member_business_role_body_1);
	cJSON* jsonupdate_member_business_role_body_2 = update_member_business_role_body_convertToJSON(update_member_business_role_body_2);
	printf("repeating update_member_business_role_body:\n%s\n", cJSON_Print(jsonupdate_member_business_role_body_2));
}

int main() {
  test_update_member_business_role_body(1);
  test_update_member_business_role_body(0);

  printf("Hello world \n");
  return 0;
}

#endif // update_member_business_role_body_MAIN
#endif // update_member_business_role_body_TEST
