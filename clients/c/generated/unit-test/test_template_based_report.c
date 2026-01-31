#ifndef template_based_report_TEST
#define template_based_report_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define template_based_report_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/template_based_report.h"
template_based_report_t* instantiate_template_based_report(int include_optional);



template_based_report_t* instantiate_template_based_report(int include_optional) {
  template_based_report_t* template_based_report = NULL;
  if (include_optional) {
    template_based_report = template_based_report_create(
      "0",
      pinterest_rest_api_template_based_report__"FINISHED",
      "0",
      "0"
    );
  } else {
    template_based_report = template_based_report_create(
      "0",
      pinterest_rest_api_template_based_report__"FINISHED",
      "0",
      "0"
    );
  }

  return template_based_report;
}


#ifdef template_based_report_MAIN

void test_template_based_report(int include_optional) {
    template_based_report_t* template_based_report_1 = instantiate_template_based_report(include_optional);

	cJSON* jsontemplate_based_report_1 = template_based_report_convertToJSON(template_based_report_1);
	printf("template_based_report :\n%s\n", cJSON_Print(jsontemplate_based_report_1));
	template_based_report_t* template_based_report_2 = template_based_report_parseFromJSON(jsontemplate_based_report_1);
	cJSON* jsontemplate_based_report_2 = template_based_report_convertToJSON(template_based_report_2);
	printf("repeating template_based_report:\n%s\n", cJSON_Print(jsontemplate_based_report_2));
}

int main() {
  test_template_based_report(1);
  test_template_based_report(0);

  printf("Hello world \n");
  return 0;
}

#endif // template_based_report_MAIN
#endif // template_based_report_TEST
