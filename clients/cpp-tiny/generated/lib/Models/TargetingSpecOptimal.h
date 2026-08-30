
/*
 * TargetingSpecOptimal.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_TargetingSpecOptimal_H_
#define TINY_CPP_CLIENT_TargetingSpecOptimal_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "TargetingSpecAgeBucket.h"
#include "TargetingSpecAppType.h"
#include "TargetingSpecGender.h"
#include "TargetingSpecShoppingRetargeting.h"
#include "TargetingStrategy.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class TargetingSpecOptimal{
public:

    /*! \brief Constructor.
	 */
    TargetingSpecOptimal();
    TargetingSpecOptimal(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TargetingSpecOptimal();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get **Legacy field.** Predefined age ranges. We recommend using MINIMUM_AGE and MAXIMUM_AGE instead for more flexible targeting. Cannot be combined with MINIMUM_AGE/MAXIMUM_AGE. If neither AGE_BUCKET nor MINIMUM_AGE/MAXIMUM_AGE are specified, all ages will be targeted.
	 */
	std::list<TargetingSpecAgeBucket> getAGEBUCKET();

	/*! \brief Set **Legacy field.** Predefined age ranges. We recommend using MINIMUM_AGE and MAXIMUM_AGE instead for more flexible targeting. Cannot be combined with MINIMUM_AGE/MAXIMUM_AGE. If neither AGE_BUCKET nor MINIMUM_AGE/MAXIMUM_AGE are specified, all ages will be targeted.
	 */
	void setAGEBUCKET(std::list<TargetingSpecAgeBucket> aGE_BUCKET);
	/*! \brief Get Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted.
	 */
	std::list<TargetingSpecAppType> getAPPTYPE();

	/*! \brief Set Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted.
	 */
	void setAPPTYPE(std::list<TargetingSpecAppType> aPPTYPE);
	/*! \brief Get Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\"2542620905475\"]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**.
	 */
	std::list<std::string> getAUDIENCEEXCLUDE();

	/*! \brief Set Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\"2542620905475\"]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**.
	 */
	void setAUDIENCEEXCLUDE(std::list<std::string> aUDIENCE_EXCLUDE);
	/*! \brief Get Targeted customer list IDs. For example: [\"2542620905473\"]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**.
	 */
	std::list<std::string> getAUDIENCEINCLUDE();

	/*! \brief Set Targeted customer list IDs. For example: [\"2542620905473\"]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**.
	 */
	void setAUDIENCEINCLUDE(std::list<std::string> aUDIENCE_INCLUDE);
	/*! \brief Get Targeted genders. Values: [\"unknown\",\"male\",\"female\"]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**.
	 */
	std::list<TargetingSpecGender> getGENDER();

	/*! \brief Set Targeted genders. Values: [\"unknown\",\"male\",\"female\"]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**.
	 */
	void setGENDER(std::list<TargetingSpecGender> gENDER);
	/*! \brief Get Region codes or postal codes to include for targeting.  Region codes represent broader geographical areas. Example: `US-CA` is the region code for California in the United States.  Postal codes represent more granular, specific areas. Example: `94103` is a postal code for a specifc area in San Francisco, California, U.S.A.  For each ad group, use only one of these methods, depending on which fits your targeting needs. Do not use both. For example, either specify a broader region code like `US-CA` or a more granular postal code within that regon, such as `94103`.  You can specify multiple region codes or postal codes in an array, depending on which method you choose.  Precede a region code array with the `region_codes` key and a postal code value with the `postal_codes` key. Examples:  ``` \"geo\": {   \"region_codes\": [\"US-CA\"] } ```  ``` \"geo\": {   \"postal_codes\": [\"94103\"] } ```  For each ad group, specify at least one `GEO` or `LOCATION`.  If you do not specifiy a `GEO` code, only `LOCATION` values will be targeted (See `LOCATION` parameter in this targeting spec.).  Learn how to [get a current, complete list of codes](/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones).
	 */
	std::list<std::string> getGEO();

	/*! \brief Set Region codes or postal codes to include for targeting.  Region codes represent broader geographical areas. Example: `US-CA` is the region code for California in the United States.  Postal codes represent more granular, specific areas. Example: `94103` is a postal code for a specifc area in San Francisco, California, U.S.A.  For each ad group, use only one of these methods, depending on which fits your targeting needs. Do not use both. For example, either specify a broader region code like `US-CA` or a more granular postal code within that regon, such as `94103`.  You can specify multiple region codes or postal codes in an array, depending on which method you choose.  Precede a region code array with the `region_codes` key and a postal code value with the `postal_codes` key. Examples:  ``` \"geo\": {   \"region_codes\": [\"US-CA\"] } ```  ``` \"geo\": {   \"postal_codes\": [\"94103\"] } ```  For each ad group, specify at least one `GEO` or `LOCATION`.  If you do not specifiy a `GEO` code, only `LOCATION` values will be targeted (See `LOCATION` parameter in this targeting spec.).  Learn how to [get a current, complete list of codes](/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones).
	 */
	void setGEO(std::list<std::string> gEO);
	/*! \brief Get [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Region codes or postal codes to exclude from the targeting inclusion area.  See `GEO` parameter in this targeting spec for rules, syntax, and other information.
	 */
	std::list<std::string> getGEOEXCLUDE();

	/*! \brief Set [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Region codes or postal codes to exclude from the targeting inclusion area.  See `GEO` parameter in this targeting spec for rules, syntax, and other information.
	 */
	void setGEOEXCLUDE(std::list<std::string> gEO_EXCLUDE);
	/*! \brief Get Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**.
	 */
	std::list<std::string> getINTEREST();

	/*! \brief Set Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**.
	 */
	void setINTEREST(std::list<std::string> iNTEREST);
	/*! \brief Get 24 ISO 639-1 two-letter language codes. If the LOCALE field is not included in the request, all languages are targeted.
	 */
	std::list<std::string> getLOCALE();

	/*! \brief Set 24 ISO 639-1 two-letter language codes. If the LOCALE field is not included in the request, all languages are targeted.
	 */
	void setLOCALE(std::list<std::string> lOCALE);
	/*! \brief Get Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to include for targeting.  Precede country code values with the `country_codes` key and metro code values with `metro_codes` key. Example:  ``` \"location\": {   \"country_codes\": [\"US\", \"CA\"],   \"metro_codes\": [\"501\", \"602\"] } ```  For each ad group, specify at least one `GEO` or `LOCATION` code.  If you do not specify a `LOCATION` code, only `GEO` values will be targeted (See `GEO` parameter in this targeting spec.).  Learn how to [get a current, complete list of codes](/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones).
	 */
	std::list<std::string> getLOCATION();

	/*! \brief Set Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to include for targeting.  Precede country code values with the `country_codes` key and metro code values with `metro_codes` key. Example:  ``` \"location\": {   \"country_codes\": [\"US\", \"CA\"],   \"metro_codes\": [\"501\", \"602\"] } ```  For each ad group, specify at least one `GEO` or `LOCATION` code.  If you do not specify a `LOCATION` code, only `GEO` values will be targeted (See `GEO` parameter in this targeting spec.).  Learn how to [get a current, complete list of codes](/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones).
	 */
	void setLOCATION(std::list<std::string> lOCATION);
	/*! \brief Get [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to exclude from targeting.  See `LOCATION` parameter in this targeting spec for rules, syntax, and other information.
	 */
	std::list<std::string> getLOCATIONEXCLUDE();

	/*! \brief Set [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to exclude from targeting.  See `LOCATION` parameter in this targeting spec for rules, syntax, and other information.
	 */
	void setLOCATIONEXCLUDE(std::list<std::string> lOCATION_EXCLUDE);
	/*! \brief Get Maximum age to target (inclusive). Values: \"18\", \"19\", ..., \"65\", \"65+\". Must be used together with `MINIMUM_AGE`. Cannot be combined with `AGE_BUCKET`. If neither `MINIMUM_AGE`/`MAXIMUM_AGE` nor `AGE_BUCKET` are specified, all ages will be targeted.
	 */
	std::string getMAXIMUMAGE();

	/*! \brief Set Maximum age to target (inclusive). Values: \"18\", \"19\", ..., \"65\", \"65+\". Must be used together with `MINIMUM_AGE`. Cannot be combined with `AGE_BUCKET`. If neither `MINIMUM_AGE`/`MAXIMUM_AGE` nor `AGE_BUCKET` are specified, all ages will be targeted.
	 */
	void setMAXIMUMAGE(std::string mAXIMUM_AGE);
	/*! \brief Get Minimum age to target (inclusive). Values: \"18\", \"19\", ..., \"65\". Note: 65+ is not allowed for minimum age. Must be used together with `MAXIMUM_AGE`. Cannot be combined with `AGE_BUCKET`. If neither `MINIMUM_AGE`/`MAXIMUM_AGE` nor `AGE_BUCKET` are specified, all ages will be targeted.
	 */
	std::string getMINIMUMAGE();

	/*! \brief Set Minimum age to target (inclusive). Values: \"18\", \"19\", ..., \"65\". Note: 65+ is not allowed for minimum age. Must be used together with `MAXIMUM_AGE`. Cannot be combined with `AGE_BUCKET`. If neither `MINIMUM_AGE`/`MAXIMUM_AGE` nor `AGE_BUCKET` are specified, all ages will be targeted.
	 */
	void setMINIMUMAGE(std::string mINIMUM_AGE);
	/*! \brief Get Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting
	 */
	std::list<TargetingSpecShoppingRetargeting> getSHOPPINGRETARGETING();

	/*! \brief Set Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting
	 */
	void setSHOPPINGRETARGETING(std::list<TargetingSpecShoppingRetargeting> sHOPPING_RETARGETING);
	/*! \brief Get 
	 */
	std::list<TargetingStrategy> getTARGETINGSTRATEGY();

	/*! \brief Set 
	 */
	void setTARGETINGSTRATEGY(std::list<TargetingStrategy> tARGETING_STRATEGY);


    private:
    std::list<TargetingSpecAgeBucket> aGE_BUCKET;
    std::list<TargetingSpecAppType> aPPTYPE;
    std::list<std::string> aUDIENCE_EXCLUDE;
    std::list<std::string> aUDIENCE_INCLUDE;
    std::list<TargetingSpecGender> gENDER;
    std::list<std::string> gEO;
    std::list<std::string> gEO_EXCLUDE;
    std::list<std::string> iNTEREST;
    std::list<std::string> lOCALE;
    std::list<std::string> lOCATION;
    std::list<std::string> lOCATION_EXCLUDE;
    std::string mAXIMUM_AGE{};
    std::string mINIMUM_AGE{};
    std::list<TargetingSpecShoppingRetargeting> sHOPPING_RETARGETING;
    std::list<TargetingStrategy> tARGETING_STRATEGY;
};
}

#endif /* TINY_CPP_CLIENT_TargetingSpecOptimal_H_ */
