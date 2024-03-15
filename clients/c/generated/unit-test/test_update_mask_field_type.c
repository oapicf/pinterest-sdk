#ifndef update_mask_field_type_TEST
#define update_mask_field_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define update_mask_field_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/update_mask_field_type.h"
update_mask_field_type_t* instantiate_update_mask_field_type(int include_optional);



update_mask_field_type_t* instantiate_update_mask_field_type(int include_optional) {
  update_mask_field_type_t* update_mask_field_type = NULL;
  if (include_optional) {
    update_mask_field_type = update_mask_field_type_create(
    );
  } else {
    update_mask_field_type = update_mask_field_type_create(
    );
  }

  return update_mask_field_type;
}


#ifdef update_mask_field_type_MAIN

void test_update_mask_field_type(int include_optional) {
    update_mask_field_type_t* update_mask_field_type_1 = instantiate_update_mask_field_type(include_optional);

	cJSON* jsonupdate_mask_field_type_1 = update_mask_field_type_convertToJSON(update_mask_field_type_1);
	printf("update_mask_field_type :\n%s\n", cJSON_Print(jsonupdate_mask_field_type_1));
	update_mask_field_type_t* update_mask_field_type_2 = update_mask_field_type_parseFromJSON(jsonupdate_mask_field_type_1);
	cJSON* jsonupdate_mask_field_type_2 = update_mask_field_type_convertToJSON(update_mask_field_type_2);
	printf("repeating update_mask_field_type:\n%s\n", cJSON_Print(jsonupdate_mask_field_type_2));
}

int main() {
  test_update_mask_field_type(1);
  test_update_mask_field_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // update_mask_field_type_MAIN
#endif // update_mask_field_type_TEST
