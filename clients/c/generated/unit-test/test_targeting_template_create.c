#ifndef targeting_template_create_TEST
#define targeting_template_create_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define targeting_template_create_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/targeting_template_create.h"
targeting_template_create_t* instantiate_targeting_template_create(int include_optional);

#include "test_targeting_spec.c"
#include "test_tracking_urls.c"


targeting_template_create_t* instantiate_targeting_template_create(int include_optional) {
  targeting_template_create_t* targeting_template_create = NULL;
  if (include_optional) {
    targeting_template_create = targeting_template_create_create(
      "Gaming",
      1,
       // false, not to have infinite recursion
      instantiate_targeting_spec(0),
      pinterest_rest_api_targeting_template_create__"ALL",
      [{value=cats, match_type=EXACT_NEGATIVE}],
      {"impression":["URL1","URL2"],"click":["URL1","URL2"],"engagement":["URL1","URL2"],"buyable_button":["URL1","URL2"],"audience_verification":["URL1","URL2"]}
    );
  } else {
    targeting_template_create = targeting_template_create_create(
      "Gaming",
      1,
      NULL,
      pinterest_rest_api_targeting_template_create__"ALL",
      [{value=cats, match_type=EXACT_NEGATIVE}],
      {"impression":["URL1","URL2"],"click":["URL1","URL2"],"engagement":["URL1","URL2"],"buyable_button":["URL1","URL2"],"audience_verification":["URL1","URL2"]}
    );
  }

  return targeting_template_create;
}


#ifdef targeting_template_create_MAIN

void test_targeting_template_create(int include_optional) {
    targeting_template_create_t* targeting_template_create_1 = instantiate_targeting_template_create(include_optional);

	cJSON* jsontargeting_template_create_1 = targeting_template_create_convertToJSON(targeting_template_create_1);
	printf("targeting_template_create :\n%s\n", cJSON_Print(jsontargeting_template_create_1));
	targeting_template_create_t* targeting_template_create_2 = targeting_template_create_parseFromJSON(jsontargeting_template_create_1);
	cJSON* jsontargeting_template_create_2 = targeting_template_create_convertToJSON(targeting_template_create_2);
	printf("repeating targeting_template_create:\n%s\n", cJSON_Print(jsontargeting_template_create_2));
}

int main() {
  test_targeting_template_create(1);
  test_targeting_template_create(0);

  printf("Hello world \n");
  return 0;
}

#endif // targeting_template_create_MAIN
#endif // targeting_template_create_TEST
