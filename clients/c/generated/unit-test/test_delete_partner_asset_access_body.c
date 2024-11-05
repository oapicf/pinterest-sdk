#ifndef delete_partner_asset_access_body_TEST
#define delete_partner_asset_access_body_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define delete_partner_asset_access_body_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/delete_partner_asset_access_body.h"
delete_partner_asset_access_body_t* instantiate_delete_partner_asset_access_body(int include_optional);



delete_partner_asset_access_body_t* instantiate_delete_partner_asset_access_body(int include_optional) {
  delete_partner_asset_access_body_t* delete_partner_asset_access_body = NULL;
  if (include_optional) {
    delete_partner_asset_access_body = delete_partner_asset_access_body_create(
      list_createList()
    );
  } else {
    delete_partner_asset_access_body = delete_partner_asset_access_body_create(
      list_createList()
    );
  }

  return delete_partner_asset_access_body;
}


#ifdef delete_partner_asset_access_body_MAIN

void test_delete_partner_asset_access_body(int include_optional) {
    delete_partner_asset_access_body_t* delete_partner_asset_access_body_1 = instantiate_delete_partner_asset_access_body(include_optional);

	cJSON* jsondelete_partner_asset_access_body_1 = delete_partner_asset_access_body_convertToJSON(delete_partner_asset_access_body_1);
	printf("delete_partner_asset_access_body :\n%s\n", cJSON_Print(jsondelete_partner_asset_access_body_1));
	delete_partner_asset_access_body_t* delete_partner_asset_access_body_2 = delete_partner_asset_access_body_parseFromJSON(jsondelete_partner_asset_access_body_1);
	cJSON* jsondelete_partner_asset_access_body_2 = delete_partner_asset_access_body_convertToJSON(delete_partner_asset_access_body_2);
	printf("repeating delete_partner_asset_access_body:\n%s\n", cJSON_Print(jsondelete_partner_asset_access_body_2));
}

int main() {
  test_delete_partner_asset_access_body(1);
  test_delete_partner_asset_access_body(0);

  printf("Hello world \n");
  return 0;
}

#endif // delete_partner_asset_access_body_MAIN
#endif // delete_partner_asset_access_body_TEST
