#ifndef batch_operation_TEST
#define batch_operation_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define batch_operation_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/batch_operation.h"
batch_operation_t* instantiate_batch_operation(int include_optional);



batch_operation_t* instantiate_batch_operation(int include_optional) {
  batch_operation_t* batch_operation = NULL;
  if (include_optional) {
    batch_operation = batch_operation_create(
    );
  } else {
    batch_operation = batch_operation_create(
    );
  }

  return batch_operation;
}


#ifdef batch_operation_MAIN

void test_batch_operation(int include_optional) {
    batch_operation_t* batch_operation_1 = instantiate_batch_operation(include_optional);

	cJSON* jsonbatch_operation_1 = batch_operation_convertToJSON(batch_operation_1);
	printf("batch_operation :\n%s\n", cJSON_Print(jsonbatch_operation_1));
	batch_operation_t* batch_operation_2 = batch_operation_parseFromJSON(jsonbatch_operation_1);
	cJSON* jsonbatch_operation_2 = batch_operation_convertToJSON(batch_operation_2);
	printf("repeating batch_operation:\n%s\n", cJSON_Print(jsonbatch_operation_2));
}

int main() {
  test_batch_operation(1);
  test_batch_operation(0);

  printf("Hello world \n");
  return 0;
}

#endif // batch_operation_MAIN
#endif // batch_operation_TEST
