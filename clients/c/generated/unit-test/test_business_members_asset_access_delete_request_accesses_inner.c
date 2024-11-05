#ifndef business_members_asset_access_delete_request_accesses_inner_TEST
#define business_members_asset_access_delete_request_accesses_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define business_members_asset_access_delete_request_accesses_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/business_members_asset_access_delete_request_accesses_inner.h"
business_members_asset_access_delete_request_accesses_inner_t* instantiate_business_members_asset_access_delete_request_accesses_inner(int include_optional);



business_members_asset_access_delete_request_accesses_inner_t* instantiate_business_members_asset_access_delete_request_accesses_inner(int include_optional) {
  business_members_asset_access_delete_request_accesses_inner_t* business_members_asset_access_delete_request_accesses_inner = NULL;
  if (include_optional) {
    business_members_asset_access_delete_request_accesses_inner = business_members_asset_access_delete_request_accesses_inner_create(
      "549755885175",
      "140943737684417"
    );
  } else {
    business_members_asset_access_delete_request_accesses_inner = business_members_asset_access_delete_request_accesses_inner_create(
      "549755885175",
      "140943737684417"
    );
  }

  return business_members_asset_access_delete_request_accesses_inner;
}


#ifdef business_members_asset_access_delete_request_accesses_inner_MAIN

void test_business_members_asset_access_delete_request_accesses_inner(int include_optional) {
    business_members_asset_access_delete_request_accesses_inner_t* business_members_asset_access_delete_request_accesses_inner_1 = instantiate_business_members_asset_access_delete_request_accesses_inner(include_optional);

	cJSON* jsonbusiness_members_asset_access_delete_request_accesses_inner_1 = business_members_asset_access_delete_request_accesses_inner_convertToJSON(business_members_asset_access_delete_request_accesses_inner_1);
	printf("business_members_asset_access_delete_request_accesses_inner :\n%s\n", cJSON_Print(jsonbusiness_members_asset_access_delete_request_accesses_inner_1));
	business_members_asset_access_delete_request_accesses_inner_t* business_members_asset_access_delete_request_accesses_inner_2 = business_members_asset_access_delete_request_accesses_inner_parseFromJSON(jsonbusiness_members_asset_access_delete_request_accesses_inner_1);
	cJSON* jsonbusiness_members_asset_access_delete_request_accesses_inner_2 = business_members_asset_access_delete_request_accesses_inner_convertToJSON(business_members_asset_access_delete_request_accesses_inner_2);
	printf("repeating business_members_asset_access_delete_request_accesses_inner:\n%s\n", cJSON_Print(jsonbusiness_members_asset_access_delete_request_accesses_inner_2));
}

int main() {
  test_business_members_asset_access_delete_request_accesses_inner(1);
  test_business_members_asset_access_delete_request_accesses_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // business_members_asset_access_delete_request_accesses_inner_MAIN
#endif // business_members_asset_access_delete_request_accesses_inner_TEST
