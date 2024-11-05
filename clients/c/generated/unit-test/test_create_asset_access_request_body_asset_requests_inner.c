#ifndef create_asset_access_request_body_asset_requests_inner_TEST
#define create_asset_access_request_body_asset_requests_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_asset_access_request_body_asset_requests_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_asset_access_request_body_asset_requests_inner.h"
create_asset_access_request_body_asset_requests_inner_t* instantiate_create_asset_access_request_body_asset_requests_inner(int include_optional);



create_asset_access_request_body_asset_requests_inner_t* instantiate_create_asset_access_request_body_asset_requests_inner(int include_optional) {
  create_asset_access_request_body_asset_requests_inner_t* create_asset_access_request_body_asset_requests_inner = NULL;
  if (include_optional) {
    create_asset_access_request_body_asset_requests_inner = create_asset_access_request_body_asset_requests_inner_create(
      "809944451643622187",
      {"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]}
    );
  } else {
    create_asset_access_request_body_asset_requests_inner = create_asset_access_request_body_asset_requests_inner_create(
      "809944451643622187",
      {"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]}
    );
  }

  return create_asset_access_request_body_asset_requests_inner;
}


#ifdef create_asset_access_request_body_asset_requests_inner_MAIN

void test_create_asset_access_request_body_asset_requests_inner(int include_optional) {
    create_asset_access_request_body_asset_requests_inner_t* create_asset_access_request_body_asset_requests_inner_1 = instantiate_create_asset_access_request_body_asset_requests_inner(include_optional);

	cJSON* jsoncreate_asset_access_request_body_asset_requests_inner_1 = create_asset_access_request_body_asset_requests_inner_convertToJSON(create_asset_access_request_body_asset_requests_inner_1);
	printf("create_asset_access_request_body_asset_requests_inner :\n%s\n", cJSON_Print(jsoncreate_asset_access_request_body_asset_requests_inner_1));
	create_asset_access_request_body_asset_requests_inner_t* create_asset_access_request_body_asset_requests_inner_2 = create_asset_access_request_body_asset_requests_inner_parseFromJSON(jsoncreate_asset_access_request_body_asset_requests_inner_1);
	cJSON* jsoncreate_asset_access_request_body_asset_requests_inner_2 = create_asset_access_request_body_asset_requests_inner_convertToJSON(create_asset_access_request_body_asset_requests_inner_2);
	printf("repeating create_asset_access_request_body_asset_requests_inner:\n%s\n", cJSON_Print(jsoncreate_asset_access_request_body_asset_requests_inner_2));
}

int main() {
  test_create_asset_access_request_body_asset_requests_inner(1);
  test_create_asset_access_request_body_asset_requests_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_asset_access_request_body_asset_requests_inner_MAIN
#endif // create_asset_access_request_body_asset_requests_inner_TEST
