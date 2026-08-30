
/*
 * AmazonConnectResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AmazonConnectResponse_H_
#define TINY_CPP_CLIENT_AmazonConnectResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AmazonConnectResponse{
public:

    /*! \brief Constructor.
	 */
    AmazonConnectResponse();
    AmazonConnectResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AmazonConnectResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Amazon connect response message
	 */
	std::string getMessage();

	/*! \brief Set Amazon connect response message
	 */
	void setMessage(std::string message);


    private:
    std::string message{};
};
}

#endif /* TINY_CPP_CLIENT_AmazonConnectResponse_H_ */
