#ifndef pinterest_lib_error_TEST
#define pinterest_lib_error_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pinterest_lib_error_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pinterest_lib_error.h"
pinterest_lib_error_t* instantiate_pinterest_lib_error(int include_optional);



pinterest_lib_error_t* instantiate_pinterest_lib_error(int include_optional) {
  pinterest_lib_error_t* pinterest_lib_error = NULL;
  if (include_optional) {
    pinterest_lib_error = pinterest_lib_error_create(
      56,
      "0"
    );
  } else {
    pinterest_lib_error = pinterest_lib_error_create(
      56,
      "0"
    );
  }

  return pinterest_lib_error;
}


#ifdef pinterest_lib_error_MAIN

void test_pinterest_lib_error(int include_optional) {
    pinterest_lib_error_t* pinterest_lib_error_1 = instantiate_pinterest_lib_error(include_optional);

	cJSON* jsonpinterest_lib_error_1 = pinterest_lib_error_convertToJSON(pinterest_lib_error_1);
	printf("pinterest_lib_error :\n%s\n", cJSON_Print(jsonpinterest_lib_error_1));
	pinterest_lib_error_t* pinterest_lib_error_2 = pinterest_lib_error_parseFromJSON(jsonpinterest_lib_error_1);
	cJSON* jsonpinterest_lib_error_2 = pinterest_lib_error_convertToJSON(pinterest_lib_error_2);
	printf("repeating pinterest_lib_error:\n%s\n", cJSON_Print(jsonpinterest_lib_error_2));
}

int main() {
  test_pinterest_lib_error(1);
  test_pinterest_lib_error(0);

  printf("Hello world \n");
  return 0;
}

#endif // pinterest_lib_error_MAIN
#endif // pinterest_lib_error_TEST
