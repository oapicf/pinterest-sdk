#ifndef billing_invoices_get_200_response_TEST
#define billing_invoices_get_200_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define billing_invoices_get_200_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/billing_invoices_get_200_response.h"
billing_invoices_get_200_response_t* instantiate_billing_invoices_get_200_response(int include_optional);



billing_invoices_get_200_response_t* instantiate_billing_invoices_get_200_response(int include_optional) {
  billing_invoices_get_200_response_t* billing_invoices_get_200_response = NULL;
  if (include_optional) {
    billing_invoices_get_200_response = billing_invoices_get_200_response_create(
      "0",
      list_createList()
    );
  } else {
    billing_invoices_get_200_response = billing_invoices_get_200_response_create(
      "0",
      list_createList()
    );
  }

  return billing_invoices_get_200_response;
}


#ifdef billing_invoices_get_200_response_MAIN

void test_billing_invoices_get_200_response(int include_optional) {
    billing_invoices_get_200_response_t* billing_invoices_get_200_response_1 = instantiate_billing_invoices_get_200_response(include_optional);

	cJSON* jsonbilling_invoices_get_200_response_1 = billing_invoices_get_200_response_convertToJSON(billing_invoices_get_200_response_1);
	printf("billing_invoices_get_200_response :\n%s\n", cJSON_Print(jsonbilling_invoices_get_200_response_1));
	billing_invoices_get_200_response_t* billing_invoices_get_200_response_2 = billing_invoices_get_200_response_parseFromJSON(jsonbilling_invoices_get_200_response_1);
	cJSON* jsonbilling_invoices_get_200_response_2 = billing_invoices_get_200_response_convertToJSON(billing_invoices_get_200_response_2);
	printf("repeating billing_invoices_get_200_response:\n%s\n", cJSON_Print(jsonbilling_invoices_get_200_response_2));
}

int main() {
  test_billing_invoices_get_200_response(1);
  test_billing_invoices_get_200_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // billing_invoices_get_200_response_MAIN
#endif // billing_invoices_get_200_response_TEST
