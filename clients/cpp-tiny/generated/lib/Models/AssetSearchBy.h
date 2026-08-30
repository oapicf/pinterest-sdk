
/*
 * AssetSearchBy.h
 *
 * The field to search member assets by
 */

#ifndef TINY_CPP_CLIENT_AssetSearchBy_H_
#define TINY_CPP_CLIENT_AssetSearchBy_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The field to search member assets by
 *
 *  \ingroup Models
 *
 */

class AssetSearchBy{
public:

    /*! \brief Constructor.
	 */
    AssetSearchBy();
    AssetSearchBy(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AssetSearchBy();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_AssetSearchBy_H_ */
