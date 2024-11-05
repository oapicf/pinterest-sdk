#ifndef advanced_auction_operation_error_TEST
#define advanced_auction_operation_error_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define advanced_auction_operation_error_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/advanced_auction_operation_error.h"
advanced_auction_operation_error_t* instantiate_advanced_auction_operation_error(int include_optional);



advanced_auction_operation_error_t* instantiate_advanced_auction_operation_error(int include_optional) {
  advanced_auction_operation_error_t* advanced_auction_operation_error = NULL;
  if (include_optional) {
    advanced_auction_operation_error = advanced_auction_operation_error_create(
      6,
      "Bid in micro currency should be non-negative"
    );
  } else {
    advanced_auction_operation_error = advanced_auction_operation_error_create(
      6,
      "Bid in micro currency should be non-negative"
    );
  }

  return advanced_auction_operation_error;
}


#ifdef advanced_auction_operation_error_MAIN

void test_advanced_auction_operation_error(int include_optional) {
    advanced_auction_operation_error_t* advanced_auction_operation_error_1 = instantiate_advanced_auction_operation_error(include_optional);

	cJSON* jsonadvanced_auction_operation_error_1 = advanced_auction_operation_error_convertToJSON(advanced_auction_operation_error_1);
	printf("advanced_auction_operation_error :\n%s\n", cJSON_Print(jsonadvanced_auction_operation_error_1));
	advanced_auction_operation_error_t* advanced_auction_operation_error_2 = advanced_auction_operation_error_parseFromJSON(jsonadvanced_auction_operation_error_1);
	cJSON* jsonadvanced_auction_operation_error_2 = advanced_auction_operation_error_convertToJSON(advanced_auction_operation_error_2);
	printf("repeating advanced_auction_operation_error:\n%s\n", cJSON_Print(jsonadvanced_auction_operation_error_2));
}

int main() {
  test_advanced_auction_operation_error(1);
  test_advanced_auction_operation_error(0);

  printf("Hello world \n");
  return 0;
}

#endif // advanced_auction_operation_error_MAIN
#endif // advanced_auction_operation_error_TEST
