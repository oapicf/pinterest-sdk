#ifndef update_partner_asset_access_body_accesses_inner_TEST
#define update_partner_asset_access_body_accesses_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define update_partner_asset_access_body_accesses_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/update_partner_asset_access_body_accesses_inner.h"
update_partner_asset_access_body_accesses_inner_t* instantiate_update_partner_asset_access_body_accesses_inner(int include_optional);



update_partner_asset_access_body_accesses_inner_t* instantiate_update_partner_asset_access_body_accesses_inner(int include_optional) {
  update_partner_asset_access_body_accesses_inner_t* update_partner_asset_access_body_accesses_inner = NULL;
  if (include_optional) {
    update_partner_asset_access_body_accesses_inner = update_partner_asset_access_body_accesses_inner_create(
      "1234567890123",
      "549755885175",
      ["ANALYST","ADMIN"]
    );
  } else {
    update_partner_asset_access_body_accesses_inner = update_partner_asset_access_body_accesses_inner_create(
      "1234567890123",
      "549755885175",
      ["ANALYST","ADMIN"]
    );
  }

  return update_partner_asset_access_body_accesses_inner;
}


#ifdef update_partner_asset_access_body_accesses_inner_MAIN

void test_update_partner_asset_access_body_accesses_inner(int include_optional) {
    update_partner_asset_access_body_accesses_inner_t* update_partner_asset_access_body_accesses_inner_1 = instantiate_update_partner_asset_access_body_accesses_inner(include_optional);

	cJSON* jsonupdate_partner_asset_access_body_accesses_inner_1 = update_partner_asset_access_body_accesses_inner_convertToJSON(update_partner_asset_access_body_accesses_inner_1);
	printf("update_partner_asset_access_body_accesses_inner :\n%s\n", cJSON_Print(jsonupdate_partner_asset_access_body_accesses_inner_1));
	update_partner_asset_access_body_accesses_inner_t* update_partner_asset_access_body_accesses_inner_2 = update_partner_asset_access_body_accesses_inner_parseFromJSON(jsonupdate_partner_asset_access_body_accesses_inner_1);
	cJSON* jsonupdate_partner_asset_access_body_accesses_inner_2 = update_partner_asset_access_body_accesses_inner_convertToJSON(update_partner_asset_access_body_accesses_inner_2);
	printf("repeating update_partner_asset_access_body_accesses_inner:\n%s\n", cJSON_Print(jsonupdate_partner_asset_access_body_accesses_inner_2));
}

int main() {
  test_update_partner_asset_access_body_accesses_inner(1);
  test_update_partner_asset_access_body_accesses_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // update_partner_asset_access_body_accesses_inner_MAIN
#endif // update_partner_asset_access_body_accesses_inner_TEST
