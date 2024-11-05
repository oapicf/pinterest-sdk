#ifndef targeting_template_audience_sizing_reach_estimate_TEST
#define targeting_template_audience_sizing_reach_estimate_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define targeting_template_audience_sizing_reach_estimate_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/targeting_template_audience_sizing_reach_estimate.h"
targeting_template_audience_sizing_reach_estimate_t* instantiate_targeting_template_audience_sizing_reach_estimate(int include_optional);



targeting_template_audience_sizing_reach_estimate_t* instantiate_targeting_template_audience_sizing_reach_estimate(int include_optional) {
  targeting_template_audience_sizing_reach_estimate_t* targeting_template_audience_sizing_reach_estimate = NULL;
  if (include_optional) {
    targeting_template_audience_sizing_reach_estimate = targeting_template_audience_sizing_reach_estimate_create(
      63492000,
      47619000,
      79365000
    );
  } else {
    targeting_template_audience_sizing_reach_estimate = targeting_template_audience_sizing_reach_estimate_create(
      63492000,
      47619000,
      79365000
    );
  }

  return targeting_template_audience_sizing_reach_estimate;
}


#ifdef targeting_template_audience_sizing_reach_estimate_MAIN

void test_targeting_template_audience_sizing_reach_estimate(int include_optional) {
    targeting_template_audience_sizing_reach_estimate_t* targeting_template_audience_sizing_reach_estimate_1 = instantiate_targeting_template_audience_sizing_reach_estimate(include_optional);

	cJSON* jsontargeting_template_audience_sizing_reach_estimate_1 = targeting_template_audience_sizing_reach_estimate_convertToJSON(targeting_template_audience_sizing_reach_estimate_1);
	printf("targeting_template_audience_sizing_reach_estimate :\n%s\n", cJSON_Print(jsontargeting_template_audience_sizing_reach_estimate_1));
	targeting_template_audience_sizing_reach_estimate_t* targeting_template_audience_sizing_reach_estimate_2 = targeting_template_audience_sizing_reach_estimate_parseFromJSON(jsontargeting_template_audience_sizing_reach_estimate_1);
	cJSON* jsontargeting_template_audience_sizing_reach_estimate_2 = targeting_template_audience_sizing_reach_estimate_convertToJSON(targeting_template_audience_sizing_reach_estimate_2);
	printf("repeating targeting_template_audience_sizing_reach_estimate:\n%s\n", cJSON_Print(jsontargeting_template_audience_sizing_reach_estimate_2));
}

int main() {
  test_targeting_template_audience_sizing_reach_estimate(1);
  test_targeting_template_audience_sizing_reach_estimate(0);

  printf("Hello world \n");
  return 0;
}

#endif // targeting_template_audience_sizing_reach_estimate_MAIN
#endif // targeting_template_audience_sizing_reach_estimate_TEST
