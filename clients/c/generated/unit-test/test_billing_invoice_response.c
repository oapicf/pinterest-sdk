#ifndef billing_invoice_response_TEST
#define billing_invoice_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define billing_invoice_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/billing_invoice_response.h"
billing_invoice_response_t* instantiate_billing_invoice_response(int include_optional);



billing_invoice_response_t* instantiate_billing_invoice_response(int include_optional) {
  billing_invoice_response_t* billing_invoice_response = NULL;
  if (include_optional) {
    billing_invoice_response = billing_invoice_response_create(
      "a",
      "0",
      56,
      56,
      56,
      56,
      "0",
      "2013-10-20",
      "2013-10-20",
      pinterest_rest_api_billing_invoice_response__UNK,
      pinterest_rest_api_billing_invoice_response_DOCUMENTTYPE_INVOICE,
      "a",
      "2013-10-20",
      "NET 30",
      pinterest_rest_api_billing_invoice_response_STATUS_"OPEN"
    );
  } else {
    billing_invoice_response = billing_invoice_response_create(
      "a",
      "0",
      56,
      56,
      56,
      56,
      "0",
      "2013-10-20",
      "2013-10-20",
      pinterest_rest_api_billing_invoice_response__UNK,
      pinterest_rest_api_billing_invoice_response_DOCUMENTTYPE_INVOICE,
      "a",
      "2013-10-20",
      "NET 30",
      pinterest_rest_api_billing_invoice_response_STATUS_"OPEN"
    );
  }

  return billing_invoice_response;
}


#ifdef billing_invoice_response_MAIN

void test_billing_invoice_response(int include_optional) {
    billing_invoice_response_t* billing_invoice_response_1 = instantiate_billing_invoice_response(include_optional);

	cJSON* jsonbilling_invoice_response_1 = billing_invoice_response_convertToJSON(billing_invoice_response_1);
	printf("billing_invoice_response :\n%s\n", cJSON_Print(jsonbilling_invoice_response_1));
	billing_invoice_response_t* billing_invoice_response_2 = billing_invoice_response_parseFromJSON(jsonbilling_invoice_response_1);
	cJSON* jsonbilling_invoice_response_2 = billing_invoice_response_convertToJSON(billing_invoice_response_2);
	printf("repeating billing_invoice_response:\n%s\n", cJSON_Print(jsonbilling_invoice_response_2));
}

int main() {
  test_billing_invoice_response(1);
  test_billing_invoice_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // billing_invoice_response_MAIN
#endif // billing_invoice_response_TEST
