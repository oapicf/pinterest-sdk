#ifndef budget_type_TEST
#define budget_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define budget_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/budget_type.h"
budget_type_t* instantiate_budget_type(int include_optional);



budget_type_t* instantiate_budget_type(int include_optional) {
  budget_type_t* budget_type = NULL;
  if (include_optional) {
    budget_type = budget_type_create(
    );
  } else {
    budget_type = budget_type_create(
    );
  }

  return budget_type;
}


#ifdef budget_type_MAIN

void test_budget_type(int include_optional) {
    budget_type_t* budget_type_1 = instantiate_budget_type(include_optional);

	cJSON* jsonbudget_type_1 = budget_type_convertToJSON(budget_type_1);
	printf("budget_type :\n%s\n", cJSON_Print(jsonbudget_type_1));
	budget_type_t* budget_type_2 = budget_type_parseFromJSON(jsonbudget_type_1);
	cJSON* jsonbudget_type_2 = budget_type_convertToJSON(budget_type_2);
	printf("repeating budget_type:\n%s\n", cJSON_Print(jsonbudget_type_2));
}

int main() {
  test_budget_type(1);
  test_budget_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // budget_type_MAIN
#endif // budget_type_TEST
