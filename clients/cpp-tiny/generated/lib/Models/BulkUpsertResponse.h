
/*
 * BulkUpsertResponse.h
 *
 * ID of the bulk request.
 */

#ifndef TINY_CPP_CLIENT_BulkUpsertResponse_H_
#define TINY_CPP_CLIENT_BulkUpsertResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief ID of the bulk request.
 *
 *  \ingroup Models
 *
 */

class BulkUpsertResponse{
public:

    /*! \brief Constructor.
	 */
    BulkUpsertResponse();
    BulkUpsertResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BulkUpsertResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getRequestId();

	/*! \brief Set 
	 */
	void setRequestId(std::string  request_id);


    private:
    std::string request_id{};
};
}

#endif /* TINY_CPP_CLIENT_BulkUpsertResponse_H_ */
