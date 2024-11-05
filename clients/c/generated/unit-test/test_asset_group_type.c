#ifndef asset_group_type_TEST
#define asset_group_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define asset_group_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/asset_group_type.h"
asset_group_type_t* instantiate_asset_group_type(int include_optional);



asset_group_type_t* instantiate_asset_group_type(int include_optional) {
  asset_group_type_t* asset_group_type = NULL;
  if (include_optional) {
    asset_group_type = asset_group_type_create(
    );
  } else {
    asset_group_type = asset_group_type_create(
    );
  }

  return asset_group_type;
}


#ifdef asset_group_type_MAIN

void test_asset_group_type(int include_optional) {
    asset_group_type_t* asset_group_type_1 = instantiate_asset_group_type(include_optional);

	cJSON* jsonasset_group_type_1 = asset_group_type_convertToJSON(asset_group_type_1);
	printf("asset_group_type :\n%s\n", cJSON_Print(jsonasset_group_type_1));
	asset_group_type_t* asset_group_type_2 = asset_group_type_parseFromJSON(jsonasset_group_type_1);
	cJSON* jsonasset_group_type_2 = asset_group_type_convertToJSON(asset_group_type_2);
	printf("repeating asset_group_type:\n%s\n", cJSON_Print(jsonasset_group_type_2));
}

int main() {
  test_asset_group_type(1);
  test_asset_group_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // asset_group_type_MAIN
#endif // asset_group_type_TEST
