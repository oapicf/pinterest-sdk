
/*
 * TargetingSpec.h
 *
 * Ad group targeting specification defining the ad group target audience. For example, &#x60;{\&quot;APPTYPE\&quot;:[\&quot;iphone\&quot;], \&quot;GENDER\&quot;:[\&quot;male\&quot;], \&quot;LOCALE\&quot;:[\&quot;en-US\&quot;], \&quot;LOCATION\&quot;:[\&quot;501\&quot;], \&quot;MINIMUM_AGE\&quot;:\&quot;18\&quot;, \&quot;MAXIMUM_AGE\&quot;:\&quot;65+\&quot;}&#x60;
 */

#ifndef TINY_CPP_CLIENT_TargetingSpec_H_
#define TINY_CPP_CLIENT_TargetingSpec_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "TargetingSpecAgeBucket.h"
#include "TargetingSpecAppType.h"
#include "TargetingSpecGender.h"
#include "TargetingSpecShoppingRetargeting.h"
#include <list>

namespace Tiny {


/*! \brief Ad group targeting specification defining the ad group target audience. For example, `{\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"MINIMUM_AGE\":\"18\", \"MAXIMUM_AGE\":\"65+\"}`
 *
 *  \ingroup Models
 *
 */

class TargetingSpec{
public:

    /*! \brief Constructor.
	 */
    TargetingSpec();
    TargetingSpec(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TargetingSpec();


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
	/*! \brief Get Region codes or postal codes to include for targeting.<br /><br /> Region codes represent broader geographical areas. Example: <code>US-CA</code> is the region code for California in the United States.<br /><br /> Postal codes represent more granular, specific areas. Example: <code>94103</code> is a postal code for a specifc area in San Francisco, California, U.S.A.<br /><br /> For each ad group, use only one of these methods, depending on which fits your targeting needs. Do not use both. For example, either specify a broader region code like <code>US-CA</code> or a more granular postal code within that regon, such as <code>94103</code>.<br /><br /> You can specify multiple region codes or postal codes in an array, depending on which method you choose.<br /><br /> Precede a region code array with the <code>region_codes</code> key and a postal code value with the <code>postal_codes</code> key. Examples:<br /><br /> <code>\"geo\": {</code><br /> <code>\"region_codes\": [\"US-CA\"]</code><br /> <code>}</code><br /><br /> <code>\"geo\": {</code><br /> <code>\"postal_codes\": [\"94103\"]</code><br /> <code>}</code><br /><br /> For each ad group, specify at least one <code>GEO</code> or <code>LOCATION</code>. <br /><br /> If you do not specifiy a <code>GEO</code> code, only <code>LOCATION</code> values will be targeted (See <code>LOCATION</code> parameter in this targeting spec.).<br /><br /> Learn how to <a href=\"/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones\" target=\"_blank\">get a current, complete list of codes</a>.
	 */
	std::list<std::string> getGEO();

	/*! \brief Set Region codes or postal codes to include for targeting.<br /><br /> Region codes represent broader geographical areas. Example: <code>US-CA</code> is the region code for California in the United States.<br /><br /> Postal codes represent more granular, specific areas. Example: <code>94103</code> is a postal code for a specifc area in San Francisco, California, U.S.A.<br /><br /> For each ad group, use only one of these methods, depending on which fits your targeting needs. Do not use both. For example, either specify a broader region code like <code>US-CA</code> or a more granular postal code within that regon, such as <code>94103</code>.<br /><br /> You can specify multiple region codes or postal codes in an array, depending on which method you choose.<br /><br /> Precede a region code array with the <code>region_codes</code> key and a postal code value with the <code>postal_codes</code> key. Examples:<br /><br /> <code>\"geo\": {</code><br /> <code>\"region_codes\": [\"US-CA\"]</code><br /> <code>}</code><br /><br /> <code>\"geo\": {</code><br /> <code>\"postal_codes\": [\"94103\"]</code><br /> <code>}</code><br /><br /> For each ad group, specify at least one <code>GEO</code> or <code>LOCATION</code>. <br /><br /> If you do not specifiy a <code>GEO</code> code, only <code>LOCATION</code> values will be targeted (See <code>LOCATION</code> parameter in this targeting spec.).<br /><br /> Learn how to <a href=\"/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones\" target=\"_blank\">get a current, complete list of codes</a>.
	 */
	void setGEO(std::list<std::string> gEO);
	/*! \brief Get Region codes or postal codes to exclude from the targeting inclusion area.<br /><br /> See <code>GEO</code> parameter in this targeting spec for rules, syntax, and other information.<br />
	 */
	std::list<std::string> getGEOEXCLUDE();

	/*! \brief Set Region codes or postal codes to exclude from the targeting inclusion area.<br /><br /> See <code>GEO</code> parameter in this targeting spec for rules, syntax, and other information.<br />
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
	/*! \brief Get Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to include for targeting.<br /><br /> Precede country code values with the <code>country_codes</code> key and metro code values with <code>metro_codes</code> key. Example:<br /><br /> <code>\"location\": {</code><br /> <code>\"country_codes\": [\"US\", \"CA\"],</code><br /> <code>\"metro_codes\": [\"501\", \"602\"]</code><br /> <code>}</code><br /><br /> For each ad group, specify at least one <code>GEO</code> or <code>LOCATION</code> code. <br /><br /> If you do not specify a <code>LOCATION</code> code, only <code>GEO</code> values will be targeted (See <code>GEO</code> parameter in this targeting spec.).<br /><br /> Learn how to <a href=\"/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones\" target=\"_blank\">get a current, complete list of codes</a>.
	 */
	std::list<std::string> getLOCATION();

	/*! \brief Set Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to include for targeting.<br /><br /> Precede country code values with the <code>country_codes</code> key and metro code values with <code>metro_codes</code> key. Example:<br /><br /> <code>\"location\": {</code><br /> <code>\"country_codes\": [\"US\", \"CA\"],</code><br /> <code>\"metro_codes\": [\"501\", \"602\"]</code><br /> <code>}</code><br /><br /> For each ad group, specify at least one <code>GEO</code> or <code>LOCATION</code> code. <br /><br /> If you do not specify a <code>LOCATION</code> code, only <code>GEO</code> values will be targeted (See <code>GEO</code> parameter in this targeting spec.).<br /><br /> Learn how to <a href=\"/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones\" target=\"_blank\">get a current, complete list of codes</a>.
	 */
	void setLOCATION(std::list<std::string> lOCATION);
	/*! \brief Get Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to exclude from targeting.<br /><br /> See <code>LOCATION</code> parameter in this targeting spec for rules, syntax, and other information.
	 */
	std::list<std::string> getLOCATIONEXCLUDE();

	/*! \brief Set Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to exclude from targeting.<br /><br /> See <code>LOCATION</code> parameter in this targeting spec for rules, syntax, and other information.
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
	std::list<std::string> getTARGETINGSTRATEGY();

	/*! \brief Set 
	 */
	void setTARGETINGSTRATEGY(std::list<std::string> tARGETING_STRATEGY);


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
    std::list<std::string> tARGETING_STRATEGY;
};
}

#endif /* TINY_CPP_CLIENT_TargetingSpec_H_ */
