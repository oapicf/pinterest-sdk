#ifndef customer_list_update_request_TEST
#define customer_list_update_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define customer_list_update_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/customer_list_update_request.h"
customer_list_update_request_t* instantiate_customer_list_update_request(int include_optional);



customer_list_update_request_t* instantiate_customer_list_update_request(int include_optional) {
  customer_list_update_request_t* customer_list_update_request = NULL;
  if (include_optional) {
    customer_list_update_request = customer_list_update_request_create(
      "email2@pinterest.com,email6@pinterest.com,",
      "REMOVE",
      0
    );
  } else {
    customer_list_update_request = customer_list_update_request_create(
      "email2@pinterest.com,email6@pinterest.com,",
      "REMOVE",
      0
    );
  }

  return customer_list_update_request;
}


#ifdef customer_list_update_request_MAIN

void test_customer_list_update_request(int include_optional) {
    customer_list_update_request_t* customer_list_update_request_1 = instantiate_customer_list_update_request(include_optional);

	cJSON* jsoncustomer_list_update_request_1 = customer_list_update_request_convertToJSON(customer_list_update_request_1);
	printf("customer_list_update_request :\n%s\n", cJSON_Print(jsoncustomer_list_update_request_1));
	customer_list_update_request_t* customer_list_update_request_2 = customer_list_update_request_parseFromJSON(jsoncustomer_list_update_request_1);
	cJSON* jsoncustomer_list_update_request_2 = customer_list_update_request_convertToJSON(customer_list_update_request_2);
	printf("repeating customer_list_update_request:\n%s\n", cJSON_Print(jsoncustomer_list_update_request_2));
}

int main() {
  test_customer_list_update_request(1);
  test_customer_list_update_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // customer_list_update_request_MAIN
#endif // customer_list_update_request_TEST
