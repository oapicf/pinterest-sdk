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
    char *accepted_terms_id; // string
    char *accepted_terms_time; // string
    char *ads_manager_order_line_id; // string
    char *agency_link; // string
    char *bill_to_company_name; // string
    char *billing_contact_email; // string
    char *billing_contact_firstname; // string
    char *billing_contact_lastname; // string
    double budget_amount; //numeric
    pinterest_rest_api_currency__e currency_info; //referenced enum
    char *end_date; //date
    double estimated_monthly_spend; //numeric
    char *last_modified_date_time; // string
    char *media_contact_email; // string
    char *media_contact_firstname; // string
    char *media_contact_lastname; // string
    char *order_name; // string
    char *pin_order_id; // string
    char *pmp_name; // string
    char *po_number; // string
    char *salesforce_order_line_id; // string
    char *start_date; //date

    int _library_owned; // Is the library responsible for freeing this object?
} ssio_order_line_t;

__attribute__((deprecated)) ssio_order_line_t *ssio_order_line_create(
    char *accepted_terms_id,
    char *accepted_terms_time,
    char *ads_manager_order_line_id,
    char *agency_link,
    char *bill_to_company_name,
    char *billing_contact_email,
    char *billing_contact_firstname,
    char *billing_contact_lastname,
    double budget_amount,
    pinterest_rest_api_currency__e currency_info,
    char *end_date,
    double estimated_monthly_spend,
    char *last_modified_date_time,
    char *media_contact_email,
    char *media_contact_firstname,
    char *media_contact_lastname,
    char *order_name,
    char *pin_order_id,
    char *pmp_name,
    char *po_number,
    char *salesforce_order_line_id,
    char *start_date
);

void ssio_order_line_free(ssio_order_line_t *ssio_order_line);

ssio_order_line_t *ssio_order_line_parseFromJSON(cJSON *ssio_order_lineJSON);

cJSON *ssio_order_line_convertToJSON(ssio_order_line_t *ssio_order_line);

#endif /* _ssio_order_line_H_ */

