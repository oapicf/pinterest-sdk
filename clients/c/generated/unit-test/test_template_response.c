#ifndef template_response_TEST
#define template_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define template_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/template_response.h"
template_response_t* instantiate_template_response(int include_optional);

#include "test_template_response_date_range.c"


template_response_t* instantiate_template_response(int include_optional) {
  template_response_t* template_response = NULL;
  if (include_optional) {
    template_response = template_response_create(
      "547664674848",
      ["547664674848"],
      7,
      ["SPEND_IN_DOLLAR"],
      pinterest_rest_api_template_response_CONVERSIONREPORTTIMETYPE_"TIME_OF_AD_ACTION",
      pinterest_rest_api_template_response_CREATIONSOURCE_"ADS_MANAGER_REPORT_BUILDER",
      ["1597252063"],
       // false, not to have infinite recursion
      instantiate_template_response_date_range(0),
      7,
      "[{"field": "SPEND_IN_DOLLAR", "operator": "=", "value": 100}]",
      pinterest_rest_api_template_response__TOTAL,
      "6739202847590",
      list_createList(),
      false,
      true,
      true,
      "Week over week spend",
      7,
      pinterest_rest_api_template_response__"JSON",
      pinterest_rest_api_template_response__"CAMPAIGN",
      7,
      pinterest_rest_api_template_response_TYPE_"BULK",
      1432744744,
      "784762938748396",
      7
    );
  } else {
    template_response = template_response_create(
      "547664674848",
      ["547664674848"],
      7,
      ["SPEND_IN_DOLLAR"],
      pinterest_rest_api_template_response_CONVERSIONREPORTTIMETYPE_"TIME_OF_AD_ACTION",
      pinterest_rest_api_template_response_CREATIONSOURCE_"ADS_MANAGER_REPORT_BUILDER",
      ["1597252063"],
      NULL,
      7,
      "[{"field": "SPEND_IN_DOLLAR", "operator": "=", "value": 100}]",
      pinterest_rest_api_template_response__TOTAL,
      "6739202847590",
      list_createList(),
      false,
      true,
      true,
      "Week over week spend",
      7,
      pinterest_rest_api_template_response__"JSON",
      pinterest_rest_api_template_response__"CAMPAIGN",
      7,
      pinterest_rest_api_template_response_TYPE_"BULK",
      1432744744,
      "784762938748396",
      7
    );
  }

  return template_response;
}


#ifdef template_response_MAIN

void test_template_response(int include_optional) {
    template_response_t* template_response_1 = instantiate_template_response(include_optional);

	cJSON* jsontemplate_response_1 = template_response_convertToJSON(template_response_1);
	printf("template_response :\n%s\n", cJSON_Print(jsontemplate_response_1));
	template_response_t* template_response_2 = template_response_parseFromJSON(jsontemplate_response_1);
	cJSON* jsontemplate_response_2 = template_response_convertToJSON(template_response_2);
	printf("repeating template_response:\n%s\n", cJSON_Print(jsontemplate_response_2));
}

int main() {
  test_template_response(1);
  test_template_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // template_response_MAIN
#endif // template_response_TEST
