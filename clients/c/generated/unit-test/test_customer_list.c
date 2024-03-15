#ifndef customer_list_TEST
#define customer_list_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define customer_list_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/customer_list.h"
customer_list_t* instantiate_customer_list(int include_optional);



customer_list_t* instantiate_customer_list(int include_optional) {
  customer_list_t* customer_list = NULL;
  if (include_optional) {
    customer_list = customer_list_create(
      "549756359984",
      1452208622,
      "643",
      "The Glengarry Glen Ross leads",
      2,
      0,
      11,
      pinterest_rest_api_customer_list_STATUS_"PROCESSING",
      "customerlist",
      1461269616,
      0
    );
  } else {
    customer_list = customer_list_create(
      "549756359984",
      1452208622,
      "643",
      "The Glengarry Glen Ross leads",
      2,
      0,
      11,
      pinterest_rest_api_customer_list_STATUS_"PROCESSING",
      "customerlist",
      1461269616,
      0
    );
  }

  return customer_list;
}


#ifdef customer_list_MAIN

void test_customer_list(int include_optional) {
    customer_list_t* customer_list_1 = instantiate_customer_list(include_optional);

	cJSON* jsoncustomer_list_1 = customer_list_convertToJSON(customer_list_1);
	printf("customer_list :\n%s\n", cJSON_Print(jsoncustomer_list_1));
	customer_list_t* customer_list_2 = customer_list_parseFromJSON(jsoncustomer_list_1);
	cJSON* jsoncustomer_list_2 = customer_list_convertToJSON(customer_list_2);
	printf("repeating customer_list:\n%s\n", cJSON_Print(jsoncustomer_list_2));
}

int main() {
  test_customer_list(1);
  test_customer_list(0);

  printf("Hello world \n");
  return 0;
}

#endif // customer_list_MAIN
#endif // customer_list_TEST
