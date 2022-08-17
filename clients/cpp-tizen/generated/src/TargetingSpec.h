/*
 * TargetingSpec.h
 *
 * Ad group targeting specification defining the ad group target audience. For example, {\&quot;APPTYPE\&quot;:[\&quot;iphone\&quot;], \&quot;GENDER\&quot;:[\&quot;male\&quot;], \&quot;LOCALE\&quot;:[\&quot;en-US\&quot;], \&quot;LOCATION\&quot;:[\&quot;501\&quot;], \&quot;AGE_BUCKET\&quot;:[\&quot;25-34\&quot;]}
 */

#ifndef _TargetingSpec_H_
#define _TargetingSpec_H_


#include <string>
#include "TargetingSpec_SHOPPING_RETARGETING_1_inner.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ad group targeting specification defining the ad group target audience. For example, {\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"AGE_BUCKET\":[\"25-34\"]}
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

	/*! \brief Get Age ranges
	 */
	std::list<std::string> getAGEBUCKET();

	/*! \brief Set Age ranges
	 */
	void setAGEBUCKET(std::list <std::string> aGE_BUCKET);
	/*! \brief Get Allowed devices
	 */
	std::list<std::string> getAPPTYPE();

	/*! \brief Set Allowed devices
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
	/*! \brief Get Location region codes, e.g., \"BE-VOV\" (East Flanders, Belgium) For complete list, click here or postal codes, e.g., \"US-94107\". Use either region codes or postal codes but not both.
	 */
	std::list<std::string> getGEO();

	/*! \brief Set Location region codes, e.g., \"BE-VOV\" (East Flanders, Belgium) For complete list, click here or postal codes, e.g., \"US-94107\". Use either region codes or postal codes but not both.
	 */
	void setGEO(std::list <std::string> gEO);
	/*! \brief Get Array of interest object IDs.
	 */
	std::list<std::string> getINTEREST();

	/*! \brief Set Array of interest object IDs.
	 */
	void setINTEREST(std::list <std::string> iNTEREST);
	/*! \brief Get 24 ISO 639-1 two letter language codes.
	 */
	std::list<std::string> getLOCALE();

	/*! \brief Set 24 ISO 639-1 two letter language codes.
	 */
	void setLOCALE(std::list <std::string> lOCALE);
	/*! \brief Get 22 ISO Alpha 2 two letter country codes or US Nielsen DMA (Designated Market Area) codes (location region codes) (e.g., [\"US\", \"807\"]). For complete list, click here. Location-Country and Location-Metro codes apply.
	 */
	std::list<std::string> getLOCATION();

	/*! \brief Set 22 ISO Alpha 2 two letter country codes or US Nielsen DMA (Designated Market Area) codes (location region codes) (e.g., [\"US\", \"807\"]). For complete list, click here. Location-Country and Location-Metro codes apply.
	 */
	void setLOCATION(std::list <std::string> lOCATION);
	/*! \brief Get Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting
	 */
	std::list<TargetingSpec_SHOPPING_RETARGETING_1_inner> getSHOPPINGRETARGETING();

	/*! \brief Set Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting
	 */
	void setSHOPPINGRETARGETING(std::list <TargetingSpec_SHOPPING_RETARGETING_1_inner> sHOPPING_RETARGETING);
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
	std::list <TargetingSpec_SHOPPING_RETARGETING_1_inner>sHOPPING_RETARGETING;
	std::list <std::string>tARGETING_STRATEGY;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TargetingSpec_H_ */
