
/*
 * BulkDownload.h
 *
 * Ad entities to get in bulk request.
 */

#ifndef TINY_CPP_CLIENT_BulkDownload_H_
#define TINY_CPP_CLIENT_BulkDownload_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Ad entities to get in bulk request.
 *
 *  \ingroup Models
 *
 */

class BulkDownload{
public:

    /*! \brief Constructor.
	 */
    BulkDownload();
    BulkDownload(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BulkDownload();


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
	void setRequestId(std::string request_id);


    private:
    std::string request_id{};
};
}

#endif /* TINY_CPP_CLIENT_BulkDownload_H_ */
