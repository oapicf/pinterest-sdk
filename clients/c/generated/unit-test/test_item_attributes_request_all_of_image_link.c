#ifndef item_attributes_request_all_of_image_link_TEST
#define item_attributes_request_all_of_image_link_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define item_attributes_request_all_of_image_link_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/item_attributes_request_all_of_image_link.h"
item_attributes_request_all_of_image_link_t* instantiate_item_attributes_request_all_of_image_link(int include_optional);



item_attributes_request_all_of_image_link_t* instantiate_item_attributes_request_all_of_image_link(int include_optional) {
  item_attributes_request_all_of_image_link_t* item_attributes_request_all_of_image_link = NULL;
  if (include_optional) {
    item_attributes_request_all_of_image_link = item_attributes_request_all_of_image_link_create(
    );
  } else {
    item_attributes_request_all_of_image_link = item_attributes_request_all_of_image_link_create(
    );
  }

  return item_attributes_request_all_of_image_link;
}


#ifdef item_attributes_request_all_of_image_link_MAIN

void test_item_attributes_request_all_of_image_link(int include_optional) {
    item_attributes_request_all_of_image_link_t* item_attributes_request_all_of_image_link_1 = instantiate_item_attributes_request_all_of_image_link(include_optional);

	cJSON* jsonitem_attributes_request_all_of_image_link_1 = item_attributes_request_all_of_image_link_convertToJSON(item_attributes_request_all_of_image_link_1);
	printf("item_attributes_request_all_of_image_link :\n%s\n", cJSON_Print(jsonitem_attributes_request_all_of_image_link_1));
	item_attributes_request_all_of_image_link_t* item_attributes_request_all_of_image_link_2 = item_attributes_request_all_of_image_link_parseFromJSON(jsonitem_attributes_request_all_of_image_link_1);
	cJSON* jsonitem_attributes_request_all_of_image_link_2 = item_attributes_request_all_of_image_link_convertToJSON(item_attributes_request_all_of_image_link_2);
	printf("repeating item_attributes_request_all_of_image_link:\n%s\n", cJSON_Print(jsonitem_attributes_request_all_of_image_link_2));
}

int main() {
  test_item_attributes_request_all_of_image_link(1);
  test_item_attributes_request_all_of_image_link(0);

  printf("Hello world \n");
  return 0;
}

#endif // item_attributes_request_all_of_image_link_MAIN
#endif // item_attributes_request_all_of_image_link_TEST
