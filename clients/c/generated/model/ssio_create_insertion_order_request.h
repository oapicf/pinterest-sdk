/*
 * ssio_create_insertion_order_request.h
 *
 * 
 */

#ifndef _ssio_create_insertion_order_request_H_
#define _ssio_create_insertion_order_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ssio_create_insertion_order_request_t ssio_create_insertion_order_request_t;

#include "currency.h"

// Enum ORDERLINETYPE for ssio_create_insertion_order_request

typedef enum  { pinterest_rest_api_ssio_create_insertion_order_request_ORDERLINETYPE_NULL = 0, pinterest_rest_api_ssio_create_insertion_order_request_ORDERLINETYPE_BUDGET, pinterest_rest_api_ssio_create_insertion_order_request_ORDERLINETYPE_PERPETUALS } pinterest_rest_api_ssio_create_insertion_order_request_ORDERLINETYPE_e;

char* ssio_create_insertion_order_request_order_line_type_ToString(pinterest_rest_api_ssio_create_insertion_order_request_ORDERLINETYPE_e order_line_type);

pinterest_rest_api_ssio_create_insertion_order_request_ORDERLINETYPE_e ssio_create_insertion_order_request_order_line_type_FromString(char* order_line_type);

// Enum  for ssio_create_insertion_order_request

typedef enum  { pinterest_rest_api_ssio_create_insertion_order_request__NULL = 0, pinterest_rest_api_ssio_create_insertion_order_request__UNK, pinterest_rest_api_ssio_create_insertion_order_request__USD, pinterest_rest_api_ssio_create_insertion_order_request__GBP, pinterest_rest_api_ssio_create_insertion_order_request__CAD, pinterest_rest_api_ssio_create_insertion_order_request__EUR, pinterest_rest_api_ssio_create_insertion_order_request__AUD, pinterest_rest_api_ssio_create_insertion_order_request__NZD, pinterest_rest_api_ssio_create_insertion_order_request__SEK, pinterest_rest_api_ssio_create_insertion_order_request__ILS, pinterest_rest_api_ssio_create_insertion_order_request__CHF, pinterest_rest_api_ssio_create_insertion_order_request__HKD, pinterest_rest_api_ssio_create_insertion_order_request__JPY, pinterest_rest_api_ssio_create_insertion_order_request__SGD, pinterest_rest_api_ssio_create_insertion_order_request__KRW, pinterest_rest_api_ssio_create_insertion_order_request__NOK, pinterest_rest_api_ssio_create_insertion_order_request__DKK, pinterest_rest_api_ssio_create_insertion_order_request__PLN, pinterest_rest_api_ssio_create_insertion_order_request__RON, pinterest_rest_api_ssio_create_insertion_order_request__HUF, pinterest_rest_api_ssio_create_insertion_order_request__CZK, pinterest_rest_api_ssio_create_insertion_order_request__BRL, pinterest_rest_api_ssio_create_insertion_order_request__MXN, pinterest_rest_api_ssio_create_insertion_order_request__ARS, pinterest_rest_api_ssio_create_insertion_order_request__CLP, pinterest_rest_api_ssio_create_insertion_order_request__COP } pinterest_rest_api_ssio_create_insertion_order_request__e;

char* ssio_create_insertion_order_request_currency_info_ToString(pinterest_rest_api_ssio_create_insertion_order_request__e currency_info);

pinterest_rest_api_ssio_create_insertion_order_request__e ssio_create_insertion_order_request_currency_info_FromString(char* currency_info);



typedef struct ssio_create_insertion_order_request_t {
    char *start_date; // string
    char *end_date; // string
    char *po_number; // string
    double budget_amount; //numeric
    char *billing_contact_firstname; // string
    char *billing_contact_lastname; // string
    char *billing_contact_email; // string
    char *media_contact_firstname; // string
    char *media_contact_lastname; // string
    char *media_contact_email; // string
    char *agency_link; // string
    char *user_email; // string
    int accepted_terms_time; //numeric
    char *pmp_id; // string
    char *order_name; // string
    pinterest_rest_api_ssio_create_insertion_order_request_ORDERLINETYPE_e order_line_type; //enum
    char *accepted_terms_id; // string
    char *billto_company_id; // string
    char *billto_business_address_id; // string
    char *billto_billing_address_id; // string
    double estimated_monthly_spend; //numeric
    currency_t *currency_info; // custom

} ssio_create_insertion_order_request_t;

ssio_create_insertion_order_request_t *ssio_create_insertion_order_request_create(
    char *start_date,
    char *end_date,
    char *po_number,
    double budget_amount,
    char *billing_contact_firstname,
    char *billing_contact_lastname,
    char *billing_contact_email,
    char *media_contact_firstname,
    char *media_contact_lastname,
    char *media_contact_email,
    char *agency_link,
    char *user_email,
    int accepted_terms_time,
    char *pmp_id,
    char *order_name,
    pinterest_rest_api_ssio_create_insertion_order_request_ORDERLINETYPE_e order_line_type,
    char *accepted_terms_id,
    char *billto_company_id,
    char *billto_business_address_id,
    char *billto_billing_address_id,
    double estimated_monthly_spend,
    currency_t *currency_info
);

void ssio_create_insertion_order_request_free(ssio_create_insertion_order_request_t *ssio_create_insertion_order_request);

ssio_create_insertion_order_request_t *ssio_create_insertion_order_request_parseFromJSON(cJSON *ssio_create_insertion_order_requestJSON);

cJSON *ssio_create_insertion_order_request_convertToJSON(ssio_create_insertion_order_request_t *ssio_create_insertion_order_request);

#endif /* _ssio_create_insertion_order_request_H_ */

