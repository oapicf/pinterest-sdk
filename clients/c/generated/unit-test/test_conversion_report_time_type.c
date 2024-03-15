#ifndef conversion_report_time_type_TEST
#define conversion_report_time_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define conversion_report_time_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/conversion_report_time_type.h"
conversion_report_time_type_t* instantiate_conversion_report_time_type(int include_optional);



conversion_report_time_type_t* instantiate_conversion_report_time_type(int include_optional) {
  conversion_report_time_type_t* conversion_report_time_type = NULL;
  if (include_optional) {
    conversion_report_time_type = conversion_report_time_type_create(
    );
  } else {
    conversion_report_time_type = conversion_report_time_type_create(
    );
  }

  return conversion_report_time_type;
}


#ifdef conversion_report_time_type_MAIN

void test_conversion_report_time_type(int include_optional) {
    conversion_report_time_type_t* conversion_report_time_type_1 = instantiate_conversion_report_time_type(include_optional);

	cJSON* jsonconversion_report_time_type_1 = conversion_report_time_type_convertToJSON(conversion_report_time_type_1);
	printf("conversion_report_time_type :\n%s\n", cJSON_Print(jsonconversion_report_time_type_1));
	conversion_report_time_type_t* conversion_report_time_type_2 = conversion_report_time_type_parseFromJSON(jsonconversion_report_time_type_1);
	cJSON* jsonconversion_report_time_type_2 = conversion_report_time_type_convertToJSON(conversion_report_time_type_2);
	printf("repeating conversion_report_time_type:\n%s\n", cJSON_Print(jsonconversion_report_time_type_2));
}

int main() {
  test_conversion_report_time_type(1);
  test_conversion_report_time_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // conversion_report_time_type_MAIN
#endif // conversion_report_time_type_TEST
