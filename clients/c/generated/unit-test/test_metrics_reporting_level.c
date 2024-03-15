#ifndef metrics_reporting_level_TEST
#define metrics_reporting_level_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define metrics_reporting_level_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/metrics_reporting_level.h"
metrics_reporting_level_t* instantiate_metrics_reporting_level(int include_optional);



metrics_reporting_level_t* instantiate_metrics_reporting_level(int include_optional) {
  metrics_reporting_level_t* metrics_reporting_level = NULL;
  if (include_optional) {
    metrics_reporting_level = metrics_reporting_level_create(
    );
  } else {
    metrics_reporting_level = metrics_reporting_level_create(
    );
  }

  return metrics_reporting_level;
}


#ifdef metrics_reporting_level_MAIN

void test_metrics_reporting_level(int include_optional) {
    metrics_reporting_level_t* metrics_reporting_level_1 = instantiate_metrics_reporting_level(include_optional);

	cJSON* jsonmetrics_reporting_level_1 = metrics_reporting_level_convertToJSON(metrics_reporting_level_1);
	printf("metrics_reporting_level :\n%s\n", cJSON_Print(jsonmetrics_reporting_level_1));
	metrics_reporting_level_t* metrics_reporting_level_2 = metrics_reporting_level_parseFromJSON(jsonmetrics_reporting_level_1);
	cJSON* jsonmetrics_reporting_level_2 = metrics_reporting_level_convertToJSON(metrics_reporting_level_2);
	printf("repeating metrics_reporting_level:\n%s\n", cJSON_Print(jsonmetrics_reporting_level_2));
}

int main() {
  test_metrics_reporting_level(1);
  test_metrics_reporting_level(0);

  printf("Hello world \n");
  return 0;
}

#endif // metrics_reporting_level_MAIN
#endif // metrics_reporting_level_TEST
