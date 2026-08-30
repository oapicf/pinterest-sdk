/*
 * CatalogsAiContentDisclosureLabel.h
 *
 * Disclosure label for AI-generated or AI-modified content in a catalog item asset.
 */

#ifndef _CatalogsAiContentDisclosureLabel_H_
#define _CatalogsAiContentDisclosureLabel_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Disclosure label for AI-generated or AI-modified content in a catalog item asset.
 *
 *  \ingroup Models
 *
 */

class CatalogsAiContentDisclosureLabel : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsAiContentDisclosureLabel();
	CatalogsAiContentDisclosureLabel(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsAiContentDisclosureLabel();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);


private:
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsAiContentDisclosureLabel_H_ */
