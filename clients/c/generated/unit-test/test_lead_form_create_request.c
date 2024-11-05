#ifndef lead_form_create_request_TEST
#define lead_form_create_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define lead_form_create_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/lead_form_create_request.h"
lead_form_create_request_t* instantiate_lead_form_create_request(int include_optional);



lead_form_create_request_t* instantiate_lead_form_create_request(int include_optional) {
  lead_form_create_request_t* lead_form_create_request = NULL;
  if (include_optional) {
    lead_form_create_request = lead_form_create_request_create(
      "Lead Form 3/14/2023",
      "https://www.advertisername.com/privacy-policy",
      false,
      "Thank you for submitting. We will contact you soon.",
      pinterest_rest_api_lead_form_create_request__"DRAFT",
      "By entering your personal information, you agree that your data will be collected and used.",
      [{question_type=CUSTOM, custom_question_field_type=CHECKBOX, custom_question_label=What is your favorite animal?, custom_question_options=[Dog, Cat, Bird, Turtle]}],
      [{label=Copyright, link=https://policy.pinterest.com/en/copyright}]
    );
  } else {
    lead_form_create_request = lead_form_create_request_create(
      "Lead Form 3/14/2023",
      "https://www.advertisername.com/privacy-policy",
      false,
      "Thank you for submitting. We will contact you soon.",
      pinterest_rest_api_lead_form_create_request__"DRAFT",
      "By entering your personal information, you agree that your data will be collected and used.",
      [{question_type=CUSTOM, custom_question_field_type=CHECKBOX, custom_question_label=What is your favorite animal?, custom_question_options=[Dog, Cat, Bird, Turtle]}],
      [{label=Copyright, link=https://policy.pinterest.com/en/copyright}]
    );
  }

  return lead_form_create_request;
}


#ifdef lead_form_create_request_MAIN

void test_lead_form_create_request(int include_optional) {
    lead_form_create_request_t* lead_form_create_request_1 = instantiate_lead_form_create_request(include_optional);

	cJSON* jsonlead_form_create_request_1 = lead_form_create_request_convertToJSON(lead_form_create_request_1);
	printf("lead_form_create_request :\n%s\n", cJSON_Print(jsonlead_form_create_request_1));
	lead_form_create_request_t* lead_form_create_request_2 = lead_form_create_request_parseFromJSON(jsonlead_form_create_request_1);
	cJSON* jsonlead_form_create_request_2 = lead_form_create_request_convertToJSON(lead_form_create_request_2);
	printf("repeating lead_form_create_request:\n%s\n", cJSON_Print(jsonlead_form_create_request_2));
}

int main() {
  test_lead_form_create_request(1);
  test_lead_form_create_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // lead_form_create_request_MAIN
#endif // lead_form_create_request_TEST
