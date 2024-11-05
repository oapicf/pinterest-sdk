#ifndef create_asset_group_response_TEST
#define create_asset_group_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_asset_group_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_asset_group_response.h"
create_asset_group_response_t* instantiate_create_asset_group_response(int include_optional);

#include "test_asset_group_binding.c"


create_asset_group_response_t* instantiate_create_asset_group_response(int include_optional) {
  create_asset_group_response_t* create_asset_group_response = NULL;
  if (include_optional) {
    create_asset_group_response = create_asset_group_response_create(
       // false, not to have infinite recursion
      instantiate_asset_group_binding(0)
    );
  } else {
    create_asset_group_response = create_asset_group_response_create(
      NULL
    );
  }

  return create_asset_group_response;
}


#ifdef create_asset_group_response_MAIN

void test_create_asset_group_response(int include_optional) {
    create_asset_group_response_t* create_asset_group_response_1 = instantiate_create_asset_group_response(include_optional);

	cJSON* jsoncreate_asset_group_response_1 = create_asset_group_response_convertToJSON(create_asset_group_response_1);
	printf("create_asset_group_response :\n%s\n", cJSON_Print(jsoncreate_asset_group_response_1));
	create_asset_group_response_t* create_asset_group_response_2 = create_asset_group_response_parseFromJSON(jsoncreate_asset_group_response_1);
	cJSON* jsoncreate_asset_group_response_2 = create_asset_group_response_convertToJSON(create_asset_group_response_2);
	printf("repeating create_asset_group_response:\n%s\n", cJSON_Print(jsoncreate_asset_group_response_2));
}

int main() {
  test_create_asset_group_response(1);
  test_create_asset_group_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_asset_group_response_MAIN
#endif // create_asset_group_response_TEST
