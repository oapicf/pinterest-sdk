/*
 * ssio_insertion_order_update.h
 *
 * Resource create or update operation model.
 */

#ifndef _ssio_insertion_order_update_H_
#define _ssio_insertion_order_update_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ssio_insertion_order_update_t ssio_insertion_order_update_t;




typedef struct ssio_insertion_order_update_t {
    char *ads_manager_order_line_id; // string
    char *agency_link; // string
    char *billing_contact_email; // string
    char *billing_contact_firstname; // string
    char *billing_contact_lastname; // string
    double *budget_amount; //numeric
    char *end_date; // string
    char *media_contact_email; // string
    char *media_contact_firstname; // string
    char *media_contact_lastname; // string
    char *oracle_line_id; // string
    char *po_number; // string
    char *salesforce_order_id; // string
    char *salesforce_order_line_id; // string
    char *start_date; // string
    char *user_email; // string

    int _library_owned; // Is the library responsible for freeing this object?
} ssio_insertion_order_update_t;

__attribute__((deprecated)) ssio_insertion_order_update_t *ssio_insertion_order_update_create(
    char *ads_manager_order_line_id,
    char *agency_link,
    char *billing_contact_email,
    char *billing_contact_firstname,
    char *billing_contact_lastname,
    double *budget_amount,
    char *end_date,
    char *media_contact_email,
    char *media_contact_firstname,
    char *media_contact_lastname,
    char *oracle_line_id,
    char *po_number,
    char *salesforce_order_id,
    char *salesforce_order_line_id,
    char *start_date,
    char *user_email
);

void ssio_insertion_order_update_free(ssio_insertion_order_update_t *ssio_insertion_order_update);

ssio_insertion_order_update_t *ssio_insertion_order_update_parseFromJSON(cJSON *ssio_insertion_order_updateJSON);

cJSON *ssio_insertion_order_update_convertToJSON(ssio_insertion_order_update_t *ssio_insertion_order_update);

#endif /* _ssio_insertion_order_update_H_ */

