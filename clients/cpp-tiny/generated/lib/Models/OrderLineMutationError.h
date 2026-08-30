
/*
 * OrderLineMutationError.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrderLineMutationError_H_
#define TINY_CPP_CLIENT_OrderLineMutationError_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OrderLine.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrderLineMutationError{
public:

    /*! \brief Constructor.
	 */
    OrderLineMutationError();
    OrderLineMutationError(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderLineMutationError();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	OrderLine getData();

	/*! \brief Set 
	 */
	void setData(OrderLine data);
	/*! \brief Get Error messages.
	 */
	std::list<std::string> getErrorMessages();

	/*! \brief Set Error messages.
	 */
	void setErrorMessages(std::list<std::string> error_messages);


    private:
    OrderLine data;
    std::list<std::string> error_messages;
};
}

#endif /* TINY_CPP_CLIENT_OrderLineMutationError_H_ */
