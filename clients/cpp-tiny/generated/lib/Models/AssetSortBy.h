
/*
 * AssetSortBy.h
 *
 * The field to sort member assets by
 */

#ifndef TINY_CPP_CLIENT_AssetSortBy_H_
#define TINY_CPP_CLIENT_AssetSortBy_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The field to sort member assets by
 *
 *  \ingroup Models
 *
 */

class AssetSortBy{
public:

    /*! \brief Constructor.
	 */
    AssetSortBy();
    AssetSortBy(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AssetSortBy();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_AssetSortBy_H_ */
