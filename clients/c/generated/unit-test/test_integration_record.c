#ifndef integration_record_TEST
#define integration_record_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define integration_record_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/integration_record.h"
integration_record_t* instantiate_integration_record(int include_optional);



integration_record_t* instantiate_integration_record(int include_optional) {
  integration_record_t* integration_record = NULL;
  if (include_optional) {
    integration_record = integration_record_create(
      "a",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      56,
      56,
      "0",
      "0",
      "0",
      56,
      56
    );
  } else {
    integration_record = integration_record_create(
      "a",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      56,
      56,
      "0",
      "0",
      "0",
      56,
      56
    );
  }

  return integration_record;
}


#ifdef integration_record_MAIN

void test_integration_record(int include_optional) {
    integration_record_t* integration_record_1 = instantiate_integration_record(include_optional);

	cJSON* jsonintegration_record_1 = integration_record_convertToJSON(integration_record_1);
	printf("integration_record :\n%s\n", cJSON_Print(jsonintegration_record_1));
	integration_record_t* integration_record_2 = integration_record_parseFromJSON(jsonintegration_record_1);
	cJSON* jsonintegration_record_2 = integration_record_convertToJSON(integration_record_2);
	printf("repeating integration_record:\n%s\n", cJSON_Print(jsonintegration_record_2));
}

int main() {
  test_integration_record(1);
  test_integration_record(0);

  printf("Hello world \n");
  return 0;
}

#endif // integration_record_MAIN
#endif // integration_record_TEST
