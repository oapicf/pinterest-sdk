#ifndef create_asset_access_request_response_TEST
#define create_asset_access_request_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_asset_access_request_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_asset_access_request_response.h"
create_asset_access_request_response_t* instantiate_create_asset_access_request_response(int include_optional);



create_asset_access_request_response_t* instantiate_create_asset_access_request_response(int include_optional) {
  create_asset_access_request_response_t* create_asset_access_request_response = NULL;
  if (include_optional) {
    create_asset_access_request_response = create_asset_access_request_response_create(
      list_createList(),
      {"766456567741825556":"5349280584552211583","733242520489967216":"5349280584552211845"}
    );
  } else {
    create_asset_access_request_response = create_asset_access_request_response_create(
      list_createList(),
      {"766456567741825556":"5349280584552211583","733242520489967216":"5349280584552211845"}
    );
  }

  return create_asset_access_request_response;
}


#ifdef create_asset_access_request_response_MAIN

void test_create_asset_access_request_response(int include_optional) {
    create_asset_access_request_response_t* create_asset_access_request_response_1 = instantiate_create_asset_access_request_response(include_optional);

	cJSON* jsoncreate_asset_access_request_response_1 = create_asset_access_request_response_convertToJSON(create_asset_access_request_response_1);
	printf("create_asset_access_request_response :\n%s\n", cJSON_Print(jsoncreate_asset_access_request_response_1));
	create_asset_access_request_response_t* create_asset_access_request_response_2 = create_asset_access_request_response_parseFromJSON(jsoncreate_asset_access_request_response_1);
	cJSON* jsoncreate_asset_access_request_response_2 = create_asset_access_request_response_convertToJSON(create_asset_access_request_response_2);
	printf("repeating create_asset_access_request_response:\n%s\n", cJSON_Print(jsoncreate_asset_access_request_response_2));
}

int main() {
  test_create_asset_access_request_response(1);
  test_create_asset_access_request_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_asset_access_request_response_MAIN
#endif // create_asset_access_request_response_TEST
