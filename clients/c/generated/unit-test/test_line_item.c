#ifndef line_item_TEST
#define line_item_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define line_item_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/line_item.h"
line_item_t* instantiate_line_item(int include_optional);



line_item_t* instantiate_line_item(int include_optional) {
  line_item_t* line_item = NULL;
  if (include_optional) {
    line_item = line_item_create(
      "Parker",
      "Shoes",
      1414,
      "Parker Boots",
      "99.99",
      2,
      "Red",
      "1414-34832"
    );
  } else {
    line_item = line_item_create(
      "Parker",
      "Shoes",
      1414,
      "Parker Boots",
      "99.99",
      2,
      "Red",
      "1414-34832"
    );
  }

  return line_item;
}


#ifdef line_item_MAIN

void test_line_item(int include_optional) {
    line_item_t* line_item_1 = instantiate_line_item(include_optional);

	cJSON* jsonline_item_1 = line_item_convertToJSON(line_item_1);
	printf("line_item :\n%s\n", cJSON_Print(jsonline_item_1));
	line_item_t* line_item_2 = line_item_parseFromJSON(jsonline_item_1);
	cJSON* jsonline_item_2 = line_item_convertToJSON(line_item_2);
	printf("repeating line_item:\n%s\n", cJSON_Print(jsonline_item_2));
}

int main() {
  test_line_item(1);
  test_line_item(0);

  printf("Hello world \n");
  return 0;
}

#endif // line_item_MAIN
#endif // line_item_TEST
