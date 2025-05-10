/*
 * ssio_order_line.h
 *
 * 
 */

#ifndef _ssio_order_line_H_
#define _ssio_order_line_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ssio_order_line_t ssio_order_line_t;

#include "currency.h"



typedef struct ssio_order_line_t {
    char *salesforce_order_line_id; // string
    char *ads_manager_order_line_id; // string
    char *pin_order_id; // string
    char *last_modified_date_time; // string
    char *start_date; //date
    char *end_date; //date
    char *bill_to_company_name; // string
    char *billing_contact_firstname; // string
    char *billing_contact_lastname; // string
    char *billing_contact_email; // string
    char *media_contact_email; // string
    char *media_contact_firstname; // string
    char *media_contact_lastname; // string
    pinterest_rest_api_currency__e currency_info; //referenced enum
    char *agency_link; // string
    char *po_number; // string
    char *order_name; // string
    char *pmp_name; // string
    char *accepted_terms_id; // string
    char *accepted_terms_time; // string
    double budget_amount; //numeric
    double estimated_monthly_spend; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} ssio_order_line_t;

__attribute__((deprecated)) ssio_order_line_t *ssio_order_line_create(
    char *salesforce_order_line_id,
    char *ads_manager_order_line_id,
    char *pin_order_id,
    char *last_modified_date_time,
    char *start_date,
    char *end_date,
    char *bill_to_company_name,
    char *billing_contact_firstname,
    char *billing_contact_lastname,
    char *billing_contact_email,
    char *media_contact_email,
    char *media_contact_firstname,
    char *media_contact_lastname,
    pinterest_rest_api_currency__e currency_info,
    char *agency_link,
    char *po_number,
    char *order_name,
    char *pmp_name,
    char *accepted_terms_id,
    char *accepted_terms_time,
    double budget_amount,
    double estimated_monthly_spend
);

void ssio_order_line_free(ssio_order_line_t *ssio_order_line);

ssio_order_line_t *ssio_order_line_parseFromJSON(cJSON *ssio_order_lineJSON);

cJSON *ssio_order_line_convertToJSON(ssio_order_line_t *ssio_order_line);

#endif /* _ssio_order_line_H_ */

