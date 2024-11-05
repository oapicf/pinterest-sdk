#ifndef delete_partner_assets_result_TEST
#define delete_partner_assets_result_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define delete_partner_assets_result_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/delete_partner_assets_result.h"
delete_partner_assets_result_t* instantiate_delete_partner_assets_result(int include_optional);



delete_partner_assets_result_t* instantiate_delete_partner_assets_result(int include_optional) {
  delete_partner_assets_result_t* delete_partner_assets_result = NULL;
  if (include_optional) {
    delete_partner_assets_result = delete_partner_assets_result_create(
      "549755885175",
      "AD_ACCOUNT",
      ["FINANCE_MANAGER","CATALOGS_MANAGER","AUDIENCE_MANAGER"],
      false,
      "140943737684417"
    );
  } else {
    delete_partner_assets_result = delete_partner_assets_result_create(
      "549755885175",
      "AD_ACCOUNT",
      ["FINANCE_MANAGER","CATALOGS_MANAGER","AUDIENCE_MANAGER"],
      false,
      "140943737684417"
    );
  }

  return delete_partner_assets_result;
}


#ifdef delete_partner_assets_result_MAIN

void test_delete_partner_assets_result(int include_optional) {
    delete_partner_assets_result_t* delete_partner_assets_result_1 = instantiate_delete_partner_assets_result(include_optional);

	cJSON* jsondelete_partner_assets_result_1 = delete_partner_assets_result_convertToJSON(delete_partner_assets_result_1);
	printf("delete_partner_assets_result :\n%s\n", cJSON_Print(jsondelete_partner_assets_result_1));
	delete_partner_assets_result_t* delete_partner_assets_result_2 = delete_partner_assets_result_parseFromJSON(jsondelete_partner_assets_result_1);
	cJSON* jsondelete_partner_assets_result_2 = delete_partner_assets_result_convertToJSON(delete_partner_assets_result_2);
	printf("repeating delete_partner_assets_result:\n%s\n", cJSON_Print(jsondelete_partner_assets_result_2));
}

int main() {
  test_delete_partner_assets_result(1);
  test_delete_partner_assets_result(0);

  printf("Hello world \n");
  return 0;
}

#endif // delete_partner_assets_result_MAIN
#endif // delete_partner_assets_result_TEST
