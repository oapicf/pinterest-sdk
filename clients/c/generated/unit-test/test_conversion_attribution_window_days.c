#ifndef conversion_attribution_window_days_TEST
#define conversion_attribution_window_days_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define conversion_attribution_window_days_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/conversion_attribution_window_days.h"
conversion_attribution_window_days_t* instantiate_conversion_attribution_window_days(int include_optional);



conversion_attribution_window_days_t* instantiate_conversion_attribution_window_days(int include_optional) {
  conversion_attribution_window_days_t* conversion_attribution_window_days = NULL;
  if (include_optional) {
    conversion_attribution_window_days = conversion_attribution_window_days_create(
    );
  } else {
    conversion_attribution_window_days = conversion_attribution_window_days_create(
    );
  }

  return conversion_attribution_window_days;
}


#ifdef conversion_attribution_window_days_MAIN

void test_conversion_attribution_window_days(int include_optional) {
    conversion_attribution_window_days_t* conversion_attribution_window_days_1 = instantiate_conversion_attribution_window_days(include_optional);

	cJSON* jsonconversion_attribution_window_days_1 = conversion_attribution_window_days_convertToJSON(conversion_attribution_window_days_1);
	printf("conversion_attribution_window_days :\n%s\n", cJSON_Print(jsonconversion_attribution_window_days_1));
	conversion_attribution_window_days_t* conversion_attribution_window_days_2 = conversion_attribution_window_days_parseFromJSON(jsonconversion_attribution_window_days_1);
	cJSON* jsonconversion_attribution_window_days_2 = conversion_attribution_window_days_convertToJSON(conversion_attribution_window_days_2);
	printf("repeating conversion_attribution_window_days:\n%s\n", cJSON_Print(jsonconversion_attribution_window_days_2));
}

int main() {
  test_conversion_attribution_window_days(1);
  test_conversion_attribution_window_days(0);

  printf("Hello world \n");
  return 0;
}

#endif // conversion_attribution_window_days_MAIN
#endif // conversion_attribution_window_days_TEST
