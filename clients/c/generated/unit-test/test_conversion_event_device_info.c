#ifndef conversion_event_device_info_TEST
#define conversion_event_device_info_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define conversion_event_device_info_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/conversion_event_device_info.h"
conversion_event_device_info_t* instantiate_conversion_event_device_info(int include_optional);



conversion_event_device_info_t* instantiate_conversion_event_device_info(int include_optional) {
  conversion_event_device_info_t* conversion_event_device_info = NULL;
  if (include_optional) {
    conversion_event_device_info = conversion_event_device_info_create(
      78,
      "Apple, Samsung, Motorola",
      "T-Mobile",
      8,
      126,
      512,
      pinterest_rest_api_conversion_event_device_info_FORMFACTOR_"cellphone",
      "6.15",
      ["en","de","lt"],
      "en-us",
      "16 Pro, Galaxy S25 Ultra",
      pinterest_rest_api_conversion_event_device_info_NETWORKTYPE_"wifi",
      pinterest_rest_api_conversion_event_device_info_OSFAMILY_"ios",
      "10",
      "18.3",
      "18.3",
      460,
      2868,
      1320,
      184,
      256,
      "USA/New York",
      "PDT",
      "iPhone, Android"
    );
  } else {
    conversion_event_device_info = conversion_event_device_info_create(
      78,
      "Apple, Samsung, Motorola",
      "T-Mobile",
      8,
      126,
      512,
      pinterest_rest_api_conversion_event_device_info_FORMFACTOR_"cellphone",
      "6.15",
      ["en","de","lt"],
      "en-us",
      "16 Pro, Galaxy S25 Ultra",
      pinterest_rest_api_conversion_event_device_info_NETWORKTYPE_"wifi",
      pinterest_rest_api_conversion_event_device_info_OSFAMILY_"ios",
      "10",
      "18.3",
      "18.3",
      460,
      2868,
      1320,
      184,
      256,
      "USA/New York",
      "PDT",
      "iPhone, Android"
    );
  }

  return conversion_event_device_info;
}


#ifdef conversion_event_device_info_MAIN

void test_conversion_event_device_info(int include_optional) {
    conversion_event_device_info_t* conversion_event_device_info_1 = instantiate_conversion_event_device_info(include_optional);

	cJSON* jsonconversion_event_device_info_1 = conversion_event_device_info_convertToJSON(conversion_event_device_info_1);
	printf("conversion_event_device_info :\n%s\n", cJSON_Print(jsonconversion_event_device_info_1));
	conversion_event_device_info_t* conversion_event_device_info_2 = conversion_event_device_info_parseFromJSON(jsonconversion_event_device_info_1);
	cJSON* jsonconversion_event_device_info_2 = conversion_event_device_info_convertToJSON(conversion_event_device_info_2);
	printf("repeating conversion_event_device_info:\n%s\n", cJSON_Print(jsonconversion_event_device_info_2));
}

int main() {
  test_conversion_event_device_info(1);
  test_conversion_event_device_info(0);

  printf("Hello world \n");
  return 0;
}

#endif // conversion_event_device_info_MAIN
#endif // conversion_event_device_info_TEST
