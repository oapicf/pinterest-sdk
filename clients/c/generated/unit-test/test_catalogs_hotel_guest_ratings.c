#ifndef catalogs_hotel_guest_ratings_TEST
#define catalogs_hotel_guest_ratings_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_hotel_guest_ratings_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_hotel_guest_ratings.h"
catalogs_hotel_guest_ratings_t* instantiate_catalogs_hotel_guest_ratings(int include_optional);



catalogs_hotel_guest_ratings_t* instantiate_catalogs_hotel_guest_ratings(int include_optional) {
  catalogs_hotel_guest_ratings_t* catalogs_hotel_guest_ratings = NULL;
  if (include_optional) {
    catalogs_hotel_guest_ratings = catalogs_hotel_guest_ratings_create(
      1.337,
      56,
      1.337,
      "0"
    );
  } else {
    catalogs_hotel_guest_ratings = catalogs_hotel_guest_ratings_create(
      1.337,
      56,
      1.337,
      "0"
    );
  }

  return catalogs_hotel_guest_ratings;
}


#ifdef catalogs_hotel_guest_ratings_MAIN

void test_catalogs_hotel_guest_ratings(int include_optional) {
    catalogs_hotel_guest_ratings_t* catalogs_hotel_guest_ratings_1 = instantiate_catalogs_hotel_guest_ratings(include_optional);

	cJSON* jsoncatalogs_hotel_guest_ratings_1 = catalogs_hotel_guest_ratings_convertToJSON(catalogs_hotel_guest_ratings_1);
	printf("catalogs_hotel_guest_ratings :\n%s\n", cJSON_Print(jsoncatalogs_hotel_guest_ratings_1));
	catalogs_hotel_guest_ratings_t* catalogs_hotel_guest_ratings_2 = catalogs_hotel_guest_ratings_parseFromJSON(jsoncatalogs_hotel_guest_ratings_1);
	cJSON* jsoncatalogs_hotel_guest_ratings_2 = catalogs_hotel_guest_ratings_convertToJSON(catalogs_hotel_guest_ratings_2);
	printf("repeating catalogs_hotel_guest_ratings:\n%s\n", cJSON_Print(jsoncatalogs_hotel_guest_ratings_2));
}

int main() {
  test_catalogs_hotel_guest_ratings(1);
  test_catalogs_hotel_guest_ratings(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_hotel_guest_ratings_MAIN
#endif // catalogs_hotel_guest_ratings_TEST
