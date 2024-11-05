#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "UserAccountAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

// Functions for enum FROMCLAIMEDCONTENT for UserAccountAPI_userAccountAnalytics

static char* userAccountAnalytics_FROMCLAIMEDCONTENT_ToString(pinterest_rest_api_userAccountAnalytics_from_claimed_content_e FROMCLAIMEDCONTENT){
    char *FROMCLAIMEDCONTENTArray[] =  { "NULL", "OTHER", "CLAIMED", "BOTH" };
    return FROMCLAIMEDCONTENTArray[FROMCLAIMEDCONTENT];
}

static pinterest_rest_api_userAccountAnalytics_from_claimed_content_e userAccountAnalytics_FROMCLAIMEDCONTENT_FromString(char* FROMCLAIMEDCONTENT){
    int stringToReturn = 0;
    char *FROMCLAIMEDCONTENTArray[] =  { "NULL", "OTHER", "CLAIMED", "BOTH" };
    size_t sizeofArray = sizeof(FROMCLAIMEDCONTENTArray) / sizeof(FROMCLAIMEDCONTENTArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(FROMCLAIMEDCONTENT, FROMCLAIMEDCONTENTArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function userAccountAnalytics_FROMCLAIMEDCONTENT_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *userAccountAnalytics_FROMCLAIMEDCONTENT_convertToJSON(pinterest_rest_api_userAccountAnalytics_from_claimed_content_e FROMCLAIMEDCONTENT) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "from_claimed_content", userAccountAnalytics_FROMCLAIMEDCONTENT_ToString(FROMCLAIMEDCONTENT)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function userAccountAnalytics_FROMCLAIMEDCONTENT_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_userAccountAnalytics_from_claimed_content_e userAccountAnalytics_FROMCLAIMEDCONTENT_parseFromJSON(cJSON* FROMCLAIMEDCONTENTJSON) {
    pinterest_rest_api_userAccountAnalytics_from_claimed_content_e FROMCLAIMEDCONTENTVariable = 0;
    cJSON *FROMCLAIMEDCONTENTVar = cJSON_GetObjectItemCaseSensitive(FROMCLAIMEDCONTENTJSON, "from_claimed_content");
    if(!cJSON_IsString(FROMCLAIMEDCONTENTVar) || (FROMCLAIMEDCONTENTVar->valuestring == NULL))
    {
        goto end;
    }
    FROMCLAIMEDCONTENTVariable = userAccountAnalytics_FROMCLAIMEDCONTENT_FromString(FROMCLAIMEDCONTENTVar->valuestring);
    return FROMCLAIMEDCONTENTVariable;
end:
    return 0;
}
*/

// Functions for enum PINFORMAT for UserAccountAPI_userAccountAnalytics

static char* userAccountAnalytics_PINFORMAT_ToString(pinterest_rest_api_userAccountAnalytics_pin_format_e PINFORMAT){
    char *PINFORMATArray[] =  { "NULL", "ALL", "ORGANIC_IMAGE", "ORGANIC_PRODUCT", "ORGANIC_VIDEO", "ADS_STANDARD", "ADS_PRODUCT", "ADS_VIDEO", "ADS_IDEA" };
    return PINFORMATArray[PINFORMAT];
}

static pinterest_rest_api_userAccountAnalytics_pin_format_e userAccountAnalytics_PINFORMAT_FromString(char* PINFORMAT){
    int stringToReturn = 0;
    char *PINFORMATArray[] =  { "NULL", "ALL", "ORGANIC_IMAGE", "ORGANIC_PRODUCT", "ORGANIC_VIDEO", "ADS_STANDARD", "ADS_PRODUCT", "ADS_VIDEO", "ADS_IDEA" };
    size_t sizeofArray = sizeof(PINFORMATArray) / sizeof(PINFORMATArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(PINFORMAT, PINFORMATArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function userAccountAnalytics_PINFORMAT_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *userAccountAnalytics_PINFORMAT_convertToJSON(pinterest_rest_api_userAccountAnalytics_pin_format_e PINFORMAT) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "pin_format", userAccountAnalytics_PINFORMAT_ToString(PINFORMAT)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function userAccountAnalytics_PINFORMAT_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_userAccountAnalytics_pin_format_e userAccountAnalytics_PINFORMAT_parseFromJSON(cJSON* PINFORMATJSON) {
    pinterest_rest_api_userAccountAnalytics_pin_format_e PINFORMATVariable = 0;
    cJSON *PINFORMATVar = cJSON_GetObjectItemCaseSensitive(PINFORMATJSON, "pin_format");
    if(!cJSON_IsString(PINFORMATVar) || (PINFORMATVar->valuestring == NULL))
    {
        goto end;
    }
    PINFORMATVariable = userAccountAnalytics_PINFORMAT_FromString(PINFORMATVar->valuestring);
    return PINFORMATVariable;
end:
    return 0;
}
*/

// Functions for enum APPTYPES for UserAccountAPI_userAccountAnalytics

static char* userAccountAnalytics_APPTYPES_ToString(pinterest_rest_api_userAccountAnalytics_app_types_e APPTYPES){
    char *APPTYPESArray[] =  { "NULL", "ALL", "MOBILE", "TABLET", "WEB" };
    return APPTYPESArray[APPTYPES];
}

static pinterest_rest_api_userAccountAnalytics_app_types_e userAccountAnalytics_APPTYPES_FromString(char* APPTYPES){
    int stringToReturn = 0;
    char *APPTYPESArray[] =  { "NULL", "ALL", "MOBILE", "TABLET", "WEB" };
    size_t sizeofArray = sizeof(APPTYPESArray) / sizeof(APPTYPESArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(APPTYPES, APPTYPESArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function userAccountAnalytics_APPTYPES_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *userAccountAnalytics_APPTYPES_convertToJSON(pinterest_rest_api_userAccountAnalytics_app_types_e APPTYPES) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "app_types", userAccountAnalytics_APPTYPES_ToString(APPTYPES)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function userAccountAnalytics_APPTYPES_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_userAccountAnalytics_app_types_e userAccountAnalytics_APPTYPES_parseFromJSON(cJSON* APPTYPESJSON) {
    pinterest_rest_api_userAccountAnalytics_app_types_e APPTYPESVariable = 0;
    cJSON *APPTYPESVar = cJSON_GetObjectItemCaseSensitive(APPTYPESJSON, "app_types");
    if(!cJSON_IsString(APPTYPESVar) || (APPTYPESVar->valuestring == NULL))
    {
        goto end;
    }
    APPTYPESVariable = userAccountAnalytics_APPTYPES_FromString(APPTYPESVar->valuestring);
    return APPTYPESVariable;
end:
    return 0;
}
*/

// Functions for enum CONTENTTYPE for UserAccountAPI_userAccountAnalytics

static char* userAccountAnalytics_CONTENTTYPE_ToString(pinterest_rest_api_userAccountAnalytics_content_type_e CONTENTTYPE){
    char *CONTENTTYPEArray[] =  { "NULL", "ALL", "PAID", "ORGANIC" };
    return CONTENTTYPEArray[CONTENTTYPE];
}

static pinterest_rest_api_userAccountAnalytics_content_type_e userAccountAnalytics_CONTENTTYPE_FromString(char* CONTENTTYPE){
    int stringToReturn = 0;
    char *CONTENTTYPEArray[] =  { "NULL", "ALL", "PAID", "ORGANIC" };
    size_t sizeofArray = sizeof(CONTENTTYPEArray) / sizeof(CONTENTTYPEArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(CONTENTTYPE, CONTENTTYPEArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function userAccountAnalytics_CONTENTTYPE_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *userAccountAnalytics_CONTENTTYPE_convertToJSON(pinterest_rest_api_userAccountAnalytics_content_type_e CONTENTTYPE) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "content_type", userAccountAnalytics_CONTENTTYPE_ToString(CONTENTTYPE)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function userAccountAnalytics_CONTENTTYPE_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_userAccountAnalytics_content_type_e userAccountAnalytics_CONTENTTYPE_parseFromJSON(cJSON* CONTENTTYPEJSON) {
    pinterest_rest_api_userAccountAnalytics_content_type_e CONTENTTYPEVariable = 0;
    cJSON *CONTENTTYPEVar = cJSON_GetObjectItemCaseSensitive(CONTENTTYPEJSON, "content_type");
    if(!cJSON_IsString(CONTENTTYPEVar) || (CONTENTTYPEVar->valuestring == NULL))
    {
        goto end;
    }
    CONTENTTYPEVariable = userAccountAnalytics_CONTENTTYPE_FromString(CONTENTTYPEVar->valuestring);
    return CONTENTTYPEVariable;
end:
    return 0;
}
*/

// Functions for enum SOURCE for UserAccountAPI_userAccountAnalytics

static char* userAccountAnalytics_SOURCE_ToString(pinterest_rest_api_userAccountAnalytics_source_e SOURCE){
    char *SOURCEArray[] =  { "NULL", "ALL", "YOUR_PINS", "OTHER_PINS" };
    return SOURCEArray[SOURCE];
}

static pinterest_rest_api_userAccountAnalytics_source_e userAccountAnalytics_SOURCE_FromString(char* SOURCE){
    int stringToReturn = 0;
    char *SOURCEArray[] =  { "NULL", "ALL", "YOUR_PINS", "OTHER_PINS" };
    size_t sizeofArray = sizeof(SOURCEArray) / sizeof(SOURCEArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(SOURCE, SOURCEArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function userAccountAnalytics_SOURCE_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *userAccountAnalytics_SOURCE_convertToJSON(pinterest_rest_api_userAccountAnalytics_source_e SOURCE) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "source", userAccountAnalytics_SOURCE_ToString(SOURCE)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function userAccountAnalytics_SOURCE_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_userAccountAnalytics_source_e userAccountAnalytics_SOURCE_parseFromJSON(cJSON* SOURCEJSON) {
    pinterest_rest_api_userAccountAnalytics_source_e SOURCEVariable = 0;
    cJSON *SOURCEVar = cJSON_GetObjectItemCaseSensitive(SOURCEJSON, "source");
    if(!cJSON_IsString(SOURCEVar) || (SOURCEVar->valuestring == NULL))
    {
        goto end;
    }
    SOURCEVariable = userAccountAnalytics_SOURCE_FromString(SOURCEVar->valuestring);
    return SOURCEVariable;
end:
    return 0;
}
*/

// Functions for enum METRICTYPES for UserAccountAPI_userAccountAnalytics

static char* userAccountAnalytics_METRICTYPES_ToString(pinterest_rest_api_userAccountAnalytics_metric_types_e METRICTYPES){
    char *METRICTYPESArray[] =  { "NULL", "ENGAGEMENT", "ENGAGEMENT_RATE", "IMPRESSION", "OUTBOUND_CLICK", "OUTBOUND_CLICK_RATE", "PIN_CLICK", "PIN_CLICK_RATE", "SAVE", "SAVE_RATE" };
    return METRICTYPESArray[METRICTYPES];
}

static pinterest_rest_api_userAccountAnalytics_metric_types_e userAccountAnalytics_METRICTYPES_FromString(char* METRICTYPES){
    int stringToReturn = 0;
    char *METRICTYPESArray[] =  { "NULL", "ENGAGEMENT", "ENGAGEMENT_RATE", "IMPRESSION", "OUTBOUND_CLICK", "OUTBOUND_CLICK_RATE", "PIN_CLICK", "PIN_CLICK_RATE", "SAVE", "SAVE_RATE" };
    size_t sizeofArray = sizeof(METRICTYPESArray) / sizeof(METRICTYPESArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(METRICTYPES, METRICTYPESArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function userAccountAnalytics_METRICTYPES_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *userAccountAnalytics_METRICTYPES_convertToJSON(pinterest_rest_api_userAccountAnalytics_metric_types_e METRICTYPES) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function userAccountAnalytics_METRICTYPES_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_userAccountAnalytics_metric_types_e userAccountAnalytics_METRICTYPES_parseFromJSON(cJSON* METRICTYPESJSON) {
    pinterest_rest_api_userAccountAnalytics_metric_types_e METRICTYPESVariable = 0;
    return METRICTYPESVariable;
end:
    return 0;
}
*/

// Functions for enum SPLITFIELD for UserAccountAPI_userAccountAnalytics

static char* userAccountAnalytics_SPLITFIELD_ToString(pinterest_rest_api_userAccountAnalytics_split_field_e SPLITFIELD){
    char *SPLITFIELDArray[] =  { "NULL", "NO_SPLIT", "APP_TYPE", "OWNED_CONTENT", "SOURCE", "PIN_FORMAT" };
    return SPLITFIELDArray[SPLITFIELD];
}

static pinterest_rest_api_userAccountAnalytics_split_field_e userAccountAnalytics_SPLITFIELD_FromString(char* SPLITFIELD){
    int stringToReturn = 0;
    char *SPLITFIELDArray[] =  { "NULL", "NO_SPLIT", "APP_TYPE", "OWNED_CONTENT", "SOURCE", "PIN_FORMAT" };
    size_t sizeofArray = sizeof(SPLITFIELDArray) / sizeof(SPLITFIELDArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(SPLITFIELD, SPLITFIELDArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function userAccountAnalytics_SPLITFIELD_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *userAccountAnalytics_SPLITFIELD_convertToJSON(pinterest_rest_api_userAccountAnalytics_split_field_e SPLITFIELD) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "split_field", userAccountAnalytics_SPLITFIELD_ToString(SPLITFIELD)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function userAccountAnalytics_SPLITFIELD_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_userAccountAnalytics_split_field_e userAccountAnalytics_SPLITFIELD_parseFromJSON(cJSON* SPLITFIELDJSON) {
    pinterest_rest_api_userAccountAnalytics_split_field_e SPLITFIELDVariable = 0;
    cJSON *SPLITFIELDVar = cJSON_GetObjectItemCaseSensitive(SPLITFIELDJSON, "split_field");
    if(!cJSON_IsString(SPLITFIELDVar) || (SPLITFIELDVar->valuestring == NULL))
    {
        goto end;
    }
    SPLITFIELDVariable = userAccountAnalytics_SPLITFIELD_FromString(SPLITFIELDVar->valuestring);
    return SPLITFIELDVariable;
end:
    return 0;
}
*/

// Functions for enum SORTBY for UserAccountAPI_userAccountAnalyticsTopPins

static char* userAccountAnalyticsTopPins_SORTBY_ToString(pinterest_rest_api_userAccountAnalyticsTopPins_sort_by_e SORTBY){
    char *SORTBYArray[] =  { "NULL", "ENGAGEMENT", "IMPRESSION", "OUTBOUND_CLICK", "PIN_CLICK", "SAVE" };
    return SORTBYArray[SORTBY];
}

static pinterest_rest_api_userAccountAnalyticsTopPins_sort_by_e userAccountAnalyticsTopPins_SORTBY_FromString(char* SORTBY){
    int stringToReturn = 0;
    char *SORTBYArray[] =  { "NULL", "ENGAGEMENT", "IMPRESSION", "OUTBOUND_CLICK", "PIN_CLICK", "SAVE" };
    size_t sizeofArray = sizeof(SORTBYArray) / sizeof(SORTBYArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(SORTBY, SORTBYArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function userAccountAnalyticsTopPins_SORTBY_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *userAccountAnalyticsTopPins_SORTBY_convertToJSON(pinterest_rest_api_userAccountAnalyticsTopPins_sort_by_e SORTBY) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "sort_by", userAccountAnalyticsTopPins_SORTBY_ToString(SORTBY)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function userAccountAnalyticsTopPins_SORTBY_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_userAccountAnalyticsTopPins_sort_by_e userAccountAnalyticsTopPins_SORTBY_parseFromJSON(cJSON* SORTBYJSON) {
    pinterest_rest_api_userAccountAnalyticsTopPins_sort_by_e SORTBYVariable = 0;
    cJSON *SORTBYVar = cJSON_GetObjectItemCaseSensitive(SORTBYJSON, "sort_by");
    if(!cJSON_IsString(SORTBYVar) || (SORTBYVar->valuestring == NULL))
    {
        goto end;
    }
    SORTBYVariable = userAccountAnalyticsTopPins_SORTBY_FromString(SORTBYVar->valuestring);
    return SORTBYVariable;
end:
    return 0;
}
*/

// Functions for enum FROMCLAIMEDCONTENT for UserAccountAPI_userAccountAnalyticsTopPins

static char* userAccountAnalyticsTopPins_FROMCLAIMEDCONTENT_ToString(pinterest_rest_api_userAccountAnalyticsTopPins_from_claimed_content_e FROMCLAIMEDCONTENT){
    char *FROMCLAIMEDCONTENTArray[] =  { "NULL", "OTHER", "CLAIMED", "BOTH" };
    return FROMCLAIMEDCONTENTArray[FROMCLAIMEDCONTENT];
}

static pinterest_rest_api_userAccountAnalyticsTopPins_from_claimed_content_e userAccountAnalyticsTopPins_FROMCLAIMEDCONTENT_FromString(char* FROMCLAIMEDCONTENT){
    int stringToReturn = 0;
    char *FROMCLAIMEDCONTENTArray[] =  { "NULL", "OTHER", "CLAIMED", "BOTH" };
    size_t sizeofArray = sizeof(FROMCLAIMEDCONTENTArray) / sizeof(FROMCLAIMEDCONTENTArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(FROMCLAIMEDCONTENT, FROMCLAIMEDCONTENTArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function userAccountAnalyticsTopPins_FROMCLAIMEDCONTENT_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *userAccountAnalyticsTopPins_FROMCLAIMEDCONTENT_convertToJSON(pinterest_rest_api_userAccountAnalyticsTopPins_from_claimed_content_e FROMCLAIMEDCONTENT) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "from_claimed_content", userAccountAnalyticsTopPins_FROMCLAIMEDCONTENT_ToString(FROMCLAIMEDCONTENT)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function userAccountAnalyticsTopPins_FROMCLAIMEDCONTENT_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_userAccountAnalyticsTopPins_from_claimed_content_e userAccountAnalyticsTopPins_FROMCLAIMEDCONTENT_parseFromJSON(cJSON* FROMCLAIMEDCONTENTJSON) {
    pinterest_rest_api_userAccountAnalyticsTopPins_from_claimed_content_e FROMCLAIMEDCONTENTVariable = 0;
    cJSON *FROMCLAIMEDCONTENTVar = cJSON_GetObjectItemCaseSensitive(FROMCLAIMEDCONTENTJSON, "from_claimed_content");
    if(!cJSON_IsString(FROMCLAIMEDCONTENTVar) || (FROMCLAIMEDCONTENTVar->valuestring == NULL))
    {
        goto end;
    }
    FROMCLAIMEDCONTENTVariable = userAccountAnalyticsTopPins_FROMCLAIMEDCONTENT_FromString(FROMCLAIMEDCONTENTVar->valuestring);
    return FROMCLAIMEDCONTENTVariable;
end:
    return 0;
}
*/

// Functions for enum PINFORMAT for UserAccountAPI_userAccountAnalyticsTopPins

static char* userAccountAnalyticsTopPins_PINFORMAT_ToString(pinterest_rest_api_userAccountAnalyticsTopPins_pin_format_e PINFORMAT){
    char *PINFORMATArray[] =  { "NULL", "ALL", "ORGANIC_IMAGE", "ORGANIC_PRODUCT", "ORGANIC_VIDEO", "ADS_STANDARD", "ADS_PRODUCT", "ADS_VIDEO", "ADS_IDEA" };
    return PINFORMATArray[PINFORMAT];
}

static pinterest_rest_api_userAccountAnalyticsTopPins_pin_format_e userAccountAnalyticsTopPins_PINFORMAT_FromString(char* PINFORMAT){
    int stringToReturn = 0;
    char *PINFORMATArray[] =  { "NULL", "ALL", "ORGANIC_IMAGE", "ORGANIC_PRODUCT", "ORGANIC_VIDEO", "ADS_STANDARD", "ADS_PRODUCT", "ADS_VIDEO", "ADS_IDEA" };
    size_t sizeofArray = sizeof(PINFORMATArray) / sizeof(PINFORMATArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(PINFORMAT, PINFORMATArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function userAccountAnalyticsTopPins_PINFORMAT_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *userAccountAnalyticsTopPins_PINFORMAT_convertToJSON(pinterest_rest_api_userAccountAnalyticsTopPins_pin_format_e PINFORMAT) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "pin_format", userAccountAnalyticsTopPins_PINFORMAT_ToString(PINFORMAT)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function userAccountAnalyticsTopPins_PINFORMAT_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_userAccountAnalyticsTopPins_pin_format_e userAccountAnalyticsTopPins_PINFORMAT_parseFromJSON(cJSON* PINFORMATJSON) {
    pinterest_rest_api_userAccountAnalyticsTopPins_pin_format_e PINFORMATVariable = 0;
    cJSON *PINFORMATVar = cJSON_GetObjectItemCaseSensitive(PINFORMATJSON, "pin_format");
    if(!cJSON_IsString(PINFORMATVar) || (PINFORMATVar->valuestring == NULL))
    {
        goto end;
    }
    PINFORMATVariable = userAccountAnalyticsTopPins_PINFORMAT_FromString(PINFORMATVar->valuestring);
    return PINFORMATVariable;
end:
    return 0;
}
*/

// Functions for enum APPTYPES for UserAccountAPI_userAccountAnalyticsTopPins

static char* userAccountAnalyticsTopPins_APPTYPES_ToString(pinterest_rest_api_userAccountAnalyticsTopPins_app_types_e APPTYPES){
    char *APPTYPESArray[] =  { "NULL", "ALL", "MOBILE", "TABLET", "WEB" };
    return APPTYPESArray[APPTYPES];
}

static pinterest_rest_api_userAccountAnalyticsTopPins_app_types_e userAccountAnalyticsTopPins_APPTYPES_FromString(char* APPTYPES){
    int stringToReturn = 0;
    char *APPTYPESArray[] =  { "NULL", "ALL", "MOBILE", "TABLET", "WEB" };
    size_t sizeofArray = sizeof(APPTYPESArray) / sizeof(APPTYPESArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(APPTYPES, APPTYPESArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function userAccountAnalyticsTopPins_APPTYPES_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *userAccountAnalyticsTopPins_APPTYPES_convertToJSON(pinterest_rest_api_userAccountAnalyticsTopPins_app_types_e APPTYPES) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "app_types", userAccountAnalyticsTopPins_APPTYPES_ToString(APPTYPES)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function userAccountAnalyticsTopPins_APPTYPES_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_userAccountAnalyticsTopPins_app_types_e userAccountAnalyticsTopPins_APPTYPES_parseFromJSON(cJSON* APPTYPESJSON) {
    pinterest_rest_api_userAccountAnalyticsTopPins_app_types_e APPTYPESVariable = 0;
    cJSON *APPTYPESVar = cJSON_GetObjectItemCaseSensitive(APPTYPESJSON, "app_types");
    if(!cJSON_IsString(APPTYPESVar) || (APPTYPESVar->valuestring == NULL))
    {
        goto end;
    }
    APPTYPESVariable = userAccountAnalyticsTopPins_APPTYPES_FromString(APPTYPESVar->valuestring);
    return APPTYPESVariable;
end:
    return 0;
}
*/

// Functions for enum CONTENTTYPE for UserAccountAPI_userAccountAnalyticsTopPins

static char* userAccountAnalyticsTopPins_CONTENTTYPE_ToString(pinterest_rest_api_userAccountAnalyticsTopPins_content_type_e CONTENTTYPE){
    char *CONTENTTYPEArray[] =  { "NULL", "ALL", "PAID", "ORGANIC" };
    return CONTENTTYPEArray[CONTENTTYPE];
}

static pinterest_rest_api_userAccountAnalyticsTopPins_content_type_e userAccountAnalyticsTopPins_CONTENTTYPE_FromString(char* CONTENTTYPE){
    int stringToReturn = 0;
    char *CONTENTTYPEArray[] =  { "NULL", "ALL", "PAID", "ORGANIC" };
    size_t sizeofArray = sizeof(CONTENTTYPEArray) / sizeof(CONTENTTYPEArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(CONTENTTYPE, CONTENTTYPEArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function userAccountAnalyticsTopPins_CONTENTTYPE_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *userAccountAnalyticsTopPins_CONTENTTYPE_convertToJSON(pinterest_rest_api_userAccountAnalyticsTopPins_content_type_e CONTENTTYPE) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "content_type", userAccountAnalyticsTopPins_CONTENTTYPE_ToString(CONTENTTYPE)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function userAccountAnalyticsTopPins_CONTENTTYPE_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_userAccountAnalyticsTopPins_content_type_e userAccountAnalyticsTopPins_CONTENTTYPE_parseFromJSON(cJSON* CONTENTTYPEJSON) {
    pinterest_rest_api_userAccountAnalyticsTopPins_content_type_e CONTENTTYPEVariable = 0;
    cJSON *CONTENTTYPEVar = cJSON_GetObjectItemCaseSensitive(CONTENTTYPEJSON, "content_type");
    if(!cJSON_IsString(CONTENTTYPEVar) || (CONTENTTYPEVar->valuestring == NULL))
    {
        goto end;
    }
    CONTENTTYPEVariable = userAccountAnalyticsTopPins_CONTENTTYPE_FromString(CONTENTTYPEVar->valuestring);
    return CONTENTTYPEVariable;
end:
    return 0;
}
*/

// Functions for enum SOURCE for UserAccountAPI_userAccountAnalyticsTopPins

static char* userAccountAnalyticsTopPins_SOURCE_ToString(pinterest_rest_api_userAccountAnalyticsTopPins_source_e SOURCE){
    char *SOURCEArray[] =  { "NULL", "ALL", "YOUR_PINS", "OTHER_PINS" };
    return SOURCEArray[SOURCE];
}

static pinterest_rest_api_userAccountAnalyticsTopPins_source_e userAccountAnalyticsTopPins_SOURCE_FromString(char* SOURCE){
    int stringToReturn = 0;
    char *SOURCEArray[] =  { "NULL", "ALL", "YOUR_PINS", "OTHER_PINS" };
    size_t sizeofArray = sizeof(SOURCEArray) / sizeof(SOURCEArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(SOURCE, SOURCEArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function userAccountAnalyticsTopPins_SOURCE_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *userAccountAnalyticsTopPins_SOURCE_convertToJSON(pinterest_rest_api_userAccountAnalyticsTopPins_source_e SOURCE) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "source", userAccountAnalyticsTopPins_SOURCE_ToString(SOURCE)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function userAccountAnalyticsTopPins_SOURCE_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_userAccountAnalyticsTopPins_source_e userAccountAnalyticsTopPins_SOURCE_parseFromJSON(cJSON* SOURCEJSON) {
    pinterest_rest_api_userAccountAnalyticsTopPins_source_e SOURCEVariable = 0;
    cJSON *SOURCEVar = cJSON_GetObjectItemCaseSensitive(SOURCEJSON, "source");
    if(!cJSON_IsString(SOURCEVar) || (SOURCEVar->valuestring == NULL))
    {
        goto end;
    }
    SOURCEVariable = userAccountAnalyticsTopPins_SOURCE_FromString(SOURCEVar->valuestring);
    return SOURCEVariable;
end:
    return 0;
}
*/

// Functions for enum METRICTYPES for UserAccountAPI_userAccountAnalyticsTopPins

static char* userAccountAnalyticsTopPins_METRICTYPES_ToString(pinterest_rest_api_userAccountAnalyticsTopPins_metric_types_e METRICTYPES){
    char *METRICTYPESArray[] =  { "NULL", "ENGAGEMENT", "ENGAGEMENT_RATE", "IMPRESSION", "OUTBOUND_CLICK", "OUTBOUND_CLICK_RATE", "PIN_CLICK", "PIN_CLICK_RATE", "SAVE", "SAVE_RATE" };
    return METRICTYPESArray[METRICTYPES];
}

static pinterest_rest_api_userAccountAnalyticsTopPins_metric_types_e userAccountAnalyticsTopPins_METRICTYPES_FromString(char* METRICTYPES){
    int stringToReturn = 0;
    char *METRICTYPESArray[] =  { "NULL", "ENGAGEMENT", "ENGAGEMENT_RATE", "IMPRESSION", "OUTBOUND_CLICK", "OUTBOUND_CLICK_RATE", "PIN_CLICK", "PIN_CLICK_RATE", "SAVE", "SAVE_RATE" };
    size_t sizeofArray = sizeof(METRICTYPESArray) / sizeof(METRICTYPESArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(METRICTYPES, METRICTYPESArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function userAccountAnalyticsTopPins_METRICTYPES_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *userAccountAnalyticsTopPins_METRICTYPES_convertToJSON(pinterest_rest_api_userAccountAnalyticsTopPins_metric_types_e METRICTYPES) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function userAccountAnalyticsTopPins_METRICTYPES_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_userAccountAnalyticsTopPins_metric_types_e userAccountAnalyticsTopPins_METRICTYPES_parseFromJSON(cJSON* METRICTYPESJSON) {
    pinterest_rest_api_userAccountAnalyticsTopPins_metric_types_e METRICTYPESVariable = 0;
    return METRICTYPESVariable;
end:
    return 0;
}
*/

// Functions for enum CREATEDINLASTNDAYS for UserAccountAPI_userAccountAnalyticsTopPins

static char* userAccountAnalyticsTopPins_CREATEDINLASTNDAYS_ToString(pinterest_rest_api_userAccountAnalyticsTopPins_created_in_last_n_days_e CREATEDINLASTNDAYS){
    char *CREATEDINLASTNDAYSArray[] =  { "NULL", "30" };
    return CREATEDINLASTNDAYSArray[CREATEDINLASTNDAYS];
}

static pinterest_rest_api_userAccountAnalyticsTopPins_created_in_last_n_days_e userAccountAnalyticsTopPins_CREATEDINLASTNDAYS_FromString(char* CREATEDINLASTNDAYS){
    int stringToReturn = 0;
    char *CREATEDINLASTNDAYSArray[] =  { "NULL", "30" };
    size_t sizeofArray = sizeof(CREATEDINLASTNDAYSArray) / sizeof(CREATEDINLASTNDAYSArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(CREATEDINLASTNDAYS, CREATEDINLASTNDAYSArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function userAccountAnalyticsTopPins_CREATEDINLASTNDAYS_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *userAccountAnalyticsTopPins_CREATEDINLASTNDAYS_convertToJSON(pinterest_rest_api_userAccountAnalyticsTopPins_created_in_last_n_days_e CREATEDINLASTNDAYS) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function userAccountAnalyticsTopPins_CREATEDINLASTNDAYS_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_userAccountAnalyticsTopPins_created_in_last_n_days_e userAccountAnalyticsTopPins_CREATEDINLASTNDAYS_parseFromJSON(cJSON* CREATEDINLASTNDAYSJSON) {
    pinterest_rest_api_userAccountAnalyticsTopPins_created_in_last_n_days_e CREATEDINLASTNDAYSVariable = 0;
    return CREATEDINLASTNDAYSVariable;
end:
    return 0;
}
*/

// Functions for enum SORTBY for UserAccountAPI_userAccountAnalyticsTopVideoPins

static char* userAccountAnalyticsTopVideoPins_SORTBY_ToString(pinterest_rest_api_userAccountAnalyticsTopVideoPins_sort_by_e SORTBY){
    char *SORTBYArray[] =  { "NULL", "IMPRESSION", "SAVE", "OUTBOUND_CLICK", "VIDEO_MRC_VIEW", "VIDEO_AVG_WATCH_TIME", "VIDEO_V50_WATCH_TIME", "QUARTILE_95_PERCENT_VIEW", "VIDEO_10S_VIEW", "VIDEO_START" };
    return SORTBYArray[SORTBY];
}

static pinterest_rest_api_userAccountAnalyticsTopVideoPins_sort_by_e userAccountAnalyticsTopVideoPins_SORTBY_FromString(char* SORTBY){
    int stringToReturn = 0;
    char *SORTBYArray[] =  { "NULL", "IMPRESSION", "SAVE", "OUTBOUND_CLICK", "VIDEO_MRC_VIEW", "VIDEO_AVG_WATCH_TIME", "VIDEO_V50_WATCH_TIME", "QUARTILE_95_PERCENT_VIEW", "VIDEO_10S_VIEW", "VIDEO_START" };
    size_t sizeofArray = sizeof(SORTBYArray) / sizeof(SORTBYArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(SORTBY, SORTBYArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function userAccountAnalyticsTopVideoPins_SORTBY_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *userAccountAnalyticsTopVideoPins_SORTBY_convertToJSON(pinterest_rest_api_userAccountAnalyticsTopVideoPins_sort_by_e SORTBY) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "sort_by", userAccountAnalyticsTopVideoPins_SORTBY_ToString(SORTBY)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function userAccountAnalyticsTopVideoPins_SORTBY_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_userAccountAnalyticsTopVideoPins_sort_by_e userAccountAnalyticsTopVideoPins_SORTBY_parseFromJSON(cJSON* SORTBYJSON) {
    pinterest_rest_api_userAccountAnalyticsTopVideoPins_sort_by_e SORTBYVariable = 0;
    cJSON *SORTBYVar = cJSON_GetObjectItemCaseSensitive(SORTBYJSON, "sort_by");
    if(!cJSON_IsString(SORTBYVar) || (SORTBYVar->valuestring == NULL))
    {
        goto end;
    }
    SORTBYVariable = userAccountAnalyticsTopVideoPins_SORTBY_FromString(SORTBYVar->valuestring);
    return SORTBYVariable;
end:
    return 0;
}
*/

// Functions for enum FROMCLAIMEDCONTENT for UserAccountAPI_userAccountAnalyticsTopVideoPins

static char* userAccountAnalyticsTopVideoPins_FROMCLAIMEDCONTENT_ToString(pinterest_rest_api_userAccountAnalyticsTopVideoPins_from_claimed_content_e FROMCLAIMEDCONTENT){
    char *FROMCLAIMEDCONTENTArray[] =  { "NULL", "OTHER", "CLAIMED", "BOTH" };
    return FROMCLAIMEDCONTENTArray[FROMCLAIMEDCONTENT];
}

static pinterest_rest_api_userAccountAnalyticsTopVideoPins_from_claimed_content_e userAccountAnalyticsTopVideoPins_FROMCLAIMEDCONTENT_FromString(char* FROMCLAIMEDCONTENT){
    int stringToReturn = 0;
    char *FROMCLAIMEDCONTENTArray[] =  { "NULL", "OTHER", "CLAIMED", "BOTH" };
    size_t sizeofArray = sizeof(FROMCLAIMEDCONTENTArray) / sizeof(FROMCLAIMEDCONTENTArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(FROMCLAIMEDCONTENT, FROMCLAIMEDCONTENTArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function userAccountAnalyticsTopVideoPins_FROMCLAIMEDCONTENT_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *userAccountAnalyticsTopVideoPins_FROMCLAIMEDCONTENT_convertToJSON(pinterest_rest_api_userAccountAnalyticsTopVideoPins_from_claimed_content_e FROMCLAIMEDCONTENT) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "from_claimed_content", userAccountAnalyticsTopVideoPins_FROMCLAIMEDCONTENT_ToString(FROMCLAIMEDCONTENT)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function userAccountAnalyticsTopVideoPins_FROMCLAIMEDCONTENT_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_userAccountAnalyticsTopVideoPins_from_claimed_content_e userAccountAnalyticsTopVideoPins_FROMCLAIMEDCONTENT_parseFromJSON(cJSON* FROMCLAIMEDCONTENTJSON) {
    pinterest_rest_api_userAccountAnalyticsTopVideoPins_from_claimed_content_e FROMCLAIMEDCONTENTVariable = 0;
    cJSON *FROMCLAIMEDCONTENTVar = cJSON_GetObjectItemCaseSensitive(FROMCLAIMEDCONTENTJSON, "from_claimed_content");
    if(!cJSON_IsString(FROMCLAIMEDCONTENTVar) || (FROMCLAIMEDCONTENTVar->valuestring == NULL))
    {
        goto end;
    }
    FROMCLAIMEDCONTENTVariable = userAccountAnalyticsTopVideoPins_FROMCLAIMEDCONTENT_FromString(FROMCLAIMEDCONTENTVar->valuestring);
    return FROMCLAIMEDCONTENTVariable;
end:
    return 0;
}
*/

// Functions for enum PINFORMAT for UserAccountAPI_userAccountAnalyticsTopVideoPins

static char* userAccountAnalyticsTopVideoPins_PINFORMAT_ToString(pinterest_rest_api_userAccountAnalyticsTopVideoPins_pin_format_e PINFORMAT){
    char *PINFORMATArray[] =  { "NULL", "ALL", "ORGANIC_IMAGE", "ORGANIC_PRODUCT", "ORGANIC_VIDEO", "ADS_STANDARD", "ADS_PRODUCT", "ADS_VIDEO", "ADS_IDEA" };
    return PINFORMATArray[PINFORMAT];
}

static pinterest_rest_api_userAccountAnalyticsTopVideoPins_pin_format_e userAccountAnalyticsTopVideoPins_PINFORMAT_FromString(char* PINFORMAT){
    int stringToReturn = 0;
    char *PINFORMATArray[] =  { "NULL", "ALL", "ORGANIC_IMAGE", "ORGANIC_PRODUCT", "ORGANIC_VIDEO", "ADS_STANDARD", "ADS_PRODUCT", "ADS_VIDEO", "ADS_IDEA" };
    size_t sizeofArray = sizeof(PINFORMATArray) / sizeof(PINFORMATArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(PINFORMAT, PINFORMATArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function userAccountAnalyticsTopVideoPins_PINFORMAT_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *userAccountAnalyticsTopVideoPins_PINFORMAT_convertToJSON(pinterest_rest_api_userAccountAnalyticsTopVideoPins_pin_format_e PINFORMAT) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "pin_format", userAccountAnalyticsTopVideoPins_PINFORMAT_ToString(PINFORMAT)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function userAccountAnalyticsTopVideoPins_PINFORMAT_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_userAccountAnalyticsTopVideoPins_pin_format_e userAccountAnalyticsTopVideoPins_PINFORMAT_parseFromJSON(cJSON* PINFORMATJSON) {
    pinterest_rest_api_userAccountAnalyticsTopVideoPins_pin_format_e PINFORMATVariable = 0;
    cJSON *PINFORMATVar = cJSON_GetObjectItemCaseSensitive(PINFORMATJSON, "pin_format");
    if(!cJSON_IsString(PINFORMATVar) || (PINFORMATVar->valuestring == NULL))
    {
        goto end;
    }
    PINFORMATVariable = userAccountAnalyticsTopVideoPins_PINFORMAT_FromString(PINFORMATVar->valuestring);
    return PINFORMATVariable;
end:
    return 0;
}
*/

// Functions for enum APPTYPES for UserAccountAPI_userAccountAnalyticsTopVideoPins

static char* userAccountAnalyticsTopVideoPins_APPTYPES_ToString(pinterest_rest_api_userAccountAnalyticsTopVideoPins_app_types_e APPTYPES){
    char *APPTYPESArray[] =  { "NULL", "ALL", "MOBILE", "TABLET", "WEB" };
    return APPTYPESArray[APPTYPES];
}

static pinterest_rest_api_userAccountAnalyticsTopVideoPins_app_types_e userAccountAnalyticsTopVideoPins_APPTYPES_FromString(char* APPTYPES){
    int stringToReturn = 0;
    char *APPTYPESArray[] =  { "NULL", "ALL", "MOBILE", "TABLET", "WEB" };
    size_t sizeofArray = sizeof(APPTYPESArray) / sizeof(APPTYPESArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(APPTYPES, APPTYPESArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function userAccountAnalyticsTopVideoPins_APPTYPES_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *userAccountAnalyticsTopVideoPins_APPTYPES_convertToJSON(pinterest_rest_api_userAccountAnalyticsTopVideoPins_app_types_e APPTYPES) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "app_types", userAccountAnalyticsTopVideoPins_APPTYPES_ToString(APPTYPES)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function userAccountAnalyticsTopVideoPins_APPTYPES_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_userAccountAnalyticsTopVideoPins_app_types_e userAccountAnalyticsTopVideoPins_APPTYPES_parseFromJSON(cJSON* APPTYPESJSON) {
    pinterest_rest_api_userAccountAnalyticsTopVideoPins_app_types_e APPTYPESVariable = 0;
    cJSON *APPTYPESVar = cJSON_GetObjectItemCaseSensitive(APPTYPESJSON, "app_types");
    if(!cJSON_IsString(APPTYPESVar) || (APPTYPESVar->valuestring == NULL))
    {
        goto end;
    }
    APPTYPESVariable = userAccountAnalyticsTopVideoPins_APPTYPES_FromString(APPTYPESVar->valuestring);
    return APPTYPESVariable;
end:
    return 0;
}
*/

// Functions for enum CONTENTTYPE for UserAccountAPI_userAccountAnalyticsTopVideoPins

static char* userAccountAnalyticsTopVideoPins_CONTENTTYPE_ToString(pinterest_rest_api_userAccountAnalyticsTopVideoPins_content_type_e CONTENTTYPE){
    char *CONTENTTYPEArray[] =  { "NULL", "ALL", "PAID", "ORGANIC" };
    return CONTENTTYPEArray[CONTENTTYPE];
}

static pinterest_rest_api_userAccountAnalyticsTopVideoPins_content_type_e userAccountAnalyticsTopVideoPins_CONTENTTYPE_FromString(char* CONTENTTYPE){
    int stringToReturn = 0;
    char *CONTENTTYPEArray[] =  { "NULL", "ALL", "PAID", "ORGANIC" };
    size_t sizeofArray = sizeof(CONTENTTYPEArray) / sizeof(CONTENTTYPEArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(CONTENTTYPE, CONTENTTYPEArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function userAccountAnalyticsTopVideoPins_CONTENTTYPE_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *userAccountAnalyticsTopVideoPins_CONTENTTYPE_convertToJSON(pinterest_rest_api_userAccountAnalyticsTopVideoPins_content_type_e CONTENTTYPE) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "content_type", userAccountAnalyticsTopVideoPins_CONTENTTYPE_ToString(CONTENTTYPE)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function userAccountAnalyticsTopVideoPins_CONTENTTYPE_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_userAccountAnalyticsTopVideoPins_content_type_e userAccountAnalyticsTopVideoPins_CONTENTTYPE_parseFromJSON(cJSON* CONTENTTYPEJSON) {
    pinterest_rest_api_userAccountAnalyticsTopVideoPins_content_type_e CONTENTTYPEVariable = 0;
    cJSON *CONTENTTYPEVar = cJSON_GetObjectItemCaseSensitive(CONTENTTYPEJSON, "content_type");
    if(!cJSON_IsString(CONTENTTYPEVar) || (CONTENTTYPEVar->valuestring == NULL))
    {
        goto end;
    }
    CONTENTTYPEVariable = userAccountAnalyticsTopVideoPins_CONTENTTYPE_FromString(CONTENTTYPEVar->valuestring);
    return CONTENTTYPEVariable;
end:
    return 0;
}
*/

// Functions for enum SOURCE for UserAccountAPI_userAccountAnalyticsTopVideoPins

static char* userAccountAnalyticsTopVideoPins_SOURCE_ToString(pinterest_rest_api_userAccountAnalyticsTopVideoPins_source_e SOURCE){
    char *SOURCEArray[] =  { "NULL", "ALL", "YOUR_PINS", "OTHER_PINS" };
    return SOURCEArray[SOURCE];
}

static pinterest_rest_api_userAccountAnalyticsTopVideoPins_source_e userAccountAnalyticsTopVideoPins_SOURCE_FromString(char* SOURCE){
    int stringToReturn = 0;
    char *SOURCEArray[] =  { "NULL", "ALL", "YOUR_PINS", "OTHER_PINS" };
    size_t sizeofArray = sizeof(SOURCEArray) / sizeof(SOURCEArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(SOURCE, SOURCEArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function userAccountAnalyticsTopVideoPins_SOURCE_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *userAccountAnalyticsTopVideoPins_SOURCE_convertToJSON(pinterest_rest_api_userAccountAnalyticsTopVideoPins_source_e SOURCE) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "source", userAccountAnalyticsTopVideoPins_SOURCE_ToString(SOURCE)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function userAccountAnalyticsTopVideoPins_SOURCE_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_userAccountAnalyticsTopVideoPins_source_e userAccountAnalyticsTopVideoPins_SOURCE_parseFromJSON(cJSON* SOURCEJSON) {
    pinterest_rest_api_userAccountAnalyticsTopVideoPins_source_e SOURCEVariable = 0;
    cJSON *SOURCEVar = cJSON_GetObjectItemCaseSensitive(SOURCEJSON, "source");
    if(!cJSON_IsString(SOURCEVar) || (SOURCEVar->valuestring == NULL))
    {
        goto end;
    }
    SOURCEVariable = userAccountAnalyticsTopVideoPins_SOURCE_FromString(SOURCEVar->valuestring);
    return SOURCEVariable;
end:
    return 0;
}
*/

// Functions for enum METRICTYPES for UserAccountAPI_userAccountAnalyticsTopVideoPins

static char* userAccountAnalyticsTopVideoPins_METRICTYPES_ToString(pinterest_rest_api_userAccountAnalyticsTopVideoPins_metric_types_e METRICTYPES){
    char *METRICTYPESArray[] =  { "NULL", "IMPRESSION", "SAVE", "VIDEO_MRC_VIEW", "VIDEO_AVG_WATCH_TIME", "VIDEO_V50_WATCH_TIME", "QUARTILE_95_PERCENT_VIEW", "VIDEO_10S_VIEW", "VIDEO_START", "OUTBOUND_CLICK" };
    return METRICTYPESArray[METRICTYPES];
}

static pinterest_rest_api_userAccountAnalyticsTopVideoPins_metric_types_e userAccountAnalyticsTopVideoPins_METRICTYPES_FromString(char* METRICTYPES){
    int stringToReturn = 0;
    char *METRICTYPESArray[] =  { "NULL", "IMPRESSION", "SAVE", "VIDEO_MRC_VIEW", "VIDEO_AVG_WATCH_TIME", "VIDEO_V50_WATCH_TIME", "QUARTILE_95_PERCENT_VIEW", "VIDEO_10S_VIEW", "VIDEO_START", "OUTBOUND_CLICK" };
    size_t sizeofArray = sizeof(METRICTYPESArray) / sizeof(METRICTYPESArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(METRICTYPES, METRICTYPESArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function userAccountAnalyticsTopVideoPins_METRICTYPES_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *userAccountAnalyticsTopVideoPins_METRICTYPES_convertToJSON(pinterest_rest_api_userAccountAnalyticsTopVideoPins_metric_types_e METRICTYPES) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function userAccountAnalyticsTopVideoPins_METRICTYPES_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_userAccountAnalyticsTopVideoPins_metric_types_e userAccountAnalyticsTopVideoPins_METRICTYPES_parseFromJSON(cJSON* METRICTYPESJSON) {
    pinterest_rest_api_userAccountAnalyticsTopVideoPins_metric_types_e METRICTYPESVariable = 0;
    return METRICTYPESVariable;
end:
    return 0;
}
*/

// Functions for enum CREATEDINLASTNDAYS for UserAccountAPI_userAccountAnalyticsTopVideoPins

static char* userAccountAnalyticsTopVideoPins_CREATEDINLASTNDAYS_ToString(pinterest_rest_api_userAccountAnalyticsTopVideoPins_created_in_last_n_days_e CREATEDINLASTNDAYS){
    char *CREATEDINLASTNDAYSArray[] =  { "NULL", "30" };
    return CREATEDINLASTNDAYSArray[CREATEDINLASTNDAYS];
}

static pinterest_rest_api_userAccountAnalyticsTopVideoPins_created_in_last_n_days_e userAccountAnalyticsTopVideoPins_CREATEDINLASTNDAYS_FromString(char* CREATEDINLASTNDAYS){
    int stringToReturn = 0;
    char *CREATEDINLASTNDAYSArray[] =  { "NULL", "30" };
    size_t sizeofArray = sizeof(CREATEDINLASTNDAYSArray) / sizeof(CREATEDINLASTNDAYSArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(CREATEDINLASTNDAYS, CREATEDINLASTNDAYSArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function userAccountAnalyticsTopVideoPins_CREATEDINLASTNDAYS_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *userAccountAnalyticsTopVideoPins_CREATEDINLASTNDAYS_convertToJSON(pinterest_rest_api_userAccountAnalyticsTopVideoPins_created_in_last_n_days_e CREATEDINLASTNDAYS) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function userAccountAnalyticsTopVideoPins_CREATEDINLASTNDAYS_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_userAccountAnalyticsTopVideoPins_created_in_last_n_days_e userAccountAnalyticsTopVideoPins_CREATEDINLASTNDAYS_parseFromJSON(cJSON* CREATEDINLASTNDAYSJSON) {
    pinterest_rest_api_userAccountAnalyticsTopVideoPins_created_in_last_n_days_e CREATEDINLASTNDAYSVariable = 0;
    return CREATEDINLASTNDAYSVariable;
end:
    return 0;
}
*/

// Functions for enum  for UserAccountAPI_userFollowingGet

static char* userFollowingGet__ToString(pinterest_rest_api_userFollowingGet_feed_type_e ){
    char *Array[] =  { "NULL", "ALL", "RANKED", "CREATOR_ONLY", "RANKED_CREATOR_ONLY" };
    return Array[];
}

static pinterest_rest_api_userFollowingGet_feed_type_e userFollowingGet__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "ALL", "RANKED", "CREATOR_ONLY", "RANKED_CREATOR_ONLY" };
    size_t sizeofArray = sizeof(Array) / sizeof(Array[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(, Array[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function userFollowingGet__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *userFollowingGet__convertToJSON(pinterest_rest_api_userFollowingGet_feed_type_e ) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "feed_type", userFollowingGet__ToString()) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function userFollowingGet__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_userFollowingGet_feed_type_e userFollowingGet__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_userFollowingGet_feed_type_e Variable = 0;
    cJSON *Var = cJSON_GetObjectItemCaseSensitive(JSON, "feed_type");
    if(!cJSON_IsString(Var) || (Var->valuestring == NULL))
    {
        goto end;
    }
    Variable = userFollowingGet__FromString(Var->valuestring);
    return Variable;
end:
    return 0;
}
*/


// List following boards
//
// Get a list of the boards a user follows. The request returns a board summary object array.
//
boards_user_follows_list_200_response_t*
UserAccountAPI_boardsUserFollowsList(apiClient_t *apiClient, char *bookmark, int *page_size, int *explicit_following, char *ad_account_id)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/user_account/following/boards")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/user_account/following/boards");




    // query parameters
    char *keyQuery_bookmark = NULL;
    char * valueQuery_bookmark = NULL;
    keyValuePair_t *keyPairQuery_bookmark = 0;
    if (bookmark)
    {
        keyQuery_bookmark = strdup("bookmark");
        valueQuery_bookmark = strdup((bookmark));
        keyPairQuery_bookmark = keyValuePair_create(keyQuery_bookmark, valueQuery_bookmark);
        list_addElement(localVarQueryParameters,keyPairQuery_bookmark);
    }

    // query parameters
    char *keyQuery_page_size = NULL;
    char * valueQuery_page_size = NULL;
    keyValuePair_t *keyPairQuery_page_size = 0;
    if (page_size)
    {
        keyQuery_page_size = strdup("page_size");
        valueQuery_page_size = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_page_size, MAX_NUMBER_LENGTH, "%d", *page_size);
        keyPairQuery_page_size = keyValuePair_create(keyQuery_page_size, valueQuery_page_size);
        list_addElement(localVarQueryParameters,keyPairQuery_page_size);
    }

    // query parameters
    char *keyQuery_explicit_following = NULL;
    char * valueQuery_explicit_following = NULL;
    keyValuePair_t *keyPairQuery_explicit_following = 0;
    if (explicit_following)
    {
        keyQuery_explicit_following = strdup("explicit_following");
        valueQuery_explicit_following = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_explicit_following, MAX_NUMBER_LENGTH, "%d", *explicit_following);
        keyPairQuery_explicit_following = keyValuePair_create(keyQuery_explicit_following, valueQuery_explicit_following);
        list_addElement(localVarQueryParameters,keyPairQuery_explicit_following);
    }

    // query parameters
    char *keyQuery_ad_account_id = NULL;
    char * valueQuery_ad_account_id = NULL;
    keyValuePair_t *keyPairQuery_ad_account_id = 0;
    if (ad_account_id)
    {
        keyQuery_ad_account_id = strdup("ad_account_id");
        valueQuery_ad_account_id = strdup((ad_account_id));
        keyPairQuery_ad_account_id = keyValuePair_create(keyQuery_ad_account_id, valueQuery_ad_account_id);
        list_addElement(localVarQueryParameters,keyPairQuery_ad_account_id);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Success");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Invalid user id");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *UserAccountAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    boards_user_follows_list_200_response_t *elementToReturn = boards_user_follows_list_200_response_parseFromJSON(UserAccountAPIlocalVarJSON);
    cJSON_Delete(UserAccountAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    if(keyQuery_bookmark){
        free(keyQuery_bookmark);
        keyQuery_bookmark = NULL;
    }
    if(valueQuery_bookmark){
        free(valueQuery_bookmark);
        valueQuery_bookmark = NULL;
    }
    if(keyPairQuery_bookmark){
        keyValuePair_free(keyPairQuery_bookmark);
        keyPairQuery_bookmark = NULL;
    }
    if(keyQuery_page_size){
        free(keyQuery_page_size);
        keyQuery_page_size = NULL;
    }
    if(valueQuery_page_size){
        free(valueQuery_page_size);
        valueQuery_page_size = NULL;
    }
    if(keyPairQuery_page_size){
        keyValuePair_free(keyPairQuery_page_size);
        keyPairQuery_page_size = NULL;
    }
    if(keyQuery_explicit_following){
        free(keyQuery_explicit_following);
        keyQuery_explicit_following = NULL;
    }
    if(valueQuery_explicit_following){
        free(valueQuery_explicit_following);
        valueQuery_explicit_following = NULL;
    }
    if(keyPairQuery_explicit_following){
        keyValuePair_free(keyPairQuery_explicit_following);
        keyPairQuery_explicit_following = NULL;
    }
    if(keyQuery_ad_account_id){
        free(keyQuery_ad_account_id);
        keyQuery_ad_account_id = NULL;
    }
    if(valueQuery_ad_account_id){
        free(valueQuery_ad_account_id);
        valueQuery_ad_account_id = NULL;
    }
    if(keyPairQuery_ad_account_id){
        keyValuePair_free(keyPairQuery_ad_account_id);
        keyPairQuery_ad_account_id = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Follow user
//
// <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>  Use this request, as a signed-in user, to follow another user.
//
user_summary_t*
UserAccountAPI_followUserUpdate(apiClient_t *apiClient, char *username, follow_user_request_t *follow_user_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/user_account/following/{username}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/user_account/following/{username}");


    // Path Params
    long sizeOfPathParams_username = strlen(username)+3 + strlen("{ username }");
    if(username == NULL) {
        goto end;
    }
    char* localVarToReplace_username = malloc(sizeOfPathParams_username);
    sprintf(localVarToReplace_username, "{%s}", "username");

    localVarPath = strReplace(localVarPath, localVarToReplace_username, username);



    // Body Param
    cJSON *localVarSingleItemJSON_follow_user_request = NULL;
    if (follow_user_request != NULL)
    {
        //string
        localVarSingleItemJSON_follow_user_request = follow_user_request_convertToJSON(follow_user_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_follow_user_request);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"application/json"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Success");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","User not found");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *UserAccountAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    user_summary_t *elementToReturn = user_summary_parseFromJSON(UserAccountAPIlocalVarJSON);
    cJSON_Delete(UserAccountAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_username);
    if (localVarSingleItemJSON_follow_user_request) {
        cJSON_Delete(localVarSingleItemJSON_follow_user_request);
        localVarSingleItemJSON_follow_user_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// List followers
//
// Get a list of your followers.
//
followers_list_200_response_t*
UserAccountAPI_followersList(apiClient_t *apiClient, char *bookmark, int *page_size)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/user_account/followers")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/user_account/followers");




    // query parameters
    char *keyQuery_bookmark = NULL;
    char * valueQuery_bookmark = NULL;
    keyValuePair_t *keyPairQuery_bookmark = 0;
    if (bookmark)
    {
        keyQuery_bookmark = strdup("bookmark");
        valueQuery_bookmark = strdup((bookmark));
        keyPairQuery_bookmark = keyValuePair_create(keyQuery_bookmark, valueQuery_bookmark);
        list_addElement(localVarQueryParameters,keyPairQuery_bookmark);
    }

    // query parameters
    char *keyQuery_page_size = NULL;
    char * valueQuery_page_size = NULL;
    keyValuePair_t *keyPairQuery_page_size = 0;
    if (page_size)
    {
        keyQuery_page_size = strdup("page_size");
        valueQuery_page_size = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_page_size, MAX_NUMBER_LENGTH, "%d", *page_size);
        keyPairQuery_page_size = keyValuePair_create(keyQuery_page_size, valueQuery_page_size);
        list_addElement(localVarQueryParameters,keyPairQuery_page_size);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Success");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Invalid user id");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *UserAccountAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    followers_list_200_response_t *elementToReturn = followers_list_200_response_parseFromJSON(UserAccountAPIlocalVarJSON);
    cJSON_Delete(UserAccountAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    if(keyQuery_bookmark){
        free(keyQuery_bookmark);
        keyQuery_bookmark = NULL;
    }
    if(valueQuery_bookmark){
        free(valueQuery_bookmark);
        valueQuery_bookmark = NULL;
    }
    if(keyPairQuery_bookmark){
        keyValuePair_free(keyPairQuery_bookmark);
        keyPairQuery_bookmark = NULL;
    }
    if(keyQuery_page_size){
        free(keyQuery_page_size);
        keyQuery_page_size = NULL;
    }
    if(valueQuery_page_size){
        free(valueQuery_page_size);
        valueQuery_page_size = NULL;
    }
    if(keyPairQuery_page_size){
        keyValuePair_free(keyPairQuery_page_size);
        keyPairQuery_page_size = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// List linked businesses
//
// Get a list of your linked business accounts.
//
list_t*
UserAccountAPI_linkedBusinessAccountsGet(apiClient_t *apiClient)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/user_account/businesses")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/user_account/businesses");



    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Success");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    cJSON *UserAccountAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    if(!cJSON_IsArray(UserAccountAPIlocalVarJSON)) {
        return 0;//nonprimitive container
    }
    list_t *elementToReturn = list_createList();
    cJSON *VarJSON;
    cJSON_ArrayForEach(VarJSON, UserAccountAPIlocalVarJSON)
    {
        if(!cJSON_IsObject(VarJSON))
        {
           // return 0;
        }
        char *localVarJSONToChar = cJSON_Print(VarJSON);
        list_addElement(elementToReturn , localVarJSONToChar);
    }

    cJSON_Delete( UserAccountAPIlocalVarJSON);
    cJSON_Delete( VarJSON);
    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Unverify website
//
// Unverifu a website verified by the signed-in user.
//
void
UserAccountAPI_unverifyWebsiteDelete(apiClient_t *apiClient, char *website)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/user_account/websites")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/user_account/websites");




    // query parameters
    char *keyQuery_website = NULL;
    char * valueQuery_website = NULL;
    keyValuePair_t *keyPairQuery_website = 0;
    if (website)
    {
        keyQuery_website = strdup("website");
        valueQuery_website = strdup((website));
        keyPairQuery_website = keyValuePair_create(keyQuery_website, valueQuery_website);
        list_addElement(localVarQueryParameters,keyPairQuery_website);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "DELETE");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 204) {
    //    printf("%s\n","Successfully unverified website");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","Website not in user list.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //No return type
end:
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    if(keyQuery_website){
        free(keyQuery_website);
        keyQuery_website = NULL;
    }
    if(valueQuery_website){
        free(valueQuery_website);
        valueQuery_website = NULL;
    }
    if(keyPairQuery_website){
        keyValuePair_free(keyPairQuery_website);
        keyPairQuery_website = NULL;
    }
    if(keyQuery_website){
        free(keyQuery_website);
        keyQuery_website = NULL;
    }
    if(keyPairQuery_website){
        keyValuePair_free(keyPairQuery_website);
        keyPairQuery_website = NULL;
    }

}

// Get user account analytics
//
// Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
//
list_t*_t*
UserAccountAPI_userAccountAnalytics(apiClient_t *apiClient, char start_date, char end_date, pinterest_rest_api_userAccountAnalytics_from_claimed_content_e from_claimed_content, pinterest_rest_api_userAccountAnalytics_pin_format_e pin_format, pinterest_rest_api_userAccountAnalytics_app_types_e app_types, pinterest_rest_api_userAccountAnalytics_content_type_e content_type, pinterest_rest_api_userAccountAnalytics_source_e source, list_t *metric_types, pinterest_rest_api_userAccountAnalytics_split_field_e split_field, char *ad_account_id)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/user_account/analytics")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/user_account/analytics");




    // query parameters
    char *keyQuery_start_date = NULL;
    char valueQuery_start_date ;
    keyValuePair_t *keyPairQuery_start_date = 0;
    if (start_date)
    {
        keyQuery_start_date = strdup("start_date");
        valueQuery_start_date = (start_date);
        keyPairQuery_start_date = keyValuePair_create(keyQuery_start_date, &valueQuery_start_date);
        list_addElement(localVarQueryParameters,keyPairQuery_start_date);
    }

    // query parameters
    char *keyQuery_end_date = NULL;
    char valueQuery_end_date ;
    keyValuePair_t *keyPairQuery_end_date = 0;
    if (end_date)
    {
        keyQuery_end_date = strdup("end_date");
        valueQuery_end_date = (end_date);
        keyPairQuery_end_date = keyValuePair_create(keyQuery_end_date, &valueQuery_end_date);
        list_addElement(localVarQueryParameters,keyPairQuery_end_date);
    }

    // query parameters
    char *keyQuery_from_claimed_content = NULL;
    pinterest_rest_api_userAccountAnalytics_from_claimed_content_e valueQuery_from_claimed_content ;
    keyValuePair_t *keyPairQuery_from_claimed_content = 0;
    if (from_claimed_content)
    {
        keyQuery_from_claimed_content = strdup("from_claimed_content");
        valueQuery_from_claimed_content = (from_claimed_content);
        keyPairQuery_from_claimed_content = keyValuePair_create(keyQuery_from_claimed_content, (void *)strdup(userAccountAnalytics_FROMCLAIMEDCONTENT_ToString(
        valueQuery_from_claimed_content)));
        list_addElement(localVarQueryParameters,keyPairQuery_from_claimed_content);
    }

    // query parameters
    char *keyQuery_pin_format = NULL;
    pinterest_rest_api_userAccountAnalytics_pin_format_e valueQuery_pin_format ;
    keyValuePair_t *keyPairQuery_pin_format = 0;
    if (pin_format)
    {
        keyQuery_pin_format = strdup("pin_format");
        valueQuery_pin_format = (pin_format);
        keyPairQuery_pin_format = keyValuePair_create(keyQuery_pin_format, (void *)strdup(userAccountAnalytics_PINFORMAT_ToString(
        valueQuery_pin_format)));
        list_addElement(localVarQueryParameters,keyPairQuery_pin_format);
    }

    // query parameters
    char *keyQuery_app_types = NULL;
    pinterest_rest_api_userAccountAnalytics_app_types_e valueQuery_app_types ;
    keyValuePair_t *keyPairQuery_app_types = 0;
    if (app_types)
    {
        keyQuery_app_types = strdup("app_types");
        valueQuery_app_types = (app_types);
        keyPairQuery_app_types = keyValuePair_create(keyQuery_app_types, (void *)strdup(userAccountAnalytics_APPTYPES_ToString(
        valueQuery_app_types)));
        list_addElement(localVarQueryParameters,keyPairQuery_app_types);
    }

    // query parameters
    char *keyQuery_content_type = NULL;
    pinterest_rest_api_userAccountAnalytics_content_type_e valueQuery_content_type ;
    keyValuePair_t *keyPairQuery_content_type = 0;
    if (content_type)
    {
        keyQuery_content_type = strdup("content_type");
        valueQuery_content_type = (content_type);
        keyPairQuery_content_type = keyValuePair_create(keyQuery_content_type, (void *)strdup(userAccountAnalytics_CONTENTTYPE_ToString(
        valueQuery_content_type)));
        list_addElement(localVarQueryParameters,keyPairQuery_content_type);
    }

    // query parameters
    char *keyQuery_source = NULL;
    pinterest_rest_api_userAccountAnalytics_source_e valueQuery_source ;
    keyValuePair_t *keyPairQuery_source = 0;
    if (source)
    {
        keyQuery_source = strdup("source");
        valueQuery_source = (source);
        keyPairQuery_source = keyValuePair_create(keyQuery_source, (void *)strdup(userAccountAnalytics_SOURCE_ToString(
        valueQuery_source)));
        list_addElement(localVarQueryParameters,keyPairQuery_source);
    }

    // query parameters
    if (metric_types)
    {
        list_addElement(localVarQueryParameters,metric_types);
    }

    // query parameters
    char *keyQuery_split_field = NULL;
    pinterest_rest_api_userAccountAnalytics_split_field_e valueQuery_split_field ;
    keyValuePair_t *keyPairQuery_split_field = 0;
    if (split_field)
    {
        keyQuery_split_field = strdup("split_field");
        valueQuery_split_field = (split_field);
        keyPairQuery_split_field = keyValuePair_create(keyQuery_split_field, (void *)strdup(userAccountAnalytics_SPLITFIELD_ToString(
        valueQuery_split_field)));
        list_addElement(localVarQueryParameters,keyPairQuery_split_field);
    }

    // query parameters
    char *keyQuery_ad_account_id = NULL;
    char * valueQuery_ad_account_id = NULL;
    keyValuePair_t *keyPairQuery_ad_account_id = 0;
    if (ad_account_id)
    {
        keyQuery_ad_account_id = strdup("ad_account_id");
        valueQuery_ad_account_id = strdup((ad_account_id));
        keyPairQuery_ad_account_id = keyValuePair_create(keyQuery_ad_account_id, valueQuery_ad_account_id);
        list_addElement(localVarQueryParameters,keyPairQuery_ad_account_id);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Success");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Invalid user accounts analytics parameters.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","Not authorized to access the user account analytics.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    cJSON *UserAccountAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    if(!cJSON_IsArray(UserAccountAPIlocalVarJSON)) {
        return 0;//nonprimitive container
    }
    list_t *elementToReturn = list_createList();
    cJSON *VarJSON;
    cJSON_ArrayForEach(VarJSON, UserAccountAPIlocalVarJSON)
    {
        if(!cJSON_IsObject(VarJSON))
        {
           // return 0;
        }
        char *localVarJSONToChar = cJSON_Print(VarJSON);
        list_addElement(elementToReturn , localVarJSONToChar);
    }

    cJSON_Delete( UserAccountAPIlocalVarJSON);
    cJSON_Delete( VarJSON);
    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    if(keyQuery_start_date){
        free(keyQuery_start_date);
        keyQuery_start_date = NULL;
    }
    if(keyPairQuery_start_date){
        keyValuePair_free(keyPairQuery_start_date);
        keyPairQuery_start_date = NULL;
    }
    if(keyQuery_end_date){
        free(keyQuery_end_date);
        keyQuery_end_date = NULL;
    }
    if(keyPairQuery_end_date){
        keyValuePair_free(keyPairQuery_end_date);
        keyPairQuery_end_date = NULL;
    }
    if(keyQuery_from_claimed_content){
        free(keyQuery_from_claimed_content);
        keyQuery_from_claimed_content = NULL;
    }
    if(keyPairQuery_from_claimed_content){
        keyValuePair_free(keyPairQuery_from_claimed_content);
        keyPairQuery_from_claimed_content = NULL;
    }
    if(keyQuery_pin_format){
        free(keyQuery_pin_format);
        keyQuery_pin_format = NULL;
    }
    if(keyPairQuery_pin_format){
        keyValuePair_free(keyPairQuery_pin_format);
        keyPairQuery_pin_format = NULL;
    }
    if(keyQuery_app_types){
        free(keyQuery_app_types);
        keyQuery_app_types = NULL;
    }
    if(keyPairQuery_app_types){
        keyValuePair_free(keyPairQuery_app_types);
        keyPairQuery_app_types = NULL;
    }
    if(keyQuery_content_type){
        free(keyQuery_content_type);
        keyQuery_content_type = NULL;
    }
    if(keyPairQuery_content_type){
        keyValuePair_free(keyPairQuery_content_type);
        keyPairQuery_content_type = NULL;
    }
    if(keyQuery_source){
        free(keyQuery_source);
        keyQuery_source = NULL;
    }
    if(keyPairQuery_source){
        keyValuePair_free(keyPairQuery_source);
        keyPairQuery_source = NULL;
    }
    if(keyQuery_split_field){
        free(keyQuery_split_field);
        keyQuery_split_field = NULL;
    }
    if(keyPairQuery_split_field){
        keyValuePair_free(keyPairQuery_split_field);
        keyPairQuery_split_field = NULL;
    }
    if(keyQuery_ad_account_id){
        free(keyQuery_ad_account_id);
        keyQuery_ad_account_id = NULL;
    }
    if(valueQuery_ad_account_id){
        free(valueQuery_ad_account_id);
        valueQuery_ad_account_id = NULL;
    }
    if(keyPairQuery_ad_account_id){
        keyValuePair_free(keyPairQuery_ad_account_id);
        keyPairQuery_ad_account_id = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get user account top pins analytics
//
// Gets analytics data about a user's top pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
//
top_pins_analytics_response_t*
UserAccountAPI_userAccountAnalyticsTopPins(apiClient_t *apiClient, char start_date, char end_date, pinterest_rest_api_userAccountAnalyticsTopPins_sort_by_e sort_by, pinterest_rest_api_userAccountAnalyticsTopPins_from_claimed_content_e from_claimed_content, pinterest_rest_api_userAccountAnalyticsTopPins_pin_format_e pin_format, pinterest_rest_api_userAccountAnalyticsTopPins_app_types_e app_types, pinterest_rest_api_userAccountAnalyticsTopPins_content_type_e content_type, pinterest_rest_api_userAccountAnalyticsTopPins_source_e source, list_t *metric_types, int *num_of_pins, int *created_in_last_n_days, char *ad_account_id)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/user_account/analytics/top_pins")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/user_account/analytics/top_pins");




    // query parameters
    char *keyQuery_start_date = NULL;
    char valueQuery_start_date ;
    keyValuePair_t *keyPairQuery_start_date = 0;
    if (start_date)
    {
        keyQuery_start_date = strdup("start_date");
        valueQuery_start_date = (start_date);
        keyPairQuery_start_date = keyValuePair_create(keyQuery_start_date, &valueQuery_start_date);
        list_addElement(localVarQueryParameters,keyPairQuery_start_date);
    }

    // query parameters
    char *keyQuery_end_date = NULL;
    char valueQuery_end_date ;
    keyValuePair_t *keyPairQuery_end_date = 0;
    if (end_date)
    {
        keyQuery_end_date = strdup("end_date");
        valueQuery_end_date = (end_date);
        keyPairQuery_end_date = keyValuePair_create(keyQuery_end_date, &valueQuery_end_date);
        list_addElement(localVarQueryParameters,keyPairQuery_end_date);
    }

    // query parameters
    char *keyQuery_sort_by = NULL;
    pinterest_rest_api_userAccountAnalyticsTopPins_sort_by_e valueQuery_sort_by ;
    keyValuePair_t *keyPairQuery_sort_by = 0;
    if (sort_by)
    {
        keyQuery_sort_by = strdup("sort_by");
        valueQuery_sort_by = (sort_by);
        keyPairQuery_sort_by = keyValuePair_create(keyQuery_sort_by, (void *)strdup(userAccountAnalyticsTopPins_SORTBY_ToString(
        valueQuery_sort_by)));
        list_addElement(localVarQueryParameters,keyPairQuery_sort_by);
    }

    // query parameters
    char *keyQuery_from_claimed_content = NULL;
    pinterest_rest_api_userAccountAnalyticsTopPins_from_claimed_content_e valueQuery_from_claimed_content ;
    keyValuePair_t *keyPairQuery_from_claimed_content = 0;
    if (from_claimed_content)
    {
        keyQuery_from_claimed_content = strdup("from_claimed_content");
        valueQuery_from_claimed_content = (from_claimed_content);
        keyPairQuery_from_claimed_content = keyValuePair_create(keyQuery_from_claimed_content, (void *)strdup(userAccountAnalyticsTopPins_FROMCLAIMEDCONTENT_ToString(
        valueQuery_from_claimed_content)));
        list_addElement(localVarQueryParameters,keyPairQuery_from_claimed_content);
    }

    // query parameters
    char *keyQuery_pin_format = NULL;
    pinterest_rest_api_userAccountAnalyticsTopPins_pin_format_e valueQuery_pin_format ;
    keyValuePair_t *keyPairQuery_pin_format = 0;
    if (pin_format)
    {
        keyQuery_pin_format = strdup("pin_format");
        valueQuery_pin_format = (pin_format);
        keyPairQuery_pin_format = keyValuePair_create(keyQuery_pin_format, (void *)strdup(userAccountAnalyticsTopPins_PINFORMAT_ToString(
        valueQuery_pin_format)));
        list_addElement(localVarQueryParameters,keyPairQuery_pin_format);
    }

    // query parameters
    char *keyQuery_app_types = NULL;
    pinterest_rest_api_userAccountAnalyticsTopPins_app_types_e valueQuery_app_types ;
    keyValuePair_t *keyPairQuery_app_types = 0;
    if (app_types)
    {
        keyQuery_app_types = strdup("app_types");
        valueQuery_app_types = (app_types);
        keyPairQuery_app_types = keyValuePair_create(keyQuery_app_types, (void *)strdup(userAccountAnalyticsTopPins_APPTYPES_ToString(
        valueQuery_app_types)));
        list_addElement(localVarQueryParameters,keyPairQuery_app_types);
    }

    // query parameters
    char *keyQuery_content_type = NULL;
    pinterest_rest_api_userAccountAnalyticsTopPins_content_type_e valueQuery_content_type ;
    keyValuePair_t *keyPairQuery_content_type = 0;
    if (content_type)
    {
        keyQuery_content_type = strdup("content_type");
        valueQuery_content_type = (content_type);
        keyPairQuery_content_type = keyValuePair_create(keyQuery_content_type, (void *)strdup(userAccountAnalyticsTopPins_CONTENTTYPE_ToString(
        valueQuery_content_type)));
        list_addElement(localVarQueryParameters,keyPairQuery_content_type);
    }

    // query parameters
    char *keyQuery_source = NULL;
    pinterest_rest_api_userAccountAnalyticsTopPins_source_e valueQuery_source ;
    keyValuePair_t *keyPairQuery_source = 0;
    if (source)
    {
        keyQuery_source = strdup("source");
        valueQuery_source = (source);
        keyPairQuery_source = keyValuePair_create(keyQuery_source, (void *)strdup(userAccountAnalyticsTopPins_SOURCE_ToString(
        valueQuery_source)));
        list_addElement(localVarQueryParameters,keyPairQuery_source);
    }

    // query parameters
    if (metric_types)
    {
        list_addElement(localVarQueryParameters,metric_types);
    }

    // query parameters
    char *keyQuery_num_of_pins = NULL;
    char * valueQuery_num_of_pins = NULL;
    keyValuePair_t *keyPairQuery_num_of_pins = 0;
    if (num_of_pins)
    {
        keyQuery_num_of_pins = strdup("num_of_pins");
        valueQuery_num_of_pins = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_num_of_pins, MAX_NUMBER_LENGTH, "%d", *num_of_pins);
        keyPairQuery_num_of_pins = keyValuePair_create(keyQuery_num_of_pins, valueQuery_num_of_pins);
        list_addElement(localVarQueryParameters,keyPairQuery_num_of_pins);
    }

    // query parameters
    char *keyQuery_created_in_last_n_days = NULL;
    char * valueQuery_created_in_last_n_days = NULL;
    keyValuePair_t *keyPairQuery_created_in_last_n_days = 0;
    if (created_in_last_n_days)
    {
        keyQuery_created_in_last_n_days = strdup("created_in_last_n_days");
        valueQuery_created_in_last_n_days = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_created_in_last_n_days, MAX_NUMBER_LENGTH, "%d", *created_in_last_n_days);
        keyPairQuery_created_in_last_n_days = keyValuePair_create(keyQuery_created_in_last_n_days, (void *)strdup(userAccountAnalyticsTopPins_CREATEDINLASTNDAYS_ToString(
        valueQuery_created_in_last_n_days)));
        list_addElement(localVarQueryParameters,keyPairQuery_created_in_last_n_days);
    }

    // query parameters
    char *keyQuery_ad_account_id = NULL;
    char * valueQuery_ad_account_id = NULL;
    keyValuePair_t *keyPairQuery_ad_account_id = 0;
    if (ad_account_id)
    {
        keyQuery_ad_account_id = strdup("ad_account_id");
        valueQuery_ad_account_id = strdup((ad_account_id));
        keyPairQuery_ad_account_id = keyValuePair_create(keyQuery_ad_account_id, valueQuery_ad_account_id);
        list_addElement(localVarQueryParameters,keyPairQuery_ad_account_id);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Success");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","Not authorized to access the user account analytics.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *UserAccountAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    top_pins_analytics_response_t *elementToReturn = top_pins_analytics_response_parseFromJSON(UserAccountAPIlocalVarJSON);
    cJSON_Delete(UserAccountAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    if(keyQuery_start_date){
        free(keyQuery_start_date);
        keyQuery_start_date = NULL;
    }
    if(keyPairQuery_start_date){
        keyValuePair_free(keyPairQuery_start_date);
        keyPairQuery_start_date = NULL;
    }
    if(keyQuery_end_date){
        free(keyQuery_end_date);
        keyQuery_end_date = NULL;
    }
    if(keyPairQuery_end_date){
        keyValuePair_free(keyPairQuery_end_date);
        keyPairQuery_end_date = NULL;
    }
    if(keyQuery_sort_by){
        free(keyQuery_sort_by);
        keyQuery_sort_by = NULL;
    }
    if(keyPairQuery_sort_by){
        keyValuePair_free(keyPairQuery_sort_by);
        keyPairQuery_sort_by = NULL;
    }
    if(keyQuery_from_claimed_content){
        free(keyQuery_from_claimed_content);
        keyQuery_from_claimed_content = NULL;
    }
    if(keyPairQuery_from_claimed_content){
        keyValuePair_free(keyPairQuery_from_claimed_content);
        keyPairQuery_from_claimed_content = NULL;
    }
    if(keyQuery_pin_format){
        free(keyQuery_pin_format);
        keyQuery_pin_format = NULL;
    }
    if(keyPairQuery_pin_format){
        keyValuePair_free(keyPairQuery_pin_format);
        keyPairQuery_pin_format = NULL;
    }
    if(keyQuery_app_types){
        free(keyQuery_app_types);
        keyQuery_app_types = NULL;
    }
    if(keyPairQuery_app_types){
        keyValuePair_free(keyPairQuery_app_types);
        keyPairQuery_app_types = NULL;
    }
    if(keyQuery_content_type){
        free(keyQuery_content_type);
        keyQuery_content_type = NULL;
    }
    if(keyPairQuery_content_type){
        keyValuePair_free(keyPairQuery_content_type);
        keyPairQuery_content_type = NULL;
    }
    if(keyQuery_source){
        free(keyQuery_source);
        keyQuery_source = NULL;
    }
    if(keyPairQuery_source){
        keyValuePair_free(keyPairQuery_source);
        keyPairQuery_source = NULL;
    }
    if(keyQuery_num_of_pins){
        free(keyQuery_num_of_pins);
        keyQuery_num_of_pins = NULL;
    }
    if(valueQuery_num_of_pins){
        free(valueQuery_num_of_pins);
        valueQuery_num_of_pins = NULL;
    }
    if(keyPairQuery_num_of_pins){
        keyValuePair_free(keyPairQuery_num_of_pins);
        keyPairQuery_num_of_pins = NULL;
    }
    if(keyQuery_created_in_last_n_days){
        free(keyQuery_created_in_last_n_days);
        keyQuery_created_in_last_n_days = NULL;
    }
    if(valueQuery_created_in_last_n_days){
        free(valueQuery_created_in_last_n_days);
        valueQuery_created_in_last_n_days = NULL;
    }
    if(keyPairQuery_created_in_last_n_days){
        keyValuePair_free(keyPairQuery_created_in_last_n_days);
        keyPairQuery_created_in_last_n_days = NULL;
    }
    if(keyQuery_ad_account_id){
        free(keyQuery_ad_account_id);
        keyQuery_ad_account_id = NULL;
    }
    if(valueQuery_ad_account_id){
        free(valueQuery_ad_account_id);
        valueQuery_ad_account_id = NULL;
    }
    if(keyPairQuery_ad_account_id){
        keyValuePair_free(keyPairQuery_ad_account_id);
        keyPairQuery_ad_account_id = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get user account top video pins analytics
//
// Gets analytics data about a user's top video pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
//
top_video_pins_analytics_response_t*
UserAccountAPI_userAccountAnalyticsTopVideoPins(apiClient_t *apiClient, char start_date, char end_date, pinterest_rest_api_userAccountAnalyticsTopVideoPins_sort_by_e sort_by, pinterest_rest_api_userAccountAnalyticsTopVideoPins_from_claimed_content_e from_claimed_content, pinterest_rest_api_userAccountAnalyticsTopVideoPins_pin_format_e pin_format, pinterest_rest_api_userAccountAnalyticsTopVideoPins_app_types_e app_types, pinterest_rest_api_userAccountAnalyticsTopVideoPins_content_type_e content_type, pinterest_rest_api_userAccountAnalyticsTopVideoPins_source_e source, list_t *metric_types, int *num_of_pins, int *created_in_last_n_days, char *ad_account_id)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/user_account/analytics/top_video_pins")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/user_account/analytics/top_video_pins");




    // query parameters
    char *keyQuery_start_date = NULL;
    char valueQuery_start_date ;
    keyValuePair_t *keyPairQuery_start_date = 0;
    if (start_date)
    {
        keyQuery_start_date = strdup("start_date");
        valueQuery_start_date = (start_date);
        keyPairQuery_start_date = keyValuePair_create(keyQuery_start_date, &valueQuery_start_date);
        list_addElement(localVarQueryParameters,keyPairQuery_start_date);
    }

    // query parameters
    char *keyQuery_end_date = NULL;
    char valueQuery_end_date ;
    keyValuePair_t *keyPairQuery_end_date = 0;
    if (end_date)
    {
        keyQuery_end_date = strdup("end_date");
        valueQuery_end_date = (end_date);
        keyPairQuery_end_date = keyValuePair_create(keyQuery_end_date, &valueQuery_end_date);
        list_addElement(localVarQueryParameters,keyPairQuery_end_date);
    }

    // query parameters
    char *keyQuery_sort_by = NULL;
    pinterest_rest_api_userAccountAnalyticsTopVideoPins_sort_by_e valueQuery_sort_by ;
    keyValuePair_t *keyPairQuery_sort_by = 0;
    if (sort_by)
    {
        keyQuery_sort_by = strdup("sort_by");
        valueQuery_sort_by = (sort_by);
        keyPairQuery_sort_by = keyValuePair_create(keyQuery_sort_by, (void *)strdup(userAccountAnalyticsTopVideoPins_SORTBY_ToString(
        valueQuery_sort_by)));
        list_addElement(localVarQueryParameters,keyPairQuery_sort_by);
    }

    // query parameters
    char *keyQuery_from_claimed_content = NULL;
    pinterest_rest_api_userAccountAnalyticsTopVideoPins_from_claimed_content_e valueQuery_from_claimed_content ;
    keyValuePair_t *keyPairQuery_from_claimed_content = 0;
    if (from_claimed_content)
    {
        keyQuery_from_claimed_content = strdup("from_claimed_content");
        valueQuery_from_claimed_content = (from_claimed_content);
        keyPairQuery_from_claimed_content = keyValuePair_create(keyQuery_from_claimed_content, (void *)strdup(userAccountAnalyticsTopVideoPins_FROMCLAIMEDCONTENT_ToString(
        valueQuery_from_claimed_content)));
        list_addElement(localVarQueryParameters,keyPairQuery_from_claimed_content);
    }

    // query parameters
    char *keyQuery_pin_format = NULL;
    pinterest_rest_api_userAccountAnalyticsTopVideoPins_pin_format_e valueQuery_pin_format ;
    keyValuePair_t *keyPairQuery_pin_format = 0;
    if (pin_format)
    {
        keyQuery_pin_format = strdup("pin_format");
        valueQuery_pin_format = (pin_format);
        keyPairQuery_pin_format = keyValuePair_create(keyQuery_pin_format, (void *)strdup(userAccountAnalyticsTopVideoPins_PINFORMAT_ToString(
        valueQuery_pin_format)));
        list_addElement(localVarQueryParameters,keyPairQuery_pin_format);
    }

    // query parameters
    char *keyQuery_app_types = NULL;
    pinterest_rest_api_userAccountAnalyticsTopVideoPins_app_types_e valueQuery_app_types ;
    keyValuePair_t *keyPairQuery_app_types = 0;
    if (app_types)
    {
        keyQuery_app_types = strdup("app_types");
        valueQuery_app_types = (app_types);
        keyPairQuery_app_types = keyValuePair_create(keyQuery_app_types, (void *)strdup(userAccountAnalyticsTopVideoPins_APPTYPES_ToString(
        valueQuery_app_types)));
        list_addElement(localVarQueryParameters,keyPairQuery_app_types);
    }

    // query parameters
    char *keyQuery_content_type = NULL;
    pinterest_rest_api_userAccountAnalyticsTopVideoPins_content_type_e valueQuery_content_type ;
    keyValuePair_t *keyPairQuery_content_type = 0;
    if (content_type)
    {
        keyQuery_content_type = strdup("content_type");
        valueQuery_content_type = (content_type);
        keyPairQuery_content_type = keyValuePair_create(keyQuery_content_type, (void *)strdup(userAccountAnalyticsTopVideoPins_CONTENTTYPE_ToString(
        valueQuery_content_type)));
        list_addElement(localVarQueryParameters,keyPairQuery_content_type);
    }

    // query parameters
    char *keyQuery_source = NULL;
    pinterest_rest_api_userAccountAnalyticsTopVideoPins_source_e valueQuery_source ;
    keyValuePair_t *keyPairQuery_source = 0;
    if (source)
    {
        keyQuery_source = strdup("source");
        valueQuery_source = (source);
        keyPairQuery_source = keyValuePair_create(keyQuery_source, (void *)strdup(userAccountAnalyticsTopVideoPins_SOURCE_ToString(
        valueQuery_source)));
        list_addElement(localVarQueryParameters,keyPairQuery_source);
    }

    // query parameters
    if (metric_types)
    {
        list_addElement(localVarQueryParameters,metric_types);
    }

    // query parameters
    char *keyQuery_num_of_pins = NULL;
    char * valueQuery_num_of_pins = NULL;
    keyValuePair_t *keyPairQuery_num_of_pins = 0;
    if (num_of_pins)
    {
        keyQuery_num_of_pins = strdup("num_of_pins");
        valueQuery_num_of_pins = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_num_of_pins, MAX_NUMBER_LENGTH, "%d", *num_of_pins);
        keyPairQuery_num_of_pins = keyValuePair_create(keyQuery_num_of_pins, valueQuery_num_of_pins);
        list_addElement(localVarQueryParameters,keyPairQuery_num_of_pins);
    }

    // query parameters
    char *keyQuery_created_in_last_n_days = NULL;
    char * valueQuery_created_in_last_n_days = NULL;
    keyValuePair_t *keyPairQuery_created_in_last_n_days = 0;
    if (created_in_last_n_days)
    {
        keyQuery_created_in_last_n_days = strdup("created_in_last_n_days");
        valueQuery_created_in_last_n_days = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_created_in_last_n_days, MAX_NUMBER_LENGTH, "%d", *created_in_last_n_days);
        keyPairQuery_created_in_last_n_days = keyValuePair_create(keyQuery_created_in_last_n_days, (void *)strdup(userAccountAnalyticsTopVideoPins_CREATEDINLASTNDAYS_ToString(
        valueQuery_created_in_last_n_days)));
        list_addElement(localVarQueryParameters,keyPairQuery_created_in_last_n_days);
    }

    // query parameters
    char *keyQuery_ad_account_id = NULL;
    char * valueQuery_ad_account_id = NULL;
    keyValuePair_t *keyPairQuery_ad_account_id = 0;
    if (ad_account_id)
    {
        keyQuery_ad_account_id = strdup("ad_account_id");
        valueQuery_ad_account_id = strdup((ad_account_id));
        keyPairQuery_ad_account_id = keyValuePair_create(keyQuery_ad_account_id, valueQuery_ad_account_id);
        list_addElement(localVarQueryParameters,keyPairQuery_ad_account_id);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Success");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","Not authorized to access the user account analytics.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *UserAccountAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    top_video_pins_analytics_response_t *elementToReturn = top_video_pins_analytics_response_parseFromJSON(UserAccountAPIlocalVarJSON);
    cJSON_Delete(UserAccountAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    if(keyQuery_start_date){
        free(keyQuery_start_date);
        keyQuery_start_date = NULL;
    }
    if(keyPairQuery_start_date){
        keyValuePair_free(keyPairQuery_start_date);
        keyPairQuery_start_date = NULL;
    }
    if(keyQuery_end_date){
        free(keyQuery_end_date);
        keyQuery_end_date = NULL;
    }
    if(keyPairQuery_end_date){
        keyValuePair_free(keyPairQuery_end_date);
        keyPairQuery_end_date = NULL;
    }
    if(keyQuery_sort_by){
        free(keyQuery_sort_by);
        keyQuery_sort_by = NULL;
    }
    if(keyPairQuery_sort_by){
        keyValuePair_free(keyPairQuery_sort_by);
        keyPairQuery_sort_by = NULL;
    }
    if(keyQuery_from_claimed_content){
        free(keyQuery_from_claimed_content);
        keyQuery_from_claimed_content = NULL;
    }
    if(keyPairQuery_from_claimed_content){
        keyValuePair_free(keyPairQuery_from_claimed_content);
        keyPairQuery_from_claimed_content = NULL;
    }
    if(keyQuery_pin_format){
        free(keyQuery_pin_format);
        keyQuery_pin_format = NULL;
    }
    if(keyPairQuery_pin_format){
        keyValuePair_free(keyPairQuery_pin_format);
        keyPairQuery_pin_format = NULL;
    }
    if(keyQuery_app_types){
        free(keyQuery_app_types);
        keyQuery_app_types = NULL;
    }
    if(keyPairQuery_app_types){
        keyValuePair_free(keyPairQuery_app_types);
        keyPairQuery_app_types = NULL;
    }
    if(keyQuery_content_type){
        free(keyQuery_content_type);
        keyQuery_content_type = NULL;
    }
    if(keyPairQuery_content_type){
        keyValuePair_free(keyPairQuery_content_type);
        keyPairQuery_content_type = NULL;
    }
    if(keyQuery_source){
        free(keyQuery_source);
        keyQuery_source = NULL;
    }
    if(keyPairQuery_source){
        keyValuePair_free(keyPairQuery_source);
        keyPairQuery_source = NULL;
    }
    if(keyQuery_num_of_pins){
        free(keyQuery_num_of_pins);
        keyQuery_num_of_pins = NULL;
    }
    if(valueQuery_num_of_pins){
        free(valueQuery_num_of_pins);
        valueQuery_num_of_pins = NULL;
    }
    if(keyPairQuery_num_of_pins){
        keyValuePair_free(keyPairQuery_num_of_pins);
        keyPairQuery_num_of_pins = NULL;
    }
    if(keyQuery_created_in_last_n_days){
        free(keyQuery_created_in_last_n_days);
        keyQuery_created_in_last_n_days = NULL;
    }
    if(valueQuery_created_in_last_n_days){
        free(valueQuery_created_in_last_n_days);
        valueQuery_created_in_last_n_days = NULL;
    }
    if(keyPairQuery_created_in_last_n_days){
        keyValuePair_free(keyPairQuery_created_in_last_n_days);
        keyPairQuery_created_in_last_n_days = NULL;
    }
    if(keyQuery_ad_account_id){
        free(keyQuery_ad_account_id);
        keyQuery_ad_account_id = NULL;
    }
    if(valueQuery_ad_account_id){
        free(valueQuery_ad_account_id);
        valueQuery_ad_account_id = NULL;
    }
    if(keyPairQuery_ad_account_id){
        keyValuePair_free(keyPairQuery_ad_account_id);
        keyPairQuery_ad_account_id = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// List following interests
//
// Get a list of a user's following interests in one place.
//
user_account_followed_interests_200_response_t*
UserAccountAPI_userAccountFollowedInterests(apiClient_t *apiClient, char *username, char *bookmark, int *page_size)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/users/{username}/interests/follow")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/users/{username}/interests/follow");


    // Path Params
    long sizeOfPathParams_username = strlen(username)+3 + strlen("{ username }");
    if(username == NULL) {
        goto end;
    }
    char* localVarToReplace_username = malloc(sizeOfPathParams_username);
    sprintf(localVarToReplace_username, "{%s}", "username");

    localVarPath = strReplace(localVarPath, localVarToReplace_username, username);



    // query parameters
    char *keyQuery_bookmark = NULL;
    char * valueQuery_bookmark = NULL;
    keyValuePair_t *keyPairQuery_bookmark = 0;
    if (bookmark)
    {
        keyQuery_bookmark = strdup("bookmark");
        valueQuery_bookmark = strdup((bookmark));
        keyPairQuery_bookmark = keyValuePair_create(keyQuery_bookmark, valueQuery_bookmark);
        list_addElement(localVarQueryParameters,keyPairQuery_bookmark);
    }

    // query parameters
    char *keyQuery_page_size = NULL;
    char * valueQuery_page_size = NULL;
    keyValuePair_t *keyPairQuery_page_size = 0;
    if (page_size)
    {
        keyQuery_page_size = strdup("page_size");
        valueQuery_page_size = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_page_size, MAX_NUMBER_LENGTH, "%d", *page_size);
        keyPairQuery_page_size = keyValuePair_create(keyQuery_page_size, valueQuery_page_size);
        list_addElement(localVarQueryParameters,keyPairQuery_page_size);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Success");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Invalid parameters");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 401) {
    //    printf("%s\n","Authorization failed");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","User not found");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *UserAccountAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    user_account_followed_interests_200_response_t *elementToReturn = user_account_followed_interests_200_response_parseFromJSON(UserAccountAPIlocalVarJSON);
    cJSON_Delete(UserAccountAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_username);
    if(keyQuery_bookmark){
        free(keyQuery_bookmark);
        keyQuery_bookmark = NULL;
    }
    if(valueQuery_bookmark){
        free(valueQuery_bookmark);
        valueQuery_bookmark = NULL;
    }
    if(keyPairQuery_bookmark){
        keyValuePair_free(keyPairQuery_bookmark);
        keyPairQuery_bookmark = NULL;
    }
    if(keyQuery_page_size){
        free(keyQuery_page_size);
        keyQuery_page_size = NULL;
    }
    if(valueQuery_page_size){
        free(valueQuery_page_size);
        valueQuery_page_size = NULL;
    }
    if(keyPairQuery_page_size){
        keyValuePair_free(keyPairQuery_page_size);
        keyPairQuery_page_size = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get user account
//
// Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/getting-started/using-business-access/'>Understanding Business Access</a> for more information.
//
account_t*
UserAccountAPI_userAccountGet(apiClient_t *apiClient, char *ad_account_id)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/user_account")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/user_account");




    // query parameters
    char *keyQuery_ad_account_id = NULL;
    char * valueQuery_ad_account_id = NULL;
    keyValuePair_t *keyPairQuery_ad_account_id = 0;
    if (ad_account_id)
    {
        keyQuery_ad_account_id = strdup("ad_account_id");
        valueQuery_ad_account_id = strdup((ad_account_id));
        keyPairQuery_ad_account_id = keyValuePair_create(keyQuery_ad_account_id, valueQuery_ad_account_id);
        list_addElement(localVarQueryParameters,keyPairQuery_ad_account_id);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","response");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","Not authorized to access the user account.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *UserAccountAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    account_t *elementToReturn = account_parseFromJSON(UserAccountAPIlocalVarJSON);
    cJSON_Delete(UserAccountAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    if(keyQuery_ad_account_id){
        free(keyQuery_ad_account_id);
        keyQuery_ad_account_id = NULL;
    }
    if(valueQuery_ad_account_id){
        free(valueQuery_ad_account_id);
        valueQuery_ad_account_id = NULL;
    }
    if(keyPairQuery_ad_account_id){
        keyValuePair_free(keyPairQuery_ad_account_id);
        keyPairQuery_ad_account_id = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// List following
//
// Get a list of who a certain user follows.
//
user_following_get_200_response_t*
UserAccountAPI_userFollowingGet(apiClient_t *apiClient, char *bookmark, int *page_size, pinterest_rest_api_userFollowingGet_feed_type_e feed_type, int *explicit_following, char *ad_account_id)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/user_account/following")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/user_account/following");




    // query parameters
    char *keyQuery_bookmark = NULL;
    char * valueQuery_bookmark = NULL;
    keyValuePair_t *keyPairQuery_bookmark = 0;
    if (bookmark)
    {
        keyQuery_bookmark = strdup("bookmark");
        valueQuery_bookmark = strdup((bookmark));
        keyPairQuery_bookmark = keyValuePair_create(keyQuery_bookmark, valueQuery_bookmark);
        list_addElement(localVarQueryParameters,keyPairQuery_bookmark);
    }

    // query parameters
    char *keyQuery_page_size = NULL;
    char * valueQuery_page_size = NULL;
    keyValuePair_t *keyPairQuery_page_size = 0;
    if (page_size)
    {
        keyQuery_page_size = strdup("page_size");
        valueQuery_page_size = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_page_size, MAX_NUMBER_LENGTH, "%d", *page_size);
        keyPairQuery_page_size = keyValuePair_create(keyQuery_page_size, valueQuery_page_size);
        list_addElement(localVarQueryParameters,keyPairQuery_page_size);
    }

    // query parameters
    char *keyQuery_feed_type = NULL;
    pinterest_rest_api_userFollowingGet_feed_type_e valueQuery_feed_type ;
    keyValuePair_t *keyPairQuery_feed_type = 0;
    if (feed_type)
    {
        keyQuery_feed_type = strdup("feed_type");
        valueQuery_feed_type = (feed_type);
        keyPairQuery_feed_type = keyValuePair_create(keyQuery_feed_type, (void *)strdup(userFollowingGet__ToString(
        valueQuery_feed_type)));
        list_addElement(localVarQueryParameters,keyPairQuery_feed_type);
    }

    // query parameters
    char *keyQuery_explicit_following = NULL;
    char * valueQuery_explicit_following = NULL;
    keyValuePair_t *keyPairQuery_explicit_following = 0;
    if (explicit_following)
    {
        keyQuery_explicit_following = strdup("explicit_following");
        valueQuery_explicit_following = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_explicit_following, MAX_NUMBER_LENGTH, "%d", *explicit_following);
        keyPairQuery_explicit_following = keyValuePair_create(keyQuery_explicit_following, valueQuery_explicit_following);
        list_addElement(localVarQueryParameters,keyPairQuery_explicit_following);
    }

    // query parameters
    char *keyQuery_ad_account_id = NULL;
    char * valueQuery_ad_account_id = NULL;
    keyValuePair_t *keyPairQuery_ad_account_id = 0;
    if (ad_account_id)
    {
        keyQuery_ad_account_id = strdup("ad_account_id");
        valueQuery_ad_account_id = strdup((ad_account_id));
        keyPairQuery_ad_account_id = keyValuePair_create(keyQuery_ad_account_id, valueQuery_ad_account_id);
        list_addElement(localVarQueryParameters,keyPairQuery_ad_account_id);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","response");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *UserAccountAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    user_following_get_200_response_t *elementToReturn = user_following_get_200_response_parseFromJSON(UserAccountAPIlocalVarJSON);
    cJSON_Delete(UserAccountAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    if(keyQuery_bookmark){
        free(keyQuery_bookmark);
        keyQuery_bookmark = NULL;
    }
    if(valueQuery_bookmark){
        free(valueQuery_bookmark);
        valueQuery_bookmark = NULL;
    }
    if(keyPairQuery_bookmark){
        keyValuePair_free(keyPairQuery_bookmark);
        keyPairQuery_bookmark = NULL;
    }
    if(keyQuery_page_size){
        free(keyQuery_page_size);
        keyQuery_page_size = NULL;
    }
    if(valueQuery_page_size){
        free(valueQuery_page_size);
        valueQuery_page_size = NULL;
    }
    if(keyPairQuery_page_size){
        keyValuePair_free(keyPairQuery_page_size);
        keyPairQuery_page_size = NULL;
    }
    if(keyQuery_feed_type){
        free(keyQuery_feed_type);
        keyQuery_feed_type = NULL;
    }
    if(keyPairQuery_feed_type){
        keyValuePair_free(keyPairQuery_feed_type);
        keyPairQuery_feed_type = NULL;
    }
    if(keyQuery_explicit_following){
        free(keyQuery_explicit_following);
        keyQuery_explicit_following = NULL;
    }
    if(valueQuery_explicit_following){
        free(valueQuery_explicit_following);
        valueQuery_explicit_following = NULL;
    }
    if(keyPairQuery_explicit_following){
        keyValuePair_free(keyPairQuery_explicit_following);
        keyPairQuery_explicit_following = NULL;
    }
    if(keyQuery_ad_account_id){
        free(keyQuery_ad_account_id);
        keyQuery_ad_account_id = NULL;
    }
    if(valueQuery_ad_account_id){
        free(valueQuery_ad_account_id);
        valueQuery_ad_account_id = NULL;
    }
    if(keyPairQuery_ad_account_id){
        keyValuePair_free(keyPairQuery_ad_account_id);
        keyPairQuery_ad_account_id = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get user websites
//
// Get user websites, claimed or not
//
user_websites_get_200_response_t*
UserAccountAPI_userWebsitesGet(apiClient_t *apiClient, char *bookmark, int *page_size)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/user_account/websites")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/user_account/websites");




    // query parameters
    char *keyQuery_bookmark = NULL;
    char * valueQuery_bookmark = NULL;
    keyValuePair_t *keyPairQuery_bookmark = 0;
    if (bookmark)
    {
        keyQuery_bookmark = strdup("bookmark");
        valueQuery_bookmark = strdup((bookmark));
        keyPairQuery_bookmark = keyValuePair_create(keyQuery_bookmark, valueQuery_bookmark);
        list_addElement(localVarQueryParameters,keyPairQuery_bookmark);
    }

    // query parameters
    char *keyQuery_page_size = NULL;
    char * valueQuery_page_size = NULL;
    keyValuePair_t *keyPairQuery_page_size = 0;
    if (page_size)
    {
        keyQuery_page_size = strdup("page_size");
        valueQuery_page_size = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_page_size, MAX_NUMBER_LENGTH, "%d", *page_size);
        keyPairQuery_page_size = keyValuePair_create(keyQuery_page_size, valueQuery_page_size);
        list_addElement(localVarQueryParameters,keyPairQuery_page_size);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Success");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","Not authorized to access the user website list.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *UserAccountAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    user_websites_get_200_response_t *elementToReturn = user_websites_get_200_response_parseFromJSON(UserAccountAPIlocalVarJSON);
    cJSON_Delete(UserAccountAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    if(keyQuery_bookmark){
        free(keyQuery_bookmark);
        keyQuery_bookmark = NULL;
    }
    if(valueQuery_bookmark){
        free(valueQuery_bookmark);
        valueQuery_bookmark = NULL;
    }
    if(keyPairQuery_bookmark){
        keyValuePair_free(keyPairQuery_bookmark);
        keyPairQuery_bookmark = NULL;
    }
    if(keyQuery_page_size){
        free(keyQuery_page_size);
        keyQuery_page_size = NULL;
    }
    if(valueQuery_page_size){
        free(valueQuery_page_size);
        valueQuery_page_size = NULL;
    }
    if(keyPairQuery_page_size){
        keyValuePair_free(keyPairQuery_page_size);
        keyPairQuery_page_size = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Verify website
//
// Verify a website as a signed-in user.
//
user_website_summary_t*
UserAccountAPI_verifyWebsiteUpdate(apiClient_t *apiClient, user_website_verify_request_t *user_website_verify_request, char *ad_account_id)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/user_account/websites")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/user_account/websites");




    // query parameters
    char *keyQuery_ad_account_id = NULL;
    char * valueQuery_ad_account_id = NULL;
    keyValuePair_t *keyPairQuery_ad_account_id = 0;
    if (ad_account_id)
    {
        keyQuery_ad_account_id = strdup("ad_account_id");
        valueQuery_ad_account_id = strdup((ad_account_id));
        keyPairQuery_ad_account_id = keyValuePair_create(keyQuery_ad_account_id, valueQuery_ad_account_id);
        list_addElement(localVarQueryParameters,keyPairQuery_ad_account_id);
    }

    // Body Param
    cJSON *localVarSingleItemJSON_user_website_verify_request = NULL;
    if (user_website_verify_request != NULL)
    {
        //string
        localVarSingleItemJSON_user_website_verify_request = user_website_verify_request_convertToJSON(user_website_verify_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_user_website_verify_request);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"application/json"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Success");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *UserAccountAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    user_website_summary_t *elementToReturn = user_website_summary_parseFromJSON(UserAccountAPIlocalVarJSON);
    cJSON_Delete(UserAccountAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    if (localVarSingleItemJSON_user_website_verify_request) {
        cJSON_Delete(localVarSingleItemJSON_user_website_verify_request);
        localVarSingleItemJSON_user_website_verify_request = NULL;
    }
    free(localVarBodyParameters);
    if(keyQuery_ad_account_id){
        free(keyQuery_ad_account_id);
        keyQuery_ad_account_id = NULL;
    }
    if(valueQuery_ad_account_id){
        free(valueQuery_ad_account_id);
        valueQuery_ad_account_id = NULL;
    }
    if(keyPairQuery_ad_account_id){
        keyValuePair_free(keyPairQuery_ad_account_id);
        keyPairQuery_ad_account_id = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get user verification code for website claiming
//
// Get verification code for user to install on the website to claim it.
//
user_website_verification_code_t*
UserAccountAPI_websiteVerificationGet(apiClient_t *apiClient, char *ad_account_id)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/user_account/websites/verification")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/user_account/websites/verification");




    // query parameters
    char *keyQuery_ad_account_id = NULL;
    char * valueQuery_ad_account_id = NULL;
    keyValuePair_t *keyPairQuery_ad_account_id = 0;
    if (ad_account_id)
    {
        keyQuery_ad_account_id = strdup("ad_account_id");
        valueQuery_ad_account_id = strdup((ad_account_id));
        keyPairQuery_ad_account_id = keyValuePair_create(keyQuery_ad_account_id, valueQuery_ad_account_id);
        list_addElement(localVarQueryParameters,keyPairQuery_ad_account_id);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Success");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","Not authorized to access the user verification code for website claiming.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *UserAccountAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    user_website_verification_code_t *elementToReturn = user_website_verification_code_parseFromJSON(UserAccountAPIlocalVarJSON);
    cJSON_Delete(UserAccountAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    if(keyQuery_ad_account_id){
        free(keyQuery_ad_account_id);
        keyQuery_ad_account_id = NULL;
    }
    if(valueQuery_ad_account_id){
        free(valueQuery_ad_account_id);
        valueQuery_ad_account_id = NULL;
    }
    if(keyPairQuery_ad_account_id){
        keyValuePair_free(keyPairQuery_ad_account_id);
        keyPairQuery_ad_account_id = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

