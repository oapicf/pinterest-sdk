#ifndef reporting_column_async_TEST
#define reporting_column_async_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define reporting_column_async_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/reporting_column_async.h"
reporting_column_async_t* instantiate_reporting_column_async(int include_optional);



reporting_column_async_t* instantiate_reporting_column_async(int include_optional) {
  reporting_column_async_t* reporting_column_async = NULL;
  if (include_optional) {
    reporting_column_async = reporting_column_async_create(
    );
  } else {
    reporting_column_async = reporting_column_async_create(
    );
  }

  return reporting_column_async;
}


#ifdef reporting_column_async_MAIN

void test_reporting_column_async(int include_optional) {
    reporting_column_async_t* reporting_column_async_1 = instantiate_reporting_column_async(include_optional);

	cJSON* jsonreporting_column_async_1 = reporting_column_async_convertToJSON(reporting_column_async_1);
	printf("reporting_column_async :\n%s\n", cJSON_Print(jsonreporting_column_async_1));
	reporting_column_async_t* reporting_column_async_2 = reporting_column_async_parseFromJSON(jsonreporting_column_async_1);
	cJSON* jsonreporting_column_async_2 = reporting_column_async_convertToJSON(reporting_column_async_2);
	printf("repeating reporting_column_async:\n%s\n", cJSON_Print(jsonreporting_column_async_2));
}

int main() {
  test_reporting_column_async(1);
  test_reporting_column_async(0);

  printf("Hello world \n");
  return 0;
}

#endif // reporting_column_async_MAIN
#endif // reporting_column_async_TEST
