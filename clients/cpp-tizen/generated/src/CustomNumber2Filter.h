/*
 * CustomNumber2Filter.h
 *
 * 
 */

#ifndef _CustomNumber2Filter_H_
#define _CustomNumber2Filter_H_


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

class CustomNumber2Filter : public Object {
public:
	/*! \brief Constructor.
	 */
	CustomNumber2Filter();
	CustomNumber2Filter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CustomNumber2Filter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsProductGroupUint32Criteria getCUSTOMNUMBER2();

	/*! \brief Set 
	 */
	void setCUSTOMNUMBER2(CatalogsProductGroupUint32Criteria  cUSTOM_NUMBER_2);

private:
	CatalogsProductGroupUint32Criteria cUSTOM_NUMBER_2;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CustomNumber2Filter_H_ */
