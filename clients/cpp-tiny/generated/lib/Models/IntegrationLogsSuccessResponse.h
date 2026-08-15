
/*
 * IntegrationLogsSuccessResponse.h
 *
 * Response when logs are successfully processed.
 */

#ifndef TINY_CPP_CLIENT_IntegrationLogsSuccessResponse_H_
#define TINY_CPP_CLIENT_IntegrationLogsSuccessResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Response when logs are successfully processed.
 *
 *  \ingroup Models
 *
 */

class IntegrationLogsSuccessResponse{
public:

    /*! \brief Constructor.
	 */
    IntegrationLogsSuccessResponse();
    IntegrationLogsSuccessResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~IntegrationLogsSuccessResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getMessage();

	/*! \brief Set 
	 */
	void setMessage(std::string  message);


    private:
    std::string message{};
};
}

#endif /* TINY_CPP_CLIENT_IntegrationLogsSuccessResponse_H_ */
