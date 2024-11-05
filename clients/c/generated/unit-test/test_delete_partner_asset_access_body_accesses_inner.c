#ifndef delete_partner_asset_access_body_accesses_inner_TEST
#define delete_partner_asset_access_body_accesses_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define delete_partner_asset_access_body_accesses_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/delete_partner_asset_access_body_accesses_inner.h"
delete_partner_asset_access_body_accesses_inner_t* instantiate_delete_partner_asset_access_body_accesses_inner(int include_optional);



delete_partner_asset_access_body_accesses_inner_t* instantiate_delete_partner_asset_access_body_accesses_inner(int include_optional) {
  delete_partner_asset_access_body_accesses_inner_t* delete_partner_asset_access_body_accesses_inner = NULL;
  if (include_optional) {
    delete_partner_asset_access_body_accesses_inner = delete_partner_asset_access_body_accesses_inner_create(
      "1234567890123",
      "549755885175",
      pinterest_rest_api_delete_partner_asset_access_body_accesses_inner_PARTNERTYPE_"INTERNAL"
    );
  } else {
    delete_partner_asset_access_body_accesses_inner = delete_partner_asset_access_body_accesses_inner_create(
      "1234567890123",
      "549755885175",
      pinterest_rest_api_delete_partner_asset_access_body_accesses_inner_PARTNERTYPE_"INTERNAL"
    );
  }

  return delete_partner_asset_access_body_accesses_inner;
}


#ifdef delete_partner_asset_access_body_accesses_inner_MAIN

void test_delete_partner_asset_access_body_accesses_inner(int include_optional) {
    delete_partner_asset_access_body_accesses_inner_t* delete_partner_asset_access_body_accesses_inner_1 = instantiate_delete_partner_asset_access_body_accesses_inner(include_optional);

	cJSON* jsondelete_partner_asset_access_body_accesses_inner_1 = delete_partner_asset_access_body_accesses_inner_convertToJSON(delete_partner_asset_access_body_accesses_inner_1);
	printf("delete_partner_asset_access_body_accesses_inner :\n%s\n", cJSON_Print(jsondelete_partner_asset_access_body_accesses_inner_1));
	delete_partner_asset_access_body_accesses_inner_t* delete_partner_asset_access_body_accesses_inner_2 = delete_partner_asset_access_body_accesses_inner_parseFromJSON(jsondelete_partner_asset_access_body_accesses_inner_1);
	cJSON* jsondelete_partner_asset_access_body_accesses_inner_2 = delete_partner_asset_access_body_accesses_inner_convertToJSON(delete_partner_asset_access_body_accesses_inner_2);
	printf("repeating delete_partner_asset_access_body_accesses_inner:\n%s\n", cJSON_Print(jsondelete_partner_asset_access_body_accesses_inner_2));
}

int main() {
  test_delete_partner_asset_access_body_accesses_inner(1);
  test_delete_partner_asset_access_body_accesses_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // delete_partner_asset_access_body_accesses_inner_MAIN
#endif // delete_partner_asset_access_body_accesses_inner_TEST
