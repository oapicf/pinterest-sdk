#ifndef time_series_TEST
#define time_series_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define time_series_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/time_series.h"
time_series_t* instantiate_time_series(int include_optional);



time_series_t* instantiate_time_series(int include_optional) {
  time_series_t* time_series = NULL;
  if (include_optional) {
    time_series = time_series_create(
      "2013-10-20"
    );
  } else {
    time_series = time_series_create(
      "2013-10-20"
    );
  }

  return time_series;
}


#ifdef time_series_MAIN

void test_time_series(int include_optional) {
    time_series_t* time_series_1 = instantiate_time_series(include_optional);

	cJSON* jsontime_series_1 = time_series_convertToJSON(time_series_1);
	printf("time_series :\n%s\n", cJSON_Print(jsontime_series_1));
	time_series_t* time_series_2 = time_series_parseFromJSON(jsontime_series_1);
	cJSON* jsontime_series_2 = time_series_convertToJSON(time_series_2);
	printf("repeating time_series:\n%s\n", cJSON_Print(jsontime_series_2));
}

int main() {
  test_time_series(1);
  test_time_series(0);

  printf("Hello world \n");
  return 0;
}

#endif // time_series_MAIN
#endif // time_series_TEST
