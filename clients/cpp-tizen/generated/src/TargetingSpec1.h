/*
 * TargetingSpec_1.h
 *
 * Ad group targeting specification defining the ad group target audience. For example, &#39;{\&quot;APPTYPE\&quot;:[\&quot;iphone\&quot;], \&quot;GENDER\&quot;:[\&quot;male\&quot;], \&quot;LOCALE\&quot;:[\&quot;en-US\&quot;], \&quot;LOCATION\&quot;:[\&quot;501\&quot;], \&quot;AGE_BUCKET\&quot;:[\&quot;25-34\&quot;]}&#39;
 */

#ifndef _TargetingSpec_1_H_
#define _TargetingSpec_1_H_


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


/*! \brief Ad group targeting specification defining the ad group target audience. For example, '{\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"AGE_BUCKET\":[\"25-34\"]}'
 *
 *  \ingroup Models
 *
 */

class TargetingSpec_1 : public Object {
public:
	/*! \brief Constructor.
	 */
	TargetingSpec_1();
	TargetingSpec_1(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TargetingSpec_1();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Values: [\"18-24\",\"21+\",\"25-34\",\"35-44\", \"45-49\",\"50-54\",\"55-64\",\"65+\"]
	 */
	std::list<std::string> getAGEBUCKET();

	/*! \brief Set Values: [\"18-24\",\"21+\",\"25-34\",\"35-44\", \"45-49\",\"50-54\",\"55-64\",\"65+\"]
	 */
	void setAGEBUCKET(std::list <std::string> aGE_BUCKET);
	/*! \brief Get Values: [\"android_mobile\", \"android_tablet\", \"ipad\", \"iphone\", \"web\", \"web_mobile\"]
	 */
	std::list<std::string> getAPPTYPE();

	/*! \brief Set Values: [\"android_mobile\", \"android_tablet\", \"ipad\", \"iphone\", \"web\", \"web_mobile\"]
	 */
	void setAPPTYPE(std::list <std::string> aPPTYPE);
	/*! \brief Get Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\"2542620905475\"]. Audience lists need to have at least 100 people with Pinterest accounts in them.
	 */
	std::list<std::string> getAUDIENCEEXCLUDE();

	/*! \brief Set Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\"2542620905475\"]. Audience lists need to have at least 100 people with Pinterest accounts in them.
	 */
	void setAUDIENCEEXCLUDE(std::list <std::string> aUDIENCE_EXCLUDE);
	/*! \brief Get Targeted customer list IDs. For example: [\"2542620905473\"]. Audience lists need to have at least 100 people with Pinterest accounts in them
	 */
	std::list<std::string> getAUDIENCEINCLUDE();

	/*! \brief Set Targeted customer list IDs. For example: [\"2542620905473\"]. Audience lists need to have at least 100 people with Pinterest accounts in them
	 */
	void setAUDIENCEINCLUDE(std::list <std::string> aUDIENCE_INCLUDE);
	/*! \brief Get Targeted genders. Values: [\"unknown\",\"male\",\"female\"]
	 */
	std::list<std::string> getGENDER();

	/*! \brief Set Targeted genders. Values: [\"unknown\",\"male\",\"female\"]
	 */
	void setGENDER(std::list <std::string> gENDER);
	/*! \brief Get Location region codes, e.g., \"BE-VOV\" (East Flanders, Belgium) For complete list, <a href=\"https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\" target=\"_blank\">click here</a> or postal codes, e.g., \"US-94107\". Use either region codes or postal codes but not both.
	 */
	std::list<std::string> getGEO();

	/*! \brief Set Location region codes, e.g., \"BE-VOV\" (East Flanders, Belgium) For complete list, <a href=\"https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\" target=\"_blank\">click here</a> or postal codes, e.g., \"US-94107\". Use either region codes or postal codes but not both.
	 */
	void setGEO(std::list <std::string> gEO);
	/*! \brief Get <a href=\"https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875\" target=\"_blank\">Interest object IDs</a>.
	 */
	std::list<std::string> getINTEREST();

	/*! \brief Set <a href=\"https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875\" target=\"_blank\">Interest object IDs</a>.
	 */
	void setINTEREST(std::list <std::string> iNTEREST);
	/*! \brief Get 24 <a href=\"https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes\" target=\"_blank\">ISO 639-1 two letter language codes</a>. Values: [\"cs\",\"da\",\"de\",\"el\",\"en\",\"es\",\"fi\",\"fr\",\"hu\", \"id\",\"in\",\"it\",\"ja\",\"ko\",\"no\",\"pl\",\"pt\",\"ro\",\"ru\",\"sk\",\"sv\",\"tr\",\"uk\",\"zh\"]
	 */
	std::list<std::string> getLOCALE();

	/*! \brief Set 24 <a href=\"https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes\" target=\"_blank\">ISO 639-1 two letter language codes</a>. Values: [\"cs\",\"da\",\"de\",\"el\",\"en\",\"es\",\"fi\",\"fr\",\"hu\", \"id\",\"in\",\"it\",\"ja\",\"ko\",\"no\",\"pl\",\"pt\",\"ro\",\"ru\",\"sk\",\"sv\",\"tr\",\"uk\",\"zh\"]
	 */
	void setLOCALE(std::list <std::string> lOCALE);
	/*! \brief Get 22 <a href=\"https://www.nationsonline.org/oneworld/country_code_list.htm\" target=\"_blank\">ISO Alpha 2</a> two letter country codes or <a href=\"https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\" target=\"_blank\">US Nielsen DMA (Designated Market Area) codes</a> (location region codes) (e.g., [\"US\", \"807\"]). For complete list, <a href=\"https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\">click here</a>. Location-Country and Location-Metro codes apply.
	 */
	std::list<std::string> getLOCATION();

	/*! \brief Set 22 <a href=\"https://www.nationsonline.org/oneworld/country_code_list.htm\" target=\"_blank\">ISO Alpha 2</a> two letter country codes or <a href=\"https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\" target=\"_blank\">US Nielsen DMA (Designated Market Area) codes</a> (location region codes) (e.g., [\"US\", \"807\"]). For complete list, <a href=\"https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\">click here</a>. Location-Country and Location-Metro codes apply.
	 */
	void setLOCATION(std::list <std::string> lOCATION);
	/*! \brief Get 
	 */
	std::list<TargetingSpec_SHOPPING_RETARGETING> getSHOPPINGRETARGETING();

	/*! \brief Set 
	 */
	void setSHOPPINGRETARGETING(std::list <TargetingSpec_SHOPPING_RETARGETING> sHOPPING_RETARGETING);
	/*! \brief Get Values: [\"CHOOSE_YOUR_OWN\", \"FIND_NEW_CUSTOMERS\", \"RECONNECT_WITH_USERS\"]
	 */
	std::list<std::string> getTARGETINGSTRATEGY();

	/*! \brief Set Values: [\"CHOOSE_YOUR_OWN\", \"FIND_NEW_CUSTOMERS\", \"RECONNECT_WITH_USERS\"]
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

#endif /* _TargetingSpec_1_H_ */
