
/*
 * Campaign_ad_preview_delete_200_response_inner_status.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Campaign_ad_preview_delete_200_response_inner_status_H_
#define TINY_CPP_CLIENT_Campaign_ad_preview_delete_200_response_inner_status_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Pinterest.Lib.Error.h"
#include "Pinterest.Lib.Status204.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Campaign_ad_preview_delete_200_response_inner_status{
public:

    /*! \brief Constructor.
	 */
    Campaign_ad_preview_delete_200_response_inner_status();
    Campaign_ad_preview_delete_200_response_inner_status(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Campaign_ad_preview_delete_200_response_inner_status();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	long getStatusCode();

	/*! \brief Set 
	 */
	void setStatusCode(long statusCode);
	/*! \brief Get 
	 */
	int getCode();

	/*! \brief Set 
	 */
	void setCode(int code);
	/*! \brief Get 
	 */
	std::string getMessage();

	/*! \brief Set 
	 */
	void setMessage(std::string message);


    private:
    long statusCode{};
    int code{};
    std::string message{};
};
}

#endif /* TINY_CPP_CLIENT_Campaign_ad_preview_delete_200_response_inner_status_H_ */
