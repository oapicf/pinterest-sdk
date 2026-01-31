#ifndef customer_list_upload_create_response_TEST
#define customer_list_upload_create_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define customer_list_upload_create_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/customer_list_upload_create_response.h"
customer_list_upload_create_response_t* instantiate_customer_list_upload_create_response(int include_optional);

#include "test_customer_list_upload.c"
#include "test_s3_multipart_upload_data.c"


customer_list_upload_create_response_t* instantiate_customer_list_upload_create_response(int include_optional) {
  customer_list_upload_create_response_t* customer_list_upload_create_response = NULL;
  if (include_optional) {
    customer_list_upload_create_response = customer_list_upload_create_response_create(
       // false, not to have infinite recursion
      instantiate_customer_list_upload(0),
       // false, not to have infinite recursion
      instantiate_s3_multipart_upload_data(0)
    );
  } else {
    customer_list_upload_create_response = customer_list_upload_create_response_create(
      NULL,
      NULL
    );
  }

  return customer_list_upload_create_response;
}


#ifdef customer_list_upload_create_response_MAIN

void test_customer_list_upload_create_response(int include_optional) {
    customer_list_upload_create_response_t* customer_list_upload_create_response_1 = instantiate_customer_list_upload_create_response(include_optional);

	cJSON* jsoncustomer_list_upload_create_response_1 = customer_list_upload_create_response_convertToJSON(customer_list_upload_create_response_1);
	printf("customer_list_upload_create_response :\n%s\n", cJSON_Print(jsoncustomer_list_upload_create_response_1));
	customer_list_upload_create_response_t* customer_list_upload_create_response_2 = customer_list_upload_create_response_parseFromJSON(jsoncustomer_list_upload_create_response_1);
	cJSON* jsoncustomer_list_upload_create_response_2 = customer_list_upload_create_response_convertToJSON(customer_list_upload_create_response_2);
	printf("repeating customer_list_upload_create_response:\n%s\n", cJSON_Print(jsoncustomer_list_upload_create_response_2));
}

int main() {
  test_customer_list_upload_create_response(1);
  test_customer_list_upload_create_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // customer_list_upload_create_response_MAIN
#endif // customer_list_upload_create_response_TEST
