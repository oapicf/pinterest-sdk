
/*
 * BulkDownloadResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_BulkDownloadResponse_H_
#define TINY_CPP_CLIENT_BulkDownloadResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class BulkDownloadResponse{
public:

    /*! \brief Constructor.
	 */
    BulkDownloadResponse();
    BulkDownloadResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BulkDownloadResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get ID of the bulk request.
	 */
	std::string getRequestId();

	/*! \brief Set ID of the bulk request.
	 */
	void setRequestId(std::string  request_id);


    private:
    std::string request_id{};
};
}

#endif /* TINY_CPP_CLIENT_BulkDownloadResponse_H_ */
