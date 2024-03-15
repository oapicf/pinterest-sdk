#ifndef trends_supported_region_TEST
#define trends_supported_region_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define trends_supported_region_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/trends_supported_region.h"
trends_supported_region_t* instantiate_trends_supported_region(int include_optional);



trends_supported_region_t* instantiate_trends_supported_region(int include_optional) {
  trends_supported_region_t* trends_supported_region = NULL;
  if (include_optional) {
    trends_supported_region = trends_supported_region_create(
    );
  } else {
    trends_supported_region = trends_supported_region_create(
    );
  }

  return trends_supported_region;
}


#ifdef trends_supported_region_MAIN

void test_trends_supported_region(int include_optional) {
    trends_supported_region_t* trends_supported_region_1 = instantiate_trends_supported_region(include_optional);

	cJSON* jsontrends_supported_region_1 = trends_supported_region_convertToJSON(trends_supported_region_1);
	printf("trends_supported_region :\n%s\n", cJSON_Print(jsontrends_supported_region_1));
	trends_supported_region_t* trends_supported_region_2 = trends_supported_region_parseFromJSON(jsontrends_supported_region_1);
	cJSON* jsontrends_supported_region_2 = trends_supported_region_convertToJSON(trends_supported_region_2);
	printf("repeating trends_supported_region:\n%s\n", cJSON_Print(jsontrends_supported_region_2));
}

int main() {
  test_trends_supported_region(1);
  test_trends_supported_region(0);

  printf("Hello world \n");
  return 0;
}

#endif // trends_supported_region_MAIN
#endif // trends_supported_region_TEST
