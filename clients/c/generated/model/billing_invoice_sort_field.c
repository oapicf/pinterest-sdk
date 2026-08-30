#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "billing_invoice_sort_field.h"


char* billing_invoice_sort_field_billing_invoice_sort_field_ToString(pinterest_rest_api_billing_invoice_sort_field__e billing_invoice_sort_field) {
    char *billing_invoice_sort_fieldArray[] =  { "NULL", "DUE_DATE", "BILLING_PERIOD", "DOCUMENT_TYPE", "TOTAL_AMOUNT", "INVOICE_NUMBER" };
    return billing_invoice_sort_fieldArray[billing_invoice_sort_field];
}

pinterest_rest_api_billing_invoice_sort_field__e billing_invoice_sort_field_billing_invoice_sort_field_FromString(char* billing_invoice_sort_field) {
    int stringToReturn = 0;
    char *billing_invoice_sort_fieldArray[] =  { "NULL", "DUE_DATE", "BILLING_PERIOD", "DOCUMENT_TYPE", "TOTAL_AMOUNT", "INVOICE_NUMBER" };
    size_t sizeofArray = sizeof(billing_invoice_sort_fieldArray) / sizeof(billing_invoice_sort_fieldArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(billing_invoice_sort_field, billing_invoice_sort_fieldArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *billing_invoice_sort_field_convertToJSON(pinterest_rest_api_billing_invoice_sort_field__e billing_invoice_sort_field) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "billing_invoice_sort_field", billing_invoice_sort_field_billing_invoice_sort_field_ToString(billing_invoice_sort_field)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_billing_invoice_sort_field__e billing_invoice_sort_field_parseFromJSON(cJSON *billing_invoice_sort_fieldJSON) {
    if(!cJSON_IsString(billing_invoice_sort_fieldJSON) || (billing_invoice_sort_fieldJSON->valuestring == NULL)) {
        return 0;
    }
    return billing_invoice_sort_field_billing_invoice_sort_field_FromString(billing_invoice_sort_fieldJSON->valuestring);
}
