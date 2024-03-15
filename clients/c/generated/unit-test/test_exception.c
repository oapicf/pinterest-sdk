#ifndef exception_TEST
#define exception_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define exception_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/exception.h"
exception_t* instantiate_exception(int include_optional);



exception_t* instantiate_exception(int include_optional) {
  exception_t* exception = NULL;
  if (include_optional) {
    exception = exception_create(
      2,
      "Advertiser not found."
    );
  } else {
    exception = exception_create(
      2,
      "Advertiser not found."
    );
  }

  return exception;
}


#ifdef exception_MAIN

void test_exception(int include_optional) {
    exception_t* exception_1 = instantiate_exception(include_optional);

	cJSON* jsonexception_1 = exception_convertToJSON(exception_1);
	printf("exception :\n%s\n", cJSON_Print(jsonexception_1));
	exception_t* exception_2 = exception_parseFromJSON(jsonexception_1);
	cJSON* jsonexception_2 = exception_convertToJSON(exception_2);
	printf("repeating exception:\n%s\n", cJSON_Print(jsonexception_2));
}

int main() {
  test_exception(1);
  test_exception(0);

  printf("Hello world \n");
  return 0;
}

#endif // exception_MAIN
#endif // exception_TEST
