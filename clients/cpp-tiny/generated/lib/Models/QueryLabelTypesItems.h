
/*
 * QueryLabelTypesItems.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_QueryLabelTypesItems_H_
#define TINY_CPP_CLIENT_QueryLabelTypesItems_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class QueryLabelTypesItems{
public:

    /*! \brief Constructor.
	 */
    QueryLabelTypesItems();
    QueryLabelTypesItems(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~QueryLabelTypesItems();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_QueryLabelTypesItems_H_ */
