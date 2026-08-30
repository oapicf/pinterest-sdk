
/*
 * OrderLineMutationResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrderLineMutationResponse_H_
#define TINY_CPP_CLIENT_OrderLineMutationResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OrderLineMutationResult.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrderLineMutationResponse{
public:

    /*! \brief Constructor.
	 */
    OrderLineMutationResponse();
    OrderLineMutationResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderLineMutationResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	OrderLineMutationResult getData();

	/*! \brief Set 
	 */
	void setData(OrderLineMutationResult data);


    private:
    OrderLineMutationResult data;
};
}

#endif /* TINY_CPP_CLIENT_OrderLineMutationResponse_H_ */
