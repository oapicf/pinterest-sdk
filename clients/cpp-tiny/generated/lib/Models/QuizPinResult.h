
/*
 * QuizPinResult.h
 *
 * The result, and link out, based on the user’s choice.
 */

#ifndef TINY_CPP_CLIENT_QuizPinResult_H_
#define TINY_CPP_CLIENT_QuizPinResult_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The result, and link out, based on the user’s choice.
 *
 *  \ingroup Models
 *
 */

class QuizPinResult{
public:

    /*! \brief Constructor.
	 */
    QuizPinResult();
    QuizPinResult(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~QuizPinResult();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getAndroidDeepLink();

	/*! \brief Set 
	 */
	void setAndroidDeepLink(std::string android_deep_link);
	/*! \brief Get 
	 */
	std::string getDestinationUrl();

	/*! \brief Set 
	 */
	void setDestinationUrl(std::string destination_url);
	/*! \brief Get 
	 */
	std::string getIosDeepLink();

	/*! \brief Set 
	 */
	void setIosDeepLink(std::string ios_deep_link);
	/*! \brief Get 
	 */
	std::string getOrganicPinId();

	/*! \brief Set 
	 */
	void setOrganicPinId(std::string organic_pin_id);
	/*! \brief Get 
	 */
	long getResultId();

	/*! \brief Set 
	 */
	void setResultId(long result_id);


    private:
    std::string android_deep_link{};
    std::string destination_url{};
    std::string ios_deep_link{};
    std::string organic_pin_id{};
    long result_id{};
};
}

#endif /* TINY_CPP_CLIENT_QuizPinResult_H_ */
