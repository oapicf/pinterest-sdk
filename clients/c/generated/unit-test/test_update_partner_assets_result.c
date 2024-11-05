#ifndef update_partner_assets_result_TEST
#define update_partner_assets_result_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define update_partner_assets_result_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/update_partner_assets_result.h"
update_partner_assets_result_t* instantiate_update_partner_assets_result(int include_optional);



update_partner_assets_result_t* instantiate_update_partner_assets_result(int include_optional) {
  update_partner_assets_result_t* update_partner_assets_result = NULL;
  if (include_optional) {
    update_partner_assets_result = update_partner_assets_result_create(
      "549755885175",
      "AD_ACCOUNT",
      "140943737684417",
      ["FINANCE_MANAGER","CATALOGS_MANAGER","AUDIENCE_MANAGER"]
    );
  } else {
    update_partner_assets_result = update_partner_assets_result_create(
      "549755885175",
      "AD_ACCOUNT",
      "140943737684417",
      ["FINANCE_MANAGER","CATALOGS_MANAGER","AUDIENCE_MANAGER"]
    );
  }

  return update_partner_assets_result;
}


#ifdef update_partner_assets_result_MAIN

void test_update_partner_assets_result(int include_optional) {
    update_partner_assets_result_t* update_partner_assets_result_1 = instantiate_update_partner_assets_result(include_optional);

	cJSON* jsonupdate_partner_assets_result_1 = update_partner_assets_result_convertToJSON(update_partner_assets_result_1);
	printf("update_partner_assets_result :\n%s\n", cJSON_Print(jsonupdate_partner_assets_result_1));
	update_partner_assets_result_t* update_partner_assets_result_2 = update_partner_assets_result_parseFromJSON(jsonupdate_partner_assets_result_1);
	cJSON* jsonupdate_partner_assets_result_2 = update_partner_assets_result_convertToJSON(update_partner_assets_result_2);
	printf("repeating update_partner_assets_result:\n%s\n", cJSON_Print(jsonupdate_partner_assets_result_2));
}

int main() {
  test_update_partner_assets_result(1);
  test_update_partner_assets_result(0);

  printf("Hello world \n");
  return 0;
}

#endif // update_partner_assets_result_MAIN
#endif // update_partner_assets_result_TEST
