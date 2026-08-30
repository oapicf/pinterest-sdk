
/*
 * CatalogsAiContentDisclosureLabel.h
 *
 * Disclosure label for AI-generated or AI-modified content in a catalog item asset.
 */

#ifndef TINY_CPP_CLIENT_CatalogsAiContentDisclosureLabel_H_
#define TINY_CPP_CLIENT_CatalogsAiContentDisclosureLabel_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Disclosure label for AI-generated or AI-modified content in a catalog item asset.
 *
 *  \ingroup Models
 *
 */

class CatalogsAiContentDisclosureLabel{
public:

    /*! \brief Constructor.
	 */
    CatalogsAiContentDisclosureLabel();
    CatalogsAiContentDisclosureLabel(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsAiContentDisclosureLabel();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_CatalogsAiContentDisclosureLabel_H_ */
