#ifndef promotions_list_200_response_TEST
#define promotions_list_200_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define promotions_list_200_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/promotions_list_200_response.h"
promotions_list_200_response_t* instantiate_promotions_list_200_response(int include_optional);



promotions_list_200_response_t* instantiate_promotions_list_200_response(int include_optional) {
  promotions_list_200_response_t* promotions_list_200_response = NULL;
  if (include_optional) {
    promotions_list_200_response = promotions_list_200_response_create(
      "0",
      list_createList()
    );
  } else {
    promotions_list_200_response = promotions_list_200_response_create(
      "0",
      list_createList()
    );
  }

  return promotions_list_200_response;
}


#ifdef promotions_list_200_response_MAIN

void test_promotions_list_200_response(int include_optional) {
    promotions_list_200_response_t* promotions_list_200_response_1 = instantiate_promotions_list_200_response(include_optional);

	cJSON* jsonpromotions_list_200_response_1 = promotions_list_200_response_convertToJSON(promotions_list_200_response_1);
	printf("promotions_list_200_response :\n%s\n", cJSON_Print(jsonpromotions_list_200_response_1));
	promotions_list_200_response_t* promotions_list_200_response_2 = promotions_list_200_response_parseFromJSON(jsonpromotions_list_200_response_1);
	cJSON* jsonpromotions_list_200_response_2 = promotions_list_200_response_convertToJSON(promotions_list_200_response_2);
	printf("repeating promotions_list_200_response:\n%s\n", cJSON_Print(jsonpromotions_list_200_response_2));
}

int main() {
  test_promotions_list_200_response(1);
  test_promotions_list_200_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // promotions_list_200_response_MAIN
#endif // promotions_list_200_response_TEST
