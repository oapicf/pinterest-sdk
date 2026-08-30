#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "billing_invoice_document_type.h"


char* billing_invoice_document_type_billing_invoice_document_type_ToString(pinterest_rest_api_billing_invoice_document_type__e billing_invoice_document_type) {
    char *billing_invoice_document_typeArray[] =  { "NULL", "INVOICE", "CREDIT_MEMO" };
    return billing_invoice_document_typeArray[billing_invoice_document_type];
}

pinterest_rest_api_billing_invoice_document_type__e billing_invoice_document_type_billing_invoice_document_type_FromString(char* billing_invoice_document_type) {
    int stringToReturn = 0;
    char *billing_invoice_document_typeArray[] =  { "NULL", "INVOICE", "CREDIT_MEMO" };
    size_t sizeofArray = sizeof(billing_invoice_document_typeArray) / sizeof(billing_invoice_document_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(billing_invoice_document_type, billing_invoice_document_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *billing_invoice_document_type_convertToJSON(pinterest_rest_api_billing_invoice_document_type__e billing_invoice_document_type) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "billing_invoice_document_type", billing_invoice_document_type_billing_invoice_document_type_ToString(billing_invoice_document_type)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

pinterest_rest_api_billing_invoice_document_type__e billing_invoice_document_type_parseFromJSON(cJSON *billing_invoice_document_typeJSON) {
    if(!cJSON_IsString(billing_invoice_document_typeJSON) || (billing_invoice_document_typeJSON->valuestring == NULL)) {
        return 0;
    }
    return billing_invoice_document_type_billing_invoice_document_type_FromString(billing_invoice_document_typeJSON->valuestring);
}
