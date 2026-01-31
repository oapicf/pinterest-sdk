#ifndef reporting_time_zone_TEST
#define reporting_time_zone_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define reporting_time_zone_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/reporting_time_zone.h"
reporting_time_zone_t* instantiate_reporting_time_zone(int include_optional);



reporting_time_zone_t* instantiate_reporting_time_zone(int include_optional) {
  reporting_time_zone_t* reporting_time_zone = NULL;
  if (include_optional) {
    reporting_time_zone = reporting_time_zone_create(
    );
  } else {
    reporting_time_zone = reporting_time_zone_create(
    );
  }

  return reporting_time_zone;
}


#ifdef reporting_time_zone_MAIN

void test_reporting_time_zone(int include_optional) {
    reporting_time_zone_t* reporting_time_zone_1 = instantiate_reporting_time_zone(include_optional);

	cJSON* jsonreporting_time_zone_1 = reporting_time_zone_convertToJSON(reporting_time_zone_1);
	printf("reporting_time_zone :\n%s\n", cJSON_Print(jsonreporting_time_zone_1));
	reporting_time_zone_t* reporting_time_zone_2 = reporting_time_zone_parseFromJSON(jsonreporting_time_zone_1);
	cJSON* jsonreporting_time_zone_2 = reporting_time_zone_convertToJSON(reporting_time_zone_2);
	printf("repeating reporting_time_zone:\n%s\n", cJSON_Print(jsonreporting_time_zone_2));
}

int main() {
  test_reporting_time_zone(1);
  test_reporting_time_zone(0);

  printf("Hello world \n");
  return 0;
}

#endif // reporting_time_zone_MAIN
#endif // reporting_time_zone_TEST
