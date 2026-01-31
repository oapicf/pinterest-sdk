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
    char *ads_manager_order_line_id; // string
    char *oracle_line_id; // string
    char *salesforce_order_id; // string
    char *salesforce_order_line_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} ssio_edit_insertion_order_request_t;

__attribute__((deprecated)) ssio_edit_insertion_order_request_t *ssio_edit_insertion_order_request_create(
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
    char *ads_manager_order_line_id,
    char *oracle_line_id,
    char *salesforce_order_id,
    char *salesforce_order_line_id
);

void ssio_edit_insertion_order_request_free(ssio_edit_insertion_order_request_t *ssio_edit_insertion_order_request);

ssio_edit_insertion_order_request_t *ssio_edit_insertion_order_request_parseFromJSON(cJSON *ssio_edit_insertion_order_requestJSON);

cJSON *ssio_edit_insertion_order_request_convertToJSON(ssio_edit_insertion_order_request_t *ssio_edit_insertion_order_request);

#endif /* _ssio_edit_insertion_order_request_H_ */

