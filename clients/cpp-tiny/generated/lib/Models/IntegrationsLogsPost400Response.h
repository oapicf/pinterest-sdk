
/*
 * Integrations_logs_post_400_response.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Integrations_logs_post_400_response_H_
#define TINY_CPP_CLIENT_Integrations_logs_post_400_response_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "DetailedError.h"
#include "Error.h"
#include "Object.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Integrations_logs_post_400_response{
public:

    /*! \brief Constructor.
	 */
    Integrations_logs_post_400_response();
    Integrations_logs_post_400_response(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Integrations_logs_post_400_response();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	int getCode();

	/*! \brief Set 
	 */
	void setCode(int  code);
	/*! \brief Get 
	 */
	std::string getMessage();

	/*! \brief Set 
	 */
	void setMessage(std::string  message);
	/*! \brief Get 
	 */
	Object getDetails();

	/*! \brief Set 
	 */
	void setDetails(Object  details);


    private:
    int code{};
    std::string message{};
    Object details;
};
}

#endif /* TINY_CPP_CLIENT_Integrations_logs_post_400_response_H_ */
