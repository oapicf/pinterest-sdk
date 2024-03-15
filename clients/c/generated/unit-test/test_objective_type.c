#ifndef objective_type_TEST
#define objective_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define objective_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/objective_type.h"
objective_type_t* instantiate_objective_type(int include_optional);



objective_type_t* instantiate_objective_type(int include_optional) {
  objective_type_t* objective_type = NULL;
  if (include_optional) {
    objective_type = objective_type_create(
    );
  } else {
    objective_type = objective_type_create(
    );
  }

  return objective_type;
}


#ifdef objective_type_MAIN

void test_objective_type(int include_optional) {
    objective_type_t* objective_type_1 = instantiate_objective_type(include_optional);

	cJSON* jsonobjective_type_1 = objective_type_convertToJSON(objective_type_1);
	printf("objective_type :\n%s\n", cJSON_Print(jsonobjective_type_1));
	objective_type_t* objective_type_2 = objective_type_parseFromJSON(jsonobjective_type_1);
	cJSON* jsonobjective_type_2 = objective_type_convertToJSON(objective_type_2);
	printf("repeating objective_type:\n%s\n", cJSON_Print(jsonobjective_type_2));
}

int main() {
  test_objective_type(1);
  test_objective_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // objective_type_MAIN
#endif // objective_type_TEST
