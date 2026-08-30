#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_report_stats.h"


char* catalogs_report_stats_report_type_ToString(pinterest_rest_api_catalogs_report_stats_REPORTTYPE_e report_type) {
    char* report_typeArray[] =  { "NULL", "DISTRIBUTION_ISSUES" };
    return report_typeArray[report_type];
}

pinterest_rest_api_catalogs_report_stats_REPORTTYPE_e catalogs_report_stats_report_type_FromString(char* report_type){
    int stringToReturn = 0;
    char *report_typeArray[] =  { "NULL", "DISTRIBUTION_ISSUES" };
    size_t sizeofArray = sizeof(report_typeArray) / sizeof(report_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(report_type, report_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* catalogs_report_stats_severity_ToString(pinterest_rest_api_catalogs_report_stats_SEVERITY_e severity) {
    char* severityArray[] =  { "NULL", "WARN", "ERROR" };
    return severityArray[severity];
}

pinterest_rest_api_catalogs_report_stats_SEVERITY_e catalogs_report_stats_severity_FromString(char* severity){
    int stringToReturn = 0;
    char *severityArray[] =  { "NULL", "WARN", "ERROR" };
    size_t sizeofArray = sizeof(severityArray) / sizeof(severityArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(severity, severityArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static catalogs_report_stats_t *catalogs_report_stats_create_internal(
    char *catalog_id,
    int *code,
    char *code_label,
    char *message,
    int *occurrences,
    pinterest_rest_api_catalogs_report_stats_REPORTTYPE_e report_type,
    pinterest_rest_api_catalogs_report_stats_SEVERITY_e severity,
    int *ineligible_for_ads,
    int *ineligible_for_organic
    ) {
    catalogs_report_stats_t *catalogs_report_stats_local_var = malloc(sizeof(catalogs_report_stats_t));
    if (!catalogs_report_stats_local_var) {
        return NULL;
    }
    memset(catalogs_report_stats_local_var, 0, sizeof(catalogs_report_stats_t));
    catalogs_report_stats_local_var->_library_owned = 1;
    catalogs_report_stats_local_var->catalog_id = catalog_id;
    catalogs_report_stats_local_var->code = code;
    catalogs_report_stats_local_var->code_label = code_label;
    catalogs_report_stats_local_var->message = message;
    catalogs_report_stats_local_var->occurrences = occurrences;
    catalogs_report_stats_local_var->report_type = report_type;
    catalogs_report_stats_local_var->severity = severity;
    catalogs_report_stats_local_var->ineligible_for_ads = ineligible_for_ads;
    catalogs_report_stats_local_var->ineligible_for_organic = ineligible_for_organic;
    return catalogs_report_stats_local_var;
}

__attribute__((deprecated)) catalogs_report_stats_t *catalogs_report_stats_create(
    char *catalog_id,
    int *code,
    char *code_label,
    char *message,
    int *occurrences,
    pinterest_rest_api_catalogs_report_stats_REPORTTYPE_e report_type,
    pinterest_rest_api_catalogs_report_stats_SEVERITY_e severity,
    int *ineligible_for_ads,
    int *ineligible_for_organic
    ) {
    int *code_copy = NULL;
    if (code) {
        code_copy = malloc(sizeof(int));
        if (code_copy) *code_copy = *code;
    }
    int *occurrences_copy = NULL;
    if (occurrences) {
        occurrences_copy = malloc(sizeof(int));
        if (occurrences_copy) *occurrences_copy = *occurrences;
    }
    int *ineligible_for_ads_copy = NULL;
    if (ineligible_for_ads) {
        ineligible_for_ads_copy = malloc(sizeof(int));
        if (ineligible_for_ads_copy) *ineligible_for_ads_copy = *ineligible_for_ads;
    }
    int *ineligible_for_organic_copy = NULL;
    if (ineligible_for_organic) {
        ineligible_for_organic_copy = malloc(sizeof(int));
        if (ineligible_for_organic_copy) *ineligible_for_organic_copy = *ineligible_for_organic;
    }
    catalogs_report_stats_t *result = catalogs_report_stats_create_internal (
        catalog_id,
        code_copy,
        code_label,
        message,
        occurrences_copy,
        report_type,
        severity,
        ineligible_for_ads_copy,
        ineligible_for_organic_copy
        );
    if (!result) {
        free(code_copy);
        free(occurrences_copy);
        free(ineligible_for_ads_copy);
        free(ineligible_for_organic_copy);
    }
    return result;
}

void catalogs_report_stats_free(catalogs_report_stats_t *catalogs_report_stats) {
    if(NULL == catalogs_report_stats){
        return ;
    }
    if(catalogs_report_stats->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_report_stats_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_report_stats->catalog_id) {
        free(catalogs_report_stats->catalog_id);
        catalogs_report_stats->catalog_id = NULL;
    }
    if (catalogs_report_stats->code) {
        free(catalogs_report_stats->code);
        catalogs_report_stats->code = NULL;
    }
    if (catalogs_report_stats->code_label) {
        free(catalogs_report_stats->code_label);
        catalogs_report_stats->code_label = NULL;
    }
    if (catalogs_report_stats->message) {
        free(catalogs_report_stats->message);
        catalogs_report_stats->message = NULL;
    }
    if (catalogs_report_stats->occurrences) {
        free(catalogs_report_stats->occurrences);
        catalogs_report_stats->occurrences = NULL;
    }
    if (catalogs_report_stats->ineligible_for_ads) {
        free(catalogs_report_stats->ineligible_for_ads);
        catalogs_report_stats->ineligible_for_ads = NULL;
    }
    if (catalogs_report_stats->ineligible_for_organic) {
        free(catalogs_report_stats->ineligible_for_organic);
        catalogs_report_stats->ineligible_for_organic = NULL;
    }
    free(catalogs_report_stats);
}

cJSON *catalogs_report_stats_convertToJSON(catalogs_report_stats_t *catalogs_report_stats) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_report_stats->catalog_id
    if(catalogs_report_stats->catalog_id) {
    if(cJSON_AddStringToObject(item, "catalog_id", catalogs_report_stats->catalog_id) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_report_stats->code
    if(catalogs_report_stats->code) {
    if(cJSON_AddNumberToObject(item, "code", *catalogs_report_stats->code) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_report_stats->code_label
    if(catalogs_report_stats->code_label) {
    if(cJSON_AddStringToObject(item, "code_label", catalogs_report_stats->code_label) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_report_stats->message
    if(catalogs_report_stats->message) {
    if(cJSON_AddStringToObject(item, "message", catalogs_report_stats->message) == NULL) {
    goto fail; //String
    }
    }


    // catalogs_report_stats->occurrences
    if(catalogs_report_stats->occurrences) {
    if(cJSON_AddNumberToObject(item, "occurrences", *catalogs_report_stats->occurrences) == NULL) {
    goto fail; //Numeric
    }
    }


    // catalogs_report_stats->report_type
    if(catalogs_report_stats->report_type != pinterest_rest_api_catalogs_report_stats_REPORTTYPE_NULL) {
    if(cJSON_AddStringToObject(item, "report_type", catalogs_report_stats_report_type_ToString(catalogs_report_stats->report_type)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // catalogs_report_stats->severity
    if(catalogs_report_stats->severity != pinterest_rest_api_catalogs_report_stats_SEVERITY_NULL) {
    if(cJSON_AddStringToObject(item, "severity", catalogs_report_stats_severity_ToString(catalogs_report_stats->severity)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // catalogs_report_stats->ineligible_for_ads
    if(catalogs_report_stats->ineligible_for_ads) {
    if(cJSON_AddBoolToObject(item, "ineligible_for_ads", *catalogs_report_stats->ineligible_for_ads) == NULL) {
    goto fail; //Bool
    }
    }


    // catalogs_report_stats->ineligible_for_organic
    if(catalogs_report_stats->ineligible_for_organic) {
    if(cJSON_AddBoolToObject(item, "ineligible_for_organic", *catalogs_report_stats->ineligible_for_organic) == NULL) {
    goto fail; //Bool
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_report_stats_t *catalogs_report_stats_parseFromJSON(cJSON *catalogs_report_statsJSON){

    catalogs_report_stats_t *catalogs_report_stats_local_var = NULL;

    char *catalog_id_local_str = NULL;

    // define the local variable for catalogs_report_stats->code
    int *code_local_var = NULL;

    char *code_label_local_str = NULL;

    char *message_local_str = NULL;

    // define the local variable for catalogs_report_stats->occurrences
    int *occurrences_local_var = NULL;

    // define the local variable for catalogs_report_stats->ineligible_for_ads
    int *ineligible_for_ads_local_var = NULL;

    // define the local variable for catalogs_report_stats->ineligible_for_organic
    int *ineligible_for_organic_local_var = NULL;

    // catalogs_report_stats->catalog_id
    cJSON *catalog_id = cJSON_GetObjectItemCaseSensitive(catalogs_report_statsJSON, "catalog_id");
    if (cJSON_IsNull(catalog_id)) {
        catalog_id = NULL;
    }
    if (catalog_id) { 
    if(!cJSON_IsString(catalog_id) && !cJSON_IsNull(catalog_id))
    {
    goto end; //String
    }
    }

    // catalogs_report_stats->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(catalogs_report_statsJSON, "code");
    if (cJSON_IsNull(code)) {
        code = NULL;
    }
    if (code) { 
    if(!cJSON_IsNumber(code))
    {
    goto end; //Numeric
    }
    code_local_var = malloc(sizeof(int));
    if(!code_local_var)
    {
        goto end;
    }
    *code_local_var = code->valuedouble;
    }

    // catalogs_report_stats->code_label
    cJSON *code_label = cJSON_GetObjectItemCaseSensitive(catalogs_report_statsJSON, "code_label");
    if (cJSON_IsNull(code_label)) {
        code_label = NULL;
    }
    if (code_label) { 
    if(!cJSON_IsString(code_label) && !cJSON_IsNull(code_label))
    {
    goto end; //String
    }
    }

    // catalogs_report_stats->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(catalogs_report_statsJSON, "message");
    if (cJSON_IsNull(message)) {
        message = NULL;
    }
    if (message) { 
    if(!cJSON_IsString(message) && !cJSON_IsNull(message))
    {
    goto end; //String
    }
    }

    // catalogs_report_stats->occurrences
    cJSON *occurrences = cJSON_GetObjectItemCaseSensitive(catalogs_report_statsJSON, "occurrences");
    if (cJSON_IsNull(occurrences)) {
        occurrences = NULL;
    }
    if (occurrences) { 
    if(!cJSON_IsNumber(occurrences))
    {
    goto end; //Numeric
    }
    occurrences_local_var = malloc(sizeof(int));
    if(!occurrences_local_var)
    {
        goto end;
    }
    *occurrences_local_var = occurrences->valuedouble;
    }

    // catalogs_report_stats->report_type
    cJSON *report_type = cJSON_GetObjectItemCaseSensitive(catalogs_report_statsJSON, "report_type");
    if (cJSON_IsNull(report_type)) {
        report_type = NULL;
    }
    pinterest_rest_api_catalogs_report_stats_REPORTTYPE_e report_typeVariable;
    if (report_type) { 
    if(!cJSON_IsString(report_type))
    {
    goto end; //Enum
    }
    report_typeVariable = catalogs_report_stats_report_type_FromString(report_type->valuestring);
    }

    // catalogs_report_stats->severity
    cJSON *severity = cJSON_GetObjectItemCaseSensitive(catalogs_report_statsJSON, "severity");
    if (cJSON_IsNull(severity)) {
        severity = NULL;
    }
    pinterest_rest_api_catalogs_report_stats_SEVERITY_e severityVariable;
    if (severity) { 
    if(!cJSON_IsString(severity))
    {
    goto end; //Enum
    }
    severityVariable = catalogs_report_stats_severity_FromString(severity->valuestring);
    }

    // catalogs_report_stats->ineligible_for_ads
    cJSON *ineligible_for_ads = cJSON_GetObjectItemCaseSensitive(catalogs_report_statsJSON, "ineligible_for_ads");
    if (cJSON_IsNull(ineligible_for_ads)) {
        ineligible_for_ads = NULL;
    }
    if (ineligible_for_ads) { 
    if(!cJSON_IsBool(ineligible_for_ads))
    {
    goto end; //Bool
    }
    ineligible_for_ads_local_var = malloc(sizeof(int));
    if(!ineligible_for_ads_local_var)
    {
        goto end;
    }
    *ineligible_for_ads_local_var = ineligible_for_ads->valueint;
    }

    // catalogs_report_stats->ineligible_for_organic
    cJSON *ineligible_for_organic = cJSON_GetObjectItemCaseSensitive(catalogs_report_statsJSON, "ineligible_for_organic");
    if (cJSON_IsNull(ineligible_for_organic)) {
        ineligible_for_organic = NULL;
    }
    if (ineligible_for_organic) { 
    if(!cJSON_IsBool(ineligible_for_organic))
    {
    goto end; //Bool
    }
    ineligible_for_organic_local_var = malloc(sizeof(int));
    if(!ineligible_for_organic_local_var)
    {
        goto end;
    }
    *ineligible_for_organic_local_var = ineligible_for_organic->valueint;
    }


    if (catalog_id && !cJSON_IsNull(catalog_id)) catalog_id_local_str = strdup(catalog_id->valuestring);
    if (code_label && !cJSON_IsNull(code_label)) code_label_local_str = strdup(code_label->valuestring);
    if (message && !cJSON_IsNull(message)) message_local_str = strdup(message->valuestring);

    catalogs_report_stats_local_var = catalogs_report_stats_create_internal (
        catalog_id_local_str,
        code_local_var,
        code_label_local_str,
        message_local_str,
        occurrences_local_var,
        report_type ? report_typeVariable : pinterest_rest_api_catalogs_report_stats_REPORTTYPE_NULL,
        severity ? severityVariable : pinterest_rest_api_catalogs_report_stats_SEVERITY_NULL,
        ineligible_for_ads_local_var,
        ineligible_for_organic_local_var
        );

    if (!catalogs_report_stats_local_var) {
        goto end;
    }

    return catalogs_report_stats_local_var;
end:
    if (catalog_id_local_str) {
        free(catalog_id_local_str);
        catalog_id_local_str = NULL;
    }
    if (code_local_var) {
        free(code_local_var);
        code_local_var = NULL;
    }
    if (code_label_local_str) {
        free(code_label_local_str);
        code_label_local_str = NULL;
    }
    if (message_local_str) {
        free(message_local_str);
        message_local_str = NULL;
    }
    if (occurrences_local_var) {
        free(occurrences_local_var);
        occurrences_local_var = NULL;
    }
    if (ineligible_for_ads_local_var) {
        free(ineligible_for_ads_local_var);
        ineligible_for_ads_local_var = NULL;
    }
    if (ineligible_for_organic_local_var) {
        free(ineligible_for_organic_local_var);
        ineligible_for_organic_local_var = NULL;
    }
    return NULL;

}
