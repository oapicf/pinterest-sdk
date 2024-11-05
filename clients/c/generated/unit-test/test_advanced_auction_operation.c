#ifndef advanced_auction_operation_TEST
#define advanced_auction_operation_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define advanced_auction_operation_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/advanced_auction_operation.h"
advanced_auction_operation_t* instantiate_advanced_auction_operation(int include_optional);



advanced_auction_operation_t* instantiate_advanced_auction_operation(int include_optional) {
  advanced_auction_operation_t* advanced_auction_operation = NULL;
  if (include_optional) {
    advanced_auction_operation = advanced_auction_operation_create(
    );
  } else {
    advanced_auction_operation = advanced_auction_operation_create(
    );
  }

  return advanced_auction_operation;
}


#ifdef advanced_auction_operation_MAIN

void test_advanced_auction_operation(int include_optional) {
    advanced_auction_operation_t* advanced_auction_operation_1 = instantiate_advanced_auction_operation(include_optional);

	cJSON* jsonadvanced_auction_operation_1 = advanced_auction_operation_convertToJSON(advanced_auction_operation_1);
	printf("advanced_auction_operation :\n%s\n", cJSON_Print(jsonadvanced_auction_operation_1));
	advanced_auction_operation_t* advanced_auction_operation_2 = advanced_auction_operation_parseFromJSON(jsonadvanced_auction_operation_1);
	cJSON* jsonadvanced_auction_operation_2 = advanced_auction_operation_convertToJSON(advanced_auction_operation_2);
	printf("repeating advanced_auction_operation:\n%s\n", cJSON_Print(jsonadvanced_auction_operation_2));
}

int main() {
  test_advanced_auction_operation(1);
  test_advanced_auction_operation(0);

  printf("Hello world \n");
  return 0;
}

#endif // advanced_auction_operation_MAIN
#endif // advanced_auction_operation_TEST
