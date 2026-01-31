/*
 * CustomNumber0Filter.h
 *
 * 
 */

#ifndef _CustomNumber0Filter_H_
#define _CustomNumber0Filter_H_


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

class CustomNumber0Filter : public Object {
public:
	/*! \brief Constructor.
	 */
	CustomNumber0Filter();
	CustomNumber0Filter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CustomNumber0Filter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsProductGroupUint32Criteria getCUSTOMNUMBER0();

	/*! \brief Set 
	 */
	void setCUSTOMNUMBER0(CatalogsProductGroupUint32Criteria  cUSTOM_NUMBER_0);

private:
	CatalogsProductGroupUint32Criteria cUSTOM_NUMBER_0;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CustomNumber0Filter_H_ */
