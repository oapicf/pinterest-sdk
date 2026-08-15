
/*
 * AssetGroupType.h
 *
 * Asset group type
 */

#ifndef TINY_CPP_CLIENT_AssetGroupType_H_
#define TINY_CPP_CLIENT_AssetGroupType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Asset group type
 *
 *  \ingroup Models
 *
 */

class AssetGroupType{
public:

    /*! \brief Constructor.
	 */
    AssetGroupType();
    AssetGroupType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AssetGroupType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_AssetGroupType_H_ */
