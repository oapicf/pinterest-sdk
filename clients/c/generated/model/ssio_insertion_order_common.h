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

    int _library_owned; // Is the library responsible for freeing this object?
} ssio_insertion_order_common_t;

__attribute__((deprecated)) ssio_insertion_order_common_t *ssio_insertion_order_common_create(
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
    char *user_email
);

void ssio_insertion_order_common_free(ssio_insertion_order_common_t *ssio_insertion_order_common);

ssio_insertion_order_common_t *ssio_insertion_order_common_parseFromJSON(cJSON *ssio_insertion_order_commonJSON);

cJSON *ssio_insertion_order_common_convertToJSON(ssio_insertion_order_common_t *ssio_insertion_order_common);

#endif /* _ssio_insertion_order_common_H_ */

