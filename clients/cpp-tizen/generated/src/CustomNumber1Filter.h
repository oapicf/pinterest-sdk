/*
 * CustomNumber1Filter.h
 *
 * 
 */

#ifndef _CustomNumber1Filter_H_
#define _CustomNumber1Filter_H_


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

class CustomNumber1Filter : public Object {
public:
	/*! \brief Constructor.
	 */
	CustomNumber1Filter();
	CustomNumber1Filter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CustomNumber1Filter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsProductGroupUint32Criteria getCUSTOMNUMBER1();

	/*! \brief Set 
	 */
	void setCUSTOMNUMBER1(CatalogsProductGroupUint32Criteria  cUSTOM_NUMBER_1);

private:
	CatalogsProductGroupUint32Criteria cUSTOM_NUMBER_1;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CustomNumber1Filter_H_ */
