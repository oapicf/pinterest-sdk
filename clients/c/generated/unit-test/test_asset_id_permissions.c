#ifndef asset_id_permissions_TEST
#define asset_id_permissions_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define asset_id_permissions_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/asset_id_permissions.h"
asset_id_permissions_t* instantiate_asset_id_permissions(int include_optional);

#include "test_asset_group_binding.c"


asset_id_permissions_t* instantiate_asset_id_permissions(int include_optional) {
  asset_id_permissions_t* asset_id_permissions = NULL;
  if (include_optional) {
    asset_id_permissions = asset_id_permissions_create(
      "549755885175",
      "AD_ACCOUNT",
      ["FINANCE_MANAGER","CATALOGS_MANAGER","AUDIENCE_MANAGER"],
       // false, not to have infinite recursion
      instantiate_asset_group_binding(0)
    );
  } else {
    asset_id_permissions = asset_id_permissions_create(
      "549755885175",
      "AD_ACCOUNT",
      ["FINANCE_MANAGER","CATALOGS_MANAGER","AUDIENCE_MANAGER"],
      NULL
    );
  }

  return asset_id_permissions;
}


#ifdef asset_id_permissions_MAIN

void test_asset_id_permissions(int include_optional) {
    asset_id_permissions_t* asset_id_permissions_1 = instantiate_asset_id_permissions(include_optional);

	cJSON* jsonasset_id_permissions_1 = asset_id_permissions_convertToJSON(asset_id_permissions_1);
	printf("asset_id_permissions :\n%s\n", cJSON_Print(jsonasset_id_permissions_1));
	asset_id_permissions_t* asset_id_permissions_2 = asset_id_permissions_parseFromJSON(jsonasset_id_permissions_1);
	cJSON* jsonasset_id_permissions_2 = asset_id_permissions_convertToJSON(asset_id_permissions_2);
	printf("repeating asset_id_permissions:\n%s\n", cJSON_Print(jsonasset_id_permissions_2));
}

int main() {
  test_asset_id_permissions(1);
  test_asset_id_permissions(0);

  printf("Hello world \n");
  return 0;
}

#endif // asset_id_permissions_MAIN
#endif // asset_id_permissions_TEST
