#ifndef trend_type_TEST
#define trend_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define trend_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/trend_type.h"
trend_type_t* instantiate_trend_type(int include_optional);



trend_type_t* instantiate_trend_type(int include_optional) {
  trend_type_t* trend_type = NULL;
  if (include_optional) {
    trend_type = trend_type_create(
    );
  } else {
    trend_type = trend_type_create(
    );
  }

  return trend_type;
}


#ifdef trend_type_MAIN

void test_trend_type(int include_optional) {
    trend_type_t* trend_type_1 = instantiate_trend_type(include_optional);

	cJSON* jsontrend_type_1 = trend_type_convertToJSON(trend_type_1);
	printf("trend_type :\n%s\n", cJSON_Print(jsontrend_type_1));
	trend_type_t* trend_type_2 = trend_type_parseFromJSON(jsontrend_type_1);
	cJSON* jsontrend_type_2 = trend_type_convertToJSON(trend_type_2);
	printf("repeating trend_type:\n%s\n", cJSON_Print(jsontrend_type_2));
}

int main() {
  test_trend_type(1);
  test_trend_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // trend_type_MAIN
#endif // trend_type_TEST
