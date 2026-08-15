
/*
 * CatalogsItems.h
 *
 * Response object of catalogs items
 */

#ifndef TINY_CPP_CLIENT_CatalogsItems_H_
#define TINY_CPP_CLIENT_CatalogsItems_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ItemResponse.h"
#include <list>

namespace Tiny {


/*! \brief Response object of catalogs items
 *
 *  \ingroup Models
 *
 */

class CatalogsItems{
public:

    /*! \brief Constructor.
	 */
    CatalogsItems();
    CatalogsItems(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsItems();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Array with catalogs items
	 */
	std::list<ItemResponse> getItems();

	/*! \brief Set Array with catalogs items
	 */
	void setItems(std::list <ItemResponse> items);


    private:
    std::list<ItemResponse> items;
};
}

#endif /* TINY_CPP_CLIENT_CatalogsItems_H_ */
