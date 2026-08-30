#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ad_accounts_audience_rule.h"


char* ad_accounts_audience_rule_objective_type_ToString(pinterest_rest_api_ad_accounts_audience_rule__e objective_type) {
    char *objective_typeArray[] =  { "NULL", "AWARENESS", "CONSIDERATION", "WEB_CONVERSION", "CATALOG_SALES", "VIDEO_COMPLETION", "SALES" };
    return objective_typeArray[objective_type - 1];
}

pinterest_rest_api_ad_accounts_audience_rule__e ad_accounts_audience_rule_objective_type_FromString(char* objective_type) {
    int stringToReturn = 0;
    char *objective_typeArray[] =  { "NULL", "AWARENESS", "CONSIDERATION", "WEB_CONVERSION", "CATALOG_SALES", "VIDEO_COMPLETION", "SALES" };
    size_t sizeofArray = sizeof(objective_typeArray) / sizeof(objective_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(objective_type, objective_typeArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

static ad_accounts_audience_rule_t *ad_accounts_audience_rule_create_internal(
    char *ad_account_id,
    list_t *ad_id,
    list_t *campaign_id,
    char *country,
    char *customer_list_id,
    list_t *engagement_domain,
    char *engagement_type,
    int *engager_type,
    char *event,
    event_data_t *event_data,
    object_t *event_source,
    object_t *ingestion_source,
    list_t *objective_type,
    int *percentage,
    list_t *pin_id,
    int *prefill,
    int *retention_days,
    list_t *seed_id,
    list_t *url,
    char *visitor_source_id
    ) {
    ad_accounts_audience_rule_t *ad_accounts_audience_rule_local_var = malloc(sizeof(ad_accounts_audience_rule_t));
    if (!ad_accounts_audience_rule_local_var) {
        return NULL;
    }
    memset(ad_accounts_audience_rule_local_var, 0, sizeof(ad_accounts_audience_rule_t));
    ad_accounts_audience_rule_local_var->_library_owned = 1;
    ad_accounts_audience_rule_local_var->ad_account_id = ad_account_id;
    ad_accounts_audience_rule_local_var->ad_id = ad_id;
    ad_accounts_audience_rule_local_var->campaign_id = campaign_id;
    ad_accounts_audience_rule_local_var->country = country;
    ad_accounts_audience_rule_local_var->customer_list_id = customer_list_id;
    ad_accounts_audience_rule_local_var->engagement_domain = engagement_domain;
    ad_accounts_audience_rule_local_var->engagement_type = engagement_type;
    ad_accounts_audience_rule_local_var->engager_type = engager_type;
    ad_accounts_audience_rule_local_var->event = event;
    ad_accounts_audience_rule_local_var->event_data = event_data;
    ad_accounts_audience_rule_local_var->event_source = event_source;
    ad_accounts_audience_rule_local_var->ingestion_source = ingestion_source;
    ad_accounts_audience_rule_local_var->objective_type = objective_type;
    ad_accounts_audience_rule_local_var->percentage = percentage;
    ad_accounts_audience_rule_local_var->pin_id = pin_id;
    ad_accounts_audience_rule_local_var->prefill = prefill;
    ad_accounts_audience_rule_local_var->retention_days = retention_days;
    ad_accounts_audience_rule_local_var->seed_id = seed_id;
    ad_accounts_audience_rule_local_var->url = url;
    ad_accounts_audience_rule_local_var->visitor_source_id = visitor_source_id;
    return ad_accounts_audience_rule_local_var;
}

__attribute__((deprecated)) ad_accounts_audience_rule_t *ad_accounts_audience_rule_create(
    char *ad_account_id,
    list_t *ad_id,
    list_t *campaign_id,
    char *country,
    char *customer_list_id,
    list_t *engagement_domain,
    char *engagement_type,
    int *engager_type,
    char *event,
    event_data_t *event_data,
    object_t *event_source,
    object_t *ingestion_source,
    list_t *objective_type,
    int *percentage,
    list_t *pin_id,
    int *prefill,
    int *retention_days,
    list_t *seed_id,
    list_t *url,
    char *visitor_source_id
    ) {
    int *engager_type_copy = NULL;
    if (engager_type) {
        engager_type_copy = malloc(sizeof(int));
        if (engager_type_copy) *engager_type_copy = *engager_type;
    }
    int *percentage_copy = NULL;
    if (percentage) {
        percentage_copy = malloc(sizeof(int));
        if (percentage_copy) *percentage_copy = *percentage;
    }
    int *prefill_copy = NULL;
    if (prefill) {
        prefill_copy = malloc(sizeof(int));
        if (prefill_copy) *prefill_copy = *prefill;
    }
    int *retention_days_copy = NULL;
    if (retention_days) {
        retention_days_copy = malloc(sizeof(int));
        if (retention_days_copy) *retention_days_copy = *retention_days;
    }
    ad_accounts_audience_rule_t *result = ad_accounts_audience_rule_create_internal (
        ad_account_id,
        ad_id,
        campaign_id,
        country,
        customer_list_id,
        engagement_domain,
        engagement_type,
        engager_type_copy,
        event,
        event_data,
        event_source,
        ingestion_source,
        objective_type,
        percentage_copy,
        pin_id,
        prefill_copy,
        retention_days_copy,
        seed_id,
        url,
        visitor_source_id
        );
    if (!result) {
        free(engager_type_copy);
        free(percentage_copy);
        free(prefill_copy);
        free(retention_days_copy);
    }
    return result;
}

void ad_accounts_audience_rule_free(ad_accounts_audience_rule_t *ad_accounts_audience_rule) {
    if(NULL == ad_accounts_audience_rule){
        return ;
    }
    if(ad_accounts_audience_rule->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ad_accounts_audience_rule_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ad_accounts_audience_rule->ad_account_id) {
        free(ad_accounts_audience_rule->ad_account_id);
        ad_accounts_audience_rule->ad_account_id = NULL;
    }
    if (ad_accounts_audience_rule->ad_id) {
        list_ForEach(listEntry, ad_accounts_audience_rule->ad_id) {
            free(listEntry->data);
        }
        list_freeList(ad_accounts_audience_rule->ad_id);
        ad_accounts_audience_rule->ad_id = NULL;
    }
    if (ad_accounts_audience_rule->campaign_id) {
        list_ForEach(listEntry, ad_accounts_audience_rule->campaign_id) {
            free(listEntry->data);
        }
        list_freeList(ad_accounts_audience_rule->campaign_id);
        ad_accounts_audience_rule->campaign_id = NULL;
    }
    if (ad_accounts_audience_rule->country) {
        free(ad_accounts_audience_rule->country);
        ad_accounts_audience_rule->country = NULL;
    }
    if (ad_accounts_audience_rule->customer_list_id) {
        free(ad_accounts_audience_rule->customer_list_id);
        ad_accounts_audience_rule->customer_list_id = NULL;
    }
    if (ad_accounts_audience_rule->engagement_domain) {
        list_ForEach(listEntry, ad_accounts_audience_rule->engagement_domain) {
            free(listEntry->data);
        }
        list_freeList(ad_accounts_audience_rule->engagement_domain);
        ad_accounts_audience_rule->engagement_domain = NULL;
    }
    if (ad_accounts_audience_rule->engagement_type) {
        free(ad_accounts_audience_rule->engagement_type);
        ad_accounts_audience_rule->engagement_type = NULL;
    }
    if (ad_accounts_audience_rule->engager_type) {
        free(ad_accounts_audience_rule->engager_type);
        ad_accounts_audience_rule->engager_type = NULL;
    }
    if (ad_accounts_audience_rule->event) {
        free(ad_accounts_audience_rule->event);
        ad_accounts_audience_rule->event = NULL;
    }
    if (ad_accounts_audience_rule->event_data) {
        event_data_free(ad_accounts_audience_rule->event_data);
        ad_accounts_audience_rule->event_data = NULL;
    }
    if (ad_accounts_audience_rule->event_source) {
        object_free(ad_accounts_audience_rule->event_source);
        ad_accounts_audience_rule->event_source = NULL;
    }
    if (ad_accounts_audience_rule->ingestion_source) {
        object_free(ad_accounts_audience_rule->ingestion_source);
        ad_accounts_audience_rule->ingestion_source = NULL;
    }
    if (ad_accounts_audience_rule->objective_type) {
        list_ForEach(listEntry, ad_accounts_audience_rule->objective_type) {
            audience_objective_type_free(listEntry->data);
        }
        list_freeList(ad_accounts_audience_rule->objective_type);
        ad_accounts_audience_rule->objective_type = NULL;
    }
    if (ad_accounts_audience_rule->percentage) {
        free(ad_accounts_audience_rule->percentage);
        ad_accounts_audience_rule->percentage = NULL;
    }
    if (ad_accounts_audience_rule->pin_id) {
        list_ForEach(listEntry, ad_accounts_audience_rule->pin_id) {
            free(listEntry->data);
        }
        list_freeList(ad_accounts_audience_rule->pin_id);
        ad_accounts_audience_rule->pin_id = NULL;
    }
    if (ad_accounts_audience_rule->prefill) {
        free(ad_accounts_audience_rule->prefill);
        ad_accounts_audience_rule->prefill = NULL;
    }
    if (ad_accounts_audience_rule->retention_days) {
        free(ad_accounts_audience_rule->retention_days);
        ad_accounts_audience_rule->retention_days = NULL;
    }
    if (ad_accounts_audience_rule->seed_id) {
        list_ForEach(listEntry, ad_accounts_audience_rule->seed_id) {
            free(listEntry->data);
        }
        list_freeList(ad_accounts_audience_rule->seed_id);
        ad_accounts_audience_rule->seed_id = NULL;
    }
    if (ad_accounts_audience_rule->url) {
        list_ForEach(listEntry, ad_accounts_audience_rule->url) {
            free(listEntry->data);
        }
        list_freeList(ad_accounts_audience_rule->url);
        ad_accounts_audience_rule->url = NULL;
    }
    if (ad_accounts_audience_rule->visitor_source_id) {
        free(ad_accounts_audience_rule->visitor_source_id);
        ad_accounts_audience_rule->visitor_source_id = NULL;
    }
    free(ad_accounts_audience_rule);
}

cJSON *ad_accounts_audience_rule_convertToJSON(ad_accounts_audience_rule_t *ad_accounts_audience_rule) {
    cJSON *item = cJSON_CreateObject();

    // ad_accounts_audience_rule->ad_account_id
    if(ad_accounts_audience_rule->ad_account_id) {
    if(cJSON_AddStringToObject(item, "ad_account_id", ad_accounts_audience_rule->ad_account_id) == NULL) {
    goto fail; //String
    }
    }


    // ad_accounts_audience_rule->ad_id
    if(ad_accounts_audience_rule->ad_id) {
    cJSON *ad_id = cJSON_AddArrayToObject(item, "ad_id");
    if(ad_id == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *ad_idListEntry;
    list_ForEach(ad_idListEntry, ad_accounts_audience_rule->ad_id) {
    if(cJSON_AddStringToObject(ad_id, "", ad_idListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // ad_accounts_audience_rule->campaign_id
    if(ad_accounts_audience_rule->campaign_id) {
    cJSON *campaign_id = cJSON_AddArrayToObject(item, "campaign_id");
    if(campaign_id == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *campaign_idListEntry;
    list_ForEach(campaign_idListEntry, ad_accounts_audience_rule->campaign_id) {
    if(cJSON_AddStringToObject(campaign_id, "", campaign_idListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // ad_accounts_audience_rule->country
    if(ad_accounts_audience_rule->country) {
    if(cJSON_AddStringToObject(item, "country", ad_accounts_audience_rule->country) == NULL) {
    goto fail; //String
    }
    }


    // ad_accounts_audience_rule->customer_list_id
    if(ad_accounts_audience_rule->customer_list_id) {
    if(cJSON_AddStringToObject(item, "customer_list_id", ad_accounts_audience_rule->customer_list_id) == NULL) {
    goto fail; //String
    }
    }


    // ad_accounts_audience_rule->engagement_domain
    if(ad_accounts_audience_rule->engagement_domain) {
    cJSON *engagement_domain = cJSON_AddArrayToObject(item, "engagement_domain");
    if(engagement_domain == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *engagement_domainListEntry;
    list_ForEach(engagement_domainListEntry, ad_accounts_audience_rule->engagement_domain) {
    if(cJSON_AddStringToObject(engagement_domain, "", engagement_domainListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // ad_accounts_audience_rule->engagement_type
    if(ad_accounts_audience_rule->engagement_type) {
    if(cJSON_AddStringToObject(item, "engagement_type", ad_accounts_audience_rule->engagement_type) == NULL) {
    goto fail; //String
    }
    }


    // ad_accounts_audience_rule->engager_type
    if(ad_accounts_audience_rule->engager_type) {
    if(cJSON_AddNumberToObject(item, "engager_type", *ad_accounts_audience_rule->engager_type) == NULL) {
    goto fail; //Numeric
    }
    }


    // ad_accounts_audience_rule->event
    if(ad_accounts_audience_rule->event) {
    if(cJSON_AddStringToObject(item, "event", ad_accounts_audience_rule->event) == NULL) {
    goto fail; //String
    }
    }


    // ad_accounts_audience_rule->event_data
    if(ad_accounts_audience_rule->event_data) {
    cJSON *event_data_local_JSON = event_data_convertToJSON(ad_accounts_audience_rule->event_data);
    if(event_data_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "event_data", event_data_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // ad_accounts_audience_rule->event_source
    if(ad_accounts_audience_rule->event_source) {
    cJSON *event_source_object = object_convertToJSON(ad_accounts_audience_rule->event_source);
    if(event_source_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "event_source", event_source_object);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // ad_accounts_audience_rule->ingestion_source
    if(ad_accounts_audience_rule->ingestion_source) {
    cJSON *ingestion_source_object = object_convertToJSON(ad_accounts_audience_rule->ingestion_source);
    if(ingestion_source_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ingestion_source", ingestion_source_object);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // ad_accounts_audience_rule->objective_type
    if(ad_accounts_audience_rule->objective_type != pinterest_rest_api_list_OBJECTIVETYPE_NULL) {
    cJSON *objective_type = cJSON_AddArrayToObject(item, "objective_type");
    if(objective_type == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *objective_typeListEntry;
    if (ad_accounts_audience_rule->objective_type) {
    list_ForEach(objective_typeListEntry, ad_accounts_audience_rule->objective_type) {
    cJSON *itemLocal = audience_objective_type_convertToJSON((pinterest_rest_api_ad_accounts_audience_rule__e)objective_typeListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(objective_type, itemLocal);
    }
    }
    }


    // ad_accounts_audience_rule->percentage
    if(ad_accounts_audience_rule->percentage) {
    if(cJSON_AddNumberToObject(item, "percentage", *ad_accounts_audience_rule->percentage) == NULL) {
    goto fail; //Numeric
    }
    }


    // ad_accounts_audience_rule->pin_id
    if(ad_accounts_audience_rule->pin_id) {
    cJSON *pin_id = cJSON_AddArrayToObject(item, "pin_id");
    if(pin_id == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *pin_idListEntry;
    list_ForEach(pin_idListEntry, ad_accounts_audience_rule->pin_id) {
    if(cJSON_AddStringToObject(pin_id, "", pin_idListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // ad_accounts_audience_rule->prefill
    if(ad_accounts_audience_rule->prefill) {
    if(cJSON_AddBoolToObject(item, "prefill", *ad_accounts_audience_rule->prefill) == NULL) {
    goto fail; //Bool
    }
    }


    // ad_accounts_audience_rule->retention_days
    if(ad_accounts_audience_rule->retention_days) {
    if(cJSON_AddNumberToObject(item, "retention_days", *ad_accounts_audience_rule->retention_days) == NULL) {
    goto fail; //Numeric
    }
    }


    // ad_accounts_audience_rule->seed_id
    if(ad_accounts_audience_rule->seed_id) {
    cJSON *seed_id = cJSON_AddArrayToObject(item, "seed_id");
    if(seed_id == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *seed_idListEntry;
    list_ForEach(seed_idListEntry, ad_accounts_audience_rule->seed_id) {
    if(cJSON_AddStringToObject(seed_id, "", seed_idListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // ad_accounts_audience_rule->url
    if(ad_accounts_audience_rule->url) {
    cJSON *url = cJSON_AddArrayToObject(item, "url");
    if(url == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *urlListEntry;
    list_ForEach(urlListEntry, ad_accounts_audience_rule->url) {
    if(cJSON_AddStringToObject(url, "", urlListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // ad_accounts_audience_rule->visitor_source_id
    if(ad_accounts_audience_rule->visitor_source_id) {
    if(cJSON_AddStringToObject(item, "visitor_source_id", ad_accounts_audience_rule->visitor_source_id) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

ad_accounts_audience_rule_t *ad_accounts_audience_rule_parseFromJSON(cJSON *ad_accounts_audience_ruleJSON){

    ad_accounts_audience_rule_t *ad_accounts_audience_rule_local_var = NULL;

    char *ad_account_id_local_str = NULL;

    // define the local list for ad_accounts_audience_rule->ad_id
    list_t *ad_idList = NULL;

    // define the local list for ad_accounts_audience_rule->campaign_id
    list_t *campaign_idList = NULL;

    char *country_local_str = NULL;

    char *customer_list_id_local_str = NULL;

    // define the local list for ad_accounts_audience_rule->engagement_domain
    list_t *engagement_domainList = NULL;

    char *engagement_type_local_str = NULL;

    // define the local variable for ad_accounts_audience_rule->engager_type
    int *engager_type_local_var = NULL;

    char *event_local_str = NULL;

    // define the local variable for ad_accounts_audience_rule->event_data
    event_data_t *event_data_local_nonprim = NULL;

    // define the local list for ad_accounts_audience_rule->objective_type
    list_t *objective_typeList = NULL;

    // define the local variable for ad_accounts_audience_rule->percentage
    int *percentage_local_var = NULL;

    // define the local list for ad_accounts_audience_rule->pin_id
    list_t *pin_idList = NULL;

    // define the local variable for ad_accounts_audience_rule->prefill
    int *prefill_local_var = NULL;

    // define the local variable for ad_accounts_audience_rule->retention_days
    int *retention_days_local_var = NULL;

    // define the local list for ad_accounts_audience_rule->seed_id
    list_t *seed_idList = NULL;

    // define the local list for ad_accounts_audience_rule->url
    list_t *urlList = NULL;

    char *visitor_source_id_local_str = NULL;

    // ad_accounts_audience_rule->ad_account_id
    cJSON *ad_account_id = cJSON_GetObjectItemCaseSensitive(ad_accounts_audience_ruleJSON, "ad_account_id");
    if (cJSON_IsNull(ad_account_id)) {
        ad_account_id = NULL;
    }
    if (ad_account_id) { 
    if(!cJSON_IsString(ad_account_id) && !cJSON_IsNull(ad_account_id))
    {
    goto end; //String
    }
    }

    // ad_accounts_audience_rule->ad_id
    cJSON *ad_id = cJSON_GetObjectItemCaseSensitive(ad_accounts_audience_ruleJSON, "ad_id");
    if (cJSON_IsNull(ad_id)) {
        ad_id = NULL;
    }
    if (ad_id) { 
    cJSON *ad_id_local = NULL;
    if(!cJSON_IsArray(ad_id)) {
        goto end;//primitive container
    }
    ad_idList = list_createList();

    cJSON_ArrayForEach(ad_id_local, ad_id)
    {
        if(!cJSON_IsString(ad_id_local))
        {
            goto end;
        }
        list_addElement(ad_idList , strdup(ad_id_local->valuestring));
    }
    }

    // ad_accounts_audience_rule->campaign_id
    cJSON *campaign_id = cJSON_GetObjectItemCaseSensitive(ad_accounts_audience_ruleJSON, "campaign_id");
    if (cJSON_IsNull(campaign_id)) {
        campaign_id = NULL;
    }
    if (campaign_id) { 
    cJSON *campaign_id_local = NULL;
    if(!cJSON_IsArray(campaign_id)) {
        goto end;//primitive container
    }
    campaign_idList = list_createList();

    cJSON_ArrayForEach(campaign_id_local, campaign_id)
    {
        if(!cJSON_IsString(campaign_id_local))
        {
            goto end;
        }
        list_addElement(campaign_idList , strdup(campaign_id_local->valuestring));
    }
    }

    // ad_accounts_audience_rule->country
    cJSON *country = cJSON_GetObjectItemCaseSensitive(ad_accounts_audience_ruleJSON, "country");
    if (cJSON_IsNull(country)) {
        country = NULL;
    }
    if (country) { 
    if(!cJSON_IsString(country) && !cJSON_IsNull(country))
    {
    goto end; //String
    }
    }

    // ad_accounts_audience_rule->customer_list_id
    cJSON *customer_list_id = cJSON_GetObjectItemCaseSensitive(ad_accounts_audience_ruleJSON, "customer_list_id");
    if (cJSON_IsNull(customer_list_id)) {
        customer_list_id = NULL;
    }
    if (customer_list_id) { 
    if(!cJSON_IsString(customer_list_id) && !cJSON_IsNull(customer_list_id))
    {
    goto end; //String
    }
    }

    // ad_accounts_audience_rule->engagement_domain
    cJSON *engagement_domain = cJSON_GetObjectItemCaseSensitive(ad_accounts_audience_ruleJSON, "engagement_domain");
    if (cJSON_IsNull(engagement_domain)) {
        engagement_domain = NULL;
    }
    if (engagement_domain) { 
    cJSON *engagement_domain_local = NULL;
    if(!cJSON_IsArray(engagement_domain)) {
        goto end;//primitive container
    }
    engagement_domainList = list_createList();

    cJSON_ArrayForEach(engagement_domain_local, engagement_domain)
    {
        if(!cJSON_IsString(engagement_domain_local))
        {
            goto end;
        }
        list_addElement(engagement_domainList , strdup(engagement_domain_local->valuestring));
    }
    }

    // ad_accounts_audience_rule->engagement_type
    cJSON *engagement_type = cJSON_GetObjectItemCaseSensitive(ad_accounts_audience_ruleJSON, "engagement_type");
    if (cJSON_IsNull(engagement_type)) {
        engagement_type = NULL;
    }
    if (engagement_type) { 
    if(!cJSON_IsString(engagement_type) && !cJSON_IsNull(engagement_type))
    {
    goto end; //String
    }
    }

    // ad_accounts_audience_rule->engager_type
    cJSON *engager_type = cJSON_GetObjectItemCaseSensitive(ad_accounts_audience_ruleJSON, "engager_type");
    if (cJSON_IsNull(engager_type)) {
        engager_type = NULL;
    }
    if (engager_type) { 
    if(!cJSON_IsNumber(engager_type))
    {
    goto end; //Numeric
    }
    engager_type_local_var = malloc(sizeof(int));
    if(!engager_type_local_var)
    {
        goto end;
    }
    *engager_type_local_var = engager_type->valuedouble;
    }

    // ad_accounts_audience_rule->event
    cJSON *event = cJSON_GetObjectItemCaseSensitive(ad_accounts_audience_ruleJSON, "event");
    if (cJSON_IsNull(event)) {
        event = NULL;
    }
    if (event) { 
    if(!cJSON_IsString(event) && !cJSON_IsNull(event))
    {
    goto end; //String
    }
    }

    // ad_accounts_audience_rule->event_data
    cJSON *event_data = cJSON_GetObjectItemCaseSensitive(ad_accounts_audience_ruleJSON, "event_data");
    if (cJSON_IsNull(event_data)) {
        event_data = NULL;
    }
    if (event_data) { 
    event_data_local_nonprim = event_data_parseFromJSON(event_data); //nonprimitive
    }

    // ad_accounts_audience_rule->event_source
    cJSON *event_source = cJSON_GetObjectItemCaseSensitive(ad_accounts_audience_ruleJSON, "event_source");
    if (cJSON_IsNull(event_source)) {
        event_source = NULL;
    }
    object_t *event_source_local_object = NULL;
    if (event_source) { 
    event_source_local_object = object_parseFromJSON(event_source); //object
    }

    // ad_accounts_audience_rule->ingestion_source
    cJSON *ingestion_source = cJSON_GetObjectItemCaseSensitive(ad_accounts_audience_ruleJSON, "ingestion_source");
    if (cJSON_IsNull(ingestion_source)) {
        ingestion_source = NULL;
    }
    object_t *ingestion_source_local_object = NULL;
    if (ingestion_source) { 
    ingestion_source_local_object = object_parseFromJSON(ingestion_source); //object
    }

    // ad_accounts_audience_rule->objective_type
    cJSON *objective_type = cJSON_GetObjectItemCaseSensitive(ad_accounts_audience_ruleJSON, "objective_type");
    if (cJSON_IsNull(objective_type)) {
        objective_type = NULL;
    }
    if (objective_type) { 
    cJSON *objective_type_local_nonprimitive = NULL;
    if(!cJSON_IsArray(objective_type)){
        goto end; //nonprimitive container
    }

    objective_typeList = list_createList();

    cJSON_ArrayForEach(objective_type_local_nonprimitive,objective_type )
    {
        if(!cJSON_IsObject(objective_type_local_nonprimitive)){
            goto end;
        }
        ad_accounts_audience_rule_audience_objective_type_e objective_typeItem = audience_objective_type_parseFromJSON(objective_type_local_nonprimitive);

        list_addElement(objective_typeList, (void *)objective_typeItem);
    }
    }

    // ad_accounts_audience_rule->percentage
    cJSON *percentage = cJSON_GetObjectItemCaseSensitive(ad_accounts_audience_ruleJSON, "percentage");
    if (cJSON_IsNull(percentage)) {
        percentage = NULL;
    }
    if (percentage) { 
    if(!cJSON_IsNumber(percentage))
    {
    goto end; //Numeric
    }
    percentage_local_var = malloc(sizeof(int));
    if(!percentage_local_var)
    {
        goto end;
    }
    *percentage_local_var = percentage->valuedouble;
    }

    // ad_accounts_audience_rule->pin_id
    cJSON *pin_id = cJSON_GetObjectItemCaseSensitive(ad_accounts_audience_ruleJSON, "pin_id");
    if (cJSON_IsNull(pin_id)) {
        pin_id = NULL;
    }
    if (pin_id) { 
    cJSON *pin_id_local = NULL;
    if(!cJSON_IsArray(pin_id)) {
        goto end;//primitive container
    }
    pin_idList = list_createList();

    cJSON_ArrayForEach(pin_id_local, pin_id)
    {
        if(!cJSON_IsString(pin_id_local))
        {
            goto end;
        }
        list_addElement(pin_idList , strdup(pin_id_local->valuestring));
    }
    }

    // ad_accounts_audience_rule->prefill
    cJSON *prefill = cJSON_GetObjectItemCaseSensitive(ad_accounts_audience_ruleJSON, "prefill");
    if (cJSON_IsNull(prefill)) {
        prefill = NULL;
    }
    if (prefill) { 
    if(!cJSON_IsBool(prefill))
    {
    goto end; //Bool
    }
    prefill_local_var = malloc(sizeof(int));
    if(!prefill_local_var)
    {
        goto end;
    }
    *prefill_local_var = prefill->valueint;
    }

    // ad_accounts_audience_rule->retention_days
    cJSON *retention_days = cJSON_GetObjectItemCaseSensitive(ad_accounts_audience_ruleJSON, "retention_days");
    if (cJSON_IsNull(retention_days)) {
        retention_days = NULL;
    }
    if (retention_days) { 
    if(!cJSON_IsNumber(retention_days))
    {
    goto end; //Numeric
    }
    retention_days_local_var = malloc(sizeof(int));
    if(!retention_days_local_var)
    {
        goto end;
    }
    *retention_days_local_var = retention_days->valuedouble;
    }

    // ad_accounts_audience_rule->seed_id
    cJSON *seed_id = cJSON_GetObjectItemCaseSensitive(ad_accounts_audience_ruleJSON, "seed_id");
    if (cJSON_IsNull(seed_id)) {
        seed_id = NULL;
    }
    if (seed_id) { 
    cJSON *seed_id_local = NULL;
    if(!cJSON_IsArray(seed_id)) {
        goto end;//primitive container
    }
    seed_idList = list_createList();

    cJSON_ArrayForEach(seed_id_local, seed_id)
    {
        if(!cJSON_IsString(seed_id_local))
        {
            goto end;
        }
        list_addElement(seed_idList , strdup(seed_id_local->valuestring));
    }
    }

    // ad_accounts_audience_rule->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(ad_accounts_audience_ruleJSON, "url");
    if (cJSON_IsNull(url)) {
        url = NULL;
    }
    if (url) { 
    cJSON *url_local = NULL;
    if(!cJSON_IsArray(url)) {
        goto end;//primitive container
    }
    urlList = list_createList();

    cJSON_ArrayForEach(url_local, url)
    {
        if(!cJSON_IsString(url_local))
        {
            goto end;
        }
        list_addElement(urlList , strdup(url_local->valuestring));
    }
    }

    // ad_accounts_audience_rule->visitor_source_id
    cJSON *visitor_source_id = cJSON_GetObjectItemCaseSensitive(ad_accounts_audience_ruleJSON, "visitor_source_id");
    if (cJSON_IsNull(visitor_source_id)) {
        visitor_source_id = NULL;
    }
    if (visitor_source_id) { 
    if(!cJSON_IsString(visitor_source_id) && !cJSON_IsNull(visitor_source_id))
    {
    goto end; //String
    }
    }


    if (ad_account_id && !cJSON_IsNull(ad_account_id)) ad_account_id_local_str = strdup(ad_account_id->valuestring);
    if (country && !cJSON_IsNull(country)) country_local_str = strdup(country->valuestring);
    if (customer_list_id && !cJSON_IsNull(customer_list_id)) customer_list_id_local_str = strdup(customer_list_id->valuestring);
    if (engagement_type && !cJSON_IsNull(engagement_type)) engagement_type_local_str = strdup(engagement_type->valuestring);
    if (event && !cJSON_IsNull(event)) event_local_str = strdup(event->valuestring);
    if (visitor_source_id && !cJSON_IsNull(visitor_source_id)) visitor_source_id_local_str = strdup(visitor_source_id->valuestring);

    ad_accounts_audience_rule_local_var = ad_accounts_audience_rule_create_internal (
        ad_account_id_local_str,
        ad_id ? ad_idList : NULL,
        campaign_id ? campaign_idList : NULL,
        country_local_str,
        customer_list_id_local_str,
        engagement_domain ? engagement_domainList : NULL,
        engagement_type_local_str,
        engager_type_local_var,
        event_local_str,
        event_data ? event_data_local_nonprim : NULL,
        event_source ? event_source_local_object : NULL,
        ingestion_source ? ingestion_source_local_object : NULL,
        objective_type ? objective_typeList : NULL,
        percentage_local_var,
        pin_id ? pin_idList : NULL,
        prefill_local_var,
        retention_days_local_var,
        seed_id ? seed_idList : NULL,
        url ? urlList : NULL,
        visitor_source_id_local_str
        );

    if (!ad_accounts_audience_rule_local_var) {
        goto end;
    }

    return ad_accounts_audience_rule_local_var;
end:
    if (ad_account_id_local_str) {
        free(ad_account_id_local_str);
        ad_account_id_local_str = NULL;
    }
    if (ad_idList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, ad_idList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(ad_idList);
        ad_idList = NULL;
    }
    if (campaign_idList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, campaign_idList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(campaign_idList);
        campaign_idList = NULL;
    }
    if (country_local_str) {
        free(country_local_str);
        country_local_str = NULL;
    }
    if (customer_list_id_local_str) {
        free(customer_list_id_local_str);
        customer_list_id_local_str = NULL;
    }
    if (engagement_domainList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, engagement_domainList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(engagement_domainList);
        engagement_domainList = NULL;
    }
    if (engagement_type_local_str) {
        free(engagement_type_local_str);
        engagement_type_local_str = NULL;
    }
    if (engager_type_local_var) {
        free(engager_type_local_var);
        engager_type_local_var = NULL;
    }
    if (event_local_str) {
        free(event_local_str);
        event_local_str = NULL;
    }
    if (event_data_local_nonprim) {
        event_data_free(event_data_local_nonprim);
        event_data_local_nonprim = NULL;
    }
    if (objective_typeList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, objective_typeList) {
            audience_objective_type_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(objective_typeList);
        objective_typeList = NULL;
    }
    if (percentage_local_var) {
        free(percentage_local_var);
        percentage_local_var = NULL;
    }
    if (pin_idList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, pin_idList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(pin_idList);
        pin_idList = NULL;
    }
    if (prefill_local_var) {
        free(prefill_local_var);
        prefill_local_var = NULL;
    }
    if (retention_days_local_var) {
        free(retention_days_local_var);
        retention_days_local_var = NULL;
    }
    if (seed_idList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, seed_idList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(seed_idList);
        seed_idList = NULL;
    }
    if (urlList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, urlList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(urlList);
        urlList = NULL;
    }
    if (visitor_source_id_local_str) {
        free(visitor_source_id_local_str);
        visitor_source_id_local_str = NULL;
    }
    return NULL;

}
