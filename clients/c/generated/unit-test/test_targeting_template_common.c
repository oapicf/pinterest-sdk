#ifndef targeting_template_common_TEST
#define targeting_template_common_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define targeting_template_common_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/targeting_template_common.h"
targeting_template_common_t* instantiate_targeting_template_common(int include_optional);

#include "test_targeting_spec.c"
#include "test_tracking_urls.c"


targeting_template_common_t* instantiate_targeting_template_common(int include_optional) {
  targeting_template_common_t* targeting_template_common = NULL;
  if (include_optional) {
    targeting_template_common = targeting_template_common_create(
      "Gaming",
      1,
       // false, not to have infinite recursion
      instantiate_targeting_spec(0),
      pinterest_rest_api_targeting_template_common__"ALL",
      [{"value":"cats","match_type":"EXACT_NEGATIVE"}],
      {"impression":["URL1","URL2"],"click":["URL1","URL2"],"engagement":["URL1","URL2"],"buyable_button":["URL1","URL2"],"audience_verification":["URL1","URL2"]}
    );
  } else {
    targeting_template_common = targeting_template_common_create(
      "Gaming",
      1,
      NULL,
      pinterest_rest_api_targeting_template_common__"ALL",
      [{"value":"cats","match_type":"EXACT_NEGATIVE"}],
      {"impression":["URL1","URL2"],"click":["URL1","URL2"],"engagement":["URL1","URL2"],"buyable_button":["URL1","URL2"],"audience_verification":["URL1","URL2"]}
    );
  }

  return targeting_template_common;
}


#ifdef targeting_template_common_MAIN

void test_targeting_template_common(int include_optional) {
    targeting_template_common_t* targeting_template_common_1 = instantiate_targeting_template_common(include_optional);

	cJSON* jsontargeting_template_common_1 = targeting_template_common_convertToJSON(targeting_template_common_1);
	printf("targeting_template_common :\n%s\n", cJSON_Print(jsontargeting_template_common_1));
	targeting_template_common_t* targeting_template_common_2 = targeting_template_common_parseFromJSON(jsontargeting_template_common_1);
	cJSON* jsontargeting_template_common_2 = targeting_template_common_convertToJSON(targeting_template_common_2);
	printf("repeating targeting_template_common:\n%s\n", cJSON_Print(jsontargeting_template_common_2));
}

int main() {
  test_targeting_template_common(1);
  test_targeting_template_common(0);

  printf("Hello world \n");
  return 0;
}

#endif // targeting_template_common_MAIN
#endif // targeting_template_common_TEST
