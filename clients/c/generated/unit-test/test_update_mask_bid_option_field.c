#ifndef update_mask_bid_option_field_TEST
#define update_mask_bid_option_field_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define update_mask_bid_option_field_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/update_mask_bid_option_field.h"
update_mask_bid_option_field_t* instantiate_update_mask_bid_option_field(int include_optional);



update_mask_bid_option_field_t* instantiate_update_mask_bid_option_field(int include_optional) {
  update_mask_bid_option_field_t* update_mask_bid_option_field = NULL;
  if (include_optional) {
    update_mask_bid_option_field = update_mask_bid_option_field_create(
    );
  } else {
    update_mask_bid_option_field = update_mask_bid_option_field_create(
    );
  }

  return update_mask_bid_option_field;
}


#ifdef update_mask_bid_option_field_MAIN

void test_update_mask_bid_option_field(int include_optional) {
    update_mask_bid_option_field_t* update_mask_bid_option_field_1 = instantiate_update_mask_bid_option_field(include_optional);

	cJSON* jsonupdate_mask_bid_option_field_1 = update_mask_bid_option_field_convertToJSON(update_mask_bid_option_field_1);
	printf("update_mask_bid_option_field :\n%s\n", cJSON_Print(jsonupdate_mask_bid_option_field_1));
	update_mask_bid_option_field_t* update_mask_bid_option_field_2 = update_mask_bid_option_field_parseFromJSON(jsonupdate_mask_bid_option_field_1);
	cJSON* jsonupdate_mask_bid_option_field_2 = update_mask_bid_option_field_convertToJSON(update_mask_bid_option_field_2);
	printf("repeating update_mask_bid_option_field:\n%s\n", cJSON_Print(jsonupdate_mask_bid_option_field_2));
}

int main() {
  test_update_mask_bid_option_field(1);
  test_update_mask_bid_option_field(0);

  printf("Hello world \n");
  return 0;
}

#endif // update_mask_bid_option_field_MAIN
#endif // update_mask_bid_option_field_TEST
