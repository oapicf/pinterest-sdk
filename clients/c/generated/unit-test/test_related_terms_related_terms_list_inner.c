#ifndef related_terms_related_terms_list_inner_TEST
#define related_terms_related_terms_list_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define related_terms_related_terms_list_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/related_terms_related_terms_list_inner.h"
related_terms_related_terms_list_inner_t* instantiate_related_terms_related_terms_list_inner(int include_optional);



related_terms_related_terms_list_inner_t* instantiate_related_terms_related_terms_list_inner(int include_optional) {
  related_terms_related_terms_list_inner_t* related_terms_related_terms_list_inner = NULL;
  if (include_optional) {
    related_terms_related_terms_list_inner = related_terms_related_terms_list_inner_create(
      "clothes",
      ["shoes","cute clothes"]
    );
  } else {
    related_terms_related_terms_list_inner = related_terms_related_terms_list_inner_create(
      "clothes",
      ["shoes","cute clothes"]
    );
  }

  return related_terms_related_terms_list_inner;
}


#ifdef related_terms_related_terms_list_inner_MAIN

void test_related_terms_related_terms_list_inner(int include_optional) {
    related_terms_related_terms_list_inner_t* related_terms_related_terms_list_inner_1 = instantiate_related_terms_related_terms_list_inner(include_optional);

	cJSON* jsonrelated_terms_related_terms_list_inner_1 = related_terms_related_terms_list_inner_convertToJSON(related_terms_related_terms_list_inner_1);
	printf("related_terms_related_terms_list_inner :\n%s\n", cJSON_Print(jsonrelated_terms_related_terms_list_inner_1));
	related_terms_related_terms_list_inner_t* related_terms_related_terms_list_inner_2 = related_terms_related_terms_list_inner_parseFromJSON(jsonrelated_terms_related_terms_list_inner_1);
	cJSON* jsonrelated_terms_related_terms_list_inner_2 = related_terms_related_terms_list_inner_convertToJSON(related_terms_related_terms_list_inner_2);
	printf("repeating related_terms_related_terms_list_inner:\n%s\n", cJSON_Print(jsonrelated_terms_related_terms_list_inner_2));
}

int main() {
  test_related_terms_related_terms_list_inner(1);
  test_related_terms_related_terms_list_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // related_terms_related_terms_list_inner_MAIN
#endif // related_terms_related_terms_list_inner_TEST
