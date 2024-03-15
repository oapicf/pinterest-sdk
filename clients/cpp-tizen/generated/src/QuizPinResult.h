/*
 * QuizPinResult.h
 *
 * The result, and link out, based on the user’s choice.
 */

#ifndef _QuizPinResult_H_
#define _QuizPinResult_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The result, and link out, based on the user’s choice.
 *
 *  \ingroup Models
 *
 */

class QuizPinResult : public Object {
public:
	/*! \brief Constructor.
	 */
	QuizPinResult();
	QuizPinResult(char* str);

	/*! \brief Destructor.
	 */
	virtual ~QuizPinResult();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getOrganicPinId();

	/*! \brief Set 
	 */
	void setOrganicPinId(std::string  organic_pin_id);
	/*! \brief Get 
	 */
	std::string getAndroidDeepLink();

	/*! \brief Set 
	 */
	void setAndroidDeepLink(std::string  android_deep_link);
	/*! \brief Get 
	 */
	std::string getIosDeepLink();

	/*! \brief Set 
	 */
	void setIosDeepLink(std::string  ios_deep_link);
	/*! \brief Get 
	 */
	std::string getDestinationUrl();

	/*! \brief Set 
	 */
	void setDestinationUrl(std::string  destination_url);
	/*! \brief Get 
	 */
	long long getResultId();

	/*! \brief Set 
	 */
	void setResultId(long long  result_id);

private:
	std::string organic_pin_id;
	std::string android_deep_link;
	std::string ios_deep_link;
	std::string destination_url;
	long long result_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _QuizPinResult_H_ */
