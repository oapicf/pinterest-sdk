#ifndef create_asset_invites_request_TEST
#define create_asset_invites_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_asset_invites_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_asset_invites_request.h"
create_asset_invites_request_t* instantiate_create_asset_invites_request(int include_optional);



create_asset_invites_request_t* instantiate_create_asset_invites_request(int include_optional) {
  create_asset_invites_request_t* create_asset_invites_request = NULL;
  if (include_optional) {
    create_asset_invites_request = create_asset_invites_request_create(
      list_createList()
    );
  } else {
    create_asset_invites_request = create_asset_invites_request_create(
      list_createList()
    );
  }

  return create_asset_invites_request;
}


#ifdef create_asset_invites_request_MAIN

void test_create_asset_invites_request(int include_optional) {
    create_asset_invites_request_t* create_asset_invites_request_1 = instantiate_create_asset_invites_request(include_optional);

	cJSON* jsoncreate_asset_invites_request_1 = create_asset_invites_request_convertToJSON(create_asset_invites_request_1);
	printf("create_asset_invites_request :\n%s\n", cJSON_Print(jsoncreate_asset_invites_request_1));
	create_asset_invites_request_t* create_asset_invites_request_2 = create_asset_invites_request_parseFromJSON(jsoncreate_asset_invites_request_1);
	cJSON* jsoncreate_asset_invites_request_2 = create_asset_invites_request_convertToJSON(create_asset_invites_request_2);
	printf("repeating create_asset_invites_request:\n%s\n", cJSON_Print(jsoncreate_asset_invites_request_2));
}

int main() {
  test_create_asset_invites_request(1);
  test_create_asset_invites_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_asset_invites_request_MAIN
#endif // create_asset_invites_request_TEST
