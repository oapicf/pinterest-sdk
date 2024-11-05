#ifndef delete_asset_group_response_exceptions_inner_TEST
#define delete_asset_group_response_exceptions_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define delete_asset_group_response_exceptions_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/delete_asset_group_response_exceptions_inner.h"
delete_asset_group_response_exceptions_inner_t* instantiate_delete_asset_group_response_exceptions_inner(int include_optional);



delete_asset_group_response_exceptions_inner_t* instantiate_delete_asset_group_response_exceptions_inner(int include_optional) {
  delete_asset_group_response_exceptions_inner_t* delete_asset_group_response_exceptions_inner = NULL;
  if (include_optional) {
    delete_asset_group_response_exceptions_inner = delete_asset_group_response_exceptions_inner_create(
      29,
      "You are not permitted to access that resource.",
      "666791336903426391"
    );
  } else {
    delete_asset_group_response_exceptions_inner = delete_asset_group_response_exceptions_inner_create(
      29,
      "You are not permitted to access that resource.",
      "666791336903426391"
    );
  }

  return delete_asset_group_response_exceptions_inner;
}


#ifdef delete_asset_group_response_exceptions_inner_MAIN

void test_delete_asset_group_response_exceptions_inner(int include_optional) {
    delete_asset_group_response_exceptions_inner_t* delete_asset_group_response_exceptions_inner_1 = instantiate_delete_asset_group_response_exceptions_inner(include_optional);

	cJSON* jsondelete_asset_group_response_exceptions_inner_1 = delete_asset_group_response_exceptions_inner_convertToJSON(delete_asset_group_response_exceptions_inner_1);
	printf("delete_asset_group_response_exceptions_inner :\n%s\n", cJSON_Print(jsondelete_asset_group_response_exceptions_inner_1));
	delete_asset_group_response_exceptions_inner_t* delete_asset_group_response_exceptions_inner_2 = delete_asset_group_response_exceptions_inner_parseFromJSON(jsondelete_asset_group_response_exceptions_inner_1);
	cJSON* jsondelete_asset_group_response_exceptions_inner_2 = delete_asset_group_response_exceptions_inner_convertToJSON(delete_asset_group_response_exceptions_inner_2);
	printf("repeating delete_asset_group_response_exceptions_inner:\n%s\n", cJSON_Print(jsondelete_asset_group_response_exceptions_inner_2));
}

int main() {
  test_delete_asset_group_response_exceptions_inner(1);
  test_delete_asset_group_response_exceptions_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // delete_asset_group_response_exceptions_inner_MAIN
#endif // delete_asset_group_response_exceptions_inner_TEST
