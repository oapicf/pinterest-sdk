
/*
 * CustomerListUploadCreateRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CustomerListUploadCreateRequest_H_
#define TINY_CPP_CLIENT_CustomerListUploadCreateRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "UserListOperationType.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CustomerListUploadCreateRequest{
public:

    /*! \brief Constructor.
	 */
    CustomerListUploadCreateRequest();
    CustomerListUploadCreateRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CustomerListUploadCreateRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	UserListOperationType getOperation();

	/*! \brief Set 
	 */
	void setOperation(UserListOperationType  operation);
	/*! \brief Get Number of parts to upload the file in.
	 */
	int getTotalParts();

	/*! \brief Set Number of parts to upload the file in.
	 */
	void setTotalParts(int  total_parts);


    private:
    UserListOperationType operation;
    int total_parts{};
};
}

#endif /* TINY_CPP_CLIENT_CustomerListUploadCreateRequest_H_ */
