/*
 * LabelUpdateItem.h
 *
 * 
 */

#ifndef _LabelUpdateItem_H_
#define _LabelUpdateItem_H_


#include <string>
#include "LabelStatus.h"
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

class LabelUpdateItem : public Object {
public:
	/*! \brief Constructor.
	 */
	LabelUpdateItem();
	LabelUpdateItem(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LabelUpdateItem();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Label ID.
	 */
	std::string getId();

	/*! \brief Set Label ID.
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	LabelStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(LabelStatus  status);
	/*! \brief Get Label name. 100-character limit.
	 */
	std::string getValue();

	/*! \brief Set Label name. 100-character limit.
	 */
	void setValue(std::string  value);

private:
	std::string id;
	LabelStatus status;
	std::string value;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LabelUpdateItem_H_ */
