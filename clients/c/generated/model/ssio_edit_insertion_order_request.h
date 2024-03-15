/*
 * ssio_edit_insertion_order_request.h
 *
 * 
 */

#ifndef _ssio_edit_insertion_order_request_H_
#define _ssio_edit_insertion_order_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ssio_edit_insertion_order_request_t ssio_edit_insertion_order_request_t;




typedef struct ssio_edit_insertion_order_request_t {
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
    char *oracle_line_id; // string
    char *salesforce_order_id; // string
    char *salesforce_order_line_id; // string
    char *ads_manager_order_line_id; // string

} ssio_edit_insertion_order_request_t;

ssio_edit_insertion_order_request_t *ssio_edit_insertion_order_request_create(
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
    char *oracle_line_id,
    char *salesforce_order_id,
    char *salesforce_order_line_id,
    char *ads_manager_order_line_id
);

void ssio_edit_insertion_order_request_free(ssio_edit_insertion_order_request_t *ssio_edit_insertion_order_request);

ssio_edit_insertion_order_request_t *ssio_edit_insertion_order_request_parseFromJSON(cJSON *ssio_edit_insertion_order_requestJSON);

cJSON *ssio_edit_insertion_order_request_convertToJSON(ssio_edit_insertion_order_request_t *ssio_edit_insertion_order_request);

#endif /* _ssio_edit_insertion_order_request_H_ */

