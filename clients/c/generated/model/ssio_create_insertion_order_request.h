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



typedef struct ssio_create_insertion_order_request_t {
    char *agency_link; // string
    char *billing_contact_email; // string
    char *billing_contact_firstname; // string
    char *billing_contact_lastname; // string
    double budget_amount; //numeric
    char *end_date; // string
    char *media_contact_email; // string
    char *media_contact_firstname; // string
    char *media_contact_lastname; // string
    char *po_number; // string
    char *start_date; // string
    char *user_email; // string
    char *accepted_terms_id; // string
    int accepted_terms_time; //numeric
    char *billto_billing_address_id; // string
    char *billto_business_address_id; // string
    char *billto_company_id; // string
    pinterest_rest_api_currency__e currency_info; //referenced enum
    double estimated_monthly_spend; //numeric
    pinterest_rest_api_ssio_create_insertion_order_request_ORDERLINETYPE_e order_line_type; //enum
    char *order_name; // string
    char *pmp_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} ssio_create_insertion_order_request_t;

__attribute__((deprecated)) ssio_create_insertion_order_request_t *ssio_create_insertion_order_request_create(
    char *agency_link,
    char *billing_contact_email,
    char *billing_contact_firstname,
    char *billing_contact_lastname,
    double budget_amount,
    char *end_date,
    char *media_contact_email,
    char *media_contact_firstname,
    char *media_contact_lastname,
    char *po_number,
    char *start_date,
    char *user_email,
    char *accepted_terms_id,
    int accepted_terms_time,
    char *billto_billing_address_id,
    char *billto_business_address_id,
    char *billto_company_id,
    pinterest_rest_api_currency__e currency_info,
    double estimated_monthly_spend,
    pinterest_rest_api_ssio_create_insertion_order_request_ORDERLINETYPE_e order_line_type,
    char *order_name,
    char *pmp_id
);

void ssio_create_insertion_order_request_free(ssio_create_insertion_order_request_t *ssio_create_insertion_order_request);

ssio_create_insertion_order_request_t *ssio_create_insertion_order_request_parseFromJSON(cJSON *ssio_create_insertion_order_requestJSON);

cJSON *ssio_create_insertion_order_request_convertToJSON(ssio_create_insertion_order_request_t *ssio_create_insertion_order_request);

#endif /* _ssio_create_insertion_order_request_H_ */

