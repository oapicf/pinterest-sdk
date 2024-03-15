#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audience_rule.h"


char* audience_rule_objective_type_ToString(pinterest_rest_api_audience_rule__e objective_type) {
    char *objective_typeArray[] =  { "NULL", "AWARENESS", "CONSIDERATION", "VIDEO_VIEW", "WEB_CONVERSION", "CATALOG_SALES", "WEB_SESSIONS" };
    return objective_typeArray[objective_type - 1];
}

pinterest_rest_api_audience_rule__e audience_rule_objective_type_FromString(char* objective_type) {
    int stringToReturn = 0;
    char *objective_typeArray[] =  { "NULL", "AWARENESS", "CONSIDERATION", "VIDEO_VIEW", "WEB_CONVERSION", "CATALOG_SALES", "WEB_SESSIONS" };
    size_t sizeofArray = sizeof(objective_typeArray) / sizeof(objective_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(objective_type, objective_typeArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

audience_rule_t *audience_rule_create(
    char *country,
    char *customer_list_id,
    list_t *engagement_domain,
    char *engagement_type,
    char *event,
    pinterest_tag_event_data_t *event_data,
    int percentage,
    list_t *pin_id,
    int prefill,
    int retention_days,
    list_t *seed_id,
    list_t *url,
    char *visitor_source_id,
    object_t *event_source,
    object_t *ingestion_source,
    int engager_type,
    list_t *campaign_id,
    list_t *ad_id,
    list_t *objective_type,
    char *ad_account_id
    ) {
    audience_rule_t *audience_rule_local_var = malloc(sizeof(audience_rule_t));
    if (!audience_rule_local_var) {
        return NULL;
    }
    audience_rule_local_var->country = country;
    audience_rule_local_var->customer_list_id = customer_list_id;
    audience_rule_local_var->engagement_domain = engagement_domain;
    audience_rule_local_var->engagement_type = engagement_type;
    audience_rule_local_var->event = event;
    audience_rule_local_var->event_data = event_data;
    audience_rule_local_var->percentage = percentage;
    audience_rule_local_var->pin_id = pin_id;
    audience_rule_local_var->prefill = prefill;
    audience_rule_local_var->retention_days = retention_days;
    audience_rule_local_var->seed_id = seed_id;
    audience_rule_local_var->url = url;
    audience_rule_local_var->visitor_source_id = visitor_source_id;
    audience_rule_local_var->event_source = event_source;
    audience_rule_local_var->ingestion_source = ingestion_source;
    audience_rule_local_var->engager_type = engager_type;
    audience_rule_local_var->campaign_id = campaign_id;
    audience_rule_local_var->ad_id = ad_id;
    audience_rule_local_var->objective_type = objective_type;
    audience_rule_local_var->ad_account_id = ad_account_id;

    return audience_rule_local_var;
}


void audience_rule_free(audience_rule_t *audience_rule) {
    if(NULL == audience_rule){
        return ;
    }
    listEntry_t *listEntry;
    if (audience_rule->country) {
        free(audience_rule->country);
        audience_rule->country = NULL;
    }
    if (audience_rule->customer_list_id) {
        free(audience_rule->customer_list_id);
        audience_rule->customer_list_id = NULL;
    }
    if (audience_rule->engagement_domain) {
        list_ForEach(listEntry, audience_rule->engagement_domain) {
            free(listEntry->data);
        }
        list_freeList(audience_rule->engagement_domain);
        audience_rule->engagement_domain = NULL;
    }
    if (audience_rule->engagement_type) {
        free(audience_rule->engagement_type);
        audience_rule->engagement_type = NULL;
    }
    if (audience_rule->event) {
        free(audience_rule->event);
        audience_rule->event = NULL;
    }
    if (audience_rule->event_data) {
        pinterest_tag_event_data_free(audience_rule->event_data);
        audience_rule->event_data = NULL;
    }
    if (audience_rule->pin_id) {
        list_ForEach(listEntry, audience_rule->pin_id) {
            free(listEntry->data);
        }
        list_freeList(audience_rule->pin_id);
        audience_rule->pin_id = NULL;
    }
    if (audience_rule->seed_id) {
        list_ForEach(listEntry, audience_rule->seed_id) {
            free(listEntry->data);
        }
        list_freeList(audience_rule->seed_id);
        audience_rule->seed_id = NULL;
    }
    if (audience_rule->url) {
        list_ForEach(listEntry, audience_rule->url) {
            free(listEntry->data);
        }
        list_freeList(audience_rule->url);
        audience_rule->url = NULL;
    }
    if (audience_rule->visitor_source_id) {
        free(audience_rule->visitor_source_id);
        audience_rule->visitor_source_id = NULL;
    }
    if (audience_rule->event_source) {
        object_free(audience_rule->event_source);
        audience_rule->event_source = NULL;
    }
    if (audience_rule->ingestion_source) {
        object_free(audience_rule->ingestion_source);
        audience_rule->ingestion_source = NULL;
    }
    if (audience_rule->campaign_id) {
        list_ForEach(listEntry, audience_rule->campaign_id) {
            free(listEntry->data);
        }
        list_freeList(audience_rule->campaign_id);
        audience_rule->campaign_id = NULL;
    }
    if (audience_rule->ad_id) {
        list_ForEach(listEntry, audience_rule->ad_id) {
            free(listEntry->data);
        }
        list_freeList(audience_rule->ad_id);
        audience_rule->ad_id = NULL;
    }
    if (audience_rule->objective_type) {
        list_ForEach(listEntry, audience_rule->objective_type) {
            objective_type_free(listEntry->data);
        }
        list_freeList(audience_rule->objective_type);
        audience_rule->objective_type = NULL;
    }
    if (audience_rule->ad_account_id) {
        free(audience_rule->ad_account_id);
        audience_rule->ad_account_id = NULL;
    }
    free(audience_rule);
}

cJSON *audience_rule_convertToJSON(audience_rule_t *audience_rule) {
    cJSON *item = cJSON_CreateObject();

    // audience_rule->country
    if(audience_rule->country) {
    if(cJSON_AddStringToObject(item, "country", audience_rule->country) == NULL) {
    goto fail; //String
    }
    }


    // audience_rule->customer_list_id
    if(audience_rule->customer_list_id) {
    if(cJSON_AddStringToObject(item, "customer_list_id", audience_rule->customer_list_id) == NULL) {
    goto fail; //String
    }
    }


    // audience_rule->engagement_domain
    if(audience_rule->engagement_domain) {
    cJSON *engagement_domain = cJSON_AddArrayToObject(item, "engagement_domain");
    if(engagement_domain == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *engagement_domainListEntry;
    list_ForEach(engagement_domainListEntry, audience_rule->engagement_domain) {
    if(cJSON_AddStringToObject(engagement_domain, "", (char*)engagement_domainListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // audience_rule->engagement_type
    if(audience_rule->engagement_type) {
    if(cJSON_AddStringToObject(item, "engagement_type", audience_rule->engagement_type) == NULL) {
    goto fail; //String
    }
    }


    // audience_rule->event
    if(audience_rule->event) {
    if(cJSON_AddStringToObject(item, "event", audience_rule->event) == NULL) {
    goto fail; //String
    }
    }


    // audience_rule->event_data
    if(audience_rule->event_data) {
    cJSON *event_data_local_JSON = pinterest_tag_event_data_convertToJSON(audience_rule->event_data);
    if(event_data_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "event_data", event_data_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // audience_rule->percentage
    if(audience_rule->percentage) {
    if(cJSON_AddNumberToObject(item, "percentage", audience_rule->percentage) == NULL) {
    goto fail; //Numeric
    }
    }


    // audience_rule->pin_id
    if(audience_rule->pin_id) {
    cJSON *pin_id = cJSON_AddArrayToObject(item, "pin_id");
    if(pin_id == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *pin_idListEntry;
    list_ForEach(pin_idListEntry, audience_rule->pin_id) {
    if(cJSON_AddStringToObject(pin_id, "", (char*)pin_idListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // audience_rule->prefill
    if(audience_rule->prefill) {
    if(cJSON_AddBoolToObject(item, "prefill", audience_rule->prefill) == NULL) {
    goto fail; //Bool
    }
    }


    // audience_rule->retention_days
    if(audience_rule->retention_days) {
    if(cJSON_AddNumberToObject(item, "retention_days", audience_rule->retention_days) == NULL) {
    goto fail; //Numeric
    }
    }


    // audience_rule->seed_id
    if(audience_rule->seed_id) {
    cJSON *seed_id = cJSON_AddArrayToObject(item, "seed_id");
    if(seed_id == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *seed_idListEntry;
    list_ForEach(seed_idListEntry, audience_rule->seed_id) {
    if(cJSON_AddStringToObject(seed_id, "", (char*)seed_idListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // audience_rule->url
    if(audience_rule->url) {
    cJSON *url = cJSON_AddArrayToObject(item, "url");
    if(url == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *urlListEntry;
    list_ForEach(urlListEntry, audience_rule->url) {
    if(cJSON_AddStringToObject(url, "", (char*)urlListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // audience_rule->visitor_source_id
    if(audience_rule->visitor_source_id) {
    if(cJSON_AddStringToObject(item, "visitor_source_id", audience_rule->visitor_source_id) == NULL) {
    goto fail; //String
    }
    }


    // audience_rule->event_source
    if(audience_rule->event_source) {
    cJSON *event_source_object = object_convertToJSON(audience_rule->event_source);
    if(event_source_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "event_source", event_source_object);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // audience_rule->ingestion_source
    if(audience_rule->ingestion_source) {
    cJSON *ingestion_source_object = object_convertToJSON(audience_rule->ingestion_source);
    if(ingestion_source_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ingestion_source", ingestion_source_object);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // audience_rule->engager_type
    if(audience_rule->engager_type) {
    if(cJSON_AddNumberToObject(item, "engager_type", audience_rule->engager_type) == NULL) {
    goto fail; //Numeric
    }
    }


    // audience_rule->campaign_id
    if(audience_rule->campaign_id) {
    cJSON *campaign_id = cJSON_AddArrayToObject(item, "campaign_id");
    if(campaign_id == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *campaign_idListEntry;
    list_ForEach(campaign_idListEntry, audience_rule->campaign_id) {
    if(cJSON_AddStringToObject(campaign_id, "", (char*)campaign_idListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // audience_rule->ad_id
    if(audience_rule->ad_id) {
    cJSON *ad_id = cJSON_AddArrayToObject(item, "ad_id");
    if(ad_id == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *ad_idListEntry;
    list_ForEach(ad_idListEntry, audience_rule->ad_id) {
    if(cJSON_AddStringToObject(ad_id, "", (char*)ad_idListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // audience_rule->objective_type
    if(audience_rule->objective_type != pinterest_rest_api_audience_rule_OBJECTIVETYPE_NULL) {
    cJSON *objective_type = cJSON_AddArrayToObject(item, "objective_type");
    if(objective_type == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *objective_typeListEntry;
    if (audience_rule->objective_type) {
    list_ForEach(objective_typeListEntry, audience_rule->objective_type) {
    cJSON *itemLocal = objective_type_convertToJSON((pinterest_rest_api_audience_rule__e)objective_typeListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(objective_type, itemLocal);
    }
    }
    }


    // audience_rule->ad_account_id
    if(audience_rule->ad_account_id) {
    if(cJSON_AddStringToObject(item, "ad_account_id", audience_rule->ad_account_id) == NULL) {
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

audience_rule_t *audience_rule_parseFromJSON(cJSON *audience_ruleJSON){

    audience_rule_t *audience_rule_local_var = NULL;

    // define the local list for audience_rule->engagement_domain
    list_t *engagement_domainList = NULL;

    // define the local variable for audience_rule->event_data
    pinterest_tag_event_data_t *event_data_local_nonprim = NULL;

    // define the local list for audience_rule->pin_id
    list_t *pin_idList = NULL;

    // define the local list for audience_rule->seed_id
    list_t *seed_idList = NULL;

    // define the local list for audience_rule->url
    list_t *urlList = NULL;

    // define the local list for audience_rule->campaign_id
    list_t *campaign_idList = NULL;

    // define the local list for audience_rule->ad_id
    list_t *ad_idList = NULL;

    // define the local list for audience_rule->objective_type
    list_t *objective_typeList = NULL;

    // audience_rule->country
    cJSON *country = cJSON_GetObjectItemCaseSensitive(audience_ruleJSON, "country");
    if (country) { 
    if(!cJSON_IsString(country) && !cJSON_IsNull(country))
    {
    goto end; //String
    }
    }

    // audience_rule->customer_list_id
    cJSON *customer_list_id = cJSON_GetObjectItemCaseSensitive(audience_ruleJSON, "customer_list_id");
    if (customer_list_id) { 
    if(!cJSON_IsString(customer_list_id) && !cJSON_IsNull(customer_list_id))
    {
    goto end; //String
    }
    }

    // audience_rule->engagement_domain
    cJSON *engagement_domain = cJSON_GetObjectItemCaseSensitive(audience_ruleJSON, "engagement_domain");
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

    // audience_rule->engagement_type
    cJSON *engagement_type = cJSON_GetObjectItemCaseSensitive(audience_ruleJSON, "engagement_type");
    if (engagement_type) { 
    if(!cJSON_IsString(engagement_type) && !cJSON_IsNull(engagement_type))
    {
    goto end; //String
    }
    }

    // audience_rule->event
    cJSON *event = cJSON_GetObjectItemCaseSensitive(audience_ruleJSON, "event");
    if (event) { 
    if(!cJSON_IsString(event) && !cJSON_IsNull(event))
    {
    goto end; //String
    }
    }

    // audience_rule->event_data
    cJSON *event_data = cJSON_GetObjectItemCaseSensitive(audience_ruleJSON, "event_data");
    if (event_data) { 
    event_data_local_nonprim = pinterest_tag_event_data_parseFromJSON(event_data); //nonprimitive
    }

    // audience_rule->percentage
    cJSON *percentage = cJSON_GetObjectItemCaseSensitive(audience_ruleJSON, "percentage");
    if (percentage) { 
    if(!cJSON_IsNumber(percentage))
    {
    goto end; //Numeric
    }
    }

    // audience_rule->pin_id
    cJSON *pin_id = cJSON_GetObjectItemCaseSensitive(audience_ruleJSON, "pin_id");
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

    // audience_rule->prefill
    cJSON *prefill = cJSON_GetObjectItemCaseSensitive(audience_ruleJSON, "prefill");
    if (prefill) { 
    if(!cJSON_IsBool(prefill))
    {
    goto end; //Bool
    }
    }

    // audience_rule->retention_days
    cJSON *retention_days = cJSON_GetObjectItemCaseSensitive(audience_ruleJSON, "retention_days");
    if (retention_days) { 
    if(!cJSON_IsNumber(retention_days))
    {
    goto end; //Numeric
    }
    }

    // audience_rule->seed_id
    cJSON *seed_id = cJSON_GetObjectItemCaseSensitive(audience_ruleJSON, "seed_id");
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

    // audience_rule->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(audience_ruleJSON, "url");
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

    // audience_rule->visitor_source_id
    cJSON *visitor_source_id = cJSON_GetObjectItemCaseSensitive(audience_ruleJSON, "visitor_source_id");
    if (visitor_source_id) { 
    if(!cJSON_IsString(visitor_source_id) && !cJSON_IsNull(visitor_source_id))
    {
    goto end; //String
    }
    }

    // audience_rule->event_source
    cJSON *event_source = cJSON_GetObjectItemCaseSensitive(audience_ruleJSON, "event_source");
    object_t *event_source_local_object = NULL;
    if (event_source) { 
    event_source_local_object = object_parseFromJSON(event_source); //object
    }

    // audience_rule->ingestion_source
    cJSON *ingestion_source = cJSON_GetObjectItemCaseSensitive(audience_ruleJSON, "ingestion_source");
    object_t *ingestion_source_local_object = NULL;
    if (ingestion_source) { 
    ingestion_source_local_object = object_parseFromJSON(ingestion_source); //object
    }

    // audience_rule->engager_type
    cJSON *engager_type = cJSON_GetObjectItemCaseSensitive(audience_ruleJSON, "engager_type");
    if (engager_type) { 
    if(!cJSON_IsNumber(engager_type))
    {
    goto end; //Numeric
    }
    }

    // audience_rule->campaign_id
    cJSON *campaign_id = cJSON_GetObjectItemCaseSensitive(audience_ruleJSON, "campaign_id");
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

    // audience_rule->ad_id
    cJSON *ad_id = cJSON_GetObjectItemCaseSensitive(audience_ruleJSON, "ad_id");
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

    // audience_rule->objective_type
    cJSON *objective_type = cJSON_GetObjectItemCaseSensitive(audience_ruleJSON, "objective_type");
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
        audience_rule_objective_type_e objective_typeItem = objective_type_parseFromJSON(objective_type_local_nonprimitive);

        list_addElement(objective_typeList, (void *)objective_typeItem);
    }
    }

    // audience_rule->ad_account_id
    cJSON *ad_account_id = cJSON_GetObjectItemCaseSensitive(audience_ruleJSON, "ad_account_id");
    if (ad_account_id) { 
    if(!cJSON_IsString(ad_account_id) && !cJSON_IsNull(ad_account_id))
    {
    goto end; //String
    }
    }


    audience_rule_local_var = audience_rule_create (
        country && !cJSON_IsNull(country) ? strdup(country->valuestring) : NULL,
        customer_list_id && !cJSON_IsNull(customer_list_id) ? strdup(customer_list_id->valuestring) : NULL,
        engagement_domain ? engagement_domainList : NULL,
        engagement_type && !cJSON_IsNull(engagement_type) ? strdup(engagement_type->valuestring) : NULL,
        event && !cJSON_IsNull(event) ? strdup(event->valuestring) : NULL,
        event_data ? event_data_local_nonprim : NULL,
        percentage ? percentage->valuedouble : 0,
        pin_id ? pin_idList : NULL,
        prefill ? prefill->valueint : 0,
        retention_days ? retention_days->valuedouble : 0,
        seed_id ? seed_idList : NULL,
        url ? urlList : NULL,
        visitor_source_id && !cJSON_IsNull(visitor_source_id) ? strdup(visitor_source_id->valuestring) : NULL,
        event_source ? event_source_local_object : NULL,
        ingestion_source ? ingestion_source_local_object : NULL,
        engager_type ? engager_type->valuedouble : 0,
        campaign_id ? campaign_idList : NULL,
        ad_id ? ad_idList : NULL,
        objective_type ? objective_typeList : NULL,
        ad_account_id && !cJSON_IsNull(ad_account_id) ? strdup(ad_account_id->valuestring) : NULL
        );

    return audience_rule_local_var;
end:
    if (engagement_domainList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, engagement_domainList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(engagement_domainList);
        engagement_domainList = NULL;
    }
    if (event_data_local_nonprim) {
        pinterest_tag_event_data_free(event_data_local_nonprim);
        event_data_local_nonprim = NULL;
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
    if (campaign_idList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, campaign_idList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(campaign_idList);
        campaign_idList = NULL;
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
    if (objective_typeList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, objective_typeList) {
            objective_type_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(objective_typeList);
        objective_typeList = NULL;
    }
    return NULL;

}
