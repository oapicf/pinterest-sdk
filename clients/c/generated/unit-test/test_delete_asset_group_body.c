#ifndef delete_asset_group_body_TEST
#define delete_asset_group_body_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define delete_asset_group_body_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/delete_asset_group_body.h"
delete_asset_group_body_t* instantiate_delete_asset_group_body(int include_optional);



delete_asset_group_body_t* instantiate_delete_asset_group_body(int include_optional) {
  delete_asset_group_body_t* delete_asset_group_body = NULL;
  if (include_optional) {
    delete_asset_group_body = delete_asset_group_body_create(
      ["666791336903426391","666791336903426392"]
    );
  } else {
    delete_asset_group_body = delete_asset_group_body_create(
      ["666791336903426391","666791336903426392"]
    );
  }

  return delete_asset_group_body;
}


#ifdef delete_asset_group_body_MAIN

void test_delete_asset_group_body(int include_optional) {
    delete_asset_group_body_t* delete_asset_group_body_1 = instantiate_delete_asset_group_body(include_optional);

	cJSON* jsondelete_asset_group_body_1 = delete_asset_group_body_convertToJSON(delete_asset_group_body_1);
	printf("delete_asset_group_body :\n%s\n", cJSON_Print(jsondelete_asset_group_body_1));
	delete_asset_group_body_t* delete_asset_group_body_2 = delete_asset_group_body_parseFromJSON(jsondelete_asset_group_body_1);
	cJSON* jsondelete_asset_group_body_2 = delete_asset_group_body_convertToJSON(delete_asset_group_body_2);
	printf("repeating delete_asset_group_body:\n%s\n", cJSON_Print(jsondelete_asset_group_body_2));
}

int main() {
  test_delete_asset_group_body(1);
  test_delete_asset_group_body(0);

  printf("Hello world \n");
  return 0;
}

#endif // delete_asset_group_body_MAIN
#endif // delete_asset_group_body_TEST
