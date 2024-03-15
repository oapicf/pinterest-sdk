#ifndef related_terms_TEST
#define related_terms_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define related_terms_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/related_terms.h"
related_terms_t* instantiate_related_terms(int include_optional);



related_terms_t* instantiate_related_terms(int include_optional) {
  related_terms_t* related_terms = NULL;
  if (include_optional) {
    related_terms = related_terms_create(
      "clothes",
      2,
      list_createList()
    );
  } else {
    related_terms = related_terms_create(
      "clothes",
      2,
      list_createList()
    );
  }

  return related_terms;
}


#ifdef related_terms_MAIN

void test_related_terms(int include_optional) {
    related_terms_t* related_terms_1 = instantiate_related_terms(include_optional);

	cJSON* jsonrelated_terms_1 = related_terms_convertToJSON(related_terms_1);
	printf("related_terms :\n%s\n", cJSON_Print(jsonrelated_terms_1));
	related_terms_t* related_terms_2 = related_terms_parseFromJSON(jsonrelated_terms_1);
	cJSON* jsonrelated_terms_2 = related_terms_convertToJSON(related_terms_2);
	printf("repeating related_terms:\n%s\n", cJSON_Print(jsonrelated_terms_2));
}

int main() {
  test_related_terms(1);
  test_related_terms(0);

  printf("Hello world \n");
  return 0;
}

#endif // related_terms_MAIN
#endif // related_terms_TEST
