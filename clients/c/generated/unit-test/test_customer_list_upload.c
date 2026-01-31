#ifndef customer_list_upload_TEST
#define customer_list_upload_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define customer_list_upload_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/customer_list_upload.h"
customer_list_upload_t* instantiate_customer_list_upload(int include_optional);

#include "test_record_counts.c"


customer_list_upload_t* instantiate_customer_list_upload(int include_optional) {
  customer_list_upload_t* customer_list_upload = NULL;
  if (include_optional) {
    customer_list_upload = customer_list_upload_create(
      "9876543210",
      1728606435,
      "59854745824",
      [{"error_code":42,"message":"Invalid email","count":20}],
      "1234567890",
      pinterest_rest_api_customer_list_upload__"REMOVE",
       // false, not to have infinite recursion
      instantiate_record_counts(0),
      pinterest_rest_api_customer_list_upload_STATE_"RUNNING",
      1728606435
    );
  } else {
    customer_list_upload = customer_list_upload_create(
      "9876543210",
      1728606435,
      "59854745824",
      [{"error_code":42,"message":"Invalid email","count":20}],
      "1234567890",
      pinterest_rest_api_customer_list_upload__"REMOVE",
      NULL,
      pinterest_rest_api_customer_list_upload_STATE_"RUNNING",
      1728606435
    );
  }

  return customer_list_upload;
}


#ifdef customer_list_upload_MAIN

void test_customer_list_upload(int include_optional) {
    customer_list_upload_t* customer_list_upload_1 = instantiate_customer_list_upload(include_optional);

	cJSON* jsoncustomer_list_upload_1 = customer_list_upload_convertToJSON(customer_list_upload_1);
	printf("customer_list_upload :\n%s\n", cJSON_Print(jsoncustomer_list_upload_1));
	customer_list_upload_t* customer_list_upload_2 = customer_list_upload_parseFromJSON(jsoncustomer_list_upload_1);
	cJSON* jsoncustomer_list_upload_2 = customer_list_upload_convertToJSON(customer_list_upload_2);
	printf("repeating customer_list_upload:\n%s\n", cJSON_Print(jsoncustomer_list_upload_2));
}

int main() {
  test_customer_list_upload(1);
  test_customer_list_upload(0);

  printf("Hello world \n");
  return 0;
}

#endif // customer_list_upload_MAIN
#endif // customer_list_upload_TEST
