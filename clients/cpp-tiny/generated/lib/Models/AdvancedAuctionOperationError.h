
/*
 * AdvancedAuctionOperationError.h
 *
 * Error which occurred when applying a bid options operation to a specific item.
 */

#ifndef TINY_CPP_CLIENT_AdvancedAuctionOperationError_H_
#define TINY_CPP_CLIENT_AdvancedAuctionOperationError_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Error which occurred when applying a bid options operation to a specific item.
 *
 *  \ingroup Models
 *
 */

class AdvancedAuctionOperationError{
public:

    /*! \brief Constructor.
	 */
    AdvancedAuctionOperationError();
    AdvancedAuctionOperationError(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdvancedAuctionOperationError();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The error code for the item bid option operation validation error
	 */
	int getCode();

	/*! \brief Set The error code for the item bid option operation validation error
	 */
	void setCode(int  code);
	/*! \brief Get Message describing the item bid option operation validation error
	 */
	std::string getMessage();

	/*! \brief Set Message describing the item bid option operation validation error
	 */
	void setMessage(std::string  message);


    private:
    int code{};
    std::string message{};
};
}

#endif /* TINY_CPP_CLIENT_AdvancedAuctionOperationError_H_ */
