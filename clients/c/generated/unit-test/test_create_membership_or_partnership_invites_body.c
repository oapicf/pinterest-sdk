#ifndef create_membership_or_partnership_invites_body_TEST
#define create_membership_or_partnership_invites_body_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_membership_or_partnership_invites_body_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_membership_or_partnership_invites_body.h"
create_membership_or_partnership_invites_body_t* instantiate_create_membership_or_partnership_invites_body(int include_optional);



create_membership_or_partnership_invites_body_t* instantiate_create_membership_or_partnership_invites_body(int include_optional) {
  create_membership_or_partnership_invites_body_t* create_membership_or_partnership_invites_body = NULL;
  if (include_optional) {
    create_membership_or_partnership_invites_body = create_membership_or_partnership_invites_body_create(
      pinterest_rest_api_create_membership_or_partnership_invites_body_BUSINESSROLE_"BIZ_ADMIN",
      pinterest_rest_api_create_membership_or_partnership_invites_body__"MEMBER_INVITE",
      ["business0101","user@business.com"],
      ["809944451643622187","766456567741825556"]
    );
  } else {
    create_membership_or_partnership_invites_body = create_membership_or_partnership_invites_body_create(
      pinterest_rest_api_create_membership_or_partnership_invites_body_BUSINESSROLE_"BIZ_ADMIN",
      pinterest_rest_api_create_membership_or_partnership_invites_body__"MEMBER_INVITE",
      ["business0101","user@business.com"],
      ["809944451643622187","766456567741825556"]
    );
  }

  return create_membership_or_partnership_invites_body;
}


#ifdef create_membership_or_partnership_invites_body_MAIN

void test_create_membership_or_partnership_invites_body(int include_optional) {
    create_membership_or_partnership_invites_body_t* create_membership_or_partnership_invites_body_1 = instantiate_create_membership_or_partnership_invites_body(include_optional);

	cJSON* jsoncreate_membership_or_partnership_invites_body_1 = create_membership_or_partnership_invites_body_convertToJSON(create_membership_or_partnership_invites_body_1);
	printf("create_membership_or_partnership_invites_body :\n%s\n", cJSON_Print(jsoncreate_membership_or_partnership_invites_body_1));
	create_membership_or_partnership_invites_body_t* create_membership_or_partnership_invites_body_2 = create_membership_or_partnership_invites_body_parseFromJSON(jsoncreate_membership_or_partnership_invites_body_1);
	cJSON* jsoncreate_membership_or_partnership_invites_body_2 = create_membership_or_partnership_invites_body_convertToJSON(create_membership_or_partnership_invites_body_2);
	printf("repeating create_membership_or_partnership_invites_body:\n%s\n", cJSON_Print(jsoncreate_membership_or_partnership_invites_body_2));
}

int main() {
  test_create_membership_or_partnership_invites_body(1);
  test_create_membership_or_partnership_invites_body(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_membership_or_partnership_invites_body_MAIN
#endif // create_membership_or_partnership_invites_body_TEST
