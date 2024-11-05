#ifndef targeting_template_response_data_TEST
#define targeting_template_response_data_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define targeting_template_response_data_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/targeting_template_response_data.h"
targeting_template_response_data_t* instantiate_targeting_template_response_data(int include_optional);

#include "test_targeting_spec.c"
#include "test_tracking_urls.c"
#include "test_targeting_template_audience_sizing.c"


targeting_template_response_data_t* instantiate_targeting_template_response_data(int include_optional) {
  targeting_template_response_data_t* targeting_template_response_data = NULL;
  if (include_optional) {
    targeting_template_response_data = targeting_template_response_data_create(
      "Gaming",
      1,
       // false, not to have infinite recursion
      instantiate_targeting_spec(0),
      pinterest_rest_api_targeting_template_response_data__"ALL",
      [{value=cats, match_type=EXACT_NEGATIVE}],
      {"impression":["URL1","URL2"],"click":["URL1","URL2"],"engagement":["URL1","URL2"],"buyable_button":["URL1","URL2"],"audience_verification":["URL1","URL2"]},
      "643",
      1432744744,
      1432744744,
      "549755885175",
      pinterest_rest_api_targeting_template_response_data_STATUS_"ACTIVE",
      {"reach_estimate":{"estimate":63492000,"lower_bound":47619000,"upper_bound":79365000}}
    );
  } else {
    targeting_template_response_data = targeting_template_response_data_create(
      "Gaming",
      1,
      NULL,
      pinterest_rest_api_targeting_template_response_data__"ALL",
      [{value=cats, match_type=EXACT_NEGATIVE}],
      {"impression":["URL1","URL2"],"click":["URL1","URL2"],"engagement":["URL1","URL2"],"buyable_button":["URL1","URL2"],"audience_verification":["URL1","URL2"]},
      "643",
      1432744744,
      1432744744,
      "549755885175",
      pinterest_rest_api_targeting_template_response_data_STATUS_"ACTIVE",
      {"reach_estimate":{"estimate":63492000,"lower_bound":47619000,"upper_bound":79365000}}
    );
  }

  return targeting_template_response_data;
}


#ifdef targeting_template_response_data_MAIN

void test_targeting_template_response_data(int include_optional) {
    targeting_template_response_data_t* targeting_template_response_data_1 = instantiate_targeting_template_response_data(include_optional);

	cJSON* jsontargeting_template_response_data_1 = targeting_template_response_data_convertToJSON(targeting_template_response_data_1);
	printf("targeting_template_response_data :\n%s\n", cJSON_Print(jsontargeting_template_response_data_1));
	targeting_template_response_data_t* targeting_template_response_data_2 = targeting_template_response_data_parseFromJSON(jsontargeting_template_response_data_1);
	cJSON* jsontargeting_template_response_data_2 = targeting_template_response_data_convertToJSON(targeting_template_response_data_2);
	printf("repeating targeting_template_response_data:\n%s\n", cJSON_Print(jsontargeting_template_response_data_2));
}

int main() {
  test_targeting_template_response_data(1);
  test_targeting_template_response_data(0);

  printf("Hello world \n");
  return 0;
}

#endif // targeting_template_response_data_MAIN
#endif // targeting_template_response_data_TEST
