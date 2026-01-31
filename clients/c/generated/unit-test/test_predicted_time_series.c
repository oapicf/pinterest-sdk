#ifndef predicted_time_series_TEST
#define predicted_time_series_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define predicted_time_series_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/predicted_time_series.h"
predicted_time_series_t* instantiate_predicted_time_series(int include_optional);



predicted_time_series_t* instantiate_predicted_time_series(int include_optional) {
  predicted_time_series_t* predicted_time_series = NULL;
  if (include_optional) {
    predicted_time_series = predicted_time_series_create(
      "2013-10-20"
    );
  } else {
    predicted_time_series = predicted_time_series_create(
      "2013-10-20"
    );
  }

  return predicted_time_series;
}


#ifdef predicted_time_series_MAIN

void test_predicted_time_series(int include_optional) {
    predicted_time_series_t* predicted_time_series_1 = instantiate_predicted_time_series(include_optional);

	cJSON* jsonpredicted_time_series_1 = predicted_time_series_convertToJSON(predicted_time_series_1);
	printf("predicted_time_series :\n%s\n", cJSON_Print(jsonpredicted_time_series_1));
	predicted_time_series_t* predicted_time_series_2 = predicted_time_series_parseFromJSON(jsonpredicted_time_series_1);
	cJSON* jsonpredicted_time_series_2 = predicted_time_series_convertToJSON(predicted_time_series_2);
	printf("repeating predicted_time_series:\n%s\n", cJSON_Print(jsonpredicted_time_series_2));
}

int main() {
  test_predicted_time_series(1);
  test_predicted_time_series(0);

  printf("Hello world \n");
  return 0;
}

#endif // predicted_time_series_MAIN
#endif // predicted_time_series_TEST
