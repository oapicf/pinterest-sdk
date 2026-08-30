/*
 * LabelCreateItem.h
 *
 * 
 */

#ifndef _LabelCreateItem_H_
#define _LabelCreateItem_H_


#include <string>
#include "LabelType.h"
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

class LabelCreateItem : public Object {
public:
	/*! \brief Constructor.
	 */
	LabelCreateItem();
	LabelCreateItem(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LabelCreateItem();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	LabelType getLabelType();

	/*! \brief Set 
	 */
	void setLabelType(LabelType  label_type);
	/*! \brief Get Label name. 100-character limit.
	 */
	std::string getValue();

	/*! \brief Set Label name. 100-character limit.
	 */
	void setValue(std::string  value);

private:
	LabelType label_type;
	std::string value;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LabelCreateItem_H_ */
