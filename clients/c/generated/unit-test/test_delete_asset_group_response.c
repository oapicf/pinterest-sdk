#ifndef delete_asset_group_response_TEST
#define delete_asset_group_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define delete_asset_group_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/delete_asset_group_response.h"
delete_asset_group_response_t* instantiate_delete_asset_group_response(int include_optional);



delete_asset_group_response_t* instantiate_delete_asset_group_response(int include_optional) {
  delete_asset_group_response_t* delete_asset_group_response = NULL;
  if (include_optional) {
    delete_asset_group_response = delete_asset_group_response_create(
      list_createList(),
      list_createList()
    );
  } else {
    delete_asset_group_response = delete_asset_group_response_create(
      list_createList(),
      list_createList()
    );
  }

  return delete_asset_group_response;
}


#ifdef delete_asset_group_response_MAIN

void test_delete_asset_group_response(int include_optional) {
    delete_asset_group_response_t* delete_asset_group_response_1 = instantiate_delete_asset_group_response(include_optional);

	cJSON* jsondelete_asset_group_response_1 = delete_asset_group_response_convertToJSON(delete_asset_group_response_1);
	printf("delete_asset_group_response :\n%s\n", cJSON_Print(jsondelete_asset_group_response_1));
	delete_asset_group_response_t* delete_asset_group_response_2 = delete_asset_group_response_parseFromJSON(jsondelete_asset_group_response_1);
	cJSON* jsondelete_asset_group_response_2 = delete_asset_group_response_convertToJSON(delete_asset_group_response_2);
	printf("repeating delete_asset_group_response:\n%s\n", cJSON_Print(jsondelete_asset_group_response_2));
}

int main() {
  test_delete_asset_group_response(1);
  test_delete_asset_group_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // delete_asset_group_response_MAIN
#endif // delete_asset_group_response_TEST
