/*
 * ssio_insertion_order_create.h
 *
 * Resource create operation model.
 */

#ifndef _ssio_insertion_order_create_H_
#define _ssio_insertion_order_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ssio_insertion_order_create_t ssio_insertion_order_create_t;

#include "currency.h"
#include "ssio_order_line_type.h"



typedef struct ssio_insertion_order_create_t {
    char *accepted_terms_id; // string
    int *accepted_terms_time; //numeric
    char *agency_link; // string
    char *billing_contact_email; // string
    char *billing_contact_firstname; // string
    char *billing_contact_lastname; // string
    char *billto_billing_address_id; // string
    char *billto_business_address_id; // string
    char *billto_company_id; // string
    double *budget_amount; //numeric
    pinterest_rest_api_currency__e currency_info; //referenced enum
    char *end_date; // string
    double *estimated_monthly_spend; //numeric
    char *media_contact_email; // string
    char *media_contact_firstname; // string
    char *media_contact_lastname; // string
    ssio_order_line_type_t *order_line_type; // custom
    char *order_name; // string
    char *pmp_id; // string
    char *po_number; // string
    char *start_date; // string
    char *user_email; // string

    int _library_owned; // Is the library responsible for freeing this object?
} ssio_insertion_order_create_t;

__attribute__((deprecated)) ssio_insertion_order_create_t *ssio_insertion_order_create_create(
    char *accepted_terms_id,
    int *accepted_terms_time,
    char *agency_link,
    char *billing_contact_email,
    char *billing_contact_firstname,
    char *billing_contact_lastname,
    char *billto_billing_address_id,
    char *billto_business_address_id,
    char *billto_company_id,
    double *budget_amount,
    pinterest_rest_api_currency__e currency_info,
    char *end_date,
    double *estimated_monthly_spend,
    char *media_contact_email,
    char *media_contact_firstname,
    char *media_contact_lastname,
    ssio_order_line_type_t *order_line_type,
    char *order_name,
    char *pmp_id,
    char *po_number,
    char *start_date,
    char *user_email
);

void ssio_insertion_order_create_free(ssio_insertion_order_create_t *ssio_insertion_order_create);

ssio_insertion_order_create_t *ssio_insertion_order_create_parseFromJSON(cJSON *ssio_insertion_order_createJSON);

cJSON *ssio_insertion_order_create_convertToJSON(ssio_insertion_order_create_t *ssio_insertion_order_create);

#endif /* _ssio_insertion_order_create_H_ */

