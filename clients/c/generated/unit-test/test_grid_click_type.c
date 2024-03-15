#ifndef grid_click_type_TEST
#define grid_click_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define grid_click_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/grid_click_type.h"
grid_click_type_t* instantiate_grid_click_type(int include_optional);



grid_click_type_t* instantiate_grid_click_type(int include_optional) {
  grid_click_type_t* grid_click_type = NULL;
  if (include_optional) {
    grid_click_type = grid_click_type_create(
    );
  } else {
    grid_click_type = grid_click_type_create(
    );
  }

  return grid_click_type;
}


#ifdef grid_click_type_MAIN

void test_grid_click_type(int include_optional) {
    grid_click_type_t* grid_click_type_1 = instantiate_grid_click_type(include_optional);

	cJSON* jsongrid_click_type_1 = grid_click_type_convertToJSON(grid_click_type_1);
	printf("grid_click_type :\n%s\n", cJSON_Print(jsongrid_click_type_1));
	grid_click_type_t* grid_click_type_2 = grid_click_type_parseFromJSON(jsongrid_click_type_1);
	cJSON* jsongrid_click_type_2 = grid_click_type_convertToJSON(grid_click_type_2);
	printf("repeating grid_click_type:\n%s\n", cJSON_Print(jsongrid_click_type_2));
}

int main() {
  test_grid_click_type(1);
  test_grid_click_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // grid_click_type_MAIN
#endif // grid_click_type_TEST
