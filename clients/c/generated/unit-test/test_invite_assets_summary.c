#ifndef invite_assets_summary_TEST
#define invite_assets_summary_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define invite_assets_summary_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/invite_assets_summary.h"
invite_assets_summary_t* instantiate_invite_assets_summary(int include_optional);



invite_assets_summary_t* instantiate_invite_assets_summary(int include_optional) {
  invite_assets_summary_t* invite_assets_summary = NULL;
  if (include_optional) {
    invite_assets_summary = invite_assets_summary_create(
      list_createList(),
      list_createList()
    );
  } else {
    invite_assets_summary = invite_assets_summary_create(
      list_createList(),
      list_createList()
    );
  }

  return invite_assets_summary;
}


#ifdef invite_assets_summary_MAIN

void test_invite_assets_summary(int include_optional) {
    invite_assets_summary_t* invite_assets_summary_1 = instantiate_invite_assets_summary(include_optional);

	cJSON* jsoninvite_assets_summary_1 = invite_assets_summary_convertToJSON(invite_assets_summary_1);
	printf("invite_assets_summary :\n%s\n", cJSON_Print(jsoninvite_assets_summary_1));
	invite_assets_summary_t* invite_assets_summary_2 = invite_assets_summary_parseFromJSON(jsoninvite_assets_summary_1);
	cJSON* jsoninvite_assets_summary_2 = invite_assets_summary_convertToJSON(invite_assets_summary_2);
	printf("repeating invite_assets_summary:\n%s\n", cJSON_Print(jsoninvite_assets_summary_2));
}

int main() {
  test_invite_assets_summary(1);
  test_invite_assets_summary(0);

  printf("Hello world \n");
  return 0;
}

#endif // invite_assets_summary_MAIN
#endif // invite_assets_summary_TEST
