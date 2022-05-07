#ifndef action_type_TEST
#define action_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define action_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/action_type.h"
action_type_t* instantiate_action_type(int include_optional);



action_type_t* instantiate_action_type(int include_optional) {
  action_type_t* action_type = NULL;
  if (include_optional) {
    action_type = action_type_create(
    );
  } else {
    action_type = action_type_create(
    );
  }

  return action_type;
}


#ifdef action_type_MAIN

void test_action_type(int include_optional) {
    action_type_t* action_type_1 = instantiate_action_type(include_optional);

	cJSON* jsonaction_type_1 = action_type_convertToJSON(action_type_1);
	printf("action_type :\n%s\n", cJSON_Print(jsonaction_type_1));
	action_type_t* action_type_2 = action_type_parseFromJSON(jsonaction_type_1);
	cJSON* jsonaction_type_2 = action_type_convertToJSON(action_type_2);
	printf("repeating action_type:\n%s\n", cJSON_Print(jsonaction_type_2));
}

int main() {
  test_action_type(1);
  test_action_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // action_type_MAIN
#endif // action_type_TEST
