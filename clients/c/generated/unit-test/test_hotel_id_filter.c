#ifndef hotel_id_filter_TEST
#define hotel_id_filter_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define hotel_id_filter_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/hotel_id_filter.h"
hotel_id_filter_t* instantiate_hotel_id_filter(int include_optional);



hotel_id_filter_t* instantiate_hotel_id_filter(int include_optional) {
  hotel_id_filter_t* hotel_id_filter = NULL;
  if (include_optional) {
    hotel_id_filter = hotel_id_filter_create(
      0
    );
  } else {
    hotel_id_filter = hotel_id_filter_create(
      0
    );
  }

  return hotel_id_filter;
}


#ifdef hotel_id_filter_MAIN

void test_hotel_id_filter(int include_optional) {
    hotel_id_filter_t* hotel_id_filter_1 = instantiate_hotel_id_filter(include_optional);

	cJSON* jsonhotel_id_filter_1 = hotel_id_filter_convertToJSON(hotel_id_filter_1);
	printf("hotel_id_filter :\n%s\n", cJSON_Print(jsonhotel_id_filter_1));
	hotel_id_filter_t* hotel_id_filter_2 = hotel_id_filter_parseFromJSON(jsonhotel_id_filter_1);
	cJSON* jsonhotel_id_filter_2 = hotel_id_filter_convertToJSON(hotel_id_filter_2);
	printf("repeating hotel_id_filter:\n%s\n", cJSON_Print(jsonhotel_id_filter_2));
}

int main() {
  test_hotel_id_filter(1);
  test_hotel_id_filter(0);

  printf("Hello world \n");
  return 0;
}

#endif // hotel_id_filter_MAIN
#endif // hotel_id_filter_TEST
