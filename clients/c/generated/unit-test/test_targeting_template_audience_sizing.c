#ifndef targeting_template_audience_sizing_TEST
#define targeting_template_audience_sizing_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define targeting_template_audience_sizing_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/targeting_template_audience_sizing.h"
targeting_template_audience_sizing_t* instantiate_targeting_template_audience_sizing(int include_optional);

#include "test_targeting_template_audience_sizing_reach_estimate.c"


targeting_template_audience_sizing_t* instantiate_targeting_template_audience_sizing(int include_optional) {
  targeting_template_audience_sizing_t* targeting_template_audience_sizing = NULL;
  if (include_optional) {
    targeting_template_audience_sizing = targeting_template_audience_sizing_create(
       // false, not to have infinite recursion
      instantiate_targeting_template_audience_sizing_reach_estimate(0)
    );
  } else {
    targeting_template_audience_sizing = targeting_template_audience_sizing_create(
      NULL
    );
  }

  return targeting_template_audience_sizing;
}


#ifdef targeting_template_audience_sizing_MAIN

void test_targeting_template_audience_sizing(int include_optional) {
    targeting_template_audience_sizing_t* targeting_template_audience_sizing_1 = instantiate_targeting_template_audience_sizing(include_optional);

	cJSON* jsontargeting_template_audience_sizing_1 = targeting_template_audience_sizing_convertToJSON(targeting_template_audience_sizing_1);
	printf("targeting_template_audience_sizing :\n%s\n", cJSON_Print(jsontargeting_template_audience_sizing_1));
	targeting_template_audience_sizing_t* targeting_template_audience_sizing_2 = targeting_template_audience_sizing_parseFromJSON(jsontargeting_template_audience_sizing_1);
	cJSON* jsontargeting_template_audience_sizing_2 = targeting_template_audience_sizing_convertToJSON(targeting_template_audience_sizing_2);
	printf("repeating targeting_template_audience_sizing:\n%s\n", cJSON_Print(jsontargeting_template_audience_sizing_2));
}

int main() {
  test_targeting_template_audience_sizing(1);
  test_targeting_template_audience_sizing(0);

  printf("Hello world \n");
  return 0;
}

#endif // targeting_template_audience_sizing_MAIN
#endif // targeting_template_audience_sizing_TEST
