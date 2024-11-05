#ifndef business_members_asset_access_delete_request_TEST
#define business_members_asset_access_delete_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define business_members_asset_access_delete_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/business_members_asset_access_delete_request.h"
business_members_asset_access_delete_request_t* instantiate_business_members_asset_access_delete_request(int include_optional);



business_members_asset_access_delete_request_t* instantiate_business_members_asset_access_delete_request(int include_optional) {
  business_members_asset_access_delete_request_t* business_members_asset_access_delete_request = NULL;
  if (include_optional) {
    business_members_asset_access_delete_request = business_members_asset_access_delete_request_create(
      list_createList()
    );
  } else {
    business_members_asset_access_delete_request = business_members_asset_access_delete_request_create(
      list_createList()
    );
  }

  return business_members_asset_access_delete_request;
}


#ifdef business_members_asset_access_delete_request_MAIN

void test_business_members_asset_access_delete_request(int include_optional) {
    business_members_asset_access_delete_request_t* business_members_asset_access_delete_request_1 = instantiate_business_members_asset_access_delete_request(include_optional);

	cJSON* jsonbusiness_members_asset_access_delete_request_1 = business_members_asset_access_delete_request_convertToJSON(business_members_asset_access_delete_request_1);
	printf("business_members_asset_access_delete_request :\n%s\n", cJSON_Print(jsonbusiness_members_asset_access_delete_request_1));
	business_members_asset_access_delete_request_t* business_members_asset_access_delete_request_2 = business_members_asset_access_delete_request_parseFromJSON(jsonbusiness_members_asset_access_delete_request_1);
	cJSON* jsonbusiness_members_asset_access_delete_request_2 = business_members_asset_access_delete_request_convertToJSON(business_members_asset_access_delete_request_2);
	printf("repeating business_members_asset_access_delete_request:\n%s\n", cJSON_Print(jsonbusiness_members_asset_access_delete_request_2));
}

int main() {
  test_business_members_asset_access_delete_request(1);
  test_business_members_asset_access_delete_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // business_members_asset_access_delete_request_MAIN
#endif // business_members_asset_access_delete_request_TEST
