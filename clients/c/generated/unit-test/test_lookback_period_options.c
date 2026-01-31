#ifndef lookback_period_options_TEST
#define lookback_period_options_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define lookback_period_options_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/lookback_period_options.h"
lookback_period_options_t* instantiate_lookback_period_options(int include_optional);



lookback_period_options_t* instantiate_lookback_period_options(int include_optional) {
  lookback_period_options_t* lookback_period_options = NULL;
  if (include_optional) {
    lookback_period_options = lookback_period_options_create(
    );
  } else {
    lookback_period_options = lookback_period_options_create(
    );
  }

  return lookback_period_options;
}


#ifdef lookback_period_options_MAIN

void test_lookback_period_options(int include_optional) {
    lookback_period_options_t* lookback_period_options_1 = instantiate_lookback_period_options(include_optional);

	cJSON* jsonlookback_period_options_1 = lookback_period_options_convertToJSON(lookback_period_options_1);
	printf("lookback_period_options :\n%s\n", cJSON_Print(jsonlookback_period_options_1));
	lookback_period_options_t* lookback_period_options_2 = lookback_period_options_parseFromJSON(jsonlookback_period_options_1);
	cJSON* jsonlookback_period_options_2 = lookback_period_options_convertToJSON(lookback_period_options_2);
	printf("repeating lookback_period_options:\n%s\n", cJSON_Print(jsonlookback_period_options_2));
}

int main() {
  test_lookback_period_options(1);
  test_lookback_period_options(0);

  printf("Hello world \n");
  return 0;
}

#endif // lookback_period_options_MAIN
#endif // lookback_period_options_TEST
