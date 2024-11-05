#ifndef update_asset_group_body_asset_groups_to_update_inner_TEST
#define update_asset_group_body_asset_groups_to_update_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define update_asset_group_body_asset_groups_to_update_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/update_asset_group_body_asset_groups_to_update_inner.h"
update_asset_group_body_asset_groups_to_update_inner_t* instantiate_update_asset_group_body_asset_groups_to_update_inner(int include_optional);



update_asset_group_body_asset_groups_to_update_inner_t* instantiate_update_asset_group_body_asset_groups_to_update_inner(int include_optional) {
  update_asset_group_body_asset_groups_to_update_inner_t* update_asset_group_body_asset_groups_to_update_inner = NULL;
  if (include_optional) {
    update_asset_group_body_asset_groups_to_update_inner = update_asset_group_body_asset_groups_to_update_inner_create(
      "666791336903426391",
      "Canada Ad Accounts",
      "Asset groups that has ad accounts shared in Canada",
      ["BRAND","LOCATION_OR_LANGUAGE","PRODUCT_LINE","OTHER"],
      list_createList(),
      list_createList()
    );
  } else {
    update_asset_group_body_asset_groups_to_update_inner = update_asset_group_body_asset_groups_to_update_inner_create(
      "666791336903426391",
      "Canada Ad Accounts",
      "Asset groups that has ad accounts shared in Canada",
      ["BRAND","LOCATION_OR_LANGUAGE","PRODUCT_LINE","OTHER"],
      list_createList(),
      list_createList()
    );
  }

  return update_asset_group_body_asset_groups_to_update_inner;
}


#ifdef update_asset_group_body_asset_groups_to_update_inner_MAIN

void test_update_asset_group_body_asset_groups_to_update_inner(int include_optional) {
    update_asset_group_body_asset_groups_to_update_inner_t* update_asset_group_body_asset_groups_to_update_inner_1 = instantiate_update_asset_group_body_asset_groups_to_update_inner(include_optional);

	cJSON* jsonupdate_asset_group_body_asset_groups_to_update_inner_1 = update_asset_group_body_asset_groups_to_update_inner_convertToJSON(update_asset_group_body_asset_groups_to_update_inner_1);
	printf("update_asset_group_body_asset_groups_to_update_inner :\n%s\n", cJSON_Print(jsonupdate_asset_group_body_asset_groups_to_update_inner_1));
	update_asset_group_body_asset_groups_to_update_inner_t* update_asset_group_body_asset_groups_to_update_inner_2 = update_asset_group_body_asset_groups_to_update_inner_parseFromJSON(jsonupdate_asset_group_body_asset_groups_to_update_inner_1);
	cJSON* jsonupdate_asset_group_body_asset_groups_to_update_inner_2 = update_asset_group_body_asset_groups_to_update_inner_convertToJSON(update_asset_group_body_asset_groups_to_update_inner_2);
	printf("repeating update_asset_group_body_asset_groups_to_update_inner:\n%s\n", cJSON_Print(jsonupdate_asset_group_body_asset_groups_to_update_inner_2));
}

int main() {
  test_update_asset_group_body_asset_groups_to_update_inner(1);
  test_update_asset_group_body_asset_groups_to_update_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // update_asset_group_body_asset_groups_to_update_inner_MAIN
#endif // update_asset_group_body_asset_groups_to_update_inner_TEST
