#ifndef create_asset_group_body_TEST
#define create_asset_group_body_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_asset_group_body_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_asset_group_body.h"
create_asset_group_body_t* instantiate_create_asset_group_body(int include_optional);



create_asset_group_body_t* instantiate_create_asset_group_body(int include_optional) {
  create_asset_group_body_t* create_asset_group_body = NULL;
  if (include_optional) {
    create_asset_group_body = create_asset_group_body_create(
      "Canada Ad Accounts",
      "Asset groups that has ad accounts shared in Canada",
      ["BRAND","LOCATION_OR_LANGUAGE","PRODUCT_LINE","OTHER"]
    );
  } else {
    create_asset_group_body = create_asset_group_body_create(
      "Canada Ad Accounts",
      "Asset groups that has ad accounts shared in Canada",
      ["BRAND","LOCATION_OR_LANGUAGE","PRODUCT_LINE","OTHER"]
    );
  }

  return create_asset_group_body;
}


#ifdef create_asset_group_body_MAIN

void test_create_asset_group_body(int include_optional) {
    create_asset_group_body_t* create_asset_group_body_1 = instantiate_create_asset_group_body(include_optional);

	cJSON* jsoncreate_asset_group_body_1 = create_asset_group_body_convertToJSON(create_asset_group_body_1);
	printf("create_asset_group_body :\n%s\n", cJSON_Print(jsoncreate_asset_group_body_1));
	create_asset_group_body_t* create_asset_group_body_2 = create_asset_group_body_parseFromJSON(jsoncreate_asset_group_body_1);
	cJSON* jsoncreate_asset_group_body_2 = create_asset_group_body_convertToJSON(create_asset_group_body_2);
	printf("repeating create_asset_group_body:\n%s\n", cJSON_Print(jsoncreate_asset_group_body_2));
}

int main() {
  test_create_asset_group_body(1);
  test_create_asset_group_body(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_asset_group_body_MAIN
#endif // create_asset_group_body_TEST
