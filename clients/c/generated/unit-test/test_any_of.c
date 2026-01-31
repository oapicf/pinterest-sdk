#ifndef any_of_TEST
#define any_of_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define any_of_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/any_of.h"
any_of_t* instantiate_any_of(int include_optional);



any_of_t* instantiate_any_of(int include_optional) {
  any_of_t* any_of = NULL;
  if (include_optional) {
    any_of = any_of_create(
      list_createList()
    );
  } else {
    any_of = any_of_create(
      list_createList()
    );
  }

  return any_of;
}


#ifdef any_of_MAIN

void test_any_of(int include_optional) {
    any_of_t* any_of_1 = instantiate_any_of(include_optional);

	cJSON* jsonany_of_1 = any_of_convertToJSON(any_of_1);
	printf("any_of :\n%s\n", cJSON_Print(jsonany_of_1));
	any_of_t* any_of_2 = any_of_parseFromJSON(jsonany_of_1);
	cJSON* jsonany_of_2 = any_of_convertToJSON(any_of_2);
	printf("repeating any_of:\n%s\n", cJSON_Print(jsonany_of_2));
}

int main() {
  test_any_of(1);
  test_any_of(0);

  printf("Hello world \n");
  return 0;
}

#endif // any_of_MAIN
#endif // any_of_TEST
