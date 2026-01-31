#ifndef quality_component_issue_TEST
#define quality_component_issue_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define quality_component_issue_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/quality_component_issue.h"
quality_component_issue_t* instantiate_quality_component_issue(int include_optional);



quality_component_issue_t* instantiate_quality_component_issue(int include_optional) {
  quality_component_issue_t* quality_component_issue = NULL;
  if (include_optional) {
    quality_component_issue = quality_component_issue_create(
      "0",
      "0",
      "0"
    );
  } else {
    quality_component_issue = quality_component_issue_create(
      "0",
      "0",
      "0"
    );
  }

  return quality_component_issue;
}


#ifdef quality_component_issue_MAIN

void test_quality_component_issue(int include_optional) {
    quality_component_issue_t* quality_component_issue_1 = instantiate_quality_component_issue(include_optional);

	cJSON* jsonquality_component_issue_1 = quality_component_issue_convertToJSON(quality_component_issue_1);
	printf("quality_component_issue :\n%s\n", cJSON_Print(jsonquality_component_issue_1));
	quality_component_issue_t* quality_component_issue_2 = quality_component_issue_parseFromJSON(jsonquality_component_issue_1);
	cJSON* jsonquality_component_issue_2 = quality_component_issue_convertToJSON(quality_component_issue_2);
	printf("repeating quality_component_issue:\n%s\n", cJSON_Print(jsonquality_component_issue_2));
}

int main() {
  test_quality_component_issue(1);
  test_quality_component_issue(0);

  printf("Hello world \n");
  return 0;
}

#endif // quality_component_issue_MAIN
#endif // quality_component_issue_TEST
