#ifndef invite_assets_summary_profiles_inner_TEST
#define invite_assets_summary_profiles_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define invite_assets_summary_profiles_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/invite_assets_summary_profiles_inner.h"
invite_assets_summary_profiles_inner_t* instantiate_invite_assets_summary_profiles_inner(int include_optional);



invite_assets_summary_profiles_inner_t* instantiate_invite_assets_summary_profiles_inner(int include_optional) {
  invite_assets_summary_profiles_inner_t* invite_assets_summary_profiles_inner = NULL;
  if (include_optional) {
    invite_assets_summary_profiles_inner = invite_assets_summary_profiles_inner_create(
      "383791336903426391",
      ["FINANCE_MANAGER","CATALOGS_MANAGER","AUDIENCE_MANAGER"]
    );
  } else {
    invite_assets_summary_profiles_inner = invite_assets_summary_profiles_inner_create(
      "383791336903426391",
      ["FINANCE_MANAGER","CATALOGS_MANAGER","AUDIENCE_MANAGER"]
    );
  }

  return invite_assets_summary_profiles_inner;
}


#ifdef invite_assets_summary_profiles_inner_MAIN

void test_invite_assets_summary_profiles_inner(int include_optional) {
    invite_assets_summary_profiles_inner_t* invite_assets_summary_profiles_inner_1 = instantiate_invite_assets_summary_profiles_inner(include_optional);

	cJSON* jsoninvite_assets_summary_profiles_inner_1 = invite_assets_summary_profiles_inner_convertToJSON(invite_assets_summary_profiles_inner_1);
	printf("invite_assets_summary_profiles_inner :\n%s\n", cJSON_Print(jsoninvite_assets_summary_profiles_inner_1));
	invite_assets_summary_profiles_inner_t* invite_assets_summary_profiles_inner_2 = invite_assets_summary_profiles_inner_parseFromJSON(jsoninvite_assets_summary_profiles_inner_1);
	cJSON* jsoninvite_assets_summary_profiles_inner_2 = invite_assets_summary_profiles_inner_convertToJSON(invite_assets_summary_profiles_inner_2);
	printf("repeating invite_assets_summary_profiles_inner:\n%s\n", cJSON_Print(jsoninvite_assets_summary_profiles_inner_2));
}

int main() {
  test_invite_assets_summary_profiles_inner(1);
  test_invite_assets_summary_profiles_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // invite_assets_summary_profiles_inner_MAIN
#endif // invite_assets_summary_profiles_inner_TEST
