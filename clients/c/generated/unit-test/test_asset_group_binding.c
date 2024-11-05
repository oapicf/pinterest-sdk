#ifndef asset_group_binding_TEST
#define asset_group_binding_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define asset_group_binding_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/asset_group_binding.h"
asset_group_binding_t* instantiate_asset_group_binding(int include_optional);

#include "test_business_access_user_summary.c"
#include "test_business_access_user_summary.c"


asset_group_binding_t* instantiate_asset_group_binding(int include_optional) {
  asset_group_binding_t* asset_group_binding = NULL;
  if (include_optional) {
    asset_group_binding = asset_group_binding_create(
      "666791336903426391",
      "Canada Ad Accounts",
      "Asset group that has ad accounts used in Canada",
      ["LOCATION_OR_LANGUAGE"],
      ["549755885175"],
      ["630433785246278264"],
      1646767577816,
      1646767577816,
       // false, not to have infinite recursion
      instantiate_business_access_user_summary(0),
       // false, not to have infinite recursion
      instantiate_business_access_user_summary(0)
    );
  } else {
    asset_group_binding = asset_group_binding_create(
      "666791336903426391",
      "Canada Ad Accounts",
      "Asset group that has ad accounts used in Canada",
      ["LOCATION_OR_LANGUAGE"],
      ["549755885175"],
      ["630433785246278264"],
      1646767577816,
      1646767577816,
      NULL,
      NULL
    );
  }

  return asset_group_binding;
}


#ifdef asset_group_binding_MAIN

void test_asset_group_binding(int include_optional) {
    asset_group_binding_t* asset_group_binding_1 = instantiate_asset_group_binding(include_optional);

	cJSON* jsonasset_group_binding_1 = asset_group_binding_convertToJSON(asset_group_binding_1);
	printf("asset_group_binding :\n%s\n", cJSON_Print(jsonasset_group_binding_1));
	asset_group_binding_t* asset_group_binding_2 = asset_group_binding_parseFromJSON(jsonasset_group_binding_1);
	cJSON* jsonasset_group_binding_2 = asset_group_binding_convertToJSON(asset_group_binding_2);
	printf("repeating asset_group_binding:\n%s\n", cJSON_Print(jsonasset_group_binding_2));
}

int main() {
  test_asset_group_binding(1);
  test_asset_group_binding(0);

  printf("Hello world \n");
  return 0;
}

#endif // asset_group_binding_MAIN
#endif // asset_group_binding_TEST
