#ifndef quality_component_details_TEST
#define quality_component_details_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define quality_component_details_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/quality_component_details.h"
quality_component_details_t* instantiate_quality_component_details(int include_optional);



quality_component_details_t* instantiate_quality_component_details(int include_optional) {
  quality_component_details_t* quality_component_details = NULL;
  if (include_optional) {
    quality_component_details = quality_component_details_create(
      1.337,
      list_createList(),
      1.337
    );
  } else {
    quality_component_details = quality_component_details_create(
      1.337,
      list_createList(),
      1.337
    );
  }

  return quality_component_details;
}


#ifdef quality_component_details_MAIN

void test_quality_component_details(int include_optional) {
    quality_component_details_t* quality_component_details_1 = instantiate_quality_component_details(include_optional);

	cJSON* jsonquality_component_details_1 = quality_component_details_convertToJSON(quality_component_details_1);
	printf("quality_component_details :\n%s\n", cJSON_Print(jsonquality_component_details_1));
	quality_component_details_t* quality_component_details_2 = quality_component_details_parseFromJSON(jsonquality_component_details_1);
	cJSON* jsonquality_component_details_2 = quality_component_details_convertToJSON(quality_component_details_2);
	printf("repeating quality_component_details:\n%s\n", cJSON_Print(jsonquality_component_details_2));
}

int main() {
  test_quality_component_details(1);
  test_quality_component_details(0);

  printf("Hello world \n");
  return 0;
}

#endif // quality_component_details_MAIN
#endif // quality_component_details_TEST
