#ifndef customer_list_upload_response_TEST
#define customer_list_upload_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define customer_list_upload_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/customer_list_upload_response.h"
customer_list_upload_response_t* instantiate_customer_list_upload_response(int include_optional);

#include "test_record_counts.c"


customer_list_upload_response_t* instantiate_customer_list_upload_response(int include_optional) {
  customer_list_upload_response_t* customer_list_upload_response = NULL;
  if (include_optional) {
    customer_list_upload_response = customer_list_upload_response_create(
      "9876543210",
      1728606435,
      "59854745824",
      [{"error_code":42,"message":"Invalid email","count":20}],
      "1234567890",
      pinterest_rest_api_customer_list_upload_response__"REMOVE",
       // false, not to have infinite recursion
      instantiate_record_counts(0),
      pinterest_rest_api_customer_list_upload_response_STATE_"RUNNING",
      1728606435
    );
  } else {
    customer_list_upload_response = customer_list_upload_response_create(
      "9876543210",
      1728606435,
      "59854745824",
      [{"error_code":42,"message":"Invalid email","count":20}],
      "1234567890",
      pinterest_rest_api_customer_list_upload_response__"REMOVE",
      NULL,
      pinterest_rest_api_customer_list_upload_response_STATE_"RUNNING",
      1728606435
    );
  }

  return customer_list_upload_response;
}


#ifdef customer_list_upload_response_MAIN

void test_customer_list_upload_response(int include_optional) {
    customer_list_upload_response_t* customer_list_upload_response_1 = instantiate_customer_list_upload_response(include_optional);

	cJSON* jsoncustomer_list_upload_response_1 = customer_list_upload_response_convertToJSON(customer_list_upload_response_1);
	printf("customer_list_upload_response :\n%s\n", cJSON_Print(jsoncustomer_list_upload_response_1));
	customer_list_upload_response_t* customer_list_upload_response_2 = customer_list_upload_response_parseFromJSON(jsoncustomer_list_upload_response_1);
	cJSON* jsoncustomer_list_upload_response_2 = customer_list_upload_response_convertToJSON(customer_list_upload_response_2);
	printf("repeating customer_list_upload_response:\n%s\n", cJSON_Print(jsoncustomer_list_upload_response_2));
}

int main() {
  test_customer_list_upload_response(1);
  test_customer_list_upload_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // customer_list_upload_response_MAIN
#endif // customer_list_upload_response_TEST
