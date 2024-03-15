#ifndef bulk_upsert_status_TEST
#define bulk_upsert_status_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define bulk_upsert_status_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/bulk_upsert_status.h"
bulk_upsert_status_t* instantiate_bulk_upsert_status(int include_optional);



bulk_upsert_status_t* instantiate_bulk_upsert_status(int include_optional) {
  bulk_upsert_status_t* bulk_upsert_status = NULL;
  if (include_optional) {
    bulk_upsert_status = bulk_upsert_status_create(
    );
  } else {
    bulk_upsert_status = bulk_upsert_status_create(
    );
  }

  return bulk_upsert_status;
}


#ifdef bulk_upsert_status_MAIN

void test_bulk_upsert_status(int include_optional) {
    bulk_upsert_status_t* bulk_upsert_status_1 = instantiate_bulk_upsert_status(include_optional);

	cJSON* jsonbulk_upsert_status_1 = bulk_upsert_status_convertToJSON(bulk_upsert_status_1);
	printf("bulk_upsert_status :\n%s\n", cJSON_Print(jsonbulk_upsert_status_1));
	bulk_upsert_status_t* bulk_upsert_status_2 = bulk_upsert_status_parseFromJSON(jsonbulk_upsert_status_1);
	cJSON* jsonbulk_upsert_status_2 = bulk_upsert_status_convertToJSON(bulk_upsert_status_2);
	printf("repeating bulk_upsert_status:\n%s\n", cJSON_Print(jsonbulk_upsert_status_2));
}

int main() {
  test_bulk_upsert_status(1);
  test_bulk_upsert_status(0);

  printf("Hello world \n");
  return 0;
}

#endif // bulk_upsert_status_MAIN
#endif // bulk_upsert_status_TEST
