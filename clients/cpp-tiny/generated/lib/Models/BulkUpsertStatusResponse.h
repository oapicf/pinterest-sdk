
/*
 * BulkUpsertStatusResponse.h
 *
 * ID of the bulk request.
 */

#ifndef TINY_CPP_CLIENT_BulkUpsertStatusResponse_H_
#define TINY_CPP_CLIENT_BulkUpsertStatusResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BulkUpsertStatus.h"

namespace Tiny {


/*! \brief ID of the bulk request.
 *
 *  \ingroup Models
 *
 */

class BulkUpsertStatusResponse{
public:

    /*! \brief Constructor.
	 */
    BulkUpsertStatusResponse();
    BulkUpsertStatusResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BulkUpsertStatusResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getResultUrl();

	/*! \brief Set 
	 */
	void setResultUrl(std::string  result_url);
	/*! \brief Get 
	 */
	BulkUpsertStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(BulkUpsertStatus  status);


    private:
    std::string result_url{};
    BulkUpsertStatus status;
};
}

#endif /* TINY_CPP_CLIENT_BulkUpsertStatusResponse_H_ */
