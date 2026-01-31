#ifndef record_counts_TEST
#define record_counts_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define record_counts_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/record_counts.h"
record_counts_t* instantiate_record_counts(int include_optional);



record_counts_t* instantiate_record_counts(int include_optional) {
  record_counts_t* record_counts = NULL;
  if (include_optional) {
    record_counts = record_counts_create(
      50,
      1000,
      950
    );
  } else {
    record_counts = record_counts_create(
      50,
      1000,
      950
    );
  }

  return record_counts;
}


#ifdef record_counts_MAIN

void test_record_counts(int include_optional) {
    record_counts_t* record_counts_1 = instantiate_record_counts(include_optional);

	cJSON* jsonrecord_counts_1 = record_counts_convertToJSON(record_counts_1);
	printf("record_counts :\n%s\n", cJSON_Print(jsonrecord_counts_1));
	record_counts_t* record_counts_2 = record_counts_parseFromJSON(jsonrecord_counts_1);
	cJSON* jsonrecord_counts_2 = record_counts_convertToJSON(record_counts_2);
	printf("repeating record_counts:\n%s\n", cJSON_Print(jsonrecord_counts_2));
}

int main() {
  test_record_counts(1);
  test_record_counts(0);

  printf("Hello world \n");
  return 0;
}

#endif // record_counts_MAIN
#endif // record_counts_TEST
