#ifndef batch_operation_status_TEST
#define batch_operation_status_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define batch_operation_status_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/batch_operation_status.h"
batch_operation_status_t* instantiate_batch_operation_status(int include_optional);



batch_operation_status_t* instantiate_batch_operation_status(int include_optional) {
  batch_operation_status_t* batch_operation_status = NULL;
  if (include_optional) {
    batch_operation_status = batch_operation_status_create(
    );
  } else {
    batch_operation_status = batch_operation_status_create(
    );
  }

  return batch_operation_status;
}


#ifdef batch_operation_status_MAIN

void test_batch_operation_status(int include_optional) {
    batch_operation_status_t* batch_operation_status_1 = instantiate_batch_operation_status(include_optional);

	cJSON* jsonbatch_operation_status_1 = batch_operation_status_convertToJSON(batch_operation_status_1);
	printf("batch_operation_status :\n%s\n", cJSON_Print(jsonbatch_operation_status_1));
	batch_operation_status_t* batch_operation_status_2 = batch_operation_status_parseFromJSON(jsonbatch_operation_status_1);
	cJSON* jsonbatch_operation_status_2 = batch_operation_status_convertToJSON(batch_operation_status_2);
	printf("repeating batch_operation_status:\n%s\n", cJSON_Print(jsonbatch_operation_status_2));
}

int main() {
  test_batch_operation_status(1);
  test_batch_operation_status(0);

  printf("Hello world \n");
  return 0;
}

#endif // batch_operation_status_MAIN
#endif // batch_operation_status_TEST
