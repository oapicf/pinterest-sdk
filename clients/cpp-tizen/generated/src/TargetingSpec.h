/*
 * TargetingSpec.h
 *
 * Ad group targeting specification defining the ad group target audience. For example, &#x60;{\&quot;APPTYPE\&quot;:[\&quot;iphone\&quot;], \&quot;GENDER\&quot;:[\&quot;male\&quot;], \&quot;LOCALE\&quot;:[\&quot;en-US\&quot;], \&quot;LOCATION\&quot;:[\&quot;501\&quot;], \&quot;AGE_BUCKET\&quot;:[\&quot;25-34\&quot;]}&#x60;
 */

#ifndef _TargetingSpec_H_
#define _TargetingSpec_H_


#include <string>
#include "TargetingSpec_SHOPPING_RETARGETING.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ad group targeting specification defining the ad group target audience. For example, `{\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"AGE_BUCKET\":[\"25-34\"]}`
 *
 *  \ingroup Models
 *
 */

class TargetingSpec : public Object {
public:
	/*! \brief Constructor.
	 */
	TargetingSpec();
	TargetingSpec(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TargetingSpec();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Age ranges. If the AGE_BUCKET field is missing, the default behavior in terms of ad delivery is that **All age buckets** will be targeted.
	 */
	std::list<std::string> getAGEBUCKET();

	/*! \brief Set Age ranges. If the AGE_BUCKET field is missing, the default behavior in terms of ad delivery is that **All age buckets** will be targeted.
	 */
	void setAGEBUCKET(std::list <std::string> aGE_BUCKET);
	/*! \brief Get Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted.
	 */
	std::list<std::string> getAPPTYPE();

	/*! \brief Set Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted.
	 */
	void setAPPTYPE(std::list <std::string> aPPTYPE);
	/*! \brief Get Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\"2542620905475\"]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**.
	 */
	std::list<std::string> getAUDIENCEEXCLUDE();

	/*! \brief Set Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\"2542620905475\"]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**.
	 */
	void setAUDIENCEEXCLUDE(std::list <std::string> aUDIENCE_EXCLUDE);
	/*! \brief Get Targeted customer list IDs. For example: [\"2542620905473\"]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**.
	 */
	std::list<std::string> getAUDIENCEINCLUDE();

	/*! \brief Set Targeted customer list IDs. For example: [\"2542620905473\"]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**.
	 */
	void setAUDIENCEINCLUDE(std::list <std::string> aUDIENCE_INCLUDE);
	/*! \brief Get Targeted genders. Values: [\"unknown\",\"male\",\"female\"]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**.
	 */
	std::list<std::string> getGENDER();

	/*! \brief Set Targeted genders. Values: [\"unknown\",\"male\",\"female\"]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**.
	 */
	void setGENDER(std::list <std::string> gENDER);
	/*! \brief Get Location region codes, e.g., \"BE-VOV\" (East Flanders, Belgium) For complete list, <a href=\"https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\" target=\"_blank\">click here</a> or postal codes, e.g., \"US-94107\". Use either region codes or postal codes but not both. At least one of LOCATION or GEO must be specified. If the GEO field is missing, then only LOCATION values will be targeted (see LOCATION field below).
	 */
	std::list<std::string> getGEO();

	/*! \brief Set Location region codes, e.g., \"BE-VOV\" (East Flanders, Belgium) For complete list, <a href=\"https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\" target=\"_blank\">click here</a> or postal codes, e.g., \"US-94107\". Use either region codes or postal codes but not both. At least one of LOCATION or GEO must be specified. If the GEO field is missing, then only LOCATION values will be targeted (see LOCATION field below).
	 */
	void setGEO(std::list <std::string> gEO);
	/*! \brief Get Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**.
	 */
	std::list<std::string> getINTEREST();

	/*! \brief Set Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**.
	 */
	void setINTEREST(std::list <std::string> iNTEREST);
	/*! \brief Get 24 ISO 639-1 two letter language codes. If the LOCALE field is missing, the default behavior in terms of ad delivery is that **All languages will be targeted, only english non-sublanguage will be targeted**.
	 */
	std::list<std::string> getLOCALE();

	/*! \brief Set 24 ISO 639-1 two letter language codes. If the LOCALE field is missing, the default behavior in terms of ad delivery is that **All languages will be targeted, only english non-sublanguage will be targeted**.
	 */
	void setLOCALE(std::list <std::string> lOCALE);
	/*! \brief Get 22 ISO Alpha 2 two letter country codes or US Nielsen DMA (Designated Market Area) codes (location region codes) (e.g., [\"US\", \"807\"]). For complete list, click here. Location-Country and Location-Metro codes apply. At least one of LOCATION or GEO must be specified. If the LOCATION field is missing, then only GEO values will be targeted (see GEO field above).
	 */
	std::list<std::string> getLOCATION();

	/*! \brief Set 22 ISO Alpha 2 two letter country codes or US Nielsen DMA (Designated Market Area) codes (location region codes) (e.g., [\"US\", \"807\"]). For complete list, click here. Location-Country and Location-Metro codes apply. At least one of LOCATION or GEO must be specified. If the LOCATION field is missing, then only GEO values will be targeted (see GEO field above).
	 */
	void setLOCATION(std::list <std::string> lOCATION);
	/*! \brief Get Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting
	 */
	std::list<TargetingSpec_SHOPPING_RETARGETING> getSHOPPINGRETARGETING();

	/*! \brief Set Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting
	 */
	void setSHOPPINGRETARGETING(std::list <TargetingSpec_SHOPPING_RETARGETING> sHOPPING_RETARGETING);
	/*! \brief Get 
	 */
	std::list<std::string> getTARGETINGSTRATEGY();

	/*! \brief Set 
	 */
	void setTARGETINGSTRATEGY(std::list <std::string> tARGETING_STRATEGY);

private:
	std::list <std::string>aGE_BUCKET;
	std::list <std::string>aPPTYPE;
	std::list <std::string>aUDIENCE_EXCLUDE;
	std::list <std::string>aUDIENCE_INCLUDE;
	std::list <std::string>gENDER;
	std::list <std::string>gEO;
	std::list <std::string>iNTEREST;
	std::list <std::string>lOCALE;
	std::list <std::string>lOCATION;
	std::list <TargetingSpec_SHOPPING_RETARGETING>sHOPPING_RETARGETING;
	std::list <std::string>tARGETING_STRATEGY;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TargetingSpec_H_ */
