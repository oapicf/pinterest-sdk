#ifndef promotions_response_TEST
#define promotions_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define promotions_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/promotions_response.h"
promotions_response_t* instantiate_promotions_response(int include_optional);



promotions_response_t* instantiate_promotions_response(int include_optional) {
  promotions_response_t* promotions_response = NULL;
  if (include_optional) {
    promotions_response = promotions_response_create(
      list_createList()
    );
  } else {
    promotions_response = promotions_response_create(
      list_createList()
    );
  }

  return promotions_response;
}


#ifdef promotions_response_MAIN

void test_promotions_response(int include_optional) {
    promotions_response_t* promotions_response_1 = instantiate_promotions_response(include_optional);

	cJSON* jsonpromotions_response_1 = promotions_response_convertToJSON(promotions_response_1);
	printf("promotions_response :\n%s\n", cJSON_Print(jsonpromotions_response_1));
	promotions_response_t* promotions_response_2 = promotions_response_parseFromJSON(jsonpromotions_response_1);
	cJSON* jsonpromotions_response_2 = promotions_response_convertToJSON(promotions_response_2);
	printf("repeating promotions_response:\n%s\n", cJSON_Print(jsonpromotions_response_2));
}

int main() {
  test_promotions_response(1);
  test_promotions_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // promotions_response_MAIN
#endif // promotions_response_TEST
