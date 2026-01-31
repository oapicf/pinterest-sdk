/*
 * billing_invoice_download_response.h
 *
 * 
 */

#ifndef _billing_invoice_download_response_H_
#define _billing_invoice_download_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct billing_invoice_download_response_t billing_invoice_download_response_t;




typedef struct billing_invoice_download_response_t {
    char *download_url; // string
    char *id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} billing_invoice_download_response_t;

__attribute__((deprecated)) billing_invoice_download_response_t *billing_invoice_download_response_create(
    char *download_url,
    char *id
);

void billing_invoice_download_response_free(billing_invoice_download_response_t *billing_invoice_download_response);

billing_invoice_download_response_t *billing_invoice_download_response_parseFromJSON(cJSON *billing_invoice_download_responseJSON);

cJSON *billing_invoice_download_response_convertToJSON(billing_invoice_download_response_t *billing_invoice_download_response);

#endif /* _billing_invoice_download_response_H_ */

