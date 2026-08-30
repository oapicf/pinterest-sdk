
/*
 * AssetTypeResponse.h
 *
 * Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
 */

#ifndef TINY_CPP_CLIENT_AssetTypeResponse_H_
#define TINY_CPP_CLIENT_AssetTypeResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
 *
 *  \ingroup Models
 *
 */

class AssetTypeResponse{
public:

    /*! \brief Constructor.
	 */
    AssetTypeResponse();
    AssetTypeResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AssetTypeResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_AssetTypeResponse_H_ */
