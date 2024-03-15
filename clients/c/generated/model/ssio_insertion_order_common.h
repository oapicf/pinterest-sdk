/*
 * ssio_insertion_order_common.h
 *
 * 
 */

#ifndef _ssio_insertion_order_common_H_
#define _ssio_insertion_order_common_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ssio_insertion_order_common_t ssio_insertion_order_common_t;




typedef struct ssio_insertion_order_common_t {
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

} ssio_insertion_order_common_t;

ssio_insertion_order_common_t *ssio_insertion_order_common_create(
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
    char *user_email
);

void ssio_insertion_order_common_free(ssio_insertion_order_common_t *ssio_insertion_order_common);

ssio_insertion_order_common_t *ssio_insertion_order_common_parseFromJSON(cJSON *ssio_insertion_order_commonJSON);

cJSON *ssio_insertion_order_common_convertToJSON(ssio_insertion_order_common_t *ssio_insertion_order_common);

#endif /* _ssio_insertion_order_common_H_ */

