#ifndef error_detail_TEST
#define error_detail_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define error_detail_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/error_detail.h"
error_detail_t* instantiate_error_detail(int include_optional);



error_detail_t* instantiate_error_detail(int include_optional) {
  error_detail_t* error_detail = NULL;
  if (include_optional) {
    error_detail = error_detail_create(
      20,
      42,
      "Invalid email"
    );
  } else {
    error_detail = error_detail_create(
      20,
      42,
      "Invalid email"
    );
  }

  return error_detail;
}


#ifdef error_detail_MAIN

void test_error_detail(int include_optional) {
    error_detail_t* error_detail_1 = instantiate_error_detail(include_optional);

	cJSON* jsonerror_detail_1 = error_detail_convertToJSON(error_detail_1);
	printf("error_detail :\n%s\n", cJSON_Print(jsonerror_detail_1));
	error_detail_t* error_detail_2 = error_detail_parseFromJSON(jsonerror_detail_1);
	cJSON* jsonerror_detail_2 = error_detail_convertToJSON(error_detail_2);
	printf("repeating error_detail:\n%s\n", cJSON_Print(jsonerror_detail_2));
}

int main() {
  test_error_detail(1);
  test_error_detail(0);

  printf("Hello world \n");
  return 0;
}

#endif // error_detail_MAIN
#endif // error_detail_TEST
