#ifndef create_asset_access_request_error_message_inner_TEST
#define create_asset_access_request_error_message_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_asset_access_request_error_message_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_asset_access_request_error_message_inner.h"
create_asset_access_request_error_message_inner_t* instantiate_create_asset_access_request_error_message_inner(int include_optional);



create_asset_access_request_error_message_inner_t* instantiate_create_asset_access_request_error_message_inner(int include_optional) {
  create_asset_access_request_error_message_inner_t* create_asset_access_request_error_message_inner = NULL;
  if (include_optional) {
    create_asset_access_request_error_message_inner = create_asset_access_request_error_message_inner_create(
      2932,
      ["Invalid asset id: 549760723247","Invalid asset id: 546760723248"]
    );
  } else {
    create_asset_access_request_error_message_inner = create_asset_access_request_error_message_inner_create(
      2932,
      ["Invalid asset id: 549760723247","Invalid asset id: 546760723248"]
    );
  }

  return create_asset_access_request_error_message_inner;
}


#ifdef create_asset_access_request_error_message_inner_MAIN

void test_create_asset_access_request_error_message_inner(int include_optional) {
    create_asset_access_request_error_message_inner_t* create_asset_access_request_error_message_inner_1 = instantiate_create_asset_access_request_error_message_inner(include_optional);

	cJSON* jsoncreate_asset_access_request_error_message_inner_1 = create_asset_access_request_error_message_inner_convertToJSON(create_asset_access_request_error_message_inner_1);
	printf("create_asset_access_request_error_message_inner :\n%s\n", cJSON_Print(jsoncreate_asset_access_request_error_message_inner_1));
	create_asset_access_request_error_message_inner_t* create_asset_access_request_error_message_inner_2 = create_asset_access_request_error_message_inner_parseFromJSON(jsoncreate_asset_access_request_error_message_inner_1);
	cJSON* jsoncreate_asset_access_request_error_message_inner_2 = create_asset_access_request_error_message_inner_convertToJSON(create_asset_access_request_error_message_inner_2);
	printf("repeating create_asset_access_request_error_message_inner:\n%s\n", cJSON_Print(jsoncreate_asset_access_request_error_message_inner_2));
}

int main() {
  test_create_asset_access_request_error_message_inner(1);
  test_create_asset_access_request_error_message_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_asset_access_request_error_message_inner_MAIN
#endif // create_asset_access_request_error_message_inner_TEST
