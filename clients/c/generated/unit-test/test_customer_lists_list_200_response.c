#ifndef customer_lists_list_200_response_TEST
#define customer_lists_list_200_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define customer_lists_list_200_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/customer_lists_list_200_response.h"
customer_lists_list_200_response_t* instantiate_customer_lists_list_200_response(int include_optional);



customer_lists_list_200_response_t* instantiate_customer_lists_list_200_response(int include_optional) {
  customer_lists_list_200_response_t* customer_lists_list_200_response = NULL;
  if (include_optional) {
    customer_lists_list_200_response = customer_lists_list_200_response_create(
      list_createList(),
      "0"
    );
  } else {
    customer_lists_list_200_response = customer_lists_list_200_response_create(
      list_createList(),
      "0"
    );
  }

  return customer_lists_list_200_response;
}


#ifdef customer_lists_list_200_response_MAIN

void test_customer_lists_list_200_response(int include_optional) {
    customer_lists_list_200_response_t* customer_lists_list_200_response_1 = instantiate_customer_lists_list_200_response(include_optional);

	cJSON* jsoncustomer_lists_list_200_response_1 = customer_lists_list_200_response_convertToJSON(customer_lists_list_200_response_1);
	printf("customer_lists_list_200_response :\n%s\n", cJSON_Print(jsoncustomer_lists_list_200_response_1));
	customer_lists_list_200_response_t* customer_lists_list_200_response_2 = customer_lists_list_200_response_parseFromJSON(jsoncustomer_lists_list_200_response_1);
	cJSON* jsoncustomer_lists_list_200_response_2 = customer_lists_list_200_response_convertToJSON(customer_lists_list_200_response_2);
	printf("repeating customer_lists_list_200_response:\n%s\n", cJSON_Print(jsoncustomer_lists_list_200_response_2));
}

int main() {
  test_customer_lists_list_200_response(1);
  test_customer_lists_list_200_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // customer_lists_list_200_response_MAIN
#endif // customer_lists_list_200_response_TEST
