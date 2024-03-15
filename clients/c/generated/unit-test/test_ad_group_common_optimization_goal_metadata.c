#ifndef ad_group_common_optimization_goal_metadata_TEST
#define ad_group_common_optimization_goal_metadata_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ad_group_common_optimization_goal_metadata_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ad_group_common_optimization_goal_metadata.h"
ad_group_common_optimization_goal_metadata_t* instantiate_ad_group_common_optimization_goal_metadata(int include_optional);

#include "test_optimization_goal_metadata_conversion_tag_v3_goal_metadata.c"
#include "test_optimization_goal_metadata_frequency_goal_metadata.c"
#include "test_optimization_goal_metadata_scrollup_goal_metadata.c"


ad_group_common_optimization_goal_metadata_t* instantiate_ad_group_common_optimization_goal_metadata(int include_optional) {
  ad_group_common_optimization_goal_metadata_t* ad_group_common_optimization_goal_metadata = NULL;
  if (include_optional) {
    ad_group_common_optimization_goal_metadata = ad_group_common_optimization_goal_metadata_create(
       // false, not to have infinite recursion
      instantiate_optimization_goal_metadata_conversion_tag_v3_goal_metadata(0),
       // false, not to have infinite recursion
      instantiate_optimization_goal_metadata_frequency_goal_metadata(0),
       // false, not to have infinite recursion
      instantiate_optimization_goal_metadata_scrollup_goal_metadata(0)
    );
  } else {
    ad_group_common_optimization_goal_metadata = ad_group_common_optimization_goal_metadata_create(
      NULL,
      NULL,
      NULL
    );
  }

  return ad_group_common_optimization_goal_metadata;
}


#ifdef ad_group_common_optimization_goal_metadata_MAIN

void test_ad_group_common_optimization_goal_metadata(int include_optional) {
    ad_group_common_optimization_goal_metadata_t* ad_group_common_optimization_goal_metadata_1 = instantiate_ad_group_common_optimization_goal_metadata(include_optional);

	cJSON* jsonad_group_common_optimization_goal_metadata_1 = ad_group_common_optimization_goal_metadata_convertToJSON(ad_group_common_optimization_goal_metadata_1);
	printf("ad_group_common_optimization_goal_metadata :\n%s\n", cJSON_Print(jsonad_group_common_optimization_goal_metadata_1));
	ad_group_common_optimization_goal_metadata_t* ad_group_common_optimization_goal_metadata_2 = ad_group_common_optimization_goal_metadata_parseFromJSON(jsonad_group_common_optimization_goal_metadata_1);
	cJSON* jsonad_group_common_optimization_goal_metadata_2 = ad_group_common_optimization_goal_metadata_convertToJSON(ad_group_common_optimization_goal_metadata_2);
	printf("repeating ad_group_common_optimization_goal_metadata:\n%s\n", cJSON_Print(jsonad_group_common_optimization_goal_metadata_2));
}

int main() {
  test_ad_group_common_optimization_goal_metadata(1);
  test_ad_group_common_optimization_goal_metadata(0);

  printf("Hello world \n");
  return 0;
}

#endif // ad_group_common_optimization_goal_metadata_MAIN
#endif // ad_group_common_optimization_goal_metadata_TEST
