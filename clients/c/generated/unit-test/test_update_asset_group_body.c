#ifndef update_asset_group_body_TEST
#define update_asset_group_body_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define update_asset_group_body_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/update_asset_group_body.h"
update_asset_group_body_t* instantiate_update_asset_group_body(int include_optional);



update_asset_group_body_t* instantiate_update_asset_group_body(int include_optional) {
  update_asset_group_body_t* update_asset_group_body = NULL;
  if (include_optional) {
    update_asset_group_body = update_asset_group_body_create(
      list_createList()
    );
  } else {
    update_asset_group_body = update_asset_group_body_create(
      list_createList()
    );
  }

  return update_asset_group_body;
}


#ifdef update_asset_group_body_MAIN

void test_update_asset_group_body(int include_optional) {
    update_asset_group_body_t* update_asset_group_body_1 = instantiate_update_asset_group_body(include_optional);

	cJSON* jsonupdate_asset_group_body_1 = update_asset_group_body_convertToJSON(update_asset_group_body_1);
	printf("update_asset_group_body :\n%s\n", cJSON_Print(jsonupdate_asset_group_body_1));
	update_asset_group_body_t* update_asset_group_body_2 = update_asset_group_body_parseFromJSON(jsonupdate_asset_group_body_1);
	cJSON* jsonupdate_asset_group_body_2 = update_asset_group_body_convertToJSON(update_asset_group_body_2);
	printf("repeating update_asset_group_body:\n%s\n", cJSON_Print(jsonupdate_asset_group_body_2));
}

int main() {
  test_update_asset_group_body(1);
  test_update_asset_group_body(0);

  printf("Hello world \n");
  return 0;
}

#endif // update_asset_group_body_MAIN
#endif // update_asset_group_body_TEST
