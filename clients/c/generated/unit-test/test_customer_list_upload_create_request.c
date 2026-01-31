#ifndef customer_list_upload_create_request_TEST
#define customer_list_upload_create_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define customer_list_upload_create_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/customer_list_upload_create_request.h"
customer_list_upload_create_request_t* instantiate_customer_list_upload_create_request(int include_optional);



customer_list_upload_create_request_t* instantiate_customer_list_upload_create_request(int include_optional) {
  customer_list_upload_create_request_t* customer_list_upload_create_request = NULL;
  if (include_optional) {
    customer_list_upload_create_request = customer_list_upload_create_request_create(
      "REMOVE",
      2
    );
  } else {
    customer_list_upload_create_request = customer_list_upload_create_request_create(
      "REMOVE",
      2
    );
  }

  return customer_list_upload_create_request;
}


#ifdef customer_list_upload_create_request_MAIN

void test_customer_list_upload_create_request(int include_optional) {
    customer_list_upload_create_request_t* customer_list_upload_create_request_1 = instantiate_customer_list_upload_create_request(include_optional);

	cJSON* jsoncustomer_list_upload_create_request_1 = customer_list_upload_create_request_convertToJSON(customer_list_upload_create_request_1);
	printf("customer_list_upload_create_request :\n%s\n", cJSON_Print(jsoncustomer_list_upload_create_request_1));
	customer_list_upload_create_request_t* customer_list_upload_create_request_2 = customer_list_upload_create_request_parseFromJSON(jsoncustomer_list_upload_create_request_1);
	cJSON* jsoncustomer_list_upload_create_request_2 = customer_list_upload_create_request_convertToJSON(customer_list_upload_create_request_2);
	printf("repeating customer_list_upload_create_request:\n%s\n", cJSON_Print(jsoncustomer_list_upload_create_request_2));
}

int main() {
  test_customer_list_upload_create_request(1);
  test_customer_list_upload_create_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // customer_list_upload_create_request_MAIN
#endif // customer_list_upload_create_request_TEST
