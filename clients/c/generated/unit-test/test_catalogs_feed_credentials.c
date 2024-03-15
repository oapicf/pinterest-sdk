#ifndef catalogs_feed_credentials_TEST
#define catalogs_feed_credentials_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_feed_credentials_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_feed_credentials.h"
catalogs_feed_credentials_t* instantiate_catalogs_feed_credentials(int include_optional);



catalogs_feed_credentials_t* instantiate_catalogs_feed_credentials(int include_optional) {
  catalogs_feed_credentials_t* catalogs_feed_credentials = NULL;
  if (include_optional) {
    catalogs_feed_credentials = catalogs_feed_credentials_create(
      "0",
      "0"
    );
  } else {
    catalogs_feed_credentials = catalogs_feed_credentials_create(
      "0",
      "0"
    );
  }

  return catalogs_feed_credentials;
}


#ifdef catalogs_feed_credentials_MAIN

void test_catalogs_feed_credentials(int include_optional) {
    catalogs_feed_credentials_t* catalogs_feed_credentials_1 = instantiate_catalogs_feed_credentials(include_optional);

	cJSON* jsoncatalogs_feed_credentials_1 = catalogs_feed_credentials_convertToJSON(catalogs_feed_credentials_1);
	printf("catalogs_feed_credentials :\n%s\n", cJSON_Print(jsoncatalogs_feed_credentials_1));
	catalogs_feed_credentials_t* catalogs_feed_credentials_2 = catalogs_feed_credentials_parseFromJSON(jsoncatalogs_feed_credentials_1);
	cJSON* jsoncatalogs_feed_credentials_2 = catalogs_feed_credentials_convertToJSON(catalogs_feed_credentials_2);
	printf("repeating catalogs_feed_credentials:\n%s\n", cJSON_Print(jsoncatalogs_feed_credentials_2));
}

int main() {
  test_catalogs_feed_credentials(1);
  test_catalogs_feed_credentials(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_feed_credentials_MAIN
#endif // catalogs_feed_credentials_TEST
