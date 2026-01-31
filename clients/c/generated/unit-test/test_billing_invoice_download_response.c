#ifndef billing_invoice_download_response_TEST
#define billing_invoice_download_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define billing_invoice_download_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/billing_invoice_download_response.h"
billing_invoice_download_response_t* instantiate_billing_invoice_download_response(int include_optional);



billing_invoice_download_response_t* instantiate_billing_invoice_download_response(int include_optional) {
  billing_invoice_download_response_t* billing_invoice_download_response = NULL;
  if (include_optional) {
    billing_invoice_download_response = billing_invoice_download_response_create(
      "0",
      "0"
    );
  } else {
    billing_invoice_download_response = billing_invoice_download_response_create(
      "0",
      "0"
    );
  }

  return billing_invoice_download_response;
}


#ifdef billing_invoice_download_response_MAIN

void test_billing_invoice_download_response(int include_optional) {
    billing_invoice_download_response_t* billing_invoice_download_response_1 = instantiate_billing_invoice_download_response(include_optional);

	cJSON* jsonbilling_invoice_download_response_1 = billing_invoice_download_response_convertToJSON(billing_invoice_download_response_1);
	printf("billing_invoice_download_response :\n%s\n", cJSON_Print(jsonbilling_invoice_download_response_1));
	billing_invoice_download_response_t* billing_invoice_download_response_2 = billing_invoice_download_response_parseFromJSON(jsonbilling_invoice_download_response_1);
	cJSON* jsonbilling_invoice_download_response_2 = billing_invoice_download_response_convertToJSON(billing_invoice_download_response_2);
	printf("repeating billing_invoice_download_response:\n%s\n", cJSON_Print(jsonbilling_invoice_download_response_2));
}

int main() {
  test_billing_invoice_download_response(1);
  test_billing_invoice_download_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // billing_invoice_download_response_MAIN
#endif // billing_invoice_download_response_TEST
