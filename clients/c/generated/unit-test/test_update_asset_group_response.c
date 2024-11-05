#ifndef update_asset_group_response_TEST
#define update_asset_group_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define update_asset_group_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/update_asset_group_response.h"
update_asset_group_response_t* instantiate_update_asset_group_response(int include_optional);



update_asset_group_response_t* instantiate_update_asset_group_response(int include_optional) {
  update_asset_group_response_t* update_asset_group_response = NULL;
  if (include_optional) {
    update_asset_group_response = update_asset_group_response_create(
      list_createList(),
      list_createList()
    );
  } else {
    update_asset_group_response = update_asset_group_response_create(
      list_createList(),
      list_createList()
    );
  }

  return update_asset_group_response;
}


#ifdef update_asset_group_response_MAIN

void test_update_asset_group_response(int include_optional) {
    update_asset_group_response_t* update_asset_group_response_1 = instantiate_update_asset_group_response(include_optional);

	cJSON* jsonupdate_asset_group_response_1 = update_asset_group_response_convertToJSON(update_asset_group_response_1);
	printf("update_asset_group_response :\n%s\n", cJSON_Print(jsonupdate_asset_group_response_1));
	update_asset_group_response_t* update_asset_group_response_2 = update_asset_group_response_parseFromJSON(jsonupdate_asset_group_response_1);
	cJSON* jsonupdate_asset_group_response_2 = update_asset_group_response_convertToJSON(update_asset_group_response_2);
	printf("repeating update_asset_group_response:\n%s\n", cJSON_Print(jsonupdate_asset_group_response_2));
}

int main() {
  test_update_asset_group_response(1);
  test_update_asset_group_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // update_asset_group_response_MAIN
#endif // update_asset_group_response_TEST
