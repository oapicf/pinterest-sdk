#ifndef lead_form_response_TEST
#define lead_form_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define lead_form_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/lead_form_response.h"
lead_form_response_t* instantiate_lead_form_response(int include_optional);



lead_form_response_t* instantiate_lead_form_response(int include_optional) {
  lead_form_response_t* lead_form_response = NULL;
  if (include_optional) {
    lead_form_response = lead_form_response_create(
      "Lead Form 3/14/2023",
      "https://www.advertisername.com/privacy-policy",
      false,
      "Thank you for submitting. We will contact you soon.",
      pinterest_rest_api_lead_form_response__"DRAFT",
      "By entering your personal information, you agree that your data will be collected and used.",
      [{question_type=CUSTOM, custom_question_field_type=CHECKBOX, custom_question_label=What is your favorite animal?, custom_question_options=[Dog, Cat, Bird, Turtle]}],
      "7765300871171",
      "549755885175",
      1451431341,
      1451431341
    );
  } else {
    lead_form_response = lead_form_response_create(
      "Lead Form 3/14/2023",
      "https://www.advertisername.com/privacy-policy",
      false,
      "Thank you for submitting. We will contact you soon.",
      pinterest_rest_api_lead_form_response__"DRAFT",
      "By entering your personal information, you agree that your data will be collected and used.",
      [{question_type=CUSTOM, custom_question_field_type=CHECKBOX, custom_question_label=What is your favorite animal?, custom_question_options=[Dog, Cat, Bird, Turtle]}],
      "7765300871171",
      "549755885175",
      1451431341,
      1451431341
    );
  }

  return lead_form_response;
}


#ifdef lead_form_response_MAIN

void test_lead_form_response(int include_optional) {
    lead_form_response_t* lead_form_response_1 = instantiate_lead_form_response(include_optional);

	cJSON* jsonlead_form_response_1 = lead_form_response_convertToJSON(lead_form_response_1);
	printf("lead_form_response :\n%s\n", cJSON_Print(jsonlead_form_response_1));
	lead_form_response_t* lead_form_response_2 = lead_form_response_parseFromJSON(jsonlead_form_response_1);
	cJSON* jsonlead_form_response_2 = lead_form_response_convertToJSON(lead_form_response_2);
	printf("repeating lead_form_response:\n%s\n", cJSON_Print(jsonlead_form_response_2));
}

int main() {
  test_lead_form_response(1);
  test_lead_form_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // lead_form_response_MAIN
#endif // lead_form_response_TEST
