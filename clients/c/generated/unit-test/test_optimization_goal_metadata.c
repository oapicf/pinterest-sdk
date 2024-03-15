#ifndef optimization_goal_metadata_TEST
#define optimization_goal_metadata_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define optimization_goal_metadata_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/optimization_goal_metadata.h"
optimization_goal_metadata_t* instantiate_optimization_goal_metadata(int include_optional);

#include "test_optimization_goal_metadata_conversion_tag_v3_goal_metadata.c"
#include "test_optimization_goal_metadata_frequency_goal_metadata.c"
#include "test_optimization_goal_metadata_scrollup_goal_metadata.c"


optimization_goal_metadata_t* instantiate_optimization_goal_metadata(int include_optional) {
  optimization_goal_metadata_t* optimization_goal_metadata = NULL;
  if (include_optional) {
    optimization_goal_metadata = optimization_goal_metadata_create(
       // false, not to have infinite recursion
      instantiate_optimization_goal_metadata_conversion_tag_v3_goal_metadata(0),
       // false, not to have infinite recursion
      instantiate_optimization_goal_metadata_frequency_goal_metadata(0),
       // false, not to have infinite recursion
      instantiate_optimization_goal_metadata_scrollup_goal_metadata(0)
    );
  } else {
    optimization_goal_metadata = optimization_goal_metadata_create(
      NULL,
      NULL,
      NULL
    );
  }

  return optimization_goal_metadata;
}


#ifdef optimization_goal_metadata_MAIN

void test_optimization_goal_metadata(int include_optional) {
    optimization_goal_metadata_t* optimization_goal_metadata_1 = instantiate_optimization_goal_metadata(include_optional);

	cJSON* jsonoptimization_goal_metadata_1 = optimization_goal_metadata_convertToJSON(optimization_goal_metadata_1);
	printf("optimization_goal_metadata :\n%s\n", cJSON_Print(jsonoptimization_goal_metadata_1));
	optimization_goal_metadata_t* optimization_goal_metadata_2 = optimization_goal_metadata_parseFromJSON(jsonoptimization_goal_metadata_1);
	cJSON* jsonoptimization_goal_metadata_2 = optimization_goal_metadata_convertToJSON(optimization_goal_metadata_2);
	printf("repeating optimization_goal_metadata:\n%s\n", cJSON_Print(jsonoptimization_goal_metadata_2));
}

int main() {
  test_optimization_goal_metadata(1);
  test_optimization_goal_metadata(0);

  printf("Hello world \n");
  return 0;
}

#endif // optimization_goal_metadata_MAIN
#endif // optimization_goal_metadata_TEST
