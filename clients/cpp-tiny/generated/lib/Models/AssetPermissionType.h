
/*
 * AssetPermissionType.h
 *
 * Permission aggregation type for asset access
 */

#ifndef TINY_CPP_CLIENT_AssetPermissionType_H_
#define TINY_CPP_CLIENT_AssetPermissionType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Permission aggregation type for asset access
 *
 *  \ingroup Models
 *
 */

class AssetPermissionType{
public:

    /*! \brief Constructor.
	 */
    AssetPermissionType();
    AssetPermissionType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AssetPermissionType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_AssetPermissionType_H_ */
