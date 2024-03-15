#ifndef placement_group_type_TEST
#define placement_group_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define placement_group_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/placement_group_type.h"
placement_group_type_t* instantiate_placement_group_type(int include_optional);



placement_group_type_t* instantiate_placement_group_type(int include_optional) {
  placement_group_type_t* placement_group_type = NULL;
  if (include_optional) {
    placement_group_type = placement_group_type_create(
    );
  } else {
    placement_group_type = placement_group_type_create(
    );
  }

  return placement_group_type;
}


#ifdef placement_group_type_MAIN

void test_placement_group_type(int include_optional) {
    placement_group_type_t* placement_group_type_1 = instantiate_placement_group_type(include_optional);

	cJSON* jsonplacement_group_type_1 = placement_group_type_convertToJSON(placement_group_type_1);
	printf("placement_group_type :\n%s\n", cJSON_Print(jsonplacement_group_type_1));
	placement_group_type_t* placement_group_type_2 = placement_group_type_parseFromJSON(jsonplacement_group_type_1);
	cJSON* jsonplacement_group_type_2 = placement_group_type_convertToJSON(placement_group_type_2);
	printf("repeating placement_group_type:\n%s\n", cJSON_Print(jsonplacement_group_type_2));
}

int main() {
  test_placement_group_type(1);
  test_placement_group_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // placement_group_type_MAIN
#endif // placement_group_type_TEST
