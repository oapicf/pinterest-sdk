#ifndef pinterest_lib_status204_TEST
#define pinterest_lib_status204_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pinterest_lib_status204_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pinterest_lib_status204.h"
pinterest_lib_status204_t* instantiate_pinterest_lib_status204(int include_optional);



pinterest_lib_status204_t* instantiate_pinterest_lib_status204(int include_optional) {
  pinterest_lib_status204_t* pinterest_lib_status204 = NULL;
  if (include_optional) {
    pinterest_lib_status204 = pinterest_lib_status204_create(
      pinterest_rest_api_pinterest_lib_status204_STATUSCODE_204
    );
  } else {
    pinterest_lib_status204 = pinterest_lib_status204_create(
      pinterest_rest_api_pinterest_lib_status204_STATUSCODE_204
    );
  }

  return pinterest_lib_status204;
}


#ifdef pinterest_lib_status204_MAIN

void test_pinterest_lib_status204(int include_optional) {
    pinterest_lib_status204_t* pinterest_lib_status204_1 = instantiate_pinterest_lib_status204(include_optional);

	cJSON* jsonpinterest_lib_status204_1 = pinterest_lib_status204_convertToJSON(pinterest_lib_status204_1);
	printf("pinterest_lib_status204 :\n%s\n", cJSON_Print(jsonpinterest_lib_status204_1));
	pinterest_lib_status204_t* pinterest_lib_status204_2 = pinterest_lib_status204_parseFromJSON(jsonpinterest_lib_status204_1);
	cJSON* jsonpinterest_lib_status204_2 = pinterest_lib_status204_convertToJSON(pinterest_lib_status204_2);
	printf("repeating pinterest_lib_status204:\n%s\n", cJSON_Print(jsonpinterest_lib_status204_2));
}

int main() {
  test_pinterest_lib_status204(1);
  test_pinterest_lib_status204(0);

  printf("Hello world \n");
  return 0;
}

#endif // pinterest_lib_status204_MAIN
#endif // pinterest_lib_status204_TEST
