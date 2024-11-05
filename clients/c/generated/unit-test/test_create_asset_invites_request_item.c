#ifndef create_asset_invites_request_item_TEST
#define create_asset_invites_request_item_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_asset_invites_request_item_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_asset_invites_request_item.h"
create_asset_invites_request_item_t* instantiate_create_asset_invites_request_item(int include_optional);



create_asset_invites_request_item_t* instantiate_create_asset_invites_request_item(int include_optional) {
  create_asset_invites_request_item_t* create_asset_invites_request_item = NULL;
  if (include_optional) {
    create_asset_invites_request_item = create_asset_invites_request_item_create(
      "1234567890123",
      pinterest_rest_api_create_asset_invites_request_item__"MEMBER_INVITE",
      {"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]}
    );
  } else {
    create_asset_invites_request_item = create_asset_invites_request_item_create(
      "1234567890123",
      pinterest_rest_api_create_asset_invites_request_item__"MEMBER_INVITE",
      {"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]}
    );
  }

  return create_asset_invites_request_item;
}


#ifdef create_asset_invites_request_item_MAIN

void test_create_asset_invites_request_item(int include_optional) {
    create_asset_invites_request_item_t* create_asset_invites_request_item_1 = instantiate_create_asset_invites_request_item(include_optional);

	cJSON* jsoncreate_asset_invites_request_item_1 = create_asset_invites_request_item_convertToJSON(create_asset_invites_request_item_1);
	printf("create_asset_invites_request_item :\n%s\n", cJSON_Print(jsoncreate_asset_invites_request_item_1));
	create_asset_invites_request_item_t* create_asset_invites_request_item_2 = create_asset_invites_request_item_parseFromJSON(jsoncreate_asset_invites_request_item_1);
	cJSON* jsoncreate_asset_invites_request_item_2 = create_asset_invites_request_item_convertToJSON(create_asset_invites_request_item_2);
	printf("repeating create_asset_invites_request_item:\n%s\n", cJSON_Print(jsoncreate_asset_invites_request_item_2));
}

int main() {
  test_create_asset_invites_request_item(1);
  test_create_asset_invites_request_item(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_asset_invites_request_item_MAIN
#endif // create_asset_invites_request_item_TEST
