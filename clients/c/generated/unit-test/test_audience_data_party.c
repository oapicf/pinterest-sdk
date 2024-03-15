#ifndef audience_data_party_TEST
#define audience_data_party_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define audience_data_party_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/audience_data_party.h"
audience_data_party_t* instantiate_audience_data_party(int include_optional);



audience_data_party_t* instantiate_audience_data_party(int include_optional) {
  audience_data_party_t* audience_data_party = NULL;
  if (include_optional) {
    audience_data_party = audience_data_party_create(
    );
  } else {
    audience_data_party = audience_data_party_create(
    );
  }

  return audience_data_party;
}


#ifdef audience_data_party_MAIN

void test_audience_data_party(int include_optional) {
    audience_data_party_t* audience_data_party_1 = instantiate_audience_data_party(include_optional);

	cJSON* jsonaudience_data_party_1 = audience_data_party_convertToJSON(audience_data_party_1);
	printf("audience_data_party :\n%s\n", cJSON_Print(jsonaudience_data_party_1));
	audience_data_party_t* audience_data_party_2 = audience_data_party_parseFromJSON(jsonaudience_data_party_1);
	cJSON* jsonaudience_data_party_2 = audience_data_party_convertToJSON(audience_data_party_2);
	printf("repeating audience_data_party:\n%s\n", cJSON_Print(jsonaudience_data_party_2));
}

int main() {
  test_audience_data_party(1);
  test_audience_data_party(0);

  printf("Hello world \n");
  return 0;
}

#endif // audience_data_party_MAIN
#endif // audience_data_party_TEST
