#ifndef operation_type_TEST
#define operation_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define operation_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/operation_type.h"
operation_type_t* instantiate_operation_type(int include_optional);



operation_type_t* instantiate_operation_type(int include_optional) {
  operation_type_t* operation_type = NULL;
  if (include_optional) {
    operation_type = operation_type_create(
    );
  } else {
    operation_type = operation_type_create(
    );
  }

  return operation_type;
}


#ifdef operation_type_MAIN

void test_operation_type(int include_optional) {
    operation_type_t* operation_type_1 = instantiate_operation_type(include_optional);

	cJSON* jsonoperation_type_1 = operation_type_convertToJSON(operation_type_1);
	printf("operation_type :\n%s\n", cJSON_Print(jsonoperation_type_1));
	operation_type_t* operation_type_2 = operation_type_parseFromJSON(jsonoperation_type_1);
	cJSON* jsonoperation_type_2 = operation_type_convertToJSON(operation_type_2);
	printf("repeating operation_type:\n%s\n", cJSON_Print(jsonoperation_type_2));
}

int main() {
  test_operation_type(1);
  test_operation_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // operation_type_MAIN
#endif // operation_type_TEST
