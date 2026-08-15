
/*
 * GetBusinessAssetTypeResponse.h
 *
 * Type of asset.
 */

#ifndef TINY_CPP_CLIENT_GetBusinessAssetTypeResponse_H_
#define TINY_CPP_CLIENT_GetBusinessAssetTypeResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Type of asset.
 *
 *  \ingroup Models
 *
 */

class GetBusinessAssetTypeResponse{
public:

    /*! \brief Constructor.
	 */
    GetBusinessAssetTypeResponse();
    GetBusinessAssetTypeResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetBusinessAssetTypeResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_GetBusinessAssetTypeResponse_H_ */
