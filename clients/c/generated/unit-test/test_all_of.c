#ifndef all_of_TEST
#define all_of_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define all_of_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/all_of.h"
all_of_t* instantiate_all_of(int include_optional);



all_of_t* instantiate_all_of(int include_optional) {
  all_of_t* all_of = NULL;
  if (include_optional) {
    all_of = all_of_create(
      list_createList()
    );
  } else {
    all_of = all_of_create(
      list_createList()
    );
  }

  return all_of;
}


#ifdef all_of_MAIN

void test_all_of(int include_optional) {
    all_of_t* all_of_1 = instantiate_all_of(include_optional);

	cJSON* jsonall_of_1 = all_of_convertToJSON(all_of_1);
	printf("all_of :\n%s\n", cJSON_Print(jsonall_of_1));
	all_of_t* all_of_2 = all_of_parseFromJSON(jsonall_of_1);
	cJSON* jsonall_of_2 = all_of_convertToJSON(all_of_2);
	printf("repeating all_of:\n%s\n", cJSON_Print(jsonall_of_2));
}

int main() {
  test_all_of(1);
  test_all_of(0);

  printf("Hello world \n");
  return 0;
}

#endif // all_of_MAIN
#endif // all_of_TEST
