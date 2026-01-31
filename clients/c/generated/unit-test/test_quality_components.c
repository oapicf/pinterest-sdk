#ifndef quality_components_TEST
#define quality_components_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define quality_components_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/quality_components.h"
quality_components_t* instantiate_quality_components(int include_optional);



quality_components_t* instantiate_quality_components(int include_optional) {
  quality_components_t* quality_components = NULL;
  if (include_optional) {
    quality_components = quality_components_create(
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList()
    );
  } else {
    quality_components = quality_components_create(
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList()
    );
  }

  return quality_components;
}


#ifdef quality_components_MAIN

void test_quality_components(int include_optional) {
    quality_components_t* quality_components_1 = instantiate_quality_components(include_optional);

	cJSON* jsonquality_components_1 = quality_components_convertToJSON(quality_components_1);
	printf("quality_components :\n%s\n", cJSON_Print(jsonquality_components_1));
	quality_components_t* quality_components_2 = quality_components_parseFromJSON(jsonquality_components_1);
	cJSON* jsonquality_components_2 = quality_components_convertToJSON(quality_components_2);
	printf("repeating quality_components:\n%s\n", cJSON_Print(jsonquality_components_2));
}

int main() {
  test_quality_components(1);
  test_quality_components(0);

  printf("Hello world \n");
  return 0;
}

#endif // quality_components_MAIN
#endif // quality_components_TEST
