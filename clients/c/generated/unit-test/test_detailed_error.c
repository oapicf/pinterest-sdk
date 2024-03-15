#ifndef detailed_error_TEST
#define detailed_error_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define detailed_error_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/detailed_error.h"
detailed_error_t* instantiate_detailed_error(int include_optional);



detailed_error_t* instantiate_detailed_error(int include_optional) {
  detailed_error_t* detailed_error = NULL;
  if (include_optional) {
    detailed_error = detailed_error_create(
      56,
      "0",
      0
    );
  } else {
    detailed_error = detailed_error_create(
      56,
      "0",
      0
    );
  }

  return detailed_error;
}


#ifdef detailed_error_MAIN

void test_detailed_error(int include_optional) {
    detailed_error_t* detailed_error_1 = instantiate_detailed_error(include_optional);

	cJSON* jsondetailed_error_1 = detailed_error_convertToJSON(detailed_error_1);
	printf("detailed_error :\n%s\n", cJSON_Print(jsondetailed_error_1));
	detailed_error_t* detailed_error_2 = detailed_error_parseFromJSON(jsondetailed_error_1);
	cJSON* jsondetailed_error_2 = detailed_error_convertToJSON(detailed_error_2);
	printf("repeating detailed_error:\n%s\n", cJSON_Print(jsondetailed_error_2));
}

int main() {
  test_detailed_error(1);
  test_detailed_error(0);

  printf("Hello world \n");
  return 0;
}

#endif // detailed_error_MAIN
#endif // detailed_error_TEST
