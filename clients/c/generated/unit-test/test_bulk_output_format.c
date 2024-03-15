#ifndef bulk_output_format_TEST
#define bulk_output_format_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define bulk_output_format_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/bulk_output_format.h"
bulk_output_format_t* instantiate_bulk_output_format(int include_optional);



bulk_output_format_t* instantiate_bulk_output_format(int include_optional) {
  bulk_output_format_t* bulk_output_format = NULL;
  if (include_optional) {
    bulk_output_format = bulk_output_format_create(
    );
  } else {
    bulk_output_format = bulk_output_format_create(
    );
  }

  return bulk_output_format;
}


#ifdef bulk_output_format_MAIN

void test_bulk_output_format(int include_optional) {
    bulk_output_format_t* bulk_output_format_1 = instantiate_bulk_output_format(include_optional);

	cJSON* jsonbulk_output_format_1 = bulk_output_format_convertToJSON(bulk_output_format_1);
	printf("bulk_output_format :\n%s\n", cJSON_Print(jsonbulk_output_format_1));
	bulk_output_format_t* bulk_output_format_2 = bulk_output_format_parseFromJSON(jsonbulk_output_format_1);
	cJSON* jsonbulk_output_format_2 = bulk_output_format_convertToJSON(bulk_output_format_2);
	printf("repeating bulk_output_format:\n%s\n", cJSON_Print(jsonbulk_output_format_2));
}

int main() {
  test_bulk_output_format(1);
  test_bulk_output_format(0);

  printf("Hello world \n");
  return 0;
}

#endif // bulk_output_format_MAIN
#endif // bulk_output_format_TEST
