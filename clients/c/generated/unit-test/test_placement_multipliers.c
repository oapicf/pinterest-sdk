#ifndef placement_multipliers_TEST
#define placement_multipliers_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define placement_multipliers_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/placement_multipliers.h"
placement_multipliers_t* instantiate_placement_multipliers(int include_optional);



placement_multipliers_t* instantiate_placement_multipliers(int include_optional) {
  placement_multipliers_t* placement_multipliers = NULL;
  if (include_optional) {
    placement_multipliers = placement_multipliers_create(
      pinterest_rest_api_placement_multipliers_PLACEMENT_SEARCH
    );
  } else {
    placement_multipliers = placement_multipliers_create(
      pinterest_rest_api_placement_multipliers_PLACEMENT_SEARCH
    );
  }

  return placement_multipliers;
}


#ifdef placement_multipliers_MAIN

void test_placement_multipliers(int include_optional) {
    placement_multipliers_t* placement_multipliers_1 = instantiate_placement_multipliers(include_optional);

	cJSON* jsonplacement_multipliers_1 = placement_multipliers_convertToJSON(placement_multipliers_1);
	printf("placement_multipliers :\n%s\n", cJSON_Print(jsonplacement_multipliers_1));
	placement_multipliers_t* placement_multipliers_2 = placement_multipliers_parseFromJSON(jsonplacement_multipliers_1);
	cJSON* jsonplacement_multipliers_2 = placement_multipliers_convertToJSON(placement_multipliers_2);
	printf("repeating placement_multipliers:\n%s\n", cJSON_Print(jsonplacement_multipliers_2));
}

int main() {
  test_placement_multipliers(1);
  test_placement_multipliers(0);

  printf("Hello world \n");
  return 0;
}

#endif // placement_multipliers_MAIN
#endif // placement_multipliers_TEST
