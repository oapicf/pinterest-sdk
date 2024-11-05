#ifndef users_for_individual_asset_response_TEST
#define users_for_individual_asset_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define users_for_individual_asset_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/users_for_individual_asset_response.h"
users_for_individual_asset_response_t* instantiate_users_for_individual_asset_response(int include_optional);



users_for_individual_asset_response_t* instantiate_users_for_individual_asset_response(int include_optional) {
  users_for_individual_asset_response_t* users_for_individual_asset_response = NULL;
  if (include_optional) {
    users_for_individual_asset_response = users_for_individual_asset_response_create(
      "549755885175",
      "140943737684417",
      ["FINANCE_MANAGER","CATALOGS_MANAGER","AUDIENCE_MANAGER"]
    );
  } else {
    users_for_individual_asset_response = users_for_individual_asset_response_create(
      "549755885175",
      "140943737684417",
      ["FINANCE_MANAGER","CATALOGS_MANAGER","AUDIENCE_MANAGER"]
    );
  }

  return users_for_individual_asset_response;
}


#ifdef users_for_individual_asset_response_MAIN

void test_users_for_individual_asset_response(int include_optional) {
    users_for_individual_asset_response_t* users_for_individual_asset_response_1 = instantiate_users_for_individual_asset_response(include_optional);

	cJSON* jsonusers_for_individual_asset_response_1 = users_for_individual_asset_response_convertToJSON(users_for_individual_asset_response_1);
	printf("users_for_individual_asset_response :\n%s\n", cJSON_Print(jsonusers_for_individual_asset_response_1));
	users_for_individual_asset_response_t* users_for_individual_asset_response_2 = users_for_individual_asset_response_parseFromJSON(jsonusers_for_individual_asset_response_1);
	cJSON* jsonusers_for_individual_asset_response_2 = users_for_individual_asset_response_convertToJSON(users_for_individual_asset_response_2);
	printf("repeating users_for_individual_asset_response:\n%s\n", cJSON_Print(jsonusers_for_individual_asset_response_2));
}

int main() {
  test_users_for_individual_asset_response(1);
  test_users_for_individual_asset_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // users_for_individual_asset_response_MAIN
#endif // users_for_individual_asset_response_TEST
