#ifndef label_parent_type_TEST
#define label_parent_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define label_parent_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/label_parent_type.h"
label_parent_type_t* instantiate_label_parent_type(int include_optional);



label_parent_type_t* instantiate_label_parent_type(int include_optional) {
  label_parent_type_t* label_parent_type = NULL;
  if (include_optional) {
    label_parent_type = label_parent_type_create(
    );
  } else {
    label_parent_type = label_parent_type_create(
    );
  }

  return label_parent_type;
}


#ifdef label_parent_type_MAIN

void test_label_parent_type(int include_optional) {
    label_parent_type_t* label_parent_type_1 = instantiate_label_parent_type(include_optional);

	cJSON* jsonlabel_parent_type_1 = label_parent_type_convertToJSON(label_parent_type_1);
	printf("label_parent_type :\n%s\n", cJSON_Print(jsonlabel_parent_type_1));
	label_parent_type_t* label_parent_type_2 = label_parent_type_parseFromJSON(jsonlabel_parent_type_1);
	cJSON* jsonlabel_parent_type_2 = label_parent_type_convertToJSON(label_parent_type_2);
	printf("repeating label_parent_type:\n%s\n", cJSON_Print(jsonlabel_parent_type_2));
}

int main() {
  test_label_parent_type(1);
  test_label_parent_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // label_parent_type_MAIN
#endif // label_parent_type_TEST
