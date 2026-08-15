
/*
 * CatalogsFeedsCreateRequest_default_locale.h
 *
 * The locale used within a feed for product descriptions.
 */

#ifndef TINY_CPP_CLIENT_CatalogsFeedsCreateRequest_default_locale_H_
#define TINY_CPP_CLIENT_CatalogsFeedsCreateRequest_default_locale_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsLocale.h"

namespace Tiny {


/*! \brief The locale used within a feed for product descriptions.
 *
 *  \ingroup Models
 *
 */

class CatalogsFeedsCreateRequest_default_locale{
public:

    /*! \brief Constructor.
	 */
    CatalogsFeedsCreateRequest_default_locale();
    CatalogsFeedsCreateRequest_default_locale(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsFeedsCreateRequest_default_locale();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_CatalogsFeedsCreateRequest_default_locale_H_ */
