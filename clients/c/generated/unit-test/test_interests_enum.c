#ifndef interests_enum_TEST
#define interests_enum_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define interests_enum_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/interests_enum.h"
interests_enum_t* instantiate_interests_enum(int include_optional);



interests_enum_t* instantiate_interests_enum(int include_optional) {
  interests_enum_t* interests_enum = NULL;
  if (include_optional) {
    interests_enum = interests_enum_create(
    );
  } else {
    interests_enum = interests_enum_create(
    );
  }

  return interests_enum;
}


#ifdef interests_enum_MAIN

void test_interests_enum(int include_optional) {
    interests_enum_t* interests_enum_1 = instantiate_interests_enum(include_optional);

	cJSON* jsoninterests_enum_1 = interests_enum_convertToJSON(interests_enum_1);
	printf("interests_enum :\n%s\n", cJSON_Print(jsoninterests_enum_1));
	interests_enum_t* interests_enum_2 = interests_enum_parseFromJSON(jsoninterests_enum_1);
	cJSON* jsoninterests_enum_2 = interests_enum_convertToJSON(interests_enum_2);
	printf("repeating interests_enum:\n%s\n", cJSON_Print(jsoninterests_enum_2));
}

int main() {
  test_interests_enum(1);
  test_interests_enum(0);

  printf("Hello world \n");
  return 0;
}

#endif // interests_enum_MAIN
#endif // interests_enum_TEST
