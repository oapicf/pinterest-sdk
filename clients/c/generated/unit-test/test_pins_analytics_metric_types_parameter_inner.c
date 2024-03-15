#ifndef pins_analytics_metric_types_parameter_inner_TEST
#define pins_analytics_metric_types_parameter_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pins_analytics_metric_types_parameter_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pins_analytics_metric_types_parameter_inner.h"
pins_analytics_metric_types_parameter_inner_t* instantiate_pins_analytics_metric_types_parameter_inner(int include_optional);



pins_analytics_metric_types_parameter_inner_t* instantiate_pins_analytics_metric_types_parameter_inner(int include_optional) {
  pins_analytics_metric_types_parameter_inner_t* pins_analytics_metric_types_parameter_inner = NULL;
  if (include_optional) {
    pins_analytics_metric_types_parameter_inner = pins_analytics_metric_types_parameter_inner_create(
    );
  } else {
    pins_analytics_metric_types_parameter_inner = pins_analytics_metric_types_parameter_inner_create(
    );
  }

  return pins_analytics_metric_types_parameter_inner;
}


#ifdef pins_analytics_metric_types_parameter_inner_MAIN

void test_pins_analytics_metric_types_parameter_inner(int include_optional) {
    pins_analytics_metric_types_parameter_inner_t* pins_analytics_metric_types_parameter_inner_1 = instantiate_pins_analytics_metric_types_parameter_inner(include_optional);

	cJSON* jsonpins_analytics_metric_types_parameter_inner_1 = pins_analytics_metric_types_parameter_inner_convertToJSON(pins_analytics_metric_types_parameter_inner_1);
	printf("pins_analytics_metric_types_parameter_inner :\n%s\n", cJSON_Print(jsonpins_analytics_metric_types_parameter_inner_1));
	pins_analytics_metric_types_parameter_inner_t* pins_analytics_metric_types_parameter_inner_2 = pins_analytics_metric_types_parameter_inner_parseFromJSON(jsonpins_analytics_metric_types_parameter_inner_1);
	cJSON* jsonpins_analytics_metric_types_parameter_inner_2 = pins_analytics_metric_types_parameter_inner_convertToJSON(pins_analytics_metric_types_parameter_inner_2);
	printf("repeating pins_analytics_metric_types_parameter_inner:\n%s\n", cJSON_Print(jsonpins_analytics_metric_types_parameter_inner_2));
}

int main() {
  test_pins_analytics_metric_types_parameter_inner(1);
  test_pins_analytics_metric_types_parameter_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // pins_analytics_metric_types_parameter_inner_MAIN
#endif // pins_analytics_metric_types_parameter_inner_TEST
