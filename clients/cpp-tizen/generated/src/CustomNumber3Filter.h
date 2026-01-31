/*
 * CustomNumber3Filter.h
 *
 * 
 */

#ifndef _CustomNumber3Filter_H_
#define _CustomNumber3Filter_H_


#include <string>
#include "CatalogsProductGroupUint32Criteria.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CustomNumber3Filter : public Object {
public:
	/*! \brief Constructor.
	 */
	CustomNumber3Filter();
	CustomNumber3Filter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CustomNumber3Filter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsProductGroupUint32Criteria getCUSTOMNUMBER3();

	/*! \brief Set 
	 */
	void setCUSTOMNUMBER3(CatalogsProductGroupUint32Criteria  cUSTOM_NUMBER_3);

private:
	CatalogsProductGroupUint32Criteria cUSTOM_NUMBER_3;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CustomNumber3Filter_H_ */
