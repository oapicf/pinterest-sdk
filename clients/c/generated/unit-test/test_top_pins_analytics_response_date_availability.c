#ifndef top_pins_analytics_response_date_availability_TEST
#define top_pins_analytics_response_date_availability_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define top_pins_analytics_response_date_availability_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/top_pins_analytics_response_date_availability.h"
top_pins_analytics_response_date_availability_t* instantiate_top_pins_analytics_response_date_availability(int include_optional);



top_pins_analytics_response_date_availability_t* instantiate_top_pins_analytics_response_date_availability(int include_optional) {
  top_pins_analytics_response_date_availability_t* top_pins_analytics_response_date_availability = NULL;
  if (include_optional) {
    top_pins_analytics_response_date_availability = top_pins_analytics_response_date_availability_create(
      1649116799000,
      false
    );
  } else {
    top_pins_analytics_response_date_availability = top_pins_analytics_response_date_availability_create(
      1649116799000,
      false
    );
  }

  return top_pins_analytics_response_date_availability;
}


#ifdef top_pins_analytics_response_date_availability_MAIN

void test_top_pins_analytics_response_date_availability(int include_optional) {
    top_pins_analytics_response_date_availability_t* top_pins_analytics_response_date_availability_1 = instantiate_top_pins_analytics_response_date_availability(include_optional);

	cJSON* jsontop_pins_analytics_response_date_availability_1 = top_pins_analytics_response_date_availability_convertToJSON(top_pins_analytics_response_date_availability_1);
	printf("top_pins_analytics_response_date_availability :\n%s\n", cJSON_Print(jsontop_pins_analytics_response_date_availability_1));
	top_pins_analytics_response_date_availability_t* top_pins_analytics_response_date_availability_2 = top_pins_analytics_response_date_availability_parseFromJSON(jsontop_pins_analytics_response_date_availability_1);
	cJSON* jsontop_pins_analytics_response_date_availability_2 = top_pins_analytics_response_date_availability_convertToJSON(top_pins_analytics_response_date_availability_2);
	printf("repeating top_pins_analytics_response_date_availability:\n%s\n", cJSON_Print(jsontop_pins_analytics_response_date_availability_2));
}

int main() {
  test_top_pins_analytics_response_date_availability(1);
  test_top_pins_analytics_response_date_availability(0);

  printf("Hello world \n");
  return 0;
}

#endif // top_pins_analytics_response_date_availability_MAIN
#endif // top_pins_analytics_response_date_availability_TEST
