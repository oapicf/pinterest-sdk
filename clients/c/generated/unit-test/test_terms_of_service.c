#ifndef terms_of_service_TEST
#define terms_of_service_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define terms_of_service_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/terms_of_service.h"
terms_of_service_t* instantiate_terms_of_service(int include_optional);



terms_of_service_t* instantiate_terms_of_service(int include_optional) {
  terms_of_service_t* terms_of_service = NULL;
  if (include_optional) {
    terms_of_service = terms_of_service_create(
      "2650449554526",
      "example test",
      true,
      "549755885175"
    );
  } else {
    terms_of_service = terms_of_service_create(
      "2650449554526",
      "example test",
      true,
      "549755885175"
    );
  }

  return terms_of_service;
}


#ifdef terms_of_service_MAIN

void test_terms_of_service(int include_optional) {
    terms_of_service_t* terms_of_service_1 = instantiate_terms_of_service(include_optional);

	cJSON* jsonterms_of_service_1 = terms_of_service_convertToJSON(terms_of_service_1);
	printf("terms_of_service :\n%s\n", cJSON_Print(jsonterms_of_service_1));
	terms_of_service_t* terms_of_service_2 = terms_of_service_parseFromJSON(jsonterms_of_service_1);
	cJSON* jsonterms_of_service_2 = terms_of_service_convertToJSON(terms_of_service_2);
	printf("repeating terms_of_service:\n%s\n", cJSON_Print(jsonterms_of_service_2));
}

int main() {
  test_terms_of_service(1);
  test_terms_of_service(0);

  printf("Hello world \n");
  return 0;
}

#endif // terms_of_service_MAIN
#endif // terms_of_service_TEST
